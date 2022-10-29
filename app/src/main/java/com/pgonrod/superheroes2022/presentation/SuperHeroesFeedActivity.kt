package com.pgonrod.superheroes2022.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pgonrod.superheroes2022.R
import kotlin.concurrent.thread

class SuperHeroesFeedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_superheroes_feed)
        test()
    }

    private fun test(){
        val usecase = SuperHeroeFactory().getSuperHeroeUseCase()
        thread {

            val model = usecase.execute()
            Log.d("@dev", "Modelo: $model")

        }
    }
}