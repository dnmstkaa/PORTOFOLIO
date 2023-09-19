package com.example.portofolio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class portofolio : AppCompatActivity() {
    lateinit var portofolioView: RecyclerView
    lateinit var portofolioadapter: portofolioadapter
    val listPortofolio = ArrayList<portofoliodata>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portofolio)

        listPortofolio.add(portofoliodata(
            R.drawable.androidapp, "teacherapps", "Project latihan membuat Aplikasi TeacherApps berbasis Android",
            "https://github.com/dnmstkaa/teacherapp"))

        portofolioView = findViewById(R.id.recyclerview)
        portofolioView.layoutManager = LinearLayoutManager(this)

        portofolioadapter = portofolioadapter(listPortofolio)
        portofolioadapter.notifyDataSetChanged()
        portofolioView.adapter = portofolioadapter
    }
}