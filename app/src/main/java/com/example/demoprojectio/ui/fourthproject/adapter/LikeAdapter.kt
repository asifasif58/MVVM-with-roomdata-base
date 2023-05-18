package com.example.demoprojectio.ui.fourthproject.adapter

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.demoprojectio.R
import com.example.demoprojectio.databinding.LikeAdapterLayoutBinding
import com.example.demoprojectio.databinding.WantAdapterLayoutBinding


class LikeAdapter : RecyclerView.Adapter<LikeAdapter.ViewHolder1>() {

    private var itemList = ArrayList<WantData>()
    var onItemClicked: (WantData) -> Unit = {}
    var selectedPosition = -1

    @SuppressLint("NotifyDataSetChanged")
    fun setData(list: List<WantData>) {
        itemList.clear()
        itemList = ArrayList(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder1 {
        val binding =
            LikeAdapterLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return ViewHolder1(binding)
    }


    override fun getItemCount() = itemList.size

    inner class ViewHolder1(val binding: LikeAdapterLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onBindViewHolder(holder: ViewHolder1, position: Int) {
        val item = itemList[position]
        holder.apply {
            binding.apply {
                tagItemId.text = item.wantText
                tagItemId.setOnClickListener {
                    onItemClicked.invoke(item)
                    selectedPosition = holder.adapterPosition
                    if (!item.b) {
                        tagItemId.backgroundTintList = ColorStateList.valueOf(
                            ContextCompat.getColor(
                                tagItemId.context,
                                item.wantclr1
                            )
                        )
                        item.b = !item.b
//                        notifyItemChanged(selectedPosition)

                    }
                    else{
                        tagItemId.backgroundTintList = ColorStateList.valueOf(
                            ContextCompat.getColor(
                                tagItemId.context,
                                R.color.tagly
                            )
                        )
                        item.b = !item.b
//                        notifyItemChanged(selectedPosition)
                    }
                }
            }
        }
    }

}