package com.example.demoprojectio.ui.thirduiproject

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.demoprojectio.databinding.ActivityScreen1SplashBinding

class Screen1SplashActivity : AppCompatActivity() {
    private val binding: ActivityScreen1SplashBinding by lazy {
        ActivityScreen1SplashBinding.inflate(
            layoutInflater
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            binding.imageView28.visibility = View.VISIBLE
        }, 1000)
        clickListner()
    }

    private fun clickListner() {
        binding.apply {
            imageView28.setOnClickListener {
                startActivity(Intent(this@Screen1SplashActivity, Screen2Activity::class.java))
            }
        }
    }
}