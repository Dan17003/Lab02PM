package com.mendoza.dannalaboratoriocalificado02


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mendoza.dannalaboratoriocalificado02.databinding.ActivityEjercicio01Binding

class Ejercicio01Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio01Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMostrar.setOnClickListener {
            binding.cuadroVerde.visibility = android.view.View.VISIBLE
        }

        binding.btnOcultar.setOnClickListener {
            binding.cuadroVerde.visibility = android.view.View.INVISIBLE
        }
    }
}
