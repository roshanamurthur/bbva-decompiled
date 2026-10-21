package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: DefaultItemAnimator.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.ViewHolder f22982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f22984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f22986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DefaultItemAnimator f22987f;

    public f(DefaultItemAnimator defaultItemAnimator, RecyclerView.ViewHolder viewHolder, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f22987f = defaultItemAnimator;
        this.f22982a = viewHolder;
        this.f22983b = i10;
        this.f22984c = view;
        this.f22985d = i11;
        this.f22986e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i10 = this.f22983b;
        View view = this.f22984c;
        if (i10 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f22985d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f22986e.setListener(null);
        DefaultItemAnimator defaultItemAnimator = this.f22987f;
        RecyclerView.ViewHolder viewHolder = this.f22982a;
        defaultItemAnimator.dispatchMoveFinished(viewHolder);
        defaultItemAnimator.f22594p.remove(viewHolder);
        defaultItemAnimator.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f22987f.dispatchMoveStarting(this.f22982a);
    }
}
