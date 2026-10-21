package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: BaseTransientBottomBar.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f45461a;

    public d(BaseTransientBottomBar baseTransientBottomBar) {
        this.f45461a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f45461a.b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f45461a;
        ContentViewCallback contentViewCallback = baseTransientBottomBar.f45421i;
        int i10 = baseTransientBottomBar.f45415c;
        int i11 = baseTransientBottomBar.f45413a;
        contentViewCallback.animateContentIn(i10 - i11, i11);
    }
}
