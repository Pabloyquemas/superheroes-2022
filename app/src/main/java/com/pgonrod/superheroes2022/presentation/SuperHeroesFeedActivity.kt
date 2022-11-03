package com.pgonrod.superheroes2022.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.pgonrod.superheroes2022.R
import com.pgonrod.superheroes2022.databinding.ActivitySuperheroesFeedBinding
import com.pgonrod.superheroes2022.domain.GetSuperHeroeFeedUseCase
import com.pgonrod.superheroes2022.presentation.adapter.SuperHeroeAdapter
import kotlin.concurrent.thread

class SuperHeroesFeedActivity : AppCompatActivity() {

    private var binding: ActivitySuperheroesFeedBinding? = null
    private val superHeroeAdapter = SuperHeroeAdapter()
    private val viewModel = SuperHeroeFactory().getSuperHeroesViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupView()
        loadSuperHeroes()
    }

    private fun setupBinding() {
        binding = ActivitySuperheroesFeedBinding.inflate(layoutInflater)
        binding?.let {
            setContentView(it.root)
        }
    }

    private fun setupView() {
        binding?.apply {
            listSuperheroe.adapter = superHeroeAdapter
            listSuperheroe.layoutManager =
                LinearLayoutManager(
                    this@SuperHeroesFeedActivity,
                    LinearLayoutManager.VERTICAL,
                    false
                )
        }
    }

    private fun loadSuperHeroes() {
        viewModel.loadSuperHeroes(object : SuperHeroeCallback {
            override fun onCall(superHeroesFeed: List<GetSuperHeroeFeedUseCase.SuperHeroeFeed>) {
                superHeroeAdapter.setDataItems(superHeroesFeed)
            }
        })
    }
}