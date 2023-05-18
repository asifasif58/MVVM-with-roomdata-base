package com.example.demoprojectio.ui.seventhproject

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.demoprojectio.db.DetailDatabase
import com.example.demoprojectio.db.entity.DataListItem
import com.example.demoprojectio.db.entity.DataTwoString
import com.example.demoprojectio.db.repository.DetailDataRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetailViewModel(application: Application) : AndroidViewModel(application) {

    private val userDao = DetailDatabase.getDatabase(application)
    private val repository = DetailDataRepository(userDao)
    val allData: LiveData<List<DataListItem>> = repository.readAllData

    fun delete(item: DataListItem) = CoroutineScope(Dispatchers.IO).launch {
        repository.delete(item)
    }

    fun getNameByName(string: String, item: DataListItem) = CoroutineScope(Dispatchers.IO).launch {
        val existingName = repository.getNameByName(string)
        if (existingName == null) {
            repository.addData(item)
        }

        repository.getNameByName(string)
    }


    // two string data

    val allTwoStringData: LiveData<List<DataTwoString>> = repository.readTwoStringData
    fun addTwoStringData(dataTwoString: DataTwoString) = CoroutineScope(Dispatchers.IO).launch {
        repository.addTwoString(dataTwoString)
    }

    fun deleteTwoStringData(dataTwoString: DataTwoString) = CoroutineScope(Dispatchers.IO).launch {
        repository.deleteTwoString(dataTwoString)
    }


}