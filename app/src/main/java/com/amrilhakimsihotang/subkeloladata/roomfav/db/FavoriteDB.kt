package com.amrilhakimsihotang.subkeloladata.roomfav.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.amrilhakimsihotang.subkeloladata.roomfav.dao.FavoriteDao
import com.amrilhakimsihotang.subkeloladata.roomfav.table.MovieFav
import com.amrilhakimsihotang.subkeloladata.roomfav.table.TiviFav

@Database(entities = [MovieFav::class, TiviFav::class], version = 1, exportSchema = false)
abstract class FavoriteDB : RoomDatabase() {

    abstract fun favoriteDao(): FavoriteDao

    companion object {
        @Volatile
        private var INSTANCE: FavoriteDB? = null



        @JvmStatic
        fun getDatabase(context: Context): FavoriteDB {
            if (INSTANCE == null) {

                    synchronized(FavoriteDao::class.java) {
                        if (INSTANCE == null) {

                            INSTANCE = Room.databaseBuilder(
                                context.applicationContext,
                                FavoriteDB::class.java, "Favoritedatabase.db"
                            )
                                .build()

                        }
                    }



            }

            return INSTANCE as FavoriteDB
        }

    }
}