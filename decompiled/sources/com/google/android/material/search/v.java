package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: SearchViewAnimationHelper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class v extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f45186a;

    public v(w wVar) {
        this.f45186a = wVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        w wVar = this.f45186a;
        wVar.f45189c.setVisibility(8);
        if (!wVar.f45187a.b()) {
            wVar.f45187a.clearFocusAndHideKeyboard();
        }
        wVar.f45187a.setTransitionState(SearchView.TransitionState.HIDDEN);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f45186a.f45187a.setTransitionState(SearchView.TransitionState.HIDING);
    }
}
