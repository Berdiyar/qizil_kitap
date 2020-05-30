package com.example.red_book.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.red_book.data.model.Atama

@Dao
interface AtamaDao {

    @Query("SELECT * FROM book")
    fun getAllAtama() : List<Atama>



}