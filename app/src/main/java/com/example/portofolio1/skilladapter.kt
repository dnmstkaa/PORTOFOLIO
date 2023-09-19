package com.example.portofolio1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class skilladapter(private val list:ArrayList<skilldata>):
    RecyclerView.Adapter<skilladapter.SkillViewHolder>(){

    class SkillViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private val logo = itemView.findViewById<ImageView>(R.id.logoskill)
        private val nama = itemView.findViewById<TextView>(R.id.namaskill)
        private val desc = itemView.findViewById<TextView>(R.id.descskill)

        fun bind(get: skilldata) {
            logo.setImageResource(get.logo)
            nama.text = get.nama
            desc.text = get.desc
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkillViewHolder {
        return SkillViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.skillist , parent , false))
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: SkillViewHolder, position: Int) {
        holder.bind(list[position])
    }
}
