package com.example.audia_player

import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.floatingactionbutton.FloatingActionButton

class PlayerActivity : AppCompatActivity(){
    lateinit var runnable: Runnable
    var handler=Handler()
    companion object{
        var mediaPlayer:MediaPlayer?=null
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)
        val mediaPlayerViewModel:MediaPlayerViewModel= ViewModelProvider(this).get(MediaPlayerViewModel::class.java)

        var id=intent.getStringExtra("id")!!.toInt()
        var song=mediaPlayerViewModel.songs.get(0)
        var index=0
        for(i in 0 until mediaPlayerViewModel.songs.size) {
            if(mediaPlayerViewModel.songs.get(i).id==id) {
                song = mediaPlayerViewModel.songs.get(i)
                index=i
            }
        }

        var seekBar:SeekBar=findViewById(R.id.seekBar)


        var currentPosition=findViewById<TextView>(R.id.currentPosition)
        var songDuration=findViewById<TextView>(R.id.songDuration)
        val singleThumbail=findViewById<ImageView>(R.id.singleThumbnail)
        val singleTitle=findViewById<TextView>(R.id.singleTitle)
        val singleArtist=findViewById<TextView>(R.id.singleArtist)
        val playSong=findViewById<FloatingActionButton>(R.id.playSong)
       // var mediaPlayer = MediaPlayer.create(this, song.audio)
        if(mediaPlayer!=null){
            mediaPlayer?.stop()
            mediaPlayer?.reset()
            mediaPlayer?.release()
            mediaPlayer=null
        }
        fun activity(song:Song) {
            mediaPlayer = MediaPlayer.create(this, song.audio)
            mediaPlayer?.start()
            singleThumbail.setImageResource(song.thumbnail)
            singleArtist.text = song.artist
            singleTitle.text = song.title
            seekBar.progress = 0
            seekBar.max = mediaPlayer!!.duration

            playSong.setOnClickListener {

                if (!(mediaPlayer!!.isPlaying)) {
                    mediaPlayer?.start()
                    playSong.setImageResource(R.drawable.ic_baseline_pause_24)
                } else {
                    mediaPlayer?.pause()
                    playSong.setImageResource(R.drawable.ic_baseline_play_arrow_24)
                }

            }
            seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    if (p2) {
                        mediaPlayer!!.seekTo(p1)
                    }
                    val p1_sec = (p1 / 1000)
                    val p1_minute = (p1_sec / 60)
                    val p1_second = p1_sec % 60
                    currentPosition.text = p1_minute.toString() + ":" + p1_second.toString()
                }

                override fun onStartTrackingTouch(p0: SeekBar?) {
                }

                override fun onStopTrackingTouch(p0: SeekBar?) {
                }

            })
            val durationTime_sec = (seekBar.max / 1000)
            val durationTime_minute = (durationTime_sec / 60)
            val durationTime_second = durationTime_sec % 60
            songDuration.text =
                durationTime_minute.toString() + ":" + durationTime_second.toString()
            runnable = Runnable {
                seekBar.progress = mediaPlayer!!.currentPosition

                handler.postDelayed(runnable, 1000)
            }
            handler.postDelayed(runnable, 1000)
            mediaPlayer!!.setOnCompletionListener {
                mediaPlayer!!.pause()
                playSong.setImageResource(R.drawable.ic_baseline_play_arrow_24)
            }
        }
        activity(song)
        val previousSong=findViewById<FloatingActionButton>(R.id.previousSong)
        previousSong.setOnClickListener {
            mediaPlayer!!.stop()
            mediaPlayer!!.release()
            if(index<=0){
                index=mediaPlayerViewModel.songs.size-1
            }else{
                index--
            }
            song = mediaPlayerViewModel.songs.get(index)
            activity(song)
        }
        val nextSong=findViewById<FloatingActionButton>(R.id.nextSong)
        nextSong.setOnClickListener {
            mediaPlayer!!.stop()
            mediaPlayer!!.release()
            if(index>=mediaPlayerViewModel.songs.size-1){
                index=0
            }else{
                index++
            }
            song=mediaPlayerViewModel.songs.get(index)
            activity(song)
        }
    }
}