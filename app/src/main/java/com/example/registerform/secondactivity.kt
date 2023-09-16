package com.example.registerform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class secondactivity : AppCompatActivity() {
    private lateinit var registerText:TextView
    private lateinit var nameText : TextView
    private lateinit var emailText : TextView
    private lateinit var passText : TextView
    private lateinit var cityText : TextView
    private lateinit var contactText : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)
            nameText = findViewById(R.id.nameTextId)
            emailText = findViewById(R.id.eamilTextId)
            passText = findViewById(R.id.passTextId)
            cityText = findViewById(R.id.cityTextId)
            contactText = findViewById(R.id.contactTextId)


            var userEditText = intent.getStringExtra("user")
            var emailEditText = intent.getStringExtra("email")
            var passEditText = intent.getStringExtra("pass")
            var cityEditText = intent.getStringExtra("city")
            var contactnum = intent.getStringExtra("contact")
            nameText.setText("Name : ${userEditText}")
            emailText.setText("Email : ${emailEditText}")
            passText.setText("Password : ${passEditText}")
            cityText.setText("City : ${cityEditText}")
            contactText.setText("Contact : ${contactnum}")

    }

}