package com.bumptech.glide.request.transition;

import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public class ViewPropertyTransition<R> implements Transition<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Animator f38882a;

    public interface Animator {
        void animate(View view);
    }

    public ViewPropertyTransition(Animator animator) {
        this.f38882a = animator;
    }

    @Override // com.bumptech.glide.request.transition.Transition
    public boolean transition(R r3, Transition.ViewAdapter viewAdapter) {
        if (viewAdapter.getView() == null) {
            return false;
        }
        this.f38882a.animate(viewAdapter.getView());
        return false;
    }
}
