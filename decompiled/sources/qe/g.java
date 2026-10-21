package qe;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: FadeThroughProvider.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f92838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f92839b;

    public g(float f6, View view) {
        this.f92838a = view;
        this.f92839b = f6;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f92838a.setAlpha(this.f92839b);
    }
}
