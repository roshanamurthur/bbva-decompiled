package qe;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: FadeProvider.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f92831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f92832b;

    public e(float f6, View view) {
        this.f92831a = view;
        this.f92832b = f6;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f92831a.setAlpha(this.f92832b);
    }
}
