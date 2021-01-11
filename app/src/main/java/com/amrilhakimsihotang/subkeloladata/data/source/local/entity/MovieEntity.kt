package com.amrilhakimsihotang.subkeloladata.data.source.local.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movieentities")
data class MovieEntity(
        @PrimaryKey
        @NonNull
        @ColumnInfo(name = "id")
        var id: String,

        @ColumnInfo(name = "originalTitle")
        var originalTitle: String,

        @ColumnInfo(name = "posterPath")
        var posterPath: String,

        @ColumnInfo(name = "overview")
        var overview: String,

        @ColumnInfo(name = "director")
        var director: String,

        @ColumnInfo(name = "writer")
        var writer: String,

        @ColumnInfo(name = "screenplay")
        var screenplay: String,

        @ColumnInfo(name = "personCast")
        var personCast: String,

        @ColumnInfo(name = "Favorite")
        var Favorite: Boolean = false
)