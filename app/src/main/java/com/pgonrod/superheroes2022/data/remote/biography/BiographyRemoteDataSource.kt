package com.pgonrod.superheroes2022.data.remote.biography

import com.pgonrod.superheroes2022.data.remote.ApiClient
import com.pgonrod.superheroes2022.domain.Biography

class BiographyRemoteDataSource (val apiClient: ApiClient) {

    fun getBiography(superHeroeId: Int): Biography? =
        return apiClient.getBiography(superHeroeId)?: Biography
}