package com.example.diney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.cardview.widget.CardView
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem


class MenuPrincipal : AppCompatActivity() {
    val list = mutableListOf<CarouselItem>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)

        val passw = intent.getStringExtra("password")
        val mail = intent.getStringExtra("email")
        val usuario = intent.getStringExtra("usuario")
        val selectedImage = intent.getIntExtra("selectedImage", 0)

        //Menu
        val casa: ImageButton = findViewById(R.id.menu)
        val perfil: ImageButton = findViewById(R.id.perfil)

        //Peliculas/Series
        val strange: CardView = findViewById(R.id.strange2)
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
        //Carrusel
        val carousel: ImageCarousel = findViewById(R.id.carousel)
        //lista de carruseles
        list.add(CarouselItem("https://pbs.twimg.com/media/EHRv5d_UUAEMUEk.jpg", "Mandalorian"))
        list.add(CarouselItem("https://www.mundodeportivo.com/alfabeta/hero/2023/11/0x0.png?width=768&aspect_ratio=16:9&format=nowebp", "Marvel"))
        list.add(CarouselItem("https://lumiere-a.akamaihd.net/v1/images/introducing-dplus-social_10646ca8.jpeg", "inicio"))
        carousel.infiniteCarousel = true
        carousel.start()
        carousel.setData(list)

        perfil.setImageResource(selectedImage)

        strange.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, DoctorStrange::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        creator.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, TheCreator::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        cars.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Cars::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        hocus.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, HocusPocus::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        cruella.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Cruella::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        imperio.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, ImperioContrataca::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        increibles.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, LosIncreibles::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        up.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Up::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        shield.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Shield::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        esperanza.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, NuevaEsperanza::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        baymax.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Baymax::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        mandalorian.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Mandalorian::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        percy.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, PercyJackson::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        pompeya.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Pompeya::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        kingsman.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Kingsman::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        asesino.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, SoloAsesinatos::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        casa.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Buscador::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        perfil.setOnClickListener{
            val intent = Intent(this@MenuPrincipal, Perfil::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
    }
}