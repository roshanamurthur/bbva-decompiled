package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.util.pool.GlideTrace;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: DataCacheGenerator.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements DataFetcherGenerator, DataFetcher.DataCallback<Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final List<Key> f38226p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final c<?> f38227q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final DataFetcherGenerator.FetcherReadyCallback f38228r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f38229s0 = -1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Key f38230t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public List<ModelLoader<File, ?>> f38231u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public volatile ModelLoader.LoadData<?> f38232w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public File f38233x0;

    public b(List<Key> list, c<?> cVar, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this.f38226p0 = list;
        this.f38227q0 = cVar;
        this.f38228r0 = fetcherReadyCallback;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final boolean a() {
        GlideTrace.beginSection("DataCacheGenerator.startNext");
        while (true) {
            try {
                List<ModelLoader<File, ?>> list = this.f38231u0;
                boolean z10 = false;
                if (list != null && this.v0 < list.size()) {
                    this.f38232w0 = null;
                    while (!z10 && this.v0 < this.f38231u0.size()) {
                        List<ModelLoader<File, ?>> list2 = this.f38231u0;
                        int i10 = this.v0;
                        this.v0 = i10 + 1;
                        ModelLoader<File, ?> modelLoader = list2.get(i10);
                        File file = this.f38233x0;
                        c<?> cVar = this.f38227q0;
                        this.f38232w0 = modelLoader.buildLoadData(file, cVar.f38269e, cVar.f38270f, cVar.f38273i);
                        if (this.f38232w0 != null) {
                            c<?> cVar2 = this.f38227q0;
                            if (cVar2.f38267c.getRegistry().getLoadPath(this.f38232w0.fetcher.getDataClass(), cVar2.f38271g, cVar2.f38275k) != null) {
                                this.f38232w0.fetcher.loadData(this.f38227q0.f38278o, this);
                                z10 = true;
                            }
                        }
                    }
                    GlideTrace.endSection();
                    return z10;
                }
                int i11 = this.f38229s0 + 1;
                this.f38229s0 = i11;
                if (i11 >= this.f38226p0.size()) {
                    GlideTrace.endSection();
                    return false;
                }
                Key key = this.f38226p0.get(this.f38229s0);
                c<?> cVar3 = this.f38227q0;
                File file2 = ((Engine.c) cVar3.f38272h).a().get(new tc.c(key, cVar3.f38277n));
                this.f38233x0 = file2;
                if (file2 != null) {
                    this.f38230t0 = key;
                    this.f38231u0 = this.f38227q0.f38267c.getRegistry().getModelLoaders(file2);
                    this.v0 = 0;
                }
            } catch (Throwable th2) {
                GlideTrace.endSection();
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final void cancel() {
        ModelLoader.LoadData<?> loadData = this.f38232w0;
        if (loadData != null) {
            loadData.fetcher.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void onDataReady(Object obj) {
        this.f38228r0.onDataFetcherReady(this.f38230t0, obj, this.f38232w0.fetcher, DataSource.DATA_DISK_CACHE, this.f38230t0);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void onLoadFailed(@NonNull Exception exc) {
        this.f38228r0.onDataFetcherFailed(this.f38230t0, exc, this.f38232w0.fetcher, DataSource.DATA_DISK_CACHE);
    }
}
