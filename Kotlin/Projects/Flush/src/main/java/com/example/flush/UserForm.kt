package com.example.flush

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.floatingactionbutton.FloatingActionButton

class UserForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_form)

//        fetching elements
        var userName=findViewById<EditText>(R.id.userName)
        var userAddress=findViewById<EditText>(R.id.userAddress)
        var userEmail=findViewById<EditText>(R.id.userEmail)
        var userPhone=findViewById<EditText>(R.id.userPhone)
        var submitFormButton=findViewById<Button>(R.id.submitFormButton)
        val userEnquiry=findViewById<Button>(R.id.userEnquiry)
        userEnquiry.setOnClickListener{
            val intent=Intent(this,ShowUserData::class.java)
            startActivity(intent)
        }
//        adding functionality to on click of button
        submitFormButton.setOnClickListener{
            if(     userName.text.toString()!="" &&
                    userAddress.text.toString()!="" &&
                    userEmail.text.toString()!="" &&
                    userPhone.text.toString()!=""){
                val dataViewModel:DataViewModel=ViewModelProvider(this).get(DataViewModel::class.java)
//                to store the form data
                dataViewModel.userData.toMutableList().add(UserData(userName.text.toString(),userEmail.text.toString(),userAddress.text.toString(),userPhone.text.toString()))
                val toast= Toast.makeText(applicationContext, "Your form is submitted", Toast.LENGTH_LONG)
                toast.show()
                userName.text=null
                userAddress.text=null
                userEmail.text=null
                userPhone.text=null
                val intent=Intent(this,LocationsMain::class.java)
                startActivity(intent)
            }else{
                val toast= Toast.makeText(applicationContext, "Please fill the full form", Toast.LENGTH_SHORT)
                toast.show()
            }
        }
    }
}