package le;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;

/* JADX INFO: compiled from: CircularIndeterminateAnimatorDelegate.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.progressindicator.b f83187a;

    public b(com.google.android.material.progressindicator.b bVar) {
        this.f83187a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        com.google.android.material.progressindicator.b bVar = this.f83187a;
        bVar.a();
        Animatable2Compat.AnimationCallback animationCallback = bVar.f45056j;
        if (animationCallback != null) {
            animationCallback.onAnimationEnd(bVar.f45066a);
        }
    }
}
