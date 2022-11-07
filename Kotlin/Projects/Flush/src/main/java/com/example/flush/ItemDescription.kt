package com.example.flush

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class ItemDescription:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_description)
//        fetched elements and assigning values to display of the each particular element
        val id=intent.getStringExtra("id")!!.toInt()
        val singleName=findViewById<TextView>(R.id.singleName)
        val singleImage=findViewById<ImageView>(R.id.singleImage)
        val singleType=findViewById<TextView>(R.id.singleType)
        val singleRating=findViewById<TextView>(R.id.singleRating)
        val singleDescription=findViewById<TextView>(R.id.singleDescription)
        val singleAddress=findViewById<TextView>(R.id.singleAddress)
        val dataViewModel:DataViewModel=ViewModelProvider(this).get(DataViewModel::class.java)
        var singleData:Data=dataViewModel.data.get(0)
        for(i in 0 until dataViewModel.data.size){
            if(id==dataViewModel.data.get(i).id){
                singleData=dataViewModel.data.get(i)
            }
        }
        singleImage.setImageResource(singleData.image)
        singleName.text=singleData.name
        singleType.text=singleData.type
        singleRating.text=singleData.rating.toString()
        singleDescription.text=singleData.description
        singleAddress.text=singleData.address
    }
}