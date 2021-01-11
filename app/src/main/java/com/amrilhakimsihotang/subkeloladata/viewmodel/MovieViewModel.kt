package com.amrilhakimsihotang.subkeloladata.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.amrilhakimsihotang.subkeloladata.data.GeneralRepository
import com.amrilhakimsihotang.subkeloladata.data.source.local.entity.MovieEntity
import com.amrilhakimsihotang.subkeloladata.vo.Resource

class MovieViewModel(private val generalRepository: GeneralRepository) : ViewModel() {

   fun getMovie(): LiveData<Resource<PagedList<MovieEntity>>> = generalRepository.getAllMovie()

}