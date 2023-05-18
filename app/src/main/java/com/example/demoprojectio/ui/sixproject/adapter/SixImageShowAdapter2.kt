package com.example.demoprojectio.ui.sixproject.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demoprojectio.databinding.LayoutImageText2AdapterBinding
import com.example.demoprojectio.databinding.LayoutImageTextAdapterBinding

class SixImageShowAdapter2 : RecyclerView.Adapter<SixImageShowAdapter2.ViewHolder1>() {

    private var itemList = ArrayList<SixImageData>()
    var onItemClicked: (SixImageData) -> Unit = {}
    var selectedPosition = -1

    @SuppressLint("NotifyDataSetChanged")
    fun setData(list: List<SixImageData>) {
        itemList.clear()
        itemList = ArrayList(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder1 {
        val binding =
            LayoutImageText2AdapterBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return ViewHolder1(binding)
    }


    override fun getItemCount() = itemList.size

    inner class ViewHolder1(val binding: LayoutImageText2AdapterBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onBindViewHolder(holder: ViewHolder1, position: Int) {
        val item = itemList[position]
        holder.apply {
            binding.apply {
                imageFood.setImageResource(item.food1)
                textView83.text = item.s
                textView84.text = item.s1
            }
        }
    }

}