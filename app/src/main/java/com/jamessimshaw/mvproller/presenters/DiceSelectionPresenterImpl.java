package com.jamessimshaw.mvproller.presenters;

import com.jamessimshaw.mvproller.models.DiceSet;
import com.jamessimshaw.mvproller.views.DiceSelectionView;

import java.lang.ref.WeakReference;

/**
 * Created by james on 2/26/16.
 */
public class DiceSelectionPresenterImpl implements DiceSelectionPresenter {

    private WeakReference<DiceSelectionView> mView;
    private DiceSet mDice;

    public DiceSelectionPresenterImpl() {
        mView = null;
        mDice = new DiceSet();
    }

    // DiceSelectionPresenter Methods

    @Override
    public void onD4AdditionClicked() {
        mDice.add(4);
        if (mView != null)
            mView.get().updateD4Number(mDice.getDieCount(4));
    }

    @Override
    public void onD4CountSet(int count) {
        mDice.setNumDice(4, count);
        if (mView != null)
            mView.get().updateD4Number(mDice.getDieCount(4));
    }

    @Override
    public void onD4RemovalClicked() {
        mDice.remove(4);
        if (mView != null)
            mView.get().updateD4Number(mDice.getDieCount(4));
    }

    @Override
    public void onD6AdditionClicked() {
        mDice.add(6);
        if (mView != null)
            mView.get().updateD6Number(mDice.getDieCount(6));
    }

    @Override
    public void onD6CountSet(int count) {
        mDice.setNumDice(6, count);
        if (mView != null)
            mView.get().updateD6Number(mDice.getDieCount(6));
    }

    @Override
    public void onD6RemovalClicked() {
        mDice.remove(6);
        if (mView != null)
            mView.get().updateD6Number(mDice.getDieCount(6));
    }

    @Override
    public void onD8AdditionClicked() {
        mDice.add(8);
        if (mView != null)
            mView.get().updateD8Number(mDice.getDieCount(8));
    }

    @Override
    public void onD8CountSet(int count) {
        mDice.setNumDice(8, count);
        if (mView != null)
            mView.get().updateD8Number(mDice.getDieCount(8));
    }

    @Override
    public void onD8RemovalClicked() {
        mDice.remove(8);
        if (mView != null)
            mView.get().updateD8Number(mDice.getDieCount(8));
    }

    @Override
    public void onD10AdditionClicked() {
        mDice.add(10);
        if (mView != null)
            mView.get().updateD10Number(mDice.getDieCount(10));
    }

    @Override
    public void onD10CountSet(int count) {
        mDice.setNumDice(10, count);
        if (mView != null)
            mView.get().updateD10Number(mDice.getDieCount(10));
    }

    @Override
    public void onD10RemovalClicked() {
        mDice.remove(10);
        if (mView != null)
            mView.get().updateD10Number(mDice.getDieCount(10));
    }

    @Override
    public void onD12AdditionClicked() {
        mDice.add(12);
        if (mView != null)
            mView.get().updateD12Number(mDice.getDieCount(12));
    }

    @Override
    public void onD12CountSet(int count) {
        mDice.setNumDice(12, count);
        if (mView != null)
            mView.get().updateD12Number(mDice.getDieCount(12));
    }

    @Override
    public void onD12RemovalClicked() {
        mDice.remove(12);
        if (mView != null)
            mView.get().updateD12Number(mDice.getDieCount(12));
    }

    @Override
    public void onD20AdditionClicked() {
        mDice.add(20);
        if (mView != null)
            mView.get().updateD20Number(mDice.getDieCount(20));
    }

    @Override
    public void onD20CountSet(int count) {
        mDice.setNumDice(20, count);
        if (mView != null)
            mView.get().updateD20Number(mDice.getDieCount(20));
    }

    @Override
    public void onD20RemovalClicked() {
        mDice.remove(20);
        if (mView != null)
            mView.get().updateD20Number(mDice.getDieCount(20));
    }

    @Override
    public void onD100AdditionClicked() {
        mDice.add(100);
        if (mView != null)
            mView.get().updateD100Number(mDice.getDieCount(100));
    }

    @Override
    public void onD100CountSet(int count) {
        mDice.setNumDice(100, count);
        if (mView != null)
            mView.get().updateD100Number(mDice.getDieCount(100));
    }

    @Override
    public void onD100RemovalClicked() {
        mDice.remove(100);
        if (mView != null)
            mView.get().updateD100Number(mDice.getDieCount(100));
    }

    @Override
    public void setView(DiceSelectionView view) {
        mView = new WeakReference<DiceSelectionView>(view);
    }

    @Override
    public void removeView(DiceSelectionView view) {
        if (mView.equals(view))
            mView = null;
    }

    @Override
    public void rollSelected() {
        int roll = mDice.rollAllDice();
        if (mView != null) {
            mView.get().animateRoll();
            mView.get().displayResult(roll);
        }
    }
}
