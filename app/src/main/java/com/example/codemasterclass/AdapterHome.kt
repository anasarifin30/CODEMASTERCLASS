package com.example.codemasterclass

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterHome(private val listKelas:List<KelasBaru>):
    RecyclerView.Adapter<AdapterHome.ViewHolder>() {

    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView){
        val image: ImageView = itemView.findViewById(R.id.imageView)
        val title: TextView = itemView.findViewById(R.id.button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.card_layout_home,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val kelasBaru = listKelas[position]

        holder.image.setImageResource(kelasBaru.image)
        holder.title.text = kelasBaru.title
    }

    override fun getItemCount(): Int {
        return listKelas.size
    }
}