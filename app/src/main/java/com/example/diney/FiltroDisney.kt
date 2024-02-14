package com.example.diney

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class FiltroDisney : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Atras
        val atras: ImageButton = findViewById(R.id.imageButton10)
        //Peliculas/Series
        setContentView(R.layout.activity_filtro_disney)
        val cars: CardView = findViewById(R.id.cars)
        val hocus: CardView = findViewById(R.id.hocus)
        val cruella: CardView = findViewById(R.id.cruella)
        val increibles: CardView = findViewById(R.id.increibles)
        val up: CardView = findViewById(R.id.up)
        val baymax: CardView = findViewById(R.id.baymax)
        val percy: CardView = findViewById(R.id.percy)
        //Menu
        val casa: ImageButton = findViewById(R.id.imageButton)
        val buscar: ImageButton = findViewById(R.id.imageButton2)
        val descargas: ImageButton = findViewById(R.id.imageButton3)
        val perfil: ImageButton = findViewById(R.id.imageButton4)

        atras.setOnClickListener {
            val intent = Intent(this@FiltroDisney, MenuPrincipal::class.java)
            startActivity(intent)
        }
//        cars.setOnClickListener{
//            val intent = Intent(this@FiltroDisney, Cars::class.java)
//            startActivity(intent)
//        }
//        hocus.setOnClickListener{
//            val intent = Intent(this@FiltroDisney, HocusPocus::class.java)
//            startActivity(intent)
//        }
//        cruella.setOnClickListener{
//            val intent = Intent(this@FiltroDisney, Cruella::class.java)
//            startActivity(intent)
//        }
//        increibles.setOnClickListener{
//            val intent = Intent(this@FiltroDisney, LosIncreibles::class.java)
//            startActivity(intent)
//        }
//        up.setOnClickListener{
//            val intent = Intent(this@FiltroDisney, Up::class.java)
//            startActivity(intent)
//        }
//        baymax.setOnClickListener{
//            val intent = Intent(this@FiltroDisney, Baymax::class.java)
//            startActivity(intent)
//        }
//        percy.setOnClickListener{
//            val intent = Intent(this@FiltroDisney, PercyJackson::class.java)
//            startActivity(intent)
//        }
//        casa.setOnClickListener{
//            val intent = Intent(this@FiltroDisney, FiltroStars::class.java)
//            startActivity(intent)
//        }
//        buscar.setOnClickListener{
//            val intent = Intent(this@FiltroDisney, Buscador::class.java)
//            startActivity(intent)
//        }
//        descargas.setOnClickListener{
//            val intent = Intent(this@FiltroDisney, Descargas::class.java)
//            startActivity(intent)
//        }
//        perfil.setOnClickListener{
//            val intent = Intent(this@FiltroDisney, Perfil::class.java)
//            startActivity(intent)
//        }
    }
}