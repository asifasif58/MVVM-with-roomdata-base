package com.example.demoprojectio.db.repository

import androidx.lifecycle.LiveData
import com.example.demoprojectio.db.DetailDatabase
import com.example.demoprojectio.db.entity.DataListItem
import com.example.demoprojectio.db.entity.DataTwoString

class DetailDataRepository(private val db: DetailDatabase) {
    suspend fun addData(item: DataListItem) = db.getAddDetailDao().addData(item)
    suspend fun delete(item: DataListItem) = db.getAddDetailDao().delete(item)
    val readAllData: LiveData<List<DataListItem>> = db.getAddDetailDao().getAllValueData()
    suspend fun getNameByName(string: String) = db.getAddDetailDao().getNameByName(string)

    suspend fun addTwoString(item: DataTwoString) = db.getAddDetailDao().addTwoStringData(item)
    suspend fun deleteTwoString(item: DataTwoString) = db.getAddDetailDao().deleteTwoString(item)
//    suspend fun updateTwoString(string: String,string2: String,int: Int) = db.getAddDetailDao().updateTwoString(string,string2,int)
    val readTwoStringData:LiveData<List<DataTwoString>> = db.getAddDetailDao().getAllTwoStringData()
}