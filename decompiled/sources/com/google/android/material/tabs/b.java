package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: TabLayout.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f45556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f45557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TabLayout.d f45558c;

    public b(TabLayout.d dVar, View view, View view2) {
        this.f45558c = dVar;
        this.f45556a = view;
        this.f45557b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        this.f45558c.c(this.f45556a, this.f45557b, valueAnimator.getAnimatedFraction());
    }
}
