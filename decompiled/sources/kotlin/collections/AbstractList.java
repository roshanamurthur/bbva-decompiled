package kotlin.collections;

import androidx.camera.camera2.internal.n1;
import androidx.collection.h;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.esotericsoftware.kryo.util.Util;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractList.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.1")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b'\u0018\u0000 \u001d*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\u001d\u001e\u001f B\t\b\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0096\u0002J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0016R\u0014\u0010\u001a\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006!"}, d2 = {"Lkotlin/collections/AbstractList;", ExifInterface.LONGITUDE_EAST, "Lkotlin/collections/AbstractCollection;", "", "", FirebaseAnalytics.Param.INDEX, "get", "(I)Ljava/lang/Object;", "", "iterator", "element", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", "", "other", "", "equals", GenerateActivationFormCommand.HASH_CODE, "getSize", "()I", "size", "<init>", "()V", "Companion", "a", "b", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAbstractList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n350#2,7:171\n378#2,7:178\n*S KotlinDebug\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n*L\n27#1:171,7\n29#1:178,7\n*E\n"})
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: AbstractList.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\nJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\rJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000fJ%\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0013J\u001d\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0017J%\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001b2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0000¢\u0006\u0002\b\u001dJ\u0019\u0010\u001e\u001a\u00020\u00042\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0000¢\u0006\u0002\b\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lkotlin/collections/AbstractList$Companion;", "", "()V", "maxArraySize", "", "checkBoundsIndexes", "", "startIndex", "endIndex", "size", "checkBoundsIndexes$kotlin_stdlib", "checkElementIndex", FirebaseAnalytics.Param.INDEX, "checkElementIndex$kotlin_stdlib", "checkPositionIndex", "checkPositionIndex$kotlin_stdlib", "checkRangeIndexes", "fromIndex", "toIndex", "checkRangeIndexes$kotlin_stdlib", "newCapacity", "oldCapacity", "minCapacity", "newCapacity$kotlin_stdlib", "orderedEquals", "", "c", "", "other", "orderedEquals$kotlin_stdlib", "orderedHashCode", "orderedHashCode$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void checkBoundsIndexes$kotlin_stdlib(int startIndex, int endIndex, int size) {
            if (startIndex < 0 || endIndex > size) {
                StringBuilder sbE = h.e("startIndex: ", startIndex, ", endIndex: ", endIndex, ", size: ");
                sbE.append(size);
                throw new IndexOutOfBoundsException(sbE.toString());
            }
            if (startIndex > endIndex) {
                throw new IllegalArgumentException(n1.e("startIndex: ", startIndex, " > endIndex: ", endIndex));
            }
        }

        public final void checkElementIndex$kotlin_stdlib(int index, int size) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException(n1.e("index: ", index, ", size: ", size));
            }
        }

        public final void checkPositionIndex$kotlin_stdlib(int index, int size) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException(n1.e("index: ", index, ", size: ", size));
            }
        }

        public final void checkRangeIndexes$kotlin_stdlib(int fromIndex, int toIndex, int size) {
            if (fromIndex < 0 || toIndex > size) {
                StringBuilder sbE = h.e("fromIndex: ", fromIndex, ", toIndex: ", toIndex, ", size: ");
                sbE.append(size);
                throw new IndexOutOfBoundsException(sbE.toString());
            }
            if (fromIndex > toIndex) {
                throw new IllegalArgumentException(n1.e("fromIndex: ", fromIndex, " > toIndex: ", toIndex));
            }
        }

        public final int newCapacity$kotlin_stdlib(int oldCapacity, int minCapacity) {
            int i10 = oldCapacity + (oldCapacity >> 1);
            if (i10 - minCapacity < 0) {
                i10 = minCapacity;
            }
            if (i10 - Util.maxArraySize <= 0) {
                return i10;
            }
            if (minCapacity > 2147483639) {
                return Integer.MAX_VALUE;
            }
            return Util.maxArraySize;
        }

        public final boolean orderedEquals$kotlin_stdlib(@NotNull Collection<?> c10, @NotNull Collection<?> other) {
            Intrinsics.checkNotNullParameter(c10, "c");
            Intrinsics.checkNotNullParameter(other, "other");
            if (c10.size() != other.size()) {
                return false;
            }
            Iterator<?> it = other.iterator();
            Iterator<?> it2 = c10.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.areEqual(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int orderedHashCode$kotlin_stdlib(@NotNull Collection<?> c10) {
            Intrinsics.checkNotNullParameter(c10, "c");
            Iterator<?> it = c10.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }
    }

    /* JADX INFO: compiled from: AbstractList.kt */
    public class a implements Iterator<E>, KMappedMarker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f79420p0;

        public a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f79420p0 < AbstractList.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f79420p0;
            this.f79420p0 = i10 + 1;
            return AbstractList.this.get(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: AbstractList.kt */
    public class b extends AbstractList<E>.a implements ListIterator<E> {
        public b(int i10) {
            super();
            AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(i10, AbstractList.this.size());
            this.f79420p0 = i10;
        }

        @Override // java.util.ListIterator
        public void add(E e5) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f79420p0 > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f79420p0;
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f79420p0 - 1;
            this.f79420p0 = i10;
            return AbstractList.this.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f79420p0 - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e5) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: AbstractList.kt */
    public static final class c<E> extends AbstractList<E> implements RandomAccess {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final AbstractList<E> f79423p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f79424q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f79425r0;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull AbstractList<? extends E> list, int i10, int i11) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f79423p0 = list;
            this.f79424q0 = i10;
            AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i10, i11, list.size());
            this.f79425r0 = i11 - i10;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public E get(int i10) {
            AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(i10, this.f79425r0);
            return this.f79423p0.get(this.f79424q0 + i10);
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.f79425r0;
        }
    }

    @Override // java.util.List
    public void add(int i10, E e5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof List) {
            return INSTANCE.orderedEquals$kotlin_stdlib(this, (Collection) other);
        }
        return false;
    }

    public abstract E get(int index);

    @Override // kotlin.collections.AbstractCollection
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return INSTANCE.orderedHashCode$kotlin_stdlib(this);
    }

    public int indexOf(E element) {
        Iterator<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (Intrinsics.areEqual(it.next(), element)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return new a();
    }

    public int lastIndexOf(E element) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.areEqual(listIterator.previous(), element)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @NotNull
    public ListIterator<E> listIterator() {
        return new b(0);
    }

    @Override // java.util.List
    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i10, E e5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public List<E> subList(int fromIndex, int toIndex) {
        return new c(this, fromIndex, toIndex);
    }

    @NotNull
    public ListIterator<E> listIterator(int index) {
        return new b(index);
    }
}
