package com.jamessimshaw.mvproller.presenters;

import com.jamessimshaw.mvproller.views.DiceSelectionView;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

/**
 * Created by james on 2/25/16.
 */
public class DiceSelectionPresenterImplTest {

    private DiceSelectionPresenterImpl mPresenter;
    private DiceSelectionView mView;

    @Before
    public void setup() {
        mView = mock(DiceSelectionView.class);

        mPresenter = new DiceSelectionPresenterImpl(mView);
    }

    @Test
    public void testDiceSelectionPresenterImplImplementsInterface() {
        assertThat(mPresenter, instanceOf(DiceSelectionPresenter.class));
    }

    @Test
    public void testOnD4AdditionClicked() {

    }

}
