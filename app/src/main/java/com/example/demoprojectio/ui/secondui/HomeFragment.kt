package com.example.demoprojectio.ui.secondui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.demoprojectio.R
import com.example.demoprojectio.adapter.HomeFragmentAdapter
import com.example.demoprojectio.data.RecyclerViewItem
import com.example.demoprojectio.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private val binding: FragmentHomeBinding by lazy {
        FragmentHomeBinding.inflate(layoutInflater)
    }
    private val homeFragmentAdapter: HomeFragmentAdapter by lazy {
        HomeFragmentAdapter()
    }

    private var activityContext: Second_Project_Ui_Activity? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activityContext = context as Second_Project_Ui_Activity
    }

    private val itemList = ArrayList<RecyclerViewItem>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialise()
        clickListiners()
    }

    private fun clickListiners() {
        binding.apply {
            textView27.setOnClickListener{
                startActivity(Intent(textView27.context,SecondScreenActivity::class.java))
            }
        }
    }

    private fun initialise() {
        binding.apply {
            setUpList() {
                setUpAdapter()
            }
        }
    }

    private fun setUpAdapter() {
        binding.apply {
            recyclerviewitem.adapter = homeFragmentAdapter
            homeFragmentAdapter.setData(itemList)
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
        homeFragmentAdapter.onItemClicked = { item ->
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