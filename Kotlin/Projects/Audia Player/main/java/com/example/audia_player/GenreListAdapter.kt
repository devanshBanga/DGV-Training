package com.example.audia_player

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


    class GenreListAdapter(val context: Context, val category:List<String>): RecyclerView.Adapter<GenreListAdapter.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(
                LayoutInflater.from(context).inflate(R.layout.genrelist_item,parent,false)
            )
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item=category.get(position)
           holder.genreList.text=item
            holder.genreList.setOnClickListener{
                val intent= Intent(context,MainActivity::class.java)
                intent.putExtra("category",item)
                context.startActivity(intent)
            }
        }

        override fun getItemCount(): Int {
            return category.size
        }

        class ViewHolder(view: View): RecyclerView.ViewHolder(view){
            var genreList = view.findViewById<TextView>(R.id.genreList)
        }

    }