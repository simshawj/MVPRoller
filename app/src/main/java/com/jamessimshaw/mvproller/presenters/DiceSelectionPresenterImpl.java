package com.jamessimshaw.mvproller.presenters;

import com.jamessimshaw.mvproller.views.DiceSelectionView;

/**
 * Created by james on 2/26/16.
 */
public class DiceSelectionPresenterImpl implements DiceSelectionPresenter {

    private DiceSelectionView mView;

    public DiceSelectionPresenterImpl(DiceSelectionView view) {
        mView = view;
    }

    // DiceSelectionPresenter Methods

    @Override
    public void onD4AdditionClicked() {

    }
}
