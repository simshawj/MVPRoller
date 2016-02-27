package com.jamessimshaw.mvproller.models;

import java.util.Random;

/**
 * Created by james on 2/24/16.
 */
public class Die {

    private int mSides;

    public Die(int sides) {
        mSides = sides;
    }

    public int getSides() {
        return mSides;
    }

    public int roll() {
        return roll(mSides);
    }

    public static int roll(int sides) {
        Random random = new Random();
        return random.nextInt(sides) + 1;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Die && mSides == ((Die) o).mSides;
    }

    @Override
    public int hashCode() {
        return mSides;
    }
}
