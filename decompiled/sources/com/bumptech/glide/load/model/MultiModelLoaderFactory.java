package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MultiModelLoaderFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f38460e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f38461f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f38463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f38464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pools.Pool<List<Throwable>> f38465d;

    public static class a implements ModelLoader<Object, Object> {
        @Override // com.bumptech.glide.load.model.ModelLoader
        @Nullable
        public final ModelLoader.LoadData<Object> buildLoadData(@NonNull Object obj, int i10, int i11, @NonNull Options options) {
            return null;
        }

        @Override // com.bumptech.glide.load.model.ModelLoader
        public final boolean handles(@NonNull Object obj) {
            return false;
        }
    }

    public static class b<Model, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<Model> f38466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<Data> f38467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ModelLoaderFactory<? extends Model, ? extends Data> f38468c;

        public b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
            this.f38466a = cls;
            this.f38467b = cls2;
            this.f38468c = modelLoaderFactory;
        }
    }

    public static class c {
    }

    @VisibleForTesting
    public MultiModelLoaderFactory() {
        throw null;
    }

    public MultiModelLoaderFactory(@NonNull Pools.Pool<List<Throwable>> pool) {
        c cVar = f38460e;
        this.f38462a = new ArrayList();
        this.f38464c = new HashSet();
        this.f38465d = pool;
        this.f38463b = cVar;
    }

    public final synchronized <Model, Data> void a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        b bVar = new b(cls, cls2, modelLoaderFactory);
        ArrayList arrayList = this.f38462a;
        arrayList.add(arrayList.size(), bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NonNull
    public final synchronized ArrayList b(@NonNull Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f38462a) {
                if (!this.f38464c.contains(bVar) && bVar.f38466a.isAssignableFrom((Class<?>) cls)) {
                    this.f38464c.add(bVar);
                    arrayList.add((ModelLoader) Preconditions.checkNotNull(bVar.f38468c.build(this)));
                    this.f38464c.remove(bVar);
                }
            }
        } catch (Throwable th2) {
            this.f38464c.clear();
            throw th2;
        }
        return arrayList;
    }

    @NonNull
    public synchronized <Model, Data> ModelLoader<Model, Data> build(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b bVar : this.f38462a) {
                if (this.f38464c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.f38466a.isAssignableFrom(cls) && bVar.f38467b.isAssignableFrom(cls2)) {
                    this.f38464c.add(bVar);
                    arrayList.add((ModelLoader) Preconditions.checkNotNull(bVar.f38468c.build(this)));
                    this.f38464c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f38463b;
                Pools.Pool<List<Throwable>> pool = this.f38465d;
                cVar.getClass();
                return new com.bumptech.glide.load.model.a(arrayList, pool);
            }
            if (arrayList.size() == 1) {
                return (ModelLoader) arrayList.get(0);
            }
            if (!z10) {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
            return f38461f;
        } catch (Throwable th2) {
            this.f38464c.clear();
            throw th2;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NonNull
    public final synchronized ArrayList c(@NonNull Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f38462a) {
            if (!arrayList.contains(bVar.f38467b) && bVar.f38466a.isAssignableFrom((Class<?>) cls)) {
                arrayList.add(bVar.f38467b);
            }
        }
        return arrayList;
    }

    public final synchronized <Model, Data> void d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        this.f38462a.add(0, new b(cls, cls2, modelLoaderFactory));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NonNull
    public final synchronized ArrayList e(@NonNull Class cls, @NonNull Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f38462a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f38466a.isAssignableFrom((Class<?>) cls) && bVar.f38467b.isAssignableFrom((Class<?>) cls2)) {
                it.remove();
                arrayList.add(bVar.f38468c);
            }
        }
        return arrayList;
    }

    @NonNull
    public final synchronized ArrayList f(@NonNull Class cls, @NonNull Class cls2, @NonNull ModelLoaderFactory modelLoaderFactory) {
        ArrayList arrayListE;
        arrayListE = e(cls, cls2);
        a(cls, cls2, modelLoaderFactory);
        return arrayListE;
    }
}
