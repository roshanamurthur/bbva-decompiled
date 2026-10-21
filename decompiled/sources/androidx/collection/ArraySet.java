package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ArraySet.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u001c\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001EB\u0013\b\u0007\u0012\b\b\u0002\u0010@\u001a\u00020\u0006¢\u0006\u0004\bA\u0010<B\u001b\b\u0016\u0012\u0010\u0010B\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0004\bA\u0010CB\u0019\b\u0016\u0012\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010&¢\u0006\u0004\bA\u0010DB\u001b\b\u0016\u0012\u0010\u0010\u0015\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u001a¢\u0006\u0004\bA\u00106J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\nH\u0016J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u0016\u0010\u0016\u001a\u00020\u00042\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\fJ\u0015\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0012J\u0016\u0010\u0019\u001a\u00020\n2\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000J\u0015\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a\"\u0004\b\u0001\u0010\u001d2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001eJ\u0013\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010!\u001a\u00020\u0006H\u0016J\b\u0010#\u001a\u00020\"H\u0016J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0096\u0002J\u0016\u0010(\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016J\u0016\u0010\u0016\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016J\u0016\u0010\u0019\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016J\u0016\u0010)\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016R\"\u00101\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R*\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u001c\"\u0004\b5\u00106R\"\u0010=\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010:¨\u0006F"}, d2 = {"Landroidx/collection/ArraySet;", ExifInterface.LONGITUDE_EAST, "", "", "", ClearCommand.ID, "", "minimumCapacity", "ensureCapacity", "element", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "(Ljava/lang/Object;)Z", "", "key", "indexOf", FirebaseAnalytics.Param.INDEX, "valueAt", "(I)Ljava/lang/Object;", "isEmpty", "add", "array", "addAll", RemoveCommand.ID, "removeAt", "removeAll", "", "toArray", "()[Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, "([Ljava/lang/Object;)[Ljava/lang/Object;", "other", "equals", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "iterator", "", "elements", "containsAll", "retainAll", "", "p0", "[I", "getHashes$collection", "()[I", "setHashes$collection", "([I)V", "hashes", "q0", "[Ljava/lang/Object;", "getArray$collection", "setArray$collection", "([Ljava/lang/Object;)V", "r0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "get_size$collection", "()I", "set_size$collection", "(I)V", "_size", "getSize", "size", "capacity", "<init>", SetCommand.ID, "(Landroidx/collection/ArraySet;)V", "(Ljava/util/Collection;)V", "a", "collection"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nArraySet.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n+ 2 ArraySet.kt\nandroidx/collection/ArraySetKt\n*L\n1#1,300:1\n304#2,10:301\n317#2,14:311\n334#2:325\n339#2:326\n345#2:327\n350#2:328\n355#2,61:329\n420#2,17:390\n440#2,6:407\n450#2,60:413\n518#2,9:473\n531#2,22:482\n557#2,7:504\n568#2,19:511\n591#2,6:530\n601#2,6:536\n611#2,5:542\n620#2,8:547\n*S KotlinDebug\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n*L\n98#1:301,10\n108#1:311,14\n118#1:325\n128#1:326\n138#1:327\n145#1:328\n157#1:329,61\n167#1:390,17\n177#1:407,6\n188#1:413,60\n197#1:473,9\n224#1:482,22\n231#1:504,7\n240#1:511,19\n267#1:530,6\n276#1:536,6\n286#1:542,5\n297#1:547,8\n*E\n"})
public final class ArraySet<E> implements Collection<E>, Set<E>, KMutableCollection, KMutableSet {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public int[] hashes;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Object[] array;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public int _size;

    /* JADX INFO: compiled from: ArraySet.jvm.kt */
    public final class a extends IndexBasedArrayIterator<E> {
        public a() {
            super(ArraySet.this.get_size$collection());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final E elementAt(int i10) {
            return ArraySet.this.valueAt(i10);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final void removeAt(int i10) {
            ArraySet.this.removeAt(i10);
        }
    }

    @JvmOverloads
    public ArraySet() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E element) {
        int i10;
        int iIndexOf;
        int i11 = get_size$collection();
        if (element == null) {
            iIndexOf = ArraySetKt.indexOfNull(this);
            i10 = 0;
        } else {
            int iHashCode = element.hashCode();
            i10 = iHashCode;
            iIndexOf = ArraySetKt.indexOf(this, element, iHashCode);
        }
        if (iIndexOf >= 0) {
            return false;
        }
        int i12 = ~iIndexOf;
        if (i11 >= getHashes().length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            int[] hashes = getHashes();
            Object[] array = getArray();
            ArraySetKt.allocArrays(this, i13);
            if (i11 != get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            if (!(getHashes().length == 0)) {
                ArraysKt___ArraysJvmKt.copyInto$default(hashes, getHashes(), 0, 0, hashes.length, 6, (Object) null);
                ArraysKt___ArraysJvmKt.copyInto$default(array, getArray(), 0, 0, array.length, 6, (Object) null);
            }
        }
        if (i12 < i11) {
            int i14 = i12 + 1;
            ArraysKt___ArraysJvmKt.copyInto(getHashes(), getHashes(), i14, i12, i11);
            ArraysKt___ArraysJvmKt.copyInto(getArray(), getArray(), i14, i12, i11);
        }
        if (i11 != get_size$collection() || i12 >= getHashes().length) {
            throw new ConcurrentModificationException();
        }
        getHashes()[i12] = i10;
        getArray()[i12] = element;
        set_size$collection(get_size$collection() + 1);
        return true;
    }

    public final void addAll(@NotNull ArraySet<? extends E> array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i10 = array.get_size$collection();
        ensureCapacity(get_size$collection() + i10);
        if (get_size$collection() != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                add(array.valueAt(i11));
            }
            return;
        }
        if (i10 > 0) {
            ArraysKt___ArraysJvmKt.copyInto$default(array.getHashes(), getHashes(), 0, 0, i10, 6, (Object) null);
            ArraysKt___ArraysJvmKt.copyInto$default(array.getArray(), getArray(), 0, 0, i10, 6, (Object) null);
            if (get_size$collection() != 0) {
                throw new ConcurrentModificationException();
            }
            set_size$collection(i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (get_size$collection() != 0) {
            setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            set_size$collection(0);
        }
        if (get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        return indexOf(element) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void ensureCapacity(int minimumCapacity) {
        int i10 = get_size$collection();
        if (getHashes().length < minimumCapacity) {
            int[] hashes = getHashes();
            Object[] array = getArray();
            ArraySetKt.allocArrays(this, minimumCapacity);
            if (get_size$collection() > 0) {
                ArraysKt___ArraysJvmKt.copyInto$default(hashes, getHashes(), 0, 0, get_size$collection(), 6, (Object) null);
                ArraysKt___ArraysJvmKt.copyInto$default(array, getArray(), 0, 0, get_size$collection(), 6, (Object) null);
            }
        }
        if (get_size$collection() != i10) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof Set) && size() == ((Set) other).size()) {
            try {
                int i10 = get_size$collection();
                for (int i11 = 0; i11 < i10; i11++) {
                    if (((Set) other).contains(valueAt(i11))) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: getArray$collection, reason: from getter */
    public final Object[] getArray() {
        return this.array;
    }

    @NotNull
    /* JADX INFO: renamed from: getHashes$collection, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    /* JADX INFO: renamed from: getSize, reason: from getter */
    public int get_size() {
        return this._size;
    }

    public final int get_size$collection() {
        return this._size;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes = getHashes();
        int i10 = get_size$collection();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += hashes[i12];
        }
        return i11;
    }

    public final int indexOf(@Nullable Object key) {
        return key == null ? ArraySetKt.indexOfNull(this) : ArraySetKt.indexOf(this, key, key.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return get_size$collection() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(@NotNull ArraySet<? extends E> array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i10 = array.get_size$collection();
        int i11 = get_size$collection();
        for (int i12 = 0; i12 < i10; i12++) {
            remove(array.valueAt(i12));
        }
        return i11 != get_size$collection();
    }

    public final E removeAt(int index) {
        int i10 = get_size$collection();
        E e5 = (E) getArray()[index];
        if (i10 <= 1) {
            clear();
        } else {
            int i11 = i10 - 1;
            if (getHashes().length <= 8 || get_size$collection() >= getHashes().length / 3) {
                if (index < i11) {
                    int i12 = index + 1;
                    ArraysKt___ArraysJvmKt.copyInto(getHashes(), getHashes(), index, i12, i10);
                    ArraysKt___ArraysJvmKt.copyInto(getArray(), getArray(), index, i12, i10);
                }
                getArray()[i11] = null;
            } else {
                int i13 = get_size$collection() > 8 ? get_size$collection() + (get_size$collection() >> 1) : 8;
                int[] hashes = getHashes();
                Object[] array = getArray();
                ArraySetKt.allocArrays(this, i13);
                if (index > 0) {
                    ArraysKt___ArraysJvmKt.copyInto$default(hashes, getHashes(), 0, 0, index, 6, (Object) null);
                    ArraysKt___ArraysJvmKt.copyInto$default(array, getArray(), 0, 0, index, 6, (Object) null);
                }
                if (index < i11) {
                    int i14 = index + 1;
                    ArraysKt___ArraysJvmKt.copyInto(hashes, getHashes(), index, i14, i10);
                    ArraysKt___ArraysJvmKt.copyInto(array, getArray(), index, i14, i10);
                }
            }
            if (i10 != get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            set_size$collection(i11);
        }
        return e5;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        for (int i10 = get_size$collection() - 1; -1 < i10; i10--) {
            if (!CollectionsKt___CollectionsKt.contains(elements, getArray()[i10])) {
                removeAt(i10);
                z10 = true;
            }
        }
        return z10;
    }

    public final void setArray$collection(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.array = objArr;
    }

    public final void setHashes$collection(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.hashes = iArr;
    }

    public final void set_size$collection(int i10) {
        this._size = i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return get_size();
    }

    @Override // java.util.Collection, java.util.Set
    @NotNull
    public final Object[] toArray() {
        return ArraysKt___ArraysJvmKt.copyOfRange(this.array, 0, this._size);
    }

    @NotNull
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(get_size$collection() * 14);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i10 = get_size$collection();
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            E eValueAt = valueAt(i11);
            if (eValueAt != this) {
                sb2.append(eValueAt);
            } else {
                sb2.append("(this Set)");
            }
        }
        return androidx.appcompat.app.i.b(sb2, AbstractJsonLexerKt.END_OBJ, "StringBuilder(capacity).…builderAction).toString()");
    }

    public final E valueAt(int index) {
        return (E) getArray()[index];
    }

    @JvmOverloads
    public ArraySet(int i10) {
        this.hashes = ContainerHelpersKt.EMPTY_INTS;
        this.array = ContainerHelpersKt.EMPTY_OBJECTS;
        if (i10 > 0) {
            ArraySetKt.allocArrays(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    @NotNull
    public final <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i10 = this._size;
        if (array.length < i10) {
            array = (T[]) ((Object[]) androidx.collection.a.b(array, i10));
        } else if (array.length > i10) {
            array[i10] = null;
        }
        ArraysKt___ArraysJvmKt.copyInto(this.array, array, 0, 0, this._size);
        T[] result = array;
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return array;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    public /* synthetic */ ArraySet(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public ArraySet(@Nullable ArraySet<? extends E> arraySet) {
        this(0);
        if (arraySet != null) {
            addAll((ArraySet) arraySet);
        }
    }

    public ArraySet(@Nullable Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        ensureCapacity(elements.size() + get_size$collection());
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(@Nullable E[] eArr) {
        this(0);
        if (eArr != null) {
            Iterator it = ArrayIteratorKt.iterator(eArr);
            while (it.hasNext()) {
                add(it.next());
            }
        }
    }
}
