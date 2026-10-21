package be;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* JADX INFO: compiled from: HideBottomViewOnScrollBehavior.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HideBottomViewOnScrollBehavior f25192a;

    public a(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.f25192a = hideBottomViewOnScrollBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f25192a.f43997x0 = null;
    }
}
