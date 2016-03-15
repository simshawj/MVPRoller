package com.jamessimshaw.mvproller.views;

import android.view.LayoutInflater;
import android.widget.TextView;

import com.jamessimshaw.mvproller.BuildConfig;
import com.jamessimshaw.mvproller.R;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;

/**
 * Created by james on 3/3/16.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class DiceSelectionViewImplTest {

    DiceSelectionViewImpl mView;

    @Before
    public void setup() {
        mView = (DiceSelectionViewImpl) LayoutInflater.from(RuntimeEnvironment.application).inflate(R.layout.dice_selection, new DiceSelectionViewImpl(RuntimeEnvironment.application), true);
    }

    @Test
    public void testUpdateD4Number() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d4DieCountEditText);
        mView.updateD4Number(4);
        assertEquals("4", countTextView.getText().toString());
    }

    @Test
    public void testUpdateD6Number() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d6DieCountEditText);
        mView.updateD6Number(4);
        assertEquals("4", countTextView.getText().toString());
    }

    @Test
    public void testUpdateD8Number() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d8DieCountEditText);
        mView.updateD8Number(4);
        assertEquals("4", countTextView.getText().toString());
    }

    @Test
    public void testUpdateD10Number() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d10DieCountEditText);
        mView.updateD10Number(4);
        assertEquals("4", countTextView.getText().toString());
    }

    @Test
    public void testUpdateD12Number() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d12DieCountEditText);
        mView.updateD12Number(4);
        assertEquals("4", countTextView.getText().toString());    }

    @Test
    public void testUpdateD20Number() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d20DieCountEditText);
        mView.updateD20Number(4);
        assertEquals("4", countTextView.getText().toString());
    }

    @Test
    public void testUpdateD100Number() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d100DieCountEditText);
        mView.updateD100Number(4);
        assertEquals("4", countTextView.getText().toString());
    }

    // ClickListeners

    @Test
    public void testOnD4AddClick() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d4DieCountEditText);
        mView.onD4AddClick();
        assertEquals("1", countTextView.getText().toString());
    }

    @Test
    public void testOnD6AddClick() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d6DieCountEditText);
        mView.onD6AddClick();
        assertEquals("1", countTextView.getText().toString());
    }

    @Test
    public void testOnD8AddClick() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d8DieCountEditText);
        mView.onD8AddClick();
        assertEquals("1", countTextView.getText().toString());
    }

    @Test
    public void testOnD10AddClick() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d10DieCountEditText);
        mView.onD10AddClick();
        assertEquals("1", countTextView.getText().toString());
    }

    @Test
    public void testOnD12AddClick() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d12DieCountEditText);
        mView.onD12AddClick();
        assertEquals("1", countTextView.getText().toString());
    }

    @Test
    public void testOnD20AddClick() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d20DieCountEditText);
        mView.onD20AddClick();
        assertEquals("1", countTextView.getText().toString());
    }

    @Test
    public void testOnD100AddClick() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d100DieCountEditText);
        mView.onD100AddClick();
        assertEquals("1", countTextView.getText().toString());
    }

    @Test
    public void testOnD4RemoveClickAt0() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d4DieCountEditText);
        mView.updateD4Number(0);
        mView.onD4RemoveClick();
        assertEquals("0", countTextView.getText().toString());
    }

    @Test
    public void testOnD6RemoveClickAt0() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d6DieCountEditText);
        mView.updateD6Number(0);
        mView.onD6RemoveClick();
        assertEquals("0", countTextView.getText().toString());
    }

    @Test
    public void testOnD8RemoveClickAt0() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d8DieCountEditText);
        mView.updateD8Number(0);
        mView.onD8RemoveClick();
        assertEquals("0", countTextView.getText().toString());
    }

    @Test
    public void testOnD10RemoveClickAt0() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d10DieCountEditText);
        mView.updateD10Number(0);
        mView.onD10RemoveClick();
        assertEquals("0", countTextView.getText().toString());
    }

    @Test
    public void testOnD12RemoveClickAt0() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d12DieCountEditText);
        mView.updateD12Number(0);
        mView.onD12RemoveClick();
        assertEquals("0", countTextView.getText().toString());
    }

    @Test
    public void testOnD20RemoveClickAt0() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d20DieCountEditText);
        mView.updateD20Number(0);
        mView.onD20RemoveClick();
        assertEquals("0", countTextView.getText().toString());
    }

    @Test
    public void testOnD100RemoveClickAt0() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d100DieCountEditText);
        mView.updateD100Number(0);
        mView.onD100RemoveClick();
        assertEquals("0", countTextView.getText().toString());
    }

    @Test
    public void testOnD4RemoveClickAt5() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d4DieCountEditText);
        mView.updateD4Number(5);
        mView.onD4RemoveClick();
        assertEquals("4", countTextView.getText().toString());
    }

    @Test
    public void testOnD6RemoveClickAt5() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d6DieCountEditText);
        mView.updateD6Number(5);
        mView.onD6RemoveClick();
        assertEquals("4", countTextView.getText().toString());
    }

    @Test
    public void testOnD8RemoveClickAt5() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d8DieCountEditText);
        mView.updateD8Number(5);
        mView.onD8RemoveClick();
        assertEquals("4", countTextView.getText().toString());
    }

    @Test
    public void testOnD10RemoveClickAt5() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d10DieCountEditText);
        mView.updateD10Number(5);
        mView.onD10RemoveClick();
        assertEquals("4", countTextView.getText().toString());
    }

    @Test
    public void testOnD12RemoveClickAt5() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d12DieCountEditText);
        mView.updateD12Number(5);
        mView.onD12RemoveClick();
        assertEquals("4", countTextView.getText().toString());
    }

    @Test
    public void testOnD20RemoveClickAt5() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d20DieCountEditText);
        mView.updateD20Number(5);
        mView.onD20RemoveClick();
        assertEquals("4", countTextView.getText().toString());
    }

    @Test
    public void testOnD100RemoveClickAt5() {
        TextView countTextView = (TextView) mView.findViewById(R.id.d100DieCountEditText);
        mView.updateD100Number(5);
        mView.onD100RemoveClick();
        assertEquals("4", countTextView.getText().toString());
    }
}
