package kotlin.collections.builders;

import androidx.exifinterface.media.ExifInterface;
import bk.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableListIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0002=>B\t\b\u0016¢\u0006\u0004\b9\u0010:B\u0011\b\u0016\u0012\u0006\u0010;\u001a\u00020\f¢\u0006\u0004\b9\u0010<J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bJ\b\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0011\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096\u0002J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\r\u001a\u00020\fH\u0016J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001a\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001dJ\u0016\u0010 \u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016J\u001e\u0010 \u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016J\b\u0010!\u001a\u00020\u001cH\u0016J\u0017\u0010\"\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010\u000fJ\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010\u001bJ\u0016\u0010$\u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016J\u0016\u0010%\u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\fH\u0016J)\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010*\"\u0004\b\u0001\u0010)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0*H\u0016¢\u0006\u0004\b,\u0010/J\u0013\u00101\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010.H\u0096\u0002J\b\u00102\u001a\u00020\fH\u0016J\b\u00104\u001a\u000203H\u0016J\b\u00105\u001a\u00020.H\u0002R\u0014\u00108\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006?"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", ExifInterface.LONGITUDE_EAST, "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "isEmpty", "", FirebaseAnalytics.Param.INDEX, "get", "(I)Ljava/lang/Object;", "element", SetCommand.ID, "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "", "listIterator", "add", "(Ljava/lang/Object;)Z", "", "(ILjava/lang/Object;)V", "", "elements", "addAll", ClearCommand.ID, "removeAt", RemoveCommand.ID, "removeAll", "retainAll", "fromIndex", "toIndex", "subList", ExifInterface.GPS_DIRECTION_TRUE, "", "destination", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "other", "equals", GenerateActivationFormCommand.HASH_CODE, "", "toString", "writeReplace", "getSize", "()I", "size", "<init>", "()V", "initialCapacity", "(I)V", "a", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,487:1\n1#2:488\n*E\n"})
public final class ListBuilder<E> extends AbstractMutableList<E> implements RandomAccess, Serializable {

    @NotNull
    public static final ListBuilder v0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public E[] f79518p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f79519q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f79520r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f79521s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public final ListBuilder<E> f79522t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public final ListBuilder<E> f79523u0;

    /* JADX INFO: compiled from: ListBuilder.kt */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: compiled from: ListBuilder.kt */
    @SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,487:1\n1#2:488\n*E\n"})
    public static final class b<E> implements ListIterator<E>, KMutableListIterator {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final ListBuilder<E> f79524p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f79525q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f79526r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f79527s0;

        public b(@NotNull ListBuilder<E> list, int i10) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f79524p0 = list;
            this.f79525q0 = i10;
            this.f79526r0 = -1;
            this.f79527s0 = ((AbstractList) list).modCount;
        }

        public final void a() {
            if (((AbstractList) this.f79524p0).modCount != this.f79527s0) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(E e5) {
            a();
            int i10 = this.f79525q0;
            this.f79525q0 = i10 + 1;
            ListBuilder<E> listBuilder = this.f79524p0;
            listBuilder.add(i10, e5);
            this.f79526r0 = -1;
            this.f79527s0 = ((AbstractList) listBuilder).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f79525q0 < this.f79524p0.f79520r0;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f79525q0 > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            a();
            int i10 = this.f79525q0;
            ListBuilder<E> listBuilder = this.f79524p0;
            if (i10 >= listBuilder.f79520r0) {
                throw new NoSuchElementException();
            }
            int i11 = this.f79525q0;
            this.f79525q0 = i11 + 1;
            this.f79526r0 = i11;
            return (E) listBuilder.f79518p0[listBuilder.f79519q0 + this.f79526r0];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f79525q0;
        }

        @Override // java.util.ListIterator
        public E previous() {
            a();
            int i10 = this.f79525q0;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f79525q0 = i11;
            this.f79526r0 = i11;
            ListBuilder<E> listBuilder = this.f79524p0;
            return (E) listBuilder.f79518p0[listBuilder.f79519q0 + this.f79526r0];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f79525q0 - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            a();
            int i10 = this.f79526r0;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            ListBuilder<E> listBuilder = this.f79524p0;
            listBuilder.remove(i10);
            this.f79525q0 = this.f79526r0;
            this.f79526r0 = -1;
            this.f79527s0 = ((AbstractList) listBuilder).modCount;
        }

        @Override // java.util.ListIterator
        public void set(E e5) {
            a();
            int i10 = this.f79526r0;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.f79524p0.set(i10, e5);
        }
    }

