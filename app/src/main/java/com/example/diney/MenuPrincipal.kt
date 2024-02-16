package com.example.diney

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.HorizontalScrollView
import android.widget.ImageButton
import android.widget.ScrollView
import android.widget.TextView
import androidx.cardview.widget.CardView
import org.imaginativeworld.whynotimagecarousel.ImageCarousel


class MenuPrincipal : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)
        //Carrusel
        val carousel: ImageCarousel = findViewById(R.id.carrusel)
        //Menu
        val casa: ImageButton = findViewById(R.id.casa)
        val perfil: ImageButton = findViewById(R.id.perfil)
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
        //ScrollDisney
        val scD: HorizontalScrollView = findViewById(R.id.S_D)
        //Scrollpixar
        val scP: HorizontalScrollView = findViewById(R.id.S_P)
        //ScrollMarvel
        val scM: HorizontalScrollView = findViewById(R.id.S_M)
        //ScrollNational
        val scN: HorizontalScrollView = findViewById(R.id.S_N)
        //ScrollStarWars
        val scSW: HorizontalScrollView = findViewById(R.id.star_wars)
        //ScrollStar
        val scS: HorizontalScrollView = findViewById(R.id.S_S)
        //Texto
        val tP: TextView = findViewById(R.id.textView19)
        val tT: TextView = findViewById(R.id.textView12)
        val tQ: TextView = findViewById(R.id.textView11)
        val tN: TextView = findViewById(R.id.textView10)
        val tR: TextView = findViewById(R.id.textView9)
        //ScrollView de las peliculas
        val sc1: HorizontalScrollView = findViewById(R.id.S1)
        val sc2: HorizontalScrollView = findViewById(R.id.S2)
        val sc3: HorizontalScrollView = findViewById(R.id.S3)
        val sc4: HorizontalScrollView = findViewById(R.id.S4)
        list.add(CarouselItem("https://pbs.twimg.com/media/EHRv5d_UUAEMUEk.jpg", "Mandalorian"))
        list.add(CarouselItem("https://www.mundodeportivo.com/alfabeta/hero/2023/11/0x0.png?width=768&aspect_ratio=16:9&format=nowebp", "Marvel"))
        list.add(CarouselItem("https://lumiere-a.akamaihd.net/v1/images/introducing-dplus-social_10646ca8.jpeg", "inicio"))
        val usuario = intent.getStringExtra("usuario")
        val passw = intent.getStringExtra("password")
        val mail = intent.getStringExtra("email")
        val foto = intent.getStringExtra("imagen_id")


        disneyF.setOnClickListener{
            scD.visibility = View.VISIBLE
            scP.visibility = View.GONE
            scM.visibility = View.GONE
            scN.visibility = View.GONE
            scSW.visibility = View.GONE
            scS.visibility = View.GONE
            tQ.visibility = View.GONE
            tT.visibility = View.GONE
            tN.visibility = View.GONE
            tR.visibility = View.GONE
            sc1.visibility = View.GONE
            sc2.visibility = View.GONE
            sc3.visibility = View.GONE
            sc4.visibility = View.GONE
            tP.text = "Diney"
        }
        pixar.setOnClickListener{
            scD.visibility = View.GONE
            scP.visibility = View.VISIBLE
            scM.visibility = View.GONE
            scN.visibility = View.GONE
            scSW.visibility = View.GONE
            scS.visibility = View.GONE
            sc1.visibility = View.GONE
            sc2.visibility = View.GONE
            sc3.visibility = View.GONE
            sc4.visibility = View.GONE
            tP.text = "Pixar"
        }
        marvel.setOnClickListener{
            scD.visibility = View.GONE
            scP.visibility = View.GONE
            scM.visibility = View.VISIBLE
            scN.visibility = View.GONE
            scSW.visibility = View.GONE
            scS.visibility = View.GONE
            sc1.visibility = View.GONE
            sc2.visibility = View.GONE
            sc3.visibility = View.GONE
            sc4.visibility = View.GONE
            tP.text = "Marvel"
        }
        national.setOnClickListener{
            scD.visibility = View.GONE
            scP.visibility = View.GONE
            scM.visibility = View.GONE
            scN.visibility = View.VISIBLE
            scSW.visibility = View.GONE
            scS.visibility = View.GONE
            sc1.visibility = View.GONE
            sc2.visibility = View.GONE
            sc3.visibility = View.GONE
            sc4.visibility = View.GONE
            tP.text = "National Geografic"
        }
        star_wars.setOnClickListener{
            scD.visibility = View.GONE
            scP.visibility = View.GONE
            scM.visibility = View.GONE
            scN.visibility = View.GONE
            scSW.visibility = View.VISIBLE
            scS.visibility = View.GONE
            sc1.visibility = View.GONE
            sc2.visibility = View.GONE
            sc3.visibility = View.GONE
            sc4.visibility = View.GONE
            tP.text = "Star Wars"
        }
        stars.setOnClickListener{
            scD.visibility = View.GONE
            scP.visibility = View.GONE
            scM.visibility = View.GONE
            scN.visibility = View.GONE
            scSW.visibility = View.GONE
            scS.visibility = View.VISIBLE
            sc1.visibility = View.GONE
            sc2.visibility = View.GONE
            sc3.visibility = View.GONE
            sc4.visibility = View.GONE
            tP.text = "Stars"
        }
        strange.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, DoctorStrange::class.java)
            intent.putExtra("imagen_id", foto)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        creator.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, TheCreator::class.java)
            intent.putExtra("imagen_id", foto)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        cars.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Cars::class.java)
            intent.putExtra("imagen_id", foto)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        hocus.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, HocusPocus::class.java)
            intent.putExtra("imagen_id", foto)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        cruella.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Cruella::class.java)
            intent.putExtra("imagen_id", foto)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        imperio.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, ImperioContrataca::class.java)
            intent.putExtra("imagen_id", foto)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        increibles.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, LosIncreibles::class.java)
            intent.putExtra("imagen_id", foto)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        up.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Up::class.java)
            intent.putExtra("imagen_id", foto)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        shield.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Shield::class.java)
            intent.putExtra("imagen_id", foto)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        esperanza.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, NuevaEsperanza::class.java)
            intent.putExtra("imagen_id", foto)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        baymax.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Baymax::class.java)
            intent.putExtra("imagen_id", foto)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        mandalorian.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Mandalorian::class.java)
            intent.putExtra("imagen_id", foto)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        percy.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, PercyJackson::class.java)
            intent.putExtra("imagen_id", foto)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        pompeya.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Pompeya::class.java)
            intent.putExtra("imagen_id", foto)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        kingsman.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Kingsman::class.java)
            intent.putExtra("imagen_id", foto)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        asesino.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, SoloAsesinatos::class.java)
            intent.putExtra("imagen_id", foto)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        casa.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Buscador::class.java)
            intent.putExtra("imagen_id", foto)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        perfil.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Perfil::class.java)
            intent.putExtra("imagen_id", foto)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)

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