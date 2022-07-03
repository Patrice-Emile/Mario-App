package com.example.app.ui.pages.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import app.databinding.ActivityGameDetailBinding
import com.example.app.ui.adaptaters.PlatformsAdapter
import com.example.app.ui.api.getGamePlatform
import com.example.app.ui.api.models.GAME_ID_EXTRA
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

        val game: Games? = intent.getSerializableExtra(GAME_ID_EXTRA) as Games?
        println(game)
        if (game?.id != null) {
            getGamePlatform(game?.platformId!!).observe(this) {
                println(it)
                binding.rcvPlatforms.apply {
                    layoutManager = LinearLayoutManager(context)
                    adapter = PlatformsAdapter(mutableListOf(it))
                }
            }
//            getGameCharacters(game?.id).observe(this) {
//                binding.rcvCharacters.apply {
//                    layoutManager = GridLayoutManager(context, 3)
//                    adapter = CharatersAdapter(mutableListOf(it))
//                }
//            }
        }
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
    }
}