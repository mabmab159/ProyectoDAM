package com.example.proyectodam.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import com.example.proyectodam.model.Tarjeta

@Dao
interface TarjetaDao {
    //Definen el comportameinto de acciones
    //Grabar
    @Insert
    fun insertar(tarjeta: Tarjeta)
    //Editar
    @Update
    fun actualizar(tarjeta: Tarjeta)

    //Eliminar
    @Delete
    fun eliminar(tarjeta: Tarjeta)
}