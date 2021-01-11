package com.amrilhakimsihotang.subkeloladata.data.source

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.paging.DataSource
import com.amrilhakimsihotang.subkeloladata.PagedListUtil
import com.amrilhakimsihotang.subkeloladata.data.source.local.LocalDataSource
import com.amrilhakimsihotang.subkeloladata.data.source.local.entity.MovieEntity
import com.amrilhakimsihotang.subkeloladata.data.source.local.entity.TiviEntity
import com.amrilhakimsihotang.subkeloladata.data.source.remote.RemoteDataSource
import com.amrilhakimsihotang.subkeloladata.utils.AppExecutors
import com.amrilhakimsihotang.subkeloladata.utils.DataDummy
import com.amrilhakimsihotang.subkeloladata.vo.Resource
import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock


class GeneralRepositoryTesting {
    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val remote = mock(RemoteDataSource::class.java)
    private val local = mock(LocalDataSource::class.java)
    private val appExecutors = mock(AppExecutors::class.java)

    private val generalRepository = FakeGeneralRepository(remote, local, appExecutors)
    private val movieResponses = DataDummy.generateRemoteMovie_mock()
    private val tiviResponses = DataDummy.generateRemoteTivishow_mock()

    @Test
    fun getAllMovie() {
        val dataSourceFactory =
            mock(DataSource.Factory::class.java) as DataSource.Factory<Int, MovieEntity>
        `when`(local.getAllFavoriteMovie()).thenReturn(dataSourceFactory)
        generalRepository.getAllMovie()
        val movieEntities =
            Resource.success(PagedListUtil.mockPagedList(DataDummy.generateRemoteMovie_mock()))
        verify(local).getAllFavoriteMovie()
        assertNotNull(movieEntities.data)
        assertEquals(movieResponses.size.toLong(), movieEntities.data?.size?.toLong())
    }

    @Test
    fun getAllTivi() {
        val dataSourceFactory =
            mock(DataSource.Factory::class.java) as DataSource.Factory<Int, TiviEntity>
        `when`(local.getAllFavoriteTivi()).thenReturn(dataSourceFactory)
        generalRepository.getAllTivi()
        val tiviEntities =
            Resource.success(PagedListUtil.mockPagedList(DataDummy.generateRemoteTivishow_mock()))
        verify(local).getAllFavoriteTivi()
        assertNotNull(tiviEntities.data)
        assertEquals(tiviResponses.size.toLong(), tiviEntities.data?.size?.toLong())
    }

}

