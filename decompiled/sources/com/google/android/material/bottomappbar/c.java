package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: BottomAppBar.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f44045a;

    public c(BottomAppBar bottomAppBar) {
        this.f44045a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = BottomAppBar.M1;
        BottomAppBar bottomAppBar = this.f44045a;
        bottomAppBar.getClass();
        bottomAppBar.f44016q1 = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i10 = BottomAppBar.M1;
        this.f44045a.getClass();
    }
}
