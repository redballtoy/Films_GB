package com.example.redballtoy.films_gb.view.main_list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.redballtoy.films_gb.R
import com.example.redballtoy.films_gb.model.Film
import com.example.redballtoy.films_gb.model.Films

class FilmListAdapter(
        private val films: List<Film> = Films().getFilms()
) : RecyclerView.Adapter<FilmListAdapter.FilmItem>() {


    class FilmItem(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val poster: ImageView = itemView.findViewById(R.id.ivItemPosterPath)
        private val rating: RatingBar = itemView.findViewById(R.id.rbItemVoteAverage)
        private val title: TextView = itemView.findViewById(R.id.tvItemTitle)


        fun bind(film: Film) {
            //poster.setImageDrawable(itemView.getContext().getDrawable(R.drawable.endgames_poster))
            rating.rating = (film.vote_average / 2.0f).toFloat()
            title.text = film.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmListAdapter.FilmItem {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.movie_list_item, parent, false)
        return FilmListAdapter.FilmItem(itemView)
    }

    override fun onBindViewHolder(holder: FilmListAdapter.FilmItem, position: Int) {
        holder.bind(films[position])
    }

    override fun getItemCount(): Int {
        return films.size
    }


}