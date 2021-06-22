package com.david.to_do_app

import android.app.ApplicationErrorReport
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val Validusername: String = "admin"
    val Validpassword: String = "admin"


    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var SubmitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.UserName_Input)
        passwordInput = findViewById(R.id.Password_Input)
        SubmitButton = findViewById(R.id.Submit_Button)

        SubmitButton.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            login(username, password)
        }
    }

    private fun login(username: String, password: String) {
        if (isValidCredentials(username, password)) {

            val intent: Intent = Intent(this, Home_Activity::class.java)
            intent.putExtra("name", username)
            startActivity(intent)

        } else {
            Toast.makeText(applicationContext, "something went WRONG!", Toast.LENGTH_SHORT).show()
        }

    }

    private fun isValidCredentials(username: String, password: String): Boolean {
        if (username == Validusername && password == Validpassword) return true
        return false

    }
}


