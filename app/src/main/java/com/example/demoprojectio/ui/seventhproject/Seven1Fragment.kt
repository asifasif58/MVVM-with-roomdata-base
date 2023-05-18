package com.example.demoprojectio.ui.seventhproject

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.demoprojectio.R
import com.example.demoprojectio.databinding.AddtwotextlayoutBinding
import com.example.demoprojectio.databinding.AlerttextdialogBinding
import com.example.demoprojectio.databinding.FragmentSeven1Binding
import com.example.demoprojectio.db.entity.DataListItem
import com.example.demoprojectio.db.entity.DataTwoString
import com.example.demoprojectio.ui.seventhproject.adapter.SevenAdapter2
import com.example.demoprojectio.ui.seventhproject.adapter.SevenAdapter3


class Seven1Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private lateinit var viewModel: DetailViewModel

    private val binding: FragmentSeven1Binding by lazy {
        FragmentSeven1Binding.inflate(
            layoutInflater
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initilizer()
        clickListner()
    }

    private fun clickListner() {
        binding.apply {
            textView83.setOnClickListener {
                textshowadd()
            }
            imageView42.setOnClickListener {
                addTwoStringInDatabase()
            }
        }
    }

    private fun initilizer() {
        viewModel = ViewModelProvider(requireActivity())[DetailViewModel::class.java]
        val sevenAdapter2 = SevenAdapter2(listOf(), viewModel)
        binding.recyclerViewSeven1.adapter = sevenAdapter2
        viewModel.allData.observe(requireActivity(), Observer {
            sevenAdapter2.itemList = it
            sevenAdapter2.notifyDataSetChanged()
        })
        adapterCallBacks(sevenAdapter2)
        val sevenAdapter3 = SevenAdapter3(viewModel)
        binding.recyclerViewSeven2.adapter = sevenAdapter3
        viewModel.allTwoStringData.observe(requireActivity(), Observer {
            sevenAdapter3.setData(it)
        })
        adapterCallBacks2(sevenAdapter3)
    }

    private fun adapterCallBacks2(sevenAdapter3: SevenAdapter3) {
        sevenAdapter3.onItemClicked = {item->
            updateTextView(item)
            
        }
    }

    private fun updateTextView(item: DataTwoString) {
        var inflater = this.layoutInflater
        val binding: AddtwotextlayoutBinding =
            AddtwotextlayoutBinding.inflate(inflater)
        val dialog = Dialog(requireContext(), R.style.SheetDialog)
        dialog.setCancelable(true)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setContentView(binding.root)
        dialog.create()
        dialog.show()
        binding.textView8.text = "Edit Text"
        binding.edittext.setText(item.string1)
        binding.edittext2.setText(item.string2)
        binding.textDone.setOnClickListener {
            if (binding.edittext.text.isNullOrBlank()) {
                Toast.makeText(
                    requireContext(),
                    "Please enter both name",
                    Toast.LENGTH_SHORT
                ).show()
            } else if (binding.edittext2.text.isNullOrBlank()) {
                Toast.makeText(
                    requireContext(),
                    "Please enter both name",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                dialog.dismiss()
                viewModel.deleteTwoStringData(item)
                val txtok: String = binding.edittext.text.toString()
                val txtok2: String = binding.edittext2.text.toString()
                val itemm = DataTwoString(txtok, txtok2)
                viewModel.addTwoStringData(itemm)
            }
        }
    }

    private fun adapterCallBacks(sevenAdapter2: SevenAdapter2) {
        sevenAdapter2.onItemClicked = { item ->
            textshowadd2(item)
        }
    }

    private fun textshowadd2(itemname: DataListItem) {
        var inflater = this.layoutInflater
        val binding: AlerttextdialogBinding =
            AlerttextdialogBinding.inflate(inflater)
        val dialog = Dialog(requireContext(), R.style.SheetDialog)
        dialog.setCancelable(true)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setContentView(binding.root)
        dialog.create()
        dialog.show()
        binding.textView8.text = "Edit Text"
        binding.edittext.setText(itemname.title)
        binding.textDone.setOnClickListener {
            if (binding.edittext.text.isNullOrBlank()) {
                Toast.makeText(
                    requireContext(),
                    "Please enter the text",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                dialog.dismiss()
                viewModel.delete(itemname)
                val txtok: String = binding.edittext.text.toString()
                val itemm = DataListItem(txtok)
                viewModel.getNameByName(txtok, itemm)
                Toast.makeText(
                    requireContext(),
                    "updated text",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        binding.textCancel.setOnClickListener {
            dialog.dismiss()
        }
    }

    private fun textshowadd() {
        var inflater = this.layoutInflater
        val binding: AlerttextdialogBinding =
            AlerttextdialogBinding.inflate(inflater)
        val dialog = Dialog(requireContext(), R.style.SheetDialog)
        dialog.setCancelable(true)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setContentView(binding.root)
        dialog.create()
        dialog.show()
        binding.textView8.text = "Edit Text"
        binding.textDone.setOnClickListener {
            if (binding.edittext.text.isNullOrBlank()) {
                Toast.makeText(
                    requireContext(),
                    "Please enter the text",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                dialog.dismiss()
                val txtok: String = binding.edittext.text.toString()
                val itemm = DataListItem(txtok)
                viewModel.getNameByName(txtok, itemm)
            }
        }
        binding.textCancel.setOnClickListener {
            dialog.dismiss()
        }
    }

    private fun addTwoStringInDatabase() {
        var inflater = this.layoutInflater
        val binding: AddtwotextlayoutBinding =
            AddtwotextlayoutBinding.inflate(inflater)
        val dialog = Dialog(requireContext(), R.style.SheetDialog)
        dialog.setCancelable(true)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setContentView(binding.root)
        dialog.create()
        dialog.show()
        binding.textView8.text = "Edit Text"
        binding.textDone.setOnClickListener {
            if (binding.edittext.text.isNullOrBlank()) {
                Toast.makeText(
                    requireContext(),
                    "Please enter both name",
                    Toast.LENGTH_SHORT
                ).show()
            } else if (binding.edittext2.text.isNullOrBlank()) {
                Toast.makeText(
                    requireContext(),
                    "Please enter both name",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                dialog.dismiss()
                val txtok: String = binding.edittext.text.toString()
                val txtok2: String = binding.edittext2.text.toString()
                val itemm = DataTwoString(txtok, txtok2)
                viewModel.addTwoStringData(itemm)
            }
        }
        binding.textCancel.setOnClickListener {
            dialog.dismiss()
        }
    }

}