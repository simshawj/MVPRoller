package com.jamessimshaw.mvproller.presenters;

import com.jamessimshaw.mvproller.models.DiceSet;
import com.jamessimshaw.mvproller.views.DiceSelectionView;

/**
 * Created by james on 2/26/16.
 */
public class DiceSelectionPresenterImpl implements DiceSelectionPresenter {

    private DiceSelectionView mView;
    private DiceSet mDice;

    public DiceSelectionPresenterImpl(DiceSelectionView view) {
        mView = view;
        mDice = new DiceSet();
    }

    // DiceSelectionPresenter Methods

    @Override
    public void onD4AdditionClicked() {
        mDice.add(4);
        mView.updateD4Number(mDice.getDieCount(4));
    }

    @Override
    public void onD4CountSet(int count) {
        mDice.setNumDice(4, count);
        mView.updateD4Number(mDice.getDieCount(4));
    }

    @Override
    public void onD4RemovalClicked() {
        mDice.remove(4);
        mView.updateD4Number(mDice.getDieCount(4));
    }

    @Override
    public void onD6AdditionClicked() {
        mDice.add(6);
        mView.updateD6Number(mDice.getDieCount(6));
    }

    @Override
    public void onD6CountSet(int count) {
        mDice.setNumDice(6, count);
        mView.updateD6Number(mDice.getDieCount(6));
    }

    @Override
    public void onD6RemovalClicked() {
        mDice.remove(6);
        mView.updateD6Number(mDice.getDieCount(6));
    }

    @Override
    public void onD8AdditionClicked() {
        mDice.add(8);
        mView.updateD8Number(mDice.getDieCount(8));
    }

    @Override
    public void onD8CountSet(int count) {
        mDice.setNumDice(8, count);
        mView.updateD8Number(mDice.getDieCount(8));
    }

    @Override
    public void onD8RemovalClicked() {
        mDice.remove(8);
        mView.updateD8Number(mDice.getDieCount(8));
    }

    @Override
    public void onD10AdditionClicked() {
        mDice.add(10);
        mView.updateD10Number(mDice.getDieCount(10));
    }

    @Override
    public void onD10CountSet(int count) {
        mDice.setNumDice(10, count);
        mView.updateD10Number(mDice.getDieCount(10));
    }

    @Override
    public void onD10RemovalClicked() {
        mDice.remove(10);
        mView.updateD10Number(mDice.getDieCount(10));
    }

    @Override
    public void onD12AdditionClicked() {
        mDice.add(12);
        mView.updateD12Number(mDice.getDieCount(12));
    }

    @Override
    public void onD12CountSet(int count) {
        mDice.setNumDice(12, count);
        mView.updateD12Number(mDice.getDieCount(12));
    }

    @Override
    public void onD12RemovalClicked() {
        mDice.remove(12);
        mView.updateD12Number(mDice.getDieCount(12));
    }

    @Override
    public void onD20AdditionClicked() {
        mDice.add(20);
        mView.updateD20Number(mDice.getDieCount(20));
    }

    @Override
    public void onD20CountSet(int count) {
        mDice.setNumDice(20, count);
        mView.updateD20Number(mDice.getDieCount(20));
    }

    @Override
    public void onD20RemovalClicked() {
        mDice.remove(20);
        mView.updateD20Number(mDice.getDieCount(20));
    }

    @Override
    public void onD100AdditionClicked() {
        mDice.add(100);
        mView.updateD100Number(mDice.getDieCount(100));
    }

    @Override
    public void onD100CountSet(int count) {
        mDice.setNumDice(100, count);
        mView.updateD100Number(mDice.getDieCount(100));
    }

    @Override
    public void onD100RemovalClicked() {
        mDice.remove(100);
        mView.updateD100Number(mDice.getDieCount(100));
    }
}
