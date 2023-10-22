package com.example.gamerapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter (val news:ArrayList<News>): RecyclerView.Adapter<NewsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context).
        inflate(R.layout.news_single_item, parent, false) as View
        return NewsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  news.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.title.text=news[position].title
        holder.description.text=news[position].description
        holder.image.setImageResource( news[position].image)
    }
}