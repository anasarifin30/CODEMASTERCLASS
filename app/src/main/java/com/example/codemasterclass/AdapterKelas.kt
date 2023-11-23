package com.example.codemasterclass

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterKelas(private val listKelas:List<KelasModel>):
    RecyclerView.Adapter<AdapterKelas.ViewHolder>() {
    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView) {
        val backgroundFoto: ImageView = itemView.findViewById(R.id.background)
        val namaKelas: TextView = itemView.findViewById(R.id.textView1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.card_layout_kelas,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val kelas = listKelas[position]

        holder.backgroundFoto.setImageResource(kelas.backgroundFoto)
        holder.namaKelas.text = kelas.namaKelas
    }

    override fun getItemCount(): Int {
        return listKelas.size
    }

}