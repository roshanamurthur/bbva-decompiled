package com.google.android.material.navigation;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: NavigationBarItemView.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f45012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavigationBarItemView f45013b;

    public b(NavigationBarItemView navigationBarItemView, float f6) {
        this.f45013b = navigationBarItemView;
        this.f45012a = f6;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int[] iArr = NavigationBarItemView.f44967a1;
        this.f45013b.d(fFloatValue, this.f45012a);
    }
}
