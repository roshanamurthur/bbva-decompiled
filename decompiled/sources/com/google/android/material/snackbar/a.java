package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: BaseTransientBottomBar.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f45458b;

    public a(BaseTransientBottomBar baseTransientBottomBar, int i10) {
        this.f45458b = baseTransientBottomBar;
        this.f45457a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f45458b.a(this.f45457a);
    }
}
