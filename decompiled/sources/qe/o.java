package qe;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: ScaleProvider.java */
/* JADX INFO: loaded from: classes10.dex */
public final class o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f92854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f92855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f92856c;

    public o(View view, float f6, float f10) {
        this.f92854a = view;
        this.f92855b = f6;
        this.f92856c = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f6 = this.f92855b;
        View view = this.f92854a;
        view.setScaleX(f6);
        view.setScaleY(this.f92856c);
    }
}
