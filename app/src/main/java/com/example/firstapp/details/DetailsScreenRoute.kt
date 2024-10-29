package com.example.firstapp.details

import com.example.firstapp.navigation.Route
import kotlinx.serialization.Serializable

@Serializable
data class DetailsScreenRoute(
    val id: Long
) : Route