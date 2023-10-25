package com.example.gamerapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StoreFragment : Fragment() {
    private var  games : ArrayList<Game> =ArrayList()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_store,container,false)
        val recycle = view.findViewById<RecyclerView>(R.id.storeRview)
        games.add(Game(R.drawable.game2,"Marvel's Spider-Man: Miles Morales","PS5 Games", 80.5F))
        games.add(Game(R.drawable.game2,"Marvel's Spider-Man: Miles Morales","PS5 Games", 80.5F))
        games.add(Game(R.drawable.game2,"Marvel's Spider-Man: Miles Morales","PS5 Games", 80.5F))
        games.add(Game(R.drawable.game2,"Marvel's Spider-Man: Miles Morales","PS5 Games", 80.5F))
        games.add(Game(R.drawable.game2,"Marvel's Spider-Man: Miles Morales","PS5 Games", 80.5F))

        recycle.adapter = StoreAdapter(games)
        recycle.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        return view
    }


}