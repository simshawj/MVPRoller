package com.jamessimshaw.mvproller.views;

/**
 * Created by james on 2/26/16.
 */
public interface DiceSelectionView {
    void updateD4Number(int number);

    void updateD6Number(int number);

    void updateD8Number(int number);

    void updateD10Number(int number);

    void updateD12Number(int number);

    void updateD20Number(int number);

    void updateD100Number(int number);
}
