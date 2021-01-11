package com.amrilhakimsihotang.subkeloladata.roomfav.ui.favoritdao

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import com.amrilhakimsihotang.subkeloladata.getOrAwaitValue
import com.amrilhakimsihotang.subkeloladata.roomfav.dao.FavoriteDao
import com.amrilhakimsihotang.subkeloladata.roomfav.db.FavoriteDB
import com.amrilhakimsihotang.subkeloladata.roomfav.table.MovieFav
import com.amrilhakimsihotang.subkeloladata.roomfav.table.TiviFav
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@ExperimentalCoroutinesApi
@RunWith(AndroidJUnit4::class)
@SmallTest
class FavoriteDaoTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var db: FavoriteDB
    private lateinit var favoriteDao: FavoriteDao

    @Before
    fun setup() {
        db = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            FavoriteDB::class.java
        ).allowMainThreadQueries().build()
        favoriteDao = db.favoriteDao()
    }

    @After
    fun teardown() {
        db.close()
    }

    @Test
    fun inserMovieFavorite() = runBlockingTest {
        val movieFav = MovieFav(1, "1", "OriginalTitle", "posterPath", "Overview", "director")
        favoriteDao.insert(movieFav)
        val dataFavoriteMovie = favoriteDao.observeAllFavoriteMovie().getOrAwaitValue()
        assertThat(dataFavoriteMovie).contains(movieFav)
    }

    @Test
    fun deleteMovieFavorite() = runBlockingTest {
        val movieFav = MovieFav(1, "1", "OriginalTitle",
            "posterPath", "Overview", "director")
        favoriteDao.insert(movieFav)
        favoriteDao.delete(movieFav)
        val dataFavoriteMovie = favoriteDao.observeAllFavoriteMovie().getOrAwaitValue()
        assertThat(dataFavoriteMovie).doesNotContain(movieFav)

    }
    @Test
    fun deleteMovieFavoriteAll() = runBlockingTest {
        val movieFav = MovieFav(1, "1", "OriginalTitle",
            "posterPath", "Overview", "director")
        favoriteDao.insert(movieFav)
        favoriteDao.delAllMovieFav()
        val dataFavoriteMovie = favoriteDao.observeAllFavoriteMovie().getOrAwaitValue()
        assertThat(dataFavoriteMovie).doesNotContain(movieFav)

    }


     //tivi show favorite
    @Test
    fun insertTiviFavorite() = runBlockingTest {
        val tiviFav = TiviFav(1, "1", "OriginalName",
            "posterPath", "Overview", "CreatorCast")

        favoriteDao.insert(tiviFav)
        val dataFavoriteTivi = favoriteDao.observeAllFavoriteTivi().getOrAwaitValue()
        assertThat(dataFavoriteTivi).contains(tiviFav)

    }

    @Test
    fun deleteTiviFavorite()= runBlockingTest {
        val tiviFav = TiviFav(1, "1", "OriginalName",
            "posterPath", "Overview", "CreatorCast")

        favoriteDao.insert(tiviFav)
        favoriteDao.delete(tiviFav)
        val dataFavoriteTivi = favoriteDao.observeAllFavoriteTivi().getOrAwaitValue()
        assertThat(dataFavoriteTivi).doesNotContain(tiviFav)

    }
    @Test
    fun deleteTiviFavoriteAll()= runBlockingTest {
        val tiviFav = TiviFav(1, "1", "OriginalName",
            "posterPath", "Overview", "CreatorCast")

        favoriteDao.insert(tiviFav)
        favoriteDao.delAllTiviShowFav()
        val dataFavoriteTivi = favoriteDao.observeAllFavoriteTivi().getOrAwaitValue()
        assertThat(dataFavoriteTivi).doesNotContain(tiviFav)

    }

}