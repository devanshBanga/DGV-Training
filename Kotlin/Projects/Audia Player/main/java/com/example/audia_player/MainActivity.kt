package com.example.audia_player

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.mbms.MbmsErrors.InitializationErrors
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mediaPlayerViewModel:MediaPlayerViewModel=ViewModelProvider(this).get(MediaPlayerViewModel::class.java)
        var recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        var category=intent.getStringExtra("category")
        var list = mutableListOf<Song>()
        for(i in 0 until mediaPlayerViewModel.songs.size){
            if(mediaPlayerViewModel.songs.get(i).category==category){
               list.add(mediaPlayerViewModel.songs.get(i))
            }
        }
        var listAdapter=ListAdapter(this,list)
        recyclerView.adapter=listAdapter
        recyclerView.layoutManager=LinearLayoutManager(this)
    }
}