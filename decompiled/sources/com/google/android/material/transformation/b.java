package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.material.circularreveal.CircularRevealWidget;

/* JADX INFO: compiled from: FabTransformationBehavior.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CircularRevealWidget f45837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Drawable f45838b;

    public b(CircularRevealWidget circularRevealWidget, Drawable drawable) {
        this.f45837a = circularRevealWidget;
        this.f45838b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f45837a.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f45837a.setCircularRevealOverlayDrawable(this.f45838b);
    }
}
