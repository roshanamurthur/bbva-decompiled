package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes9.dex */
public class NoTransition<R> implements Transition<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NoTransition<?> f38874a = new NoTransition<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final NoAnimationFactory f38875b = new NoAnimationFactory();

    public static class NoAnimationFactory<R> implements TransitionFactory<R> {
        @Override // com.bumptech.glide.request.transition.TransitionFactory
        public Transition<R> build(DataSource dataSource, boolean z10) {
            return NoTransition.f38874a;
        }
    }

    public static <R> Transition<R> get() {
        return f38874a;
    }

    public static <R> TransitionFactory<R> getFactory() {
        return f38875b;
    }

    @Override // com.bumptech.glide.request.transition.Transition
    public boolean transition(Object obj, Transition.ViewAdapter viewAdapter) {
        return false;
    }
}
