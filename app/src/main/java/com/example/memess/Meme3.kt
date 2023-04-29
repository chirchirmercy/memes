package com.example.memess

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Meme3 : AppCompatActivity(){
    lateinit var tvPrv:TextView
    lateinit var tvNx:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        tvPrv = findViewById(R.id.tvPrv)
        tvNx = findViewById(R.id.tvNx)
        tvPrv.setOnClickListener {
            val intent = Intent(this,Mmeme1::class.java)
            startActivity(intent)
        }
        tvNx.setOnClickListener {
            val intent = Intent(this,Meme4::class.java)
            startActivity(intent)
        }
    }
}