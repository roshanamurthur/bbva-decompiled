package com.google.android.datatransport.runtime.dagger.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes9.dex */
public final class DelegateFactory<T> implements Factory<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Provider<T> f43751a;

    public static <T> void setDelegate(Provider<T> provider, Provider<T> provider2) {
        Preconditions.checkNotNull(provider2);
        DelegateFactory delegateFactory = (DelegateFactory) provider;
        if (delegateFactory.f43751a != null) {
            throw new IllegalStateException();
        }
        delegateFactory.f43751a = provider2;
    }

    @Override // javax.inject.Provider
    public T get() {
        Provider<T> provider = this.f43751a;
        if (provider != null) {
            return provider.get();
        }
        throw new IllegalStateException();
    }

    @Deprecated
    public void setDelegatedProvider(Provider<T> provider) {
        setDelegate(this, provider);
    }
}
