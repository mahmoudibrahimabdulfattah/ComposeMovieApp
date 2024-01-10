package com.mif.composemovieapp.presentation.homeScreen

import com.mif.composemovieapp.domain.model.Movie

data class MovieListState(
    val isLoading: Boolean = false,

    val popularMovieListPage: Int = 1,
    val upcomingMovieListPage: Int = 1,

    var isCurrentPopularScreen: Boolean = true,

    val popularMovieList: List<Movie> = emptyList(),
    val upcomingMovieList: List<Movie> = emptyList()
)
