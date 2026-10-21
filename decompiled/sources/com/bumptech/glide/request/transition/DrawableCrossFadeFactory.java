package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes9.dex */
public class DrawableCrossFadeFactory implements TransitionFactory<Drawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DrawableCrossFadeTransition f38869c;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f38870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f38871b;

        public Builder() {
            this(300);
        }

        public DrawableCrossFadeFactory build() {
            return new DrawableCrossFadeFactory(this.f38870a, this.f38871b);
        }

        public Builder setCrossFadeEnabled(boolean z10) {
            this.f38871b = z10;
            return this;
        }

        public Builder(int i10) {
            this.f38870a = i10;
        }
    }

    public DrawableCrossFadeFactory(int i10, boolean z10) {
        this.f38867a = i10;
        this.f38868b = z10;
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public Transition<Drawable> build(DataSource dataSource, boolean z10) {
        if (dataSource == DataSource.MEMORY_CACHE) {
            return NoTransition.get();
        }
        if (this.f38869c == null) {
            this.f38869c = new DrawableCrossFadeTransition(this.f38867a, this.f38868b);
        }
        return this.f38869c;
    }
}
