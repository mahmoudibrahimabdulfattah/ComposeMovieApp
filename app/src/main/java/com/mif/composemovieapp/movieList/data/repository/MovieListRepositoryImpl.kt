package com.mif.composemovieapp.movieList.data.repository

import com.mif.composemovieapp.movieList.data.local.MovieDatabase
import com.mif.composemovieapp.movieList.data.remote.MovieApi
import com.mif.composemovieapp.movieList.domain.model.Movie
import com.mif.composemovieapp.movieList.domain.repository.MovieListRepository
import com.mif.composemovieapp.movieList.util.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MovieListRepositoryImpl @Inject constructor(
    private val movieApi: MovieApi,
    private val movieDatabase: MovieDatabase
): MovieListRepository {
    override suspend fun getMovieList(
        forceFetchFromRemote: Boolean,
        category: String,
        page: Int
    ): Flow<Resource<List<Movie>>> {
        TODO("Not yet implemented")
    }

    override suspend fun getMovie(id: Int): Flow<Resource<Movie>> {
        TODO("Not yet implemented")
    }

}