package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: BaseTransientBottomBar.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f45464b;

    public f(BaseTransientBottomBar baseTransientBottomBar, int i10) {
        this.f45464b = baseTransientBottomBar;
        this.f45463a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f45464b.a(this.f45463a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f45464b;
        baseTransientBottomBar.f45421i.animateContentOut(0, baseTransientBottomBar.f45414b);
    }
}
