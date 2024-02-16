package com.example.diney

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class CrearUsuario : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_usuario)

        val email: EditText = findViewById(R.id.editText)
        val usuario: EditText = findViewById(R.id.editText2)
        val password: EditText = findViewById(R.id.editText3)
        val botonS: Button = findViewById(R.id.suscrib)
        val botonV: Button = findViewById(R.id.volver)
        val auth: FirebaseAuth = Firebase.auth
        val foto: ImageButton = findViewById(R.id.imageButton2)

        val fotoU=FotoPerfil()
        fotoU.obtenerFoto(foto)
//        val avatar: ImageButton = findViewById(R.id.imageButton5)
//        val Fdar: ImageButton = findViewById(R.id.imageButton6)
//        val Fincleible: ImageButton = findViewById(R.id.imageButton7)
//        val Fhomer: ImageButton = findViewById(R.id.imageButton8)
//        val Fironman: ImageButton = findViewById(R.id.imageButton9)


//        avatar.setOnClickListener {
//            Fdar.visibility = View.VISIBLE
//            Fincleible.visibility = View.VISIBLE
//            Fhomer.visibility = View.VISIBLE
//            Fironman.visibility = View.VISIBLE
//            Fdar.setOnClickListener {
//                avatar.setImageResource(R.drawable.logo)
//                Fdar.visibility = View.GONE
//                Fincleible.visibility = View.GONE
//                Fhomer.visibility = View.GONE
//                Fironman.visibility = View.GONE
//            }
//            Fincleible.setOnClickListener {
//                avatar.setImageResource(R.drawable.logo)
//                Fdar.visibility = View.GONE
//                Fincleible.visibility = View.GONE
//                Fhomer.visibility = View.GONE
//                Fironman.visibility = View.GONE
//            }
//            Fhomer.setOnClickListener {
//                avatar.setImageResource(R.drawable.logo)
//                Fdar.visibility = View.GONE
//                Fincleible.visibility = View.GONE
//                Fhomer.visibility = View.GONE
//                Fironman.visibility = View.GONE
//            }
//            Fironman.setOnClickListener {
//                avatar.setImageResource(R.drawable.logo)
//                Fdar.visibility = View.GONE
//                Fincleible.visibility = View.GONE
//                Fhomer.visibility = View.GONE
//                Fironman.visibility = View.GONE
//            }
//        }

        botonV.setOnClickListener{
            var intent = Intent(this@CrearUsuario, MainActivity::class.java)
            startActivity(intent)
        }
        botonS.setOnClickListener{
            if (email.text.isNotEmpty() && password.text.isNotEmpty() && usuario.text.isNotEmpty()){
                auth.createUserWithEmailAndPassword(email.text.toString(), password.text.toString()).addOnCompleteListener {
                    if(password.text.length<=5){
                        val builder = AlertDialog.Builder(this)
                        builder.setTitle("Error")
                        builder.setMessage("La contraseña no cumple con la complejidad")
                        builder.setPositiveButton("Aceptar", null)
                        val dialog: AlertDialog = builder.create()
                        dialog.show()
                    }else {
                        if (email.text.contains("@")&&email.text.contains(".")) {
                            if (it.isSuccessful) {
                                val intent = Intent(this@CrearUsuario, MainActivity::class.java)
                                intent.putExtra("imagen_id", foto.drawable.toString())
                                intent.putExtra("email", email.text)
                                intent.putExtra("usuario", usuario.text)
                                intent.putExtra("contraseña", password.text)
                                startActivity(intent)
                            } else {
                                val builder = AlertDialog.Builder(this)
                                builder.setTitle("Error")
                                builder.setMessage("Se ha producido un error en la creacion del ususario")
                                builder.setPositiveButton("Aceptar", null)
                                val dialog: AlertDialog = builder.create()
                                dialog.show()
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
}