package com.example.audia_player

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GenreMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.genrelist)
        var mediaPlayerViewModel: MediaPlayerViewModel = ViewModelProvider(this).get(MediaPlayerViewModel::class.java)
        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView2)
        var genreListAdapter = GenreListAdapter(this, mediaPlayerViewModel.categories)
        recyclerView.adapter = genreListAdapter
        var name = findViewById<EditText>(R.id.searchSong)
        var searchButton=findViewById<Button>(R.id.searchButton)
        searchButton.setOnClickListener {
            var list = mutableListOf<Song>()
            for (i in 0 until mediaPlayerViewModel.songs.size) {
                if (mediaPlayerViewModel.songs.get(i).title == name.text.toString()) {
                    list.add(mediaPlayerViewModel.songs.get(i))
                }
            }
            var listAdapter=ListAdapter(this,list)
            recyclerView.adapter = listAdapter

        }

        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}