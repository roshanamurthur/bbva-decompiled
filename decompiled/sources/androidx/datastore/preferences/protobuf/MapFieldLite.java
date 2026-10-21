package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final MapFieldLite f20976q0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f20977p0 = true;

    static {
        MapFieldLite mapFieldLite = new MapFieldLite();
        f20976q0 = mapFieldLite;
        mapFieldLite.makeImmutable();
    }

    public static <K, V> MapFieldLite<K, V> emptyMapField() {
        return f20976q0;
    }

    public final void a() {
        if (!isMutable()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        a();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry<K, V> entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            V value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i10 = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            K key = entry.getKey();
            if (key instanceof byte[]) {
                iHashCode = Internal.hashCode((byte[]) key);
            } else {
                if (key instanceof Internal.EnumLite) {
                    throw new UnsupportedOperationException();
                }
                iHashCode = key.hashCode();
            }
            V value = entry.getValue();
            if (value instanceof byte[]) {
                iHashCode2 = Internal.hashCode((byte[]) value);
            } else {
                if (value instanceof Internal.EnumLite) {
                    throw new UnsupportedOperationException();
                }
                iHashCode2 = value.hashCode();
            }
            i10 += iHashCode2 ^ iHashCode;
        }
        return i10;
    }

    public boolean isMutable() {
        return this.f20977p0;
    }

    public void makeImmutable() {
        this.f20977p0 = false;
    }

    public void mergeFrom(MapFieldLite<K, V> mapFieldLite) {
        a();
        if (mapFieldLite.isEmpty()) {
            return;
        }
        putAll(mapFieldLite);
    }

    public MapFieldLite<K, V> mutableCopy() {
        if (isEmpty()) {
            return new MapFieldLite<>();
        }
        MapFieldLite<K, V> mapFieldLite = new MapFieldLite<>(this);
        mapFieldLite.f20977p0 = true;
        return mapFieldLite;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v3) {
        a();
        Charset charset = Internal.f20943a;
        k10.getClass();
        v3.getClass();
        return (V) super.put(k10, v3);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        a();
        for (K k10 : map.keySet()) {
            Charset charset = Internal.f20943a;
            k10.getClass();
            map.get(k10).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        a();
        return (V) super.remove(obj);
    }

    public V put(Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }
}
