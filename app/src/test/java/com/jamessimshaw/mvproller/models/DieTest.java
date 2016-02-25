package com.jamessimshaw.mvproller.models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by james on 2/24/16.
 */
public class DieTest {

    @Test
    public void testOneSidedDieShouldOnlyReturnOneOnRoll() {
        Die die = new Die(1);
        boolean result = true;
        for(int i = 0; i < 100; i++) {
            if (die.roll() != 1)
                result = false;
        }
        assertTrue(result);
    }

    @Test
    public void testMultisidedDieShouldHaveDifferentResultsOnRoll() {
        Die die = new Die(100);
        int prev = die.roll();
        boolean result = false;
        for(int i = 0; i < 100; i++) {
            if (die.roll() != prev)
                result = true;
        }
        assertTrue(result);
    }
}
