package com.example.flush.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.flush.ItemMain
import com.example.flush.R
//created adapter to display locations
class LocationAdapter(val context: Context, val locations:List<String>):RecyclerView.Adapter<LocationAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(
           LayoutInflater.from(context).inflate(R.layout.activity_locations,parent,false)
       )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var location=locations.get(position)
        holder.locations.text=location
        holder.locations.setOnClickListener {
            val intent = Intent(context, ItemMain::class.java)
            intent.putExtra("location", location)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return locations.size
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        var locations = view.findViewById<TextView>(R.id.locationListItem)
    }

}