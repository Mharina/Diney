package com.example.diney

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class PercyJackson : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_percy_jackson)

        val passw = intent.getStringExtra("password")
        val mail = intent.getStringExtra("email")
        val usuario = intent.getStringExtra("usuario")
        val selectedImage = intent.getIntExtra("selectedImage", 0)

        val play: Button = findViewById(R.id.button28)

        val casa: ImageButton = findViewById(R.id.imageButton28)
        val lupa: ImageButton = findViewById(R.id.imageButton29)

        play.setOnClickListener {
            val videoUrl = "https://www.youtube.com/watch?v=c2a30OMH2bI"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(videoUrl))
            startActivity(intent)
        }

        casa.setOnClickListener{
            val intent = Intent(this@PercyJackson, Buscador::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        lupa.setOnClickListener{
            val intent = Intent(this@PercyJackson, MenuPrincipal::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
    }
}