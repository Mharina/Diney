package com.example.diney

import android.widget.ImageButton

class FotoPerfil {
    fun obtenerFoto(foto: ImageButton){
        val num = ((1..(4)).random())
        when(num){
            1->{
                foto.setImageResource(R.drawable.logo)
            }
            2->{
                foto.setImageResource(R.drawable.logo)
            }
            3->{
                foto.setImageResource(R.drawable.logo)
            }
            4->{
                foto.setImageResource(R.drawable.logo)
            }
        }
    }
}