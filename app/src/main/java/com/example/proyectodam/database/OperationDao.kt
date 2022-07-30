package com.example.proyectodam.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import com.example.proyectodam.model.Operation

@Dao
interface OperationDao {
    //Definen el comportameinto de acciones
    //Grabar
    @Insert
    fun insertar(operacion: Operation)
    //Editar
    @Update
    fun actualizar(operacion: Operation)

    //Eliminar
    @Delete
    fun eliminar(operacion: Operation)
}