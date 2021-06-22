package com.david.to_do_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Home_Activity : AppCompatActivity() {

    private lateinit var usernameDisplay: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        usernameDisplay = findViewById(R.id.usernameDisplay)
        usernameDisplay.text = intent.getStringExtra("name")

    }
}