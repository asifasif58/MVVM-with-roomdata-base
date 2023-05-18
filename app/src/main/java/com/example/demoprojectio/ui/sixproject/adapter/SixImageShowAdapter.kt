package com.example.demoprojectio.ui.sixproject.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demoprojectio.databinding.LayoutImageTextAdapterBinding

class SixImageShowAdapter  : RecyclerView.Adapter<SixImageShowAdapter.ViewHolder1>() {

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
            LayoutImageTextAdapterBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return ViewHolder1(binding)
    }


    override fun getItemCount() = itemList.size

    inner class ViewHolder1(val binding: LayoutImageTextAdapterBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onBindViewHolder(holder: ViewHolder1, position: Int) {
        val item = itemList[position]
        holder.apply {
            binding.apply {
                imageFood.setImageResource(item.food1)
                textView83.text = item.s
                textView84.text = item.s1
                textView85.text = item.s2
            }
            itemView.setOnClickListener {
                onItemClicked.invoke(item)
            }
        }
    }

}