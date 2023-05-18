package com.example.demoprojectio.ui.fistuiproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.demoprojectio.R
import com.example.demoprojectio.databinding.ActivitySecondScreenUiBinding
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry

class SecondScreenUi : AppCompatActivity() {
    private val binding: ActivitySecondScreenUiBinding by lazy {
        ActivitySecondScreenUiBinding.inflate(
            layoutInflater
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.imgclick2.setColorFilter(ContextCompat.getColor(this, R.color.white))

        binding.imgclick1.setOnClickListener {
            changeiamge()
            binding.imgclick1.setColorFilter(ContextCompat.getColor(this, R.color.white))
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.imgclick2.setOnClickListener {
            changeiamge()
            binding.imgclick2.setColorFilter(ContextCompat.getColor(this, R.color.white))
        }
        binding.imgclick3.setOnClickListener {
            changeiamge()
            binding.imgclick3.setColorFilter(ContextCompat.getColor(this, R.color.white))
        }
        binding.imgclick4.setOnClickListener {
            changeiamge()
            binding.imgclick4.setColorFilter(ContextCompat.getColor(this, R.color.white))
        }

        binding.constraintLayout2.setOnClickListener { }
        binding.constraintLayout3.setOnClickListener { }
        binding.constraincal.setOnClickListener { }
        binding.imageView.setOnClickListener { }

        val entries = listOf(
            BarEntry(1f, 4000f),
            BarEntry(2f, 5000f),
            BarEntry(3f, 4000f),
            BarEntry(4f, 5000f),
            BarEntry(5f, 4000f)
        )

// create a data set from the entries
        val dataSet = BarDataSet(entries, "Values")

// set bar colors
//        dataSet.colors = listOf(Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.MAGENTA)
        dataSet.colors = listOf(
            ContextCompat.getColor(this, R.color.greengraph),
            ContextCompat.getColor(this, R.color.unselectgraph)
        )

// create a data object from the data set
        val data = BarData(dataSet)

// set data to chart and invalidate
        binding.chart.data = data
        binding.chart.invalidate()


// set x-axis properties
        val xAxis = binding.chart.xAxis
        xAxis.position = XAxis.XAxisPosition.BOTTOM
        xAxis.setDrawGridLines(false)
        xAxis.setDrawLabels(false)
        xAxis.setDrawAxisLine(false)


// set y-axis properties

        val yAxis = binding.chart.axisLeft
        yAxis.setDrawGridLines(false)
        yAxis.setDrawAxisLine(false)

        yAxis.axisMinimum = 1000f
        yAxis.axisMaximum = 5000f

// set chart properties
        binding.chart.setFitBars(true)
        binding.chart.description.isEnabled = false
        binding.chart.legend.isEnabled = false
        binding.chart.axisRight.isEnabled = false
    }

    private fun changeiamge() {
        binding.imgclick1.setColorFilter(ContextCompat.getColor(this, R.color.unselecticon))
        binding.imgclick2.setColorFilter(ContextCompat.getColor(this, R.color.unselecticon))
        binding.imgclick3.setColorFilter(ContextCompat.getColor(this, R.color.unselecticon))
        binding.imgclick4.setColorFilter(ContextCompat.getColor(this, R.color.unselecticon))
    }


}