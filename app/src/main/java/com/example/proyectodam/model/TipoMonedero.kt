package com.example.proyectodam.model

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TipoMonedero")
data class TipoMonedero(

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    val id:Int,

    @NonNull
    @ColumnInfo(name = "tipo")
    val tipo:String,

)