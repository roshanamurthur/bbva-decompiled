package androidx.collection;

import java.util.Map;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e<K, V> implements Map.Entry<K, V>, KMappedMarker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final K f2533p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final V f2534q0;

    public e(K k10, V v3) {
        this.f2533p0 = k10;
        this.f2534q0 = v3;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f2533p0;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f2534q0;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
