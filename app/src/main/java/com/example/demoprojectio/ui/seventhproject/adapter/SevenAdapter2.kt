package com.example.demoprojectio.ui.seventhproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demoprojectio.databinding.Layout2SevenAdapterBinding
import com.example.demoprojectio.db.entity.DataListItem
import com.example.demoprojectio.ui.seventhproject.DetailViewModel

class SevenAdapter2(
    var itemList: List<DataListItem>,
    private var viewModel: DetailViewModel
) : RecyclerView.Adapter<SevenAdapter2.ViewHolder1>() {

    var onItemClicked: (DataListItem) -> Unit = {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder1 {
        val binding =
            Layout2SevenAdapterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder1(binding)
    }

    override fun getItemCount() = itemList.size
    inner class ViewHolder1(val binding: Layout2SevenAdapterBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onBindViewHolder(holder: ViewHolder1, position: Int) {
        val item = itemList[position]
        holder.apply {
            binding.apply {
                textView96.text = item.title
                imageView40.setOnClickListener {
                    viewModel.delete(item)
                }
                itemView.setOnLongClickListener {
                    onItemClicked.invoke(item)
                    true
                }
            }
        }
    }
}