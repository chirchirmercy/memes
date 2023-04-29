package com.example.memess

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Meme4 : AppCompatActivity() {
    lateinit var tvPr:TextView
    lateinit var tvNt:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)
        tvPr=findViewById(R.id.tvPr)
        tvNt = findViewById(R.id.tvNt)
        tvPr.setOnClickListener {
            val intent = Intent(this,Meme3::class.java)
            startActivity(intent)
        }
        tvNt.setOnClickListener {
            val intent = Intent(this,Meme5::class.java)
            startActivity(intent)
        }
    }
}