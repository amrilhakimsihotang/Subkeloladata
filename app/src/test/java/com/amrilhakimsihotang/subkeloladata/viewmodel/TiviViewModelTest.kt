package com.amrilhakimsihotang.subkeloladata.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.paging.PagedList
import com.amrilhakimsihotang.subkeloladata.data.GeneralRepository
import com.amrilhakimsihotang.subkeloladata.data.source.local.entity.TiviEntity
import com.amrilhakimsihotang.subkeloladata.vo.Resource
import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class TiviViewModelTest {
    private lateinit var tiviViewModel: TiviViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var generalRepository: GeneralRepository

    @Mock
    private lateinit var observer: Observer<Resource<PagedList<TiviEntity>>>

    @Mock
    private lateinit var pagedList: PagedList<TiviEntity>

    @Before
    fun setup() {
        tiviViewModel = TiviViewModel(generalRepository)
    }

    @Test
    fun getTivi() {

        val dummyTivi = Resource.success(pagedList)
        `when`(dummyTivi.data?.size).thenReturn(10)
        val tivi = MutableLiveData<Resource<PagedList<TiviEntity>>>()
        tivi.value = dummyTivi

        `when`(generalRepository.getAllTivi()).thenReturn(tivi)
        val tiviEntities = tiviViewModel.getTivishow().value?.data
        verify(generalRepository).getAllTivi()
        assertNotNull(tiviEntities)
        assertEquals(10, tiviEntities?.size)
        tiviViewModel.getTivishow().observeForever(observer)
        verify(observer).onChanged(dummyTivi)
    }
}
