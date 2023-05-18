package com.example.demoprojectio.ui.thirduiproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demoprojectio.databinding.ActivityAllTask4Binding

class AllTask4Activity : AppCompatActivity() {
    private val binding: ActivityAllTask4Binding by lazy {
        ActivityAllTask4Binding.inflate(
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
            cardView12.setOnClickListener{}
            cardView14.setOnClickListener{}
            cardView15.setOnClickListener{}
            cardView16.setOnClickListener{}
            cardView17.setOnClickListener{}
            cardView18.setOnClickListener{}
        }
    }
}