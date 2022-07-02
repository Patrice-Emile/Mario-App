package com.example.app.ui.api.models


import java.io.Serializable

/**
 * Meaning of a user
 */
data class Characters(
    var id: String?,
    var name: String?,
    var year_released: String?,
    var image_url: String?,
    var debut_game: String?,
    var createdAt: Long?,
    var updatedAt: Long?,
) : Serializable