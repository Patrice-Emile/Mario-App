package com.example.app.ui.pages.characters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import app.databinding.FragmentChararctersBinding
import com.example.app.ui.adaptaters.CharatersAdapter
import com.example.app.ui.api.getAllCharacters

/**
 * Fragment Search
 *
 * Allow a user to search products by category
 */
class CharactersFragment : Fragment() {

    // Link this activity to the view xml
    private var _binding: FragmentChararctersBinding? = null

    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentChararctersBinding.inflate(inflater, container, false)
        val root: View = binding.root

        getAllCharacters().observe(viewLifecycleOwner) {
            binding.rcvCharacters.apply {
                layoutManager = GridLayoutManager(context, 2)
                adapter = CharatersAdapter(it)
            }
        }
        return root
    }




    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}