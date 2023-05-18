package com.example.demoprojectio.ui.seventhproject.adapter

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.demoprojectio.data.RecyclerViewItem
import com.example.demoprojectio.databinding.HomerecyclerviewitemBinding
import com.example.demoprojectio.databinding.Layout1SevenAdapterBinding


class SevenAdapter1 : RecyclerView.Adapter<SevenAdapter1.ViewHolder1>() {

    private var itemList = ArrayList<RecyclerViewItem>()
    var onItemClicked: (RecyclerViewItem) -> Unit = {}

    @SuppressLint("NotifyDataSetChanged")
    fun setData(list: List<RecyclerViewItem>) {
        itemList.clear()
        itemList = ArrayList(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder1 {
        val binding =
            Layout1SevenAdapterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder1(binding)
    }

    override fun getItemCount() = itemList.size
    inner class ViewHolder1(val binding: Layout1SevenAdapterBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onBindViewHolder(holder: ViewHolder1, position: Int) {
        val item = itemList[position]
        holder.apply {
            binding.apply {
                constrainLy.backgroundTintList =
                    ColorStateList.valueOf(ContextCompat.getColor(constrainLy.context, item.colorly))
                itemView.setOnClickListener {
                    onItemClicked.invoke(item)
                }
            }
        }
    }
}
