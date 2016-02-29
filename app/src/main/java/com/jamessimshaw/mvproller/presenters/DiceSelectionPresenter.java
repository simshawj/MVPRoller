package com.jamessimshaw.mvproller.presenters;

import com.jamessimshaw.mvproller.views.DiceSelectionView;

/**
 * Created by james on 2/26/16.
 */
public interface DiceSelectionPresenter {
    void onD4AdditionClicked();
    void onD4CountSet(int count);
    void onD4RemovalClicked();

    void onD6AdditionClicked();
    void onD6CountSet(int count);
    void onD6RemovalClicked();

    void onD8AdditionClicked();
    void onD8CountSet(int count);
    void onD8RemovalClicked();

    void onD10AdditionClicked();
    void onD10CountSet(int count);
    void onD10RemovalClicked();

    void onD12AdditionClicked();
    void onD12CountSet(int count);
    void onD12RemovalClicked();

    void onD20AdditionClicked();
    void onD20CountSet(int count);
    void onD20RemovalClicked();

    void onD100AdditionClicked();
    void onD100CountSet(int count);
    void onD100RemovalClicked();

    void setView(DiceSelectionView view);
    void removeView(DiceSelectionView view);
}
