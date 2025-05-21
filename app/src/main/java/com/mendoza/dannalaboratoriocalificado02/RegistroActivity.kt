package com.mendoza.dannalaboratoriocalificado02

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mendoza.dannalaboratoriocalificado02.databinding.ActivityRegistroBinding

class RegistroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegistrar.setOnClickListener {
            val nombre = binding.etNombre.text.toString()
            val numero = binding.etNumero.text.toString()
            val productos = binding.etProductos.text.toString()
            val ciudad = binding.etCiudad.text.toString()
            val direccion = binding.etDireccion.text.toString()

            if (nombre.isBlank() || numero.isBlank() || productos.isBlank() || ciudad.isBlank() || direccion.isBlank()) {
                Toast.makeText(this, "Complete todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, PedidoActivity::class.java).apply {
                    putExtra("nombre", nombre)
                    putExtra("numero", numero)
                    putExtra("productos", productos)
                    putExtra("ubicacion", "$ciudad, $direccion")
                }
                startActivity(intent)
            }
        }
    }
}
