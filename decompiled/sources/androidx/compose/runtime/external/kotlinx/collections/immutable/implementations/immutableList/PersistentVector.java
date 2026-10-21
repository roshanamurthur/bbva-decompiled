package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PersistentVector.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010*\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b\u0012\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\u0013\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\""}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", ExifInterface.LONGITUDE_EAST, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "element", "add", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "", FirebaseAnalytics.Param.INDEX, "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "removeAt", "Lkotlin/Function1;", "", "predicate", "removeAll", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "builder", "", "listIterator", "get", "(I)Ljava/lang/Object;", SetCommand.ID, "r0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSize", "()I", "size", "", "", "root", "tail", "rootShift", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;II)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,328:1\n33#2,7:329\n1#3:336\n*S KotlinDebug\n*F\n+ 1 PersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector\n*L\n30#1:329,7\n*E\n"})
public final class PersistentVector<E> extends AbstractPersistentList<E> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Object[] f14900p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Object[] f14901q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public final int size;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f14903s0;

    public PersistentVector(@NotNull Object[] objArr, @NotNull Object[] objArr2, int i10, int i11) {
        this.f14900p0 = objArr;
        this.f14901q0 = objArr2;
        this.size = i10;
        this.f14903s0 = i11;
        if (!(size() > 32)) {
            PreconditionsKt.throwIllegalArgumentException("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        CommonFunctionsKt.m2164assert(size() - UtilsKt.rootSize(size()) <= c.coerceAtMost(objArr2.length, 32));
    }

    public static Object[] a(Object[] objArr, int i10, int i11, Object obj, ObjectRef objectRef) {
        Object[] objArrCopyOf;
        int iIndexSegment = UtilsKt.indexSegment(i11, i10);
        if (i10 == 0) {
            if (iIndexSegment == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            }
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArrCopyOf, iIndexSegment + 1, iIndexSegment, 31);
            objectRef.setValue(objArr[31]);
            objArrCopyOf[iIndexSegment] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(this, newSize)");
        int i12 = i10 - 5;
        Object obj2 = objArr[iIndexSegment];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iIndexSegment] = a((Object[]) obj2, i12, i11, obj, objectRef);
        while (true) {
            iIndexSegment++;
            if (iIndexSegment >= 32 || objArrCopyOf2[iIndexSegment] == null) {
                break;
            }
            Object obj3 = objArr[iIndexSegment];
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iIndexSegment] = a((Object[]) obj3, i12, 0, objectRef.getValue(), objectRef);
        }
        return objArrCopyOf2;
    }

    public static Object[] c(Object[] objArr, int i10, int i11, ObjectRef objectRef) {
        Object[] objArrC;
        int iIndexSegment = UtilsKt.indexSegment(i11, i10);
        if (i10 == 5) {
            objectRef.setValue(objArr[iIndexSegment]);
            objArrC = null;
        } else {
            Object obj = objArr[iIndexSegment];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrC = c((Object[]) obj, i10 - 5, i11, objectRef);
        }
        if (objArrC == null && iIndexSegment == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[iIndexSegment] = objArrC;
        return objArrCopyOf;
    }

    public static Object[] i(Object obj, int i10, Object[] objArr, int i11) {
        int iIndexSegment = UtilsKt.indexSegment(i11, i10);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        if (i10 == 0) {
            objArrCopyOf[iIndexSegment] = obj;
        } else {
            Object obj2 = objArrCopyOf[iIndexSegment];
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf[iIndexSegment] = i(obj, i10 - 5, (Object[]) obj2, i11);
        }
        return objArrCopyOf;
    }

    public final PersistentVector<E> b(Object[] objArr, int i10, Object obj) {
        int size = size() - h();
        Object[] objArr2 = this.f14901q0;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        if (size < 32) {
            ArraysKt___ArraysJvmKt.copyInto(objArr2, objArrCopyOf, i10 + 1, i10, size);
            objArrCopyOf[i10] = obj;
            return new PersistentVector<>(objArr, objArrCopyOf, size() + 1, this.f14903s0);
        }
        Object obj2 = objArr2[31];
        ArraysKt___ArraysJvmKt.copyInto(objArr2, objArrCopyOf, i10 + 1, i10, size - 1);
        objArrCopyOf[i10] = obj;
        return d(objArr, objArrCopyOf, UtilsKt.presizedBufferWith(obj2));
    }

    public final PersistentVector<E> d(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f14903s0;
        if (size <= (1 << i10)) {
            return new PersistentVector<>(e(i10, objArr, objArr2), objArr3, size() + 1, i10);
        }
        int i11 = i10 + 5;
        return new PersistentVector<>(e(i11, UtilsKt.presizedBufferWith(objArr), objArr2), objArr3, size() + 1, i11);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    public final Object[] e(int i10, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iIndexSegment = UtilsKt.indexSegment(size() - 1, i10);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            if (objArrCopyOf == null) {
                objArrCopyOf = new Object[32];
            }
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i10 == 5) {
            objArrCopyOf[iIndexSegment] = objArr2;
        } else {
            objArrCopyOf[iIndexSegment] = e(i10 - 5, (Object[]) objArrCopyOf[iIndexSegment], objArr2);
        }
        return objArrCopyOf;
    }

    public final Object[] f(Object[] objArr, int i10, int i11, ObjectRef objectRef) {
        Object[] objArrCopyOf;
        int iIndexSegment = UtilsKt.indexSegment(i11, i10);
        if (i10 == 0) {
            if (iIndexSegment == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            }
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArrCopyOf, iIndexSegment, iIndexSegment + 1, 32);
            objArrCopyOf[31] = objectRef.getValue();
            objectRef.setValue(objArr[iIndexSegment]);
            return objArrCopyOf;
        }
        int iIndexSegment2 = objArr[31] == null ? UtilsKt.indexSegment(h() - 1, i10) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(this, newSize)");
        int i12 = i10 - 5;
        int i13 = iIndexSegment + 1;
        if (i13 <= iIndexSegment2) {
            while (true) {
                Object obj = objArrCopyOf2[iIndexSegment2];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iIndexSegment2] = f((Object[]) obj, i12, 0, objectRef);
                if (iIndexSegment2 == i13) {
                    break;
                }
                iIndexSegment2--;
            }
        }
        Object obj2 = objArrCopyOf2[iIndexSegment];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iIndexSegment] = f((Object[]) obj2, i12, i11, objectRef);
        return objArrCopyOf2;
    }

    public final AbstractPersistentList g(int i10, int i11, int i12, Object[] objArr) {
        PersistentVector persistentVector;
        int size = size() - i10;
        CommonFunctionsKt.m2164assert(i12 < size);
        if (size != 1) {
            Object[] objArr2 = this.f14901q0;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            int i13 = size - 1;
            if (i12 < i13) {
                ArraysKt___ArraysJvmKt.copyInto(objArr2, objArrCopyOf, i12, i12 + 1, size);
            }
            objArrCopyOf[i13] = null;
            return new PersistentVector(objArr, objArrCopyOf, (i10 + size) - 1, i11);
        }
        if (i11 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, newSize)");
            }
            return new SmallPersistentVector(objArr);
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArrC = c(objArr, i11, i10 - 1, objectRef);
        Intrinsics.checkNotNull(objArrC);
        Object value = objectRef.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) value;
        if (objArrC[1] == null) {
            Object obj = objArrC[0];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            persistentVector = new PersistentVector((Object[]) obj, objArr3, i10, i11 - 5);
        } else {
            persistentVector = new PersistentVector(objArrC, objArr3, i10, i11);
        }
        return persistentVector;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public E get(int index) {
        Object[] objArr;
        ListImplementation.checkElementIndex$runtime_release(index, size());
        if (h() <= index) {
            objArr = this.f14901q0;
        } else {
            objArr = this.f14900p0;
            for (int i10 = this.f14903s0; i10 > 0; i10 -= 5) {
                Object obj = objArr[UtilsKt.indexSegment(index, i10)];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[index & 31];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.size;
    }

    public final int h() {
        return UtilsKt.rootSize(size());
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int index) {
        ListImplementation.checkPositionIndex$runtime_release(index, size());
        return new PersistentVectorIterator(this.f14900p0, this.f14901q0, index, size(), (this.f14903s0 / 5) + 1);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList<E> removeAt(int index) {
        ListImplementation.checkElementIndex$runtime_release(index, size());
        int iH = h();
        Object[] objArr = this.f14900p0;
        int i10 = this.f14903s0;
        return index >= iH ? g(iH, i10, index - iH, objArr) : g(iH, i10, 0, f(objArr, i10, index, new ObjectRef(this.f14901q0[0])));
    }

    @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList<E> set(int index, E element) {
        ListImplementation.checkElementIndex$runtime_release(index, size());
        int iH = h();
        Object[] objArr = this.f14900p0;
        Object[] objArr2 = this.f14901q0;
        int i10 = this.f14903s0;
        if (iH > index) {
            return new PersistentVector(i(element, i10, objArr, index), objArr2, size(), i10);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[index & 31] = element;
        return new PersistentVector(objArr, objArrCopyOf, size(), i10);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentList<E> add(E element) {
        int size = size() - h();
        Object[] objArr = this.f14900p0;
        Object[] objArr2 = this.f14901q0;
        if (size >= 32) {
            return d(objArr, objArr2, UtilsKt.presizedBufferWith(element));
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size] = element;
        return new PersistentVector(objArr, objArrCopyOf, size() + 1, this.f14903s0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentList<E> removeAll(@NotNull Function1<? super E, Boolean> predicate) {
        PersistentVectorBuilder<E> persistentVectorBuilderBuilder = builder();
        persistentVectorBuilderBuilder.removeAllWithPredicate(predicate);
        return persistentVectorBuilderBuilder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentVectorBuilder<E> builder() {
        return new PersistentVectorBuilder<>(this, this.f14900p0, this.f14901q0, this.f14903s0);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList<E> add(int index, E element) {
        ListImplementation.checkPositionIndex$runtime_release(index, size());
        if (index == size()) {
            return add((Object) element);
        }
        int iH = h();
        Object[] objArr = this.f14900p0;
        if (index >= iH) {
            return b(objArr, index - iH, element);
        }
        ObjectRef objectRef = new ObjectRef(null);
        return b(a(objArr, this.f14903s0, index, element, objectRef), 0, objectRef.getValue());
    }
}
