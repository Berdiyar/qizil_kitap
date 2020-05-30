package com.example.red_book.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "book")
data class Atama {

    @PrimaryKey val id: Int,
    @ColumnInfo(name="type")
    val type: Int,

    @ColumnInfo(name="nameUzb")
    val nameUzb: String,

    @ColumnInfo(name="nameRus")
    val nameRus: String,

    @ColumnInfo(name="nameEng")
    val nameEng: String,

    @ColumnInfo(name="status")
    val status: String,

    @ColumnInfo(name="propagation")
    val propagation: String,

    @ColumnInfo(name="habibat")
    val habibat: String,

    @ColumnInfo(name="quantify")
    val quantify: String,

    @ColumnInfo(name="lifestyle")
    val lifestyle: String,

    @ColumnInfo(name="limitingFactors")
    val limitingFactors: String,

    @ColumnInfo(name="breeding")
    val breeding: String,

    @ColumnInfo(name="security")
    val security: String,


}