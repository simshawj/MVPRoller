package com.jamessimshaw.mvproller.dagger.components;

import com.jamessimshaw.mvproller.dagger.modules.DiceSelectionModule;
import com.jamessimshaw.mvproller.views.DiceSelectionViewImpl;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by james on 2/28/16.
 */
@Singleton
@Component(modules = {DiceSelectionModule.class})
public interface DiceSelectionComponent {
    void inject(DiceSelectionViewImpl view);
}
