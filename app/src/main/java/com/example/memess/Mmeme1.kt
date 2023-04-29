package com.example.memess

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Mmeme1 : AppCompatActivity() {
    lateinit var tvNxt:TextView
    lateinit var tvPrevious:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mmeme1)
        tvNxt = findViewById(R.id.tvNxt)
        tvPrevious = findViewById(R.id.tvPrevious)
        tvNxt.setOnClickListener {
            val intent = Intent(this,Meme3::class.java)
            startActivity(intent)
        }
        tvPrevious.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}