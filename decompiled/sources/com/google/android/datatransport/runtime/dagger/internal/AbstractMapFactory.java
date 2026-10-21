package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractMapFactory<K, V, V2> implements Factory<Map<K, V2>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<K, Provider<V>> f43749a;

    public static abstract class Builder<K, V, V2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap<K, Provider<V>> f43750a;

        public Builder(int i10) {
            this.f43750a = DaggerCollections.newLinkedHashMapWithExpectedSize(i10);
        }

        public Builder<K, V, V2> putAll(Provider<Map<K, V2>> provider) {
            if (provider instanceof DelegateFactory) {
                return putAll((Provider) Preconditions.checkNotNull(((DelegateFactory) provider).f43751a));
            }
            this.f43750a.putAll(((AbstractMapFactory) provider).f43749a);
            return this;
        }
    }

    public AbstractMapFactory(LinkedHashMap linkedHashMap) {
        this.f43749a = Collections.unmodifiableMap(linkedHashMap);
    }
}
