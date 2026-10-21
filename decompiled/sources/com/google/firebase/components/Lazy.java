package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes10.dex */
public class Lazy<T> implements Provider<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f47677c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f47678a = f47677c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Provider<T> f47679b;

    public Lazy(Provider<T> provider) {
        this.f47679b = provider;
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        T t10 = (T) this.f47678a;
        Object obj = f47677c;
        if (t10 == obj) {
            synchronized (this) {
                try {
                    t10 = (T) this.f47678a;
                    if (t10 == obj) {
                        t10 = this.f47679b.get();
                        this.f47678a = t10;
                        this.f47679b = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return t10;
    }
}
