package com.example.demoprojectio.ui.secondui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demoprojectio.databinding.ActivityThirdScreenBinding

class ThirdScreenActivity : AppCompatActivity() {
    private val binding: ActivityThirdScreenBinding by lazy {
        ActivityThirdScreenBinding.inflate(
            layoutInflater
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initilizer()
        clicklistner()
    }

    private fun clicklistner() {
        binding.apply {
            imageView12.setOnClickListener {
                onBackPressed()
            }
            imageView22.setOnClickListener {}
            imageView23.setOnClickListener {}
            imageView24.setOnClickListener {}
            imageView25.setOnClickListener {}
            imageView26.setOnClickListener {}
            textView27.setOnClickListener {}
        }
    }

    private fun initilizer() {

    }
}