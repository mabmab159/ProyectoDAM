package com.example.proyectodam.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.proyectodam.model.User

@Dao
interface UserDao {
    //Definen el comportameinto de acciones
    //Grabar
    @Insert
    fun insertar(user:User)
    //Editar
    @Update
    fun actualizar(user:User)

    //Eliminar
    @Delete
    fun eliminar(user:User)

    //Consultar todas las users
    @Query("select *from user")
    fun obtenerUsers() : LiveData<List<User>>

    //Consultar user por codigo
    @Query("select * from user where dni=:dni")
    fun obtenerUsersPorCodigo(dni:String) : User

    //Consultar credenciales
    @Query("select * from user where user.dni=:dni and user.password=:password")
    fun obtenerCredenciales(dni:String, password:String): LiveData<User>
}