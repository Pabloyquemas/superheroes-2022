package com.pgonrod.superheroes2022.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pgonrod.superheroes2022.domain.GetSuperHeroeFeedUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SuperHeroesViewModel(private val getSuperHeroesFeed: GetSuperHeroeFeedUseCase) : ViewModel() {
    fun loadSuperHeroes(superHeroeCallback: SuperHeroeCallback) {
        viewModelScope.launch(Dispatchers.IO) {
            val superHeroesFeed = getSuperHeroesFeed.execute()
            withContext(Dispatchers.Main) {
                superHeroeCallback.onCall(superHeroesFeed)
            }
        }
    }
}

