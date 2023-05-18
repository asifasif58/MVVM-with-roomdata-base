package com.example.demoprojectio.ui.fistuiproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.demoprojectio.R
import com.example.demoprojectio.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.imgclick1.setColorFilter(ContextCompat.getColor(this, R.color.white))
        binding.imageView.setOnClickListener { }
        binding.constraintLayout.setOnClickListener { }
        binding.constraintLayout2.setOnClickListener { }
        binding.constraintLayout3.setOnClickListener { }
        binding.imgclick1.setOnClickListener {
            changeiamge()
            binding.imgclick1.setColorFilter(ContextCompat.getColor(this, R.color.white))
        }
        binding.imgclick2.setOnClickListener {
            changeiamge()
            binding.imgclick2.setColorFilter(ContextCompat.getColor(this, R.color.white))
            startActivity(Intent(this, SecondScreenUi::class.java))
        }
        binding.imgclick3.setOnClickListener {
            changeiamge()
            binding.imgclick3.setColorFilter(ContextCompat.getColor(this, R.color.white))
        }
        binding.imgclick4.setOnClickListener {
            changeiamge()
            binding.imgclick4.setColorFilter(ContextCompat.getColor(this, R.color.white))
        }
        binding.imageView10.setOnClickListener { }
        binding.constraincal.setOnClickListener { }
    }

    private fun changeiamge() {
        binding.imgclick1.setColorFilter(ContextCompat.getColor(this, R.color.unselecticon))
        binding.imgclick2.setColorFilter(ContextCompat.getColor(this, R.color.unselecticon))
        binding.imgclick3.setColorFilter(ContextCompat.getColor(this, R.color.unselecticon))
        binding.imgclick4.setColorFilter(ContextCompat.getColor(this, R.color.unselecticon))
    }
}