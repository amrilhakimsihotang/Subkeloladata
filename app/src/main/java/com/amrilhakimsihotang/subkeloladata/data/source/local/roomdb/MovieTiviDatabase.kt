package com.amrilhakimsihotang.subkeloladata.data.source.local.roomdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.amrilhakimsihotang.subkeloladata.data.source.local.entity.MovieEntity
import com.amrilhakimsihotang.subkeloladata.data.source.local.entity.TiviEntity


@Database(
    entities = [MovieEntity::class,
        TiviEntity::class], version = 1, exportSchema = false
)

abstract class MovieTiviDatabase : RoomDatabase() {
    abstract fun movieTiviDao(): MovieTiviDao

    companion object {
        @Volatile
        private var INSTANCE: MovieTiviDatabase? = null

        fun getInstance(context: Context): MovieTiviDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    MovieTiviDatabase::class.java,
                    "MovieCatalogue.db"
                ).build()
            }
    }
}