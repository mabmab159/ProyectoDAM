package com.example.proyectodam.model

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TipoMoneda")
data class TipoMoneda (
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    val id:Int,

    @NonNull
    @ColumnInfo(name = "moneda")
    val moneda:String,
)