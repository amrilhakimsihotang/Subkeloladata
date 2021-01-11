package com.amrilhakimsihotang.subkeloladata.roomfav.ui.favorite.favomovie

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.amrilhakimsihotang.subkeloladata.R
import com.amrilhakimsihotang.subkeloladata.databinding.ListFavmoviesBinding
import com.amrilhakimsihotang.subkeloladata.roomfav.helper.MovieDiffCallback
import com.amrilhakimsihotang.subkeloladata.roomfav.table.MovieFav
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class FavoMovieAdapter(private val activity: Activity): RecyclerView.Adapter<FavoMovieAdapter.FavMovieViewHolder>() {

    private val listFavMovie = ArrayList<MovieFav>()

    fun setListFavMovie(listFavMovie: List<MovieFav>) {
        val diffCallbacks = MovieDiffCallback(this.listFavMovie,listFavMovie)
        val diffResult = DiffUtil.calculateDiff(diffCallbacks)
        this.listFavMovie.clear()
        this.listFavMovie.addAll(listFavMovie)
        diffResult.dispatchUpdatesTo(this)
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavMovieViewHolder {
        val binding = ListFavmoviesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FavMovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FavMovieViewHolder, position: Int) {
        val favMovie = listFavMovie[position]
        holder.bind(listFavMovie[position])
        holder.itemView.setOnClickListener {
            val movieIntent = MovieFav(
                    favMovie.idn,
                    favMovie.id,
                    favMovie.originalTitle,
                    favMovie.posterPath,
                    favMovie.overview,
                    favMovie.director,
            )
            val mIntent = Intent(it.context, FavMovieDetailActivity::class.java)
            mIntent.putExtra(FavMovieDetailActivity.DETAIL_FAV_MOVIES, movieIntent)
            it.context.startActivity(mIntent)
        }
    }

    override fun getItemCount(): Int = listFavMovie.size

    inner class FavMovieViewHolder(private val binding: ListFavmoviesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movieFav: MovieFav) {
            binding.moviefavTitle.text = movieFav.originalTitle
            Glide.with(itemView.context)
                .load(movieFav.posterPath)
                .apply(RequestOptions().override(800, 600))
                .error(R.drawable.ic_baseline_tag_faces_24)
                .into(binding.imgPosterMovies)
        }
    }


}