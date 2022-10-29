package com.pgonrod.superheroes2022.domain

import com.pgonrod.superheroes2022.data.remote.superheroe.SuperHeroeDataRepository

class GetSuperHeroeFeedUseCase (
    private val superHeroeRepository: SuperHeroeRepository,
    private val biographyRepository: BiographyRepository,
    private val workRepository: WorkRepository
    ) {

    fun execute(): List<SuperHeroeFeed>{
        val superHeroes = superHeroeRepository.getSuperHeroe().subList(0, 5)

            val list = superHeroes.map { superHeroe ->
                val work = workRepository.getwork(superHeroe.id)
                val biography = biographyRepository.getBiography(superHeroe.id)

            SuperHeroeFeed(
                superHeroe.id,
                superHeroe.name,
                superHeroe.getUrlImageM(),
                work.occupation,
                biography.fullName
            )

        }
        return list
    }

    data class SuperHeroeFeed(
        val id: Int,
        val nameSuperHeroe: String,
        val urlImage: String,
        val occupation: String,
        val fullName: String
        )
}