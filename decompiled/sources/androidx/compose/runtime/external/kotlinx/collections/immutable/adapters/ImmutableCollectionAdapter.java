package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReadOnlyCollectionAdapters.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0001J\t\u0010\n\u001a\u00020\u0005H\u0096\u0001J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0003J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0016\u001a\u00020\u00108\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/adapters/ImmutableCollectionAdapter;", ExifInterface.LONGITUDE_EAST, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "", "element", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "(Ljava/lang/Object;)Z", "elements", "containsAll", "isEmpty", "", "iterator", "", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "getSize", "()I", "size", "impl", "<init>", "(Ljava/util/Collection;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public class ImmutableCollectionAdapter<E> implements ImmutableCollection<E>, Collection<E>, KMappedMarker {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Collection<E> f14888p0;

    /* JADX WARN: Multi-variable type inference failed */
    public ImmutableCollectionAdapter(@NotNull Collection<? extends E> collection) {
        this.f14888p0 = collection;
    }

    @Override // java.util.Collection
    public boolean add(E e5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object element) {
        return this.f14888p0.contains(element);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        return this.f14888p0.containsAll(elements);
    }

    @Override // java.util.Collection
    public boolean equals(@Nullable Object other) {
        return this.f14888p0.equals(other);
    }

    public int getSize() {
        return this.f14888p0.size();
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f14888p0.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f14888p0.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<E> iterator() {
        return this.f14888p0.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @NotNull
    public String toString() {
        return this.f14888p0.toString();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
    }
}
