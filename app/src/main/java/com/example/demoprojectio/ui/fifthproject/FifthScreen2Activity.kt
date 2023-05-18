package com.example.demoprojectio.ui.fifthproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demoprojectio.databinding.ActivityFifthScreen2Binding

class FifthScreen2Activity : AppCompatActivity() {
    private val binding:ActivityFifthScreen2Binding by lazy { ActivityFifthScreen2Binding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}