package com.jamessimshaw.mvproller.models;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by james on 2/26/16.
 */
public class DiceSet {

    private Map<Integer, Integer> mDice;

    public DiceSet() {
        mDice = new HashMap<>();
    }

    public int getDieCount(int sides) {
        if (mDice.containsKey(sides))
            return mDice.get(sides);
        else
            return 0;
    }

    public void add(int sides) {
        mDice.put(sides, getDieCount(sides) + 1);
    }

    public void remove(int sides) {
        if (getDieCount(sides) > 0)
            mDice.put(sides, getDieCount(sides) - 1);
    }

    public int rollAllDice() {
        int sum = 0;
        for(Map.Entry<Integer, Integer> entry : mDice.entrySet()) {
            for(int i = 0; i < entry.getValue(); i++)
                sum += Die.roll(entry.getKey());
        }
        return sum;
    }

    public void setNumDice(int sides, int count) {
        mDice.put(sides, count);
    }
}
