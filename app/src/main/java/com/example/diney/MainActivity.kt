package com.example.diney

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthEmailException
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.FirebaseAuthInvalidUserException
import com.google.firebase.auth.auth

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botonI: Button = findViewById(R.id.iniciar)
        val botonR: Button = findViewById(R.id.regis)
        val user:EditText = findViewById(R.id.usuario)
        val pass:EditText = findViewById(R.id.password)

        val auth: FirebaseAuth = Firebase.auth

        val selectedImage = intent.getIntExtra("selectedImage", 0)
        val usuario = intent.getStringExtra("usuario")

        botonI.setOnClickListener{
            if (user.text.isNotEmpty() && pass.text.isNotEmpty()){
                auth.signInWithEmailAndPassword(user.text.toString(), pass.text.toString()).addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        val intent = Intent(this@MainActivity, Buscador::class.java)
//                        intent.putExtra("imagen_id", 0)
                        intent.putExtra("email", user.text.toString())
                        intent.putExtra("selectedImage", selectedImage)
                        intent.putExtra("usuario", usuario)
                        intent.putExtra("contraseña", pass.text.toString())
                        startActivity(intent)
                    } else {
                        val error = when (task.exception) {
                            is FirebaseAuthInvalidUserException -> "El usuario no existe."
                            is FirebaseAuthEmailException -> "El correo no es valido"
                            is FirebaseAuthInvalidCredentialsException -> "La contraseña es incorrecta."
                            else -> "Error al autenticar"
                        }
                        Toast.makeText(this@MainActivity, error, Toast.LENGTH_SHORT).show()
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
        }
        botonR.setOnClickListener{
            val intent = Intent(this@MainActivity, CrearUsuario::class.java)
            startActivity(intent)
        }
    }
}