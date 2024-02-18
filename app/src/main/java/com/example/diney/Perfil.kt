package com.example.diney

import android.content.Intent
import android.graphics.drawable.BitmapDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class Perfil : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        //botones
        val fotoBuena: ImageView = findViewById(R.id.imageView4)
        val salir: Button = findViewById(R.id.button2)
        //textos
        val correo: TextView = findViewById(R.id.textView13)
        val usu: TextView = findViewById(R.id.textView14)
        //menu
        val casa: ImageButton = findViewById(R.id.imageButton)
        val lupa: ImageButton = findViewById(R.id.imageButton3)
        //valores pasados por intent
        val usuario = intent.getStringExtra("usuario")
        val passw = intent.getStringExtra("password")
        val mail = intent.getStringExtra("email")
        val selectedImage = intent.getIntExtra("selectedImage", 0)

        fotoBuena.setImageResource(selectedImage)

        correo.text="$mail"
        usu.text="$usuario"

        salir.setOnClickListener {
            val intent = Intent(this@Perfil, MainActivity::class.java)
            startActivity(intent)
        }
        casa.setOnClickListener{
            val intent = Intent(this@Perfil, Buscador::class.java)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        lupa.setOnClickListener{
            val intent = Intent(this@Perfil, MenuPrincipal::class.java)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
    }
}