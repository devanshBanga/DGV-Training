package com.example.flush

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.flush.adapters.ItemAdapter
import com.example.flush.adapters.UserDataAdapter

class ShowUserData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_user_data)
        val dataViewModel:DataViewModel= ViewModelProvider(this).get(DataViewModel::class.java)
        var recyclerViewItem=findViewById<RecyclerView>(R.id.recyclerViewUserData)
//        initialised adapter for this recycler view
        var userDataAdapter= UserDataAdapter(this,dataViewModel.userData)
        recyclerViewItem.adapter= userDataAdapter
        recyclerViewItem.layoutManager= LinearLayoutManager(this)
    }
}