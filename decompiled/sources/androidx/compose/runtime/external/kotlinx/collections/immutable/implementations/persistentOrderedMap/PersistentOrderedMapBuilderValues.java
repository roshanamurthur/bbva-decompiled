package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableCollection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PersistentOrderedMapBuilderContentViews.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\bJ\b\u0010\u000b\u001a\u00020\nH\u0016J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0096\u0002R\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderValues;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "Lkotlin/collections/AbstractMutableCollection;", "element", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "(Ljava/lang/Object;)Z", "add", "", ClearCommand.ID, "", "iterator", "", "getSize", "()I", "size", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "builder", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class PersistentOrderedMapBuilderValues<K, V> extends AbstractMutableCollection<V> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final PersistentOrderedMapBuilder<K, V> f15000p0;

    public PersistentOrderedMapBuilderValues(@NotNull PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        this.f15000p0 = persistentOrderedMapBuilder;
    }

    @Override // kotlin.collections.AbstractMutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean add(V element) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f15000p0.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object element) {
        return this.f15000p0.containsValue(element);
    }

    @Override // kotlin.collections.AbstractMutableCollection
    public int getSize() {
        return this.f15000p0.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<V> iterator() {
        return new PersistentOrderedMapBuilderValuesIterator(this.f15000p0);
    }
}
