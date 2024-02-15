package com.example.diney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class FiltroWal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filtro_wal)

        //Atras
        val atras: ImageButton = findViewById(R.id.imageButton10)
        //Peliculas/Series
        val cruella: CardView = findViewById(R.id.cruella_D)
        val baymax: CardView = findViewById(R.id.baymax_D)
        val up: CardView = findViewById(R.id.Up_D)
        val losIncreibles: CardView = findViewById(R.id.increible_D)
        val hocus: CardView = findViewById(R.id.hocus_D)
        val percy: CardView = findViewById(R.id.percy_D)
        val cars: CardView = findViewById(R.id.cars_D)
        //Menu
        val casa: ImageButton = findViewById(R.id.imageButton)
        val buscar: ImageButton = findViewById(R.id.imageButton2)
        val descargas: ImageButton = findViewById(R.id.imageButton3)
        val perfil: ImageButton = findViewById(R.id.imageButton4)

        atras.setOnClickListener {
            val intent = Intent(this@FiltroWal, MenuPrincipal::class.java)
            startActivity(intent)
        }
        cars.setOnClickListener{
            val intent = Intent(this@FiltroWal, Cars::class.java)
            startActivity(intent)
        }
        hocus.setOnClickListener{
            val intent = Intent(this@FiltroWal, HocusPocus::class.java)
            startActivity(intent)
        }
        cruella.setOnClickListener{
            val intent = Intent(this@FiltroWal, Cruella::class.java)
            startActivity(intent)
        }
        losIncreibles.setOnClickListener{
            val intent = Intent(this@FiltroWal, LosIncreibles::class.java)
            startActivity(intent)
        }
        up.setOnClickListener{
            val intent = Intent(this@FiltroWal, Up::class.java)
            startActivity(intent)
        }
        percy.setOnClickListener{
            val intent = Intent(this@FiltroWal, PercyJackson::class.java)
            startActivity(intent)
        }
        baymax.setOnClickListener{
            val intent = Intent(this@FiltroWal, Baymax::class.java)
            startActivity(intent)
        }
        casa.setOnClickListener{
            val intent = Intent(this@FiltroWal, MenuPrincipal::class.java)
            startActivity(intent)
        }
        buscar.setOnClickListener{
            val intent = Intent(this@FiltroWal, Buscador::class.java)
            startActivity(intent)
        }
        descargas.setOnClickListener{
            val intent = Intent(this@FiltroWal, Descargas::class.java)
            startActivity(intent)
        }
        perfil.setOnClickListener{
            val intent = Intent(this@FiltroWal, Perfil::class.java)
            startActivity(intent)
        }

    }
}