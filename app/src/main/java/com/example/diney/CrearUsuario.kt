package com.example.diney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class CrearUsuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_usuario)

        val email: EditText = findViewById(R.id.editText)
        val Password: EditText = findViewById(R.id.editText2)
        val botonS: Button = findViewById(R.id.suscrib)
        val botonV: Button = findViewById(R.id.volver)
        val auth: FirebaseAuth = Firebase.auth

        botonV.setOnClickListener{
            var intent = Intent(this@CrearUsuario, MainActivity::class.java)
            startActivity(intent)
        }
        botonS.setOnClickListener{

            if (email.text.isNotEmpty() && Password.text.isNotEmpty()){
                auth.createUserWithEmailAndPassword(email.text.toString(), Password.text.toString()).addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        val intent = Intent(this@CrearUsuario, MenuPrincipal::class.java)
                        startActivity(intent)
                    } else {

                    }
                }
            } else{

            }
        }

    }
}