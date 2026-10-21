package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: DefaultItemAnimator.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.ViewHolder f22978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f22979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f22980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DefaultItemAnimator f22981d;

    public e(View view, ViewPropertyAnimator viewPropertyAnimator, DefaultItemAnimator defaultItemAnimator, RecyclerView.ViewHolder viewHolder) {
        this.f22981d = defaultItemAnimator;
        this.f22978a = viewHolder;
        this.f22979b = view;
        this.f22980c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f22979b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f22980c.setListener(null);
        DefaultItemAnimator defaultItemAnimator = this.f22981d;
        RecyclerView.ViewHolder viewHolder = this.f22978a;
        defaultItemAnimator.dispatchAddFinished(viewHolder);
        defaultItemAnimator.f22593o.remove(viewHolder);
        defaultItemAnimator.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f22981d.dispatchAddStarting(this.f22978a);
    }
}
