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
        TextView d4Count = (TextView) mView.findViewById(R.id.d4DieCountEditText);
        mView.updateD4Number(4);
        assertEquals(d4Count.getText().toString(), "4");
    }

    @Test
    public void testUpdateD6Number() {
        TextView d6Count = (TextView) mView.findViewById(R.id.d6DieCountEditText);
        mView.updateD6Number(4);
        assertEquals(d6Count.getText().toString(), "4");
    }

    @Test
    public void testUpdateD8Number() {
        TextView d8Count = (TextView) mView.findViewById(R.id.d8DieCountEditText);
        mView.updateD8Number(4);
        assertEquals(d8Count.getText().toString(), "4");
    }

    @Test
    public void testUpdateD10Number() {
        TextView d10Count = (TextView) mView.findViewById(R.id.d10DieCountEditText);
        mView.updateD10Number(4);
        assertEquals(d10Count.getText().toString(), "4");
    }

    @Test
    public void testUpdateD12Number() {
        TextView d12Count = (TextView) mView.findViewById(R.id.d12DieCountEditText);
        mView.updateD12Number(4);
        assertEquals(d12Count.getText().toString(), "4");
    }

    @Test
    public void testUpdateD20Number() {
        TextView d20Count = (TextView) mView.findViewById(R.id.d20DieCountEditText);
        mView.updateD20Number(4);
        assertEquals(d20Count.getText().toString(), "4");
    }

    @Test
    public void testUpdateD100Number() {
        TextView d100Count = (TextView) mView.findViewById(R.id.d100DieCountEditText);
        mView.updateD100Number(4);
        assertEquals(d100Count.getText().toString(), "4");
    }

    // ClickListeners

    @Test
    public void testOnD4AddClick() {
        TextView d4Count = (TextView) mView.findViewById(R.id.d4DieCountEditText);
        mView.onD4AddClick();
        assertEquals(d4Count.getText().toString(), "1");
    }

    @Test
    public void testOnD6AddClick() {
        TextView d6Count = (TextView) mView.findViewById(R.id.d6DieCountEditText);
        mView.onD6AddClick();
        assertEquals(d6Count.getText().toString(), "1");
    }

    @Test
    public void testOnD8AddClick() {
        TextView d8Count = (TextView) mView.findViewById(R.id.d8DieCountEditText);
        mView.onD8AddClick();
        assertEquals(d8Count.getText().toString(), "1");
    }

    @Test
    public void testOnD10AddClick() {
        TextView d10Count = (TextView) mView.findViewById(R.id.d10DieCountEditText);
        mView.onD10AddClick();
        assertEquals(d10Count.getText().toString(), "1");
    }

    @Test
    public void testOnD12AddClick() {
        TextView d12Count = (TextView) mView.findViewById(R.id.d12DieCountEditText);
        mView.onD12AddClick();
        assertEquals(d12Count.getText().toString(), "1");
    }

    @Test
    public void testOnD20AddClick() {
        TextView d20Count = (TextView) mView.findViewById(R.id.d20DieCountEditText);
        mView.onD20AddClick();
        assertEquals(d20Count.getText().toString(), "1");
    }

    @Test
    public void testOnD100AddClick() {
        TextView d100Count = (TextView) mView.findViewById(R.id.d100DieCountEditText);
        mView.onD100AddClick();
        assertEquals(d100Count.getText().toString(), "1");
    }

    @Test
    public void testOnD4RemoveClickAt0() {
        TextView d4Count = (TextView) mView.findViewById(R.id.d4DieCountEditText);
        mView.updateD4Number(0);
        mView.onD4RemoveClick();
        assertEquals(d4Count.getText().toString(), "0");
    }

    @Test
    public void testOnD6RemoveClickAt0() {
        TextView d6Count = (TextView) mView.findViewById(R.id.d6DieCountEditText);
        mView.updateD6Number(0);
        mView.onD6RemoveClick();
        assertEquals(d6Count.getText().toString(), "0");
    }

    @Test
    public void testOnD8RemoveClickAt0() {
        TextView d8Count = (TextView) mView.findViewById(R.id.d8DieCountEditText);
        mView.updateD8Number(0);
        mView.onD8RemoveClick();
        assertEquals(d8Count.getText().toString(), "0");
    }

    @Test
    public void testOnD10RemoveClickAt0() {
        TextView d10Count = (TextView) mView.findViewById(R.id.d10DieCountEditText);
        mView.updateD10Number(0);
        mView.onD10RemoveClick();
        assertEquals(d10Count.getText().toString(), "0");
    }

    @Test
    public void testOnD12RemoveClickAt0() {
        TextView d12Count = (TextView) mView.findViewById(R.id.d12DieCountEditText);
        mView.updateD12Number(0);
        mView.onD12RemoveClick();
        assertEquals(d12Count.getText().toString(), "0");
    }

    @Test
    public void testOnD20RemoveClickAt0() {
        TextView d20Count = (TextView) mView.findViewById(R.id.d20DieCountEditText);
        mView.updateD20Number(0);
        mView.onD20RemoveClick();
        assertEquals(d20Count.getText().toString(), "0");
    }

    @Test
    public void testOnD100RemoveClickAt0() {
        TextView d100Count = (TextView) mView.findViewById(R.id.d100DieCountEditText);
        mView.updateD100Number(0);
        mView.onD100RemoveClick();
        assertEquals(d100Count.getText().toString(), "0");
    }

    @Test
    public void testOnD4RemoveClickAt5() {
        TextView d4Count = (TextView) mView.findViewById(R.id.d4DieCountEditText);
        mView.updateD4Number(5);
        mView.onD4RemoveClick();
        assertEquals(d4Count.getText().toString(), "4");
    }

    @Test
    public void testOnD6RemoveClickAt5() {
        TextView d6Count = (TextView) mView.findViewById(R.id.d6DieCountEditText);
        mView.updateD6Number(5);
        mView.onD6RemoveClick();
        assertEquals(d6Count.getText().toString(), "4");
    }

    @Test
    public void testOnD8RemoveClickAt5() {
        TextView d8Count = (TextView) mView.findViewById(R.id.d8DieCountEditText);
        mView.updateD8Number(5);
        mView.onD8RemoveClick();
        assertEquals(d8Count.getText().toString(), "4");
    }

    @Test
    public void testOnD10RemoveClickAt5() {
        TextView d10Count = (TextView) mView.findViewById(R.id.d10DieCountEditText);
        mView.updateD10Number(5);
        mView.onD10RemoveClick();
        assertEquals(d10Count.getText().toString(), "4");
    }

    @Test
    public void testOnD12RemoveClickAt5() {
        TextView d12Count = (TextView) mView.findViewById(R.id.d12DieCountEditText);
        mView.updateD12Number(5);
        mView.onD12RemoveClick();
        assertEquals(d12Count.getText().toString(), "4");
    }

    @Test
    public void testOnD20RemoveClickAt5() {
        TextView d20Count = (TextView) mView.findViewById(R.id.d20DieCountEditText);
        mView.updateD20Number(5);
        mView.onD20RemoveClick();
        assertEquals(d20Count.getText().toString(), "4");
    }

    @Test
    public void testOnD100RemoveClickAt5() {
        TextView d100Count = (TextView) mView.findViewById(R.id.d100DieCountEditText);
        mView.updateD100Number(5);
        mView.onD100RemoveClick();
        assertEquals(d100Count.getText().toString(), "4");
    }
}
