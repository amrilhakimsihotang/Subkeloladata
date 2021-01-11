package com.amrilhakimsihotang.subkeloladata.data.source.local

import androidx.paging.DataSource
import com.amrilhakimsihotang.subkeloladata.data.source.local.entity.MovieEntity
import com.amrilhakimsihotang.subkeloladata.data.source.local.entity.TiviEntity
import com.amrilhakimsihotang.subkeloladata.data.source.local.roomdb.MovieTiviDao

class LocalDataSource private constructor(private val _movieTiviDao: MovieTiviDao) {
    companion object {
        private var INSTANCE: LocalDataSource? = null

        fun getInstance(movieTiviDao: MovieTiviDao): LocalDataSource =
            INSTANCE ?: LocalDataSource(movieTiviDao)
    }


    fun getAllFavoriteMovie() : DataSource.Factory<Int, MovieEntity> = _movieTiviDao.getMovie()
    fun getAllFavoriteTivi() : DataSource.Factory<Int, TiviEntity> = _movieTiviDao.getTivi()

    fun addMovie(movie: List<MovieEntity>) = _movieTiviDao.addMovie(movie)

    fun addTivi(tivi: List<TiviEntity>) = _movieTiviDao.addTivi(tivi)

}