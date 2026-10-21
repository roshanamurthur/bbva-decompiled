package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PersistentVectorBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B?\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0010\u00106\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010(\u0018\u00010'\u0012\u000e\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'\u0012\u0006\u0010&\u001a\u00020\u0004¢\u0006\u0004\b8\u00109J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016J\u001f\u0010\f\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\u0013J\u001e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016J\u0018\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0016\u0010\u0017\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016J\u001a\u0010\u001a\u001a\u00020\u000b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0018J \u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0096\u0002J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016R\"\u0010&\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010%R8\u0010.\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010(\u0018\u00010'2\u0010\u0010)\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010(\u0018\u00010'8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R4\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'2\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010-R$\u00104\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b3\u0010\u0006¨\u0006:"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", ExifInterface.LONGITUDE_EAST, "Lkotlin/collections/AbstractMutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "", "getModCount$runtime_release", "()I", "getModCount", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "element", "", "add", "(Ljava/lang/Object;)Z", "", "elements", "addAll", FirebaseAnalytics.Param.INDEX, "", "(ILjava/lang/Object;)V", "get", "(I)Ljava/lang/Object;", "removeAt", "removeAll", "Lkotlin/Function1;", "predicate", "removeAllWithPredicate", SetCommand.ID, "(ILjava/lang/Object;)Ljava/lang/Object;", "", "iterator", "", "listIterator", "s0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getRootShift$runtime_release", "setRootShift$runtime_release", "(I)V", "rootShift", "", "", "<set-?>", "u0", "[Ljava/lang/Object;", "getRoot$runtime_release", "()[Ljava/lang/Object;", "root", "v0", "getTail$runtime_release", "tail", "w0", "getSize", "size", "vector", "vectorRoot", "vectorTail", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPersistentVectorBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,995:1\n33#2,7:996\n33#2,7:1003\n33#2,7:1011\n33#2,7:1019\n33#2,7:1026\n1#3:1010\n26#4:1018\n*S KotlinDebug\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n*L\n242#1:996,7\n243#1:1003,7\n480#1:1011,7\n746#1:1019,7\n769#1:1026,7\n623#1:1018\n*E\n"})
public final class PersistentVectorBuilder<E> extends AbstractMutableList<E> implements PersistentList.Builder<E> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public PersistentList<? extends E> f14904p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public Object[] f14905q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public Object[] f14906r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public int rootShift;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public MutabilityOwnership f14908t0 = new MutabilityOwnership();

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Object[] root;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public Object[] tail;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: compiled from: PersistentVectorBuilder.kt */
    public static final class a extends Lambda implements Function1<E, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Collection<E> f14911p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Collection<? extends E> collection) {
            super(1);
            this.f14911p0 = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.f14911p0.contains(obj));
        }
    }

    public PersistentVectorBuilder(@NotNull PersistentList<? extends E> persistentList, @Nullable Object[] objArr, @NotNull Object[] objArr2, int i10) {
        this.f14904p0 = persistentList;
        this.f14905q0 = objArr;
        this.f14906r0 = objArr2;
        this.rootShift = i10;
        this.root = this.f14905q0;
        this.tail = this.f14906r0;
        this.size = this.f14904p0.size();
    }

    public static void a(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        ((AbstractList) this).modCount++;
        int iZ = z();
        if (iZ < 32) {
            Object[] objArrG = g(this.tail);
            objArrG[iZ] = element;
            this.tail = objArrG;
            this.size = size() + 1;
        } else {
            p(this.root, this.tail, j(element));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iZ = z();
        Iterator<? extends E> it = elements.iterator();
        if (32 - iZ >= elements.size()) {
            Object[] objArrG = g(this.tail);
            a(objArrG, iZ, it);
            this.tail = objArrG;
            this.size = elements.size() + size();
        } else {
            int size = ((elements.size() + iZ) - 1) / 32;
            Object[][] objArr = new Object[size][];
            Object[] objArrG2 = g(this.tail);
            a(objArrG2, iZ, it);
            objArr[0] = objArrG2;
            for (int i10 = 1; i10 < size; i10++) {
                Object[] objArrI = i();
                a(objArrI, 0, it);
                objArr[i10] = objArrI;
            }
            this.root = o(this.root, w(), objArr);
            Object[] objArrI2 = i();
            a(objArrI2, 0, it);
            this.tail = objArrI2;
            this.size = elements.size() + size();
        }
        return true;
    }

    public final void b(Collection<? extends E> collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.root == null) {
            throw new IllegalStateException("root is null".toString());
        }
        int i13 = i10 >> 5;
        AbstractListIterator abstractListIteratorF = f(w() >> 5);
        int i14 = i12;
        Object[] objArrH = objArr2;
        while (abstractListIteratorF.previousIndex() != i13) {
            Object[] objArr3 = (Object[]) abstractListIteratorF.previous();
            ArraysKt___ArraysJvmKt.copyInto(objArr3, objArrH, 0, 32 - i11, 32);
            objArrH = h(objArr3, i11);
            i14--;
            objArr[i14] = objArrH;
        }
        Object[] objArr4 = (Object[]) abstractListIteratorF.previous();
        int iW = i12 - (((w() >> 5) - 1) - i13);
        if (iW < i12) {
            objArr2 = objArr[iW];
            Intrinsics.checkNotNull(objArr2);
        }
        y(collection, i10, objArr4, 32, objArr, iW, objArr2);
    }

    public final Object[] c(Object[] objArr, int i10, int i11, Object obj, ObjectRef objectRef) {
        Object obj2;
        int iIndexSegment = UtilsKt.indexSegment(i11, i10);
        if (i10 == 0) {
            objectRef.setValue(objArr[31]);
            Object[] objArrCopyInto = ArraysKt___ArraysJvmKt.copyInto(objArr, g(objArr), iIndexSegment + 1, iIndexSegment, 31);
            objArrCopyInto[iIndexSegment] = obj;
            return objArrCopyInto;
        }
        Object[] objArrG = g(objArr);
        int i12 = i10 - 5;
        Object obj3 = objArrG[iIndexSegment];
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrG[iIndexSegment] = c((Object[]) obj3, i12, i11, obj, objectRef);
        while (true) {
            iIndexSegment++;
            if (iIndexSegment >= 32 || (obj2 = objArrG[iIndexSegment]) == null) {
                break;
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrG[iIndexSegment] = c((Object[]) obj2, i12, 0, objectRef.getValue(), objectRef);
        }
        return objArrG;
    }

    public final void d(Object[] objArr, int i10, E e5) {
        int iZ = z();
        Object[] objArrG = g(this.tail);
        if (iZ < 32) {
            ArraysKt___ArraysJvmKt.copyInto(this.tail, objArrG, i10 + 1, i10, iZ);
            objArrG[i10] = e5;
            this.root = objArr;
            this.tail = objArrG;
            this.size = size() + 1;
            return;
        }
        Object[] objArr2 = this.tail;
        Object obj = objArr2[31];
        ArraysKt___ArraysJvmKt.copyInto(objArr2, objArrG, i10 + 1, i10, 31);
        objArrG[i10] = e5;
        p(objArr, objArrG, j(obj));
    }

    public final boolean e(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f14908t0;
    }

    public final AbstractListIterator f(int i10) {
        Object[] objArr = this.root;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root".toString());
        }
        int iW = w() >> 5;
        ListImplementation.checkPositionIndex$runtime_release(i10, iW);
        int i11 = this.rootShift;
        return i11 == 0 ? new SingleElementListIterator(objArr, i10) : new TrieIterator(objArr, i10, iW, i11 / 5);
    }

    public final Object[] g(Object[] objArr) {
        if (objArr == null) {
            return i();
        }
        return e(objArr) ? objArr : ArraysKt___ArraysJvmKt.copyInto$default(objArr, i(), 0, 0, c.coerceAtMost(objArr.length, 32), 6, (Object) null);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        Object[] objArr;
        ListImplementation.checkElementIndex$runtime_release(index, size());
        if (w() <= index) {
            objArr = this.tail;
        } else {
            objArr = this.root;
            Intrinsics.checkNotNull(objArr);
            for (int i10 = this.rootShift; i10 > 0; i10 -= 5) {
                Object obj = objArr[UtilsKt.indexSegment(index, i10)];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[index & 31];
    }

    public final int getModCount$runtime_release() {
        return ((AbstractList) this).modCount;
    }

    @Nullable
    /* JADX INFO: renamed from: getRoot$runtime_release, reason: from getter */
    public final Object[] getRoot() {
        return this.root;
    }

    /* JADX INFO: renamed from: getRootShift$runtime_release, reason: from getter */
    public final int getRootShift() {
        return this.rootShift;
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: getTail$runtime_release, reason: from getter */
    public final Object[] getTail() {
        return this.tail;
    }

    public final Object[] h(Object[] objArr, int i10) {
        return e(objArr) ? ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i10, 0, 32 - i10) : ArraysKt___ArraysJvmKt.copyInto(objArr, i(), i10, 0, 32 - i10);
    }

    public final Object[] i() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f14908t0;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return listIterator();
    }

    public final Object[] j(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f14908t0;
        return objArr;
    }

    public final Object[] k(int i10, int i11, Object[] objArr) {
        if (!(i11 >= 0)) {
            PreconditionsKt.throwIllegalArgumentException("shift should be positive");
        }
        if (i11 == 0) {
            return objArr;
        }
        int iIndexSegment = UtilsKt.indexSegment(i10, i11);
        Object obj = objArr[iIndexSegment];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objK = k(i10, i11 - 5, (Object[]) obj);
        if (iIndexSegment < 31) {
            int i12 = iIndexSegment + 1;
            if (objArr[i12] != null) {
                if (e(objArr)) {
                    ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, i12, 32);
                }
                objArr = ArraysKt___ArraysJvmKt.copyInto(objArr, i(), 0, 0, i12);
            }
        }
        if (objK == objArr[iIndexSegment]) {
            return objArr;
        }
        Object[] objArrG = g(objArr);
        objArrG[iIndexSegment] = objK;
        return objArrG;
    }

    public final Object[] l(Object[] objArr, int i10, int i11, ObjectRef objectRef) {
        Object[] objArrL;
        int iIndexSegment = UtilsKt.indexSegment(i11 - 1, i10);
        if (i10 == 5) {
            objectRef.setValue(objArr[iIndexSegment]);
            objArrL = null;
        } else {
            Object obj = objArr[iIndexSegment];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrL = l((Object[]) obj, i10 - 5, i11, objectRef);
        }
        if (objArrL == null && iIndexSegment == 0) {
            return null;
        }
        Object[] objArrG = g(objArr);
        objArrG[iIndexSegment] = objArrL;
        return objArrG;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public final void m(int i10, int i11, Object[] objArr) {
        if (i11 == 0) {
            this.root = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.tail = objArr;
            this.size = i10;
            this.rootShift = i11;
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Intrinsics.checkNotNull(objArr);
        Object[] objArrL = l(objArr, i11, i10, objectRef);
        Intrinsics.checkNotNull(objArrL);
        Object value = objectRef.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.tail = (Object[]) value;
        this.size = i10;
        if (objArrL[1] == null) {
            this.root = (Object[]) objArrL[0];
            this.rootShift = i11 - 5;
        } else {
            this.root = objArrL;
            this.rootShift = i11;
        }
    }

    public final Object[] n(Object[] objArr, int i10, int i11, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            PreconditionsKt.throwIllegalArgumentException("invalid buffersIterator");
        }
        if (!(i11 >= 0)) {
            PreconditionsKt.throwIllegalArgumentException("negative shift");
        }
        if (i11 == 0) {
            return it.next();
        }
        Object[] objArrG = g(objArr);
        int iIndexSegment = UtilsKt.indexSegment(i10, i11);
        int i12 = i11 - 5;
        objArrG[iIndexSegment] = n((Object[]) objArrG[iIndexSegment], i10, i12, it);
        while (true) {
            iIndexSegment++;
            if (iIndexSegment >= 32 || !it.hasNext()) {
                break;
            }
            objArrG[iIndexSegment] = n((Object[]) objArrG[iIndexSegment], 0, i12, it);
        }
        return objArrG;
    }

    public final Object[] o(Object[] objArr, int i10, Object[][] objArr2) {
        Iterator<Object[]> it = ArrayIteratorKt.iterator(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.rootShift;
        Object[] objArrN = i11 < (1 << i12) ? n(objArr, i10, i12, it) : g(objArr);
        while (it.hasNext()) {
            this.rootShift += 5;
            objArrN = j(objArrN);
            int i13 = this.rootShift;
            n(objArrN, 1 << i13, i13, it);
        }
        return objArrN;
    }

    public final void p(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.rootShift;
        if (size > (1 << i10)) {
            this.root = q(this.rootShift + 5, j(objArr), objArr2);
            this.tail = objArr3;
            this.rootShift += 5;
            this.size = size() + 1;
            return;
        }
        if (objArr == null) {
            this.root = objArr2;
            this.tail = objArr3;
            this.size = size() + 1;
        } else {
            this.root = q(i10, objArr, objArr2);
            this.tail = objArr3;
            this.size = size() + 1;
        }
    }

    public final Object[] q(int i10, Object[] objArr, Object[] objArr2) {
        int iIndexSegment = UtilsKt.indexSegment(size() - 1, i10);
        Object[] objArrG = g(objArr);
        if (i10 == 5) {
            objArrG[iIndexSegment] = objArr2;
        } else {
            objArrG[iIndexSegment] = q(i10 - 5, (Object[]) objArrG[iIndexSegment], objArr2);
        }
        return objArrG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int r(Function1 function1, Object[] objArr, int i10, int i11, ObjectRef objectRef, ArrayList arrayList, ArrayList arrayList2) {
        if (e(objArr)) {
            arrayList.add(objArr);
        }
        Object value = objectRef.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) value;
        Object[] objArrI = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                if (i11 == 32) {
                    objArrI = arrayList.isEmpty() ^ true ? (Object[]) arrayList.remove(arrayList.size() - 1) : i();
                    i11 = 0;
                }
                objArrI[i11] = obj;
                i11++;
            }
        }
        objectRef.setValue(objArrI);
        if (objArr2 != objectRef.getValue()) {
            arrayList2.add(objArr2);
        }
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        return removeAllWithPredicate(new a(elements));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    public final boolean removeAllWithPredicate(@NotNull Function1<? super E, Boolean> predicate) {
        Object[] objArrN;
        int i10;
        int iZ = z();
        Object[] objArrK = null;
        ObjectRef objectRef = new ObjectRef(null);
        boolean z10 = false;
        if (this.root != null) {
            AbstractListIterator abstractListIteratorF = f(0);
            int i11 = 32;
            int iS = 32;
            while (iS == 32 && abstractListIteratorF.hasNext()) {
                iS = s(predicate, (Object[]) abstractListIteratorF.next(), 32, objectRef);
            }
            if (iS == 32) {
                CommonFunctionsKt.m2164assert(!abstractListIteratorF.hasNext());
                int iT = t(predicate, iZ, objectRef);
                if (iT == 0) {
                    m(size(), this.rootShift, this.root);
                }
                if (iT != iZ) {
                    z10 = true;
                }
            } else {
                int iPreviousIndex = abstractListIteratorF.previousIndex() << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iR = iS;
                while (abstractListIteratorF.hasNext()) {
                    iR = r(predicate, (Object[]) abstractListIteratorF.next(), 32, iR, objectRef, arrayList2, arrayList);
                    iPreviousIndex = iPreviousIndex;
                    i11 = i11;
                }
                int i12 = iPreviousIndex;
                int iR2 = r(predicate, this.tail, iZ, iR, objectRef, arrayList2, arrayList);
                Object value = objectRef.getValue();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) value;
                ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, iR2, i11);
                if (arrayList.isEmpty()) {
                    objArrN = this.root;
                    Intrinsics.checkNotNull(objArrN);
                } else {
                    objArrN = n(this.root, i12, this.rootShift, arrayList.iterator());
                }
                int size = i12 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    PreconditionsKt.throwIllegalArgumentException("invalid size");
                }
                if (size == 0) {
                    this.rootShift = 0;
                } else {
                    int i13 = size - 1;
                    while (true) {
                        i10 = this.rootShift;
                        if ((i13 >> i10) != 0) {
                            break;
                        }
                        this.rootShift = i10 - 5;
                        Object[] objArr2 = objArrN[0];
                        Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrN = objArr2;
                    }
                    objArrK = k(i13, i10, objArrN);
                }
                this.root = objArrK;
                this.tail = objArr;
                this.size = size + iR2;
                z10 = true;
            }
        } else if (t(predicate, iZ, objectRef) != iZ) {
            z10 = true;
        }
        if (z10) {
            ((AbstractList) this).modCount++;
        }
        return z10;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int index) {
        ListImplementation.checkElementIndex$runtime_release(index, size());
        ((AbstractList) this).modCount++;
        int iW = w();
        if (index >= iW) {
            return (E) v(iW, this.rootShift, index - iW, this.root);
        }
        ObjectRef objectRef = new ObjectRef(this.tail[0]);
        Object[] objArr = this.root;
        Intrinsics.checkNotNull(objArr);
        v(iW, this.rootShift, 0, u(objArr, this.rootShift, index, objectRef));
        return (E) objectRef.getValue();
    }

    public final int s(Function1<? super E, Boolean> function1, Object[] objArr, int i10, ObjectRef objectRef) {
        Object[] objArrG = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (function1.invoke(obj).booleanValue()) {
                if (!z10) {
                    objArrG = g(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArrG[i11] = obj;
                i11++;
            }
        }
        objectRef.setValue(objArrG);
        return i11;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        ListImplementation.checkElementIndex$runtime_release(index, size());
        if (w() > index) {
            ObjectRef objectRef = new ObjectRef(null);
            Object[] objArr = this.root;
            Intrinsics.checkNotNull(objArr);
            this.root = x(objArr, this.rootShift, index, element, objectRef);
            return (E) objectRef.getValue();
        }
        Object[] objArrG = g(this.tail);
        if (objArrG != this.tail) {
            ((AbstractList) this).modCount++;
        }
        int i10 = index & 31;
        E e5 = (E) objArrG[i10];
        objArrG[i10] = element;
        this.tail = objArrG;
        return e5;
    }

    public final void setRootShift$runtime_release(int i10) {
        this.rootShift = i10;
    }

    public final int t(Function1<? super E, Boolean> function1, int i10, ObjectRef objectRef) {
        int iS = s(function1, this.tail, i10, objectRef);
        if (iS == i10) {
            CommonFunctionsKt.m2164assert(objectRef.getValue() == this.tail);
            return i10;
        }
        Object value = objectRef.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, iS, i10);
        this.tail = objArr;
        this.size = size() - (i10 - iS);
        return iS;
    }

    public final Object[] u(Object[] objArr, int i10, int i11, ObjectRef objectRef) {
        int iIndexSegment = UtilsKt.indexSegment(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[iIndexSegment];
            Object[] objArrCopyInto = ArraysKt___ArraysJvmKt.copyInto(objArr, g(objArr), iIndexSegment, iIndexSegment + 1, 32);
            objArrCopyInto[31] = objectRef.getValue();
            objectRef.setValue(obj);
            return objArrCopyInto;
        }
        int iIndexSegment2 = objArr[31] == null ? UtilsKt.indexSegment(w() - 1, i10) : 31;
        Object[] objArrG = g(objArr);
        int i12 = i10 - 5;
        int i13 = iIndexSegment + 1;
        if (i13 <= iIndexSegment2) {
            while (true) {
                Object obj2 = objArrG[iIndexSegment2];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrG[iIndexSegment2] = u((Object[]) obj2, i12, 0, objectRef);
                if (iIndexSegment2 == i13) {
                    break;
                }
                iIndexSegment2--;
            }
        }
        Object obj3 = objArrG[iIndexSegment];
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrG[iIndexSegment] = u((Object[]) obj3, i12, i11, objectRef);
        return objArrG;
    }

    public final Object v(int i10, int i11, int i12, Object[] objArr) {
        int size = size() - i10;
        CommonFunctionsKt.m2164assert(i12 < size);
        if (size == 1) {
            Object obj = this.tail[0];
            m(i10, i11, objArr);
            return obj;
        }
        Object[] objArr2 = this.tail;
        Object obj2 = objArr2[i12];
        Object[] objArrCopyInto = ArraysKt___ArraysJvmKt.copyInto(objArr2, g(objArr2), i12, i12 + 1, size);
        objArrCopyInto[size - 1] = null;
        this.root = objArr;
        this.tail = objArrCopyInto;
        this.size = (i10 + size) - 1;
        this.rootShift = i11;
        return obj2;
    }

    public final int w() {
        if (size() <= 32) {
            return 0;
        }
        return UtilsKt.rootSize(size());
    }

    public final Object[] x(Object[] objArr, int i10, int i11, E e5, ObjectRef objectRef) {
        int iIndexSegment = UtilsKt.indexSegment(i11, i10);
        Object[] objArrG = g(objArr);
        if (i10 != 0) {
            Object obj = objArrG[iIndexSegment];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrG[iIndexSegment] = x((Object[]) obj, i10 - 5, i11, e5, objectRef);
            return objArrG;
        }
        if (objArrG != objArr) {
            ((AbstractList) this).modCount++;
        }
        objectRef.setValue(objArrG[iIndexSegment]);
        objArrG[iIndexSegment] = e5;
        return objArrG;
    }

    public final void y(Collection<? extends E> collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrI;
        if (i12 < 1) {
            PreconditionsKt.throwIllegalArgumentException("requires at least one nullBuffer");
        }
        Object[] objArrG = g(objArr);
        objArr2[0] = objArrG;
        int i13 = i10 & 31;
        int size = ((collection.size() + i10) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            ArraysKt___ArraysJvmKt.copyInto(objArrG, objArr3, size + 1, i13, i11);
        } else {
            int i15 = i14 - 31;
            if (i12 == 1) {
                objArrI = objArrG;
            } else {
                objArrI = i();
                i12--;
                objArr2[i12] = objArrI;
            }
            int i16 = i11 - i15;
            ArraysKt___ArraysJvmKt.copyInto(objArrG, objArr3, 0, i16, i11);
            ArraysKt___ArraysJvmKt.copyInto(objArrG, objArrI, size + 1, i13, i16);
            objArr3 = objArrI;
        }
        Iterator<? extends E> it = collection.iterator();
        a(objArrG, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            Object[] objArrI2 = i();
            a(objArrI2, 0, it);
            objArr2[i17] = objArrI2;
        }
        a(objArr3, 0, it);
    }

    public final int z() {
        int size = size();
        return size <= 32 ? size : size - UtilsKt.rootSize(size);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    @NotNull
    public PersistentList<E> build() {
        PersistentVector persistentVector;
        if (this.root == this.f14905q0 && this.tail == this.f14906r0) {
            persistentVector = this.f14904p0;
        } else {
            this.f14908t0 = new MutabilityOwnership();
            Object[] objArr = this.root;
            this.f14905q0 = objArr;
            Object[] objArr2 = this.tail;
            this.f14906r0 = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.root;
                Intrinsics.checkNotNull(objArr3);
                persistentVector = new PersistentVector(objArr3, this.tail, size(), this.rootShift);
            } else if (objArr2.length == 0) {
                persistentVector = UtilsKt.persistentVectorOf();
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.tail, size());
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                persistentVector = new SmallPersistentVector(objArrCopyOf);
            }
        }
        this.f14904p0 = persistentVector;
        return (PersistentList<E>) persistentVector;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int index) {
        ListImplementation.checkPositionIndex$runtime_release(index, size());
        return new PersistentVectorMutableIterator(this, index);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        ListImplementation.checkPositionIndex$runtime_release(index, size());
        if (index == size()) {
            add(element);
            return;
        }
        ((AbstractList) this).modCount++;
        int iW = w();
        if (index >= iW) {
            d(this.root, index - iW, element);
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.root;
        Intrinsics.checkNotNull(objArr);
        d(c(objArr, this.rootShift, index, element, objectRef), 0, objectRef.getValue());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, @NotNull Collection<? extends E> elements) {
        Object[] objArrCopyInto;
        ListImplementation.checkPositionIndex$runtime_release(index, size());
        if (index == size()) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i10 = (index >> 5) << 5;
        int size = ((elements.size() + (size() - i10)) - 1) / 32;
        if (size == 0) {
            CommonFunctionsKt.m2164assert(index >= w());
            int i11 = index & 31;
            int size2 = ((elements.size() + index) - 1) & 31;
            Object[] objArr = this.tail;
            Object[] objArrCopyInto2 = ArraysKt___ArraysJvmKt.copyInto(objArr, g(objArr), size2 + 1, i11, z());
            a(objArrCopyInto2, i11, elements.iterator());
            this.tail = objArrCopyInto2;
            this.size = elements.size() + size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iZ = z();
        int size3 = elements.size() + size();
        if (size3 > 32) {
            size3 -= UtilsKt.rootSize(size3);
        }
        if (index >= w()) {
            objArrCopyInto = i();
            y(elements, index, this.tail, iZ, objArr2, size, objArrCopyInto);
        } else if (size3 > iZ) {
            int i12 = size3 - iZ;
            objArrCopyInto = h(this.tail, i12);
            b(elements, index, i12, objArr2, size, objArrCopyInto);
        } else {
            int i13 = iZ - size3;
            objArrCopyInto = ArraysKt___ArraysJvmKt.copyInto(this.tail, i(), 0, i13, iZ);
            int i14 = 32 - i13;
            Object[] objArrH = h(this.tail, i14);
            int i15 = size - 1;
            objArr2[i15] = objArrH;
            b(elements, index, i14, objArr2, i15, objArrH);
        }
        this.root = o(this.root, i10, objArr2);
        this.tail = objArrCopyInto;
        this.size = elements.size() + size();
        return true;
    }
}
