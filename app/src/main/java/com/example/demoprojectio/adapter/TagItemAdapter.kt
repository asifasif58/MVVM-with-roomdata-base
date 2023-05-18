package com.example.demoprojectio.adapter

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.demoprojectio.R
import com.example.demoprojectio.data.TagItem
import com.example.demoprojectio.databinding.TagRecycylerViewLayoutBinding


class TagItemAdapter : RecyclerView.Adapter<TagItemAdapter.ViewHolder1>() {

    private var itemList = ArrayList<TagItem>()
    var onItemClicked: (TagItem) -> Unit = {}
    var selectedPosition = -1

    @SuppressLint("NotifyDataSetChanged")
    fun setData(list: List<TagItem>) {
        itemList.clear()
        itemList = ArrayList(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder1 {
        val binding =
            TagRecycylerViewLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return ViewHolder1(binding)
    }


    override fun getItemCount() = itemList.size

    inner class ViewHolder1(val binding: TagRecycylerViewLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onBindViewHolder(holder: ViewHolder1, position: Int) {
        val item = itemList[position]
        holder.apply {
            binding.apply {
                if (selectedPosition == position) {
                    tagItemId.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(tagItemId.context,
                        R.color.color1
                    ))
                    tagItemId.setTextColor(ContextCompat.getColor(tagItemId.context, R.color.white))

                } else {
                    tagItemId.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(tagItemId.context, R.color.tagly))
                    tagItemId.setTextColor(ContextCompat.getColor(tagItemId.context, R.color.tagtext))
                }
                tagItemId.text = item.tagname
                tagItemId.setOnClickListener {
                    onItemClicked.invoke(item)
                    selectedPosition = holder.adapterPosition
                    if (selectedPosition >= 0) {
                        notifyDataSetChanged()
                    }
                }
            }
        }
    }

}