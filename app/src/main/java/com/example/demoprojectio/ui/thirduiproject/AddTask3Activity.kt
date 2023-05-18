package com.example.demoprojectio.ui.thirduiproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demoprojectio.databinding.ActivityAddTask3Binding

class AddTask3Activity : AppCompatActivity() {
    private val binding: ActivityAddTask3Binding by lazy {
        ActivityAddTask3Binding.inflate(
            layoutInflater
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        clickListner()
    }

    private fun clickListner() {
        binding.apply {
            imageView32.setOnClickListener {
                onBackPressed()
            }
            imageView33.setOnClickListener {
                onBackPressed()
            }
            saveText.setOnClickListener {
                startActivity(Intent(this@AddTask3Activity,AllTask4Activity::class.java))
            }
            editTextTextPersonName3.setOnClickListener {
                startActivity(Intent(this@AddTask3Activity,AllTask4Activity::class.java))
            }
        }
    }
}