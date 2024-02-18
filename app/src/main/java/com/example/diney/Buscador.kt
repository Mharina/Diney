package com.example.diney

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable.Creator
import android.view.View
import android.widget.HorizontalScrollView
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class Buscador : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscador)

        val usuario = intent.getStringExtra("usuario")
        val passw = intent.getStringExtra("password")
        val mail = intent.getStringExtra("email")
        val selectedImage = intent.getIntExtra("selectedImage", 0)

        //menu
        val lupa: ImageButton = findViewById(R.id.lupa)
        val perfil: ImageButton = findViewById(R.id.user)

        //filtros
        val series: CardView = findViewById(R.id.serie)
        val pelis: CardView = findViewById(R.id.pelis)
        //carteles
        val ck:CardView = findViewById(R.id.ckin)
        val ci:CardView = findViewById(R.id.cimp)
        val cd:CardView = findViewById(R.id.cdoc)
        val ca:CardView = findViewById(R.id.cas)
        //scroll
        val ss: HorizontalScrollView = findViewById(R.id.series)
        val sp: HorizontalScrollView = findViewById(R.id.peliculas)
        //peliculas
        val p_1: CardView = findViewById(R.id.P_cars)
        val p_2: CardView = findViewById(R.id.P_creator)
        val p_3: CardView = findViewById(R.id.P_cruella)
        val p_4: CardView = findViewById(R.id.P_hocus)
        val p_5: CardView = findViewById(R.id.P_esperanza)
        val p_6: CardView = findViewById(R.id.P_imperio)
        val p_7: CardView = findViewById(R.id.P_increibles)
        val p_8: CardView = findViewById(R.id.P_kigsman)
        val p_9: CardView = findViewById(R.id.P_pompeya)
        val p_10: CardView = findViewById(R.id.P_up)
        val p_11: CardView = findViewById(R.id.P_strange)
        //series
        val s_1: CardView = findViewById(R.id.S_asesinatos)
        val s_2: CardView = findViewById(R.id.S_baymax)
        val s_3: CardView = findViewById(R.id.S_mandalorian)
        val s_4: CardView = findViewById(R.id.S_percy)
        val s_5: CardView = findViewById(R.id.S_shield)

        perfil.setImageResource(selectedImage)

        series.setOnClickListener {
            ck.visibility = View.GONE
            ci.visibility = View.GONE
            cd.visibility = View.GONE
            ca.visibility = View.GONE
            sp.visibility = View.GONE
            ss.visibility = View.VISIBLE
        }
        pelis.setOnClickListener {
            ck.visibility = View.GONE
            ci.visibility = View.GONE
            cd.visibility = View.GONE
            ca.visibility = View.GONE
            ss.visibility = View.GONE
            sp.visibility = View.VISIBLE
        }
        p_1.setOnClickListener {
            val intent=Intent(this@Buscador,Cars::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        p_2.setOnClickListener {
            val intent=Intent(this@Buscador,Creator::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        p_3.setOnClickListener {
            val intent=Intent(this@Buscador,Cruella::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        p_4.setOnClickListener {
            val intent=Intent(this@Buscador,HocusPocus::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        p_5.setOnClickListener {
            val intent=Intent(this@Buscador,NuevaEsperanza::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        p_6.setOnClickListener {
            val intent=Intent(this@Buscador,ImperioContrataca::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        p_7.setOnClickListener {
            val intent=Intent(this@Buscador,LosIncreibles::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        p_8.setOnClickListener {
            val intent=Intent(this@Buscador,Kingsman::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        p_9.setOnClickListener {
            val intent=Intent(this@Buscador,Pompeya::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        p_10.setOnClickListener {
            val intent=Intent(this@Buscador,Up::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        p_11.setOnClickListener {
            val intent=Intent(this@Buscador,DoctorStrange::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        s_1.setOnClickListener {
            val intent=Intent(this@Buscador,SoloAsesinatos::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        s_2.setOnClickListener {
            val intent=Intent(this@Buscador,Baymax::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        s_3.setOnClickListener {
            val intent=Intent(this@Buscador,Mandalorian::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        s_4.setOnClickListener {
            val intent=Intent(this@Buscador,PercyJackson::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
        s_5.setOnClickListener {
            val intent=Intent(this@Buscador,Shield::class.java)
            intent.putExtra("usuario", usuario)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }

        lupa.setOnClickListener {
            val intent = Intent(this@Buscador, MenuPrincipal::class.java)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }

        perfil.setOnClickListener {
            val intent = Intent(this@Buscador, Perfil::class.java)
            intent.putExtra("selectedImage", selectedImage)
            intent.putExtra("email", mail)
            intent.putExtra("usuario", usuario)
            intent.putExtra("contraseña", passw)
            startActivity(intent)
        }
    }
}
