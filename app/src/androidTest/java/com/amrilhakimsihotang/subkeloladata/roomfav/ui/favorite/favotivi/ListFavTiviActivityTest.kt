package com.amrilhakimsihotang.subkeloladata.roomfav.ui.favorite.favotivi

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

class ListFavTiviActivityTest{
    private val dummyTivi = DataDummy.generateRemoteTivishow()
    @Before
    fun setUp() {
        ActivityScenario.launch(ListFavTiviActivity::class.java)
    }

    @Test
    fun loadFavoriteTivi(){
        onView(withId(R.id.rcfavlisttive)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
            dummyTivi.size
        ))
        onView(withId(R.id.rcfavlisttive)).check(matches(isDisplayed()))

    }

    @Test
    fun positionFavoriteTivi(){
        onView(withId(R.id.rcfavlisttive)).check(matches(isDisplayed()))
        onView(withId(R.id.rcfavlisttive)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
            0,
            click()
        ))
    }

    @Test
    fun fabDelFavTivi(){
        onView(withId(R.id.fab_delfavtivi)).perform(click())
        onView(withText(R.string.yes)).check(matches(isDisplayed()))
    }
}