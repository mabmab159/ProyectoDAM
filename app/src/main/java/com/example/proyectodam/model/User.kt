package com.example.proyectodam.model
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "user")
data class User (
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    val id: Int,

    @NonNull
    @ColumnInfo(name = "dni")
    val dni: String,

    @NonNull
    @ColumnInfo(name = "nombres")
    val nombres: String,

    @NonNull
    @ColumnInfo(name = "apellidos")
    val apellidos: String,

    @NonNull
    @ColumnInfo(name = "correo")
    val correo: String,

    @NonNull
    @ColumnInfo(name = "telefono")
    val telefono: String,

    @NonNull
    @ColumnInfo(name = "edad")
    val edad: Int,

    @NonNull
    @ColumnInfo(name = "pais")
    val pais: String,

    @NonNull
    @ColumnInfo(name = "ciudad")
    val ciudad: String,

    @NonNull
    @ColumnInfo(name = "password")
    val password: String,


) : Serializable