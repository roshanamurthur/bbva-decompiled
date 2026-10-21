package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReadOnlyCollectionAdapters.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0096\u0001J\u0018\u0010\r\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0005H\u0096\u0001J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0096\u0003J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0096\u0001J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0001J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u000bH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016R\u0014\u0010\"\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/adapters/ImmutableListAdapter;", ExifInterface.LONGITUDE_EAST, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "", "element", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", FirebaseAnalytics.Param.INDEX, "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", "", "other", "equals", GenerateActivationFormCommand.HASH_CODE, "", "toString", "getSize", "()I", "size", "impl", "<init>", "(Ljava/util/List;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class ImmutableListAdapter<E> implements ImmutableList<E>, List<E>, KMappedMarker {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final List<E> f14889p0;

    /* JADX WARN: Multi-variable type inference failed */
    public ImmutableListAdapter(@NotNull List<? extends E> list) {
        this.f14889p0 = list;
    }

    @Override // java.util.List
    public void add(int i10, E e5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return this.f14889p0.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        return this.f14889p0.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@Nullable Object other) {
        return this.f14889p0.equals(other);
    }

    @Override // java.util.List
    public E get(int index) {
        return this.f14889p0.get(index);
    }

    public int getSize() {
        return this.f14889p0.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f14889p0.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return this.f14889p0.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f14889p0.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<E> iterator() {
        return this.f14889p0.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return this.f14889p0.lastIndexOf(element);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return this.f14889p0.listIterator();
    }

    @Override // java.util.List
    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<E> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i10, E e5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super E> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @NotNull
    public String toString() {
        return this.f14889p0.toString();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<E> listIterator(int index) {
        return this.f14889p0.listIterator(index);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList, java.util.List
    @NotNull
    public ImmutableList<E> subList(int fromIndex, int toIndex) {
        return new ImmutableListAdapter(this.f14889p0.subList(fromIndex, toIndex));
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
    }
}
