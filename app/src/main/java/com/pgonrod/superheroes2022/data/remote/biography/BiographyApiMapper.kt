package com.pgonrod.superheroes2022.data.remote.biography

import com.pgonrod.superheroes2022.data.remote.superheroe.Superheroes
import com.pgonrod.superheroes2022.domain.Biography
import com.pgonrod.superheroes2022.domain.SuperHeroe

fun BiographyModel.toDomain(): Biography{
    return Biography(this.realName)
}