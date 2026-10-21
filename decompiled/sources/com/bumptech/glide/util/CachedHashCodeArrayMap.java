package com.bumptech.glide.util;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

/* JADX INFO: loaded from: classes9.dex */
public final class CachedHashCodeArrayMap<K, V> extends ArrayMap<K, V> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f38898p0;

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public void clear() {
        this.f38898p0 = 0;
        super.clear();
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public int hashCode() {
        if (this.f38898p0 == 0) {
            this.f38898p0 = super.hashCode();
        }
        return this.f38898p0;
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V put(K k10, V v3) {
        this.f38898p0 = 0;
        return (V) super.put(k10, v3);
    }

    @Override // androidx.collection.SimpleArrayMap
    public void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this.f38898p0 = 0;
        super.putAll(simpleArrayMap);
    }

    @Override // androidx.collection.SimpleArrayMap
    public V removeAt(int i10) {
        this.f38898p0 = 0;
        return (V) super.removeAt(i10);
    }

    @Override // androidx.collection.SimpleArrayMap
    public V setValueAt(int i10, V v3) {
        this.f38898p0 = 0;
        return (V) super.setValueAt(i10, v3);
    }
}
