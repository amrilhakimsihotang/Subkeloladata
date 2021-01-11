package com.amrilhakimsihotang.subkeloladata.roomfav.table

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "moviefavo_table")
@Parcelize
data class MovieFav(
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "no")
        val idn: Int=0,

        @ColumnInfo(name = "id")
        var id: String?= null,

        @ColumnInfo(name = "originalTitle")
        var originalTitle: String?= null,

        @ColumnInfo(name = "posterPath")
        var posterPath: String?= null,

        @ColumnInfo(name = "overview")
        var overview: String?= null,

        @ColumnInfo(name = "director")
        var director: String?= null

):Parcelable