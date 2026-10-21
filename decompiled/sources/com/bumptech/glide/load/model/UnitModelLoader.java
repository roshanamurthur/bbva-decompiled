package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.signature.ObjectKey;

/* JADX INFO: loaded from: classes9.dex */
public class UnitModelLoader<Model> implements ModelLoader<Model, Model> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UnitModelLoader<?> f38481a = new UnitModelLoader<>();

    @Deprecated
    public UnitModelLoader() {
    }

    public static <T> UnitModelLoader<T> getInstance() {
        return (UnitModelLoader<T>) f38481a;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<Model> buildLoadData(@NonNull Model model, int i10, int i11, @NonNull Options options) {
        return new ModelLoader.LoadData<>(new ObjectKey(model), new a(model));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Model model) {
        return true;
    }

    public static class Factory<Model> implements ModelLoaderFactory<Model, Model> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Factory<?> f38482a = new Factory<>();

        @Deprecated
        public Factory() {
        }

        public static <T> Factory<T> getInstance() {
            return (Factory<T>) f38482a;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader<Model, Model> build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return UnitModelLoader.getInstance();
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public static class a<Model> implements DataFetcher<Model> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Model f38483p0;

        public a(Model model) {
            this.f38483p0 = model;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        public final Class<Model> getDataClass() {
            return (Class<Model>) this.f38483p0.getClass();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        public final DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void loadData(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super Model> dataCallback) {
            dataCallback.onDataReady(this.f38483p0);
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cleanup() {
        }
    }
}
