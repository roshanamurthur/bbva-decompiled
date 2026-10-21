package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.util.MultiClassKey;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public class ModelToResourceClassCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<MultiClassKey> f38746a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayMap<MultiClassKey, List<Class<?>>> f38747b = new ArrayMap<>();

    public void clear() {
        synchronized (this.f38747b) {
            this.f38747b.clear();
        }
    }

    @Nullable
    public List<Class<?>> get(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3) {
        List<Class<?>> list;
        MultiClassKey andSet = this.f38746a.getAndSet(null);
        if (andSet == null) {
            andSet = new MultiClassKey(cls, cls2, cls3);
        } else {
            andSet.set(cls, cls2, cls3);
        }
        synchronized (this.f38747b) {
            list = this.f38747b.get(andSet);
        }
        this.f38746a.set(andSet);
        return list;
    }

    public void put(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3, @NonNull List<Class<?>> list) {
        synchronized (this.f38747b) {
            this.f38747b.put(new MultiClassKey(cls, cls2, cls3), list);
        }
    }
}
