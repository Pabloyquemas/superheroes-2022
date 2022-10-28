package com.pgonrod.superheroes2022.data.remote.superheroe

import com.pgonrod.superheroes2022.data.remote.ApiClient
import com.pgonrod.superheroes2022.data.remote.toDomain
import com.pgonrod.superheroes2022.domain.SuperHeroe

class SuperHeroeRemoteDataSource(val apiClient: ApiClient) {

    fun getSuperHeroes(): List<SuperHeroe> {
        val superHeroes = apiClient.getSuperHeroes()
        return superHeroes.map {
            it.toDomain()
        }
    }
}
