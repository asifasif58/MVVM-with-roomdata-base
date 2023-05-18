package com.example.demoprojectio.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.demoprojectio.db.entity.DataListItem
import com.example.demoprojectio.db.entity.DataTwoString

@Database(
    entities = [DataListItem::class, DataTwoString::class],
    version = 1, exportSchema = false
)
abstract class DetailDatabase : RoomDatabase() {
    abstract fun getAddDetailDao(): AddDetailDao

    companion object {

        @Volatile
        private var instant: DetailDatabase? = null

        fun getDatabase(context: Context): DetailDatabase  =
            instant?: synchronized(this){
                instant?: createDatabase(context).also{ instant = it}
            }
         fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                DetailDatabase::class.java,
                "my_database"
            ).build()
    }
}