package com.example.demoprojectio.ui.sixproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demoprojectio.R
import com.example.demoprojectio.databinding.ActivitySixProjectScreen2Binding
import com.example.demoprojectio.ui.fifthproject.adapter.ImageShowAdapter
import com.example.demoprojectio.ui.fifthproject.adapter.ShowFoodImage
import com.example.demoprojectio.ui.sixproject.adapter.SixImageData
import com.example.demoprojectio.ui.sixproject.adapter.SixImageShowAdapter
import com.example.demoprojectio.ui.sixproject.adapter.SixImageShowAdapter3

class SixProjectScreen2Activity : AppCompatActivity() {
    private val binding: ActivitySixProjectScreen2Binding by lazy {
        ActivitySixProjectScreen2Binding.inflate(
            layoutInflater
        )
    }
    private val wantAdapter: SixImageShowAdapter3 by lazy {
        SixImageShowAdapter3()
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
            textView89.setOnClickListener {  }
        }
    }
    private fun initilizer() {
        binding.apply {
            setUpList() {
                setUpAdapter()
            }
        }    }
    private fun setUpAdapter() {
        binding.apply {
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