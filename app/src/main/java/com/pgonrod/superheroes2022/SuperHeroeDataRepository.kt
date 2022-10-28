package com.pgonrod.superheroes2022

import com.pgonrod.superheroes2022.data.remote.ApiClient
import com.pgonrod.superheroes2022.domain.Repositories
import com.pgonrod.superheroes2022.domain.SuperHeroe


class SuperHeroeDataRepository(val remoteSource : ApiClient) : Repositories {
    override fun getSuperHeroe(): List<SuperHeroe> {
       return remoteSource.getSuperHeroes()
    }
}