package com.mif.composemovieapp.presentation.detailsScreen

import com.mif.composemovieapp.domain.model.Movie

data class DetailsState(
    val isLoading: Boolean = false,
    val movie: Movie? = null
)
