package com.example.flush

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.flush.adapters.LocationAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class LocationsMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_locations_main)
//        fetching elements
        var searchArea=findViewById<EditText>(R.id.searchArea)
        val searchButton=findViewById<FloatingActionButton>(R.id.searchButton)
        val submitButton=findViewById<FloatingActionButton>(R.id.submitButton)
//        on the click of button redirecting to form page
        submitButton.setOnClickListener{
            val intent = Intent(this, UserForm::class.java)
            startActivity(intent)
        }
//        implementing search functioning
        searchButton.setOnClickListener{
            if(searchArea.text.toString()=="Boy" ||
                searchArea.text.toString()=="Girl" ||
                searchArea.text.toString()=="Handicap") {
//        redirecting to the activity showing the list filtered on the basis of type
                val intent = Intent(this, ItemDescriptionType::class.java)
                intent.putExtra("type", searchArea.text.toString())
                searchArea.text = null
                startActivity(intent)
            }else{
//                if someone typed incorrect in search
                val toast=Toast.makeText(applicationContext, "Please Enter Correct Input as mentioned in hint", Toast.LENGTH_SHORT)
                toast.show()
            }
        }
        //Created recycler view to display locations list
        var recyclerViewLocation=findViewById<RecyclerView>(R.id.recyclerViewItem)
        var dataViewModel:DataViewModel=ViewModelProvider(this).get(DataViewModel::class.java)
        var locationAdapter=LocationAdapter(this,dataViewModel.location)
        recyclerViewLocation.adapter=locationAdapter
        recyclerViewLocation.layoutManager = GridLayoutManager(this,2)

    }
}