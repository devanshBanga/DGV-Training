package com.example.audia_player

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListAdapter(val context: Context, val songs:List<Song>):RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item=songs.get(position)
        holder.songName.text=item.title
        holder.artistName.text=item.artist
        holder.image.setImageResource(item.thumbnail)

//        Log.d("Testing","${item.id}")

        holder.playButton.setOnClickListener{
            val intent= Intent(context,PlayerActivity::class.java)
            intent.putExtra("id",item.id.toString())
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return songs.size;
    }

    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        var playButton = view.findViewById<FloatingActionButton>(R.id.playButton)
        var songName = view.findViewById<TextView>(R.id.songName)
        var artistName = view.findViewById<TextView>(R.id.artistName)
        var image = view.findViewById<ImageView>(R.id.image)
    }

}