package com.pgonrod.superheroes2022.domain

interface Repositories {
    fun getSuperHeroe(): List<SuperHeroe>
}

interface BiographyRepository{
    fun getBiography(superHeroeId: Int) : Biography
}

interface WorkRepository{
    fun getwork(superHeroeId: Int) : Work
}