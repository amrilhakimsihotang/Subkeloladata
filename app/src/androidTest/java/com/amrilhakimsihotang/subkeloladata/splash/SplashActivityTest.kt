package com.amrilhakimsihotang.subkeloladata.splash

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.amrilhakimsihotang.subkeloladata.R
import org.junit.Before
import org.junit.Test

class SplashActivityTest{
    @Before
    fun testSetup(){
        ActivityScenario.launch(SplashActivity::class.java)

    }
    @Test
    fun loadProgressbar(){
        onView(withId(R.id.progressBar)).check(matches(isDisplayed()))
    }
}