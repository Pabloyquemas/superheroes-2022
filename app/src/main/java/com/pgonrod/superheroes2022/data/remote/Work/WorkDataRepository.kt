package com.pgonrod.superheroes2022.data.remote.Work

import com.pgonrod.superheroes2022.domain.Work
import com.pgonrod.superheroes2022.domain.WorkRepository

class WorkDataRepository(private val remoteDataSource: WorkRemoteDataSource): WorkRepository {
    override fun getwork(superHeroeId: Int): Work {
        return remoteDataSource.getWork(superHeroeId) ?: Work("Programador")
    }
}