package com.example.memess

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Meme5 : AppCompatActivity() {
    lateinit var tvPs:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme5)
        tvPs = findViewById(R.id.tvPs)
        tvPs.setOnClickListener {
            val intent = Intent(this,Meme4::class.java)
            startActivity(intent)
        }
    }
}