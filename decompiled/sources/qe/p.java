package qe;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: SlideDistanceProvider.java */
/* JADX INFO: loaded from: classes10.dex */
public final class p extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f92857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f92858b;

    public p(float f6, View view) {
        this.f92857a = view;
        this.f92858b = f6;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f92857a.setTranslationX(this.f92858b);
    }
}
