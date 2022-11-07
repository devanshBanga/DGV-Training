package com.example.flush.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.flush.Data
import com.example.flush.R
import com.example.flush.UserData

class UserDataAdapter(val context: Context, val items:List<UserData>): RecyclerView.Adapter<UserDataAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return UserDataAdapter.ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.user_data_items, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var item=items.get(position)
        holder.userDataName.text=item.name
        holder.userDataEmail.text=item.email
        holder.userDataPhone.text=item.phone
        holder.userDataAddress.text=item.address
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val userDataName=view.findViewById<TextView>(R.id.userDataName)
        val userDataEmail=view.findViewById<TextView>(R.id.userDataEmail)
        val userDataPhone=view.findViewById<TextView>(R.id.userDataPhone)
        val userDataAddress=view.findViewById<TextView>(R.id.userDataAddress)
    }
}