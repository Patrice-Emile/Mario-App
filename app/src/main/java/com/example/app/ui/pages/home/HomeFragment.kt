package com.example.app.ui.pages.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import app.databinding.FragmentHomeBinding
import com.example.app.ui.LIST_ALL_GAME
import com.example.app.ui.adaptaters.GameAdapter
import com.example.app.ui.api.getAllGames

/**
 * Fragment Home page
 *
 * Show all product available and all popular product
 */
class HomeFragment : Fragment() {

    // Link this fragment to the view xml
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        getAllGames().observe(viewLifecycleOwner) {
            binding.recyclerViewWhatIsUp.apply {
                layoutManager = GridLayoutManager(context, 2)
                adapter = GameAdapter(it)
            }
        }
        return root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

