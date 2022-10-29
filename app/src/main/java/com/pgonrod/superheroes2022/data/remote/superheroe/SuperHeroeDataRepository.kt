package com.pgonrod.superheroes2022.data.remote.superheroe

import com.pgonrod.superheroes2022.domain.SuperHeroe
import com.pgonrod.superheroes2022.domain.SuperHeroeRepository

class SuperHeroeDataRepository(val remoteSource: SuperHeroeRemoteDataSource) : SuperHeroeRepository{
    override fun getSuperHeroe(): List<SuperHeroe> {
        return remoteSource.getSuperHeroes()
    }


}
