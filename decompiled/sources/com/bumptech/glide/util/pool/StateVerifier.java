package com.bumptech.glide.util.pool;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public abstract class StateVerifier {

    public static class a extends StateVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile boolean f38933a;

        @Override // com.bumptech.glide.util.pool.StateVerifier
        public final void a(boolean z10) {
            this.f38933a = z10;
        }

        @Override // com.bumptech.glide.util.pool.StateVerifier
        public final void throwIfRecycled() {
            if (this.f38933a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    @NonNull
    public static StateVerifier newInstance() {
        return new a();
    }

    public abstract void a(boolean z10);

    public abstract void throwIfRecycled();
}
