package com.pgonrod.superheroes2022.data.local.xml

import android.content.SharedPreferences
import com.pgonrod.app.commons.GsonJserializer
import com.pgonrod.app.commons.KSerializer
import com.pgonrod.superheroes2022.data.local.SuperHeroeLocalDataSource
import com.pgonrod.superheroes2022.domain.SuperHeroe

class SuperHeroesXmlLocalDataSource(
    private val sharedPreferences: SharedPreferences,
    private val jserializer: KSerializer
    ) : SuperHeroeLocalDataSource {

        override fun save(superHeroes: List<SuperHeroe>){
            superHeroes.forEach { superHeroe ->
                sharedPreferences.edit().apply{
                    putString(
                        superHeroe.id.toString(),
                        jserializer.toJson(superHeroe, SuperHeroe::class.java)
                    )
                }
            }
        }

        override fun getAll(): List<SuperHeroe> = sharedPreferences.all.map {
            jserializer.fromJson(it.value as String, SuperHeroe::class.java)
        }

        override fun findById(superHeroeId: Int): SuperHeroe?{
            return sharedPreferences.getString(superHeroeId.toString(), null)?.let {
                jserializer.fromJson(it, SuperHeroe::class.java)
            }
        }

        override fun delete(superHeroeId: Int){
            sharedPreferences.edit().remove(superHeroeId.toString()).apply()
        }
}