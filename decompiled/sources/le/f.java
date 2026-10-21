package le;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.progressindicator.g f83191a;

    public f(com.google.android.material.progressindicator.g gVar) {
        this.f83191a = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        com.google.android.material.progressindicator.g gVar = this.f83191a;
        gVar.f45086g = (gVar.f45086g + 1) % gVar.f45085f.indicatorColors.length;
        gVar.f45087h = true;
    }
}
