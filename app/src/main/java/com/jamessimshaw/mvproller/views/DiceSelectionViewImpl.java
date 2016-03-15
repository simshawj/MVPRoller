package com.jamessimshaw.mvproller.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jamessimshaw.mvproller.R;
import com.jamessimshaw.mvproller.dagger.components.DaggerDiceSelectionComponent;
import com.jamessimshaw.mvproller.dagger.modules.DiceSelectionModule;
import com.jamessimshaw.mvproller.presenters.DiceSelectionPresenter;

import java.util.Locale;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;

/**
 * Created by james on 2/29/16.
 */
public class DiceSelectionViewImpl extends RelativeLayout implements DiceSelectionView {

    @Inject DiceSelectionPresenter mPresenter;

    @Bind(R.id.d4AddDieImageView) ImageView mD4AddButton;
    @Bind(R.id.d4DieCountEditText) EditText mD4CountText;
    @Bind(R.id.d4RemoveDieImageView) ImageView mD4RemoveButton;
    @Bind(R.id.d6AddDieImageView) ImageView mD6AddButton;
    @Bind(R.id.d6DieCountEditText) EditText mD6CountText;
    @Bind(R.id.d6RemoveDieImageView) ImageView mD6RemoveButton;
    @Bind(R.id.d8AddDieImageView) ImageView mD8AddButton;
    @Bind(R.id.d8DieCountEditText) EditText mD8CountText;
    @Bind(R.id.d8RemoveDieImageView) ImageView mD8RemoveButton;
    @Bind(R.id.d10AddDieImageView) ImageView mD10AddButton;
    @Bind(R.id.d10DieCountEditText) EditText mD10CountText;
    @Bind(R.id.d10RemoveDieImageView) ImageView mD10RemoveButton;
    @Bind(R.id.d12AddDieImageView) ImageView mD12AddButton;
    @Bind(R.id.d12DieCountEditText) EditText mD12CountText;
    @Bind(R.id.d12RemoveDieImageView) ImageView mD12RemoveButton;
    @Bind(R.id.d20AddDieImageView) ImageView mD20AddButton;
    @Bind(R.id.d20DieCountEditText) EditText mD20CountText;
    @Bind(R.id.d20RemoveDieImageView) ImageView mD20RemoveButton;
    @Bind(R.id.d100AddDieImageView) ImageView mD100AddButton;
    @Bind(R.id.d100DieCountEditText) EditText mD100CountText;
    @Bind(R.id.d100RemoveDieImageView) ImageView mD100RemoveButton;
    @Bind(R.id.resultTextView) TextView mResultTextView;
    private boolean mDontMonitor;

    public DiceSelectionViewImpl(Context context) {
        super(context);
        setup(context);
    }

    public DiceSelectionViewImpl(Context context, AttributeSet attrs) {
        super(context, attrs);
        setup(context);
    }

    public DiceSelectionViewImpl(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setup(context);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mPresenter.setView(this);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mPresenter.removeView(this);
        mPresenter = null;
    }

    private void setup(Context context) {
        DaggerDiceSelectionComponent.builder()
                .diceSelectionModule(new DiceSelectionModule())
                .build().inject(this);
        inflate(context, R.layout.dice_selection, this);
        ButterKnife.bind(this);
        mDontMonitor = false;
    }

    // DiceSelectionView Methods

    @Override
    public void updateD4Number(int number) {
        mDontMonitor = true;
        mD4CountText.setText(String.format(Locale.getDefault(), "%d", number));
        mDontMonitor = false;
    }

    @Override
    public void updateD6Number(int number) {
        mDontMonitor = true;
        mD6CountText.setText(String.format(Locale.getDefault(), "%d", number));
        mDontMonitor = false;
    }

    @Override
    public void updateD8Number(int number) {
        mDontMonitor = true;
        mD8CountText.setText(String.format(Locale.getDefault(), "%d", number));
        mDontMonitor = false;
    }

    @Override
    public void updateD10Number(int number) {
        mDontMonitor = true;
        mD10CountText.setText(String.format(Locale.getDefault(), "%d", number));
        mDontMonitor = false;
    }

    @Override
    public void updateD12Number(int number) {
        mDontMonitor = true;
        mD12CountText.setText(String.format(Locale.getDefault(), "%d", number));
        mDontMonitor = false;
    }

    @Override
    public void updateD20Number(int number) {
        mDontMonitor = true;
        mD20CountText.setText(String.format(Locale.getDefault(), "%d", number));
        mDontMonitor = false;
    }

    @Override
    public void updateD100Number(int number) {
        mDontMonitor = true;
        mD100CountText.setText(String.format(Locale.getDefault(), "%d", number));
        mDontMonitor = false;
    }

    @Override
    public void animateRoll() {
        // Nothing for now
    }

