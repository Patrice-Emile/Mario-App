package com.example.app.ui.api.models

import java.io.Serializable


/**
 * Meaning of a GamesCharacters
 */
data class GamesCharacters(
    val id: String?,
    val title: String?,
    val year: String?,
    var platformId: Int?,
    val createdAt: String?,
    val updatedAt: String?,
//    val characters : List<Characters>
) : Serializable