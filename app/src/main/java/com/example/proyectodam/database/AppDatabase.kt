package com.example.proyectodam.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.proyectodam.model.*

@Database(entities = [User::class, Monedero::class, Tarjeta::class, Operation::class, TipoOperacion::class, TipoMonedero::class, TipoMoneda::class],version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    //Definir todos los Daos de mi apliacion
    abstract fun userDao() : UserDao
    abstract fun monederoDao() : MonederoDao
    abstract fun operationDao() : OperationDao
    abstract fun tarjetaDao() : TarjetaDao
    abstract fun tipoMonedaDao(): TipoMonedaDao
    abstract fun tipoMonederoDao(): TipoMonederoDao
    abstract fun tipoOperacionDao(): TipoOperacionDao

    companion object{
        //Crear una variable que haga referencia a la instancia de la bd
        private var instanciaBD: AppDatabase? = null

        //Crear la base
        fun ObtenerInstanciaBD(context: Context): AppDatabase{
            if (instanciaBD == null){
                //Crear la base de datos
                instanciaBD= Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    "DB_DAM"
                    //).allowMainThreadQueries().build()
                ).build()
            }
            return instanciaBD as AppDatabase
        }

    }
}