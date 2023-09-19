package com.example.portofolio1

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class portofolioadapter (private val list: ArrayList<portofoliodata>):
    RecyclerView.Adapter<portofolioadapter.PortofolioViewHolder>(){

    class PortofolioViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private val logo = itemView.findViewById<ImageView>(R.id.logoweb)
        private val judul = itemView.findViewById<TextView>(R.id.judulweb)
        private val desc = itemView.findViewById<TextView>(R.id.deskripsiweb)

        fun bind(get: portofoliodata){
            logo.setImageResource(get.logo)
            judul.text = get.judul
            desc.text = get.desc

            judul.setOnClickListener {
                val open =Intent(Intent.ACTION_VIEW, Uri.parse(get.url))
                itemView.context.startActivity(open)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PortofolioViewHolder {
       return PortofolioViewHolder(LayoutInflater.from(parent.context)
           .inflate(R.layout.portofoliolist , parent , false))
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: PortofolioViewHolder, position: Int) {
       holder.bind(list[position])
    }
}