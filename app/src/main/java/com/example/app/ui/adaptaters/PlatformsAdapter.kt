package com.example.app.ui.adaptaters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import app.R
import com.example.app.ui.api.models.Platforms


/**
 * Product adapter
 *
 * Allow to change dynamically the cart view
 */
class PlatformsAdapter(listPlatforms: MutableList<Platforms>) :
    RecyclerView.Adapter<PlatformsAdapter.ViewHolder>() {
    var listPlatforms = listPlatforms

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_platfoms_cell, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listPlatforms.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        return holder.bind(listPlatforms[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var name = itemView.findViewById<TextView>(R.id.name)
        var year = itemView.findViewById<TextView>(R.id.year)

        fun bind(platforms: Platforms) {
            name.text = platforms.name
            year.text = platforms.year

        }
    }
}