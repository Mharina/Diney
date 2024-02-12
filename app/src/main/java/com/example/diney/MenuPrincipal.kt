package com.example.diney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ImageButton
import androidx.cardview.widget.CardView
import org.imaginativeworld.whynotimagecarousel.ImageCarousel


class MenuPrincipal : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)
        //Menu
        val casa: ImageButton = findViewById(R.id.imageButton)
        val buscar: ImageButton = findViewById(R.id.imageButton2)
        val descargas: ImageButton = findViewById(R.id.imageButton3)
        val perfil: ImageButton = findViewById(R.id.imageButton4)
        //Filtros
        val disney: CardView = findViewById(R.id.Disney)
        val pixar: CardView = findViewById(R.id.Pixar)
        val marvel: CardView = findViewById(R.id.Marvel)
        val national: CardView = findViewById(R.id.National)
        val star_wars: CardView = findViewById(R.id.StarWars)
        val stars: CardView = findViewById(R.id.Stars)
        val carousel: ImageCarousel = findViewById(R.id.carrusel)
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


        disney.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, FiltroDisney::class.java)
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

        }
        creator.setOnClickListener{

        }
        cars.setOnClickListener{

        }
        hocus.setOnClickListener{

        }
        cruella.setOnClickListener{

        }
        imperio.setOnClickListener{

        }
        increibles.setOnClickListener{

        }
        up.setOnClickListener{

        }
        shield.setOnClickListener{

        }
        esperanza.setOnClickListener{

        }
        baymax.setOnClickListener{

        }
        mandalorian.setOnClickListener{

        }
        percy.setOnClickListener{

        }
        pompeya.setOnClickListener{

        }
        kingsman.setOnClickListener{

        }
        asesino.setOnClickListener{

        }
        casa.setOnClickListener{

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