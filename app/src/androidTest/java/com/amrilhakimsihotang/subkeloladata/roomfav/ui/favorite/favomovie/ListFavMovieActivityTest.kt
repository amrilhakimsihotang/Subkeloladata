package com.amrilhakimsihotang.subkeloladata.roomfav.ui.favorite.favomovie


import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import com.amrilhakimsihotang.subkeloladata.R
import com.amrilhakimsihotang.subkeloladata.utils.DataDummy
import org.junit.Before
import org.junit.Test


class ListFavMovieActivityTest {

    private val dummyMovie = DataDummy.generateRemoteMovie()


    @Before
    fun setUp() {
        ActivityScenario.launch(ListFavMovieActivity::class.java)
    }

    @Test
    fun loadFavoriteMovie(){
        onView(withId(R.id.rcfavlistmovie)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
        onView(withId(R.id.rcfavlistmovie)).check(matches(isDisplayed()))
    }

    @Test
    fun positionFavoriteMovie(){
        onView(withId(R.id.rcfavlistmovie)).check(matches(isDisplayed()))
        onView(withId(R.id.rcfavlistmovie)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            ))
    }

    @Test
    fun fabDelFavMovie(){
        onView(withId(R.id.fab_delfavmovie)).perform(click())
        onView(withText(R.string.yes)).check(matches(isDisplayed()))
    }

}



