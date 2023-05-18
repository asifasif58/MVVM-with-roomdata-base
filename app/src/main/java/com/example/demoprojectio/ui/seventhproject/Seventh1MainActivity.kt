package com.example.demoprojectio.ui.seventhproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demoprojectio.R
import com.example.demoprojectio.databinding.ActivitySeventh1MainBinding

class Seventh1MainActivity : AppCompatActivity() {
    private val binding: ActivitySeventh1MainBinding by lazy {
        ActivitySeventh1MainBinding.inflate(
            layoutInflater
        )
    }
    private lateinit var seven1Fragment: Seven1Fragment
    private lateinit var seven2Fragment: Seven2Fragment
    private lateinit var seven3Fragment: Seven3Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        seven1Fragment = Seven1Fragment()
        seven2Fragment = Seven2Fragment()
        seven3Fragment = Seven3Fragment()

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container3, seven2Fragment)
            .commit()
        clickListner()
    }

    private fun clickListner() {
        binding.apply {
            bottomNavigationView.setOnItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.fragment11 -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fragment_container3, seven1Fragment).commit()
                        true
                    }
                    R.id.fragment12 -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fragment_container3, seven2Fragment).commit()
                        true
                    }
                    R.id.fragment13 -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fragment_container3, seven3Fragment).commit()
                        true
                    }
                    R.id.fragment14 -> {

                        true
                    }

                    else -> true
                }
            }
        }
    }
}