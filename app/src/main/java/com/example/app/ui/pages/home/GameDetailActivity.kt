package com.example.app.ui.pages.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.databinding.ActivityGameDetailBinding
import com.example.app.ui.GAME_ID_EXTRA
import com.example.app.ui.api.models.Games

/**
 * Activity of product detail page
 *
 * Show more detail about the selected product
 */
class GameDetailActivity : AppCompatActivity() {

    // Link this activity to the view xml
    private lateinit var binding: ActivityGameDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val games: Games? = intent.getSerializableExtra(GAME_ID_EXTRA) as Games?

    }
}