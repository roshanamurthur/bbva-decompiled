package h3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.collection.ArrayMap;
import androidx.transition.Transition;

/* JADX INFO: compiled from: Transition.java */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayMap f69326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Transition f69327b;

    public l(Transition transition, ArrayMap arrayMap) {
        this.f69327b = transition;
        this.f69326a = arrayMap;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f69326a.remove(animator);
        this.f69327b.R0.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f69327b.R0.add(animator);
    }
}
