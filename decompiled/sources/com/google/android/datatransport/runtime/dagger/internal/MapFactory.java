package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes9.dex */
public final class MapFactory<K, V> extends AbstractMapFactory<K, V, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Factory f43758b = InstanceFactory.create(Collections.emptyMap());

    public static final class Builder<K, V> extends AbstractMapFactory.Builder<K, V, V> {
        public MapFactory<K, V> build() {
            return new MapFactory<>(this.f43750a);
        }

        public Builder<K, V> put(K k10, Provider<V> provider) {
            this.f43750a.put((K) Preconditions.checkNotNull(k10, "key"), (Provider<V>) Preconditions.checkNotNull(provider, "provider"));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public Builder<K, V> putAll(Provider<Map<K, V>> provider) {
            super.putAll((Provider) provider);
            return this;
        }
    }

    public MapFactory() {
        throw null;
    }

    public static <K, V> Builder<K, V> builder(int i10) {
        return new Builder<>(i10);
    }

    public static <K, V> Provider<Map<K, V>> emptyMapProvider() {
        return f43758b;
    }

    @Override // javax.inject.Provider
    public Map<K, V> get() {
        Map<K, Provider<V>> map = this.f43749a;
        LinkedHashMap linkedHashMapNewLinkedHashMapWithExpectedSize = DaggerCollections.newLinkedHashMapWithExpectedSize(map.size());
        for (Map.Entry<K, Provider<V>> entry : map.entrySet()) {
            linkedHashMapNewLinkedHashMapWithExpectedSize.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(linkedHashMapNewLinkedHashMapWithExpectedSize);
    }
}
