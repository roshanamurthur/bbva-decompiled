package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReadOnlyCollectionAdapters.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010&\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b)\u0010*J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0001¢\u0006\u0004\b\n\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0006H\u0096\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR,\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!0\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u0014\u0010'\u001a\u00020\u00118\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/adapters/ImmutableMapAdapter;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableMap;", "", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "q0", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "getKeys", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "keys", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "r0", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "getValues", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "values", "", "s0", "getEntries", "entries", "getSize", "()I", "size", "impl", "<init>", "(Ljava/util/Map;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class ImmutableMapAdapter<K, V> implements ImmutableMap<K, V>, Map<K, V>, KMappedMarker {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Map<K, V> f14890p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final ImmutableSetAdapter f14891q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final ImmutableCollectionAdapter f14892r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final ImmutableSetAdapter f14893s0;

    /* JADX WARN: Multi-variable type inference failed */
    public ImmutableMapAdapter(@NotNull Map<K, ? extends V> map) {
        this.f14890p0 = map;
        this.f14891q0 = new ImmutableSetAdapter(map.keySet());
        this.f14892r0 = new ImmutableCollectionAdapter(map.values());
        this.f14893s0 = new ImmutableSetAdapter(map.entrySet());
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V compute(K k10, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V computeIfAbsent(K k10, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V computeIfPresent(K k10, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return this.f14890p0.containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return this.f14890p0.containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ ImmutableSet<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object other) {
        return this.f14890p0.equals(other);
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object key) {
        return this.f14890p0.get(key);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @NotNull
    public ImmutableSet<Map.Entry<K, V>> getEntries() {
        return this.f14893s0;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @NotNull
    public ImmutableSet<K> getKeys() {
        return this.f14891q0;
    }

    public int getSize() {
        return this.f14890p0.size();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @NotNull
    public ImmutableCollection<V> getValues() {
        return this.f14892r0;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f14890p0.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f14890p0.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ ImmutableSet<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public V merge(K k10, V v3, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V put(K k10, V v3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V putIfAbsent(K k10, V v3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V replace(K k10, V v3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @NotNull
    public String toString() {
        return this.f14890p0.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ ImmutableCollection<V> values() {
        return getValues();
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean replace(K k10, V v3, V v6) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
