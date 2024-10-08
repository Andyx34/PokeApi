package com.example.pokeapi.data

import android.util.Log
import com.example.pokeapi.model.PokemonListModel
import com.example.pokeapi.service.APIService
import com.example.pokeapi.service.getRetrofitClient
import retrofit2.Response

interface PokemonListRepositoryInterface {
    suspend  fun  getPokemonList (offset: Int , limit: Int ) : Response<PokemonListModel>
}

class PokemonListRepository(
    private val apiService: APIService = getRetrofitClient()
): PokemonListRepositoryInterface {
    override suspend fun getPokemonList(offset: Int, limit: Int): Response<PokemonListModel> {
        Log.d("Repository getPokemonList", "$offset, $limit")
        return apiService.getPokemonList(offset = offset, limit = limit)
    }
}