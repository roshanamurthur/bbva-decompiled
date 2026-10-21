package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.circularreveal.CircularRevealWidget;

/* JADX INFO: compiled from: FabTransformationBehavior.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CircularRevealWidget f45839a;

    public c(CircularRevealWidget circularRevealWidget) {
        this.f45839a = circularRevealWidget;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        CircularRevealWidget circularRevealWidget = this.f45839a;
        CircularRevealWidget.RevealInfo revealInfo = circularRevealWidget.getRevealInfo();
        revealInfo.radius = Float.MAX_VALUE;
        circularRevealWidget.setRevealInfo(revealInfo);
    }
}
