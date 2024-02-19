package com.example.diney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthEmailException
import com.google.firebase.auth.auth

class CrearUsuario : AppCompatActivity() {
    var selectedImage: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_usuario)

        val email: EditText = findViewById(R.id.editText)
        val usuario: EditText = findViewById(R.id.editText2)
        val password: EditText = findViewById(R.id.editText3)
        val botonS: Button = findViewById(R.id.suscrib)
        val botonV: Button = findViewById(R.id.volver)
        val auth: FirebaseAuth = Firebase.auth

        botonV.setOnClickListener{
            var intent = Intent(this@CrearUsuario, MainActivity::class.java)
            startActivity(intent)
        }
        botonS.setOnClickListener{
            if (email.text.isNotEmpty() && password.text.isNotEmpty() && usuario.text.isNotEmpty()){
                auth.createUserWithEmailAndPassword(email.text.toString(), password.text.toString()).addOnCompleteListener { task ->
                    if(password.text.length<=5){
                        val builder = AlertDialog.Builder(this)
                        builder.setTitle("Error")
                        builder.setMessage("La contraseña no cumple con la complejidad")
                        builder.setPositiveButton("Aceptar", null)
                        val dialog: AlertDialog = builder.create()
                        dialog.show()
                    }else {
                        if (email.text.contains("@")&&email.text.contains(".")) {
                            if (task.isSuccessful) {
                                val intent = Intent(this@CrearUsuario, MainActivity::class.java)
                                intent.putExtra("selectedImage", selectedImage)
                                intent.putExtra("usuario", usuario.text.toString())
                                startActivity(intent)
                            } else {
                                val error = when (task.exception) {
                                    is FirebaseAuthEmailException -> "Formato de email no valido"
                                    else -> "Error al autenticar"
                                }
                                Toast.makeText(this@CrearUsuario, error, Toast.LENGTH_SHORT).show()
                            }
                        }else{
                            val builder = AlertDialog.Builder(this)
                            builder.setTitle("Error")
                            builder.setMessage("Se ha producido un error en el email, formato no valido")
                            builder.setPositiveButton("Aceptar", null)
                            val dialog: AlertDialog = builder.create()
                            dialog.show()
                        }
                    }
                }
            } else{
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Error")
                builder.setMessage("No puede dejar los campos en blanco")
                builder.setPositiveButton("Aceptar",null)
                val dialog: AlertDialog = builder.create()
                dialog.show()
            }
        }
    }
    fun selectImage(view: View) {
        // Obtener el ID de la imagen seleccionada
        selectedImage = when (view.id) {
            R.id.imageView5 -> R.drawable.darth
            R.id.imageView7 -> R.drawable.homer
            R.id.imageView17 -> R.drawable.mickey
            R.id.imageView25 -> R.drawable.msi
            else -> R.drawable.mickey
        }
    }
}