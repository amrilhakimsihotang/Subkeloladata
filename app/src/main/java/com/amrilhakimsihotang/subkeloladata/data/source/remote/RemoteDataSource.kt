package com.amrilhakimsihotang.subkeloladata.data.source.remote

import android.os.Handler
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.amrilhakimsihotang.subkeloladata.data.source.remote.response.MovieResponse
import com.amrilhakimsihotang.subkeloladata.data.source.remote.response.TiviResponse
import com.amrilhakimsihotang.subkeloladata.utils.EspressoIdlingResource
import com.amrilhakimsihotang.subkeloladata.utils.JsonHelper


class RemoteDataSource private constructor(private val jsonHelper: JsonHelper) {
    private val handler = Handler()

    companion object {
        private const val SERVICE_LATENCY_IN_MILLIS: Long = 2000

        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(helper: JsonHelper): RemoteDataSource =
                instance ?: synchronized(this) {
                    instance ?: RemoteDataSource(helper)
                }
    }

    fun getAllMovie(): LiveData<ApiResponse<List<MovieResponse>>> {
        EspressoIdlingResource.increment()
        val resultMovie = MutableLiveData<ApiResponse<List<MovieResponse>>>()
        handler.postDelayed({
                    resultMovie.value = ApiResponse.success(jsonHelper.loadMovie())
                    EspressoIdlingResource.decrement()
                }, SERVICE_LATENCY_IN_MILLIS)
            return resultMovie
    }


    fun getAllTivi():LiveData<ApiResponse<List<TiviResponse>>> {
        EspressoIdlingResource.increment()
        val resultTivi = MutableLiveData<ApiResponse<List<TiviResponse>>>()
        handler.postDelayed(
                {
                    resultTivi.value = ApiResponse.success(jsonHelper.loadTivi())
                    EspressoIdlingResource.decrement()
                },SERVICE_LATENCY_IN_MILLIS)
        return resultTivi
    }

}

