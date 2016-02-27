package com.jamessimshaw.mvproller.presenters;

import com.jamessimshaw.mvproller.views.DiceSelectionView;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;

/**
 * Created by james on 2/25/16.
 */
public class DiceSelectionPresenterImplTest {

    private DiceSelectionPresenter mPresenter;
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

    // D4

    @Test
    public void testOnD4AdditionClicked() {
        mPresenter.onD4AdditionClicked();
        verify(mView).updateD4Number(1);
        reset(mView);
        mPresenter.onD4AdditionClicked();
        verify(mView).updateD4Number(2);
    }

    @Test
    public void testOnD4NumberSet() {
        mPresenter.onD4CountSet(5);
        verify(mView).updateD4Number(5);
    }

    @Test
    public void testOnD4RemovalClicked() {
        mPresenter.onD4RemovalClicked();
        verify(mView).updateD4Number(0);
        mPresenter.onD4AdditionClicked();
        mPresenter.onD4AdditionClicked();
        mPresenter.onD4AdditionClicked();
        reset(mView);
        mPresenter.onD4RemovalClicked();
        verify(mView).updateD4Number(2);
    }

    // D6

    @Test
    public void testOnD6AdditionClicked() {
        mPresenter.onD6AdditionClicked();
        verify(mView).updateD6Number(1);
        reset(mView);
        mPresenter.onD6AdditionClicked();
        verify(mView).updateD6Number(2);
    }

    @Test
    public void testOnD6NumberSet() {
        mPresenter.onD6CountSet(5);
        verify(mView).updateD6Number(5);
    }

    @Test
    public void testOnD6RemovalClicked() {
        mPresenter.onD6RemovalClicked();
        verify(mView).updateD6Number(0);
        mPresenter.onD6AdditionClicked();
        mPresenter.onD6AdditionClicked();
        mPresenter.onD6AdditionClicked();
        reset(mView);
        mPresenter.onD6RemovalClicked();
        verify(mView).updateD6Number(2);
    }

    // D8

    @Test
    public void testOnD8AdditionClicked() {
        mPresenter.onD8AdditionClicked();
        verify(mView).updateD8Number(1);
        reset(mView);
        mPresenter.onD8AdditionClicked();
        verify(mView).updateD8Number(2);
    }

    @Test
    public void testOnD8NumberSet() {
        mPresenter.onD8CountSet(5);
        verify(mView).updateD8Number(5);
    }

    @Test
    public void testOnD8RemovalClicked() {
        mPresenter.onD8RemovalClicked();
        verify(mView).updateD8Number(0);
        mPresenter.onD8AdditionClicked();
        mPresenter.onD8AdditionClicked();
        mPresenter.onD8AdditionClicked();
        reset(mView);
        mPresenter.onD8RemovalClicked();
        verify(mView).updateD8Number(2);
    }

    // D10

    @Test
    public void testOnD10AdditionClicked() {
        mPresenter.onD10AdditionClicked();
        verify(mView).updateD10Number(1);
        reset(mView);
        mPresenter.onD10AdditionClicked();
        verify(mView).updateD10Number(2);
    }

    @Test
    public void testOnD10NumberSet() {
        mPresenter.onD10CountSet(5);
        verify(mView).updateD10Number(5);
    }

    @Test
    public void testOnD10RemovalClicked() {
        mPresenter.onD10RemovalClicked();
        verify(mView).updateD10Number(0);
        mPresenter.onD10AdditionClicked();
        mPresenter.onD10AdditionClicked();
        mPresenter.onD10AdditionClicked();
        reset(mView);
        mPresenter.onD10RemovalClicked();
        verify(mView).updateD10Number(2);
    }

    // D12

    @Test
    public void testOnD12AdditionClicked() {
        mPresenter.onD12AdditionClicked();
        verify(mView).updateD12Number(1);
        reset(mView);
        mPresenter.onD12AdditionClicked();
        verify(mView).updateD12Number(2);
    }

    @Test
    public void testOnD12NumberSet() {
        mPresenter.onD12CountSet(5);
        verify(mView).updateD12Number(5);
    }

    @Test
    public void testOnD12RemovalClicked() {
        mPresenter.onD12RemovalClicked();
        verify(mView).updateD12Number(0);
        mPresenter.onD12AdditionClicked();
        mPresenter.onD12AdditionClicked();
        mPresenter.onD12AdditionClicked();
        reset(mView);
        mPresenter.onD12RemovalClicked();
        verify(mView).updateD12Number(2);
    }

    // D20

    @Test
    public void testOnD20AdditionClicked() {
        mPresenter.onD20AdditionClicked();
        verify(mView).updateD20Number(1);
        reset(mView);
        mPresenter.onD20AdditionClicked();
        verify(mView).updateD20Number(2);
    }

    @Test
    public void testOnD20NumberSet() {
        mPresenter.onD20CountSet(5);
        verify(mView).updateD20Number(5);
    }

    @Test
    public void testOnD20RemovalClicked() {
        mPresenter.onD20RemovalClicked();
        verify(mView).updateD20Number(0);
        mPresenter.onD20AdditionClicked();
        mPresenter.onD20AdditionClicked();
        mPresenter.onD20AdditionClicked();
        reset(mView);
        mPresenter.onD20RemovalClicked();
        verify(mView).updateD20Number(2);
    }

    // D100

    @Test
    public void testOnD100AdditionClicked() {
        mPresenter.onD100AdditionClicked();
        verify(mView).updateD100Number(1);
        reset(mView);
        mPresenter.onD100AdditionClicked();
        verify(mView).updateD100Number(2);
    }

    @Test
    public void testOnD100NumberSet() {
        mPresenter.onD100CountSet(5);
        verify(mView).updateD100Number(5);
    }

    @Test
    public void testOnD100RemovalClicked() {
        mPresenter.onD100RemovalClicked();
        verify(mView).updateD100Number(0);
        mPresenter.onD100AdditionClicked();
        mPresenter.onD100AdditionClicked();
        mPresenter.onD100AdditionClicked();
        reset(mView);
        mPresenter.onD100RemovalClicked();
        verify(mView).updateD100Number(2);
    }
}
