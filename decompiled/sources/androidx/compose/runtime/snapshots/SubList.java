package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnapshotStateList.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,497:1\n1726#2,3:498\n1855#2,2:501\n33#3,7:503\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SubList\n*L\n349#1:498,3\n358#1:501,2\n484#1:503,7\n*E\n"})
public final class SubList<T> implements List<T>, KMutableList {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<T> f15351p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f15352q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f15353r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f15354s0;

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SubList$listIterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: SnapshotStateList.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0015\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\r\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\nJ\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u0015\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0005¨\u0006\u0011"}, d2 = {"androidx/compose/runtime/snapshots/SubList$listIterator$1", "", "add", "", "element", "(Ljava/lang/Object;)Ljava/lang/Void;", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "", "previous", "previousIndex", RemoveCommand.ID, SetCommand.ID, "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 implements ListIterator<T>, KMutableListIterator {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f15355p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SubList<T> f15356q0;

        public AnonymousClass1(Ref.IntRef intRef, SubList<T> subList) {
            this.f15355p0 = intRef;
            this.f15356q0 = subList;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f15355p0.element < this.f15356q0.f15354s0 - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f15355p0.element >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            Ref.IntRef intRef = this.f15355p0;
            int i10 = intRef.element + 1;
            SubList<T> subList = this.f15356q0;
            SnapshotStateListKt.access$validateRange(i10, subList.f15354s0);
            intRef.element = i10;
            return subList.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f15355p0.element + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            Ref.IntRef intRef = this.f15355p0;
            int i10 = intRef.element;
            SubList<T> subList = this.f15356q0;
            SnapshotStateListKt.access$validateRange(i10, subList.f15354s0);
            intRef.element = i10 - 1;
            return subList.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f15355p0.element;
        }

        @Override // java.util.ListIterator
        @NotNull
        public Void add(T element) {
            SnapshotStateListKt.access$modificationError();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @NotNull
        public Void remove() {
            SnapshotStateListKt.access$modificationError();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator
        @NotNull
        public Void set(T element) {
            SnapshotStateListKt.access$modificationError();
            throw new KotlinNothingValueException();
        }
    }

    public SubList(@NotNull SnapshotStateList<T> snapshotStateList, int i10, int i11) {
        this.f15351p0 = snapshotStateList;
        this.f15352q0 = i10;
        this.f15353r0 = snapshotStateList.getStructure$runtime_release();
        this.f15354s0 = i11 - i10;
    }

    public final void a() {
        if (this.f15351p0.getStructure$runtime_release() != this.f15353r0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t10) {
        a();
        int i10 = this.f15352q0 + this.f15354s0;
        SnapshotStateList<T> snapshotStateList = this.f15351p0;
        snapshotStateList.add(i10, t10);
        this.f15354s0++;
        this.f15353r0 = snapshotStateList.getStructure$runtime_release();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(@NotNull Collection<? extends T> collection) {
        return addAll(this.f15354s0, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f15354s0 > 0) {
            a();
            int i10 = this.f15354s0;
            int i11 = this.f15352q0;
            SnapshotStateList<T> snapshotStateList = this.f15351p0;
            snapshotStateList.removeRange(i11, i10 + i11);
            this.f15354s0 = 0;
            this.f15353r0 = snapshotStateList.getStructure$runtime_release();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(@NotNull Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i10) {
        a();
        SnapshotStateListKt.access$validateRange(i10, this.f15354s0);
        return this.f15351p0.get(this.f15352q0 + i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i10 = this.f15354s0;
        int i11 = this.f15352q0;
        Iterator<Integer> it = kotlin.ranges.c.until(i11, i10 + i11).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            if (Intrinsics.areEqual(obj, this.f15351p0.get(iNextInt))) {
                return iNextInt - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f15354s0 == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i10 = this.f15354s0;
        int i11 = this.f15352q0;
        for (int i12 = (i10 + i11) - 1; i12 >= i11; i12--) {
            if (Intrinsics.areEqual(obj, this.f15351p0.get(i12))) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(@NotNull Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(@NotNull Collection<? extends Object> collection) {
        a();
        int i10 = this.f15354s0;
        int i11 = this.f15352q0;
        SnapshotStateList<T> snapshotStateList = this.f15351p0;
        int iRetainAllInRange$runtime_release = snapshotStateList.retainAllInRange$runtime_release(collection, i11, i10 + i11);
        if (iRetainAllInRange$runtime_release > 0) {
            this.f15353r0 = snapshotStateList.getStructure$runtime_release();
            this.f15354s0 -= iRetainAllInRange$runtime_release;
        }
        return iRetainAllInRange$runtime_release > 0;
    }

    @Override // java.util.List
    public final T set(int i10, T t10) {
        SnapshotStateListKt.access$validateRange(i10, this.f15354s0);
        a();
        int i11 = i10 + this.f15352q0;
        SnapshotStateList<T> snapshotStateList = this.f15351p0;
        T t11 = snapshotStateList.set(i11, t10);
        this.f15353r0 = snapshotStateList.getStructure$runtime_release();
        return t11;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f15354s0;
    }

    @Override // java.util.List
    @NotNull
    public final List<T> subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= this.f15354s0)) {
            PreconditionsKt.throwIllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        a();
        int i12 = this.f15352q0;
        return new SubList(this.f15351p0, i10 + i12, i11 + i12);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List
    @NotNull
    public final ListIterator<T> listIterator(int i10) {
        a();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = i10 - 1;
        return new AnonymousClass1(intRef, this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, @NotNull Collection<? extends T> collection) {
        a();
        int i11 = i10 + this.f15352q0;
        SnapshotStateList<T> snapshotStateList = this.f15351p0;
        boolean zAddAll = snapshotStateList.addAll(i11, collection);
        if (zAddAll) {
            this.f15354s0 = collection.size() + this.f15354s0;
            this.f15353r0 = snapshotStateList.getStructure$runtime_release();
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final T remove(int i10) {
        a();
        int i11 = this.f15352q0 + i10;
        SnapshotStateList<T> snapshotStateList = this.f15351p0;
        T tRemove = snapshotStateList.remove(i11);
        this.f15354s0--;
        this.f15353r0 = snapshotStateList.getStructure$runtime_release();
        return tRemove;
    }

    @Override // java.util.List
    public final void add(int i10, T t10) {
        a();
        int i11 = this.f15352q0 + i10;
        SnapshotStateList<T> snapshotStateList = this.f15351p0;
        snapshotStateList.add(i11, t10);
        this.f15354s0++;
        this.f15353r0 = snapshotStateList.getStructure$runtime_release();
    }
}
