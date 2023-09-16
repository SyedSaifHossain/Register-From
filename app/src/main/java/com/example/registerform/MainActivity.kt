package com.example.registerform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var userName : EditText
    private lateinit var email : EditText
    private lateinit var password : EditText
    private lateinit var city : EditText
    private lateinit var contact : EditText
    private lateinit var register : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userName = findViewById(R.id.userId)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        city = findViewById(R.id.city)
        contact = findViewById(R.id.contact)
        register = findViewById(R.id.register)

        register.setOnClickListener{
            var userEditText : String = userName.getText().toString()
            var eamilEditText = email.getText().toString()
            var passEditText = password.getText().toString()
            var cityEditText = city.getText().toString()
            var contactnum = contact.getText().toString()
            var intent = Intent(this@MainActivity,secondactivity::class.java)
            intent.putExtra("user",userEditText)
            intent.putExtra("email",eamilEditText)
            intent.putExtra("pass",passEditText)
            intent.putExtra("city",cityEditText)
            intent.putExtra("contact",contactnum)
            startActivity(intent)
            finish()
        }
    }

}