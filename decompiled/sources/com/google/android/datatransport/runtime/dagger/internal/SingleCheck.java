package com.google.android.datatransport.runtime.dagger.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes9.dex */
public final class SingleCheck<T> implements Provider<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f43766c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Provider<T> f43767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f43768b;

    public SingleCheck() {
        throw null;
    }

    public static <P extends Provider<T>, T> Provider<T> provider(P p4) {
        if ((p4 instanceof SingleCheck) || (p4 instanceof DoubleCheck)) {
            return p4;
        }
        Provider<T> provider = (Provider) Preconditions.checkNotNull(p4);
        SingleCheck singleCheck = new SingleCheck();
        singleCheck.f43768b = f43766c;
        singleCheck.f43767a = provider;
        return singleCheck;
    }

    @Override // javax.inject.Provider
    public T get() {
        T t10 = (T) this.f43768b;
        if (t10 != f43766c) {
            return t10;
        }
        Provider<T> provider = this.f43767a;
        if (provider == null) {
            return (T) this.f43768b;
        }
        T t11 = provider.get();
        this.f43768b = t11;
        this.f43767a = null;
        return t11;
    }
}
