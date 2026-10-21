package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes9.dex */
public class ViewTransition<R> implements Transition<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f38883a;

    public interface a {
        Animation a(Context context);
    }

    public ViewTransition(a aVar) {
        this.f38883a = aVar;
    }

    @Override // com.bumptech.glide.request.transition.Transition
    public boolean transition(R r3, Transition.ViewAdapter viewAdapter) {
        View view = viewAdapter.getView();
        if (view == null) {
            return false;
        }
        view.clearAnimation();
        view.startAnimation(this.f38883a.a(view.getContext()));
        return false;
    }
}
