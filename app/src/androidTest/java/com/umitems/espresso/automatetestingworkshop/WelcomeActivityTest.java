package com.umitems.espresso.automatetestingworkshop;

import android.content.Intent;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Created by mariya on 7/2/2016 AD.
 */
public class WelcomeActivityTest {

    @Rule public
    ActivityTestRule activityTestRule=new ActivityTestRule(WelcomeActivity.class,true,false);


    @Before
    public void init() {
        Intent stubIntent = new Intent();
        stubIntent.putExtra("name","TODO");
        activityTestRule.launchActivity(stubIntent);
    }

    @Test public void showNameFromMainPage(){
        onView(withId(R.id.tvWelcome)).check(matches(withText("TODO")));
    }



    @Test
    public void checkText(){
    ViewInteraction viewInteraction = onView(withId(R.id.btnHello));
    viewInteraction.check(matches(isDisplayed()));
    viewInteraction.perform(click());
    onView(withId(R.id.tvWelcome)).check(matches(withText("ddd")));
}


}