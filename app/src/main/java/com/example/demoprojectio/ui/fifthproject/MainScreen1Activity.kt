package com.example.demoprojectio.ui.fifthproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demoprojectio.R
import com.example.demoprojectio.databinding.ActivityMainScreen1Binding
import com.example.demoprojectio.ui.fifthproject.adapter.ImageShowAdapter
import com.example.demoprojectio.ui.fifthproject.adapter.ShowFoodImage

class MainScreen1Activity : AppCompatActivity() {
    private val binding: ActivityMainScreen1Binding by lazy {
        ActivityMainScreen1Binding.inflate(
            layoutInflater
        )
    }

    private val wantAdapter: ImageShowAdapter by lazy {
        ImageShowAdapter()
    }
    private val showFoodImage = ArrayList<ShowFoodImage>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initilizer()
        clickListner()
    }

    private fun clickListner() {
        binding.apply {
            textView75.setOnClickListener {
                startActivity(Intent(this@MainScreen1Activity, FifthScreen2Activity::class.java))
            }
            textView76.setOnClickListener {
                startActivity(Intent(this@MainScreen1Activity, FifthScreen2Activity::class.java))
            }
            textView78.setOnClickListener {
                startActivity(Intent(this@MainScreen1Activity, FifthScreen2Activity::class.java))
            }
        }
    }

    private fun initilizer() {
        binding.apply {
            setUpList() {
                setUpAdapter()
            }
        }
    }

    private fun setUpAdapter() {
        binding.apply {
            recyclerView.adapter = wantAdapter
            wantAdapter.setData(showFoodImage)
            recyclerView2.adapter = wantAdapter
            wantAdapter.setData(showFoodImage)
        }
    }

    private fun setUpList(res: () -> Unit = {}) {
        showFoodImage.add(
            ShowFoodImage(
                R.drawable.food1
            )
        )
        showFoodImage.add(
            ShowFoodImage(
                R.drawable.food2
            )
        )
        showFoodImage.add(
            ShowFoodImage(
                R.drawable.food3
            )
        )
        showFoodImage.add(
            ShowFoodImage(
                R.drawable.food4
            )
        )
        showFoodImage.add(
            ShowFoodImage(
                R.drawable.food1
            )
        )
        showFoodImage.add(
            ShowFoodImage(
                R.drawable.food2
            )
        )
        showFoodImage.add(
            ShowFoodImage(
                R.drawable.food3
            )
        )
        showFoodImage.add(
            ShowFoodImage(
                R.drawable.food4
            )
        )
        showFoodImage.add(
            ShowFoodImage(
                R.drawable.food1
            )
        )
        showFoodImage.add(
            ShowFoodImage(
                R.drawable.food2
            )
        )
        showFoodImage.add(
            ShowFoodImage(
                R.drawable.food3
            )
        )
        showFoodImage.add(
            ShowFoodImage(
                R.drawable.food4
            )
        )
        res.invoke()
    }

}