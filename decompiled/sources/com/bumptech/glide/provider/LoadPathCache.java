package com.bumptech.glide.provider;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.DecodePath;
import com.bumptech.glide.load.engine.LoadPath;
import com.bumptech.glide.load.resource.transcode.UnitTranscoder;
import com.bumptech.glide.util.MultiClassKey;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public class LoadPathCache {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LoadPath<?, ?, ?> f38743c = new LoadPath<>(Object.class, Object.class, Object.class, Collections.singletonList(new DecodePath(Object.class, Object.class, Object.class, Collections.emptyList(), new UnitTranscoder(), null)), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayMap<MultiClassKey, LoadPath<?, ?, ?>> f38744a = new ArrayMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<MultiClassKey> f38745b = new AtomicReference<>();

    @Nullable
    public <Data, TResource, Transcode> LoadPath<Data, TResource, Transcode> get(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        LoadPath<Data, TResource, Transcode> loadPath;
        MultiClassKey andSet = this.f38745b.getAndSet(null);
        if (andSet == null) {
            andSet = new MultiClassKey();
        }
        andSet.set(cls, cls2, cls3);
        synchronized (this.f38744a) {
            loadPath = (LoadPath) this.f38744a.get(andSet);
        }
        this.f38745b.set(andSet);
        return loadPath;
    }

    public boolean isEmptyLoadPath(@Nullable LoadPath<?, ?, ?> loadPath) {
        return f38743c.equals(loadPath);
    }

    public void put(Class<?> cls, Class<?> cls2, Class<?> cls3, @Nullable LoadPath<?, ?, ?> loadPath) {
        synchronized (this.f38744a) {
            ArrayMap<MultiClassKey, LoadPath<?, ?, ?>> arrayMap = this.f38744a;
            MultiClassKey multiClassKey = new MultiClassKey(cls, cls2, cls3);
            if (loadPath == null) {
                loadPath = f38743c;
            }
            arrayMap.put(multiClassKey, loadPath);
        }
    }
}
