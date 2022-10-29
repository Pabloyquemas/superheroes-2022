package com.pgonrod.superheroes2022.data.local

import com.pgonrod.superheroes2022.domain.SuperHeroe

interface SuperHeroeLocalDataSource {

    fun save(superHeroe: List<SuperHeroe>)
    fun getAll(): List<SuperHeroe>
    fun findById(superHeroeId: Int) : SuperHeroe?
    fun delete(superHeroeId: Int)
}