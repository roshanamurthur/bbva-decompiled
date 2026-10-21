package com.google.android.material.snackbar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* JADX INFO: compiled from: BaseTransientBottomBar.java */
/* JADX INFO: loaded from: classes10.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f45468p0;

    public j(BaseTransientBottomBar baseTransientBottomBar) {
        this.f45468p0 = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BaseTransientBottomBar baseTransientBottomBar = this.f45468p0;
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = baseTransientBottomBar.view;
        if (snackbarBaseLayout == null) {
            return;
        }
        if (snackbarBaseLayout.getParent() != null) {
            baseTransientBottomBar.view.setVisibility(0);
        }
        if (baseTransientBottomBar.view.getAnimationMode() == 1) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(baseTransientBottomBar.f45416d);
            valueAnimatorOfFloat.addUpdateListener(new b(baseTransientBottomBar));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
            valueAnimatorOfFloat2.setInterpolator(baseTransientBottomBar.f45418f);
            valueAnimatorOfFloat2.addUpdateListener(new c(baseTransientBottomBar));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
            animatorSet.setDuration(baseTransientBottomBar.f45413a);
            animatorSet.addListener(new k(baseTransientBottomBar));
            animatorSet.start();
            return;
        }
        int height = baseTransientBottomBar.view.getHeight();
        ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        baseTransientBottomBar.view.setTranslationY(height);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(height, 0);
        valueAnimator.setInterpolator(baseTransientBottomBar.f45417e);
        valueAnimator.setDuration(baseTransientBottomBar.f45415c);
        valueAnimator.addListener(new d(baseTransientBottomBar));
        valueAnimator.addUpdateListener(new e(baseTransientBottomBar, height));
        valueAnimator.start();
    }
}
