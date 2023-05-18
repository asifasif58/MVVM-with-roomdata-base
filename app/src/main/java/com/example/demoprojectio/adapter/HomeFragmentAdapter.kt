package com.example.demoprojectio.adapter

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.demoprojectio.data.RecyclerViewItem
import com.example.demoprojectio.databinding.HomerecyclerviewitemBinding

class HomeFragmentAdapter : RecyclerView.Adapter<HomeFragmentAdapter.ViewHolder1>() {

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
            HomerecyclerviewitemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder1(binding)
    }


    override fun getItemCount() = itemList.size

    inner class ViewHolder1(val binding: HomerecyclerviewitemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onBindViewHolder(holder: ViewHolder1, position: Int) {
        val item = itemList[position]
        holder.apply {
            binding.apply {
                homeicon.setImageResource(item.imageResource)
                homeicontext.text = item.imageResource1
                textView37.text = item.text
                textView38.text = item.s
                constarintclick.backgroundTintList =
                    ColorStateList.valueOf(ContextCompat.getColor(textView38.context, item.colorly))

                itemView.setOnClickListener {
                    onItemClicked.invoke(item)
                }
            }
        }
    }

}
