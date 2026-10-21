package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;

/* JADX INFO: compiled from: SearchBarAnimationHelper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f45155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Animator f45156b;

    public g(View view, AnimatorSet animatorSet) {
        this.f45155a = view;
        this.f45156b = animatorSet;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f45155a.setVisibility(8);
        this.f45156b.start();
    }
}
