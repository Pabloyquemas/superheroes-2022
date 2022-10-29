package com.pgonrod.superheroes2022.data.remote.biography

import com.google.gson.annotations.SerializedName

data class BiographyApiModel(@SerializedName("fullName") val fullName: String)
