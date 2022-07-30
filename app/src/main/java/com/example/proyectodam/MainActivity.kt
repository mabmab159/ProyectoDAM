package com.example.proyectodam

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.proyectodam.database.AppDatabase
import com.example.proyectodam.databinding.ActivityMainBinding
import com.example.proyectodam.model.TipoMoneda
import com.example.proyectodam.model.TipoMonedero
import com.example.proyectodam.model.TipoOperacion
import com.example.proyectodam.model.User
import java.util.concurrent.Executors
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var appDatabase: AppDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        appDatabase = AppDatabase.ObtenerInstanciaBD(this)
        datosIniciales()
        binding.btnLogin.setOnClickListener {
            val dni = binding.edtCorreo.text.toString()
            val password = binding.edtPassword.text.toString()

            if (dni.isEmpty()) {
                binding.edtCorreo.error = "Ingrese campo"
                return@setOnClickListener
            }
            if (password.isEmpty()) {
                binding.edtPassword.error = "Ingrese campo"
                return@setOnClickListener
            }
            try {
                loginUser(dni, password)
            } catch (e: Exception) {
                Toast.makeText(this, "$e", Toast.LENGTH_SHORT).show()
            }
        }
        binding.btnRecovery.setOnClickListener {
            val intent = Intent(this, RegistroUserActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        finish()
    }

    private fun loginUser(dni: String, password: String) {
        appDatabase.userDao().obtenerCredenciales(dni, password).observe(this) {
            Toast.makeText(this, "Usuario Logeado", Toast.LENGTH_SHORT).show()
            val bundle = Bundle()
            bundle.putSerializable("user", it)
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }


    }



    private fun datosIniciales() {
        val prefs = getSharedPreferences("preferencias", Context.MODE_PRIVATE)
        val firsTime = prefs.getBoolean("firsTime", true)
        if (firsTime) {
            Executors.newSingleThreadExecutor().execute {
                //Cargando tipos de monedas
                appDatabase.tipoMonedaDao().insertar(TipoMoneda(1, "Soles"))
                appDatabase.tipoMonedaDao().insertar(TipoMoneda(2, "Dolar estadounidense"))
                appDatabase.tipoMonedaDao().insertar(TipoMoneda(3, "Euro"))

                //Cargando tipos de operaciones
                appDatabase.tipoOperacionDao().insertar(TipoOperacion(1, "Deposito"))
                appDatabase.tipoOperacionDao().insertar(TipoOperacion(2, "Retiro"))
                appDatabase.tipoOperacionDao().insertar(TipoOperacion(3, "Yape"))
                appDatabase.tipoOperacionDao().insertar(TipoOperacion(4, "Compra Online"))

                // Cargando tipos de monederos
                appDatabase.tipoMonederoDao().insertar(TipoMonedero(1, "Efectivo"))
                appDatabase.tipoMonederoDao().insertar(TipoMonedero(2, "Tarjeta"))

                //Creando usuario de prueba
                appDatabase.userDao().insertar(
                    User(
                        1,
                        "75355476",
                        "Luis Jhonayquer",
                        "Zapata Yamo",
                        "jhona@gmail.com",
                        "974644986",
                        22,
                        "Peru",
                        "Lima",
                        "1234"
                    )
                )
            }
            val ediPrefs = prefs.edit()
            ediPrefs.putBoolean("firsTime", false)
            ediPrefs.commit()
        }
    }
}