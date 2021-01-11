package com.amrilhakimsihotang.subkeloladata.data.source.local.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tivientities")
class TiviEntity(
        @PrimaryKey
        @NonNull
        @ColumnInfo(name="id")
        var id: String,

        @ColumnInfo(name="originalName")
        var originalName: String,

        @ColumnInfo(name="posterPath")
        var posterPath: String,

        @ColumnInfo(name="overview")
        var overview: String,

        @ColumnInfo(name="creatorCast")
        var creatorCast: String,

        @ColumnInfo(name="seriesCast")
        var seriesCast: String,

        @ColumnInfo(name="writingCast")
        var writingCast: String
)
