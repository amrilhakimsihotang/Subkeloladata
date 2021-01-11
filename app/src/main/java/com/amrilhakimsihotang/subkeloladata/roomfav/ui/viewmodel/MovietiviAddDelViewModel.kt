package com.amrilhakimsihotang.subkeloladata.roomfav.ui.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import com.amrilhakimsihotang.subkeloladata.roomfav.repository.FavRepository
import com.amrilhakimsihotang.subkeloladata.roomfav.table.MovieFav
import com.amrilhakimsihotang.subkeloladata.roomfav.table.TiviFav

class MovietiviAddDelViewModel (application: Application) : ViewModel() {

    private val favRepository: FavRepository = FavRepository(application)

    fun insert(movieFav: MovieFav) {
        favRepository.addFavMovie(movieFav)
    }

    fun delete(movieFav: MovieFav) {
        favRepository.delAllFavMovie(movieFav)
    }

    fun delAllMovieFav() {
        favRepository.delAllFavMovie()
    }

    //tivi

    fun insert(tiviFav: TiviFav){
        favRepository.addFavTivi(tiviFav)
    }


    fun delAllTiviFav() {
        favRepository.delAllFavTiviShow()
    }

    fun delete(tiviFav: TiviFav){
        favRepository.delAllFavTivi(tiviFav)
    }

}