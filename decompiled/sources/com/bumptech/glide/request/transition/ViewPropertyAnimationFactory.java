package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes9.dex */
public class ViewPropertyAnimationFactory<R> implements TransitionFactory<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewPropertyTransition.Animator f38880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewPropertyTransition<R> f38881b;

    public ViewPropertyAnimationFactory(ViewPropertyTransition.Animator animator) {
        this.f38880a = animator;
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public Transition<R> build(DataSource dataSource, boolean z10) {
        if (dataSource == DataSource.MEMORY_CACHE || !z10) {
            return NoTransition.get();
        }
        if (this.f38881b == null) {
            this.f38881b = new ViewPropertyTransition<>(this.f38880a);
        }
        return this.f38881b;
    }
}
