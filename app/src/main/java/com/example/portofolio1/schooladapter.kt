package com.example.portofolio1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class schooladapter (private val list: ArrayList<schooldata>):
        RecyclerView.Adapter<schooladapter.SchoolViewHolder>(){
    class SchoolViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private val nama = itemView.findViewById<TextView>(R.id.namaschool)
        private val alamat = itemView.findViewById<TextView>(R.id.alamatschool)

        fun bind(get: schooldata){
            nama.text = get.nama
            alamat.text = get.alamat
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SchoolViewHolder {
       return SchoolViewHolder(LayoutInflater.from(parent.context)
           .inflate(R.layout.schoollist , parent ,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: SchoolViewHolder, position: Int) {
        holder.bind(list[position])
    }
}