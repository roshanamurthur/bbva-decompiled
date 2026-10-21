package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import java.util.Map;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes9.dex */
public final class MapProviderFactory<K, V> extends AbstractMapFactory<K, V, Provider<V>> implements Lazy<Map<K, Provider<V>>> {

    public static final class Builder<K, V> extends AbstractMapFactory.Builder<K, V, Provider<V>> {
        public MapProviderFactory<K, V> build() {
            return new MapProviderFactory<>(this.f43750a);
        }

        public Builder<K, V> put(K k10, Provider<V> provider) {
            this.f43750a.put((K) Preconditions.checkNotNull(k10, "key"), (Provider<V>) Preconditions.checkNotNull(provider, "provider"));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public Builder<K, V> putAll(Provider<Map<K, Provider<V>>> provider) {
            super.putAll((Provider) provider);
            return this;
        }
    }

    public MapProviderFactory() {
        throw null;
    }

    public static <K, V> Builder<K, V> builder(int i10) {
        return new Builder<>(i10);
    }

    @Override // javax.inject.Provider
    public Map<K, Provider<V>> get() {
        return this.f43749a;
    }
}
