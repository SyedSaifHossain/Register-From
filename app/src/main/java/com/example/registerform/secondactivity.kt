package com.example.registerform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class secondactivity : AppCompatActivity() {
    private lateinit var nameText : TextView
    private lateinit var emailText : TextView
    private lateinit var passText : TextView
    private lateinit var cityText : TextView
    private lateinit var contactText : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)

            nameText = findViewById(R.id.nameTextId)
            var value = intent.getStringExtra("key")
            nameText.setText("Name : ${value}")
            emailText.setText("Email : ${value}")
            passText.setText("Password : ${value}")
            cityText.setText("City : ${value}")
            contactText.setText("Contact : ${value}")

    }

}