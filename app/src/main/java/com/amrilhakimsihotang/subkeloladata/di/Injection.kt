package com.amrilhakimsihotang.subkeloladata.di

import android.content.Context
import com.amrilhakimsihotang.subkeloladata.data.GeneralRepository
import com.amrilhakimsihotang.subkeloladata.data.source.local.LocalDataSource
import com.amrilhakimsihotang.subkeloladata.data.source.local.roomdb.MovieTiviDatabase
import com.amrilhakimsihotang.subkeloladata.data.source.remote.RemoteDataSource
import com.amrilhakimsihotang.subkeloladata.utils.AppExecutors
import com.amrilhakimsihotang.subkeloladata.utils.JsonHelper


object Injection {
    fun provideRepository(context: Context): GeneralRepository {
        val database = MovieTiviDatabase.getInstance(context)
        val remoreDataSource = RemoteDataSource.getInstance(JsonHelper(context))
        val localDataSource = LocalDataSource.getInstance(database.movieTiviDao())
        val appExecutors= AppExecutors()
        return GeneralRepository.getInstance(remoreDataSource,localDataSource,appExecutors)
    }
}