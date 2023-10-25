package com.example.gamerapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class StoreAdapter (val games:ArrayList<Game>): RecyclerView.Adapter<StoreViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreViewHolder {
        val view = LayoutInflater.from(parent.context).
        inflate(R.layout.store_single_item, parent, false) as View
        return StoreViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  games.size
    }

    override fun onBindViewHolder(holder: StoreViewHolder, position: Int) {
        holder.name.text=games[position].name
        holder.type.text=games[position].type
        holder.price.text= games[position].price.toString()
        holder.image.setImageResource( games[position].image)
    }
}