package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: FloatingActionButtonImpl.java */
/* JADX INFO: loaded from: classes10.dex */
public final class i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f44713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j.f f44714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f44715c;

    public i(j jVar, boolean z10, g gVar) {
        this.f44715c = jVar;
        this.f44713a = z10;
        this.f44714b = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        j jVar = this.f44715c;
        jVar.f44732r = 0;
        jVar.f44727l = null;
        j.f fVar = this.f44714b;
        if (fVar != null) {
            g gVar = (g) fVar;
            gVar.f44707a.onShown(gVar.f44708b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        j jVar = this.f44715c;
        jVar.f44736v.internalSetVisibility(0, this.f44713a);
        jVar.f44732r = 2;
        jVar.f44727l = animator;
    }
}
