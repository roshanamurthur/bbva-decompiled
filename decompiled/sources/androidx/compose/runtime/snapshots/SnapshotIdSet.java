package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Immutable;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mypinpad.tsdk.isolation.y2;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnapshotIdSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0096\u0002J:\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002'\u0010\u0013\u001a#\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u000fH\u0086\bJ\u001d\u0010\u0018\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u0015H\u0086\bJ\u000e\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0016¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "bit", "", "get", SetCommand.ID, ClearCommand.ID, "bits", "andNot", "and", "or", "", "iterator", "initial", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "acc", "operation", "fastFold", "Lkotlin/Function1;", "", "block", "fastForEach", "default", "lowest", "", "toString", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@SourceDebugExtension({"SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,382:1\n317#1,28:385\n317#1,28:413\n317#1,28:441\n317#1,28:469\n317#1,28:497\n325#1,20:525\n13600#2,2:383\n1549#3:545\n1620#3,3:546\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n*L\n236#1:385,28\n257#1:413,28\n261#1:441,28\n283#1:469,28\n286#1:497,28\n318#1:525,20\n107#1:383,2\n354#1:545\n354#1:546,3\n*E\n"})
public final class SnapshotIdSet implements Iterable<Integer>, KMappedMarker {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public static final SnapshotIdSet f15278t0 = new SnapshotIdSet(0, 0, 0, null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f15279p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f15280q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f15281r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public final int[] f15282s0;

    /* JADX INFO: compiled from: SnapshotIdSet.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getEMPTY", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.f15278t0;
        }
    }

    /* JADX INFO: compiled from: SnapshotIdSet.kt */
    @DebugMetadata(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", i = {0, 0, 1, 1, 2, 2}, l = {295, 300, 307}, m = "invokeSuspend", n = {"$this$sequence", "belowBound", "$this$sequence", FirebaseAnalytics.Param.INDEX, "$this$sequence", FirebaseAnalytics.Param.INDEX}, s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
    public static final class a extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int[] f15283p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f15284q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f15285r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f15286s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public /* synthetic */ Object f15287t0;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = SnapshotIdSet.this.new a(continuation);
            aVar.f15287t0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super Integer> sequenceScope, Continuation<? super Unit> continuation) {
            return ((a) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x008d  */
        /* JADX WARN: Code duplicated, block: B:28:0x009b  */
        /* JADX WARN: Code duplicated, block: B:30:0x00b2 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:19:0x0079). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0099 -> B:31:0x00b3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b0 -> B:31:0x00b3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00ea -> B:43:0x00ee). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00ed -> B:43:0x00ee). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 243
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public SnapshotIdSet(long j10, long j11, int i10, int[] iArr) {
        this.f15279p0 = j10;
        this.f15280q0 = j11;
        this.f15281r0 = i10;
        this.f15282s0 = iArr;
    }

    @NotNull
    public final SnapshotIdSet and(@NotNull SnapshotIdSet bits) {
        int[] iArr;
        SnapshotIdSet snapshotIdSet = f15278t0;
        if (Intrinsics.areEqual(bits, snapshotIdSet) || Intrinsics.areEqual(this, snapshotIdSet)) {
            return snapshotIdSet;
        }
        int i10 = bits.f15281r0;
        int i11 = this.f15281r0;
        if (i10 == i11 && bits.f15282s0 == (iArr = this.f15282s0)) {
            long j10 = this.f15279p0;
            long j11 = bits.f15279p0;
            long j12 = j10 & j11;
            long j13 = this.f15280q0;
            SnapshotIdSet snapshotIdSet2 = snapshotIdSet;
            long j14 = bits.f15280q0;
            long j15 = j13 & j14;
            if (j12 != 0 || j15 != 0 || iArr != null) {
                snapshotIdSet2 = new SnapshotIdSet(j10 & j11, j14 & j13, i11, iArr);
            }
            return snapshotIdSet2;
        }
        SnapshotIdSet snapshotIdSet3 = snapshotIdSet;
        int i12 = 0;
        if (this.f15282s0 != null) {
            int[] iArr2 = bits.f15282s0;
            if (iArr2 != null) {
                for (int i13 : iArr2) {
                    if (get(i13)) {
                        snapshotIdSet3 = snapshotIdSet3.set(i13);
                    }
                }
            }
            SnapshotIdSet snapshotIdSet4 = snapshotIdSet3;
            long j16 = 0;
            if (bits.f15280q0 != 0) {
                int i14 = 0;
                while (i14 < 64) {
                    if ((bits.f15280q0 & (1 << i14)) != j16) {
                        int i15 = bits.f15281r0 + i14;
                        if (get(i15)) {
                            snapshotIdSet4 = snapshotIdSet4.set(i15);
                        }
                    }
                    i14++;
                    j16 = 0;
                }
            }
            if (bits.f15279p0 == 0) {
                return snapshotIdSet4;
            }
            while (i12 < 64) {
                if ((bits.f15279p0 & (1 << i12)) != 0) {
                    int i16 = bits.f15281r0 + i12 + 64;
                    if (get(i16)) {
                        snapshotIdSet4 = snapshotIdSet4.set(i16);
                    }
                }
                i12++;
            }
            return snapshotIdSet4;
        }
        int[] iArr3 = this.f15282s0;
        if (iArr3 != null) {
            for (int i17 : iArr3) {
                if (bits.get(i17)) {
                    snapshotIdSet3 = snapshotIdSet3.set(i17);
                }
            }
        }
        SnapshotIdSet snapshotIdSet5 = snapshotIdSet3;
        long j17 = 0;
        if (this.f15280q0 != 0) {
            int i18 = 0;
            while (i18 < 64) {
                if ((this.f15280q0 & (1 << i18)) != j17) {
                    int i19 = this.f15281r0 + i18;
                    if (bits.get(i19)) {
                        snapshotIdSet5 = snapshotIdSet5.set(i19);
                    }
                }
                i18++;
                j17 = 0;
            }
        }
        long j18 = 0;
        if (this.f15279p0 == 0) {
            return snapshotIdSet5;
        }
        while (i12 < 64) {
            if ((this.f15279p0 & (1 << i12)) != j18) {
                int i20 = this.f15281r0 + i12 + 64;
                if (bits.get(i20)) {
                    snapshotIdSet5 = snapshotIdSet5.set(i20);
                }
            }
            i12++;
            j18 = 0;
        }
        return snapshotIdSet5;
    }

    @NotNull
    public final SnapshotIdSet andNot(@NotNull SnapshotIdSet bits) {
        SnapshotIdSet snapshotIdSetClear;
        int[] iArr;
        SnapshotIdSet snapshotIdSet = f15278t0;
        if (bits == snapshotIdSet) {
            return this;
        }
        if (this == snapshotIdSet) {
            return snapshotIdSet;
        }
        int i10 = bits.f15281r0;
        int i11 = this.f15281r0;
        if (i10 == i11 && bits.f15282s0 == (iArr = this.f15282s0)) {
            return new SnapshotIdSet(this.f15279p0 & (~bits.f15279p0), (~bits.f15280q0) & this.f15280q0, i11, iArr);
        }
        int[] iArr2 = bits.f15282s0;
        if (iArr2 != null) {
            snapshotIdSetClear = this;
            for (int i12 : iArr2) {
                snapshotIdSetClear = snapshotIdSetClear.clear(i12);
            }
        } else {
            snapshotIdSetClear = this;
        }
        if (bits.f15280q0 != 0) {
            for (int i13 = 0; i13 < 64; i13++) {
                if ((bits.f15280q0 & (1 << i13)) != 0) {
                    snapshotIdSetClear = snapshotIdSetClear.clear(bits.f15281r0 + i13);
                }
            }
        }
        if (bits.f15279p0 != 0) {
            for (int i14 = 0; i14 < 64; i14++) {
                if ((bits.f15279p0 & (1 << i14)) != 0) {
                    snapshotIdSetClear = snapshotIdSetClear.clear(bits.f15281r0 + i14 + 64);
                }
            }
        }
        return snapshotIdSetClear;
    }

    @NotNull
    public final SnapshotIdSet clear(int bit) {
        int[] iArr;
        int iBinarySearch;
        int i10 = this.f15281r0;
        int i11 = bit - i10;
        if (i11 >= 0 && i11 < 64) {
            long j10 = 1 << i11;
            long j11 = this.f15280q0;
            if ((j11 & j10) != 0) {
                return new SnapshotIdSet(this.f15279p0, j11 & (~j10), i10, this.f15282s0);
            }
        } else if (i11 >= 64 && i11 < 128) {
            long j12 = 1 << (i11 - 64);
            long j13 = this.f15279p0;
            if ((j13 & j12) != 0) {
                return new SnapshotIdSet(j13 & (~j12), this.f15280q0, i10, this.f15282s0);
            }
        } else if (i11 < 0 && (iArr = this.f15282s0) != null && (iBinarySearch = SnapshotIdSetKt.binarySearch(iArr, bit)) >= 0) {
            int length = iArr.length;
            int i12 = length - 1;
            if (i12 == 0) {
                return new SnapshotIdSet(this.f15279p0, this.f15280q0, this.f15281r0, null);
            }
            int[] iArr2 = new int[i12];
            if (iBinarySearch > 0) {
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, 0, 0, iBinarySearch);
            }
            if (iBinarySearch < i12) {
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, iBinarySearch, iBinarySearch + 1, length);
            }
            return new SnapshotIdSet(this.f15279p0, this.f15280q0, this.f15281r0, iArr2);
        }
        return this;
    }

    @NotNull
    public final SnapshotIdSet fastFold(@NotNull SnapshotIdSet initial, @NotNull Function2<? super SnapshotIdSet, ? super Integer, SnapshotIdSet> operation) {
        int[] iArr = this.f15282s0;
        if (iArr != null) {
            for (int i10 : iArr) {
                initial = operation.invoke(initial, Integer.valueOf(i10));
            }
        }
        if (this.f15280q0 != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((this.f15280q0 & (1 << i11)) != 0) {
                    initial = operation.invoke(initial, Integer.valueOf(this.f15281r0 + i11));
                }
            }
        }
        if (this.f15279p0 != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((this.f15279p0 & (1 << i12)) != 0) {
                    initial = operation.invoke(initial, Integer.valueOf(this.f15281r0 + i12 + 64));
                }
            }
        }
        return initial;
    }

    public final void fastForEach(@NotNull Function1<? super Integer, Unit> block) {
        int[] iArr = this.f15282s0;
        if (iArr != null) {
            for (int i10 : iArr) {
                block.invoke(Integer.valueOf(i10));
            }
        }
        if (this.f15280q0 != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((this.f15280q0 & (1 << i11)) != 0) {
                    block.invoke(Integer.valueOf(this.f15281r0 + i11));
                }
            }
        }
        if (this.f15279p0 != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((this.f15279p0 & (1 << i12)) != 0) {
                    block.invoke(Integer.valueOf(this.f15281r0 + i12 + 64));
                }
            }
        }
    }

    public final boolean get(int bit) {
        int[] iArr;
        int i10 = bit - this.f15281r0;
        if (i10 >= 0 && i10 < 64) {
            return ((1 << i10) & this.f15280q0) != 0;
        }
        if (i10 >= 64 && i10 < 128) {
            return ((1 << (i10 - 64)) & this.f15279p0) != 0;
        }
        if (i10 <= 0 && (iArr = this.f15282s0) != null) {
            return SnapshotIdSetKt.binarySearch(iArr, bit) >= 0;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Integer> iterator() {
        return SequencesKt__SequenceBuilderKt.sequence(new a(null)).iterator();
    }

    public final int lowest(int i10) {
        int[] iArr = this.f15282s0;
        if (iArr != null) {
            return iArr[0];
        }
        long j10 = this.f15280q0;
        int i11 = this.f15281r0;
        if (j10 != 0) {
            return Long.numberOfTrailingZeros(j10) + i11;
        }
        long j11 = this.f15279p0;
        if (j11 == 0) {
            return i10;
        }
        return Long.numberOfTrailingZeros(j11) + i11 + 64;
    }

    @NotNull
    public final SnapshotIdSet or(@NotNull SnapshotIdSet bits) {
        SnapshotIdSet snapshotIdSet;
        int[] iArr;
        SnapshotIdSet snapshotIdSet2 = f15278t0;
        if (bits == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return bits;
        }
        int i10 = bits.f15281r0;
        int i11 = this.f15281r0;
        if (i10 == i11 && bits.f15282s0 == (iArr = this.f15282s0)) {
            return new SnapshotIdSet(this.f15279p0 | bits.f15279p0, this.f15280q0 | bits.f15280q0, i11, iArr);
        }
        int i12 = 0;
        if (this.f15282s0 == null) {
            int[] iArr2 = this.f15282s0;
            if (iArr2 != null) {
                for (int i13 : iArr2) {
                    bits = bits.set(i13);
                }
            }
            if (this.f15280q0 != 0) {
                for (int i14 = 0; i14 < 64; i14++) {
                    if ((this.f15280q0 & (1 << i14)) != 0) {
                        bits = bits.set(this.f15281r0 + i14);
                    }
                }
            }
            if (this.f15279p0 != 0) {
                while (i12 < 64) {
                    if ((this.f15279p0 & (1 << i12)) != 0) {
                        bits = bits.set(this.f15281r0 + i12 + 64);
                    }
                    i12++;
                }
            }
            return bits;
        }
        int[] iArr3 = bits.f15282s0;
        if (iArr3 != null) {
            snapshotIdSet = this;
            for (int i15 : iArr3) {
                snapshotIdSet = snapshotIdSet.set(i15);
            }
        } else {
            snapshotIdSet = this;
        }
        if (bits.f15280q0 != 0) {
            for (int i16 = 0; i16 < 64; i16++) {
                if ((bits.f15280q0 & (1 << i16)) != 0) {
                    snapshotIdSet = snapshotIdSet.set(bits.f15281r0 + i16);
                }
            }
        }
        if (bits.f15279p0 != 0) {
            while (i12 < 64) {
                if ((bits.f15279p0 & (1 << i12)) != 0) {
                    snapshotIdSet = snapshotIdSet.set(bits.f15281r0 + i12 + 64);
                }
                i12++;
            }
        }
        return snapshotIdSet;
    }

    @NotNull
    public final SnapshotIdSet set(int bit) {
        long j10;
        int i10;
        int[] intArray;
        int i11 = this.f15281r0;
        int i12 = bit - i11;
        long j11 = this.f15280q0;
        if (i12 < 0 || i12 >= 64) {
            long j12 = this.f15279p0;
            if (i12 < 64 || i12 >= 128) {
                int[] iArr = this.f15282s0;
                if (i12 < 128) {
                    if (iArr == null) {
                        return new SnapshotIdSet(this.f15279p0, this.f15280q0, i11, new int[]{bit});
                    }
                    int iBinarySearch = SnapshotIdSetKt.binarySearch(iArr, bit);
                    if (iBinarySearch < 0) {
                        int i13 = -(iBinarySearch + 1);
                        int length = iArr.length;
                        int[] iArr2 = new int[length + 1];
                        ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, 0, 0, i13);
                        ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, i13 + 1, i13, length);
                        iArr2[i13] = bit;
                        return new SnapshotIdSet(this.f15279p0, this.f15280q0, this.f15281r0, iArr2);
                    }
                } else if (!get(bit)) {
                    int i14 = ((bit + 1) / 64) * 64;
                    int i15 = this.f15281r0;
                    ArrayList arrayList = null;
                    long j13 = j12;
                    while (true) {
                        if (i15 >= i14) {
                            j10 = j11;
                            i10 = i15;
                            break;
                        }
                        if (j11 != 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                if (iArr != null) {
                                    for (int i16 : iArr) {
                                        arrayList.add(Integer.valueOf(i16));
                                    }
                                }
                            }
                            for (int i17 = 0; i17 < 64; i17++) {
                                if (((1 << i17) & j11) != 0) {
                                    arrayList.add(Integer.valueOf(i17 + i15));
                                }
                            }
                        }
                        if (j13 == 0) {
                            i10 = i14;
                            j10 = 0;
                            break;
                        }
                        i15 += 64;
                        j11 = j13;
                        j13 = 0;
                    }
                    return new SnapshotIdSet(j13, j10, i10, (arrayList == null || (intArray = CollectionsKt___CollectionsKt.toIntArray(arrayList)) == null) ? iArr : intArray).set(bit);
                }
            } else {
                long j14 = 1 << (i12 - 64);
                if ((j12 & j14) == 0) {
                    return new SnapshotIdSet(j12 | j14, this.f15280q0, i11, this.f15282s0);
                }
            }
        } else {
            long j15 = 1 << i12;
            if ((j11 & j15) == 0) {
                return new SnapshotIdSet(this.f15279p0, j11 | j15, i11, this.f15282s0);
            }
        }
        return this;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(this, 10));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        return y2.b(sb2, ListUtilsKt.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null), AbstractJsonLexerKt.END_LIST);
    }
}
