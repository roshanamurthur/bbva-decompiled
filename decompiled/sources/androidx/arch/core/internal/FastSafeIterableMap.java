package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class FastSafeIterableMap<K, V> extends SafeIterableMap<K, V> {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final HashMap<K, SafeIterableMap.c<K, V>> f1726t0 = new HashMap<>();

    @Nullable
    public Map.Entry<K, V> ceil(K k10) {
        if (contains(k10)) {
            return this.f1726t0.get(k10).f1737s0;
        }
        return null;
    }

    public boolean contains(K k10) {
        return this.f1726t0.containsKey(k10);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    @Nullable
    public SafeIterableMap.c<K, V> get(K k10) {
        return this.f1726t0.get(k10);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V putIfAbsent(@NonNull K k10, @NonNull V v3) {
        SafeIterableMap.c<K, V> cVar = get(k10);
        if (cVar != null) {
            return cVar.f1735q0;
        }
        HashMap<K, SafeIterableMap.c<K, V>> map = this.f1726t0;
        SafeIterableMap.c<K, V> cVar2 = new SafeIterableMap.c<>(k10, v3);
        this.f1730s0++;
        SafeIterableMap.c<K, V> cVar3 = this.f1728q0;
        if (cVar3 == null) {
            this.f1727p0 = cVar2;
            this.f1728q0 = cVar2;
        } else {
            cVar3.f1736r0 = cVar2;
            cVar2.f1737s0 = cVar3;
            this.f1728q0 = cVar2;
        }
        map.put(k10, cVar2);
        return null;
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V remove(@NonNull K k10) {
        V v3 = (V) super.remove(k10);
        this.f1726t0.remove(k10);
        return v3;
    }
}