    @Override
    public void displayResult(int roll) {
        mResultTextView.setText(String.format(Locale.getDefault(), "%d", roll));
        mResultTextView.setVisibility(VISIBLE);
    }

    // ClickListeners

    @OnClick(R.id.d4AddDieImageView)
    public void onD4AddClick() {
        mPresenter.onD4AdditionClicked();
    }

    @OnClick(R.id.d4RemoveDieImageView)
    public void onD4RemoveClick() {
        mPresenter.onD4RemovalClicked();
    }

    @OnClick(R.id.d6AddDieImageView)
    public void onD6AddClick() {
        mPresenter.onD6AdditionClicked();
    }

    @OnClick(R.id.d6RemoveDieImageView)
    public void onD6RemoveClick() {
        mPresenter.onD6RemovalClicked();
    }

    @OnClick(R.id.d8AddDieImageView)
    public void onD8AddClick() {
        mPresenter.onD8AdditionClicked();
    }

    @OnClick(R.id.d8RemoveDieImageView)
    public void onD8RemoveClick() {
        mPresenter.onD8RemovalClicked();
    }

    @OnClick(R.id.d10AddDieImageView)
    public void onD10AddClick() {
        mPresenter.onD10AdditionClicked();
    }

    @OnClick(R.id.d10RemoveDieImageView)
    public void onD10RemoveClick() {
        mPresenter.onD10RemovalClicked();
    }

    @OnClick(R.id.d12AddDieImageView)
    public void onD12AddClick() {
        mPresenter.onD12AdditionClicked();
    }

    @OnClick(R.id.d12RemoveDieImageView)
    public void onD12RemoveClick() {
        mPresenter.onD12RemovalClicked();
    }

    @OnClick(R.id.d20AddDieImageView)
    public void onD20AddClick() {
        mPresenter.onD20AdditionClicked();
    }

    @OnClick(R.id.d20RemoveDieImageView)
    public void onD20RemoveClick() {
        mPresenter.onD20RemovalClicked();
    }

    @OnClick(R.id.d100AddDieImageView)
    public void onD100AddClick() {
        mPresenter.onD100AdditionClicked();
    }

    @OnClick(R.id.d100RemoveDieImageView)
    public void onD100RemoveClick() {
        mPresenter.onD100RemovalClicked();
    }

    @OnClick(R.id.rollButton)
    public void onRollClicked() {
        mPresenter.rollSelected();
    }

    // TextWatchers

    @OnTextChanged(R.id.d4DieCountEditText)
    public void onD4CountEdit(CharSequence text) {
        if (mDontMonitor) return;
        int count;
        try {
            count = Integer.parseInt(text.toString());
        } catch (NumberFormatException e) {
            count = 0;
        }
        mPresenter.onD4CountSet(count);
    }

    @OnTextChanged(R.id.d6DieCountEditText)
    public void onD6CountEdit(CharSequence text) {
        if (mDontMonitor) return;
        int count;
        try {
            count = Integer.parseInt(text.toString());
        } catch (NumberFormatException e) {
            count = 0;
        }
        mPresenter.onD6CountSet(count);
    }

    @OnTextChanged(R.id.d8DieCountEditText)
    public void onD8CountEdit(CharSequence text) {
        if (mDontMonitor) return;
        int count;
        try {
            count = Integer.parseInt(text.toString());
        } catch (NumberFormatException e) {
            count = 0;
        }
        mPresenter.onD8CountSet(count);
    }

    @OnTextChanged(R.id.d10DieCountEditText)
    public void onD10CountEdit(CharSequence text) {
        if (mDontMonitor) return;
        int count;
        try {
            count = Integer.parseInt(text.toString());
        } catch (NumberFormatException e) {
            count = 0;
        }
        mPresenter.onD10CountSet(count);
    }

    @OnTextChanged(R.id.d12DieCountEditText)
    public void onD12CountEdit(CharSequence text) {
        if (mDontMonitor) return;
        int count;
        try {
            count = Integer.parseInt(text.toString());
        } catch (NumberFormatException e) {
            count = 0;
        }
        mPresenter.onD12CountSet(count);
    }

    @OnTextChanged(R.id.d20DieCountEditText)
    public void onD20CountEdit(CharSequence text) {
        if (mDontMonitor) return;
        int count;
        try {
            count = Integer.parseInt(text.toString());
        } catch (NumberFormatException e) {
            count = 0;
        }
        mPresenter.onD20CountSet(count);
    }

    @OnTextChanged(R.id.d100DieCountEditText)
    public void onD100CountEdit(CharSequence text) {
        if (mDontMonitor) return;
        int count;
        try {
            count = Integer.parseInt(text.toString());
        } catch (NumberFormatException e) {
            count = 0;
        }
        mPresenter.onD100CountSet(count);
    }
}
