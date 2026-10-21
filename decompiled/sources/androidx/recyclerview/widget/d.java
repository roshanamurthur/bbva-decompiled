package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: DefaultItemAnimator.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.ViewHolder f22974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f22975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f22976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DefaultItemAnimator f22977d;

    public d(View view, ViewPropertyAnimator viewPropertyAnimator, DefaultItemAnimator defaultItemAnimator, RecyclerView.ViewHolder viewHolder) {
        this.f22977d = defaultItemAnimator;
        this.f22974a = viewHolder;
        this.f22975b = viewPropertyAnimator;
        this.f22976c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f22975b.setListener(null);
        this.f22976c.setAlpha(1.0f);
        DefaultItemAnimator defaultItemAnimator = this.f22977d;
        RecyclerView.ViewHolder viewHolder = this.f22974a;
        defaultItemAnimator.dispatchRemoveFinished(viewHolder);
        defaultItemAnimator.f22595q.remove(viewHolder);
        defaultItemAnimator.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f22977d.dispatchRemoveStarting(this.f22974a);
    }
}
