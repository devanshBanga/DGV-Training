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
//created adapter to display items that is washroom on the basis of type
class ItemTypeAdapter(val context: Context, val items:List<Data>): RecyclerView.Adapter<ItemTypeAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemTypeAdapter.ViewHolder {
        return ItemTypeAdapter.ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
        var item=items.get(position)
        holder.itemName1.text=item.name
        holder.itemType1.text=item.type
        holder.itemLocation1.text=item.location
        holder.itemImage1.setImageResource(item.image)
        holder.listItem1.setOnClickListener{
            val intent = Intent(context,ItemDescription::class.java)
            intent.putExtra("id",item.id.toString())
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val itemImage1=view.findViewById<ImageView>(R.id.itemImage1)
        val itemName1=view.findViewById<TextView>(R.id.itemName1)
        val itemType1=view.findViewById<TextView>(R.id.itemType1)
        var itemLocation1=view.findViewById<TextView>(R.id.itemLocation1)
        val listItem1=view.findViewById<ConstraintLayout>(R.id.listItem)
    }
}