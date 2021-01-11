package com.amrilhakimsihotang.subkeloladata.data.source

import androidx.lifecycle.LiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.amrilhakimsihotang.subkeloladata.data.GeneralDataSource
import com.amrilhakimsihotang.subkeloladata.data.NetworkBoundResource
import com.amrilhakimsihotang.subkeloladata.data.source.local.LocalDataSource
import com.amrilhakimsihotang.subkeloladata.data.source.local.entity.MovieEntity
import com.amrilhakimsihotang.subkeloladata.data.source.local.entity.TiviEntity
import com.amrilhakimsihotang.subkeloladata.data.source.remote.ApiResponse
import com.amrilhakimsihotang.subkeloladata.data.source.remote.RemoteDataSource
import com.amrilhakimsihotang.subkeloladata.data.source.remote.response.MovieResponse
import com.amrilhakimsihotang.subkeloladata.data.source.remote.response.TiviResponse
import com.amrilhakimsihotang.subkeloladata.utils.AppExecutors
import com.amrilhakimsihotang.subkeloladata.vo.Resource
import java.util.*


class FakeGeneralRepository constructor(
        private val remoteDataSource: RemoteDataSource,
        private val localDataSource: LocalDataSource,
        private val appExecutors: AppExecutors
) : GeneralDataSource {

      override fun getAllMovie(): LiveData<Resource<PagedList<MovieEntity>>> {
        return object : NetworkBoundResource<PagedList<MovieEntity>, List<MovieResponse>>(appExecutors) {
            public override fun loadFromDB(): LiveData<PagedList<MovieEntity>> {
                val config = PagedList.Config.Builder()
                    .setEnablePlaceholders(false)
                    .setInitialLoadSizeHint(4)
                    .setPageSize(4)
                    .build()
                return LivePagedListBuilder(localDataSource.getAllFavoriteMovie(),config).build()

            }


            override fun shouldFetch(data: PagedList<MovieEntity>?): Boolean {
                return data == null || data.isEmpty()
            }


            public override fun createCall(): LiveData<ApiResponse<List<MovieResponse>>> {
              return  remoteDataSource.getAllMovie()
            }


            public override fun saveCallResult(movieResponse: List<MovieResponse>) {
                val movieList = ArrayList<MovieEntity>()
                for (response in movieResponse) {
                    val movie = MovieEntity(
                            response.id,
                            response.originalTitle,
                            response.posterPath,
                            response.overview,
                            response.director,
                            response.writer,
                            response.screenplay,
                            response.personCast
                    )
                    movieList.add(movie)
                }

                localDataSource.addMovie(movieList)
            }
        }.asLiveData()

    }


    override fun getAllTivi(): LiveData<Resource<PagedList<TiviEntity>>> {
        return object : NetworkBoundResource<PagedList<TiviEntity>, List<TiviResponse>>(appExecutors) {
            public override fun loadFromDB(): LiveData<PagedList<TiviEntity>> {
                val config = PagedList.Config.Builder()
                    .setEnablePlaceholders(false)
                    .setInitialLoadSizeHint(4)
                    .setPageSize(4)
                    .build()
                return LivePagedListBuilder(localDataSource.getAllFavoriteTivi(),config).build()
            }


            override fun shouldFetch(data: PagedList<TiviEntity>?): Boolean {
                return data == null || data.isEmpty()
            }


            public override fun createCall(): LiveData<ApiResponse<List<TiviResponse>>> {
                return remoteDataSource.getAllTivi()
            }


            public override fun saveCallResult(tiviResponse: List<TiviResponse>) {
                val tiviList = ArrayList<TiviEntity>()
                for (response in tiviResponse) {
                    val tivi = TiviEntity(
                            response.id,
                            response.originalName,
                            response.posterPath,
                            response.overview,
                            response.creatorcast,
                            response.seriescast,
                            response.writingcast,

                            )
                    tiviList.add(tivi)
                }

                localDataSource.addTivi(tiviList)
            }
        }.asLiveData()

    }
}
