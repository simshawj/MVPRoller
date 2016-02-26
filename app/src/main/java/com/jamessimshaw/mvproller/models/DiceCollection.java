package com.jamessimshaw.mvproller.models;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by james on 2/25/16.
 */
public class DiceCollection implements Collection<Die> {
    ArrayList<Die> mDieArrayList;

    public DiceCollection() {
        mDieArrayList = new ArrayList<>();
    }

    public boolean removeAll(Die die) {
        boolean result = true;
        while(mDieArrayList.contains(die))
            result &= mDieArrayList.remove(die);
        return result;
    }

    //Collection Methods

    @Override
    public boolean add(Die die) {
        return mDieArrayList.add(die);
    }

    @Override
    public boolean addAll(Collection<? extends Die> collection) {
        return false;
    }

    @Override
    public void clear() {
        mDieArrayList.clear();
    }

    @Override
    public boolean contains(Object object) {
        return mDieArrayList.contains(object);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return mDieArrayList.containsAll(collection);
    }

    @Override
    public boolean isEmpty() {
        return mDieArrayList.isEmpty();
    }

    @NonNull
    @Override
    public Iterator<Die> iterator() {
        return mDieArrayList.iterator();
    }

    @Override
    public boolean remove(Object object) {
        return mDieArrayList.remove(object);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return mDieArrayList.removeAll(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public int size() {
        return mDieArrayList.size();
    }

    @NonNull
    @Override
    public Object[] toArray() {
        return mDieArrayList.toArray();
    }

    @NonNull
    @Override
    public <T> T[] toArray(T[] array) {
        return mDieArrayList.toArray(array);
    }
}
