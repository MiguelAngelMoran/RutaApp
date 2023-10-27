package com.example.routeapp.View.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.routeapp.R
import com.example.routeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //asociar el activity con el layout
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //combinación para que funciones la animación
        binding.animationView.playAnimation()
        //transición entre la animación y siguiente activity 4 segundos
        handler= Handler(Looper.myLooper()!!)
        handler.postDelayed({
            val intent= Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()

        },4000)
    }

}