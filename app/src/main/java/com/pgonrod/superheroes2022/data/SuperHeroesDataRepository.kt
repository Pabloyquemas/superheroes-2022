package com.pgonrod.superheroes2022.data

import com.pgonrod.superheroes2022.data.local.xml.SuperHeroeLocalDataSource
import com.pgonrod.superheroes2022.data.remote.superheroe.SuperHeroeRemoteDataSource
import com.pgonrod.superheroes2022.domain.SuperHeroe
import com.pgonrod.superheroes2022.domain.SuperHeroeRepository

class SuperHeroesDataRepository(
    private val localsource: SuperHeroeLocalDataSource,
    private val remoteSource: SuperHeroeRemoteDataSource
): SuperHeroeRepository {
    override fun getSuperHeroe(): List<SuperHeroe> {
        if (localsource.getAll().isEmpty()){
            val heroes = remoteSource.getSuperHeroes()
            if (heroes != null) {
                localsource.save(heroes)
                return heroes
            }
        }
        return emptyList()
    }
}