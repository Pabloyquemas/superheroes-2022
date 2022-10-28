package com.pgonrod.superheroes2022.data.remote

import com.pgonrod.superheroes2022.data.remote.superheroe.SuperHeroeApiModel
import com.pgonrod.superheroes2022.domain.Biography
import com.pgonrod.superheroes2022.domain.SuperHeroe
import com.pgonrod.superheroes2022.domain.Work
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Endpoints
 *
 */
interface ApiServices {
    @GET("all.json")
    fun getSuperHeroesFeed(): Call<List<SuperHeroeApiModel>>

    @GET("biography/{heroId}.json")
    fun getBiography(@Path("heroId") heroId: Int): Call<BiographyApiModel>

    @GET("work/{heroId}.json")
    fun getWork(@Path("heroId") heroId: Int): Call<WorkApiModel>
}