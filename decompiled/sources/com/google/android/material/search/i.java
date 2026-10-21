package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: SearchBarAnimationHelper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchBar f45158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f45159b;

    public i(l lVar, SearchBar searchBar) {
        this.f45159b = lVar;
        this.f45158a = searchBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f45159b.f45168f = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f45158a.setVisibility(4);
    }
}
