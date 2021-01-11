package com.amrilhakimsihotang.subkeloladata.data

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.amrilhakimsihotang.subkeloladata.data.source.local.entity.MovieEntity
import com.amrilhakimsihotang.subkeloladata.data.source.local.entity.TiviEntity
import com.amrilhakimsihotang.subkeloladata.vo.Resource


interface GeneralDataSource {

    fun getAllMovie(): LiveData<Resource<PagedList<MovieEntity>>>
    fun getAllTivi(): LiveData<Resource<PagedList<TiviEntity>>>

}