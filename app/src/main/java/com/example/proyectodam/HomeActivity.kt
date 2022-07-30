package com.example.proyectodam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.proyectodam.databinding.ActivityHomeBinding
import com.example.proyectodam.databinding.ActivityPerfilBinding
import com.example.proyectodam.model.User

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bundleReception = intent.extras
        val user = bundleReception!!.getSerializable("user") as User
        val bundle = Bundle().apply {
            putSerializable("user", user)
        }
        var intent: Intent
        binding.btnPerfil.setOnClickListener{
            intent = Intent(this, PerfilActivity::class.java).apply {
                putExtras(bundle)
            }
            startActivity(intent)
        }
        binding.btnResumen.setOnClickListener{
            intent = Intent(this, ResumenActivity::class.java).apply {
                putExtras(bundle)
            }
            startActivity(intent)
        }
        binding.btnOperaciones.setOnClickListener{
            intent = Intent(this, ResumenActivity::class.java).apply {
                putExtras(bundle)
            }
            startActivity(intent)
        }
        binding.btnMonederos.setOnClickListener{
            intent = Intent(this, ResumenActivity::class.java).apply {
                putExtras(bundle)
            }
            startActivity(intent)
        }
        binding.btnImportar.setOnClickListener{
            intent = Intent(this, ResumenActivity::class.java).apply {
                putExtras(bundle)
            }
            startActivity(intent)
        }
        binding.btnLogout.setOnClickListener{
            finish()
        }
    }
}