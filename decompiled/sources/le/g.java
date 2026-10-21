package le;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;

/* JADX INFO: compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.progressindicator.g f83192a;

    public g(com.google.android.material.progressindicator.g gVar) {
        this.f83192a = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        com.google.android.material.progressindicator.g gVar = this.f83192a;
        gVar.a();
        Animatable2Compat.AnimationCallback animationCallback = gVar.f45089j;
        if (animationCallback != null) {
            animationCallback.onAnimationEnd(gVar.f45066a);
        }
    }
}
