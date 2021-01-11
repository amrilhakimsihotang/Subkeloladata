package com.amrilhakimsihotang.subkeloladata.data.source.remote.response


data class MovieResponse(
        val id: String,
        val originalTitle: String,
        val posterPath: String,
        val overview: String,
        val director: String,
        val writer: String,
        val screenplay: String,
        val personCast: String
)