package com.pgonrod.superheroes2022.data.remote

import com.pgonrod.superheroes2022.data.remote.superheroe.SuperHeroeApiModel
import com.pgonrod.superheroes2022.domain.SuperHeroe

fun SuperHeroeApiModel.toDomain(): SuperHeroe {
    return SuperHeroe(
        this.id, this.name, listOf(
            this.images.xs, this.images.sm, this.images.md, this.images.lg
        )
    )
}