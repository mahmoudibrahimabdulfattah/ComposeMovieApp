package com.mif.composemovieapp.movieList.domain.repository

import com.mif.composemovieapp.movieList.domain.model.Movie
import com.mif.composemovieapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface MovieListRepository {
    suspend fun getMovieList(
        forceFetchFromRemote: Boolean,
        category: String,
        page: Int
    ): Flow<Resource<List<Movie>>>

    suspend fun getMovie(id: Int): Flow<Resource<Movie>>
}