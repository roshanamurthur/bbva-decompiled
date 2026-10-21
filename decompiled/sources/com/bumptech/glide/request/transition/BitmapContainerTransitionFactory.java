package com.bumptech.glide.request.transition;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BitmapContainerTransitionFactory<R> implements TransitionFactory<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransitionFactory<Drawable> f38864a;

    public final class a implements Transition<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Transition<Drawable> f38865a;

        public a(Transition<Drawable> transition) {
            this.f38865a = transition;
        }

        @Override // com.bumptech.glide.request.transition.Transition
        public final boolean transition(R r3, Transition.ViewAdapter viewAdapter) {
            return this.f38865a.transition(new BitmapDrawable(viewAdapter.getView().getResources(), BitmapContainerTransitionFactory.this.getBitmap(r3)), viewAdapter);
        }
    }

    public BitmapContainerTransitionFactory(TransitionFactory<Drawable> transitionFactory) {
        this.f38864a = transitionFactory;
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public Transition<R> build(DataSource dataSource, boolean z10) {
        return new a(this.f38864a.build(dataSource, z10));
    }

    public abstract Bitmap getBitmap(R r3);
}
