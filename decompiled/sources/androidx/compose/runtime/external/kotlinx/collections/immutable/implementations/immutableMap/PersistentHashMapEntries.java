package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PersistentHashMapContentViews.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0005B\u001b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\u001b\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\tH\u0096\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapEntries;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "", "Lkotlin/collections/AbstractSet;", "element", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", "iterator", "", "getSize", "()I", "size", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "map", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPersistentHashMapContentViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMapContentViews.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapEntries\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
public final class PersistentHashMapEntries<K, V> extends AbstractSet<Map.Entry<? extends K, ? extends V>> implements ImmutableSet<Map.Entry<? extends K, ? extends V>> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final PersistentHashMap<K, V> f14945p0;

    public PersistentHashMapEntries(@NotNull PersistentHashMap<K, V> persistentHashMap) {
        this.f14945p0 = persistentHashMap;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f14945p0.size();
    }

    @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return new PersistentHashMapEntriesIterator(this.f14945p0.getNode$runtime_release());
    }

    public boolean contains(@NotNull Map.Entry<? extends K, ? extends V> element) {
        if (!(element instanceof Map.Entry)) {
            return false;
        }
        K key = element.getKey();
        PersistentHashMap<K, V> persistentHashMap = this.f14945p0;
        V v3 = persistentHashMap.get(key);
        if (v3 != null) {
            return Intrinsics.areEqual(v3, element.getValue());
        }
        return element.getValue() == null && persistentHashMap.containsKey(element.getKey());
    }
}
