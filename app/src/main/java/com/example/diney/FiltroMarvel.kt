package com.example.diney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class FiltroMarvel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filtro_marvel)
        //Atras
        val atras: ImageButton = findViewById(R.id.imageButton12)
        //Peliculas/Series
        val strange: CardView = findViewById(R.id.strange)
        val shield: CardView = findViewById(R.id.shield)
        //Menu
        val casa: ImageButton = findViewById(R.id.imageButton)
        val buscar: ImageButton = findViewById(R.id.imageButton2)
        val descargas: ImageButton = findViewById(R.id.imageButton3)
        val perfil: ImageButton = findViewById(R.id.imageButton4)


        atras.setOnClickListener {
            val intent = Intent(this@FiltroMarvel, MenuPrincipal::class.java)
            startActivity(intent)
        }
        strange.setOnClickListener{
            val intent = Intent(this@FiltroMarvel, DoctorStrange::class.java)
            startActivity(intent)
        }
        shield.setOnClickListener{
            val intent = Intent(this@FiltroMarvel, Shield::class.java)
            startActivity(intent)
        }
        casa.setOnClickListener{
            val intent = Intent(this@FiltroMarvel, MenuPrincipal::class.java)
            startActivity(intent)
        }
        buscar.setOnClickListener{
            val intent = Intent(this@FiltroMarvel, Buscador::class.java)
            startActivity(intent)
        }
        descargas.setOnClickListener{
            val intent = Intent(this@FiltroMarvel, Descargas::class.java)
            startActivity(intent)
        }
        perfil.setOnClickListener{
            val intent = Intent(this@FiltroMarvel, Perfil::class.java)
            startActivity(intent)
        }
    }
}