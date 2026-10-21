package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyLayoutPinnableItem.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\t\b\u0016¢\u0006\u0004\b \u0010!J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0003J\u0017\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0096\u0001J\u0011\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0096\u0003J\u0011\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u0010\r\u001a\u00020\u0004H\u0096\u0001J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0096\u0003J\u0011\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0096\u0001J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0096\u0001J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0096\u0001J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;", "element", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", "elements", "containsAll", "", FirebaseAnalytics.Param.INDEX, "get", "indexOf", "isEmpty", "", "iterator", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", AnalyticsConstants.Key.ITEM, "", "pin$foundation_release", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;)V", "pin", "release$foundation_release", "release", "getSize", "()I", "size", "<init>", "()V", "PinnedItem", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
public final class LazyLayoutPinnedItemList implements List<PinnedItem>, KMappedMarker {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final List<PinnedItem> f5015p0 = new SnapshotStateList();

    /* JADX INFO: compiled from: LazyLayoutPinnableItem.kt */
    @ExperimentalFoundationApi
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;", "", "getKey", "()Ljava/lang/Object;", "key", "", "getIndex", "()I", FirebaseAnalytics.Param.INDEX, "Landroidx/compose/foundation/lazy/layout/n;", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public interface PinnedItem {
        int getIndex();

        @Nullable
        Object getKey();
    }

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i10, PinnedItem pinnedItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends PinnedItem> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(@NotNull PinnedItem element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f5015p0.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f5015p0.containsAll(elements);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    @NotNull
    public PinnedItem get(int index) {
        return this.f5015p0.get(index);
    }

    public int getSize() {
        return this.f5015p0.size();
    }

    public int indexOf(@NotNull PinnedItem element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f5015p0.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f5015p0.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<PinnedItem> iterator() {
        return this.f5015p0.iterator();
    }

    public int lastIndexOf(@NotNull PinnedItem element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f5015p0.lastIndexOf(element);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<PinnedItem> listIterator() {
        return this.f5015p0.listIterator();
    }

    public final void pin$foundation_release(@NotNull PinnedItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f5015p0.add(item);
    }

    public final void release$foundation_release(@NotNull PinnedItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f5015p0.remove(item);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public PinnedItem remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<PinnedItem> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
    public PinnedItem set2(int i10, PinnedItem pinnedItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super PinnedItem> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public List<PinnedItem> subList(int fromIndex, int toIndex) {
        return this.f5015p0.subList(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, PinnedItem pinnedItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends PinnedItem> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof PinnedItem) {
            return contains((PinnedItem) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof PinnedItem) {
            return indexOf((PinnedItem) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof PinnedItem) {
            return lastIndexOf((PinnedItem) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<PinnedItem> listIterator(int index) {
        return this.f5015p0.listIterator(index);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ PinnedItem remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ PinnedItem set(int i10, PinnedItem pinnedItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }

    public boolean add(PinnedItem pinnedItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
