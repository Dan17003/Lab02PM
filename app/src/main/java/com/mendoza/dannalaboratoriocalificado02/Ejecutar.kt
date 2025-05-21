package com.mendoza.dannalaboratoriocalificado02

fun main() {
    val agenda = Agenda()
    var opcion: Int

    do {
        println("=== AGENDA DE CONTACTOS ===")
        println("1. Agregar contacto")
        println("2. Listar contactos")
        println("3. Buscar contacto por nombre")
        println("4. Salir")
        print("Seleccione una opcion: ")

        opcion = readLine()?.toIntOrNull() ?: 0
        println()

        when (opcion) {
            1 -> {
                print("Ingrese nombre: ")
                val nombre = readLine() ?: ""
                print("Ingrese telefono: ")
                val telefono = readLine() ?: ""
                print("Ingrese correo: ")
                val correo = readLine() ?: ""

                agenda.agregarContacto(Contacto(nombre, telefono, correo))
            }

            2 -> agenda.listarContactos()

            3 -> {
                print("Ingrese el nombre a buscar: ")
                val nombreBusqueda = readLine() ?: ""
                agenda.buscarPorNombre(nombreBusqueda)
            }

            4 -> println("Saliendo de la agenda")

            else -> println("Opcion inválida. Intente nuevamente.\n")
        }

    } while (opcion != 4)
}

