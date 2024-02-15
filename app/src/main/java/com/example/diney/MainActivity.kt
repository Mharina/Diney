package com.example.diney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botonI: Button = findViewById(R.id.iniciar)
        val botonR: Button = findViewById(R.id.regis)
        val user:EditText = findViewById(R.id.usuario)
        val pass:EditText = findViewById(R.id.password)
        val auth: FirebaseAuth = Firebase.auth

        botonI.setOnClickListener{
            if (user.text.isNotEmpty() && pass.text.isNotEmpty()){
                auth.signInWithEmailAndPassword(user.text.toString(), pass.text.toString()).addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        val intent = Intent(this@MainActivity, MenuPrincipal::class.java)
                        startActivity(intent)

                    } else {
                        val builder = AlertDialog.Builder(this)
                        builder.setTitle("Error")
                        builder.setMessage("Se ha producido un error en la autenticacion del ususario")
                        builder.setPositiveButton("Aceptar",null)
                        val dialog: AlertDialog = builder.create()
                        dialog.show()
                    }
                }
            }else{
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Error")
                builder.setMessage("No puede dejar los campos en blanco")
                builder.setPositiveButton("Aceptar",null)
                val dialog: AlertDialog = builder.create()
                dialog.show()
            }
//            val intent = Intent(this@MainActivity, MenuPrincipal::class.java)
//            startActivity(intent)
        }
        botonR.setOnClickListener{
            val intent = Intent(this@MainActivity, CrearUsuario::class.java)
            startActivity(intent)
        }
    }
}