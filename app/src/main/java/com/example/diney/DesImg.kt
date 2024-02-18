package com.example.diney

import android.widget.ImageButton

class DesImg {
    fun desFoto(foto: ImageButton, id: Int):Int{
        when(id){
            1->{
                foto.setImageResource(R.drawable.mickey)
                return 1
            }
            2->{
                foto.setImageResource(R.drawable.homer)
                return 2
            }
            3->{
                foto.setImageResource(R.drawable.darth)
                return 3
            }
            4->{
                foto.setImageResource(R.drawable.msi)
                return 4
            } else -> return 1
        }
    }
}