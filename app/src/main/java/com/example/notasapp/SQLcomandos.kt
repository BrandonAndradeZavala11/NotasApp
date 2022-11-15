package com.example.notasapp

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import kotlin.Exception

class SQLcomandos(context: Context):SQLiteOpenHelper(context, "notas.db",null,1) {

    override fun onCreate(p0: SQLiteDatabase?) {
        p0!!.execSQL("CREATE TABLE notas (Nombre VARCHAR(50) PRIMARY KEY, Descripcion VARCHAR(120), Foto BLOB )")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

    fun addNota(context: Context, datos:Notas): Boolean{
        var response = true
        var contentvalues = ContentValues()
        contentvalues.put("nombre",datos.nombre)
        contentvalues.put("descripcion",datos.descripcion)
        contentvalues.put("fecha", datos.fecha)
        var db = SQLcomandos(context)
        var comandos = db.writableDatabase
        try {
            comandos.insert("notas",null,contentvalues)
        }
        catch(e: Exception) {
            print(e.message)
            response = false
        }
        finally {
            db.close()
        }

        return response
    }
}