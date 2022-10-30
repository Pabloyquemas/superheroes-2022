package com.pgonrod.superheroes2022.presentation

import com.pgonrod.superheroes2022.data.remote.ApiClient
import com.pgonrod.superheroes2022.data.remote.Work.WorkDataRepository
import com.pgonrod.superheroes2022.data.remote.Work.WorkRemoteDataSource
import com.pgonrod.superheroes2022.data.remote.biography.BiographyDataRepository
import com.pgonrod.superheroes2022.data.remote.biography.BiographyRemoteDataSource
import com.pgonrod.superheroes2022.data.remote.superheroe.SuperHeroeDataRepository
import com.pgonrod.superheroes2022.data.remote.superheroe.SuperHeroeRemoteDataSource
import com.pgonrod.superheroes2022.domain.GetSuperHeroeFeedUseCase

class SuperHeroeFactory {

    fun getSuperHeroeUseCase(): GetSuperHeroeFeedUseCase{
        val apiclient = ApiClient()
        return GetSuperHeroeFeedUseCase(
            SuperHeroeDataRepository(SuperHeroeRemoteDataSource(apiclient)),
            BiographyDataRepository(BiographyRemoteDataSource(apiclient)),
            WorkDataRepository(WorkRemoteDataSource(apiclient)),
        )
    }
}