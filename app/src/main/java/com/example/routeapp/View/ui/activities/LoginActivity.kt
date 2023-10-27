package com.example.routeapp.View.ui.activities

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.routeapp.R
import com.example.routeapp.databinding.ActivityMainBinding

//import com.example.routeapp.databinding.ActivityMainBinding
//import com.google.android.gms.tasks.Task
//import com.google.firebase.auth.FirebaseAuth
//import com.google.firebase.auth.FirebaseAuth.AuthStateListener
//import com.google.firebase.auth.ktx.auth
//import com.google.firegase.ktx.Firebase

class LoginActivity:AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var signup: Button
    lateinit var home: Button
    //lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //binding= ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)

        signup= findViewById(R.id.signup)
        signup.setOnClickListener {
            startActivity(Intent(this,SignUpActivity::class.java))
        }

        home= findViewById(R.id.login)
        home.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }
    }
 }
