package com.amrilhakimsihotang.subkeloladata.roomfav.ui.favorite.favomovie

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.amrilhakimsihotang.subkeloladata.R
import com.amrilhakimsihotang.subkeloladata.databinding.ListFavmoviesBinding
import com.amrilhakimsihotang.subkeloladata.roomfav.table.MovieFav
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class FavoMoviePagedListAdapter(private val activity: Activity) :
    PagedListAdapter<MovieFav, FavoMoviePagedListAdapter.FavMovieViewHolder>(DIFF_CALLBACK) {
    companion object {
        private val DIFF_CALLBACK: DiffUtil.ItemCallback<MovieFav> =
            object : DiffUtil.ItemCallback<MovieFav>() {

                override fun areItemsTheSame(oldItem: MovieFav, newItem: MovieFav): Boolean {
                    return oldItem.id == oldItem.id && oldItem.originalTitle == newItem.originalTitle
                }

                @SuppressLint("DiffUtilEquals")
                override fun areContentsTheSame(oldItem: MovieFav, newItem: MovieFav): Boolean {
                    return oldItem == newItem
                }
            }
    }

    inner class FavMovieViewHolder(private val binding: ListFavmoviesBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(movieFav: MovieFav) {

               Glide.with(itemView.context)
                   .load(movieFav.posterPath)
                   .apply(RequestOptions().override(800, 600))
                   .error(R.drawable.ic_baseline_tag_faces_24)
                   .into(binding.imgPosterMovies)
                   binding.moviefavTitle.text = movieFav.originalTitle
                   binding.moviefavId.text = itemView.context.getString(R.string.gen_favo_id, movieFav.id)
                   binding.moviefavTitle.text =  itemView.context.getString(R.string.fav_title_general,movieFav.originalTitle)
                    binding.moviefavOverview.text = itemView.context.getString(R.string.fav_overview_general,movieFav.overview)
                    binding.moviefavDirector.text = itemView.context.getString(R.string.fav_director_general,movieFav.director)
                 binding.cvfavomovie.setOnClickListener {
                     val mIntent = Intent(activity, FavMovieDetailActivity::class.java)
                     mIntent.putExtra(FavMovieDetailActivity.EXTRA_POSITION, adapterPosition)
                     mIntent.putExtra(FavMovieDetailActivity.DETAIL_FAV_MOVIES, movieFav)
                activity.startActivityForResult(mIntent, FavMovieDetailActivity.RESULT_DELETE)
             }


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavMovieViewHolder {
        val binding =
            ListFavmoviesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FavMovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FavMovieViewHolder, position: Int) {

        holder.bind(getItem(position) as MovieFav)
    }

}