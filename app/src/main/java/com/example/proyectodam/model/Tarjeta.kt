package com.example.proyectodam.model

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Tarjeta")
data class Tarjeta(

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    val id:Int,

    @NonNull
    @ColumnInfo(name = "entidadFinanciera")
    val entidadFinanciera:String,

    @NonNull
    @ColumnInfo(name = "numeroTarjeta")
    val numeroTarjeta:String,

)