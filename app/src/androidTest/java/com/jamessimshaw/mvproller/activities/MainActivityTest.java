package com.jamessimshaw.mvproller.activities;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.jamessimshaw.mvproller.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by james on 3/15/16.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void d4UpArrowIncrementsCount() {
        upArrowIncrementsCount(R.id.d4DieCountEditText, R.id.d4AddDieImageView);
    }

    @Test
    public void d6UpArrowIncrementsCount() {
        upArrowIncrementsCount(R.id.d6DieCountEditText, R.id.d6AddDieImageView);
    }

    @Test
    public void d8UpArrowIncrementsCount() {
        upArrowIncrementsCount(R.id.d8DieCountEditText, R.id.d8AddDieImageView);
    }

    @Test
    public void d10UpArrowIncrementsCount() {
        upArrowIncrementsCount(R.id.d10DieCountEditText, R.id.d10AddDieImageView);
    }

    @Test
    public void d12UpArrowIncrementsCount() {
        upArrowIncrementsCount(R.id.d12DieCountEditText, R.id.d12AddDieImageView);
    }

    @Test
    public void d20UpArrowIncrementsCount() {
        upArrowIncrementsCount(R.id.d20DieCountEditText, R.id.d20AddDieImageView);
    }

    @Test
    public void d100UpArrowIncrementsCount() {
        upArrowIncrementsCount(R.id.d100DieCountEditText, R.id.d100AddDieImageView);
    }

    private void upArrowIncrementsCount(int editText, int imageView) {
        onView(withId(editText)).check(matches(withText("0")));
        onView(withId(imageView)).perform(click());
        onView(withId(editText)).check(matches(withText("1")));
    }

    @Test
    public void d4ChangeCount() {
        changeCount(R.id.d4DieCountEditText);
    }

    @Test
    public void d6ChangeCount() {
        changeCount(R.id.d6DieCountEditText);
    }

    @Test
    public void d8ChangeCount() {
        changeCount(R.id.d8DieCountEditText);
    }

    @Test
    public void d10ChangeCount() {
        changeCount(R.id.d10DieCountEditText);
    }

    @Test
    public void d12ChangeCount() {
        changeCount(R.id.d12DieCountEditText);
    }

    @Test
    public void d20ChangeCount() {
        changeCount(R.id.d20DieCountEditText);
    }

    @Test
    public void d100ChangeCount() {
        changeCount(R.id.d100DieCountEditText);
    }

    private void changeCount(int editText) {
        onView(withId(editText)).check(matches(withText("0")));
        onView(withId(editText)).perform(replaceText("5"));
        onView(withId(editText)).check(matches(withText("5")));
    }

    @Test
    public void d4DownArrowDecrementsCount() {
        downArrowDecrementsCount(R.id.d4DieCountEditText, R.id.d4RemoveDieImageView);
    }

    @Test
    public void d6DownArrowDecrementsCount() {
        downArrowDecrementsCount(R.id.d6DieCountEditText, R.id.d6RemoveDieImageView);
    }

    @Test
    public void d8DownArrowDecrementsCount() {
        downArrowDecrementsCount(R.id.d8DieCountEditText, R.id.d8RemoveDieImageView);
    }

    @Test
    public void d10DownArrowDecrementsCount() {
        downArrowDecrementsCount(R.id.d10DieCountEditText, R.id.d10RemoveDieImageView);
    }

    @Test
    public void d12DownArrowDecrementsCount() {
        downArrowDecrementsCount(R.id.d12DieCountEditText, R.id.d12RemoveDieImageView);
    }

    @Test
    public void d20DownArrowDecrementsCount() {
        downArrowDecrementsCount(R.id.d20DieCountEditText, R.id.d20RemoveDieImageView);
    }

    @Test
    public void d100DownArrowDecrementsCount() {
        downArrowDecrementsCount(R.id.d100DieCountEditText, R.id.d100RemoveDieImageView);
    }

    private void downArrowDecrementsCount(int editText, int imageView) {
        onView(withId(editText)).check(matches(withText("0")));
        onView(withId(editText)).perform(replaceText("5"));
        onView(withId(editText)).check(matches(withText("5")));
        onView(withId(imageView)).perform(click());
        onView(withId(editText)).check(matches(withText("4")));
    }

}
