package com.example.proyectodam.model

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "Monedero",
    foreignKeys = [
        ForeignKey(entity = User::class, parentColumns = ["id"], childColumns = ["idUser"]),
        ForeignKey(entity = TipoMoneda::class, parentColumns = ["id"], childColumns = ["idTipoMoneda"]),
        ForeignKey(entity = TipoMonedero::class, parentColumns = ["id"], childColumns = ["idTipoMonedero"]),
        ForeignKey(entity = Tarjeta::class, parentColumns = ["id"], childColumns = ["idTarjeta"])
    ]
)
data class Monedero(
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    val id: Int,

    @NonNull
    @ColumnInfo(name = "idUser")
    val idUser: Int,

    @NonNull
    @ColumnInfo(name = "nombreMonedero")
    val nombreMonedero: String,

    @NonNull
    @ColumnInfo(name = "idTipoMoneda")
    val idTipoMoneda: Int,

    @NonNull
    @ColumnInfo(name = "idTipoMonedero")
    val idTipoMonedero: Int,

    @NonNull
    @ColumnInfo(name = "saldo")
    val saldo: Int,

    @ColumnInfo(name = "idTarjeta")
    val idTarjeta: Int,
    )