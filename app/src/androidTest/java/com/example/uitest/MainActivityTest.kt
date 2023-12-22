package com.example.uitest

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
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
class MainActivityTest {
    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()


//first:let's check(test) if our main activity layout is displayed or visible to the user
    @Test
    fun checkActivityVisibility(){
        onView(withId(R.id.layout_mainActivity))
            .check(matches(isDisplayed()))
    }

    //checking if text" Main Activity" is vivible as we want
    @Test
    fun checkingTextVisibility(){
        onView(withId(R.id.tvMainActivity))
            .check(matches(isDisplayed()))

        //checking if out button is visible
        onView(withId(R.id.btnMainActivity))
            .check(matches(isDisplayed()))
    }

    //checking if text in our view is the right one

    @Test
    fun testTextIsMainActivity(){
        onView(withId(R.id.tvMainActivity))
            .check(matches(withText(R.string.main_activity)))
    }

    //testing click in button(Main Activity) if after a click will navigate to second activity
    //and test if our view(second activity will be displayed)

    @Test
    fun navigateTo2Activity(){
        onView(withId(R.id.btnMainActivity))
            .perform(click())

        //with click everything is alright
            //now we will check if our second activity is visible to the user

        onView(withId(R.id.second_activity_view))
            .check(matches(isDisplayed()))
    }

    //testing backPress to mainActivity

    @Test
    fun backPresstoMainActivity(){
        onView(withId(R.id.btnMainActivity))
            .perform(click())

        onView(withId(R.id.second_activity_view))
            .check(matches(isDisplayed()))

        //here we will check onBackPress
        //when the user is on the second activity
        Espresso.pressBack()


        //after clicking on button to back
        //main Activity must be visible

        onView(withId(R.id.layout_mainActivity))
            .check(matches(isDisplayed()))
    }

    //we are done with main activity
    //now let's run all test(methods) that we have created here at once

    //let's test our second activity


 }