package com.jamessimshaw.mvproller.models;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.*;

/**
 * Created by james on 2/24/16.
 */
public class DiceCollectionTest {

    DiceCollection mDiceCollection;

    @Before
    public void setup() {
        mDiceCollection = new DiceCollection();
    }

    public void addData(DiceCollection collection) {
        collection.add(new Die(6));
        collection.add(new Die(20));
        collection.add(new Die(100));
    }

    @Test
    public void testImplementsCollectionInterface() {
        assertThat(mDiceCollection, instanceOf(Collection.class));
    }

    @Test
    public void testANewDiceCollectionIsEmpty() {
        assertTrue(mDiceCollection.isEmpty());
    }

    @Test
    public void testAddingDieReturnsTrueOnSuccess() {
        assertTrue(mDiceCollection.add(new Die(6)));
    }

    @Test
    public void testAddingADieToCollectionMeansItIsNotEmpty() {
        mDiceCollection.add(new Die(6));
        assertFalse(mDiceCollection.isEmpty());
    }

    @Test
    public void testSizeShouldReturnTheNumberOfDice() {
        addData(mDiceCollection);
        assertEquals(3, mDiceCollection.size());
    }

    @Test
    public void testClearEmptysCollection() {
        addData(mDiceCollection);
        assertFalse(mDiceCollection.isEmpty());
        mDiceCollection.clear();
        assertTrue(mDiceCollection.isEmpty());
    }

    @Test
    public void testIteratorReturnsAnIterator() {
        assertThat(mDiceCollection.iterator(), instanceOf(Iterator.class));
    }

    @Test
    public void testContains() {
        addData(mDiceCollection);
        assertTrue(mDiceCollection.contains(new Die(20)));
        assertFalse(mDiceCollection.contains(new Die(8)));
    }

    @Test
    public void testToArray() {
        Die die1 = new Die(6);
        Die die2 = new Die(20);
        Die die3 = new Die(100);
        Die[] expected1 = {die1, die2, die3};
        Die[] temp = new Die[5];
        Die[] expected2 = {die1, die2, die3, null, null};
        mDiceCollection.add(die1);
        mDiceCollection.add(die2);
        mDiceCollection.add(die3);
        assertArrayEquals(expected1, mDiceCollection.toArray());
        assertArrayEquals(expected2, mDiceCollection.toArray(temp));
    }

    @Test
    public void testRemoveAllWithCollection() {
        addData(mDiceCollection);
        addData(mDiceCollection);
        addData(mDiceCollection);
        DiceCollection diceCollection = new DiceCollection();
        diceCollection.add(new Die(6));
        diceCollection.add(new Die(100));
        assertTrue(mDiceCollection.removeAll(diceCollection));
        assertTrue(mDiceCollection.contains(new Die(20)));
        assertFalse(mDiceCollection.contains(new Die(6)));
        assertFalse(mDiceCollection.contains(new Die(100)));
        assertEquals(3, mDiceCollection.size());
    }

    @Test
    public void testRemove() {
        addData(mDiceCollection);
        assertTrue(mDiceCollection.remove(new Die(100)));
        assertEquals(2, mDiceCollection.size());
        assertFalse(mDiceCollection.contains(new Die(100)));
        assertTrue(mDiceCollection.contains(new Die(20)));
        assertTrue(mDiceCollection.contains(new Die(6)));
    }

    @Test
    public void testContainsAll(){
        addData(mDiceCollection);
        DiceCollection containing = new DiceCollection();
        containing.add(new Die(20));
        containing.add(new Die(6));
        assertTrue(mDiceCollection.containsAll(containing));
        containing.add(new Die(50));
        assertFalse(mDiceCollection.containsAll(containing));
    }

    @Test
    public void testRemoveAllOfOneTypeOfDie() {
        addData(mDiceCollection);
        addData(mDiceCollection);
        addData(mDiceCollection);
        addData(mDiceCollection);
        assertTrue(mDiceCollection.removeAll(new Die(100)));
        assertFalse(mDiceCollection.contains(new Die(100)));
        assertTrue(mDiceCollection.contains(new Die(6)));
        assertTrue(mDiceCollection.contains(new Die(20)));
    }
}
