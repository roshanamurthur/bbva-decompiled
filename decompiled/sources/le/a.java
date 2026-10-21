package le;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: CircularIndeterminateAnimatorDelegate.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.progressindicator.b f83186a;

    public a(com.google.android.material.progressindicator.b bVar) {
        this.f83186a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        com.google.android.material.progressindicator.b bVar = this.f83186a;
        bVar.f45053g = (bVar.f45053g + 4) % bVar.f45052f.indicatorColors.length;
    }
}
