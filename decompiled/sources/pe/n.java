package pe;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: SlideDistanceProvider.java */
/* JADX INFO: loaded from: classes10.dex */
public final class n extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f92675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f92676b;

    public n(float f6, View view) {
        this.f92675a = view;
        this.f92676b = f6;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f92675a.setTranslationY(this.f92676b);
    }
}
