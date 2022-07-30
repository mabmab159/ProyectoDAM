package com.example.proyectodam.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import com.example.proyectodam.model.TipoOperacion

@Dao
interface TipoOperacionDao {
    //Definen el comportameinto de acciones
    //Grabar
    @Insert
    fun insertar(tipoOperacion: TipoOperacion)
    //Editar
    @Update
    fun actualizar(tipoOperacion: TipoOperacion)

    //Eliminar
    @Delete
    fun eliminar(tipoOperacion: TipoOperacion)
}