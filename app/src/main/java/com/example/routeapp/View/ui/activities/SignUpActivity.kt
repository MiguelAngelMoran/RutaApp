package com.example.routeapp.View.ui.activities

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.routeapp.R

class SignUpActivity:AppCompatActivity() {
    lateinit var register: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        register= findViewById(R.id.register)
        register.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))

        }
    }
  }

