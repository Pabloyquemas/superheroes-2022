package com.pgonrod.superheroes2022.data.remote.biography

import com.pgonrod.superheroes2022.domain.Biography

fun BiographyApiModel.toDomain() = Biography(this.fullName)
