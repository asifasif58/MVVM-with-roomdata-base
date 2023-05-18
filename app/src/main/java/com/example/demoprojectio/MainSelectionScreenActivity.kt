package com.example.demoprojectio

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demoprojectio.databinding.ActivityMainSelectionScreenBinding
import com.example.demoprojectio.ui.fifthproject.MainScreen1Activity
import com.example.demoprojectio.ui.fistuiproject.MainActivity
import com.example.demoprojectio.ui.fourthproject.Start1Activity
import com.example.demoprojectio.ui.secondui.Second_Project_Ui_Activity
import com.example.demoprojectio.ui.seventhproject.Seventh1MainActivity
import com.example.demoprojectio.ui.sixproject.SixProjectScreen1Activity
import com.example.demoprojectio.ui.thirduiproject.Screen1SplashActivity

class MainSelectionScreenActivity : AppCompatActivity() {
    private val binding: ActivityMainSelectionScreenBinding by lazy {
        ActivityMainSelectionScreenBinding.inflate(
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
            firstUiProject.setOnClickListener {
                startActivity(Intent(this@MainSelectionScreenActivity, MainActivity::class.java))
            }
            secondUiProject.setOnClickListener {
                startActivity(Intent(this@MainSelectionScreenActivity, Second_Project_Ui_Activity::class.java))
            }
            thirdUiProject.setOnClickListener {
                startActivity(Intent(this@MainSelectionScreenActivity, Screen1SplashActivity::class.java))
            }
            forthUiProject.setOnClickListener {
                startActivity(Intent(this@MainSelectionScreenActivity, Start1Activity::class.java))
            }
            fifthUiProject.setOnClickListener {
                startActivity(Intent(this@MainSelectionScreenActivity, MainScreen1Activity::class.java))
            }
            sixUiProject.setOnClickListener {
                startActivity(Intent(this@MainSelectionScreenActivity, SixProjectScreen1Activity::class.java))
            }
            sevenUiProject.setOnClickListener {
                startActivity(Intent(this@MainSelectionScreenActivity, Seventh1MainActivity::class.java))
            }
        }
    }
}