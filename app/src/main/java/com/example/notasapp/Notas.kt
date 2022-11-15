package com.example.notasapp

import java.text.DateFormat
import java.time.LocalDate

class Notas {
    var nombre: String = ""
    var descripcion: String = ""
    var fecha: String = ""

    constructor(nombre: String, descripcion: String, fecha: String) {
        this.nombre = nombre
        this.descripcion = descripcion
        this.fecha = fecha
    }
}