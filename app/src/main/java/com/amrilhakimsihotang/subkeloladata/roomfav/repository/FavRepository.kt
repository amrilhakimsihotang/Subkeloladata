package com.amrilhakimsihotang.subkeloladata.roomfav.repository

import android.app.Application
import androidx.paging.DataSource
import com.amrilhakimsihotang.subkeloladata.roomfav.dao.FavoriteDao
import com.amrilhakimsihotang.subkeloladata.roomfav.db.FavoriteDB
import com.amrilhakimsihotang.subkeloladata.roomfav.table.MovieFav
import com.amrilhakimsihotang.subkeloladata.roomfav.table.TiviFav
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class FavRepository(application: Application) {
    private val favoriteDao: FavoriteDao
    private val executorService: ExecutorService = Executors.newSingleThreadExecutor()

    init {
        val db = FavoriteDB.getDatabase(application)
        favoriteDao = db.favoriteDao()
    }


    fun getAllMovie(): DataSource.Factory<Int, MovieFav> = favoriteDao.getAllMovieFav()


    fun addFavMovie(movieFav: MovieFav) {
         executorService.execute { favoriteDao.insert(movieFav)}
    }

    fun delAllFavMovie(movieFav: MovieFav) {
        executorService.execute { favoriteDao.delete(movieFav)}
    }

    fun delAllFavMovie() {
        executorService.execute { favoriteDao.delAllMovieFav()}
    }


    ///tivi favorit
    fun getAllTivi(): DataSource.Factory<Int, TiviFav> = favoriteDao.getAllTiviFav()

    fun addFavTivi(tiviFav: TiviFav){
        executorService.execute { favoriteDao.insert(tiviFav) }
    }
    fun delAllFavTivi(tiviFav: TiviFav){
        executorService.execute { favoriteDao.delete(tiviFav) }
    }

    fun delAllFavTiviShow() {
        executorService.execute { favoriteDao.delAllTiviShowFav()}
    }


}

