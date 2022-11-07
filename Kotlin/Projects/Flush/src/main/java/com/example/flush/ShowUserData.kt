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
        var name=intent.getStringExtra("name").toString()
        var email=intent.getStringExtra("email").toString()
        var address=intent.getStringExtra("address").toString()
        var phone=intent.getStringExtra("phone").toString()
        var userData= mutableListOf<UserData>(UserData(name,email,address,phone))
        var userDataAdapter= UserDataAdapter(this,userData)
        recyclerViewItem.adapter= userDataAdapter
        recyclerViewItem.layoutManager= LinearLayoutManager(this)
    }
}