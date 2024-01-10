package com.mif.composemovieapp.data.remote

import com.mif.composemovieapp.BuildConfig
import com.mif.composemovieapp.data.remote.respond.MovieListDto
import com.mif.composemovieapp.util.Constant
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieApi {
    @GET("movie/{category}")
    suspend fun getMoviesList(
        @Path("category") category: String,
        @Query("page") page: Int,
        @Query("api_key") apiKey: String = Constant.API_KEY
    ): MovieListDto
}