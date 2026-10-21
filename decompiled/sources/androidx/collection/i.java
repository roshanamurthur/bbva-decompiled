package androidx.collection;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Object[] f2535p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Object[] f2536q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f2537r0;

    public i(int i10, @NotNull Object[] keys, @NotNull Object[] values) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f2535p0 = keys;
        this.f2536q0 = values;
        this.f2537r0 = i10;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return (K) this.f2535p0[this.f2537r0];
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return (V) this.f2536q0[this.f2537r0];
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v3) {
        Object[] objArr = this.f2536q0;
        int i10 = this.f2537r0;
        V v6 = (V) objArr[i10];
        objArr[i10] = v3;
        return v6;
    }
}
