package com.amrilhakimsihotang.subkeloladata.roomfav.dao

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.room.*
import com.amrilhakimsihotang.subkeloladata.roomfav.table.MovieFav
import com.amrilhakimsihotang.subkeloladata.roomfav.table.TiviFav


@Dao
interface FavoriteDao {
    //movie favorite
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(movieFav: MovieFav)

    @Query("DELETE FROM moviefavo_table")
    fun delAllMovieFav()

    @Delete
    fun delete(movieFav: MovieFav)

    @Query("SELECT * FROM moviefavo_table ORDER BY id ASC")
    fun getAllMovieFav(): DataSource.Factory<Int,MovieFav>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertAll(list: List<MovieFav>)

    @Query("SELECT * FROM moviefavo_table")
    fun observeAllFavoriteMovie():LiveData<List<MovieFav>>


    //tivi
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(tiviFav: TiviFav)

    @Query("DELETE FROM tivifavo_table")
    fun delAllTiviShowFav()

    @Delete
    fun delete(tiviFav: TiviFav)

    @Query("SELECT * FROM tivifavo_table ORDER BY id ASC")
    fun getAllTiviFav(): DataSource.Factory<Int,TiviFav>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun inserAll(list: List<TiviFav>)

    @Query("SELECT *FROM tivifavo_table")
    fun observeAllFavoriteTivi():LiveData<List<TiviFav>>

}