package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: compiled from: BottomAppBar.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f44051a;

    public e(BottomAppBar bottomAppBar) {
        this.f44051a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BottomAppBar bottomAppBar = this.f44051a;
        bottomAppBar.K1.onAnimationStart(animator);
        FloatingActionButton floatingActionButtonW = bottomAppBar.w();
        if (floatingActionButtonW != null) {
            floatingActionButtonW.setTranslationX(bottomAppBar.getFabTranslationX());
        }
    }
}
