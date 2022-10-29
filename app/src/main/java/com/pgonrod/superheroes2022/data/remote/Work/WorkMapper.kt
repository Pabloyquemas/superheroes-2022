package com.pgonrod.superheroes2022.data.remote.Work

import com.pgonrod.superheroes2022.domain.Work

fun WorkApiModel.toDomain() = Work(this.occupation)