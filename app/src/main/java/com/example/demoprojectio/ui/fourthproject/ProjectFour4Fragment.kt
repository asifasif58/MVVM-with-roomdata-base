package com.example.demoprojectio.ui.fourthproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.demoprojectio.R
import com.example.demoprojectio.databinding.FragmentProjectFour4Binding
import com.example.demoprojectio.ui.fourthproject.adapter.LikeAdapter
import com.example.demoprojectio.ui.fourthproject.adapter.WantAdapter
import com.example.demoprojectio.ui.fourthproject.adapter.WantData


class ProjectFour4Fragment : Fragment() {
    private val binding:FragmentProjectFour4Binding by lazy { FragmentProjectFour4Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    private val likeAdapter: LikeAdapter by lazy {
        LikeAdapter()
    }
    private val wantList = ArrayList<WantData>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        wantList.clear()
        initilizer()
    }
    private fun initilizer() {
        binding.apply {
            setUpList() {
                setUpAdapter()
            }
        }    }
    private fun setUpAdapter() {
        binding.apply {
            wantRecyclerViewId.adapter = likeAdapter
            likeAdapter.setData(wantList)
            adapterCallBacks()
        }
    }

    private fun setUpList(res: () -> Unit = {}) {
        wantList.add(
            WantData(
                "Abs", R.color.wantclr1, false
            )
        )
        wantList.add(
            WantData(
                "Shoulders",
                R.color.wantclr2,false
            )
        )
        wantList.add(
            WantData(
                "Neck",
                R.color.wantclr3,
                false
            )
        )
        wantList.add(
            WantData(
                "Hands",
                R.color.wantclr4,
                false
            )
        )
        wantList.add(
            WantData(
                "Arms",
                R.color.wantclr2,
                false
            )
        )
        wantList.add(
            WantData(
                "Chest",
                R.color.wantclr1,
                false
            )
        )
        wantList.add(
            WantData(
                "Back",
                R.color.wantclr4,
                false
            )
        )
        wantList.add(
            WantData(
                "Stomach",
                R.color.wantclr3,
                false
            )
        )
        wantList.add(
            WantData(
                "Buttocks",
                R.color.wantclr1,
                false
            )
        )
        wantList.add(
            WantData(
                "Legs",
                R.color.wantclr2,
                false
            )
        )
        res.invoke()
    }

    private fun adapterCallBacks() {
        likeAdapter.onItemClicked = { item ->
            when (item.wantText) {
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