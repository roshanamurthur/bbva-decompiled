package kotlin.collections;

import androidx.appcompat.widget.g0;
import androidx.exifinterface.media.ExifInterface;
import bk.b;
import bk.d;
import com.bbva.networkplugin.command.impl.HeadCommand;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ArrayDeque.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.4")
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0010\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 D*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001DB\u0011\b\u0016\u0012\u0006\u0010?\u001a\u00020\u0015¢\u0006\u0004\b@\u0010AB\t\b\u0016¢\u0006\u0004\b@\u0010BB\u0017\b\u0016\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b@\u0010CJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\r\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0010\u0010\u0006J\r\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0012\u0010\u0006J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\u0016\u0010\u001a\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u001e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0018\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001d\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001f\u0010\u0014J\u0017\u0010 \u001a\u00020\u00152\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00152\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010\u0014J\u0017\u0010$\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b$\u0010\u001cJ\u0016\u0010%\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0016\u0010&\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\b\u0010'\u001a\u00020\u000bH\u0016J)\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010)\"\u0004\b\u0001\u0010(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0)H\u0016¢\u0006\u0004\b+\u0010.J)\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010)\"\u0004\b\u0001\u0010(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0000¢\u0006\u0004\b/\u0010,J\u0017\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0)H\u0000¢\u0006\u0004\b/\u0010.JO\u00108\u001a\u00020\u000b2>\u00105\u001a:\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010-0)¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u000b01H\u0000¢\u0006\u0004\b6\u00107R$\u0010>\u001a\u00020\u00152\u0006\u00109\u001a\u00020\u00158\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006E"}, d2 = {"Lkotlin/collections/ArrayDeque;", ExifInterface.LONGITUDE_EAST, "Lkotlin/collections/AbstractMutableList;", "", "isEmpty", "first", "()Ljava/lang/Object;", "firstOrNull", "last", "lastOrNull", "element", "", "addFirst", "(Ljava/lang/Object;)V", "addLast", "removeFirst", "removeFirstOrNull", "removeLast", "removeLastOrNull", "add", "(Ljava/lang/Object;)Z", "", FirebaseAnalytics.Param.INDEX, "(ILjava/lang/Object;)V", "", "elements", "addAll", "get", "(I)Ljava/lang/Object;", SetCommand.ID, "(ILjava/lang/Object;)Ljava/lang/Object;", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", RemoveCommand.ID, "removeAt", "removeAll", "retainAll", ClearCommand.ID, ExifInterface.GPS_DIRECTION_TRUE, "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "testToArray$kotlin_stdlib", "testToArray", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", HeadCommand.ID, "structure", "internalStructure$kotlin_stdlib", "(Lkotlin/jvm/functions/Function2;)V", "internalStructure", "<set-?>", "r0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSize", "()I", "size", "initialCapacity", "<init>", "(I)V", "()V", "(Ljava/util/Collection;)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@WasExperimental(markerClass = {ExperimentalStdlibApi.class})
@SourceDebugExtension({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,569:1\n467#1,51:572\n467#1,51:623\n37#2,2:570\n26#3:674\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n462#1:572,51\n464#1:623,51\n47#1:570,2\n559#1:674\n*E\n"})
public final class ArrayDeque<E> extends AbstractMutableList<E> {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final Object[] f79433s0 = new Object[0];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f79434p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public Object[] f79435q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public int size;

    public ArrayDeque(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f79433s0;
        } else {
            if (i10 <= 0) {
                throw new IllegalArgumentException(g0.c("Illegal Capacity: ", i10));
            }
            objArr = new Object[i10];
        }
        this.f79435q0 = objArr;
    }

    public final void a(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f79435q0.length;
        while (i10 < length && it.hasNext()) {
            this.f79435q0[i10] = it.next();
            i10++;
        }
        int i11 = this.f79434p0;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f79435q0[i12] = it.next();
        }
        this.size = collection.size() + size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        addLast(element);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        b(elements.size() + size());
        a(d(size() + this.f79434p0), elements);
        return true;
    }

    public final void addFirst(E element) {
        b(size() + 1);
        int i10 = this.f79434p0;
        int lastIndex = i10 == 0 ? ArraysKt___ArraysKt.getLastIndex(this.f79435q0) : i10 - 1;
        this.f79434p0 = lastIndex;
        this.f79435q0[lastIndex] = element;
        this.size = size() + 1;
    }

    public final void addLast(E element) {
        b(size() + 1);
        this.f79435q0[d(size() + this.f79434p0)] = element;
        this.size = size() + 1;
    }

    public final void b(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f79435q0;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f79433s0) {
            this.f79435q0 = new Object[c.coerceAtLeast(i10, 10)];
            return;
        }
        Object[] objArr2 = new Object[AbstractList.INSTANCE.newCapacity$kotlin_stdlib(objArr.length, i10)];
        Object[] objArr3 = this.f79435q0;
        ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr2, 0, this.f79434p0, objArr3.length);
        Object[] objArr4 = this.f79435q0;
        int length = objArr4.length;
        int i11 = this.f79434p0;
        ArraysKt___ArraysJvmKt.copyInto(objArr4, objArr2, length - i11, 0, i11);
        this.f79434p0 = 0;
        this.f79435q0 = objArr2;
    }

    public final int c(int i10) {
        if (i10 == ArraysKt___ArraysKt.getLastIndex(this.f79435q0)) {
            return 0;
        }
        return i10 + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int iD = d(size() + this.f79434p0);
        int i10 = this.f79434p0;
        if (i10 < iD) {
            ArraysKt___ArraysJvmKt.fill(this.f79435q0, (Object) null, i10, iD);
        } else if (!isEmpty()) {
            Object[] objArr = this.f79435q0;
            ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, this.f79434p0, objArr.length);
            ArraysKt___ArraysJvmKt.fill(this.f79435q0, (Object) null, 0, iD);
        }
        this.f79434p0 = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    public final int d(int i10) {
        Object[] objArr = this.f79435q0;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f79435q0[this.f79434p0];
    }

    @Nullable
    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f79435q0[this.f79434p0];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, size());
        return (E) this.f79435q0[d(this.f79434p0 + index)];
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        int i10;
        int iD = d(size() + this.f79434p0);
        int length = this.f79434p0;
        if (length < iD) {
            while (length < iD) {
                if (Intrinsics.areEqual(element, this.f79435q0[length])) {
                    i10 = this.f79434p0;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iD) {
            return -1;
        }
        int length2 = this.f79435q0.length;
        while (length < length2) {
            if (Intrinsics.areEqual(element, this.f79435q0[length])) {
                i10 = this.f79434p0;
            } else {
                length++;
            }
        }
        for (int i11 = 0; i11 < iD; i11++) {
            if (Intrinsics.areEqual(element, this.f79435q0[i11])) {
                length = i11 + this.f79435q0.length;
                i10 = this.f79434p0;
            }
        }
        return -1;
        return length - i10;
    }

    public final void internalStructure$kotlin_stdlib(@NotNull Function2<? super Integer, ? super Object[], Unit> structure) {
        int i10;
        Intrinsics.checkNotNullParameter(structure, "structure");
        structure.invoke(Integer.valueOf((isEmpty() || (i10 = this.f79434p0) < d(size() + this.f79434p0)) ? this.f79434p0 : i10 - this.f79435q0.length), toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f79435q0[d(CollectionsKt__CollectionsKt.getLastIndex(this) + this.f79434p0)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        int lastIndex;
        int i10;
        int iD = d(size() + this.f79434p0);
        int i11 = this.f79434p0;
        if (i11 < iD) {
            lastIndex = iD - 1;
            if (i11 <= lastIndex) {
                while (!Intrinsics.areEqual(element, this.f79435q0[lastIndex])) {
                    if (lastIndex != i11) {
                        lastIndex--;
                    }
                }
                i10 = this.f79434p0;
                return lastIndex - i10;
            }
            return -1;
        }
        if (i11 > iD) {
            for (int i12 = iD - 1; -1 < i12; i12--) {
                if (Intrinsics.areEqual(element, this.f79435q0[i12])) {
                    lastIndex = i12 + this.f79435q0.length;
                    i10 = this.f79434p0;
                    return lastIndex - i10;
                }
            }
            lastIndex = ArraysKt___ArraysKt.getLastIndex(this.f79435q0);
            int i13 = this.f79434p0;
            if (i13 <= lastIndex) {
                while (!Intrinsics.areEqual(element, this.f79435q0[lastIndex])) {
                    if (lastIndex != i13) {
                        lastIndex--;
                    }
                }
                i10 = this.f79434p0;
                return lastIndex - i10;
            }
        }
        return -1;
    }

    @Nullable
    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f79435q0[d(CollectionsKt__CollectionsKt.getLastIndex(this) + this.f79434p0)];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        int iD;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f79435q0.length != 0) {
            int iD2 = d(size() + this.f79434p0);
            int i10 = this.f79434p0;
            if (i10 < iD2) {
                iD = i10;
                while (i10 < iD2) {
                    Object obj = this.f79435q0[i10];
                    if (!elements.contains(obj)) {
                        this.f79435q0[iD] = obj;
                        iD++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                ArraysKt___ArraysJvmKt.fill(this.f79435q0, (Object) null, iD, iD2);
            } else {
                int length = this.f79435q0.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f79435q0;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (!elements.contains(obj2)) {
                        this.f79435q0[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iD = d(i11);
                for (int i12 = 0; i12 < iD2; i12++) {
                    Object[] objArr2 = this.f79435q0;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (!elements.contains(obj3)) {
                        this.f79435q0[iD] = obj3;
                        iD = c(iD);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                int length2 = iD - this.f79434p0;
                if (length2 < 0) {
                    length2 += this.f79435q0.length;
                }
                this.size = length2;
            }
        }
        return z10;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int index) {
        AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, size());
        if (index == CollectionsKt__CollectionsKt.getLastIndex(this)) {
            return removeLast();
        }
        if (index == 0) {
            return removeFirst();
        }
        int iD = d(this.f79434p0 + index);
        E e5 = (E) this.f79435q0[iD];
        if (index < (size() >> 1)) {
            int i10 = this.f79434p0;
            if (iD >= i10) {
                Object[] objArr = this.f79435q0;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i10 + 1, i10, iD);
            } else {
                Object[] objArr2 = this.f79435q0;
                ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, 1, 0, iD);
                Object[] objArr3 = this.f79435q0;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i11 = this.f79434p0;
                ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, i11 + 1, i11, objArr3.length - 1);
            }
            Object[] objArr4 = this.f79435q0;
            int i12 = this.f79434p0;
            objArr4[i12] = null;
            this.f79434p0 = c(i12);
        } else {
            int iD2 = d(CollectionsKt__CollectionsKt.getLastIndex(this) + this.f79434p0);
            if (iD <= iD2) {
                Object[] objArr5 = this.f79435q0;
                ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, iD, iD + 1, iD2 + 1);
            } else {
                Object[] objArr6 = this.f79435q0;
                ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, iD, iD + 1, objArr6.length);
                Object[] objArr7 = this.f79435q0;
                objArr7[objArr7.length - 1] = objArr7[0];
                ArraysKt___ArraysJvmKt.copyInto(objArr7, objArr7, 0, 1, iD2 + 1);
            }
            this.f79435q0[iD2] = null;
        }
        this.size = size() - 1;
        return e5;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f79435q0;
        int i10 = this.f79434p0;
        E e5 = (E) objArr[i10];
        objArr[i10] = null;
        this.f79434p0 = c(i10);
        this.size = size() - 1;
        return e5;
    }

    @Nullable
    public final E removeFirstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iD = d(CollectionsKt__CollectionsKt.getLastIndex(this) + this.f79434p0);
        Object[] objArr = this.f79435q0;
        E e5 = (E) objArr[iD];
        objArr[iD] = null;
        this.size = size() - 1;
        return e5;
    }

    @Nullable
    public final E removeLastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        int iD;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f79435q0.length != 0) {
            int iD2 = d(size() + this.f79434p0);
            int i10 = this.f79434p0;
            if (i10 < iD2) {
                iD = i10;
                while (i10 < iD2) {
                    Object obj = this.f79435q0[i10];
                    if (elements.contains(obj)) {
                        this.f79435q0[iD] = obj;
                        iD++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                ArraysKt___ArraysJvmKt.fill(this.f79435q0, (Object) null, iD, iD2);
            } else {
                int length = this.f79435q0.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f79435q0;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f79435q0[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iD = d(i11);
                for (int i12 = 0; i12 < iD2; i12++) {
                    Object[] objArr2 = this.f79435q0;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f79435q0[iD] = obj3;
                        iD = c(iD);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                int length2 = iD - this.f79434p0;
                if (length2 < 0) {
                    length2 += this.f79435q0.length;
                }
                this.size = length2;
            }
        }
        return z10;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, size());
        int iD = d(this.f79434p0 + index);
        Object[] objArr = this.f79435q0;
        E e5 = (E) objArr[iD];
        objArr[iD] = element;
        return e5;
    }

    @NotNull
    public final <T> T[] testToArray$kotlin_stdlib(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) toArray(array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = (T[]) b.arrayOfNulls(array, size());
        }
        int iD = d(size() + this.f79434p0);
        int i10 = this.f79434p0;
        if (i10 < iD) {
            ArraysKt___ArraysJvmKt.copyInto$default(this.f79435q0, array, 0, i10, iD, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f79435q0;
            ArraysKt___ArraysJvmKt.copyInto(objArr, array, 0, this.f79434p0, objArr.length);
            Object[] objArr2 = this.f79435q0;
            ArraysKt___ArraysJvmKt.copyInto(objArr2, array, objArr2.length - this.f79434p0, 0, iD);
        }
        return (T[]) d.terminateCollectionToArray(size(), array);
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, size());
        if (index == size()) {
            addLast(element);
            return;
        }
        if (index == 0) {
            addFirst(element);
            return;
        }
        b(size() + 1);
        int iD = d(this.f79434p0 + index);
        if (index < ((size() + 1) >> 1)) {
            int lastIndex = iD == 0 ? ArraysKt___ArraysKt.getLastIndex(this.f79435q0) : iD - 1;
            int i10 = this.f79434p0;
            int lastIndex2 = i10 == 0 ? ArraysKt___ArraysKt.getLastIndex(this.f79435q0) : i10 - 1;
            int i11 = this.f79434p0;
            if (lastIndex >= i11) {
                Object[] objArr = this.f79435q0;
                objArr[lastIndex2] = objArr[i11];
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i11, i11 + 1, lastIndex + 1);
            } else {
                Object[] objArr2 = this.f79435q0;
                ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.f79435q0;
                objArr3[objArr3.length - 1] = objArr3[0];
                ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, 0, 1, lastIndex + 1);
            }
            this.f79435q0[lastIndex] = element;
            this.f79434p0 = lastIndex2;
        } else {
            int iD2 = d(size() + this.f79434p0);
            if (iD < iD2) {
                Object[] objArr4 = this.f79435q0;
                ArraysKt___ArraysJvmKt.copyInto(objArr4, objArr4, iD + 1, iD, iD2);
            } else {
                Object[] objArr5 = this.f79435q0;
                ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, 1, 0, iD2);
                Object[] objArr6 = this.f79435q0;
                objArr6[0] = objArr6[objArr6.length - 1];
                ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, iD + 1, iD, objArr6.length - 1);
            }
            this.f79435q0[iD] = element;
        }
        this.size = size() + 1;
    }

    @NotNull
    public final Object[] testToArray$kotlin_stdlib() {
        return toArray();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (index == size()) {
            return addAll(elements);
        }
        b(elements.size() + size());
        int iD = d(size() + this.f79434p0);
        int iD2 = d(this.f79434p0 + index);
        int size = elements.size();
        if (index < ((size() + 1) >> 1)) {
            int i10 = this.f79434p0;
            int length = i10 - size;
            if (iD2 < i10) {
                Object[] objArr = this.f79435q0;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, length, i10, objArr.length);
                if (size >= iD2) {
                    Object[] objArr2 = this.f79435q0;
                    ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, objArr2.length - size, 0, iD2);
                } else {
                    Object[] objArr3 = this.f79435q0;
                    ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f79435q0;
                    ArraysKt___ArraysJvmKt.copyInto(objArr4, objArr4, 0, size, iD2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f79435q0;
                ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, length, i10, iD2);
            } else {
                Object[] objArr6 = this.f79435q0;
                length += objArr6.length;
                int i11 = iD2 - i10;
                int length2 = objArr6.length - length;
                if (length2 >= i11) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, length, i10, iD2);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, length, i10, i10 + length2);
                    Object[] objArr7 = this.f79435q0;
                    ArraysKt___ArraysJvmKt.copyInto(objArr7, objArr7, 0, this.f79434p0 + length2, iD2);
                }
            }
            this.f79434p0 = length;
            int length3 = iD2 - size;
            if (length3 < 0) {
                length3 += this.f79435q0.length;
            }
            a(length3, elements);
        } else {
            int i12 = iD2 + size;
            if (iD2 < iD) {
                int i13 = size + iD;
                Object[] objArr8 = this.f79435q0;
                if (i13 <= objArr8.length) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr8, objArr8, i12, iD2, iD);
                } else if (i12 >= objArr8.length) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr8, objArr8, i12 - objArr8.length, iD2, iD);
                } else {
                    int length4 = iD - (i13 - objArr8.length);
                    ArraysKt___ArraysJvmKt.copyInto(objArr8, objArr8, 0, length4, iD);
                    Object[] objArr9 = this.f79435q0;
                    ArraysKt___ArraysJvmKt.copyInto(objArr9, objArr9, i12, iD2, length4);
                }
            } else {
                Object[] objArr10 = this.f79435q0;
                ArraysKt___ArraysJvmKt.copyInto(objArr10, objArr10, size, 0, iD);
                Object[] objArr11 = this.f79435q0;
                if (i12 >= objArr11.length) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr11, objArr11, i12 - objArr11.length, iD2, objArr11.length);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f79435q0;
                    ArraysKt___ArraysJvmKt.copyInto(objArr12, objArr12, i12, iD2, objArr12.length - size);
                }
            }
            a(iD2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public ArrayDeque() {
        this.f79435q0 = f79433s0;
    }

    public ArrayDeque(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        this.f79435q0 = array;
        this.size = array.length;
        if (array.length == 0) {
            this.f79435q0 = f79433s0;
        }
    }
}
