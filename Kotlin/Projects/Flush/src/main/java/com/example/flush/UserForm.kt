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
//        adding functionality to on click of button
        submitFormButton.setOnClickListener{
            if(     userName.text.toString()!="" &&
                    userAddress.text.toString()!="" &&
                    userEmail.text.toString()!="" &&
                    userPhone.text.toString()!=""){
                val dataViewModel:DataViewModel=ViewModelProvider(this).get(DataViewModel::class.java)
//                to store the form data
                val toast= Toast.makeText(applicationContext, "Your form is submitted", Toast.LENGTH_LONG)
                toast.show()
                val intent=Intent(this,ShowUserData::class.java)
                intent.putExtra("name",userName.text.toString())
                intent.putExtra("address",userAddress.text.toString())
                intent.putExtra("email",userEmail.text.toString())
                intent.putExtra("phone",userPhone.text.toString())
                userName.text=null
                userAddress.text=null
                userEmail.text=null
                userPhone.text=null
                startActivity(intent)
            }else{
                val toast= Toast.makeText(applicationContext, "Please fill the full form", Toast.LENGTH_SHORT)
                toast.show()
            }
        }
    }
}