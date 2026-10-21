package com.bumptech.glide.util.pool;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class FactoryPools {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f38929a = new a();

    public interface Factory<T> {
        T create();
    }

    public interface Poolable {
        @NonNull
        StateVerifier getVerifier();
    }

    public interface Resetter<T> {
        void reset(@NonNull T t10);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> implements Factory<List<T>> {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        @NonNull
        public final Object create() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class c<T> implements Resetter<List<T>> {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
        public final void reset(@NonNull Object obj) {
            ((List) obj).clear();
        }
    }

    public static final class d<T> implements Pools.Pool<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Factory<T> f38930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Resetter<T> f38931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Pools.Pool<T> f38932c;

        public d(@NonNull Pools.SimplePool simplePool, @NonNull Factory factory, @NonNull Resetter resetter) {
            this.f38932c = simplePool;
            this.f38930a = factory;
            this.f38931b = resetter;
        }

        @Override // androidx.core.util.Pools.Pool
        public final T acquire() {
            T tAcquire = this.f38932c.acquire();
            if (tAcquire == null) {
                tAcquire = this.f38930a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    tAcquire.getClass().toString();
                }
            }
            if (tAcquire instanceof Poolable) {
                ((Poolable) tAcquire).getVerifier().a(false);
            }
            return tAcquire;
        }

        @Override // androidx.core.util.Pools.Pool
        public final boolean release(@NonNull T t10) {
            if (t10 instanceof Poolable) {
                ((Poolable) t10).getVerifier().a(true);
            }
            this.f38931b.reset(t10);
            return this.f38932c.release(t10);
        }
    }

    @NonNull
    public static <T extends Poolable> Pools.Pool<T> simple(int i10, @NonNull Factory<T> factory) {
        return new d(new Pools.SimplePool(i10), factory, f38929a);
    }

    @NonNull
    public static <T extends Poolable> Pools.Pool<T> threadSafe(int i10, @NonNull Factory<T> factory) {
        return new d(new Pools.SynchronizedPool(i10), factory, f38929a);
    }

    @NonNull
    public static <T> Pools.Pool<List<T>> threadSafeList() {
        return threadSafeList(20);
    }

    @NonNull
    public static <T> Pools.Pool<List<T>> threadSafeList(int i10) {
        return new d(new Pools.SynchronizedPool(i10), new b(), new c());
    }

    @NonNull
    public static <T extends Poolable> Pools.Pool<T> threadSafe(int i10, @NonNull Factory<T> factory, @NonNull Resetter<T> resetter) {
        return new d(new Pools.SynchronizedPool(i10), factory, resetter);
    }

    public class a implements Resetter<Object> {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
        public final void reset(@NonNull Object obj) {
        }
    }
}
