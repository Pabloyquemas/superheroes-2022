package com.pgonrod.app.commons

import com.google.gson.Gson
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

interface KSerializer {
    fun <T> fromJson(json: String, classObj: Class<T>): T
    fun <T> toJson(obj: T, classObj: Class<T>): String
}

class GsonJserializer: KSerializer{
    private val gson = Gson()
    override fun <T> fromJson(json: String, classObj: Class<T>): T {
        return gson.fromJson(json, classObj)
    }

    override fun <T> toJson(obj: T, classObj: Class<T>): String {
        return gson.toJson(obj, classObj)
    }
}

    class MoshiJserializer : KSerializer{
        val moshi: Moshi = Moshi
            .Builder()
            .addLast(KotlinJsonAdapterFactory())
            .build()

        override fun <T> fromJson(json: String, classObj: Class<T>): T {
            return moshi.adapter(classObj).fromJson(json)!!
        }

        override fun <T> toJson(obj: T, classObj: Class<T>): String {
            return moshi.adapter(classObj).toJson(obj)!!
        }
    }