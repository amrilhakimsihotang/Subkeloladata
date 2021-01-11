package com.amrilhakimsihotang.subkeloladata.roomfav.helper

import androidx.recyclerview.widget.DiffUtil
import com.amrilhakimsihotang.subkeloladata.roomfav.table.TiviFav

class TiviDiffCallback (private val mOldFavTiviList: List<TiviFav>, private val mNewFavTiviList: List<TiviFav>) : DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return mOldFavTiviList.size
    }

    override fun getNewListSize(): Int {
        return mNewFavTiviList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return mOldFavTiviList[oldItemPosition].id == mNewFavTiviList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldFavoriteMovie = mOldFavTiviList[oldItemPosition]
        val newFavoriteMovie = mNewFavTiviList[newItemPosition]
        return oldFavoriteMovie.originalName == newFavoriteMovie.originalName && oldFavoriteMovie.overview == newFavoriteMovie.overview
    }
}