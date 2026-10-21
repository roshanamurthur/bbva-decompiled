package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: FabTransformationBehavior.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f45836a;

    public a(View view) {
        this.f45836a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f45836a.invalidate();
    }
}
