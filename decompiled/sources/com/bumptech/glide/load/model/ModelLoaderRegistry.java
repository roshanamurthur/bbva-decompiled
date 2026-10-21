package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ModelLoaderRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiModelLoaderFactory f38456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f38457b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f38458a = new HashMap();

        /* JADX INFO: renamed from: com.bumptech.glide.load.model.ModelLoaderRegistry$a$a, reason: collision with other inner class name */
        public static class C0175a<Model> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List<ModelLoader<Model, ?>> f38459a;

            public C0175a(List<ModelLoader<Model, ?>> list) {
                this.f38459a = list;
            }
        }
    }

    public ModelLoaderRegistry(@NonNull Pools.Pool<List<Throwable>> pool) {
        MultiModelLoaderFactory multiModelLoaderFactory = new MultiModelLoaderFactory(pool);
        this.f38457b = new a();
        this.f38456a = multiModelLoaderFactory;
    }

    public synchronized <Model, Data> void append(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        this.f38456a.a(cls, cls2, modelLoaderFactory);
        this.f38457b.f38458a.clear();
    }

    public synchronized <Model, Data> ModelLoader<Model, Data> build(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        return this.f38456a.build(cls, cls2);
    }

    @NonNull
    public synchronized List<Class<?>> getDataClasses(@NonNull Class<?> cls) {
        return this.f38456a.c(cls);
    }

    @NonNull
    public <A> List<ModelLoader<A, ?>> getModelLoaders(@NonNull A a10) {
        List listUnmodifiableList;
        Class<?> cls = a10.getClass();
        synchronized (this) {
            a.C0175a c0175a = (a.C0175a) this.f38457b.f38458a.get(cls);
            listUnmodifiableList = c0175a == null ? null : c0175a.f38459a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(this.f38456a.b(cls));
                if (((a.C0175a) this.f38457b.f38458a.put(cls, new a.C0175a(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a10);
        }
        int size = listUnmodifiableList.size();
        List<ModelLoader<A, ?>> listEmptyList = Collections.emptyList();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            ModelLoader<A, ?> modelLoader = (ModelLoader) listUnmodifiableList.get(i10);
            if (modelLoader.handles(a10)) {
                if (z10) {
                    listEmptyList = new ArrayList<>(size - i10);
                    z10 = false;
                }
                listEmptyList.add(modelLoader);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a10, (List<ModelLoader<A, ?>>) listUnmodifiableList);
        }
        return listEmptyList;
    }

    public synchronized <Model, Data> void prepend(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        this.f38456a.d(cls, cls2, modelLoaderFactory);
        this.f38457b.f38458a.clear();
    }

    public synchronized <Model, Data> void remove(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        Iterator it = this.f38456a.e(cls, cls2).iterator();
        while (it.hasNext()) {
            ((ModelLoaderFactory) it.next()).teardown();
        }
        this.f38457b.f38458a.clear();
    }

    public synchronized <Model, Data> void replace(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        Iterator it = this.f38456a.f(cls, cls2, modelLoaderFactory).iterator();
        while (it.hasNext()) {
            ((ModelLoaderFactory) it.next()).teardown();
        }
        this.f38457b.f38458a.clear();
    }
}
