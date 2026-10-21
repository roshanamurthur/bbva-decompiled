package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: DefaultItemAnimator.java */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DefaultItemAnimator.d f22992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f22993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f22994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DefaultItemAnimator f22995d;

    public h(DefaultItemAnimator defaultItemAnimator, DefaultItemAnimator.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f22995d = defaultItemAnimator;
        this.f22992a = dVar;
        this.f22993b = viewPropertyAnimator;
        this.f22994c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f22993b.setListener(null);
        View view = this.f22994c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        DefaultItemAnimator.d dVar = this.f22992a;
        RecyclerView.ViewHolder viewHolder = dVar.f22604b;
        DefaultItemAnimator defaultItemAnimator = this.f22995d;
        defaultItemAnimator.dispatchChangeFinished(viewHolder, false);
        defaultItemAnimator.f22596r.remove(dVar.f22604b);
        defaultItemAnimator.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f22995d.dispatchChangeStarting(this.f22992a.f22604b, false);
    }
}
