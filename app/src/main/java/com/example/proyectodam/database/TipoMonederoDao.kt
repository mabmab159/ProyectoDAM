package com.example.proyectodam.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import com.example.proyectodam.model.TipoMonedero

@Dao
interface TipoMonederoDao {
    //Definen el comportameinto de acciones
    //Grabar
    @Insert
    fun insertar(tipoMonedero: TipoMonedero)
    //Editar
    @Update
    fun actualizar(tipoMonedero: TipoMonedero)

    //Eliminar
    @Delete
    fun eliminar(tipoMonedero: TipoMonedero)
}