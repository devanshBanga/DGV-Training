package com.example.flush

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.flush.adapters.ItemAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ItemMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_main)
//        this is created in order to display list on the basis of location
        val dataViewModel:DataViewModel=ViewModelProvider(this).get(DataViewModel::class.java)
        var location=intent.getStringExtra("location")
//        newList is the filtered list on the basis of type
        var newList = mutableListOf<Data>()
        for(i in 0 until dataViewModel.data.size){
            if(location==dataViewModel.data.get(i).location){
                newList.add(dataViewModel.data.get(i))
            }
        }
        var recyclerViewItem=findViewById<RecyclerView>(R.id.recyclerViewItem)
//        initialised adapter for this recycler view
        var itemAdapter= ItemAdapter(this,newList)
        recyclerViewItem.adapter=itemAdapter
        recyclerViewItem.layoutManager=LinearLayoutManager(this)
    }
}