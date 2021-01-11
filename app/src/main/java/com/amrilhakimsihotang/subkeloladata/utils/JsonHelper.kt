package com.amrilhakimsihotang.subkeloladata.utils

import android.content.Context
import com.amrilhakimsihotang.subkeloladata.data.source.remote.response.MovieResponse
import com.amrilhakimsihotang.subkeloladata.data.source.remote.response.TiviResponse
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException

class JsonHelper(private val context: Context) {

    private fun parsingFileToString(fileName: String): String? {
        return try {
            val `is` = context.assets.open(fileName)
            val buffer = ByteArray(`is`.available())
            `is`.read(buffer)
            `is`.close()
            String(buffer)
        } catch (e: IOException) {
            e.printStackTrace()
            null
        }
    }

    fun loadMovie(): List<MovieResponse> {
        val list = ArrayList<MovieResponse>()
        try {
            val responseObject = JSONObject(parsingFileToString("MoviesResponse.json").toString())
            val listArray = responseObject.getJSONArray("movie")
            for (i in 0 until listArray.length()) {
                val movie = listArray.getJSONObject(i)

                val id = movie.getString("id")
                val originalTitle = movie.getString("originalTitle")
                val posterPath = movie.getString("posterPath")
                val overview = movie.getString("overview")
                val director = movie.getString("director")
                val writer = movie.getString("writer")
                val screenplay = movie.getString("screenplay")
                val personCast = movie.getString("personCast")
                val movieResponse = MovieResponse(id, originalTitle, posterPath, overview, director, writer, screenplay, personCast)
                list.add(movieResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return list
    }

    fun loadTivi(): List<TiviResponse> {
        val list = ArrayList<TiviResponse>()
        try {
            val responseObject = JSONObject(parsingFileToString("TiviResponse.json").toString())
            val listArray = responseObject.getJSONArray("tivi")
            for (i in 0 until listArray.length()) {
                val tivi = listArray.getJSONObject(i)
                val id = tivi.getString("id")
                val originalName = tivi.getString("originalName")
                val posterPath = tivi.getString("posterPath")
                val overview = tivi.getString("overview")
                val creatorcast = tivi.getString("creatorcast")
                val seriescast = tivi.getString("seriescast")
                val writingcast = tivi.getString("writingcast")

                val tiviResponse = TiviResponse(id, originalName, posterPath, overview, creatorcast, seriescast, writingcast)
                list.add(tiviResponse)
            }
        }catch (e:JSONException){
            e.printStackTrace()
        }
        return list
    }
}

