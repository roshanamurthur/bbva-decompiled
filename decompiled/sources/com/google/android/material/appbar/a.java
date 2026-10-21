package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: AppBarLayout.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f43950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f43951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f43952c;

    public a(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f43952c = baseBehavior;
        this.f43950a = coordinatorLayout;
        this.f43951b = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f43952c.g(this.f43950a, this.f43951b, iIntValue);
    }
}
