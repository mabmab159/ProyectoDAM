package com.example.proyectodam.model

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Operacion")
data class Operation(
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    val id: Int,

    @NonNull
    @ColumnInfo(name = "idUser")
    val idUser: Int,

    @NonNull
    @ColumnInfo(name = "idTipoOperacion")
    val idTipoOperacion: Int,

    @NonNull
    @ColumnInfo(name = "monto")
    val monto: String,

    @NonNull
    @ColumnInfo(name = "descripcion")
    val descripcion: String,

    @NonNull
    @ColumnInfo(name = "fecha")
    val fecha: String,
)