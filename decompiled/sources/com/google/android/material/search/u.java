package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: SearchViewAnimationHelper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class u extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f45185a;

    public u(w wVar) {
        this.f45185a = wVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        w wVar = this.f45185a;
        boolean zB = wVar.f45187a.b();
        SearchView searchView = wVar.f45187a;
        if (!zB && searchView.R0) {
            searchView.requestFocusAndShowKeyboard();
        }
        searchView.setTransitionState(SearchView.TransitionState.SHOWN);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        w wVar = this.f45185a;
        wVar.f45189c.setVisibility(0);
        wVar.f45187a.setTransitionState(SearchView.TransitionState.SHOWING);
    }
}
