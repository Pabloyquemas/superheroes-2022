package com.pgonrod.superheroes2022.presentation.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.pgonrod.app.extensions.loadUrl
import com.pgonrod.superheroes2022.databinding.ViewItemSuperheroeFeedBinding
import com.pgonrod.superheroes2022.domain.GetSuperHeroeFeedUseCase

class SuperHeroeViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    fun bind(superHeroe: GetSuperHeroeFeedUseCase.SuperHeroeFeed) {
        val binding =
            com.pgonrod.superheroes2022.databinding.ViewItemSuperheroeFeedBinding.bind(view)
        binding.imgSuperheroe.loadUrl(superHeroe.urlImage)
        binding.labelNameSuperheroe.text = superHeroe.nameSuperHeroe
        binding.labelRealnameSuperheroe.text = superHeroe.fullName
        binding.labelOccupationSuperheroe.text = superHeroe.occupation
    }
}

