package com.example.proyectodam.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import com.example.proyectodam.model.TipoMoneda

@Dao
interface TipoMonedaDao {
    //Definen el comportameinto de acciones
    //Grabar
    @Insert
    fun insertar(tipoMoneda: TipoMoneda)
    //Editar
    @Update
    fun actualizar(tipoMoneda: TipoMoneda)

    //Eliminar
    @Delete
    fun eliminar(tipoMoneda: TipoMoneda)
}