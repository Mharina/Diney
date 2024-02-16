package com.example.diney

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Buscador : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscador)

        val usuario = intent.getStringExtra("usuario")
        val passw = intent.getStringExtra("password")
        val mail = intent.getStringExtra("email")
        val foto = intent.getStringExtra("imagen_id")

        //menu
        val lupa: ImageButton = findViewById(R.id.lupa)
        val perfil: ImageButton = findViewById(R.id.user)

        //perfil.setImageResource(R.drawable.foto)



        lupa.setOnClickListener {
            intent.putExtra("imagen_id", foto)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)
        }

        perfil.setOnClickListener {
            intent.putExtra("imagen_id", foto)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)
        }
    }
}