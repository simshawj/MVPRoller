package com.jamessimshaw.mvproller.models;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.junit.Assert.*;

/**
 * Created by james on 2/26/16.
 */
public class DiceSetTest {

    private DiceSet mDiceSet;

    @Before
    public void setup() {
        mDiceSet = new DiceSet();
    }

    @Test
    public void testGetDieCount() {
        assertEquals(0, mDiceSet.getDieCount(20));
    }

    @Test
    public void testAddDie() {
        mDiceSet.add(20);
        assertEquals(1, mDiceSet.getDieCount(20));
        assertEquals(0, mDiceSet.getDieCount(100));
    }

    @Test
    public void testRemoveDie() {
        mDiceSet.add(20);
        mDiceSet.remove(20);
        assertEquals(0, mDiceSet.getDieCount(20));
        mDiceSet.remove(20);
        assertEquals(0, mDiceSet.getDieCount(20));
    }

    @Test
    public void testRollAllDice() {
        mDiceSet.add(1);
        mDiceSet.add(1);
        mDiceSet.add(1);
        mDiceSet.add(1);
        mDiceSet.add(1);
        mDiceSet.add(1);
        mDiceSet.add(20);
        assertThat(mDiceSet.rollAllDice(), greaterThanOrEqualTo(7));
    }

    @Test
    public void testSetNumDice() {
        mDiceSet.setNumDice(20, 2);
        assertEquals(2, mDiceSet.getDieCount(20));
    }
}
