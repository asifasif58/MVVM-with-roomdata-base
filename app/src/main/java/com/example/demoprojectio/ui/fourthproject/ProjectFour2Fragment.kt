package com.example.demoprojectio.ui.fourthproject

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.demoprojectio.R
import com.example.demoprojectio.databinding.FragmentProjectFour2Binding

class ProjectFour2Fragment : Fragment() {
    private val binding: FragmentProjectFour2Binding by lazy {
        FragmentProjectFour2Binding.inflate(
            layoutInflater
        )
    }
    private var activityGet:Start1Activity?=null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activityGet = context as Start1Activity
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clickListner()
    }

    private fun clickListner() {
        binding.apply {
            seekbar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                    textView72.text = progress.toString()
                }

                override fun onStartTrackingTouch(seekBar: SeekBar) {}

                override fun onStopTrackingTouch(seekBar: SeekBar) {}
            })

            textView70.setOnClickListener {
                textView70.setBackgroundResource(R.drawable.circle20blackall)
                textView71.setBackgroundResource(R.drawable.circle20withoutborder)
                textView71.setTextColor(ContextCompat.getColor(textView71.context,R.color.black))
                textView70.setTextColor(ContextCompat.getColor(textView71.context,R.color.white))

            }
            textView71.setOnClickListener {
                textView71.setBackgroundResource(R.drawable.circle20blackall)
                textView70.setBackgroundResource(R.drawable.circle20withoutborder)
                textView71.setTextColor(ContextCompat.getColor(textView71.context,R.color.white))
                textView70.setTextColor(ContextCompat.getColor(textView71.context,R.color.black))

            }
        }
    }

}