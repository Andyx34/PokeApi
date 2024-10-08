package com.example.pokeapi.data

import com.example.pokeapi.model.PokemonDetailsModel
import com.example.pokeapi.service.APIService
import com.example.pokeapi.service.getRetrofitClient
import retrofit2.Response

interface PokemonDetailsRepositoryInterface {
    suspend fun getPokemonDetails(name: String): Response<PokemonDetailsModel>
}

class PokemonDetailsRepository(
    private val apiService: APIService = getRetrofitClient()
): PokemonDetailsRepositoryInterface {
    override suspend fun getPokemonDetails(name: String): Response<PokemonDetailsModel> {
        return apiService.getPokemonDetails(name)
    }
}