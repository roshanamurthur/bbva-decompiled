package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: FloatingActionButtonImpl.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f44709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f44710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j.f f44711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f44712d;

    public h(j jVar, boolean z10, g gVar) {
        this.f44712d = jVar;
        this.f44710b = z10;
        this.f44711c = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f44709a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        j jVar = this.f44712d;
        jVar.f44732r = 0;
        jVar.f44727l = null;
        if (this.f44709a) {
            return;
        }
        boolean z10 = this.f44710b;
        jVar.f44736v.internalSetVisibility(z10 ? 8 : 4, z10);
        j.f fVar = this.f44711c;
        if (fVar != null) {
            g gVar = (g) fVar;
            gVar.f44707a.onHidden(gVar.f44708b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        j jVar = this.f44712d;
        jVar.f44736v.internalSetVisibility(0, this.f44710b);
        jVar.f44732r = 1;
        jVar.f44727l = animator;
        this.f44709a = false;
    }
}
