package com.example.app.ui.api.models

import java.io.Serializable



// Game ID EXTRA
val GAME_ID_EXTRA = "gameExtra"

/**
 * Meaning of a game
 */
data class Games(
    val id: String?,
    val title: String?,
    val year: String?,
    var platformId: Int?,
    val createdAt: String?,
    val updatedAt: String?,
) : Serializable