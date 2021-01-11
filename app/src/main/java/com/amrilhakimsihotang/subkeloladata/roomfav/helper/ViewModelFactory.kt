package com.amrilhakimsihotang.subkeloladata.roomfav.helper

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.amrilhakimsihotang.subkeloladata.roomfav.ui.viewmodel.FavoriteMovieViewModel
import com.amrilhakimsihotang.subkeloladata.roomfav.ui.viewmodel.FavoriteTiviViewModel

class ViewModelFactory private constructor(private val mApplication: Application) :
    ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var INSTANCE: ViewModelFactory? = null

        @JvmStatic
        fun getInstance(application: Application): ViewModelFactory {
            if (INSTANCE == null) {
                synchronized(ViewModelFactory::class.java) {
                    if (INSTANCE == null) {
                        INSTANCE = ViewModelFactory(application)
                    }
                }
            }
            return INSTANCE as ViewModelFactory
        }
    }

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FavoriteMovieViewModel::class.java)) {
            return FavoriteMovieViewModel(mApplication) as T
        } else if (modelClass.isAssignableFrom(FavoriteTiviViewModel::class.java)) {
            return FavoriteTiviViewModel(mApplication) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
    }
}