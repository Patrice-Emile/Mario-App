package com.example.app.ui.api.models

import java.io.Serializable


/**
 * Meaning of a game
 */
data class Games (
    val id: String?,
    val title: String?,
    val year: String?,
    var platformId: String?,
    val createdAt: String?,
    val updatedAt: String?,
) : Serializable