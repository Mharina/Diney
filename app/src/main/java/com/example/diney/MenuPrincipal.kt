package com.example.diney

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.OnItemClickListener

class MenuPrincipal : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)

        val carousel: ImageCarousel = findViewById(R.id.carrusel)
        list.add(CarouselItem("https://pbs.twimg.com/media/EHRv5d_UUAEMUEk.jpg", "Mandalorian"))
        list.add(CarouselItem("https://www.mundodeportivo.com/alfabeta/hero/2023/11/0x0.png?width=768&aspect_ratio=16:9&format=nowebp", "Marvel"))
        list.add(CarouselItem("https://lumiere-a.akamaihd.net/v1/images/introducing-dplus-social_10646ca8.jpeg", "inicio"))

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

        carousel.addData(list)
    }
}