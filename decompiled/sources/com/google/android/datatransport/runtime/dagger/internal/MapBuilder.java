package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class MapBuilder<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f43757a;

    public MapBuilder(int i10) {
        this.f43757a = DaggerCollections.newLinkedHashMapWithExpectedSize(i10);
    }

    public static <K, V> MapBuilder<K, V> newMapBuilder(int i10) {
        return new MapBuilder<>(i10);
    }

    public Map<K, V> build() {
        LinkedHashMap linkedHashMap = this.f43757a;
        return linkedHashMap.size() != 0 ? Collections.unmodifiableMap(linkedHashMap) : Collections.emptyMap();
    }

    public MapBuilder<K, V> put(K k10, V v3) {
        this.f43757a.put(k10, v3);
        return this;
    }

    public MapBuilder<K, V> putAll(Map<K, V> map) {
        this.f43757a.putAll(map);
        return this;
    }
}
