package com.example.portofolio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class education : AppCompatActivity() {

    lateinit var educationView: RecyclerView
    lateinit var educationAdapter: schooladapter
    val list = ArrayList<schooldata>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        educationView = findViewById(R.id.educationrv)
        educationView.layoutManager = LinearLayoutManager(this)

        list.add(schooldata("SDN Trimulyo 1" , "Jl Trimulyo Raya No.44,Trimulyo,Sayung,Kec.Sayung,Kabupaten Demak,Jawa Tengah"))
        list.add(schooldata("MTs Nahdlatusy Syubban" , "Jl Semarang - Demak No.Km 09,Setro Kidul,Purwosari,Kec.Demak,Kabupaten Demak,Jawa Tengah"))
        list.add(schooldata("SMK Negeri 1 Sayung" , "Jl Raya Semarang Demak Km 14 Onggorawe Sayung Demak,Daleman,Tugu,Kec.Sayung,Kabupaten Demak,Jawa Tengah"))

        educationAdapter = schooladapter(list)
        educationView.adapter = educationAdapter

    }
}