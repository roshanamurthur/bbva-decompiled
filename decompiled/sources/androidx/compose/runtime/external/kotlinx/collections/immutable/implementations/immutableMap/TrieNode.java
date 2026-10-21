package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.plugin.command.hash.HashCommand;
import com.bbva.networkplugin.command.impl.PutCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TrieNode.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 E*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002EFB1\u0012\u0006\u00102\u001a\u00020\u0004\u0012\u0006\u00103\u001a\u00020\u0004\u0012\u000e\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000309\u0012\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\bB\u0010CB)\b\u0016\u0012\u0006\u00102\u001a\u00020\u0004\u0012\u0006\u00103\u001a\u00020\u0004\u0012\u000e\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000309¢\u0006\u0004\bB\u0010DJ\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJJ\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fJ;\u0010$\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010#2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\"\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%JM\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\"\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00020\u00042\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f¢\u0006\u0004\b&\u0010'J3\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)JG\u0010*\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00042\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f¢\u0006\u0004\b*\u0010+J;\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\"\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b(\u0010,JO\u0010*\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\"\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00020\u00042\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f¢\u0006\u0004\b*\u0010'J\u0093\u0001\u00108\u001a\u0002042\u0081\u0001\u00105\u001a}\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(1\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(3\u0012\u0004\u0012\u0002040-H\u0000¢\u0006\u0004\b6\u00107R4\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003092\u000e\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003098\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006G"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "entryCount$runtime_release", "()I", "entryCount", "positionMask", "", "hasEntryAt$runtime_release", "(I)Z", "hasEntryAt", "entryKeyIndex$runtime_release", "(I)I", "entryKeyIndex", "nodeIndex$runtime_release", "nodeIndex", "nodeAtIndex$runtime_release", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "nodeAtIndex", "keyHash", "key", "shift", "containsKey", "(ILjava/lang/Object;I)Z", "get", "(ILjava/lang/Object;I)Ljava/lang/Object;", "otherNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "intersectionCounter", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "mutator", "mutablePutAll", "value", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", PutCommand.ID, "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "mutablePut", "(ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", RemoveCommand.ID, "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableRemove", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "node", HashCommand.ID, "dataMap", "nodeMap", "", "visitor", "accept$runtime_release", "(Lkotlin/jvm/functions/Function5;)V", "accept", "", "<set-?>", "d", "[Ljava/lang/Object;", "getBuffer$runtime_release", "()[Ljava/lang/Object;", "buffer", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownedBy", "<init>", "(II[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "(II[Ljava/lang/Object;)V", "Companion", "ModificationResult", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n+ 2 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,899:1\n10#2,9:900\n10#2,9:916\n10#2,9:925\n61#3,7:909\n84#4:934\n1#5:935\n26#6:936\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n*L\n630#1:900,9\n648#1:916,9\n652#1:925,9\n640#1:909,7\n700#1:934\n700#1:935\n897#1:936\n*E\n"})
public final class TrieNode<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final MutabilityOwnership f14951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Object[] buffer;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final TrieNode f14948e = new TrieNode(0, 0, new Object[0]);

    /* JADX INFO: compiled from: TrieNode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "", "getEMPTY$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.f14948e;
        }
    }

    /* JADX INFO: compiled from: TrieNode.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B#\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016JA\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002*\u0010\u0006\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004H\u0086\bR.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "Lkotlin/Function1;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "operation", "replaceNode", "a", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getNode", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "setNode", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", "node", "", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSizeDelta", "()I", "sizeDelta", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,899:1\n1#2:900\n*E\n"})
    public static final class ModificationResult<K, V> {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public TrieNode<K, V> node;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int sizeDelta;

        public ModificationResult(@NotNull TrieNode<K, V> trieNode, int i10) {
            this.node = trieNode;
            this.sizeDelta = i10;
        }

        @NotNull
        public final TrieNode<K, V> getNode() {
            return this.node;
        }

        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        @NotNull
        public final ModificationResult<K, V> replaceNode(@NotNull Function1<? super TrieNode<K, V>, TrieNode<K, V>> operation) {
            setNode(operation.invoke(getNode()));
            return this;
        }

        public final void setNode(@NotNull TrieNode<K, V> trieNode) {
            this.node = trieNode;
        }
    }

    public TrieNode(int i10, int i11, @NotNull Object[] objArr, @Nullable MutabilityOwnership mutabilityOwnership) {
        this.f14949a = i10;
        this.f14950b = i11;
        this.f14951c = mutabilityOwnership;
        this.buffer = objArr;
    }

    public static TrieNode g(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, MutabilityOwnership mutabilityOwnership) {
        if (i12 > 30) {
            return new TrieNode(0, 0, new Object[]{obj, obj2, obj3, obj4}, mutabilityOwnership);
        }
        int iIndexSegment = TrieNodeKt.indexSegment(i10, i12);
        int iIndexSegment2 = TrieNodeKt.indexSegment(i11, i12);
        if (iIndexSegment != iIndexSegment2) {
            return new TrieNode((1 << iIndexSegment) | (1 << iIndexSegment2), 0, iIndexSegment < iIndexSegment2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, mutabilityOwnership);
        }
        return new TrieNode(0, 1 << iIndexSegment, new Object[]{g(i10, obj, obj2, i11, obj3, obj4, i12 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    public final void a(Function5<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> function5, int i10, int i11) {
        function5.invoke(this, Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(this.f14949a), Integer.valueOf(this.f14950b));
        int i12 = this.f14950b;
        while (i12 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i12);
            nodeAtIndex$runtime_release(nodeIndex$runtime_release(iLowestOneBit)).a(function5, (Integer.numberOfTrailingZeros(iLowestOneBit) << i11) + i10, i11 + 5);
            i12 -= iLowestOneBit;
        }
    }

    public final void accept$runtime_release(@NotNull Function5<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> visitor) {
        a(visitor, 0, 0);
    }

    public final Object[] b(int i10, int i11, int i12, K k10, V v3, int i13, MutabilityOwnership mutabilityOwnership) {
        Object obj = this.buffer[i10];
        return TrieNodeKt.access$replaceEntryWithNode(this.buffer, i10, nodeIndex$runtime_release(i11) + 1, g(obj != null ? obj.hashCode() : 0, obj, n(i10), i12, k10, v3, i13 + 5, mutabilityOwnership));
    }

    public final int c() {
        if (this.f14950b == 0) {
            return this.buffer.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f14949a);
        int length = this.buffer.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += nodeAtIndex$runtime_release(i10).c();
        }
        return iBitCount;
    }

    public final boolean containsKey(int keyHash, K key, int shift) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            return Intrinsics.areEqual(key, this.buffer[entryKeyIndex$runtime_release(iIndexSegment)]);
        }
        if (!f(iIndexSegment)) {
            return false;
        }
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(iIndexSegment));
        return shift == 30 ? trieNodeNodeAtIndex$runtime_release.d(key) : trieNodeNodeAtIndex$runtime_release.containsKey(keyHash, key, shift + 5);
    }

    public final boolean d(K k10) {
        IntProgression intProgressionStep = c.step(c.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.areEqual(k10, this.buffer[first])) {
                if (first != last) {
                    first += step;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(TrieNode<K, V> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.f14950b != trieNode.f14950b || this.f14949a != trieNode.f14949a) {
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

    public final int entryCount$runtime_release() {
        return Integer.bitCount(this.f14949a);
    }

    public final int entryKeyIndex$runtime_release(int positionMask) {
        return Integer.bitCount((positionMask - 1) & this.f14949a) * 2;
    }

    public final boolean f(int i10) {
        return (i10 & this.f14950b) != 0;
    }

    @Nullable
    public final V get(int keyHash, K key, int shift) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (Intrinsics.areEqual(key, this.buffer[iEntryKeyIndex$runtime_release])) {
                return n(iEntryKeyIndex$runtime_release);
            }
            return null;
        }
        if (!f(iIndexSegment)) {
            return null;
        }
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(iIndexSegment));
        if (shift != 30) {
            return trieNodeNodeAtIndex$runtime_release.get(keyHash, key, shift + 5);
        }
        IntProgression intProgressionStep = c.step(c.until(0, trieNodeNodeAtIndex$runtime_release.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return null;
        }
        while (!Intrinsics.areEqual(key, trieNodeNodeAtIndex$runtime_release.buffer[first])) {
            if (first == last) {
                return null;
            }
            first += step;
        }
        return trieNodeNodeAtIndex$runtime_release.n(first);
    }

    @NotNull
    /* JADX INFO: renamed from: getBuffer$runtime_release, reason: from getter */
    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final TrieNode<K, V> h(int i10, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime_release(n(i10));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.f14951c != persistentHashMapBuilder.getOwnership()) {
            return new TrieNode<>(0, 0, TrieNodeKt.access$removeEntryAtIndex(this.buffer, i10), persistentHashMapBuilder.getOwnership());
        }
        this.buffer = TrieNodeKt.access$removeEntryAtIndex(this.buffer, i10);
        return this;
    }

    public final boolean hasEntryAt$runtime_release(int positionMask) {
        return (positionMask & this.f14949a) != 0;
    }

    public final TrieNode<K, V> i(int i10, int i11, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime_release(n(i10));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.f14951c != persistentHashMapBuilder.getOwnership()) {
            return new TrieNode<>(i11 ^ this.f14949a, this.f14950b, TrieNodeKt.access$removeEntryAtIndex(this.buffer, i10), persistentHashMapBuilder.getOwnership());
        }
        this.buffer = TrieNodeKt.access$removeEntryAtIndex(this.buffer, i10);
        this.f14949a ^= i11;
        return this;
    }

    public final TrieNode<K, V> j(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i10, int i11, MutabilityOwnership mutabilityOwnership) {
        MutabilityOwnership mutabilityOwnership2 = this.f14951c;
        if (trieNode2 == null) {
            Object[] objArr = this.buffer;
            if (objArr.length == 1) {
                return null;
            }
            if (mutabilityOwnership2 != mutabilityOwnership) {
                return new TrieNode<>(this.f14949a, i11 ^ this.f14950b, TrieNodeKt.access$removeNodeAtIndex(objArr, i10), mutabilityOwnership);
            }
            this.buffer = TrieNodeKt.access$removeNodeAtIndex(objArr, i10);
            this.f14950b ^= i11;
        } else if (mutabilityOwnership2 == mutabilityOwnership || trieNode != trieNode2) {
            return k(i10, trieNode2, mutabilityOwnership);
        }
        return this;
    }

    public final TrieNode<K, V> k(int i10, TrieNode<K, V> trieNode, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1 && trieNode.buffer.length == 2 && trieNode.f14950b == 0) {
            trieNode.f14949a = this.f14950b;
            return trieNode;
        }
        if (this.f14951c == mutabilityOwnership) {
            objArr[i10] = trieNode;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10] = trieNode;
        return new TrieNode<>(this.f14949a, this.f14950b, objArrCopyOf, mutabilityOwnership);
    }

    public final TrieNode<K, V> l(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i10, int i11) {
        if (trieNode2 != null) {
            return trieNode != trieNode2 ? m(i10, i11, trieNode2) : this;
        }
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        return new TrieNode<>(this.f14949a, i11 ^ this.f14950b, TrieNodeKt.access$removeNodeAtIndex(objArr, i10));
    }

    public final TrieNode<K, V> m(int i10, int i11, TrieNode<K, V> trieNode) {
        Object[] objArr = trieNode.buffer;
        if (objArr.length != 2 || trieNode.f14950b != 0) {
            Object[] objArr2 = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            objArrCopyOf[i10] = trieNode;
            return new TrieNode<>(this.f14949a, this.f14950b, objArrCopyOf);
        }
        if (this.buffer.length == 1) {
            trieNode.f14949a = this.f14950b;
            return trieNode;
        }
        return new TrieNode<>(this.f14949a ^ i11, i11 ^ this.f14950b, TrieNodeKt.access$replaceNodeWithEntry(this.buffer, i10, entryKeyIndex$runtime_release(i11), objArr[0], objArr[1]));
    }

    @NotNull
    public final TrieNode<K, V> mutablePut(int keyHash, K key, V value, int shift, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        TrieNode<K, V> trieNodeMutablePut;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        boolean zHasEntryAt$runtime_release = hasEntryAt$runtime_release(iIndexSegment);
        MutabilityOwnership mutabilityOwnership = this.f14951c;
        if (zHasEntryAt$runtime_release) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (!Intrinsics.areEqual(key, this.buffer[iEntryKeyIndex$runtime_release])) {
                mutator.setSize(mutator.size() + 1);
                MutabilityOwnership ownership = mutator.getOwnership();
                if (mutabilityOwnership != ownership) {
                    return new TrieNode<>(this.f14949a ^ iIndexSegment, this.f14950b | iIndexSegment, b(iEntryKeyIndex$runtime_release, iIndexSegment, keyHash, key, value, shift, ownership), ownership);
                }
                this.buffer = b(iEntryKeyIndex$runtime_release, iIndexSegment, keyHash, key, value, shift, ownership);
                this.f14949a ^= iIndexSegment;
                this.f14950b |= iIndexSegment;
                return this;
            }
            mutator.setOperationResult$runtime_release(n(iEntryKeyIndex$runtime_release));
            if (n(iEntryKeyIndex$runtime_release) == value) {
                return this;
            }
            if (mutabilityOwnership == mutator.getOwnership()) {
                this.buffer[iEntryKeyIndex$runtime_release + 1] = value;
                return this;
            }
            mutator.setModCount$runtime_release(mutator.getModCount() + 1);
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iEntryKeyIndex$runtime_release + 1] = value;
            return new TrieNode<>(this.f14949a, this.f14950b, objArrCopyOf, mutator.getOwnership());
        }
        if (!f(iIndexSegment)) {
            mutator.setSize(mutator.size() + 1);
            MutabilityOwnership ownership2 = mutator.getOwnership();
            int iEntryKeyIndex$runtime_release2 = entryKeyIndex$runtime_release(iIndexSegment);
            if (mutabilityOwnership != ownership2) {
                return new TrieNode<>(this.f14949a | iIndexSegment, this.f14950b, TrieNodeKt.access$insertEntryAtIndex(this.buffer, iEntryKeyIndex$runtime_release2, key, value), ownership2);
            }
            this.buffer = TrieNodeKt.access$insertEntryAtIndex(this.buffer, iEntryKeyIndex$runtime_release2, key, value);
            this.f14949a |= iIndexSegment;
            return this;
        }
        int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
        if (shift == 30) {
            IntProgression intProgressionStep = c.step(c.until(0, trieNodeNodeAtIndex$runtime_release.buffer.length), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                mutator.setSize(mutator.size() + 1);
                trieNodeMutablePut = new TrieNode<>(0, 0, TrieNodeKt.access$insertEntryAtIndex(trieNodeNodeAtIndex$runtime_release.buffer, 0, key, value), mutator.getOwnership());
            } else {
                while (true) {
                    if (!Intrinsics.areEqual(key, trieNodeNodeAtIndex$runtime_release.buffer[first])) {
                        if (first == last) {
                            break;
                        }
                        first += step;
                    } else {
                        mutator.setOperationResult$runtime_release(trieNodeNodeAtIndex$runtime_release.n(first));
                        if (trieNodeNodeAtIndex$runtime_release.f14951c == mutator.getOwnership()) {
                            trieNodeNodeAtIndex$runtime_release.buffer[first + 1] = value;
                            trieNodeMutablePut = trieNodeNodeAtIndex$runtime_release;
                        } else {
                            mutator.setModCount$runtime_release(mutator.getModCount() + 1);
                            Object[] objArr2 = trieNodeNodeAtIndex$runtime_release.buffer;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(this, size)");
                            objArrCopyOf2[first + 1] = value;
                            trieNodeMutablePut = new TrieNode<>(0, 0, objArrCopyOf2, mutator.getOwnership());
                        }
                    }
                }
                mutator.setSize(mutator.size() + 1);
                trieNodeMutablePut = new TrieNode<>(0, 0, TrieNodeKt.access$insertEntryAtIndex(trieNodeNodeAtIndex$runtime_release.buffer, 0, key, value), mutator.getOwnership());
            }
        } else {
            trieNodeMutablePut = trieNodeNodeAtIndex$runtime_release.mutablePut(keyHash, key, value, shift + 5, mutator);
        }
        return trieNodeNodeAtIndex$runtime_release == trieNodeMutablePut ? this : k(iNodeIndex$runtime_release, trieNodeMutablePut, mutator.getOwnership());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r13v6, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode] */
    /* JADX WARN: Type inference failed for: r14v1, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode] */
    /* JADX WARN: Type inference failed for: r14v8, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode] */
    /* JADX WARN: Type inference failed for: r14v9, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r22v0, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V>] */
    /* JADX WARN: Type inference failed for: r23v0, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V>] */
    /* JADX WARN: Type inference failed for: r8v10, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v18 */
    @NotNull
    public final TrieNode<K, V> mutablePutAll(@NotNull TrieNode<K, V> otherNode, int shift, @NotNull DeltaCounter intersectionCounter, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        ?? trieNode;
        ?? G;
        if (this == otherNode) {
            intersectionCounter.plusAssign(c());
            return this;
        }
        int i10 = 1;
        if (shift > 30) {
            MutabilityOwnership ownership = mutator.getOwnership();
            CommonFunctionsKt.m2164assert(this.f14950b == 0);
            CommonFunctionsKt.m2164assert(this.f14949a == 0);
            CommonFunctionsKt.m2164assert(otherNode.f14950b == 0);
            CommonFunctionsKt.m2164assert(otherNode.f14949a == 0);
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + otherNode.buffer.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            int length = this.buffer.length;
            IntProgression intProgressionStep = c.step(c.until(0, otherNode.buffer.length), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    if (d(otherNode.buffer[first])) {
                        intersectionCounter.setCount(intersectionCounter.getCount() + 1);
                    } else {
                        Object[] objArr2 = otherNode.buffer;
                        objArrCopyOf[length] = objArr2[first];
                        objArrCopyOf[length + 1] = objArr2[first + 1];
                        length += 2;
                    }
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
            if (length == this.buffer.length) {
                return this;
            }
            if (length == otherNode.buffer.length) {
                return otherNode;
            }
            if (length == objArrCopyOf.length) {
                return new TrieNode<>(0, 0, objArrCopyOf, ownership);
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(this, newSize)");
            return new TrieNode<>(0, 0, objArrCopyOf2, ownership);
        }
        int i11 = this.f14950b | otherNode.f14950b;
        int i12 = this.f14949a;
        int i13 = otherNode.f14949a;
        int i14 = (i12 ^ i13) & (~i11);
        int i15 = i12 & i13;
        while (i15 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i15);
            if (Intrinsics.areEqual(this.buffer[entryKeyIndex$runtime_release(iLowestOneBit)], otherNode.buffer[otherNode.entryKeyIndex$runtime_release(iLowestOneBit)])) {
                i14 |= iLowestOneBit;
            } else {
                i11 |= iLowestOneBit;
            }
            i15 ^= iLowestOneBit;
        }
        if ((i11 & i14) != 0) {
            PreconditionsKt.throwIllegalStateException("Check failed.");
        }
        if (Intrinsics.areEqual(this.f14951c, mutator.getOwnership()) && this.f14949a == i14 && this.f14950b == i11) {
            trieNode = this;
        } else {
            trieNode = new TrieNode(i14, i11, new Object[Integer.bitCount(i11) + (Integer.bitCount(i14) * 2)]);
        }
        int i16 = 0;
        while (i11 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i11);
            ?? r11 = trieNode.buffer;
            int length2 = (r11.length - i10) - i16;
            if (f(iLowestOneBit2)) {
                G = nodeAtIndex$runtime_release(nodeIndex$runtime_release(iLowestOneBit2));
                if (otherNode.f(iLowestOneBit2)) {
                    G = G.mutablePutAll(otherNode.nodeAtIndex$runtime_release(otherNode.nodeIndex$runtime_release(iLowestOneBit2)), shift + 5, intersectionCounter, mutator);
                } else if (otherNode.hasEntryAt$runtime_release(iLowestOneBit2)) {
                    int iEntryKeyIndex$runtime_release = otherNode.entryKeyIndex$runtime_release(iLowestOneBit2);
                    Object obj = otherNode.buffer[iEntryKeyIndex$runtime_release];
                    Object objN = otherNode.n(iEntryKeyIndex$runtime_release);
                    int size = mutator.size();
                    G = G.mutablePut(obj != null ? obj.hashCode() : 0, obj, objN, shift + 5, mutator);
                    if (mutator.size() == size) {
                        intersectionCounter.setCount(intersectionCounter.getCount() + i10);
                    }
                }
            } else if (otherNode.f(iLowestOneBit2)) {
                ?? NodeAtIndex$runtime_release = otherNode.nodeAtIndex$runtime_release(otherNode.nodeIndex$runtime_release(iLowestOneBit2));
                if (hasEntryAt$runtime_release(iLowestOneBit2)) {
                    int iEntryKeyIndex$runtime_release2 = entryKeyIndex$runtime_release(iLowestOneBit2);
                    Object obj2 = this.buffer[iEntryKeyIndex$runtime_release2];
                    int i17 = shift + 5;
                    if (NodeAtIndex$runtime_release.containsKey(obj2 != null ? obj2.hashCode() : 0, obj2, i17)) {
                        intersectionCounter.setCount(intersectionCounter.getCount() + 1);
                        G = NodeAtIndex$runtime_release;
                    } else {
                        G = NodeAtIndex$runtime_release.mutablePut(obj2 != null ? obj2.hashCode() : 0, obj2, n(iEntryKeyIndex$runtime_release2), i17, mutator);
                    }
                } else {
                    G = NodeAtIndex$runtime_release;
                }
            } else {
                int iEntryKeyIndex$runtime_release3 = entryKeyIndex$runtime_release(iLowestOneBit2);
                Object obj3 = this.buffer[iEntryKeyIndex$runtime_release3];
                Object objN2 = n(iEntryKeyIndex$runtime_release3);
                int iEntryKeyIndex$runtime_release4 = otherNode.entryKeyIndex$runtime_release(iLowestOneBit2);
                Object obj4 = otherNode.buffer[iEntryKeyIndex$runtime_release4];
                G = g(obj3 != null ? obj3.hashCode() : 0, obj3, objN2, obj4 != null ? obj4.hashCode() : 0, obj4, otherNode.n(iEntryKeyIndex$runtime_release4), shift + 5, mutator.getOwnership());
            }
            r11[length2] = G;
            i16++;
            i11 ^= iLowestOneBit2;
            i10 = 1;
        }
        int i18 = 0;
        while (i14 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i14);
            int i19 = i18 * 2;
            if (otherNode.hasEntryAt$runtime_release(iLowestOneBit3)) {
                int iEntryKeyIndex$runtime_release5 = otherNode.entryKeyIndex$runtime_release(iLowestOneBit3);
                Object[] objArr3 = trieNode.buffer;
                objArr3[i19] = otherNode.buffer[iEntryKeyIndex$runtime_release5];
                objArr3[i19 + 1] = otherNode.n(iEntryKeyIndex$runtime_release5);
                if (hasEntryAt$runtime_release(iLowestOneBit3)) {
                    intersectionCounter.setCount(intersectionCounter.getCount() + 1);
                }
                i18++;
                i14 ^= iLowestOneBit3;
            } else {
                int iEntryKeyIndex$runtime_release6 = entryKeyIndex$runtime_release(iLowestOneBit3);
                Object[] objArr4 = trieNode.buffer;
                objArr4[i19] = this.buffer[iEntryKeyIndex$runtime_release6];
                objArr4[i19 + 1] = n(iEntryKeyIndex$runtime_release6);
            }
            i18++;
            i14 ^= iLowestOneBit3;
        }
        if (e(trieNode)) {
            return this;
        }
        return otherNode.e(trieNode) ? otherNode : (TrieNode<K, V>) trieNode;
    }

    @Nullable
    public final TrieNode<K, V> mutableRemove(int keyHash, K key, int shift, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        TrieNode<K, V> trieNodeMutableRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            return Intrinsics.areEqual(key, this.buffer[iEntryKeyIndex$runtime_release]) ? i(iEntryKeyIndex$runtime_release, iIndexSegment, mutator) : this;
        }
        if (!f(iIndexSegment)) {
            return this;
        }
        int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
        if (shift == 30) {
            IntProgression intProgressionStep = c.step(c.until(0, trieNodeNodeAtIndex$runtime_release.buffer.length), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    if (!Intrinsics.areEqual(key, trieNodeNodeAtIndex$runtime_release.buffer[first])) {
                        if (first == last) {
                            trieNodeMutableRemove = trieNodeNodeAtIndex$runtime_release;
                            break;
                        }
                        first += step;
                    } else {
                        trieNodeMutableRemove = trieNodeNodeAtIndex$runtime_release.h(first, mutator);
                        break;
                    }
                }
            } else {
                trieNodeMutableRemove = trieNodeNodeAtIndex$runtime_release;
                break;
            }
        } else {
            trieNodeMutableRemove = trieNodeNodeAtIndex$runtime_release.mutableRemove(keyHash, key, shift + 5, mutator);
        }
        return j(trieNodeNodeAtIndex$runtime_release, trieNodeMutableRemove, iNodeIndex$runtime_release, iIndexSegment, mutator.getOwnership());
    }

    public final V n(int i10) {
        return (V) this.buffer[i10 + 1];
    }

    @NotNull
    public final TrieNode<K, V> nodeAtIndex$runtime_release(int nodeIndex) {
        Object obj = this.buffer[nodeIndex];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (TrieNode) obj;
    }

    public final int nodeIndex$runtime_release(int positionMask) {
        return (this.buffer.length - 1) - Integer.bitCount((positionMask - 1) & this.f14950b);
    }

    @Nullable
    public final ModificationResult<K, V> put(int keyHash, K key, V value, int shift) {
        ModificationResult<K, V> modificationResultPut;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (!Intrinsics.areEqual(key, this.buffer[iEntryKeyIndex$runtime_release])) {
                return new ModificationResult<>(new TrieNode(this.f14949a ^ iIndexSegment, this.f14950b | iIndexSegment, b(iEntryKeyIndex$runtime_release, iIndexSegment, keyHash, key, value, shift, null)), 1);
            }
            if (n(iEntryKeyIndex$runtime_release) == value) {
                return null;
            }
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iEntryKeyIndex$runtime_release + 1] = value;
            return new ModificationResult<>(new TrieNode(this.f14949a, this.f14950b, objArrCopyOf), 0);
        }
        if (!f(iIndexSegment)) {
            return new ModificationResult<>(new TrieNode(this.f14949a | iIndexSegment, this.f14950b, TrieNodeKt.access$insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release(iIndexSegment), key, value)), 1);
        }
        int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
        if (shift == 30) {
            IntProgression intProgressionStep = c.step(c.until(0, trieNodeNodeAtIndex$runtime_release.buffer.length), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    if (!Intrinsics.areEqual(key, trieNodeNodeAtIndex$runtime_release.buffer[first])) {
                        if (first == last) {
                            modificationResultPut = new ModificationResult<>(new TrieNode(0, 0, TrieNodeKt.access$insertEntryAtIndex(trieNodeNodeAtIndex$runtime_release.buffer, 0, key, value)), 1);
                            break;
                        }
                        first += step;
                    } else {
                        if (value != trieNodeNodeAtIndex$runtime_release.n(first)) {
                            Object[] objArr2 = trieNodeNodeAtIndex$runtime_release.buffer;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(this, size)");
                            objArrCopyOf2[first + 1] = value;
                            modificationResultPut = new ModificationResult<>(new TrieNode(0, 0, objArrCopyOf2), 0);
                            break;
                        }
                        modificationResultPut = null;
                        break;
                    }
                }
            } else {
                modificationResultPut = new ModificationResult<>(new TrieNode(0, 0, TrieNodeKt.access$insertEntryAtIndex(trieNodeNodeAtIndex$runtime_release.buffer, 0, key, value)), 1);
                break;
            }
            if (modificationResultPut == null) {
                return null;
            }
        } else {
            modificationResultPut = trieNodeNodeAtIndex$runtime_release.put(keyHash, key, value, shift + 5);
            if (modificationResultPut == null) {
                return null;
            }
        }
        modificationResultPut.setNode(m(iNodeIndex$runtime_release, iIndexSegment, modificationResultPut.getNode()));
        return modificationResultPut;
    }

    @Nullable
    public final TrieNode<K, V> remove(int keyHash, K key, int shift) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        TrieNode<K, V> trieNodeRemove = null;
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (!Intrinsics.areEqual(key, this.buffer[iEntryKeyIndex$runtime_release])) {
                return this;
            }
            Object[] objArr = this.buffer;
            if (objArr.length == 2) {
                return null;
            }
            return new TrieNode<>(this.f14949a ^ iIndexSegment, this.f14950b, TrieNodeKt.access$removeEntryAtIndex(objArr, iEntryKeyIndex$runtime_release));
        }
        if (!f(iIndexSegment)) {
            return this;
        }
        int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
        if (shift == 30) {
            IntProgression intProgressionStep = c.step(c.until(0, trieNodeNodeAtIndex$runtime_release.buffer.length), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    if (!Intrinsics.areEqual(key, trieNodeNodeAtIndex$runtime_release.buffer[first])) {
                        if (first == last) {
                            trieNodeRemove = trieNodeNodeAtIndex$runtime_release;
                            break;
                        }
                        first += step;
                    } else {
                        Object[] objArr2 = trieNodeNodeAtIndex$runtime_release.buffer;
                        if (objArr2.length == 2) {
                            break;
                        }
                        trieNodeRemove = new TrieNode<>(0, 0, TrieNodeKt.access$removeEntryAtIndex(objArr2, first));
                        break;
                    }
                }
            } else {
                trieNodeRemove = trieNodeNodeAtIndex$runtime_release;
                break;
            }
        } else {
            trieNodeRemove = trieNodeNodeAtIndex$runtime_release.remove(keyHash, key, shift + 5);
        }
        return l(trieNodeNodeAtIndex$runtime_release, trieNodeRemove, iNodeIndex$runtime_release, iIndexSegment);
    }

    public TrieNode(int i10, int i11, @NotNull Object[] objArr) {
        this(i10, i11, objArr, null);
    }

    @Nullable
    public final TrieNode<K, V> mutableRemove(int keyHash, K key, V value, int shift, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        TrieNode<K, V> trieNodeMutableRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            return (Intrinsics.areEqual(key, this.buffer[iEntryKeyIndex$runtime_release]) && Intrinsics.areEqual(value, n(iEntryKeyIndex$runtime_release))) ? i(iEntryKeyIndex$runtime_release, iIndexSegment, mutator) : this;
        }
        if (!f(iIndexSegment)) {
            return this;
        }
        int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
        if (shift == 30) {
            IntProgression intProgressionStep = c.step(c.until(0, trieNodeNodeAtIndex$runtime_release.buffer.length), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    if (!Intrinsics.areEqual(key, trieNodeNodeAtIndex$runtime_release.buffer[first]) || !Intrinsics.areEqual(value, trieNodeNodeAtIndex$runtime_release.n(first))) {
                        if (first == last) {
                            trieNodeMutableRemove = trieNodeNodeAtIndex$runtime_release;
                            break;
                        }
                        first += step;
                    } else {
                        trieNodeMutableRemove = trieNodeNodeAtIndex$runtime_release.h(first, mutator);
                        break;
                    }
                }
            } else {
                trieNodeMutableRemove = trieNodeNodeAtIndex$runtime_release;
                break;
            }
        } else {
            trieNodeMutableRemove = trieNodeNodeAtIndex$runtime_release.mutableRemove(keyHash, key, value, shift + 5, mutator);
        }
        return j(trieNodeNodeAtIndex$runtime_release, trieNodeMutableRemove, iNodeIndex$runtime_release, iIndexSegment, mutator.getOwnership());
    }

    @Nullable
    public final TrieNode<K, V> remove(int keyHash, K key, V value, int shift) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        TrieNode<K, V> trieNodeRemove = null;
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (!Intrinsics.areEqual(key, this.buffer[iEntryKeyIndex$runtime_release]) || !Intrinsics.areEqual(value, n(iEntryKeyIndex$runtime_release))) {
                return this;
            }
            Object[] objArr = this.buffer;
            if (objArr.length == 2) {
                return null;
            }
            return new TrieNode<>(this.f14949a ^ iIndexSegment, this.f14950b, TrieNodeKt.access$removeEntryAtIndex(objArr, iEntryKeyIndex$runtime_release));
        }
        if (!f(iIndexSegment)) {
            return this;
        }
        int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
        if (shift == 30) {
            IntProgression intProgressionStep = c.step(c.until(0, trieNodeNodeAtIndex$runtime_release.buffer.length), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    if (!Intrinsics.areEqual(key, trieNodeNodeAtIndex$runtime_release.buffer[first]) || !Intrinsics.areEqual(value, trieNodeNodeAtIndex$runtime_release.n(first))) {
                        if (first == last) {
                            trieNodeRemove = trieNodeNodeAtIndex$runtime_release;
                            break;
                        }
                        first += step;
                    } else {
                        Object[] objArr2 = trieNodeNodeAtIndex$runtime_release.buffer;
                        if (objArr2.length == 2) {
                            break;
                        }
                        trieNodeRemove = new TrieNode<>(0, 0, TrieNodeKt.access$removeEntryAtIndex(objArr2, first));
                        break;
                    }
                }
            } else {
                trieNodeRemove = trieNodeNodeAtIndex$runtime_release;
                break;
            }
        } else {
            trieNodeRemove = trieNodeNodeAtIndex$runtime_release.remove(keyHash, key, value, shift + 5);
        }
        return l(trieNodeNodeAtIndex$runtime_release, trieNodeRemove, iNodeIndex$runtime_release, iIndexSegment);
    }
}
