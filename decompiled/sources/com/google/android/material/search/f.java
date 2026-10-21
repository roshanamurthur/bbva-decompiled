package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;

/* JADX INFO: compiled from: SearchBarAnimationHelper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f45154a;

    public f(l lVar) {
        this.f45154a = lVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Iterator it = this.f45154a.f45163a.iterator();
        while (it.hasNext()) {
            ((SearchBar.OnLoadAnimationCallback) it.next()).onAnimationEnd();
        }
    }
}
