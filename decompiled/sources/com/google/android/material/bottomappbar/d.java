package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;

/* JADX INFO: compiled from: BottomAppBar.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f44046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f44047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f44048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f44049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f44050e;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i10, boolean z10) {
        this.f44050e = bottomAppBar;
        this.f44047b = actionMenuView;
        this.f44048c = i10;
        this.f44049d = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f44046a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f44046a) {
            return;
        }
        BottomAppBar bottomAppBar = this.f44050e;
        int i10 = bottomAppBar.D1;
        boolean z10 = i10 != 0;
        bottomAppBar.replaceMenu(i10);
        bottomAppBar.E(this.f44047b, this.f44048c, this.f44049d, z10);
    }
}
