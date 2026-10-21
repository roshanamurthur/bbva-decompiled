package p0;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilderEntriesIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PersistentHashMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a<K, V> extends MapEntry<K, V> implements KMutableMap.Entry {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final PersistentHashMapBuilderEntriesIterator<K, V> f92546r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public V f92547s0;

    public a(@NotNull PersistentHashMapBuilderEntriesIterator<K, V> persistentHashMapBuilderEntriesIterator, K k10, V v3) {
        super(k10, v3);
        this.f92546r0 = persistentHashMapBuilderEntriesIterator;
        this.f92547s0 = v3;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public final V getValue() {
        return this.f92547s0;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public final V setValue(V v3) {
        V v6 = this.f92547s0;
        this.f92547s0 = v3;
        this.f92546r0.setValue(getKey(), v3);
        return v6;
    }
}
