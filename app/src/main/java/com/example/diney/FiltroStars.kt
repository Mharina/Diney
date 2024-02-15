package com.example.diney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class FiltroStars : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filtro_stars)

        //Atras
        val atras: ImageButton = findViewById(R.id.imageButton15)
        //Peliculas/Series
        val kingsman: CardView = findViewById(R.id.kingsman)
        val asesino: CardView = findViewById(R.id.asesinos)
        val creator: CardView = findViewById(R.id.creator)
        //Menu
        val casa: ImageButton = findViewById(R.id.imageButton)
        val buscar: ImageButton = findViewById(R.id.imageButton2)
        val descargas: ImageButton = findViewById(R.id.imageButton3)
        val perfil: ImageButton = findViewById(R.id.imageButton4)

        atras.setOnClickListener {
            val intent = Intent(this@FiltroStars, MenuPrincipal::class.java)
            startActivity(intent)
        }
        kingsman.setOnClickListener{
            val intent = Intent(this@FiltroStars, Kingsman::class.java)
            startActivity(intent)
        }
        asesino.setOnClickListener{
            val intent = Intent(this@FiltroStars, SoloAsesinatos::class.java)
            startActivity(intent)
        }
        creator.setOnClickListener{
            val intent = Intent(this@FiltroStars, TheCreator::class.java)
            startActivity(intent)
        }
        casa.setOnClickListener{
            val intent = Intent(this@FiltroStars, FiltroStars::class.java)
            startActivity(intent)
        }
        buscar.setOnClickListener{
            val intent = Intent(this@FiltroStars, Buscador::class.java)
            startActivity(intent)
        }
        descargas.setOnClickListener{
            val intent = Intent(this@FiltroStars, Descargas::class.java)
            startActivity(intent)
        }
        perfil.setOnClickListener{
            val intent = Intent(this@FiltroStars, Perfil::class.java)
            startActivity(intent)
        }
    }
}