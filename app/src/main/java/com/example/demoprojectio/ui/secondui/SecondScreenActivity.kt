package com.example.demoprojectio.ui.secondui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demoprojectio.databinding.ActivitySecondScreenBinding

class SecondScreenActivity : AppCompatActivity() {
    private val binding: ActivitySecondScreenBinding by lazy {
        ActivitySecondScreenBinding.inflate(
            layoutInflater
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        intilizer()
        clickListner()
    }

    private fun clickListner() {
        binding.apply {
            imageView12.setOnClickListener{
                onBackPressed()
            }
            textView27.setOnClickListener {  }
            cardView3.setOnClickListener {  }
            cardView4.setOnClickListener {  }
        }
    }

    private fun intilizer() {
        }
}