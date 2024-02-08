package com.example.diney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton: Button = findViewById(R.id.button)

        boton.setOnClickListener{
            val intent = Intent(this@MainActivity, MenuPrincipal::class.java)
            startActivity(intent)
        }
    }
}