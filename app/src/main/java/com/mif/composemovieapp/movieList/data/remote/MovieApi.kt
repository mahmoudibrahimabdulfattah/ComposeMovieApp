package com.mif.composemovieapp.movieList.data.remote

import com.mif.composemovieapp.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieApi {
    @GET("movie/{category}")
    suspend fun getMovieList(
        @Path("category") category: String,
        @Query("page") page: Int,
        @Query("api_key") apiKey: String = BuildConfig.API_KEY
    )
}