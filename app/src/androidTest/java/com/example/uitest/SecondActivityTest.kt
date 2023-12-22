package com.example.uitest

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
class SecondActivityTest {

    @get:Rule
    var activityScenarioRule = activityScenarioRule<SecondActivity>()

    @Test
    fun checkingActivity() {
        onView(withId(R.id.second_activity_view))
            .check(matches(isDisplayed()))
    }

    @Test
    fun test_visibility_of_textView_and_button() {
        onView(withId(R.id.tvSecondAcitivty))
            .check(matches(isDisplayed()))

        //checking button visibilitty
        onView(withId(R.id.btnSecondActivity))
            .check(matches(isDisplayed()))
    }

    //check if the text in the second is the one that we expected(Second Activity)
    @Test
    fun test_visibility_textView() {
        onView(withId(R.id.tvSecondAcitivty))
            .check(
                matches(
                    withText(R.string.second_activity)
                )
            )
    }

//    @Test
//    fun testBackButton(){
//        onView(withId(R.id.btnSecondActivity))
//            .perform(click())
//
//        onView(withId(R.id.layout_mainActivity))
//            .check(matches(isDisplayed()))
//
//        onView(withId(R.id.tvMainActivity))
//            .check(matches(withText(R.string.main_activity)))
//    }

    //now let's run all tests in the second ativity(created above) at once


    // now will create a class that will allow us to run all test
    //from the main activity and second activity at once
}