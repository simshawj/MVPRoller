package com.jamessimshaw.mvproller.dagger.modules;

import com.jamessimshaw.mvproller.presenters.DiceSelectionPresenter;
import com.jamessimshaw.mvproller.presenters.DiceSelectionPresenterImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by james on 2/28/16.
 */
@Module
public class DiceSelectionModule {

    @Singleton
    @Provides
    public DiceSelectionPresenter provideDiceSelectionPresenter() {
        return new DiceSelectionPresenterImpl();
    }
}
