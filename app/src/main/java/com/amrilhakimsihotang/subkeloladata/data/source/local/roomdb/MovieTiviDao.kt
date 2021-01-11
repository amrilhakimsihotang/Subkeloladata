package com.amrilhakimsihotang.subkeloladata.data.source.local.roomdb

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.room.*
import com.amrilhakimsihotang.subkeloladata.data.source.local.entity.MovieEntity
import com.amrilhakimsihotang.subkeloladata.data.source.local.entity.TiviEntity

@Dao
interface MovieTiviDao {


    @Query("SELECT * FROM movieentities")
    fun getMovie(): DataSource.Factory<Int,MovieEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addMovie(courses: List<MovieEntity>)

    @Update
    fun updateMovie(movie: MovieEntity)

    @Query("DELETE FROM movieentities")
    suspend fun deleteAllMovie()

    @Query("SELECT * FROM movieentities ORDER BY id ASC")
    fun readAllMovie(): LiveData<List<MovieEntity>>


    @Query("SELECT * FROM tivientities")
    fun getTivi(): DataSource.Factory<Int,TiviEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addTivi(courses: List<TiviEntity>)

    @Update
    fun updateTivi(movie: TiviEntity)

    @Query("DELETE FROM tivientities")
    suspend fun deleteAllTivi()

    @Query("SELECT * FROM tivientities ORDER BY id ASC")
    fun readAllTivi(): LiveData<List<TiviEntity>>
}