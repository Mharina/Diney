package com.example.diney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class FiltroNationalGeographic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filtro_national_geographic)
        //Atras
        val atras: ImageButton = findViewById(R.id.imageButton11)
        //Peliculas/Series
        val pomp: CardView = findViewById(R.id.pompeya)
        //Menu
        val casa: ImageButton = findViewById(R.id.imageButton)
        val buscar: ImageButton = findViewById(R.id.imageButton2)
        val descargas: ImageButton = findViewById(R.id.imageButton3)
        val perfil: ImageButton = findViewById(R.id.imageButton4)


        atras.setOnClickListener {
            val intent = Intent(this@FiltroNationalGeographic, MenuPrincipal::class.java)
            startActivity(intent)
        }
        pomp.setOnClickListener{
            val intent = Intent(this@FiltroNationalGeographic, Pompeya::class.java)
            startActivity(intent)
        }
        casa.setOnClickListener{
            val intent = Intent(this@FiltroNationalGeographic, MenuPrincipal::class.java)
            startActivity(intent)
        }
        buscar.setOnClickListener{
            val intent = Intent(this@FiltroNationalGeographic, Buscador::class.java)
            startActivity(intent)
        }
        descargas.setOnClickListener{
            val intent = Intent(this@FiltroNationalGeographic, Descargas::class.java)
            startActivity(intent)
        }
        perfil.setOnClickListener{
            val intent = Intent(this@FiltroNationalGeographic, Perfil::class.java)
            startActivity(intent)
        }
    }
}