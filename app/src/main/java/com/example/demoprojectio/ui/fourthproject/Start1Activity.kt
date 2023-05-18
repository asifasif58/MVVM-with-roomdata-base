package com.example.demoprojectio.ui.fourthproject

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.demoprojectio.R
import com.example.demoprojectio.databinding.ActivityStart1Binding

class Start1Activity : AppCompatActivity() {
    private val binding: ActivityStart1Binding by lazy {
        ActivityStart1Binding.inflate(
            layoutInflater
        )
    }
    private lateinit var projectFour1Fragment: ProjectFour1Fragment
    private lateinit var projectFour2Fragment: ProjectFour2Fragment
    private lateinit var projectFour3Fragment: ProjectFour3Fragment
    private lateinit var projectFour4Fragment: ProjectFour4Fragment
    private var countNext = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        projectFour1Fragment = ProjectFour1Fragment()
        projectFour2Fragment = ProjectFour2Fragment()
        projectFour3Fragment = ProjectFour3Fragment()
        projectFour4Fragment = ProjectFour4Fragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, projectFour1Fragment)
            .commit()
        clickListner()
    }

    private fun clickListner() {
        binding.apply {
            saveText.setOnClickListener {
                if (countNext < 4) {
                    countNext += 1
                    visibilityBack()
                    if (countNext == 1) {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, projectFour2Fragment)
                            .commit()
                    }
                    if (countNext == 2) {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, projectFour3Fragment)
                            .commit()
                    }
                    if (countNext == 3) {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, projectFour4Fragment)
                            .commit()
                    }
                }
            }
            bacltext.setOnClickListener {
                if (countNext <= 4) {

                    if (countNext == 1) {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, projectFour1Fragment)
                            .commit()
                    }
                    if (countNext == 2) {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, projectFour2Fragment)
                            .commit()
                    }
                    if (countNext == 3) {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, projectFour3Fragment)
                            .commit()
                    }
                    countNext -= 1
                    visibilityBack()
                }

            }
        }
    }

    private fun visibilityBack() {
        binding.apply {
            if (countNext > 0) {
                bacltext.visibility = View.VISIBLE
            } else {
                bacltext.visibility = View.GONE
            }
        }
    }
}