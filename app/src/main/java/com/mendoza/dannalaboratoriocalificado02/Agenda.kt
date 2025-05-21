package com.mendoza.dannalaboratoriocalificado02


class Agenda {
    private val contactos = mutableListOf<Contacto>()

    fun agregarContacto(contacto: Contacto) {
        contactos.add(contacto)
        println("Contacto agregado correctamente.\n")
    }

    fun listarContactos() {
        if (contactos.isEmpty()) {
            println("No hay contactos registrados.\n")
        } else {
            println("Lista de Contactos:")
            contactos.forEachIndexed { index, contacto ->
                println("${index + 1}. Nombre: ${contacto.nombre}, Telefono: ${contacto.telefono}, Correo: ${contacto.correo}")
            }
            println()
        }
    }

    fun buscarPorNombre(nombre: String) {
        val resultados = contactos.filter { it.nombre.contains(nombre, ignoreCase = true) }
        if (resultados.isEmpty()) {
            println("No se encontraron contactos con el nombre \"$nombre\".\n")
        } else {
            println("Contactos encontrados:")
            resultados.forEach {
                println("Nombre: ${it.nombre}, Telefono: ${it.telefono}, Correo: ${it.correo}")
            }
            println()
        }
    }
}