    static {
        new a(null);
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.f79521s0 = true;
        v0 = listBuilder;
    }

    public ListBuilder(E[] eArr, int i10, int i11, boolean z10, ListBuilder<E> listBuilder, ListBuilder<E> listBuilder2) {
        this.f79518p0 = eArr;
        this.f79519q0 = i10;
        this.f79520r0 = i11;
        this.f79521s0 = z10;
        this.f79522t0 = listBuilder;
        this.f79523u0 = listBuilder2;
        if (listBuilder != null) {
            ((AbstractList) this).modCount = ((AbstractList) listBuilder).modCount;
        }
    }

    private final Object writeReplace() throws NotSerializableException {
        ListBuilder<E> listBuilder;
        if (this.f79521s0 || ((listBuilder = this.f79523u0) != null && listBuilder.f79521s0)) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    public final void a(int i10, Collection<? extends E> collection, int i11) {
        ((AbstractList) this).modCount++;
        ListBuilder<E> listBuilder = this.f79522t0;
        if (listBuilder != null) {
            listBuilder.a(i10, collection, i11);
            this.f79518p0 = listBuilder.f79518p0;
            this.f79520r0 += i11;
        } else {
            e(i10, i11);
            Iterator<? extends E> it = collection.iterator();
            for (int i12 = 0; i12 < i11; i12++) {
                this.f79518p0[i10 + i12] = it.next();
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        d();
        c();
        b(this.f79519q0 + this.f79520r0, element);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        d();
        c();
        int size = elements.size();
        a(this.f79519q0 + this.f79520r0, elements, size);
        return size > 0;
    }

    public final void b(int i10, E e5) {
        ((AbstractList) this).modCount++;
        ListBuilder<E> listBuilder = this.f79522t0;
        if (listBuilder == null) {
            e(i10, 1);
            this.f79518p0[i10] = e5;
        } else {
            listBuilder.b(i10, e5);
            this.f79518p0 = listBuilder.f79518p0;
            this.f79520r0++;
        }
    }

    @NotNull
    public final List<E> build() {
        if (this.f79522t0 != null) {
            throw new IllegalStateException();
        }
        d();
        this.f79521s0 = true;
        return this.f79520r0 > 0 ? this : v0;
    }

    public final void c() {
        ListBuilder<E> listBuilder = this.f79523u0;
        if (listBuilder != null && ((AbstractList) listBuilder).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        d();
        c();
        g(this.f79519q0, this.f79520r0);
    }

    public final void d() {
        ListBuilder<E> listBuilder;
        if (this.f79521s0 || ((listBuilder = this.f79523u0) != null && listBuilder.f79521s0)) {
            throw new UnsupportedOperationException();
        }
    }

    public final void e(int i10, int i11) {
        int i12 = this.f79520r0 + i11;
        if (i12 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.f79518p0;
        if (i12 > eArr.length) {
            this.f79518p0 = (E[]) ListBuilderKt.copyOfUninitializedElements(this.f79518p0, kotlin.collections.AbstractList.INSTANCE.newCapacity$kotlin_stdlib(eArr.length, i12));
        }
        E[] eArr2 = this.f79518p0;
        ArraysKt___ArraysJvmKt.copyInto(eArr2, eArr2, i10 + i11, i10, this.f79519q0 + this.f79520r0);
        this.f79520r0 += i11;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@Nullable Object other) {
        c();
        if (other != this) {
            if (other instanceof List) {
                if (ListBuilderKt.access$subarrayContentEquals(this.f79518p0, this.f79519q0, this.f79520r0, (List) other)) {
                }
            }
            return false;
        }
        return true;
    }

    public final E f(int i10) {
        ((AbstractList) this).modCount++;
        ListBuilder<E> listBuilder = this.f79522t0;
        if (listBuilder != null) {
            E eF = listBuilder.f(i10);
            this.f79520r0--;
            return eF;
        }
        E[] eArr = this.f79518p0;
        E e5 = eArr[i10];
        int i11 = this.f79520r0;
        int i12 = this.f79519q0;
        ArraysKt___ArraysJvmKt.copyInto(eArr, eArr, i10, i10 + 1, i11 + i12);
        ListBuilderKt.resetAt(this.f79518p0, (i12 + this.f79520r0) - 1);
        this.f79520r0--;
        return e5;
    }

    public final void g(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        ListBuilder<E> listBuilder = this.f79522t0;
        if (listBuilder != null) {
            listBuilder.g(i10, i11);
        } else {
            E[] eArr = this.f79518p0;
            ArraysKt___ArraysJvmKt.copyInto(eArr, eArr, i10, i10 + i11, this.f79520r0);
            E[] eArr2 = this.f79518p0;
            int i12 = this.f79520r0;
            ListBuilderKt.resetRange(eArr2, i12 - i11, i12);
        }
        this.f79520r0 -= i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        c();
        kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, this.f79520r0);
        return this.f79518p0[this.f79519q0 + index];
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        c();
        return this.f79520r0;
    }

    public final int h(int i10, int i11, Collection<? extends E> collection, boolean z10) {
        int iH;
        ListBuilder<E> listBuilder = this.f79522t0;
        if (listBuilder != null) {
            iH = listBuilder.h(i10, i11, collection, z10);
        } else {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11) {
                int i14 = i10 + i12;
                if (collection.contains(this.f79518p0[i14]) == z10) {
                    E[] eArr = this.f79518p0;
                    i12++;
                    eArr[i13 + i10] = eArr[i14];
                    i13++;
                } else {
                    i12++;
                }
            }
            int i15 = i11 - i13;
            E[] eArr2 = this.f79518p0;
            ArraysKt___ArraysJvmKt.copyInto(eArr2, eArr2, i10 + i13, i11 + i10, this.f79520r0);
            E[] eArr3 = this.f79518p0;
            int i16 = this.f79520r0;
            ListBuilderKt.resetRange(eArr3, i16 - i15, i16);
            iH = i15;
        }
        if (iH > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f79520r0 -= iH;
        return iH;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        c();
        return ListBuilderKt.access$subarrayContentHashCode(this.f79518p0, this.f79519q0, this.f79520r0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        c();
        for (int i10 = 0; i10 < this.f79520r0; i10++) {
            if (Intrinsics.areEqual(this.f79518p0[this.f79519q0 + i10], element)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        c();
        return this.f79520r0 == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        c();
        for (int i10 = this.f79520r0 - 1; i10 >= 0; i10--) {
            if (Intrinsics.areEqual(this.f79518p0[this.f79519q0 + i10], element)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        d();
        c();
        int iIndexOf = indexOf(element);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        d();
        c();
        return h(this.f79519q0, this.f79520r0, elements, false) > 0;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int index) {
        d();
        c();
        kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, this.f79520r0);
        return f(this.f79519q0 + index);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        d();
        c();
        return h(this.f79519q0, this.f79520r0, elements, true) > 0;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        d();
        c();
        kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, this.f79520r0);
        E[] eArr = this.f79518p0;
        int i10 = this.f79519q0;
        E e5 = eArr[i10 + index];
        eArr[i10 + index] = element;
        return e5;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public List<E> subList(int fromIndex, int toIndex) {
        kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, this.f79520r0);
        E[] eArr = this.f79518p0;
        int i10 = this.f79519q0 + fromIndex;
        int i11 = toIndex - fromIndex;
        boolean z10 = this.f79521s0;
        ListBuilder<E> listBuilder = this.f79523u0;
        return new ListBuilder(eArr, i10, i11, z10, this, listBuilder == null ? this : listBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        c();
        int length = destination.length;
        int i10 = this.f79520r0;
        int i11 = this.f79519q0;
        if (length >= i10) {
            ArraysKt___ArraysJvmKt.copyInto(this.f79518p0, destination, 0, i11, i10 + i11);
            return (T[]) d.terminateCollectionToArray(this.f79520r0, destination);
        }
        T[] tArr = (T[]) Arrays.copyOfRange(this.f79518p0, i11, i10 + i11, destination.getClass());
        Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
        return tArr;
    }

    @Override // java.util.AbstractCollection
    @NotNull
    public String toString() {
        c();
        return ListBuilderKt.access$subarrayContentToString(this.f79518p0, this.f79519q0, this.f79520r0, this);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int index) {
        c();
        kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, this.f79520r0);
        return new b(this, index);
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        d();
        c();
        kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, this.f79520r0);
        b(this.f79519q0 + index, element);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        d();
        c();
        kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, this.f79520r0);
        int size = elements.size();
        a(this.f79519q0 + index, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        c();
        E[] eArr = this.f79518p0;
        int i10 = this.f79520r0;
        int i11 = this.f79519q0;
        return ArraysKt___ArraysJvmKt.copyOfRange(eArr, i11, i10 + i11);
    }

    public ListBuilder() {
        this(10);
    }

    public ListBuilder(int i10) {
        this(ListBuilderKt.arrayOfUninitializedElements(i10), 0, 0, false, null, null);
    }
}
