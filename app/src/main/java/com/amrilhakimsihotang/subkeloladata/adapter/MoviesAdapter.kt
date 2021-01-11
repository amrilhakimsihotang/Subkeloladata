package com.amrilhakimsihotang.subkeloladata.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.amrilhakimsihotang.subkeloladata.R
import com.amrilhakimsihotang.subkeloladata.data.source.local.entity.MovieEntity
import com.amrilhakimsihotang.subkeloladata.databinding.ListMoviesBinding
import com.amrilhakimsihotang.subkeloladata.detail.DetailMoviesActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions



class MoviesAdapter : PagedListAdapter<MovieEntity, MoviesAdapter.MoviesViewHolder>(DIFF_CALLBACK) {

    companion object{
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<MovieEntity>() {
            override fun areItemsTheSame(oldItem: MovieEntity, newItem: MovieEntity): Boolean {
                return oldItem.id == newItem.id
            }
            override fun areContentsTheSame(oldItem: MovieEntity, newItem: MovieEntity): Boolean {
                return oldItem == newItem
            }
        }
    }

    private val listMovies = ArrayList<MovieEntity>()
    fun setMovie(movie: List<MovieEntity>?) {
        if (movie == null) return
        this.listMovies.clear()
        this.listMovies.addAll(movie)
        this.notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val binding = ListMoviesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MoviesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        val movie = listMovies[position]
        holder.bind(listMovies[position])
        holder.itemView.setOnClickListener {

            val id: String = movie.id
            val originalTitle: String = movie.originalTitle
            val posterPath: String = movie.posterPath
            val overview: String = movie.overview
            val director: String = movie.director
            val writer: String = movie.writer
            val screenplay: String = movie.screenplay
            val personCast: String = movie.personCast


            val mIntent = Intent(it.context, DetailMoviesActivity::class.java)
            mIntent.putExtra("id",id)
            mIntent.putExtra("originalTitle", originalTitle)
            mIntent.putExtra("posterPath", posterPath)
            mIntent.putExtra("overview", overview)
            mIntent.putExtra("director", director)
            mIntent.putExtra("writer", writer)
            mIntent.putExtra("screenplay", screenplay)
            mIntent.putExtra("personCast", personCast)
            it.context.startActivity(mIntent)
        }
    }

    override fun getItemCount(): Int = listMovies.size

    inner class MoviesViewHolder(private val binding: ListMoviesBinding) :
            RecyclerView.ViewHolder(binding.root) {
        fun bind(movieEntity: MovieEntity) {
            binding.movieTitle.text = movieEntity.originalTitle
            Glide.with(itemView.context)
                    .load(movieEntity.posterPath)
                    .apply(RequestOptions().override(800, 600))
                    .error(R.drawable.ic_baseline_tag_faces_24)
                    .into(binding.imgPosterMovies)
        }
    }

}