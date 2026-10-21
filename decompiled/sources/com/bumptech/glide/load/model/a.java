package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: MultiModelLoader.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a<Model, Data> implements ModelLoader<Model, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ModelLoader<Model, Data>> f38491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pools.Pool<List<Throwable>> f38492b;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MultiModelLoader.java */
    public static class C0176a<Data> implements DataFetcher<Data>, DataFetcher.DataCallback<Data> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final List<DataFetcher<Data>> f38493p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Pools.Pool<List<Throwable>> f38494q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f38495r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Priority f38496s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public DataFetcher.DataCallback<? super Data> f38497t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        @Nullable
        public List<Throwable> f38498u0;
        public boolean v0;

        public C0176a(@NonNull ArrayList arrayList, @NonNull Pools.Pool pool) {
            this.f38494q0 = pool;
            Preconditions.checkNotEmpty(arrayList);
            this.f38493p0 = arrayList;
            this.f38495r0 = 0;
        }

        public final void a() {
            if (this.v0) {
                return;
            }
            if (this.f38495r0 < this.f38493p0.size() - 1) {
                this.f38495r0++;
                loadData(this.f38496s0, this.f38497t0);
            } else {
                Preconditions.checkNotNull(this.f38498u0);
                this.f38497t0.onLoadFailed(new GlideException("Fetch failed", new ArrayList(this.f38498u0)));
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cancel() {
            this.v0 = true;
            Iterator<DataFetcher<Data>> it = this.f38493p0.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cleanup() {
            List<Throwable> list = this.f38498u0;
            if (list != null) {
                this.f38494q0.release(list);
            }
            this.f38498u0 = null;
            Iterator<DataFetcher<Data>> it = this.f38493p0.iterator();
            while (it.hasNext()) {
                it.next().cleanup();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        public final Class<Data> getDataClass() {
            return this.f38493p0.get(0).getDataClass();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        public final DataSource getDataSource() {
            return this.f38493p0.get(0).getDataSource();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void loadData(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super Data> dataCallback) {
            this.f38496s0 = priority;
            this.f38497t0 = dataCallback;
            this.f38498u0 = this.f38494q0.acquire();
            this.f38493p0.get(this.f38495r0).loadData(priority, this);
            if (this.v0) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
        public final void onDataReady(@Nullable Data data) {
            if (data != null) {
                this.f38497t0.onDataReady(data);
            } else {
                a();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
        public final void onLoadFailed(@NonNull Exception exc) {
            ((List) Preconditions.checkNotNull(this.f38498u0)).add(exc);
            a();
        }
    }

    public a(@NonNull ArrayList arrayList, @NonNull Pools.Pool pool) {
        this.f38491a = arrayList;
        this.f38492b = pool;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData<Data> buildLoadData(@NonNull Model model, int i10, int i11, @NonNull Options options) {
        ModelLoader.LoadData<Data> loadDataBuildLoadData;
        List<ModelLoader<Model, Data>> list = this.f38491a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        Key key = null;
        for (int i12 = 0; i12 < size; i12++) {
            ModelLoader<Model, Data> modelLoader = list.get(i12);
            if (modelLoader.handles(model) && (loadDataBuildLoadData = modelLoader.buildLoadData(model, i10, i11, options)) != null) {
                key = loadDataBuildLoadData.sourceKey;
                arrayList.add(loadDataBuildLoadData.fetcher);
            }
        }
        if (arrayList.isEmpty() || key == null) {
            return null;
        }
        return new ModelLoader.LoadData<>(key, new C0176a(arrayList, this.f38492b));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean handles(@NonNull Model model) {
        Iterator<ModelLoader<Model, Data>> it = this.f38491a.iterator();
        while (it.hasNext()) {
            if (it.next().handles(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f38491a.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }
}
