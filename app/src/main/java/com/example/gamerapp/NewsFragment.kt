package com.example.gamerapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NewsFragment : Fragment() {
    // TODO: Rename and change types of parameters

    private var  news : ArrayList<News> =ArrayList()


    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =  inflater.inflate(R.layout.fragment_news,container,false)
        val recycle = view.findViewById<RecyclerView>(R.id.Rview)
        news.add(News(R.drawable.news_img,"Top 10 Gaming News of the day","Here's the latest news from the gaming and e-sports world"))
        news.add(News(R.drawable.news_img,"Top 10 Gaming News of the day","Here's the latest news from the gaming and e-sports world"))
        news.add(News(R.drawable.news_img,"Top 10 Gaming News of the day","Here's the latest news from the gaming and e-sports world"))
        news.add(News(R.drawable.news_img,"Top 10 Gaming News of the day","Here's the latest news from the gaming and e-sports world"))
        recycle.adapter = NewsAdapter(news)
        recycle.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        return view
    }



}