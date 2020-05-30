package com.example.red_book.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.red_book.data.dao.AtamaDao
import com.example.red_book.data.model.Atama

@Database(entities = [Atama::class], version = 1)
abstract class AtamaDatabase : RoomDatabase() {

    companion object{
        private lateinit var INSTANCE:AtamaDatabase

        fun getInstances(context: Context): AtamaDatabase =
            Room.databaseBuilder(context, AtamaDatabase::class.java, "book-database.db")
                .createFromAsset("book-database.db")
                .build()
    }

    abstract fun dao(): AtamaDao
}