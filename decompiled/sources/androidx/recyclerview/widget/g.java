package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: DefaultItemAnimator.java */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DefaultItemAnimator.d f22988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f22989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f22990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DefaultItemAnimator f22991d;

    public g(DefaultItemAnimator defaultItemAnimator, DefaultItemAnimator.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f22991d = defaultItemAnimator;
        this.f22988a = dVar;
        this.f22989b = viewPropertyAnimator;
        this.f22990c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f22989b.setListener(null);
        View view = this.f22990c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        DefaultItemAnimator.d dVar = this.f22988a;
        RecyclerView.ViewHolder viewHolder = dVar.f22603a;
        DefaultItemAnimator defaultItemAnimator = this.f22991d;
        defaultItemAnimator.dispatchChangeFinished(viewHolder, true);
        defaultItemAnimator.f22596r.remove(dVar.f22603a);
        defaultItemAnimator.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f22991d.dispatchChangeStarting(this.f22988a.f22603a, true);
    }
}
