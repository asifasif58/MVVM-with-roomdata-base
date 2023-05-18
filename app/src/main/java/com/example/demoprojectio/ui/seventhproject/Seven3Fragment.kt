package com.example.demoprojectio.ui.seventhproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.demoprojectio.R
import com.example.demoprojectio.data.RecyclerViewItem
import com.example.demoprojectio.databinding.FragmentSeven3Binding
import com.example.demoprojectio.ui.seventhproject.adapter.SevenAdapter1

class Seven3Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    private val sevenAdapter1: SevenAdapter1 by lazy {
        SevenAdapter1()
    }
    private val itemList = ArrayList<RecyclerViewItem>()
    private val binding: FragmentSeven3Binding by lazy {
        FragmentSeven3Binding.inflate(
            layoutInflater
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
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
            recyclerViewSeven1.adapter = sevenAdapter1
            sevenAdapter1.setData(itemList)
            adapterCallBacks()
        }
    }

    private fun setUpList(res: () -> Unit = {}) {
        itemList.add(
            RecyclerViewItem(
                R.color.color1,
                "STEPS",
                R.drawable.bookicon,
                "1059 bpm",
                "last update 3m"
            )
        )
        itemList.add(
            RecyclerViewItem(
                R.color.color2,
                "HEART RATE",
                R.drawable.copyicoon,
                "345 km",
                "last update 5d"
            )
        )
        itemList.add(
            RecyclerViewItem(
                R.color.color3,
                "WALK",
                R.drawable.editicoon,
                "233 pal",
                "last update 13h"
            )
        )
        itemList.add(
            RecyclerViewItem(
                R.color.color4,
                "FOOD",
                R.drawable.moveicoon,
                "1028 cm",
                "last update 10m"
            )
        )
        res.invoke()
    }

    private fun adapterCallBacks() {
        sevenAdapter1.onItemClicked = { item ->
            when (item.imageResource1) {
                "STEPS" -> {
                    Toast.makeText(requireContext(), "click", Toast.LENGTH_SHORT).show()
                }
                "HEART RATE" -> {
                    Toast.makeText(requireContext(), "click", Toast.LENGTH_SHORT).show()
                }
                "WALK" -> {
                    Toast.makeText(requireContext(), "click", Toast.LENGTH_SHORT).show()
                }
                "FOOD" -> {
                    Toast.makeText(requireContext(), "click", Toast.LENGTH_SHORT).show()
                }
                "READ" -> {
                    Toast.makeText(requireContext(), "click", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}