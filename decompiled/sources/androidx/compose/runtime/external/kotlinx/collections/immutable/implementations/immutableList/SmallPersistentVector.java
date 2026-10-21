package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SmallPersistentVector.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010*\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000 &*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001&B\u0017\u0012\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!¢\u0006\u0004\b$\u0010%J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000bH\u0016J$\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u0012R\u0014\u0010 \u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006'"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", ExifInterface.LONGITUDE_EAST, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "element", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "add", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "", "elements", "addAll", "Lkotlin/Function1;", "", "predicate", "removeAll", "", FirebaseAnalytics.Param.INDEX, "c", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "removeAt", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "builder", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "get", "(I)Ljava/lang/Object;", SetCommand.ID, "getSize", "()I", "size", "", "", "buffer", "<init>", "([Ljava/lang/Object;)V", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSmallPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,161:1\n41#2:162\n41#2:163\n26#3:164\n*S KotlinDebug\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n*L\n48#1:162\n91#1:163\n159#1:164\n*E\n"})
public final class SmallPersistentVector<E> extends AbstractPersistentList<E> implements ImmutableList<E> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Object[] f14920p0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final SmallPersistentVector f14919q0 = new SmallPersistentVector(new Object[0]);

    /* JADX INFO: compiled from: SmallPersistentVector.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "", "getEMPTY", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SmallPersistentVector getEMPTY() {
            return SmallPersistentVector.f14919q0;
        }
    }

    public SmallPersistentVector(@NotNull Object[] objArr) {
        this.f14920p0 = objArr;
        CommonFunctionsKt.m2164assert(objArr.length <= 32);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public E get(int index) {
        ListImplementation.checkElementIndex$runtime_release(index, size());
        return (E) this.f14920p0[index];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f14920p0.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public int indexOf(Object element) {
        return ArraysKt___ArraysKt.indexOf(this.f14920p0, element);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        return ArraysKt___ArraysKt.lastIndexOf(this.f14920p0, element);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int index) {
        ListImplementation.checkPositionIndex$runtime_release(index, size());
        return new BufferIterator(this.f14920p0, index, size());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList<E> removeAt(int index) {
        ListImplementation.checkElementIndex$runtime_release(index, size());
        if (size() == 1) {
            return f14919q0;
        }
        int size = size() - 1;
        Object[] objArr = this.f14920p0;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, size);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        ArraysKt___ArraysJvmKt.copyInto(objArr, objArrCopyOf, index, index + 1, size());
        return new SmallPersistentVector(objArrCopyOf);
    }

    @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList<E> set(int index, E element) {
        ListImplementation.checkElementIndex$runtime_release(index, size());
        Object[] objArr = this.f14920p0;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[index] = element;
        return new SmallPersistentVector(objArrCopyOf);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentList<E> add(E element) {
        int size = size();
        Object[] objArr = this.f14920p0;
        if (size >= 32) {
            return new PersistentVector(objArr, UtilsKt.presizedBufferWith(element), size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size()] = element;
        return new SmallPersistentVector(objArrCopyOf);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentList<E> addAll(@NotNull Collection<? extends E> elements) {
        if (elements.size() + size() > 32) {
            PersistentList.Builder<E> builder = builder();
            builder.addAll(elements);
            return builder.build();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f14920p0, elements.size() + size());
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        int size = size();
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new SmallPersistentVector(objArrCopyOf);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentList.Builder<E> builder() {
        return new PersistentVectorBuilder(this, null, this.f14920p0, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentList<E> removeAll(@NotNull Function1<? super E, Boolean> predicate) {
        int size = size();
        int size2 = size();
        Object[] objArr = this.f14920p0;
        Object[] objArrCopyOf = objArr;
        boolean z10 = false;
        for (int i10 = 0; i10 < size2; i10++) {
            Object obj = objArr[i10];
            if (predicate.invoke(obj).booleanValue()) {
                if (!z10) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
                    z10 = true;
                    size = i10;
                }
            } else if (z10) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        return size == 0 ? f14919q0 : new SmallPersistentVector(ArraysKt___ArraysJvmKt.copyOfRange(objArrCopyOf, 0, size));
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList<E> add(int index, E element) {
        ListImplementation.checkPositionIndex$runtime_release(index, size());
        if (index == size()) {
            return add((Object) element);
        }
        int size = size();
        Object[] objArr = this.f14920p0;
        if (size < 32) {
            Object[] objArr2 = new Object[size() + 1];
            ArraysKt___ArraysJvmKt.copyInto$default(this.f14920p0, objArr2, 0, 0, index, 6, (Object) null);
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, index + 1, index, size());
            objArr2[index] = element;
            return new SmallPersistentVector(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.copyInto(objArr, objArrCopyOf, index + 1, index, size() - 1);
        objArrCopyOf[index] = element;
        return new PersistentVector(objArrCopyOf, UtilsKt.presizedBufferWith(objArr[31]), size() + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList<E> addAll(int index, @NotNull Collection<? extends E> c10) {
        ListImplementation.checkPositionIndex$runtime_release(index, size());
        if (c10.size() + size() <= 32) {
            Object[] objArr = new Object[c10.size() + size()];
            ArraysKt___ArraysJvmKt.copyInto$default(this.f14920p0, objArr, 0, 0, index, 6, (Object) null);
            ArraysKt___ArraysJvmKt.copyInto(this.f14920p0, objArr, c10.size() + index, index, size());
            Iterator<? extends E> it = c10.iterator();
            while (it.hasNext()) {
                objArr[index] = it.next();
                index++;
            }
            return new SmallPersistentVector(objArr);
        }
        PersistentList.Builder<E> builder = builder();
        builder.addAll(index, c10);
        return builder.build();
    }
}
