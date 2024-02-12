package com.example.diney

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Descargas : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descargas)
        //Menu
        val casa: ImageButton = findViewById(R.id.imageButton)
        val buscar: ImageButton = findViewById(R.id.imageButton2)
        val descargas: ImageButton = findViewById(R.id.imageButton3)
        val perfil: ImageButton = findViewById(R.id.imageButton4)

        casa.setOnClickListener{
            val intent = Intent(this@Descargas, MenuPrincipal::class.java)
            startActivity(intent)
        }
        buscar.setOnClickListener{
            val intent = Intent(this@Descargas, Buscador::class.java)
            startActivity(intent)
        }
        descargas.setOnClickListener{

        }
        perfil.setOnClickListener{
            val intent = Intent(this@Descargas, Perfil::class.java)
            startActivity(intent)
        }

    }
}