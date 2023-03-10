package com.example.layoutinflator

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_movie.view.*

class MoviesAdapter(val movies : List<Movie>) : RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_movie, parent,false))
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
 val movie = movies[position]
        holder.view.textViewTitle.text = movie.title
        holder.view.textViewLanguage.text = movie.language
        holder.view.textViewType.text = movie.type
        holder.view.textViewRating.text = movie.rating
        holder.view.textViewLikePercent.text = movie.likePercent.toString()+ "%"
        holder.view.textViewVotesCount.text = movie.voteCount.toString()+" Votes"
    }

    override fun getItemCount() = movies.size

    class MovieViewHolder(val view : View) : RecyclerView.ViewHolder(view)
}