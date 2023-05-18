package com.example.demoprojectio.ui.sixproject

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.demoprojectio.R
import com.example.demoprojectio.databinding.ActivitySixProjectScreen1Binding
import com.example.demoprojectio.ui.secondui.ThirdScreenActivity
import com.example.demoprojectio.ui.sixproject.adapter.SixImageData
import com.example.demoprojectio.ui.sixproject.adapter.SixImageShowAdapter
import com.example.demoprojectio.ui.sixproject.adapter.SixImageShowAdapter2

class SixProjectScreen1Activity : AppCompatActivity() {
    private val binding: ActivitySixProjectScreen1Binding by lazy {
        ActivitySixProjectScreen1Binding.inflate(
            layoutInflater
        )
    }

    private val sixImageShowAdapter: SixImageShowAdapter by lazy {
        SixImageShowAdapter()
    }
    private val sixImageShowAdapter2: SixImageShowAdapter2 by lazy {
        SixImageShowAdapter2()
    }
    private val sixImageShow = ArrayList<SixImageData>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initilizer()
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
            recyclerView.adapter = sixImageShowAdapter
            sixImageShowAdapter.setData(sixImageShow)
            callBackMethod()
            recyclerView2.adapter = sixImageShowAdapter2
            sixImageShowAdapter2.setData(sixImageShow)
        }
    }

    private fun callBackMethod() {
        sixImageShowAdapter.onItemClicked = { item ->
            val intent = Intent(this, SixProjectScreen2Activity::class.java)
            startActivity(intent)
        }

    }

    private fun setUpList(res: () -> Unit = {}) {
        sixImageShow.add(
            SixImageData(
                R.drawable.food1, "$123", "Jhon Ali", "okar, robot lovty"
            )
        )
        sixImageShow.add(
            SixImageData(
                R.drawable.food1, "$123", "Heart Tli", "okar, robot lovty"
            )
        )
        sixImageShow.add(
            SixImageData(
                R.drawable.food1, "$123", "Jhon Ali", "okar, robot lovty"
            )
        )
        sixImageShow.add(
            SixImageData(
                R.drawable.food1, "$123", "Jhon Ali", "okar, robot lovty"
            )
        )
        sixImageShow.add(
            SixImageData(
                R.drawable.food1, "$123", "Jhon Ali", "okar, robot lovty"
            )
        )
        sixImageShow.add(
            SixImageData(
                R.drawable.food1, "$123", "Jhon Ali", "okar, robot lovty"
            )
        )
        sixImageShow.add(
            SixImageData(
                R.drawable.food1, "$123", "Jhon Ali", "okar, robot lovty"
            )
        )
        sixImageShow.add(
            SixImageData(
                R.drawable.food1, "$123", "Jhon Ali", "okar, robot lovty"
            )
        )

        res.invoke()
    }

}