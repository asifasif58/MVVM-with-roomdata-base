package com.example.demoprojectio.db.entity

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "add_detail")
data class DataListItem(
    var title: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}

@Entity(tableName = "image_string")
data class DataTwoString(
    val string1: String,
    var string2: String
) {
    @PrimaryKey(autoGenerate = true)
    var id2: Int = 0
}
