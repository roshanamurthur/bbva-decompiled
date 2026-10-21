package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: SearchBarAnimationHelper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f45157a;

    public h(l lVar) {
        this.f45157a = lVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f45157a.f45171i = null;
    }
}
