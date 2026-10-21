package q0;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue;
import java.util.Map;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PersistentOrderedMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a<K, V> extends MapEntry<K, V> implements KMutableMap.Entry {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Map<K, LinkedValue<V>> f92740r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public LinkedValue<V> f92741s0;

    public a(@NotNull PersistentHashMapBuilder persistentHashMapBuilder, Object obj, @NotNull LinkedValue linkedValue) {
        super(obj, linkedValue.getValue());
        this.f92740r0 = persistentHashMapBuilder;
        this.f92741s0 = linkedValue;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public final V getValue() {
        return this.f92741s0.getValue();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public final V setValue(V v3) {
        V value = this.f92741s0.getValue();
        this.f92741s0 = this.f92741s0.withValue(v3);
        this.f92740r0.put(getKey(), this.f92741s0);
        return value;
    }
}
