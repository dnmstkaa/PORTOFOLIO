package com.example.portofolio1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class hobbyadapter(private val list: ArrayList<hobbydata>):
    RecyclerView.Adapter<hobbyadapter.HobbyViewHolder>() {
    class HobbyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val logo = itemView.findViewById<ImageView>(R.id.logohobby)
        private val nama = itemView.findViewById<TextView>(R.id.namahobby)
        private val desc = itemView.findViewById<TextView>(R.id.deschobby)

        fun bind(get: hobbydata) {
            logo.setImageResource(get.logo)
            nama.text = get.nama
            desc.text = get.desc
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobbyViewHolder {
        return HobbyViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.hobbylist , parent ,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: HobbyViewHolder, position: Int) {
        holder.bind(list[position])
    }
}