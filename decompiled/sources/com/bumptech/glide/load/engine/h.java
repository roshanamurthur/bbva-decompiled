package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.util.LogTime;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import tc.l;

/* JADX INFO: compiled from: SourceGenerator.java */
/* JADX INFO: loaded from: classes9.dex */
public final class h implements DataFetcherGenerator, DataFetcherGenerator.FetcherReadyCallback {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final c<?> f38386p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final DataFetcherGenerator.FetcherReadyCallback f38387q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public volatile int f38388r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public volatile b f38389s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public volatile Object f38390t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public volatile ModelLoader.LoadData<?> f38391u0;
    public volatile tc.c v0;

    public h(c<?> cVar, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this.f38386p0 = cVar;
        this.f38387q0 = fetcherReadyCallback;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final boolean a() {
        if (this.f38390t0 != null) {
            Object obj = this.f38390t0;
            this.f38390t0 = null;
            try {
                if (!b(obj)) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        if (this.f38389s0 != null && this.f38389s0.a()) {
            return true;
        }
        this.f38389s0 = null;
        this.f38391u0 = null;
        boolean z10 = false;
        while (!z10 && this.f38388r0 < this.f38386p0.b().size()) {
            ArrayList arrayListB = this.f38386p0.b();
            int i10 = this.f38388r0;
            this.f38388r0 = i10 + 1;
            this.f38391u0 = (ModelLoader.LoadData) arrayListB.get(i10);
            if (this.f38391u0 != null) {
                if (!this.f38386p0.f38279p.isDataCacheable(this.f38391u0.fetcher.getDataSource())) {
                    c<?> cVar = this.f38386p0;
                    if (cVar.f38267c.getRegistry().getLoadPath(this.f38391u0.fetcher.getDataClass(), cVar.f38271g, cVar.f38275k) != null) {
                    }
                }
                this.f38391u0.fetcher.loadData(this.f38386p0.f38278o, new l(this, this.f38391u0));
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean b(Object obj) throws Throwable {
        long logTime = LogTime.getLogTime();
        boolean z10 = false;
        try {
            DataRewinder rewinder = this.f38386p0.f38267c.getRegistry().getRewinder(obj);
            Object objRewindAndGet = rewinder.rewindAndGet();
            Encoder sourceEncoder = this.f38386p0.f38267c.getRegistry().getSourceEncoder(objRewindAndGet);
            tc.d dVar = new tc.d(sourceEncoder, objRewindAndGet, this.f38386p0.f38273i);
            Key key = this.f38391u0.sourceKey;
            c<?> cVar = this.f38386p0;
            tc.c cVar2 = new tc.c(key, cVar.f38277n);
            DiskCache diskCacheA = ((Engine.c) cVar.f38272h).a();
            diskCacheA.put(cVar2, dVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                cVar2.toString();
                Objects.toString(obj);
                Objects.toString(sourceEncoder);
                LogTime.getElapsedMillis(logTime);
            }
            if (diskCacheA.get(cVar2) != null) {
                this.v0 = cVar2;
                this.f38389s0 = new b(Collections.singletonList(this.f38391u0.sourceKey), this.f38386p0, this);
                this.f38391u0.fetcher.cleanup();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.v0);
                Objects.toString(obj);
            }
            try {
                this.f38387q0.onDataFetcherReady(this.f38391u0.sourceKey, rewinder.rewindAndGet(), this.f38391u0.fetcher, this.f38391u0.fetcher.getDataSource(), this.f38391u0.sourceKey);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                if (!z10) {
                    this.f38391u0.fetcher.cleanup();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final void cancel() {
        ModelLoader.LoadData<?> loadData = this.f38391u0;
        if (loadData != null) {
            loadData.fetcher.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void onDataFetcherFailed(Key key, Exception exc, DataFetcher<?> dataFetcher, DataSource dataSource) {
        this.f38387q0.onDataFetcherFailed(key, exc, dataFetcher, this.f38391u0.fetcher.getDataSource());
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void onDataFetcherReady(Key key, Object obj, DataFetcher<?> dataFetcher, DataSource dataSource, Key key2) {
        this.f38387q0.onDataFetcherReady(key, obj, dataFetcher, this.f38391u0.fetcher.getDataSource(), key);
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void reschedule() {
        throw new UnsupportedOperationException();
    }
}
