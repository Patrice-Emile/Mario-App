package com.example.app.ui.pages.search


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.databinding.ActivityResultSearchBinding


/**
 * Activity ResultSearchActivity
 *
 * Show to the user the result of the his search for the selected category
 */
class ResultSearchActivity : AppCompatActivity() {

    // Link this activity to the view xml
    private lateinit var binding: ActivityResultSearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultSearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
//
//        binding.recyclerViewSearchResult.apply {
//            layoutManager =
//                GridLayoutManager(applicationContext, 2)
//            adapter = GameAdapter(LIST_ALL_PRODUCT_SORT_BY_CATEGORY)
//        }
    }


}

