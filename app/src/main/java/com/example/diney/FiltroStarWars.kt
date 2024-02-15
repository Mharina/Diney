package com.example.diney

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class FiltroStarWars : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filtro_star_wars)
        //Atras
        val atras: ImageButton = findViewById(R.id.imageButton14)
        //Peliculas/Series
        val mandalorian: CardView = findViewById(R.id.mandalorian_W)
        val esperanza: CardView = findViewById(R.id.esperanza_SW)
        val imperio: CardView = findViewById(R.id.imperio_SW)
        //Menu
        val casa: ImageButton = findViewById(R.id.imageButton)
        val buscar: ImageButton = findViewById(R.id.imageButton2)
        val descargas: ImageButton = findViewById(R.id.imageButton3)
        val perfil: ImageButton = findViewById(R.id.imageButton4)

        atras.setOnClickListener {
            val intent = Intent(this@FiltroStarWars, MenuPrincipal::class.java)
            startActivity(intent)
        }
        imperio.setOnClickListener{
            val intent = Intent(this@FiltroStarWars, ImperioContrataca::class.java)
            startActivity(intent)
        }
        esperanza.setOnClickListener{
            val intent = Intent(this@FiltroStarWars, NuevaEsperanza::class.java)
            startActivity(intent)
        }
        mandalorian.setOnClickListener{
            val intent = Intent(this@FiltroStarWars, Mandalorian::class.java)
            startActivity(intent)
        }
        casa.setOnClickListener{
            val intent = Intent(this@FiltroStarWars, FiltroStars::class.java)
            startActivity(intent)
        }
        buscar.setOnClickListener{
            val intent = Intent(this@FiltroStarWars, Buscador::class.java)
            startActivity(intent)
        }
        descargas.setOnClickListener{
            val intent = Intent(this@FiltroStarWars, Descargas::class.java)
            startActivity(intent)
        }
        perfil.setOnClickListener{
            val intent = Intent(this@FiltroStarWars, Perfil::class.java)
            startActivity(intent)
        }
    }
}