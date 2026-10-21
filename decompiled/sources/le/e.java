package le;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.progressindicator.f f83190a;

    public e(com.google.android.material.progressindicator.f fVar) {
        this.f83190a = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        com.google.android.material.progressindicator.f fVar = this.f83190a;
        fVar.f45077f = (fVar.f45077f + 1) % fVar.f45076e.indicatorColors.length;
        fVar.f45078g = true;
    }
}
