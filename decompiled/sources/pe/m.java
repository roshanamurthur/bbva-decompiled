package pe;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: SlideDistanceProvider.java */
/* JADX INFO: loaded from: classes10.dex */
public final class m extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f92673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f92674b;

    public m(float f6, View view) {
        this.f92673a = view;
        this.f92674b = f6;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f92673a.setTranslationX(this.f92674b);
    }
}
