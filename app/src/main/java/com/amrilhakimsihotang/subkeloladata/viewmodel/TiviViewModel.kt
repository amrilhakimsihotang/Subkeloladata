package com.amrilhakimsihotang.subkeloladata.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.amrilhakimsihotang.subkeloladata.data.GeneralRepository
import com.amrilhakimsihotang.subkeloladata.data.source.local.entity.TiviEntity
import com.amrilhakimsihotang.subkeloladata.vo.Resource

class TiviViewModel(private val generalRepository: GeneralRepository): ViewModel() {

    fun getTivishow(): LiveData<Resource<PagedList<TiviEntity>>> = generalRepository.getAllTivi()

}