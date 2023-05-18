package com.example.demoprojectio.ui.fifthproject.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demoprojectio.databinding.LayoutImageShowAdapterBinding

class ImageShowAdapter : RecyclerView.Adapter<ImageShowAdapter.ViewHolder1>() {

    private var itemList = ArrayList<ShowFoodImage>()
    var onItemClicked: (ShowFoodImage) -> Unit = {}
    var selectedPosition = -1

    @SuppressLint("NotifyDataSetChanged")
    fun setData(list: List<ShowFoodImage>) {
        itemList.clear()
        itemList = ArrayList(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder1 {
        val binding =
            LayoutImageShowAdapterBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return ViewHolder1(binding)
    }


    override fun getItemCount() = itemList.size

    inner class ViewHolder1(val binding: LayoutImageShowAdapterBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onBindViewHolder(holder: ViewHolder1, position: Int) {
        val item = itemList[position]
        holder.apply {
            binding.apply {
                imageFood.setImageResource(item.food1Image)
            }
        }
    }

}