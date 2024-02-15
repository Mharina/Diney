package com.example.diney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.cardview.widget.CardView
import org.imaginativeworld.whynotimagecarousel.ImageCarousel


class MenuPrincipal : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)
        //Carrusel
        val carousel: ImageCarousel = findViewById(R.id.carrusel)
        //Menu
        val casa: ImageButton = findViewById(R.id.imageButton)
        val buscar: ImageButton = findViewById(R.id.imageButton2)
        val descargas: ImageButton = findViewById(R.id.imageButton3)
        val perfil: ImageButton = findViewById(R.id.imageButton4)
        //Filtros
        val disneyF: CardView = findViewById(R.id.apartadod)
        val pixar: CardView = findViewById(R.id.Pixar)
        val marvel: CardView = findViewById(R.id.Marvel)
        val national: CardView = findViewById(R.id.National)
        val star_wars: CardView = findViewById(R.id.StarWars)
        val stars: CardView = findViewById(R.id.Stars)
        //Peliculas/Series
        val strange: CardView = findViewById(R.id.strange)
        val creator: CardView = findViewById(R.id.creator)
        val cars: CardView = findViewById(R.id.cars)
        val hocus: CardView = findViewById(R.id.hocuspocus)
        val cruella: CardView = findViewById(R.id.cruella)
        val imperio: CardView = findViewById(R.id.imperio)
        val increibles: CardView = findViewById(R.id.increible)
        val up: CardView = findViewById(R.id.up_peli)
        val shield: CardView = findViewById(R.id.shield)
        val esperanza: CardView = findViewById(R.id.esperanza)
        val baymax: CardView = findViewById(R.id.baymax)
        val mandalorian: CardView = findViewById(R.id.mandalorian)
        val percy: CardView = findViewById(R.id.percy)
        val pompeya: CardView = findViewById(R.id.pompeya)
        val kingsman: CardView = findViewById(R.id.kings)
        val asesino: CardView = findViewById(R.id.asesino)
        list.add(CarouselItem("https://pbs.twimg.com/media/EHRv5d_UUAEMUEk.jpg", "Mandalorian"))
        list.add(CarouselItem("https://www.mundodeportivo.com/alfabeta/hero/2023/11/0x0.png?width=768&aspect_ratio=16:9&format=nowebp", "Marvel"))
        list.add(CarouselItem("https://lumiere-a.akamaihd.net/v1/images/introducing-dplus-social_10646ca8.jpeg", "inicio"))


        disneyF.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, FiltroWal::class.java)
            startActivity(intent)
        }
        pixar.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, FiltroPixar::class.java)
            startActivity(intent)
        }
        marvel.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, FiltroMarvel::class.java)
            startActivity(intent)
        }
        national.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, FiltroNationalGeographic::class.java)
            startActivity(intent)
        }
        star_wars.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, FiltroStarWars::class.java)
            startActivity(intent)
        }
        stars.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, FiltroStars::class.java)
            startActivity(intent)
        }
        strange.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, DoctorStrange::class.java)
            startActivity(intent)
        }
        creator.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, TheCreator::class.java)
            startActivity(intent)
        }
        cars.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Cars::class.java)
            startActivity(intent)
        }
        hocus.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, HocusPocus::class.java)
            startActivity(intent)
        }
        cruella.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Cruella::class.java)
            startActivity(intent)
        }
        imperio.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, ImperioContrataca::class.java)
            startActivity(intent)
        }
        increibles.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, LosIncreibles::class.java)
            startActivity(intent)
        }
        up.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Up::class.java)
            startActivity(intent)
        }
        shield.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Shield::class.java)
            startActivity(intent)
        }
        esperanza.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, NuevaEsperanza::class.java)
            startActivity(intent)
        }
        baymax.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Baymax::class.java)
            startActivity(intent)
        }
        mandalorian.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Mandalorian::class.java)
            startActivity(intent)
        }
        percy.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, PercyJackson::class.java)
            startActivity(intent)
        }
        pompeya.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Pompeya::class.java)
            startActivity(intent)
        }
        kingsman.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Kingsman::class.java)
            startActivity(intent)
        }
        asesino.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, SoloAsesinatos::class.java)
            startActivity(intent)
        }
        casa.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, FiltroStars::class.java)
            startActivity(intent)
        }
        buscar.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Buscador::class.java)
            startActivity(intent)
        }
        descargas.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Descargas::class.java)
            startActivity(intent)
        }
        perfil.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Perfil::class.java)
            startActivity(intent)
        }

//        carousel.onItemClickListener = object : OnItemClickListener {
//            override fun onClick(position: Int, carouselItem: CarouselItem) {
//                TODO("Not yet implemented")
//                Toast.makeText(this@MenuPrincipal, "Mandalorian: ${carouselItem.caption}", Toast.LENGTH_SHORT).show()
//            }
//
//            override fun onLongClick(position: Int, dataObject: CarouselItem) {
//                TODO("Not yet implemented")
//            }
//        }
//        carousel.addData(list)
    }
}