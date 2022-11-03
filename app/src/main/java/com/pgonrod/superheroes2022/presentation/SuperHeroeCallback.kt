package com.pgonrod.superheroes2022.presentation

import com.pgonrod.superheroes2022.domain.GetSuperHeroeFeedUseCase

interface SuperHeroeCallback {
    fun onCall(superHeroesFeed: List<GetSuperHeroeFeedUseCase.SuperHeroeFeed>)
}