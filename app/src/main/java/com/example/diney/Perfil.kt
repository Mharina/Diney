package com.example.diney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class Perfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        val fotoBuena: ImageButton = findViewById(R.id.imageButton5)
        val f1: ImageButton = findViewById(R.id.imageButton6)
        val f2: ImageButton = findViewById(R.id.imageButton7)
        val f3: ImageButton = findViewById(R.id.imageButton8)
        val f4: ImageButton = findViewById(R.id.imageButton9)
        val salir: Button = findViewById(R.id.button2)

        fotoBuena.setOnClickListener {
            f1.visibility = View.VISIBLE
            f2.visibility = View.VISIBLE
            f3.visibility = View.VISIBLE
            f4.visibility = View.VISIBLE
            f1.setOnClickListener {
                fotoBuena.setImageResource(R.drawable.logo)
                f1.visibility = View.GONE
                f2.visibility = View.GONE
                f3.visibility = View.GONE
                f4.visibility = View.GONE
            }
            f2.setOnClickListener {
                fotoBuena.setImageResource(R.drawable.logo)
                f1.visibility = View.GONE
                f2.visibility = View.GONE
                f3.visibility = View.GONE
                f4.visibility = View.GONE
            }
            f3.setOnClickListener {
                fotoBuena.setImageResource(R.drawable.logo)
                f1.visibility = View.GONE
                f2.visibility = View.GONE
                f3.visibility = View.GONE
                f4.visibility = View.GONE
            }
            f4.setOnClickListener {
                fotoBuena.setImageResource(R.drawable.logo)
                f1.visibility = View.GONE
                f2.visibility = View.GONE
                f3.visibility = View.GONE
                f4.visibility = View.GONE
            }
        }
        salir.setOnClickListener {
            val intent = Intent(this@Perfil, MainActivity::class.java)
            startActivity(intent)
        }
    }
}