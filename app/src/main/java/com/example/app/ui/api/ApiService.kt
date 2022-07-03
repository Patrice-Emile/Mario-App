package com.example.app.ui.api

import com.example.app.ui.api.models.Characters
import com.example.app.ui.api.models.Games
import com.example.app.ui.api.models.Platforms
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Interface of all API endpoints
 */
interface ApiService {

    /**
     * Get all game
     *
     * @return the game list
     */
    @GET("games")
    suspend fun getAllGames(): Response<List<Games>>

    /**
     * Get all platform
     *
     * @return the platform list
     */
    @GET("platforms")
    suspend fun getAllPlatforms(): Response<List<Platforms>>

    /**
     * Get the platform of the game
     *
     * @param id the id game
     * @return the platform of the game
     */
    @GET("games/{id}/platform")
    suspend fun getGamePlatform(@Path("id") id: Int): Response<Platforms>


    /**
     * Get all characters
     *
     * @return the characters list
     */
    @GET("characters")
    suspend fun getAllCharacters(): Response<List<Characters>>

//    /**
//     * Get the character of the game
//     *
//     * @param id the id character
//     * @return the character of the game
//     */
//    @GET("games/{id}/platform")
//    suspend fun getGameCharacters(@Path("id") id: String?): Response<GamesCharacters>

}


