package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.util.pool.GlideTrace;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import tc.j;

/* JADX INFO: compiled from: ResourceCacheGenerator.java */
/* JADX INFO: loaded from: classes9.dex */
public final class g implements DataFetcherGenerator, DataFetcher.DataCallback<Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final DataFetcherGenerator.FetcherReadyCallback f38377p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final c<?> f38378q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f38379r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f38380s0 = -1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Key f38381t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public List<ModelLoader<File, ?>> f38382u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public volatile ModelLoader.LoadData<?> f38383w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public File f38384x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public j f38385y0;

    public g(c<?> cVar, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this.f38378q0 = cVar;
        this.f38377p0 = fetcherReadyCallback;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final boolean a() {
        GlideTrace.beginSection("ResourceCacheGenerator.startNext");
        try {
            ArrayList arrayListA = this.f38378q0.a();
            boolean z10 = false;
            if (arrayListA.isEmpty()) {
                GlideTrace.endSection();
                return false;
            }
            c<?> cVar = this.f38378q0;
            List<Class<?>> registeredResourceClasses = cVar.f38267c.getRegistry().getRegisteredResourceClasses(cVar.f38268d.getClass(), cVar.f38271g, cVar.f38275k);
            if (registeredResourceClasses.isEmpty()) {
                if (File.class.equals(this.f38378q0.f38275k)) {
                    GlideTrace.endSection();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f38378q0.f38268d.getClass() + " to " + this.f38378q0.f38275k);
            }
            while (true) {
                List<ModelLoader<File, ?>> list = this.f38382u0;
                if (list != null && this.v0 < list.size()) {
                    this.f38383w0 = null;
                    while (!z10 && this.v0 < this.f38382u0.size()) {
                        List<ModelLoader<File, ?>> list2 = this.f38382u0;
                        int i10 = this.v0;
                        this.v0 = i10 + 1;
                        ModelLoader<File, ?> modelLoader = list2.get(i10);
                        File file = this.f38384x0;
                        c<?> cVar2 = this.f38378q0;
                        this.f38383w0 = modelLoader.buildLoadData(file, cVar2.f38269e, cVar2.f38270f, cVar2.f38273i);
                        if (this.f38383w0 != null) {
                            c<?> cVar3 = this.f38378q0;
                            if (cVar3.f38267c.getRegistry().getLoadPath(this.f38383w0.fetcher.getDataClass(), cVar3.f38271g, cVar3.f38275k) != null) {
                                this.f38383w0.fetcher.loadData(this.f38378q0.f38278o, this);
                                z10 = true;
                            }
                        }
                    }
                    GlideTrace.endSection();
                    return z10;
                }
                int i11 = this.f38380s0 + 1;
                this.f38380s0 = i11;
                if (i11 >= registeredResourceClasses.size()) {
                    int i12 = this.f38379r0 + 1;
                    this.f38379r0 = i12;
                    if (i12 >= arrayListA.size()) {
                        GlideTrace.endSection();
                        return false;
                    }
                    this.f38380s0 = 0;
                }
                Key key = (Key) arrayListA.get(this.f38379r0);
                Class<?> cls = registeredResourceClasses.get(this.f38380s0);
                Transformation<Z> transformationC = this.f38378q0.c(cls);
                ArrayPool arrayPool = this.f38378q0.f38267c.getArrayPool();
                c<?> cVar4 = this.f38378q0;
                this.f38385y0 = new j(arrayPool, key, cVar4.f38277n, cVar4.f38269e, cVar4.f38270f, transformationC, cls, cVar4.f38273i);
                File file2 = ((Engine.c) cVar4.f38272h).a().get(this.f38385y0);
                this.f38384x0 = file2;
                if (file2 != null) {
                    this.f38381t0 = key;
                    this.f38382u0 = this.f38378q0.f38267c.getRegistry().getModelLoaders(file2);
                    this.v0 = 0;
                }
            }
        } catch (Throwable th2) {
            GlideTrace.endSection();
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final void cancel() {
        ModelLoader.LoadData<?> loadData = this.f38383w0;
        if (loadData != null) {
            loadData.fetcher.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void onDataReady(Object obj) {
        this.f38377p0.onDataFetcherReady(this.f38381t0, obj, this.f38383w0.fetcher, DataSource.RESOURCE_DISK_CACHE, this.f38385y0);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void onLoadFailed(@NonNull Exception exc) {
        this.f38377p0.onDataFetcherFailed(this.f38385y0, exc, this.f38383w0.fetcher, DataSource.RESOURCE_DISK_CACHE);
    }
}
