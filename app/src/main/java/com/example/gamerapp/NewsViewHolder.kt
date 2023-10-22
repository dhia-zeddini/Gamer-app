package com.example.gamerapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsViewHolder (myView:View):RecyclerView.ViewHolder(myView){

     val image:ImageView
     val title:TextView
     val description:TextView

    init {
        image=myView.findViewById(R.id.image)
        title=myView.findViewById(R.id.title)
        description=myView.findViewById(R.id.description)
    }

}