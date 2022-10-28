package com.pgonrod.superheroes2022.domain

data class SuperHeroe(val id : Int, val name : String, val UrlImages: List<String>){
    fun getUrlImageS(): String = UrlImages[0]
    fun getUrlImageM(): String = UrlImages[0]
    fun getUrlImageL(): String = UrlImages[0]
    fun getUrlImageXL(): String = UrlImages[0]
}
data class Biography(val realName : String)
data class Work(val occupation : String)
