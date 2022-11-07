package com.example.flush

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.flush.adapters.ItemAdapter
import com.example.flush.adapters.ItemTypeAdapter
import com.example.flush.adapters.LocationAdapter

class ItemDescriptionType : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_type)
//        this is created to display the list of items on the basis of type
//        recycler view is created to display item in list
        var recyclerViewLocation=findViewById<RecyclerView>(R.id.recyclerViewType)
        var dataViewModel:DataViewModel= ViewModelProvider(this).get(DataViewModel::class.java)
        var type=intent.getStringExtra("type")
//        newList is the filtered list on the basis of type
        var newList = mutableListOf<Data>()
        for(i in 0 until dataViewModel.data.size){
            if(type==dataViewModel.data.get(i).type){
                newList.add(dataViewModel.data.get(i))
            }
        }
//        initialised adapter for this recycler view
        var itemTypeAdapter= ItemTypeAdapter(this,newList)
        recyclerViewLocation.adapter=itemTypeAdapter
        recyclerViewLocation.layoutManager = LinearLayoutManager(this)

    }
}