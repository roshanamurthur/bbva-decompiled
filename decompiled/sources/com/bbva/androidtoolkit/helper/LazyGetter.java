package com.bbva.androidtoolkit.helper;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LazyGetter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<T> f26474a = new AtomicReference<>();

    public final T get() {
        if (this.f26474a.get() == null) {
            synchronized (this.f26474a) {
                try {
                    if (this.f26474a.get() == null) {
                        this.f26474a.set(initialValue());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f26474a.get();
    }

    public abstract T initialValue();
}
