package com.example.app.ui.api.models

import java.io.Serializable


/**
 * Meaning of a Platform
 */
data class Platforms (
    val id: String?,
    val name: String?,
    val year: String?,
    val createdAt: String?,
    val updatedAt: String?,
) : Serializable