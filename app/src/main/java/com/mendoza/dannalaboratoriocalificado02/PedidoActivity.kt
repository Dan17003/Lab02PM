package com.mendoza.dannalaboratoriocalificado02

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mendoza.dannalaboratoriocalificado02.databinding.ActivityPedidoBinding

class PedidoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPedidoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtener datos del intent
        val nombre = intent.getStringExtra("nombre")
        val numero = intent.getStringExtra("numero")
        val productos = intent.getStringExtra("productos")
        val direccion = intent.getStringExtra("direccion")

        // Mostrar datos
        binding.tvNombre.text = "Cliente: $nombre"
        binding.tvNumero.text = "Número: $numero"
        binding.tvProductos.text = "Productos: $productos"
        binding.tvUbicacion.text = "Dirección: $direccion"

        // Botón Llamar
        binding.btnLlamar.setOnClickListener {
            Toast.makeText(this, "Llamando al cliente $nombre al número $numero", Toast.LENGTH_LONG).show()
        }

        // Botón WhatsApp
        binding.btnWsp.setOnClickListener {
            val mensaje = "Hola $nombre, tus productos: $productos están en camino a la dirección: $direccion"
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
        }

        // Botón Maps
        binding.btnMaps.setOnClickListener {
            Toast.makeText(this, "Abriendo Maps para la dirección: $direccion", Toast.LENGTH_LONG).show()
        }
    }
}
