package com.example.app.ui.adaptaters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import app.R
import com.example.app.ui.api.models.Characters
import com.squareup.picasso.Picasso


/**
 * Product adapter
 *
 * Allow to change dynamically the cart view
 */
class CharatersAdapter(listCharacters: MutableList<Characters>) :
    RecyclerView.Adapter<CharatersAdapter.ViewHolder>() {
    var listCharacters = listCharacters

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_characters_cell, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCharacters.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        return holder.bind(listCharacters[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var name = itemView.findViewById<TextView>(R.id.name)
        var year = itemView.findViewById<TextView>(R.id.year)
        var imageView = itemView.findViewById<ImageView>(R.id.imageView)

        fun bind(character: Characters) {
            name.text = character.name
            year.text = character.year_released
            if (character.image_url !== null) {
                Picasso.get().load(character.image_url).into(imageView);
            }
        }
    }
}