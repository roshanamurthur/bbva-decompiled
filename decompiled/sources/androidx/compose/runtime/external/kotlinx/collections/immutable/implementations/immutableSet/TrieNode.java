package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TrieNode.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 7*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u00017B)\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u000e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020$\u0012\b\u00103\u001a\u0004\u0018\u00010,¢\u0006\u0004\b4\u00105B!\b\u0016\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u000e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020$¢\u0006\u0004\b4\u00106J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011J2\u0010\u0014\u001a\u0004\u0018\u00010\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011J2\u0010\u0015\u001a\u0004\u0018\u00010\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011J\u001c\u0010\u0016\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\n\u001a\u00020\u0003J+\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00032\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u0018J7\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00032\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011¢\u0006\u0004\b\u001c\u0010\u001aR\"\u0010#\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u00103\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00068"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", ExifInterface.LONGITUDE_EAST, "", "", "positionMask", "indexOfCellAt$runtime_release", "(I)I", "indexOfCellAt", "elementHash", "element", "shift", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "(ILjava/lang/Object;I)Z", "otherNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "intersectionSizeRef", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "mutator", "mutableAddAll", "mutableRetainAll", "mutableRemoveAll", "containsAll", "add", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAdd", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", RemoveCommand.ID, "mutableRemove", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getBitmap", "()I", "setBitmap", "(I)V", "bitmap", "", "b", "[Ljava/lang/Object;", "getBuffer", "()[Ljava/lang/Object;", "setBuffer", "([Ljava/lang/Object;)V", "buffer", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "c", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "getOwnedBy", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "setOwnedBy", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "ownedBy", "<init>", "(I[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "(I[Ljava/lang/Object;)V", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n+ 2 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt\n+ 3 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt$filterTo$1\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,851:1\n54#2,13:852\n50#2,17:865\n50#2,17:882\n50#2,10:918\n60#2,7:929\n50#2,10:945\n60#2,7:956\n10#3,5:899\n15#3,4:905\n10#3,9:909\n10#3,9:936\n10#3,9:965\n1#4:904\n53#5:928\n53#5:955\n12541#6,2:963\n26#7:974\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n*L\n297#1:852,13\n324#1:865,17\n347#1:882,17\n594#1:918,10\n594#1:929,7\n701#1:945,10\n701#1:956,7\n423#1:899,5\n423#1:905,4\n525#1:909,9\n621#1:936,9\n717#1:965,9\n594#1:928\n701#1:955\n710#1:963,2\n849#1:974\n*E\n"})
public final class TrieNode<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int bitmap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Object[] buffer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public MutabilityOwnership ownedBy;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final TrieNode f14973d = new TrieNode(0, new Object[0]);

    /* JADX INFO: compiled from: TrieNode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "", "getEMPTY$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.f14973d;
        }
    }

    public TrieNode(int i10, @NotNull Object[] objArr, @Nullable MutabilityOwnership mutabilityOwnership) {
        this.bitmap = i10;
        this.buffer = objArr;
        this.ownedBy = mutabilityOwnership;
    }

    public static TrieNode d(int i10, Object obj, int i11, Object obj2, int i12, MutabilityOwnership mutabilityOwnership) {
        if (i12 > 30) {
            return new TrieNode(0, new Object[]{obj, obj2}, mutabilityOwnership);
        }
        int iIndexSegment = TrieNodeKt.indexSegment(i10, i12);
        int iIndexSegment2 = TrieNodeKt.indexSegment(i11, i12);
        if (iIndexSegment != iIndexSegment2) {
            return new TrieNode((1 << iIndexSegment) | (1 << iIndexSegment2), iIndexSegment < iIndexSegment2 ? new Object[]{obj, obj2} : new Object[]{obj2, obj}, mutabilityOwnership);
        }
        return new TrieNode(1 << iIndexSegment, new Object[]{d(i10, obj, i11, obj2, i12 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    public final int a() {
        if (this.bitmap == 0) {
            return this.buffer.length;
        }
        int iA = 0;
        for (Object obj : this.buffer) {
            iA += obj instanceof TrieNode ? ((TrieNode) obj).a() : 1;
        }
        return iA;
    }

    @NotNull
    public final TrieNode<E> add(int elementHash, E element, int shift) {
        TrieNode<E> trieNodeAdd;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(elementHash, shift);
        if (c(iIndexSegment)) {
            return new TrieNode<>(this.bitmap | iIndexSegment, TrieNodeKt.access$addElementAtIndex(this.buffer, indexOfCellAt$runtime_release(iIndexSegment), element));
        }
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
        Object obj = this.buffer[iIndexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> trieNodeG = g(iIndexOfCellAt$runtime_release);
            if (shift == 30) {
                trieNodeAdd = ArraysKt___ArraysKt.contains((E[]) trieNodeG.buffer, element) ? trieNodeG : new TrieNode<>(0, TrieNodeKt.access$addElementAtIndex(trieNodeG.buffer, 0, element));
            } else {
                trieNodeAdd = trieNodeG.add(elementHash, element, shift + 5);
            }
            return trieNodeG == trieNodeAdd ? this : h(trieNodeAdd, iIndexOfCellAt$runtime_release);
        }
        if (Intrinsics.areEqual(element, obj)) {
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[iIndexOfCellAt$runtime_release] = e(iIndexOfCellAt$runtime_release, elementHash, element, shift, null);
        return new TrieNode<>(this.bitmap, objArrCopyOf);
    }

    public final boolean b(TrieNode<E> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.bitmap != trieNode.bitmap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.buffer[i10] != trieNode.buffer[i10]) {
                return false;
            }
        }
        return true;
    }

    public final boolean c(int i10) {
        return (i10 & this.bitmap) == 0;
    }

    public final boolean contains(int elementHash, E element, int shift) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(elementHash, shift);
        if (c(iIndexSegment)) {
            return false;
        }
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
        Object obj = this.buffer[iIndexOfCellAt$runtime_release];
        if (!(obj instanceof TrieNode)) {
            return Intrinsics.areEqual(element, obj);
        }
        TrieNode<E> trieNodeG = g(iIndexOfCellAt$runtime_release);
        return shift == 30 ? ArraysKt___ArraysKt.contains((E[]) trieNodeG.buffer, element) : trieNodeG.contains(elementHash, element, shift + 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(@NotNull TrieNode<E> otherNode, int shift) {
        if (this == otherNode) {
            return true;
        }
        if (shift > 30) {
            for (Object obj : otherNode.buffer) {
                if (!ArraysKt___ArraysKt.contains(this.buffer, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i10 = this.bitmap;
        int i11 = otherNode.bitmap;
        int i12 = i10 & i11;
        if (i12 != i11) {
            return false;
        }
        while (i12 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i12);
            int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iLowestOneBit);
            int iIndexOfCellAt$runtime_release2 = otherNode.indexOfCellAt$runtime_release(iLowestOneBit);
            Object obj2 = this.buffer[iIndexOfCellAt$runtime_release];
            Object obj3 = otherNode.buffer[iIndexOfCellAt$runtime_release2];
            boolean z10 = obj2 instanceof TrieNode;
            boolean z11 = obj3 instanceof TrieNode;
            if (z10 && z11) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((TrieNode) obj2).containsAll((TrieNode) obj3, shift + 5)) {
                    return false;
                }
            } else if (z10) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((TrieNode) obj2).contains(obj3 != null ? obj3.hashCode() : 0, obj3, shift + 5)) {
                    return false;
                }
            } else if (z11 || !Intrinsics.areEqual(obj2, obj3)) {
                return false;
            }
            i12 ^= iLowestOneBit;
        }
        return true;
    }

    public final TrieNode<E> e(int i10, int i11, E e5, int i12, MutabilityOwnership mutabilityOwnership) {
        Object obj = this.buffer[i10];
        return d(obj != null ? obj.hashCode() : 0, obj, i11, e5, i12 + 5, mutabilityOwnership);
    }

    public final TrieNode<E> f(int i10, TrieNode<E> trieNode, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = trieNode.buffer;
        if (objArr.length == 1) {
            Object obj = objArr[0];
            if (!(obj instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    trieNode.bitmap = this.bitmap;
                    return trieNode;
                }
                trieNode = (TrieNode<E>) obj;
            }
        }
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer[i10] = trieNode;
            return this;
        }
        Object[] objArr2 = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10] = trieNode;
        return new TrieNode<>(this.bitmap, objArrCopyOf, mutabilityOwnership);
    }

    public final TrieNode<E> g(int i10) {
        Object obj = this.buffer[i10];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (TrieNode) obj;
    }

    public final int getBitmap() {
        return this.bitmap;
    }

    @NotNull
    public final Object[] getBuffer() {
        return this.buffer;
    }

    @Nullable
    public final MutabilityOwnership getOwnedBy() {
        return this.ownedBy;
    }

    public final TrieNode h(TrieNode trieNode, int i10) {
        Object[] objArr = trieNode.buffer;
        Object obj = trieNode;
        if (objArr.length == 1) {
            Object obj2 = objArr[0];
            if (!(obj2 instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    obj = trieNode;
                    trieNode.bitmap = this.bitmap;
                    return trieNode;
                }
                obj = trieNode;
                obj = obj2;
            }
        }
        obj = trieNode;
        Object[] objArr2 = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10] = obj;
        return new TrieNode(this.bitmap, objArrCopyOf);
    }

    public final int indexOfCellAt$runtime_release(int positionMask) {
        return Integer.bitCount((positionMask - 1) & this.bitmap);
    }

    @NotNull
    public final TrieNode<E> mutableAdd(int elementHash, E element, int shift, @NotNull PersistentHashSetBuilder<?> mutator) {
        TrieNode<E> trieNodeMutableAdd;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(elementHash, shift);
        if (c(iIndexSegment)) {
            mutator.setSize(mutator.size() + 1);
            MutabilityOwnership ownership = mutator.getOwnership();
            int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
            if (this.ownedBy != ownership) {
                return new TrieNode<>(this.bitmap | iIndexSegment, TrieNodeKt.access$addElementAtIndex(this.buffer, iIndexOfCellAt$runtime_release, element), ownership);
            }
            this.buffer = TrieNodeKt.access$addElementAtIndex(this.buffer, iIndexOfCellAt$runtime_release, element);
            this.bitmap |= iIndexSegment;
            return this;
        }
        int iIndexOfCellAt$runtime_release2 = indexOfCellAt$runtime_release(iIndexSegment);
        Object obj = this.buffer[iIndexOfCellAt$runtime_release2];
        if (obj instanceof TrieNode) {
            TrieNode<E> trieNodeG = g(iIndexOfCellAt$runtime_release2);
            if (shift != 30) {
                trieNodeMutableAdd = trieNodeG.mutableAdd(elementHash, element, shift + 5, mutator);
            } else if (ArraysKt___ArraysKt.contains((E[]) trieNodeG.buffer, element)) {
                trieNodeMutableAdd = trieNodeG;
            } else {
                mutator.setSize(mutator.size() + 1);
                if (trieNodeG.ownedBy == mutator.getOwnership()) {
                    trieNodeG.buffer = TrieNodeKt.access$addElementAtIndex(trieNodeG.buffer, 0, element);
                    trieNodeMutableAdd = trieNodeG;
                } else {
                    trieNodeMutableAdd = new TrieNode<>(0, TrieNodeKt.access$addElementAtIndex(trieNodeG.buffer, 0, element), mutator.getOwnership());
                }
            }
            return trieNodeG == trieNodeMutableAdd ? this : f(iIndexOfCellAt$runtime_release2, trieNodeMutableAdd, mutator.getOwnership());
        }
        if (Intrinsics.areEqual(element, obj)) {
            return this;
        }
        mutator.setSize(mutator.size() + 1);
        MutabilityOwnership ownership2 = mutator.getOwnership();
        if (this.ownedBy == ownership2) {
            this.buffer[iIndexOfCellAt$runtime_release2] = e(iIndexOfCellAt$runtime_release2, elementHash, element, shift, ownership2);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[iIndexOfCellAt$runtime_release2] = e(iIndexOfCellAt$runtime_release2, elementHash, element, shift, ownership2);
        return new TrieNode<>(this.bitmap, objArrCopyOf, ownership2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final TrieNode<E> mutableAddAll(@NotNull TrieNode<E> otherNode, int shift, @NotNull DeltaCounter intersectionSizeRef, @NotNull PersistentHashSetBuilder<?> mutator) {
        Object objD;
        if (this == otherNode) {
            intersectionSizeRef.setCount(a() + intersectionSizeRef.getCount());
            return this;
        }
        if (shift > 30) {
            MutabilityOwnership ownership = mutator.getOwnership();
            if (this == otherNode) {
                intersectionSizeRef.plusAssign(this.buffer.length);
            } else {
                Object[] objArr = this.buffer;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + otherNode.buffer.length);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                Object[] objArr2 = otherNode.buffer;
                int length = this.buffer.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < objArr2.length) {
                    CommonFunctionsKt.m2164assert(i11 <= i10);
                    if (!ArraysKt___ArraysKt.contains(this.buffer, objArr2[i10])) {
                        objArrCopyOf[length + i11] = objArr2[i10];
                        i11++;
                        CommonFunctionsKt.m2164assert(length + i11 <= objArrCopyOf.length);
                    }
                    i10++;
                }
                int length2 = i11 + this.buffer.length;
                intersectionSizeRef.plusAssign(objArrCopyOf.length - length2);
                if (length2 != this.buffer.length) {
                    if (length2 == otherNode.buffer.length) {
                        return otherNode;
                    }
                    if (length2 != objArrCopyOf.length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, length2);
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                    }
                    if (!Intrinsics.areEqual(this.ownedBy, ownership)) {
                        return new TrieNode<>(0, objArrCopyOf, ownership);
                    }
                    this.buffer = objArrCopyOf;
                }
            }
            return this;
        }
        int i12 = this.bitmap;
        int i13 = otherNode.bitmap | i12;
        TrieNode<E> trieNode = (i13 == i12 && Intrinsics.areEqual(this.ownedBy, mutator.getOwnership())) ? this : new TrieNode<>(i13, new Object[Integer.bitCount(i13)], mutator.getOwnership());
        int i14 = 0;
        while (i13 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i13);
            int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iLowestOneBit);
            int iIndexOfCellAt$runtime_release2 = otherNode.indexOfCellAt$runtime_release(iLowestOneBit);
            Object[] objArr3 = trieNode.buffer;
            if (c(iLowestOneBit)) {
                objD = otherNode.buffer[iIndexOfCellAt$runtime_release2];
            } else if (otherNode.c(iLowestOneBit)) {
                objD = this.buffer[iIndexOfCellAt$runtime_release];
            } else {
                objD = this.buffer[iIndexOfCellAt$runtime_release];
                Object obj = otherNode.buffer[iIndexOfCellAt$runtime_release2];
                boolean z10 = objD instanceof TrieNode;
                boolean z11 = obj instanceof TrieNode;
                if (z10 && z11) {
                    Intrinsics.checkNotNull(objD, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    objD = ((TrieNode) objD).mutableAddAll((TrieNode) obj, shift + 5, intersectionSizeRef, mutator);
                } else if (z10) {
                    Intrinsics.checkNotNull(objD, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    TrieNode trieNode2 = (TrieNode) objD;
                    int size = mutator.size();
                    objD = trieNode2.mutableAdd(obj != null ? obj.hashCode() : 0, obj, shift + 5, mutator);
                    if (mutator.size() == size) {
                        intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                    }
                    Unit unit = Unit.INSTANCE;
                } else if (z11) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    TrieNode trieNode3 = (TrieNode) obj;
                    int size2 = mutator.size();
                    objD = trieNode3.mutableAdd(objD != null ? objD.hashCode() : 0, objD, shift + 5, mutator);
                    if (mutator.size() == size2) {
                        intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                    }
                    Unit unit2 = Unit.INSTANCE;
                } else if (Intrinsics.areEqual(objD, obj)) {
                    intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                    Unit unit3 = Unit.INSTANCE;
                } else {
                    objD = d(objD != null ? objD.hashCode() : 0, objD, obj != null ? obj.hashCode() : 0, obj, shift + 5, mutator.getOwnership());
                }
            }
            objArr3[i14] = objD;
            i14++;
            i13 ^= iLowestOneBit;
        }
        if (b(trieNode)) {
            return this;
        }
        return otherNode.b(trieNode) ? otherNode : trieNode;
    }

    @NotNull
    public final TrieNode<E> mutableRemove(int elementHash, E element, int shift, @NotNull PersistentHashSetBuilder<?> mutator) {
        TrieNode<E> trieNodeMutableRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(elementHash, shift);
        if (c(iIndexSegment)) {
            return this;
        }
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
        Object obj = this.buffer[iIndexOfCellAt$runtime_release];
        if (!(obj instanceof TrieNode)) {
            if (!Intrinsics.areEqual(element, obj)) {
                return this;
            }
            mutator.setSize(mutator.size() - 1);
            MutabilityOwnership ownership = mutator.getOwnership();
            if (this.ownedBy != ownership) {
                return new TrieNode<>(this.bitmap ^ iIndexSegment, TrieNodeKt.access$removeCellAtIndex(this.buffer, iIndexOfCellAt$runtime_release), ownership);
            }
            this.buffer = TrieNodeKt.access$removeCellAtIndex(this.buffer, iIndexOfCellAt$runtime_release);
            this.bitmap ^= iIndexSegment;
            return this;
        }
        TrieNode<E> trieNodeG = g(iIndexOfCellAt$runtime_release);
        if (shift == 30) {
            int iIndexOf = ArraysKt___ArraysKt.indexOf((E[]) trieNodeG.buffer, element);
            if (iIndexOf != -1) {
                mutator.setSize(mutator.size() - 1);
                MutabilityOwnership ownership2 = mutator.getOwnership();
                if (trieNodeG.ownedBy == ownership2) {
                    trieNodeG.buffer = TrieNodeKt.access$removeCellAtIndex(trieNodeG.buffer, iIndexOf);
                    trieNodeMutableRemove = trieNodeG;
                } else {
                    trieNodeMutableRemove = new TrieNode<>(0, TrieNodeKt.access$removeCellAtIndex(trieNodeG.buffer, iIndexOf), ownership2);
                }
            } else {
                trieNodeMutableRemove = trieNodeG;
            }
        } else {
            trieNodeMutableRemove = trieNodeG.mutableRemove(elementHash, element, shift + 5, mutator);
        }
        return (this.ownedBy == mutator.getOwnership() || trieNodeG != trieNodeMutableRemove) ? f(iIndexOfCellAt$runtime_release, trieNodeMutableRemove, mutator.getOwnership()) : this;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0125  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object mutableRemoveAll(@NotNull TrieNode<E> otherNode, int shift, @NotNull DeltaCounter intersectionSizeRef, @NotNull PersistentHashSetBuilder<?> mutator) {
        TrieNode<E> trieNode;
        TrieNode<E> trieNode2 = otherNode;
        TrieNode trieNode3 = f14973d;
        if (this == trieNode2) {
            intersectionSizeRef.plusAssign(a());
            return trieNode3;
        }
        if (shift > 30) {
            MutabilityOwnership ownership = mutator.getOwnership();
            if (this == trieNode2) {
                intersectionSizeRef.plusAssign(this.buffer.length);
                return trieNode3;
            }
            Object[] objArr = Intrinsics.areEqual(ownership, this.ownedBy) ? this.buffer : new Object[this.buffer.length];
            Object[] objArr2 = this.buffer;
            int i10 = 0;
            int i11 = 0;
            while (i10 < objArr2.length) {
                CommonFunctionsKt.m2164assert(i11 <= i10);
                if (!ArraysKt___ArraysKt.contains(trieNode2.buffer, objArr2[i10])) {
                    objArr[i11] = objArr2[i10];
                    i11++;
                    CommonFunctionsKt.m2164assert(i11 <= objArr.length);
                }
                i10++;
            }
            intersectionSizeRef.plusAssign(this.buffer.length - i11);
            if (i11 == 0) {
                return trieNode3;
            }
            if (i11 == 1) {
                return objArr[0];
            }
            if (i11 == this.buffer.length) {
                return this;
            }
            if (i11 == objArr.length) {
                return new TrieNode(0, objArr, ownership);
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i11);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            return new TrieNode(0, objArrCopyOf, ownership);
        }
        int i12 = this.bitmap & trieNode2.bitmap;
        if (i12 == 0) {
            return this;
        }
        if (Intrinsics.areEqual(this.ownedBy, mutator.getOwnership())) {
            trieNode = this;
        } else {
            int i13 = this.bitmap;
            Object[] objArr3 = this.buffer;
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(this, size)");
            trieNode = new TrieNode<>(i13, objArrCopyOf2, mutator.getOwnership());
        }
        int i14 = this.bitmap;
        while (i12 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i12);
            int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iLowestOneBit);
            int iIndexOfCellAt$runtime_release2 = trieNode2.indexOfCellAt$runtime_release(iLowestOneBit);
            Object objMutableRemoveAll = this.buffer[iIndexOfCellAt$runtime_release];
            Object obj = trieNode2.buffer[iIndexOfCellAt$runtime_release2];
            boolean z10 = objMutableRemoveAll instanceof TrieNode;
            boolean z11 = obj instanceof TrieNode;
            if (z10 && z11) {
                Intrinsics.checkNotNull(objMutableRemoveAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
                objMutableRemoveAll = ((TrieNode) objMutableRemoveAll).mutableRemoveAll((TrieNode) obj, shift + 5, intersectionSizeRef, mutator);
            } else if (z10) {
                Intrinsics.checkNotNull(objMutableRemoveAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
                TrieNode trieNode4 = (TrieNode) objMutableRemoveAll;
                int size = mutator.size();
                TrieNode trieNodeMutableRemove = trieNode4.mutableRemove(obj != null ? obj.hashCode() : 0, obj, shift + 5, mutator);
                if (size != mutator.size()) {
                    intersectionSizeRef.plusAssign(1);
                    Object[] objArr4 = trieNodeMutableRemove.buffer;
                    if (objArr4.length == 1) {
                        objMutableRemoveAll = objArr4[0];
                        if (objMutableRemoveAll instanceof TrieNode) {
                            objMutableRemoveAll = trieNodeMutableRemove;
                        }
                    } else {
                        objMutableRemoveAll = trieNodeMutableRemove;
                    }
                }
            } else if (z11) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
                if (((TrieNode) obj).contains(objMutableRemoveAll != null ? objMutableRemoveAll.hashCode() : 0, objMutableRemoveAll, shift + 5)) {
                    intersectionSizeRef.plusAssign(1);
                    objMutableRemoveAll = trieNode3;
                }
            } else if (Intrinsics.areEqual(objMutableRemoveAll, obj)) {
                intersectionSizeRef.plusAssign(1);
                objMutableRemoveAll = trieNode3;
            }
            if (objMutableRemoveAll == trieNode3) {
                i14 ^= iLowestOneBit;
            }
            trieNode.buffer[iIndexOfCellAt$runtime_release] = objMutableRemoveAll;
            i12 ^= iLowestOneBit;
            trieNode2 = otherNode;
        }
        int iBitCount = Integer.bitCount(i14);
        if (i14 == 0) {
            return trieNode3;
        }
        if (i14 == this.bitmap) {
            return trieNode.b(this) ? this : trieNode;
        }
        if (iBitCount == 1 && shift != 0) {
            Object obj2 = trieNode.buffer[trieNode.indexOfCellAt$runtime_release(i14)];
            return obj2 instanceof TrieNode ? new TrieNode(i14, new Object[]{obj2}, mutator.getOwnership()) : obj2;
        }
        Object[] objArr5 = new Object[iBitCount];
        Object[] objArr6 = trieNode.buffer;
        int i15 = 0;
        int i16 = 0;
        while (i15 < objArr6.length) {
            CommonFunctionsKt.m2164assert(i16 <= i15);
            if (objArr6[i15] != INSTANCE.getEMPTY$runtime_release()) {
                objArr5[i16] = objArr6[i15];
                i16++;
                CommonFunctionsKt.m2164assert(i16 <= iBitCount);
            }
            i15++;
        }
        return new TrieNode(i14, objArr5, mutator.getOwnership());
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0145  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object mutableRetainAll(@NotNull TrieNode<E> otherNode, int shift, @NotNull DeltaCounter intersectionSizeRef, @NotNull PersistentHashSetBuilder<?> mutator) {
        TrieNode trieNode;
        int i10;
        if (this == otherNode) {
            intersectionSizeRef.plusAssign(a());
            return this;
        }
        TrieNode trieNode2 = f14973d;
        if (shift > 30) {
            MutabilityOwnership ownership = mutator.getOwnership();
            if (this == otherNode) {
                intersectionSizeRef.plusAssign(this.buffer.length);
            } else {
                Object[] objArr = Intrinsics.areEqual(ownership, this.ownedBy) ? this.buffer : new Object[Math.min(this.buffer.length, otherNode.buffer.length)];
                Object[] objArr2 = this.buffer;
                int i11 = 0;
                int i12 = 0;
                while (i11 < objArr2.length) {
                    CommonFunctionsKt.m2164assert(i12 <= i11);
                    if (ArraysKt___ArraysKt.contains(otherNode.buffer, objArr2[i11])) {
                        objArr[i12] = objArr2[i11];
                        i12++;
                        CommonFunctionsKt.m2164assert(i12 <= objArr.length);
                    }
                    i11++;
                }
                intersectionSizeRef.plusAssign(i12);
                if (i12 == 0) {
                    return trieNode2;
                }
                if (i12 == 1) {
                    return objArr[0];
                }
                if (i12 != this.buffer.length) {
                    if (i12 == otherNode.buffer.length) {
                        return otherNode;
                    }
                    if (i12 == objArr.length) {
                        return new TrieNode(0, objArr, ownership);
                    }
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i12);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                    return new TrieNode(0, objArrCopyOf, ownership);
                }
            }
            return this;
        }
        int i13 = this.bitmap & otherNode.bitmap;
        if (i13 == 0) {
            return trieNode2;
        }
        TrieNode<E> trieNode3 = (Intrinsics.areEqual(this.ownedBy, mutator.getOwnership()) && i13 == this.bitmap) ? this : new TrieNode<>(i13, new Object[Integer.bitCount(i13)], mutator.getOwnership());
        int i14 = i13;
        int i15 = 0;
        int i16 = 0;
        while (i14 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i14);
            int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iLowestOneBit);
            int iIndexOfCellAt$runtime_release2 = otherNode.indexOfCellAt$runtime_release(iLowestOneBit);
            Object objMutableRetainAll = this.buffer[iIndexOfCellAt$runtime_release];
            Object obj = otherNode.buffer[iIndexOfCellAt$runtime_release2];
            boolean z10 = objMutableRetainAll instanceof TrieNode;
            boolean z11 = obj instanceof TrieNode;
            if (z10 && z11) {
                Intrinsics.checkNotNull(objMutableRetainAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                objMutableRetainAll = ((TrieNode) objMutableRetainAll).mutableRetainAll((TrieNode) obj, shift + 5, intersectionSizeRef, mutator);
            } else {
                if (z10) {
                    Intrinsics.checkNotNull(objMutableRetainAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    if (((TrieNode) objMutableRetainAll).contains(obj != null ? obj.hashCode() : 0, obj, shift + 5)) {
                        i10 = 1;
                        intersectionSizeRef.plusAssign(1);
                        objMutableRetainAll = obj;
                    } else {
                        objMutableRetainAll = trieNode2;
                    }
                } else if (z11) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    if (((TrieNode) obj).contains(objMutableRetainAll != null ? objMutableRetainAll.hashCode() : 0, objMutableRetainAll, shift + 5)) {
                        i10 = 1;
                        intersectionSizeRef.plusAssign(1);
                    } else {
                        i10 = 1;
                        objMutableRetainAll = trieNode2;
                    }
                } else {
                    i10 = 1;
                    if (Intrinsics.areEqual(objMutableRetainAll, obj)) {
                        intersectionSizeRef.plusAssign(1);
                    } else {
                        objMutableRetainAll = trieNode2;
                    }
                }
                if (objMutableRetainAll != trieNode2) {
                    i15 |= iLowestOneBit;
                }
                trieNode3.buffer[i16] = objMutableRetainAll;
                i16 += i10;
                i14 ^= iLowestOneBit;
            }
            i10 = 1;
            if (objMutableRetainAll != trieNode2) {
                i15 |= iLowestOneBit;
            }
            trieNode3.buffer[i16] = objMutableRetainAll;
            i16 += i10;
            i14 ^= iLowestOneBit;
        }
        int iBitCount = Integer.bitCount(i15);
        if (i15 == 0) {
            return trieNode2;
        }
        if (i15 == i13) {
            if (trieNode3.b(this)) {
                return this;
            }
            return trieNode3.b(otherNode) ? otherNode : trieNode3;
        }
        if (iBitCount != 1 || shift == 0) {
            Object[] objArr3 = new Object[iBitCount];
            Object[] objArr4 = trieNode3.buffer;
            int i17 = 0;
            int i18 = 0;
            while (i17 < objArr4.length) {
                CommonFunctionsKt.m2164assert(i18 <= i17);
                if (objArr4[i17] != INSTANCE.getEMPTY$runtime_release()) {
                    objArr3[i18] = objArr4[i17];
                    i18++;
                    CommonFunctionsKt.m2164assert(i18 <= iBitCount);
                }
                i17++;
            }
            trieNode = new TrieNode(i15, objArr3, mutator.getOwnership());
        } else {
            Object obj2 = trieNode3.buffer[trieNode3.indexOfCellAt$runtime_release(i15)];
            if (!(obj2 instanceof TrieNode)) {
                return obj2;
            }
            trieNode = new TrieNode(i15, new Object[]{obj2}, mutator.getOwnership());
        }
        return trieNode;
    }

    @NotNull
    public final TrieNode<E> remove(int elementHash, E element, int shift) {
        TrieNode<E> trieNodeRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(elementHash, shift);
        if (c(iIndexSegment)) {
            return this;
        }
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
        Object obj = this.buffer[iIndexOfCellAt$runtime_release];
        if (!(obj instanceof TrieNode)) {
            if (Intrinsics.areEqual(element, obj)) {
                return new TrieNode<>(this.bitmap ^ iIndexSegment, TrieNodeKt.access$removeCellAtIndex(this.buffer, iIndexOfCellAt$runtime_release));
            }
            return this;
        }
        TrieNode<E> trieNodeG = g(iIndexOfCellAt$runtime_release);
        if (shift == 30) {
            int iIndexOf = ArraysKt___ArraysKt.indexOf((E[]) trieNodeG.buffer, element);
            trieNodeRemove = iIndexOf != -1 ? new TrieNode<>(0, TrieNodeKt.access$removeCellAtIndex(trieNodeG.buffer, iIndexOf)) : trieNodeG;
        } else {
            trieNodeRemove = trieNodeG.remove(elementHash, element, shift + 5);
        }
        return trieNodeG == trieNodeRemove ? this : h(trieNodeRemove, iIndexOfCellAt$runtime_release);
    }

    public final void setBitmap(int i10) {
        this.bitmap = i10;
    }

    public final void setBuffer(@NotNull Object[] objArr) {
        this.buffer = objArr;
    }

    public final void setOwnedBy(@Nullable MutabilityOwnership mutabilityOwnership) {
        this.ownedBy = mutabilityOwnership;
    }

    public TrieNode(int i10, @NotNull Object[] objArr) {
        this(i10, objArr, null);
    }
}
