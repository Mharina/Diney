package com.example.diney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class FiltroPixar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filtro_pixar)

        //Atras
        val atras: ImageButton = findViewById(R.id.imageButton13)
        //Peliculas/Series
        val cars: CardView = findViewById(R.id.vars)
        val increibles: CardView = findViewById(R.id.increibles_D)
        val up: CardView = findViewById(R.id.up_D)
        //Menu
        val casa: ImageButton = findViewById(R.id.imageButton)
        val buscar: ImageButton = findViewById(R.id.imageButton2)
        val descargas: ImageButton = findViewById(R.id.imageButton3)
        val perfil: ImageButton = findViewById(R.id.imageButton4)

        atras.setOnClickListener {
            val intent = Intent(this@FiltroPixar, MenuPrincipal::class.java)
            startActivity(intent)
        }
        cars.setOnClickListener{
            val intent = Intent(this@FiltroPixar, Cars::class.java)
            startActivity(intent)
        }
        increibles.setOnClickListener{
            val intent = Intent(this@FiltroPixar, LosIncreibles::class.java)
            startActivity(intent)
        }
        up.setOnClickListener{
            val intent = Intent(this@FiltroPixar, Up::class.java)
            startActivity(intent)
        }
        casa.setOnClickListener{
            val intent = Intent(this@FiltroPixar, FiltroStars::class.java)
            startActivity(intent)
        }
        buscar.setOnClickListener{
            val intent = Intent(this@FiltroPixar, Buscador::class.java)
            startActivity(intent)
        }
        descargas.setOnClickListener{
            val intent = Intent(this@FiltroPixar, Descargas::class.java)
            startActivity(intent)
        }
        perfil.setOnClickListener{
            val intent = Intent(this@FiltroPixar, Perfil::class.java)
            startActivity(intent)
        }
    }
}