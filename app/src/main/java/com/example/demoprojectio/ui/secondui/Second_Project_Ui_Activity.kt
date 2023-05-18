package com.example.demoprojectio.ui.secondui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demoprojectio.R
import com.example.demoprojectio.databinding.ActivitySecondProjectUiBinding

class Second_Project_Ui_Activity : AppCompatActivity() {
    private val binding: ActivitySecondProjectUiBinding by lazy {
        ActivitySecondProjectUiBinding.inflate(
            layoutInflater
        )
    }
    private lateinit var homeFragment: HomeFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        homeFragment = HomeFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, homeFragment)
            .commit()

        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.fragment1 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, homeFragment).commit()

                    true
                }
                R.id.fragment2 -> {
                    startActivity(Intent(this, SecondScreenActivity::class.java))

                    true
                }
                R.id.fragment3 -> {
                    startActivity(Intent(this, ThirdScreenActivity::class.java))
                    true
                }
                R.id.fragment4 -> {


                    true
                }
                else -> true
            }
        }

    }
}