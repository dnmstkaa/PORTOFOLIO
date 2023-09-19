package com.example.portofolio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class hobby : AppCompatActivity() {

    lateinit var hobbyView: RecyclerView
    lateinit var hobbyAdapter: hobbyadapter
    val list = ArrayList<hobbydata>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobby)

        hobbyView = findViewById(R.id.rvhobby)
        hobbyView.layoutManager = LinearLayoutManager(this)

        list.add(hobbydata(R.drawable.games,"Bermain Game" , "Mobile legend , Shopee Cocoki , Block Jigsaw"))
        list.add(hobbydata(R.drawable.coding,"Ngoding" , "Android Studio , Visual Studio Code"))

        hobbyAdapter = hobbyadapter(list)
        hobbyView.adapter = hobbyAdapter
    }
}