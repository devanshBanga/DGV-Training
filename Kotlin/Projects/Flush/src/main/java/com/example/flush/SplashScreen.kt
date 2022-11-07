package com.example.flush

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.TextView

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val tagLine=findViewById<TextView>(R.id.tagLine)
        val logoName=findViewById<TextView>(R.id.appName)
        val slideAnimation = AnimationUtils.loadAnimation(this, R.anim.animation)
        logoName.startAnimation(slideAnimation)
        tagLine.startAnimation(slideAnimation)

        //This method will be executed once the timer is over
        Handler().postDelayed(Runnable {
            // Start your app main activity
            val intent = Intent(this, LocationsMain::class.java)
            startActivity(intent)
            // close this activity
            finish()
        }, 2000)

    }
}