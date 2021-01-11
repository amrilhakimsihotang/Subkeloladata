package com.amrilhakimsihotang.subkeloladata.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import com.amrilhakimsihotang.subkeloladata.R
import com.amrilhakimsihotang.subkeloladata.utils.DataDummy
import com.amrilhakimsihotang.subkeloladata.utils.EspressoIdlingResource
import org.hamcrest.Matchers.allOf
import org.junit.After
import org.junit.Before
import org.junit.Test

class HomeActivityTest {
    private val dummyMovie = DataDummy.generateRemoteMovie()
    private val dummyTivi = DataDummy.generateRemoteTivishow()

    @Before
    fun setUp() {
        ActivityScenario.launch(HomeActivity::class.java)
        IdlingRegistry.getInstance().register(EspressoIdlingResource.espressoTestIdlingResource)
    }

    @After
    fun tearDown() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.espressoTestIdlingResource)
    }

    @Test
    fun actionFab() {
        val imageButton = onView(
            allOf(
                withId(R.id.fab), withContentDescription("gueamril@yahoo.com"),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()
            )
        )
        imageButton.check(matches(isDisplayed()))

    }


    @Test
    fun actionMenu() {
        onView(withId(R.id.change_language)).perform(click())
    }


    @Test
    fun actionPager() {
        onView(withId(R.id.viewpager)).perform(click())
    }

    @Test
    fun loadMovie() {
        onView(withId(R.id.rvmovies)).check(matches(isDisplayed()))
        onView(withId(R.id.rvmovies)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyMovie.size
            )
        )
    }





    @Test
    fun loadTivi() {
        onView(withText("TV SHOW")).perform(click())
        onView(withId(R.id.rvtivi)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyTivi.size
            )
        )
    }

}