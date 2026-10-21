package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes9.dex */
public class ViewAnimationFactory<R> implements TransitionFactory<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewTransition.a f38876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewTransition f38877b;

    public static class a implements ViewTransition.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f38878a;

        public a(Animation animation) {
            this.f38878a = animation;
        }

        @Override // com.bumptech.glide.request.transition.ViewTransition.a
        public final Animation a(Context context) {
            return this.f38878a;
        }
    }

    public static class b implements ViewTransition.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f38879a;

        public b(int i10) {
            this.f38879a = i10;
        }

        @Override // com.bumptech.glide.request.transition.ViewTransition.a
        public final Animation a(Context context) {
            return AnimationUtils.loadAnimation(context, this.f38879a);
        }
    }

    public ViewAnimationFactory(Animation animation) {
        this(new a(animation));
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public Transition<R> build(DataSource dataSource, boolean z10) {
        if (dataSource == DataSource.MEMORY_CACHE || !z10) {
            return NoTransition.get();
        }
        if (this.f38877b == null) {
            this.f38877b = new ViewTransition(this.f38876a);
        }
        return this.f38877b;
    }

    public ViewAnimationFactory(int i10) {
        this(new b(i10));
    }

    public ViewAnimationFactory(ViewTransition.a aVar) {
        this.f38876a = aVar;
    }
}
