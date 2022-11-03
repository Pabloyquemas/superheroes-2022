package com.pgonrod.superheroes2022.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pgonrod.superheroes2022.R
import com.pgonrod.superheroes2022.domain.GetSuperHeroeFeedUseCase

class SuperHeroeAdapter : RecyclerView.Adapter<SuperHeroeViewHolder>() {

    private val dataItems = mutableListOf<GetSuperHeroeFeedUseCase.SuperHeroeFeed>()

    fun setDataItems(superHeroes: List<GetSuperHeroeFeedUseCase.SuperHeroeFeed>) {
        dataItems.clear()
        dataItems.addAll(superHeroes)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_item_superheroe_feed, parent, false)
        return SuperHeroeViewHolder(view)
    }

    override fun onBindViewHolder(holder: SuperHeroeViewHolder, position: Int) {
        holder.bind(dataItems[position])
    }

    override fun getItemCount(): Int = dataItems.size
}