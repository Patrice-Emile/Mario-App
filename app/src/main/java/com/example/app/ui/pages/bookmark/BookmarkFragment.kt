package com.example.app.ui.pages.bookmark

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import app.databinding.FragmentBookmarkBinding
import app.databinding.FragmentHomeBinding
import com.example.app.ui.adaptaters.GameAdapter
import com.example.app.ui.adaptaters.PlatformsAdapter
import com.example.app.ui.api.getAllGames
import com.example.app.ui.api.getAllPlatforms

/**
 * Fragment Bookmark
 *
 * Show all the favourite user product
 */
class BookmarkFragment : Fragment() {
    // Link this activity to the view xml
    private var _binding: FragmentBookmarkBinding? = null

    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentBookmarkBinding.inflate(inflater, container, false)
        val root: View = binding.root

        getAllPlatforms().observe(viewLifecycleOwner) {
            binding.recyclerViewBookmark.apply {
                layoutManager = GridLayoutManager(context, 2)
                adapter = PlatformsAdapter(it)
            }
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}