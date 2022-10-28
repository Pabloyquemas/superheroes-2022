package com.pgonrod.superheroes2022.data.remote.biography

import com.pgonrod.superheroes2022.data.remote.ApiClient
import com.pgonrod.superheroes2022.data.remote.superheroe.SuperHeroeRemoteDataSource
import com.pgonrod.superheroes2022.domain.Biography
import com.pgonrod.superheroes2022.domain.BiographyRepository
import com.pgonrod.superheroes2022.domain.Repositories
import com.pgonrod.superheroes2022.domain.SuperHeroe

class BiographyDataRepository (val remoteSource: BiographyRemoteDataSource) : BiographyRepository {
    override fun getBiography(superHeroeId: Int): Biography {
        TODO("Not yet implemented")
    }


}