package com.example.app.ui.adaptaters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import app.R
import com.example.app.ui.GAME_ID_EXTRA
import com.example.app.ui.api.models.Games
import com.example.app.ui.pages.home.GameDetailActivity


/**
 * Product adapter
 *
 * Allow to change dynamically the cart view
 */
class GameAdapter(listGames: MutableList<Games>) :
    RecyclerView.Adapter<GameAdapter.ViewHolder>() {
    var listGame = listGames
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_game_cell, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listGame.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, GameDetailActivity::class.java)
            intent.putExtra(GAME_ID_EXTRA, listGame[position])
            holder.itemView.context.startActivity(intent)
        }

        return holder.bind(listGame[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

//        var cardView = itemView.findViewById<CardView>(R.id.cardView)
//        var imageView = itemView.findViewById<ImageView>(R.id.imageView)
        var title = itemView.findViewById<TextView>(R.id.title)
        var year = itemView.findViewById<TextView>(R.id.year)

        fun bind(games: Games) {
            title.text = games.title
            year.text = games.year

//            if (games.image !== null) {
//                Picasso.get().load(games.image).into(imageView);
//            }

        }
    }
}