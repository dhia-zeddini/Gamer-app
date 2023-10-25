package com.example.gamerapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StoreViewHolder (myView: View): RecyclerView.ViewHolder(myView){

    val image: ImageView
    val name: TextView
    val type: TextView
    val price: TextView

    init {
        image=myView.findViewById(R.id.gameImage)
        name=myView.findViewById(R.id.gameName)
        type=myView.findViewById(R.id.gameType)
        price=myView.findViewById(R.id.gamePrice)
    }

}