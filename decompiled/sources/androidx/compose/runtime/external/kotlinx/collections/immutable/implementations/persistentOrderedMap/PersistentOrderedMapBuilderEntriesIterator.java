package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;
import q0.a;

/* JADX INFO: compiled from: PersistentOrderedMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderEntriesIterator;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "", "hasNext", "next", "", RemoveCommand.ID, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "map", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class PersistentOrderedMapBuilderEntriesIterator<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final PersistentOrderedMapBuilderLinksIterator<K, V> f14991p0;

    public PersistentOrderedMapBuilderEntriesIterator(@NotNull PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        this.f14991p0 = new PersistentOrderedMapBuilderLinksIterator<>(persistentOrderedMapBuilder.getFirstKey(), persistentOrderedMapBuilder);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f14991p0.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f14991p0.remove();
    }

    @Override // java.util.Iterator
    @NotNull
    public Map.Entry<K, V> next() {
        PersistentOrderedMapBuilderLinksIterator<K, V> persistentOrderedMapBuilderLinksIterator = this.f14991p0;
        return new a(persistentOrderedMapBuilderLinksIterator.getBuilder$runtime_release().getHashMapBuilder$runtime_release(), persistentOrderedMapBuilderLinksIterator.getLastIteratedKey(), persistentOrderedMapBuilderLinksIterator.next());
    }
}
