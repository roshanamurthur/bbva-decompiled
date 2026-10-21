package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: EngineResource.java */
/* JADX INFO: loaded from: classes9.dex */
public final class f<Z> implements Resource<Z> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f38371p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f38372q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Resource<Z> f38373r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final a f38374s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Key f38375t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f38376u0;
    public boolean v0;

    /* JADX INFO: compiled from: EngineResource.java */
    public interface a {
        void onResourceReleased(Key key, f<?> fVar);
    }

    public f(Resource<Z> resource, boolean z10, boolean z11, Key key, a aVar) {
        this.f38373r0 = (Resource) Preconditions.checkNotNull(resource);
        this.f38371p0 = z10;
        this.f38372q0 = z11;
        this.f38375t0 = key;
        this.f38374s0 = (a) Preconditions.checkNotNull(aVar);
    }

    public final synchronized void a() {
        if (this.v0) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f38376u0++;
    }

    public final void b() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f38376u0;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f38376u0 = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f38374s0.onResourceReleased(this.f38375t0, this);
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    public final Z get() {
        return this.f38373r0.get();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    public final Class<Z> getResourceClass() {
        return this.f38373r0.getResourceClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return this.f38373r0.getSize();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final synchronized void recycle() {
        if (this.f38376u0 > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.v0) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.v0 = true;
        if (this.f38372q0) {
            this.f38373r0.recycle();
        }
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f38371p0 + ", listener=" + this.f38374s0 + ", key=" + this.f38375t0 + ", acquired=" + this.f38376u0 + ", isRecycled=" + this.v0 + ", resource=" + this.f38373r0 + AbstractJsonLexerKt.END_OBJ;
    }
}
