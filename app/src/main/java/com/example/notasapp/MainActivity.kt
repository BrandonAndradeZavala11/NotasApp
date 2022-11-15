package com.example.notasapp

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /* los siguientes son botones que hacen que la imagen
        * se utilizen de forma que sean botones y con ellos
        * podamos movernos entre ventanas diferentes*/


        val button = findViewById<ImageView>(R.id.agregar)
        button.setOnClickListener {

            val intent = Intent(this, agregarNotas:: class.java)
            startActivity(intent)
        }

        val button2 = findViewById<ImageView>(R.id.editar)
        button2.setOnClickListener {

            val intent = Intent(this, editarNotas:: class.java)
            startActivity(intent)
        }

        val button3 = findViewById<ImageView>(R.id.borrar)
        button3.setOnClickListener {

            val intent = Intent(this, eliminarNotas:: class.java)
            startActivity(intent)
        }
    }
}