package com.example.demoprojectio.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.demoprojectio.db.entity.DataListItem
import com.example.demoprojectio.db.entity.DataTwoString

@Dao
interface AddDetailDao {
    @Query("SELECT * FROM add_detail")
    fun getAllValueData(): LiveData<List<DataListItem>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addData(item: DataListItem)

    @Delete
    fun delete(item: DataListItem)

    @Query("SELECT * FROM add_detail WHERE  title = :name")
    fun getNameByName(name: String): DataListItem


    // 2nd Entity
    @Query("SELECT * FROM image_string")
    fun getAllTwoStringData(): LiveData<List<DataTwoString>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addTwoStringData(item: DataTwoString)

    @Delete
    fun deleteTwoString(item: DataTwoString)

//    @Update
//    fun updateTwoString(item: DataTwoString)
//    @Query("UPDATE image_string SET string1 = :newText, string2=:newText WHERE id2 = :id")
//    @Update
//    suspend fun updateTwoString(newText: String,newText2: String, id: Int)
}