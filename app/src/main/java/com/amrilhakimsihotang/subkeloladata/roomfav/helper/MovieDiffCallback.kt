package com.amrilhakimsihotang.subkeloladata.roomfav.helper

import androidx.recyclerview.widget.DiffUtil
import com.amrilhakimsihotang.subkeloladata.roomfav.table.MovieFav

class MovieDiffCallback (private val mOldFavMovieList: List<MovieFav>, private val mNewFavMovieList: List<MovieFav>) : DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return mOldFavMovieList.size
    }

    override fun getNewListSize(): Int {
        return mNewFavMovieList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return mOldFavMovieList[oldItemPosition].id == mNewFavMovieList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldFavoriteMovie = mOldFavMovieList[oldItemPosition]
        val newFavoriteMovie = mNewFavMovieList[newItemPosition]
        return oldFavoriteMovie.originalTitle == newFavoriteMovie.originalTitle && oldFavoriteMovie.overview == newFavoriteMovie.overview
    }
}