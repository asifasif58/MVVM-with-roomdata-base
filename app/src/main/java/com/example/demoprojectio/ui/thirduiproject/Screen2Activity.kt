package com.example.demoprojectio.ui.thirduiproject

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.demoprojectio.adapter.TagItemAdapter
import com.example.demoprojectio.data.TagItem
import com.example.demoprojectio.databinding.ActivityScreen2Binding

class Screen2Activity : AppCompatActivity() {
    private val binding: ActivityScreen2Binding by lazy {
        ActivityScreen2Binding.inflate(
            layoutInflater
        )
    }
    private var tagItemAdapter: TagItemAdapter? = null
    private val tagItem = ArrayList<TagItem>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        tagItemAdapter = TagItemAdapter()
        clickListner()
    }

    private fun clickListner() {
        binding.apply {
            setUpList() {
                setUpAdapter()
            }
            textView55.setOnClickListener {
                startActivity(Intent(this@Screen2Activity, AddTask3Activity::class.java))
            }
            floatingId.setOnClickListener{
                startActivity(Intent(this@Screen2Activity, AddTask3Activity::class.java))
            }
        }
    }

    private fun setUpAdapter() {
        binding.apply {
            tagRecyclerView.adapter = tagItemAdapter
            tagRecyclerView.layoutManager = GridLayoutManager(this@Screen2Activity, 3)
            tagItemAdapter?.setData(tagItem)
            adapterCallBacks()
        }
    }


    private fun setUpList(res: () -> Unit = {}) {
        tagItem.add(
            TagItem(
                "All Tag"
            )
        )
        tagItem.add(
            TagItem(
                "#Finance"
            )
        )
        tagItem.add(
            TagItem(
                "#Family"
            )
        )
        tagItem.add(
            TagItem(
                "#Contract"
            )
        )
        tagItem.add(
            TagItem(
                "#Business"
            )
        )
        tagItem.add(
            TagItem(
                "#Documents"
            )
        )
        tagItem.add(
            TagItem(
                "#Game store"
            )
        )
        tagItem.add(
            TagItem(
                "#Store"
            )
        )
        tagItem.add(
            TagItem(
                "#Food"
            )
        )
        res.invoke()
    }

    private fun adapterCallBacks() {
        tagItemAdapter?.onItemClicked = { item ->
            when (item.tagname) {
                "STEPS" -> {
                    Toast.makeText(this, "click", Toast.LENGTH_SHORT).show()
                }
                "HEART RATE" -> {
                    Toast.makeText(this, "click", Toast.LENGTH_SHORT).show()
                }
                "WALK" -> {
                    Toast.makeText(this, "click", Toast.LENGTH_SHORT).show()
                }
                "FOOD" -> {
                    Toast.makeText(this, "click", Toast.LENGTH_SHORT).show()
                }
                "READ" -> {
                    Toast.makeText(this, "click", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}