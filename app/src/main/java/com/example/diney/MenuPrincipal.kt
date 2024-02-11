package com.example.diney

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.listener.CarouselListener
import org.imaginativeworld.whynotimagecarousel.listener.CarouselOnScrollListener

class MenuPrincipal : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    //private lateinit var binding: ActivityKotlinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)

        val carousel: ImageCarousel = findViewById(R.id.carrusel)
        list.add(CarouselItem("https://pbs.twimg.com/media/EHRv5d_UUAEMUEk.jpg", "Mandalorian"))
        list.add(CarouselItem("https://www.mundodeportivo.com/alfabeta/hero/2023/11/0x0.png?width=768&aspect_ratio=16:9&format=nowebp", "Marvel"))
        list.add(CarouselItem("https://lumiere-a.akamaihd.net/v1/images/introducing-dplus-social_10646ca8.jpeg", "inicio"))

//        binding.carousel3.registerLifecycle(lifecycle)
//
//        // Custom view
//        binding.carousel3.carouselListener = object : CarouselListener {
//            override fun onCreateViewHolder(
//                layoutInflater: LayoutInflater,
//                parent: ViewGroup
//            ): ViewBinding {
//                return ItemCustomFixedSizeLayout1Binding.inflate(layoutInflater, parent, false)
//            }
//
//            override fun onBindViewHolder(
//                binding: ViewBinding,
//                item: org.imaginativeworld.whynotimagecarousel.model.CarouselItem,
//                position: Int
//            ) {
//                val currentBinding = binding as ItemCustomFixedSizeLayout1Binding
//
//                currentBinding.imageView.apply {
//                    scaleType = ImageView.ScaleType.CENTER_CROP
//
//                    // carousel_default_placeholder is the default placeholder comes with
//                    // the library.
//                    setImage(item, R.drawable.carousel_default_placeholder)
//                }
//            }
//        }
//
//        val listThree = mutableListOf<org.imaginativeworld.whynotimagecarousel.model.CarouselItem>()
//
//        for (item in DataSet.three) {
//            listThree.add(
//                org.imaginativeworld.whynotimagecarousel.model.CarouselItem(
//                    imageUrl = item.first,
//                    caption = item.second
//                )
//            )
//        }
//
//        binding.carousel3.setData(listThree)
//
//        binding.customCaption.isSelected = true
//
//        binding.carousel3.onScrollListener = object : CarouselOnScrollListener {
//
//            override fun onScrollStateChanged(
//                recyclerView: RecyclerView,
//                newState: Int,
//                position: Int,
//                carouselItem: org.imaginativeworld.whynotimagecarousel.model.CarouselItem?
//            ) {
//                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
//                    carouselItem?.apply {
//                        binding.customCaption.text = caption
//                    }
//                }
//            }
//
//            override fun onScrolled(
//                recyclerView: RecyclerView,
//                dx: Int,
//                dy: Int,
//                position: Int,
//                carouselItem: org.imaginativeworld.whynotimagecarousel.model.CarouselItem?
//            ) {
//                // ...
//            }
//        }
//
//        // Custom navigation
//        binding.btnGotoPrevious.setOnClickListener {
//            binding.carousel3.previous()
//        }
//
//        binding.btnGotoNext.setOnClickListener {
//            binding.carousel3.next()
//        }

//        carousel.carouselListener = object : CarouselListener {
//            override fun onCreateViewHolder(
//                layoutInflater: LayoutInflater,
//                parent: ViewGroup
//            ): ViewBinding {
//                // Here, our XML layout file name is custom_item_layout.xml. So our view binding generated class name is CustomItemLayoutBinding.
//                return CustomItemLayoutBinding.inflate(layoutInflater, parent, false)
//            }
//
//            override fun onBindViewHolder(
//                binding: ViewBinding,
//                imageScaleType: ImageView.ScaleType,
//                item: CarouselItem,
//                position: Int
//            ) {
//                // Cast the binding to the returned view binding class of the onCreateViewHolder() method.
//                val currentBinding = binding as CustomItemLayoutBinding
//
//                // Do the bindings...
//                currentBinding.imageView.apply {
//                    scaleType = imageScaleType
//
//                    // setImage() is an extension function to load image to an ImageView using CarouselItem object. We need to provide current CarouselItem data and the place holder Drawable or drawable resource id to the function. placeholder parameter is optional.
//                    setImage(item, R.drawable.ic_wb_cloudy_with_padding)
//                }
//            }
//        }

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