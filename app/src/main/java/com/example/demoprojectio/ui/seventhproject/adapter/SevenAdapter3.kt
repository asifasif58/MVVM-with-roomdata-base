package com.example.demoprojectio.ui.seventhproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demoprojectio.databinding.Layout3SevenAdapterBinding
import com.example.demoprojectio.db.entity.DataTwoString
import com.example.demoprojectio.ui.seventhproject.DetailViewModel

class SevenAdapter3(private var viewModel: DetailViewModel) : RecyclerView.Adapter<SevenAdapter3.ViewHolder1>() {

    private var itemList = emptyList<DataTwoString>()
    var onItemClicked: (DataTwoString) -> Unit = {}


    fun setData(list: List<DataTwoString>) {
        this.itemList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder1 {
        val binding =
            Layout3SevenAdapterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder1(binding)
    }

    override fun getItemCount() = itemList.size
    inner class ViewHolder1(val binding: Layout3SevenAdapterBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onBindViewHolder(holder: ViewHolder1, position: Int) {
        val item = itemList[position]
        holder.apply {
            binding.apply {
                textView96.text = item.string1
                textView97.text = item.string2
                imageDelete.setOnClickListener {
                    viewModel.deleteTwoStringData(item)
                }
                itemView.setOnLongClickListener {
                    onItemClicked.invoke(item)
                    true
                }
                textView97.setOnClickListener {
                    onItemClicked.invoke(item)
                }
                textView96.setOnClickListener {
                    onItemClicked.invoke(item)
                }
            }
        }
    }
}