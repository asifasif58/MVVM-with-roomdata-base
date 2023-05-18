package com.example.demoprojectio.ui.fourthproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.demoprojectio.R
import com.example.demoprojectio.databinding.FragmentProjectFour3Binding
import com.example.demoprojectio.ui.fourthproject.adapter.WantAdapter
import com.example.demoprojectio.ui.fourthproject.adapter.WantData


class ProjectFour3Fragment : Fragment() {
    private val binding: FragmentProjectFour3Binding by lazy {
        FragmentProjectFour3Binding.inflate(
            layoutInflater
        )
    }
    private val wantAdapter: WantAdapter by lazy {
        WantAdapter()
    }
    private val wantList = ArrayList<WantData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
            wantRecyclerViewId.adapter = wantAdapter
            wantAdapter.setData(wantList)
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

}