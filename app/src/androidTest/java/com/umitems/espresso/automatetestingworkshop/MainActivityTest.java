package com.umitems.espresso.automatetestingworkshop;

import android.content.Intent;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by mariya on 7/2/2016 AD.
 */
public class MainActivityTest {


    @Rule public ActivityTestRule activityTestRule=new ActivityTestRule(MainActivity.class);




    @Test public void pressBtn(){
        ViewInteraction etName=onView(withId(R.id.etName));
        etName.perform(clearText());
        etName.perform(typeText("hahaha"));

        ViewInteraction viewInteraction=onView(withId(R.id.tvHeader));
        viewInteraction.check(matches(isDisplayed()));
        viewInteraction.perform(click());

        ViewInteraction viewInteraction2 = onView(withId(R.id.btnHello));
        viewInteraction2.check(matches(isDisplayed()));

        onView(withId(R.id.tvWelcome)).check(matches(withText("hahaha")));
    }

    @Test public void firstPageHelloWorld(){
        onView(withId(R.id.etName)).check(matches(isDisplayed()));
    }


    /*@Test public void firstPageHelloWorld2(){
        onView(withId(R.id.tv_hello_message)).check((matches(withText("textView"))));
    }*/


}