package com.pgonrod.superheroes2022.data.remote.Work

import com.pgonrod.superheroes2022.data.remote.ApiClient
import com.pgonrod.superheroes2022.domain.Work

class WorkRemoteDataSource(private val apiClient: ApiClient) {

    fun getWork(superHeroeId : Int): Work?{
        return apiClient.getWork(superHeroeId)?.toDomain()
    }
}