package com.example.proyectodam.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import com.example.proyectodam.model.Monedero

@Dao
interface MonederoDao {
    //Definen el comportameinto de acciones
    //Grabar
    @Insert
    fun insertar(monedero: Monedero)
    //Editar
    @Update
    fun actualizar(monedero: Monedero)

    //Eliminar
    @Delete
    fun eliminar(monedero: Monedero)
}