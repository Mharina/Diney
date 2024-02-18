package com.example.diney

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Kingsman : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kingsman)

        val passw = intent.getStringExtra("password")
        val mail = intent.getStringExtra("email")
        val usuario = intent.getStringExtra("usuario")
        val selectedImage = intent.getIntExtra("selectedImage", 0)

        val play: Button = findViewById(R.id.button24)

        val casa: ImageButton = findViewById(R.id.imageButton20)
        val lupa: ImageButton = findViewById(R.id.imageButton21)

        play.setOnClickListener {
            val videoUrl = "https://www.youtube.com/watch?v=Rs5J8kh62yo"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(videoUrl))
            startActivity(intent)
        }

        casa.setOnClickListener{
            val intent = Intent(this@Kingsman, Buscador::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        lupa.setOnClickListener{
            val intent = Intent(this@Kingsman, MenuPrincipal::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
    }
}