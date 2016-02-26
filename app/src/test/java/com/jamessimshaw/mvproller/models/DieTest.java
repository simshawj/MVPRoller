package com.jamessimshaw.mvproller.models;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;
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

    @Test
    public void testDieIsEqualToItself() {
        Die die = new Die(20);
        assertThat(die, equalTo(die));
        assertThat(die.hashCode(), equalTo(die.hashCode()));
    }

    @Test
    public void testSameSidedDiceAreEqual() {
        Die die1 = new Die(6);
        Die die2 = new Die(6);
        assertThat(die1, equalTo(die2));
        assertThat(die1.hashCode(), equalTo(die2.hashCode()));
        assertThat(die2, equalTo(die1));
        assertThat(die2.hashCode(), equalTo(die1.hashCode()));
    }

    @Test
    public void testDifferentSidedDiceAreNotEqual() {
        Die die1 = new Die(6);
        Die die2 = new Die(20);
        assertThat(die1, not(equalTo(die2)));
        assertThat(die1.hashCode(), not(equalTo(die2.hashCode())));
        assertThat(die2, not(equalTo(die1)));
        assertThat(die2.hashCode(), not(equalTo(die1.hashCode())));
    }

    @Test
    public void testEqualsIsTransitive() {
        Die die1 = new Die(6);
        Die die2 = new Die(6);
        Die die3 = new Die(6);
        assertThat(die1, equalTo(die2));
        assertThat(die1.hashCode(), equalTo(die2.hashCode()));
        assertThat(die2, equalTo(die3));
        assertThat(die2.hashCode(), equalTo(die3.hashCode()));
        assertThat(die3, equalTo(die1));
        assertThat(die3.hashCode(), equalTo(die1.hashCode()));
    }

    @Test
    public void testGetSides() {
        Die die = new Die(20);
        assertEquals(20, die.getSides());
    }

}
