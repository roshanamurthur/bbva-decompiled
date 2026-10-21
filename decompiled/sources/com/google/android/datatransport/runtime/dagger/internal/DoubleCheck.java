package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes9.dex */
public final class DoubleCheck<T> implements Provider<T>, Lazy<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f43752c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Provider<T> f43753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f43754b = f43752c;

    public DoubleCheck(Provider<T> provider) {
        this.f43753a = provider;
    }

    public static <P extends Provider<T>, T> Lazy<T> lazy(P p4) {
        return p4 instanceof Lazy ? (Lazy) p4 : new DoubleCheck((Provider) Preconditions.checkNotNull(p4));
    }

    public static <P extends Provider<T>, T> Provider<T> provider(P p4) {
        Preconditions.checkNotNull(p4);
        return p4 instanceof DoubleCheck ? p4 : new DoubleCheck(p4);
    }

    public static Object reentrantCheck(Object obj, Object obj2) {
        if (obj == f43752c || (obj instanceof MemoizedSentinel) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public T get() {
        T t10 = (T) this.f43754b;
        Object obj = f43752c;
        if (t10 == obj) {
            synchronized (this) {
                try {
                    t10 = (T) this.f43754b;
                    if (t10 == obj) {
                        t10 = this.f43753a.get();
                        this.f43754b = reentrantCheck(this.f43754b, t10);
                        this.f43753a = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return t10;
    }
}
