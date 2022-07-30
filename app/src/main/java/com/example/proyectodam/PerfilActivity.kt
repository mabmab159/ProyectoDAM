package com.example.proyectodam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectodam.databinding.ActivityPerfilBinding
import com.example.proyectodam.model.User

class PerfilActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPerfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPerfilBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bundleReception = intent.extras
        val user = bundleReception!!.getSerializable("user") as User

        binding.tvDNI.text = user.dni
        binding.tvNombres.text = user.nombres
        binding.tvApellidos.text = user.apellidos
        binding.tvCorreo.text = user.correo
        binding.tvTelefono.text = user.telefono
        binding.tvEdad.text = user.edad.toString()
        binding.tvPais.text = user.pais
    }
}