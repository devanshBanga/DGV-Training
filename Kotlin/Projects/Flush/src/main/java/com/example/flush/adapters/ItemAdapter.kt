package com.example.flush.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.flush.Data
import com.example.flush.ItemDescription
import com.example.flush.R
//created adapter to display list of the items that is washrooms on the basis of location
class ItemAdapter(val context:Context,val items:List<Data>):RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
        LayoutInflater.from(context).inflate(R.layout.activity_item_list,parent,false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var item=items.get(position)
        holder.itemName.text=item.name
        holder.itemType.text=item.type
        holder.itemLocation.text=item.location
        holder.itemImage.setImageResource(item.image)
        holder.listItem.setOnClickListener{
            val intent = Intent(context,ItemDescription::class.java)
            intent.putExtra("id",item.id.toString())
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val itemImage=view.findViewById<ImageView>(R.id.itemImage1)
        val itemName=view.findViewById<TextView>(R.id.itemName1)
        val itemType=view.findViewById<TextView>(R.id.itemType1)
        var itemLocation=view.findViewById<TextView>(R.id.itemLocation)
        val listItem=view.findViewById<ConstraintLayout>(R.id.listItem)
    }

}