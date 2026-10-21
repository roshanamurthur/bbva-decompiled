package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: SearchBarAnimationHelper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class k extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchBar f45161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f45162b;

    public k(l lVar, SearchBar searchBar) {
        this.f45162b = lVar;
        this.f45161a = searchBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f45161a.setVisibility(0);
        this.f45162b.f45169g = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f45161a.stopOnLoadAnimation();
    }
}
