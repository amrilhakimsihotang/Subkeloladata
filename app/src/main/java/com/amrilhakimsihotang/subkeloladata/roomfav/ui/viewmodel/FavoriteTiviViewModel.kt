package com.amrilhakimsihotang.subkeloladata.roomfav.ui.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.amrilhakimsihotang.subkeloladata.roomfav.repository.FavRepository
import com.amrilhakimsihotang.subkeloladata.roomfav.table.TiviFav

class FavoriteTiviViewModel(application: Application) : ViewModel() {
    private val favRepository: FavRepository = FavRepository(application)

       fun getAllTiviFav(): LiveData<PagedList<TiviFav>> =  LivePagedListBuilder(favRepository.getAllTivi(),5).build()
  }