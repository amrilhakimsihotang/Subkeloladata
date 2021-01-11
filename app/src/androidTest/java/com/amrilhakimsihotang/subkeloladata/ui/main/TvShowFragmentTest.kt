package com.amrilhakimsihotang.subkeloladata.ui.main

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import com.amrilhakimsihotang.subkeloladata.R
import com.amrilhakimsihotang.subkeloladata.home.HomeActivity
import com.amrilhakimsihotang.subkeloladata.utils.DataDummy
import com.amrilhakimsihotang.subkeloladata.utils.EspressoIdlingResource
import org.junit.After
import org.junit.Before
import org.junit.Test

class TvShowFragmentTest {

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
    fun testRecyclerViewLoad() {
        onView(withText("TV SHOW")).perform(click())
        onView(withId(R.id.rvtivi)).perform(
                RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                        dummyTivi.size
                )
        )
    }

    @Test
    fun testPositionTivi() {
        onView(withText("TV SHOW")).perform(click())
        onView(withId(R.id.rvtivi)).check(matches(isDisplayed()))
        onView(withId(R.id.rvtivi)).perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                        5,
                        click()
                )
        )
    }
}
