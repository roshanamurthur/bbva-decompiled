package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PersistentOrderedMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0002J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderKeysIterator;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "hasNext", "next", "()Ljava/lang/Object;", "", RemoveCommand.ID, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "map", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class PersistentOrderedMapBuilderKeysIterator<K, V> implements Iterator<K>, KMutableIterator {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final PersistentOrderedMapBuilderLinksIterator<K, V> f14993p0;

    public PersistentOrderedMapBuilderKeysIterator(@NotNull PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        this.f14993p0 = new PersistentOrderedMapBuilderLinksIterator<>(persistentOrderedMapBuilder.getFirstKey(), persistentOrderedMapBuilder);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f14993p0.hasNext();
    }

    @Override // java.util.Iterator
    public K next() {
        PersistentOrderedMapBuilderLinksIterator<K, V> persistentOrderedMapBuilderLinksIterator = this.f14993p0;
        persistentOrderedMapBuilderLinksIterator.next();
        return (K) persistentOrderedMapBuilderLinksIterator.getLastIteratedKey();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f14993p0.remove();
    }
}
