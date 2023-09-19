package com.example.portofolio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnprofile: CardView = findViewById(R.id.profile)
        val btnskill: CardView = findViewById(R.id.skill)
        val btnportofolio: CardView = findViewById(R.id.portofolio)
        val btneducation: CardView = findViewById(R.id.education)
        val btnhobby: CardView = findViewById(R.id.hobby)

        btnprofile.setOnClickListener {
            val intent= Intent(this,profil::class.java)
            startActivity(intent)
        }
        btnportofolio.setOnClickListener {
            val intent= Intent(this,portofolio::class.java)
            startActivity(intent)
        }
        btneducation.setOnClickListener {
            val intent= Intent(this,education::class.java)
            startActivity(intent)
        }
        btnskill.setOnClickListener {
            val intent= Intent(this,skill::class.java)
            startActivity(intent)
        }
        btnhobby.setOnClickListener {
            val intent= Intent(this,hobby::class.java)
            startActivity(intent)
        }
    }
}