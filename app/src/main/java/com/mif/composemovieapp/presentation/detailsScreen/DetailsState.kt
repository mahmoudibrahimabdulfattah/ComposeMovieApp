package com.mif.composemovieapp.presentation.detailsScreen

import com.mif.composemovieapp.movieList.domain.model.Movie

data class DetailsState(
    val isLoading: Boolean = false,
    val movie: Movie? = null
)
