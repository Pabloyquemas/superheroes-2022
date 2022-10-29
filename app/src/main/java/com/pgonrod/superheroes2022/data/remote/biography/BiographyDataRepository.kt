package com.pgonrod.superheroes2022.data.remote.biography

import com.pgonrod.superheroes2022.data.remote.ApiClient
import com.pgonrod.superheroes2022.data.remote.superheroe.SuperHeroeRemoteDataSource
import com.pgonrod.superheroes2022.domain.Biography
import com.pgonrod.superheroes2022.domain.BiographyRepository
import com.pgonrod.superheroes2022.domain.SuperHeroe

class BiographyDataRepository (private val remoteDataSource: BiographyRemoteDataSource) : BiographyRepository {
    override fun getBiography(superHeroeId: Int): Biography {
        return remoteDataSource.getBiography(superHeroeId) ?: Biography("test")
    }


}