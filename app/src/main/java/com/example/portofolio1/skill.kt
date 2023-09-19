package com.example.portofolio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class skill : AppCompatActivity() {
    lateinit var skillView: RecyclerView
    lateinit var skillAdapter: skilladapter
    val list = ArrayList<skilldata>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        skillView = findViewById(R.id.rvskill)
        skillView.layoutManager = LinearLayoutManager(this)

        list.add(skilldata(R.drawable.androidapp, "Kotlin" , "Pemrograman Android"))
        list.add(skilldata(R.drawable.webapp,"Laravel" , "Pemrograman Web"))

        skillAdapter = skilladapter(list)
        skillView.adapter = skillAdapter
    }
}