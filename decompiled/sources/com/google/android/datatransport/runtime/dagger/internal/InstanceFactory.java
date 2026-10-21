package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;

/* JADX INFO: loaded from: classes9.dex */
public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InstanceFactory<Object> f43755b = new InstanceFactory<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f43756a;

    public InstanceFactory(T t10) {
        this.f43756a = t10;
    }

    public static <T> Factory<T> create(T t10) {
        return new InstanceFactory(Preconditions.checkNotNull(t10, "instance cannot be null"));
    }

    public static <T> Factory<T> createNullable(T t10) {
        return t10 == null ? f43755b : new InstanceFactory(t10);
    }

    @Override // javax.inject.Provider
    public T get() {
        return this.f43756a;
    }
}
