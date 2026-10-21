package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b#\b\u0017\u0018\u00002\u00020\u0001BE\b\u0000\u0012\u0006\u0010+\u001a\u00020\u001b\u0012\u0006\u0010t\u001a\u00020 \u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\bu\u0010vJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J8\u0010\t\u001a\u00020\u00002\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\u001e\u0010\r\u001a\u00020\u00012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0016J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0019\u0010\u0015J5\u0010$\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#J$\u0010*\u001a\u00028\u0000\"\u0004\b\u0000\u0010%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0080\b¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0000¢\u0006\u0004\b(\u0010\u0015J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u001bH\u0000¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u001bH\u0000¢\u0006\u0004\b/\u0010-J\u0017\u00105\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104J\u0017\u00109\u001a\u00020\u00062\u0006\u00106\u001a\u00020 H\u0000¢\u0006\u0004\b7\u00108J\u0017\u0010>\u001a\u00020\u00062\u0006\u0010;\u001a\u00020:H\u0010¢\u0006\u0004\b<\u0010=R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010BR\"\u0010J\u001a\u00020\u001b8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010-R:\u0010S\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010K2\u000e\u0010L\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010K8\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR*\u0010[\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010T8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010a\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u00108R\"\u0010g\u001a\u0002018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u00104R\"\u0010n\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0014\u0010p\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010kR\u0014\u0010s\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010r¨\u0006w"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "hasPendingChanges", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "takeNestedMutableSnapshot", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "apply", "dispose", "takeNestedSnapshot", "snapshot", "nestedActivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "notifyObjectsInitialized$runtime_release", "()V", "notifyObjectsInitialized", "closeLocked$runtime_release", "closeLocked", "releasePinnedSnapshotsForCloseLocked$runtime_release", "releasePinnedSnapshotsForCloseLocked", "", "snapshotId", "", "Landroidx/compose/runtime/snapshots/StateRecord;", "optimisticMerges", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalidSnapshots", "innerApplyLocked$runtime_release", "(ILjava/util/Map;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "innerApplyLocked", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "block", "advance$runtime_release", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "advance", "id", "recordPrevious$runtime_release", "(I)V", "recordPrevious", "recordPreviousPinnedSnapshot$runtime_release", "recordPreviousPinnedSnapshot", "", "handles", "recordPreviousPinnedSnapshots$runtime_release", "([I)V", "recordPreviousPinnedSnapshots", "snapshots", "recordPreviousList$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "recordPreviousList", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "e", "Lkotlin/jvm/functions/Function1;", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "f", "getWriteObserver$runtime_release", "g", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getWriteCount$runtime_release", "()I", "setWriteCount$runtime_release", "writeCount", "Landroidx/collection/MutableScatterSet;", "<set-?>", "h", "Landroidx/collection/MutableScatterSet;", "getModified$runtime_release", "()Landroidx/collection/MutableScatterSet;", "setModified", "(Landroidx/collection/MutableScatterSet;)V", "modified", "", "i", "Ljava/util/List;", "getMerged$runtime_release", "()Ljava/util/List;", "setMerged$runtime_release", "(Ljava/util/List;)V", "merged", "j", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getPreviousIds$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setPreviousIds$runtime_release", "previousIds", "k", "[I", "getPreviousPinnedSnapshots$runtime_release", "()[I", "setPreviousPinnedSnapshots$runtime_release", "previousPinnedSnapshots", "m", "Z", "getApplied$runtime_release", "()Z", "setApplied$runtime_release", "(Z)V", "applied", "getReadOnly", "readOnly", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "root", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 8 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2431:1\n1099#1,2:2432\n1105#1,3:2436\n1108#1,6:2441\n1099#1,2:2523\n1105#1,3:2527\n1108#1,6:2532\n1099#1,9:2629\n1108#1,6:2640\n1843#2:2434\n1843#2:2439\n1843#2:2447\n1843#2:2461\n1843#2:2525\n1843#2:2530\n1843#2:2618\n1843#2:2627\n1843#2:2638\n1843#2:2646\n1843#2:2648\n89#3:2435\n89#3:2440\n89#3:2448\n89#3:2462\n89#3:2526\n89#3:2531\n89#3:2619\n89#3:2628\n89#3:2639\n89#3:2647\n89#3:2649\n33#4,6:2449\n33#4,6:2455\n33#4,6:2517\n33#4,4:2614\n38#4:2620\n33#4,6:2621\n267#5,4:2463\n237#5,7:2467\n248#5,3:2475\n251#5,2:2479\n272#5,2:2481\n254#5,6:2483\n274#5:2489\n267#5,4:2490\n237#5,7:2494\n248#5,3:2502\n251#5,2:2506\n272#5,2:2508\n254#5,6:2510\n274#5:2516\n267#5,4:2560\n237#5,7:2564\n248#5,3:2572\n251#5,2:2576\n272#5,2:2578\n254#5,6:2580\n274#5:2586\n267#5,4:2587\n237#5,7:2591\n248#5,3:2599\n251#5,2:2603\n272#5,2:2605\n254#5,6:2607\n274#5:2613\n1810#6:2474\n1672#6:2478\n1810#6:2501\n1672#6:2505\n1810#6:2571\n1672#6:2575\n1810#6:2598\n1672#6:2602\n33#7,7:2538\n50#7,7:2545\n50#7,7:2553\n201#8:2552\n1#9:2650\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n*L\n785#1:2432,2\n785#1:2436,3\n785#1:2441,6\n920#1:2523,2\n920#1:2527,3\n920#1:2532,6\n1116#1:2629,9\n1116#1:2640,6\n786#1:2434\n785#1:2439\n837#1:2447\n893#1:2461\n921#1:2525\n920#1:2530\n1082#1:2618\n1107#1:2627\n1116#1:2638\n1119#1:2646\n1143#1:2648\n786#1:2435\n785#1:2440\n837#1:2448\n893#1:2462\n921#1:2526\n920#1:2531\n1082#1:2619\n1107#1:2628\n1116#1:2639\n1119#1:2647\n1143#1:2649\n877#1:2449,6\n885#1:2455,6\n898#1:2517,6\n1079#1:2614,4\n1079#1:2620\n1090#1:2621,6\n896#1:2463,4\n896#1:2467,7\n896#1:2475,3\n896#1:2479,2\n896#1:2481,2\n896#1:2483,6\n896#1:2489\n897#1:2490,4\n897#1:2494,7\n897#1:2502,3\n897#1:2506,2\n897#1:2508,2\n897#1:2510,6\n897#1:2516\n985#1:2560,4\n985#1:2564,7\n985#1:2572,3\n985#1:2576,2\n985#1:2578,2\n985#1:2580,6\n985#1:2586\n1020#1:2587,4\n1020#1:2591,7\n1020#1:2599,3\n1020#1:2603,2\n1020#1:2605,2\n1020#1:2607,6\n1020#1:2613\n896#1:2474\n896#1:2478\n897#1:2501\n897#1:2505\n985#1:2571\n985#1:2575\n1020#1:2598\n1020#1:2602\n937#1:2538,7\n961#1:2545,7\n967#1:2553,7\n967#1:2552\n*E\n"})
public class MutableSnapshot extends Snapshot {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final int[] f15250n = new int[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Function1<Object, Unit> readObserver;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Function1<Object, Unit> writeObserver;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int writeCount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public MutableScatterSet<StateObject> modified;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public List<? extends StateObject> merged;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public SnapshotIdSet previousIds;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public int[] previousPinnedSnapshots;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15258l;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean applied;

    public MutableSnapshot(int i10, @NotNull SnapshotIdSet snapshotIdSet, @Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function2) {
        super(i10, snapshotIdSet, null);
        this.readObserver = function1;
        this.writeObserver = function2;
        this.previousIds = SnapshotIdSet.INSTANCE.getEMPTY();
        this.previousPinnedSnapshots = f15250n;
        this.f15258l = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutableSnapshot takeNestedMutableSnapshot$default(MutableSnapshot mutableSnapshot, Function1 function1, Function1 function2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
        }
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        return mutableSnapshot.takeNestedMutableSnapshot(function1, function2);
    }

    public final <T> T advance$runtime_release(@NotNull Function0<? extends T> block) {
        recordPrevious$runtime_release(getId());
        T tInvoke = block.invoke();
        if (!getApplied() && !getDisposed()) {
            int id = getId();
            synchronized (SnapshotKt.getLock()) {
                try {
                    int i10 = SnapshotKt.f15293e;
                    SnapshotKt.f15293e = i10 + 1;
                    setId$runtime_release(i10);
                    SnapshotKt.f15292d = SnapshotKt.f15292d.set(getId());
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                } catch (Throwable th2) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th2;
                }
            }
            InlineMarker.finallyEnd(1);
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), id + 1, getId()));
        }
        return tInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x014c A[Catch: all -> 0x0141, LOOP:2: B:48:0x0117->B:60:0x014c, LOOP_END, TryCatch #0 {all -> 0x0141, blocks: (B:43:0x00fb, B:45:0x010d, B:48:0x0117, B:50:0x0123, B:52:0x012d, B:54:0x0135, B:57:0x0144, B:60:0x014c, B:62:0x0154, B:65:0x015e, B:67:0x0168, B:69:0x0172, B:71:0x017a, B:72:0x0185, B:78:0x0192, B:79:0x0195, B:81:0x0199, B:83:0x01a0, B:84:0x01ac), top: B:92:0x00fb }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0152 A[EDGE_INSN: B:99:0x0152->B:61:0x0152 BREAK  A[LOOP:2: B:48:0x0117->B:60:0x014c], SYNTHETIC] */
    @NotNull
    public SnapshotApplyResult apply() {
        MutableScatterSet<StateObject> modified$runtime_release;
        MutableScatterSet<StateObject> modified$runtime_release2 = getModified$runtime_release();
        Map<StateRecord, ? extends StateRecord> mapAccess$optimisticMerges = modified$runtime_release2 != null ? SnapshotKt.access$optimisticMerges((MutableSnapshot) SnapshotKt.f15298j.get(), this, SnapshotKt.f15292d.clear(((GlobalSnapshot) SnapshotKt.f15298j.get()).getId())) : null;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        synchronized (SnapshotKt.getLock()) {
            try {
                SnapshotKt.access$validateOpen(this);
                if (modified$runtime_release2 == null || modified$runtime_release2.get_size() == 0) {
                    closeLocked$runtime_release();
                    GlobalSnapshot globalSnapshot = (GlobalSnapshot) SnapshotKt.f15298j.get();
                    SnapshotKt.h(globalSnapshot, SnapshotKt.f15289a);
                    modified$runtime_release = globalSnapshot.getModified$runtime_release();
                    if (modified$runtime_release == null || !modified$runtime_release.isNotEmpty()) {
                        modified$runtime_release = null;
                    } else {
                        listEmptyList = SnapshotKt.f15296h;
                    }
                } else {
                    GlobalSnapshot globalSnapshot2 = (GlobalSnapshot) SnapshotKt.f15298j.get();
                    SnapshotApplyResult snapshotApplyResultInnerApplyLocked$runtime_release = innerApplyLocked$runtime_release(SnapshotKt.f15293e, mapAccess$optimisticMerges, SnapshotKt.f15292d.clear(globalSnapshot2.getId()));
                    if (!Intrinsics.areEqual(snapshotApplyResultInnerApplyLocked$runtime_release, SnapshotApplyResult.Success.INSTANCE)) {
                        return snapshotApplyResultInnerApplyLocked$runtime_release;
                    }
                    closeLocked$runtime_release();
                    SnapshotKt.h(globalSnapshot2, SnapshotKt.f15289a);
                    modified$runtime_release = globalSnapshot2.getModified$runtime_release();
                    setModified(null);
                    globalSnapshot2.setModified(null);
                    listEmptyList = SnapshotKt.f15296h;
                }
                Unit unit = Unit.INSTANCE;
                this.applied = true;
                if (modified$runtime_release != null) {
                    Set setWrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(modified$runtime_release);
                    if (true ^ setWrapIntoSet.isEmpty()) {
                        int size = listEmptyList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ((Function2) listEmptyList.get(i10)).invoke(setWrapIntoSet, this);
                        }
                    }
                }
                if (modified$runtime_release2 != null && modified$runtime_release2.isNotEmpty()) {
                    Set setWrapIntoSet2 = ScatterSetWrapperKt.wrapIntoSet(modified$runtime_release2);
                    int size2 = listEmptyList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((Function2) listEmptyList.get(i11)).invoke(setWrapIntoSet2, this);
                    }
                }
                synchronized (SnapshotKt.getLock()) {
                    try {
                        releasePinnedSnapshotsForCloseLocked$runtime_release();
                        SnapshotKt.b();
                        if (modified$runtime_release != null) {
                            Object[] objArr = modified$runtime_release.elements;
                            long[] jArr = modified$runtime_release.metadata;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j10 = jArr[i12];
                                    long[] jArr2 = jArr;
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                        jArr = jArr2;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j10 & 255) < 128) {
                                                SnapshotKt.access$processForUnusedRecordsLocked((StateObject) objArr[(i12 << 3) + i14]);
                                            }
                                            j10 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                        if (i12 != length) {
                                            break;
                                        }
                                        i12++;
                                        jArr = jArr2;
                                    }
                                }
                            }
                        }
                        if (modified$runtime_release2 != null) {
                            Object[] objArr2 = modified$runtime_release2.elements;
                            long[] jArr3 = modified$runtime_release2.metadata;
                            int length2 = jArr3.length - 2;
                            if (length2 >= 0) {
                                int i15 = 0;
                                while (true) {
                                    long j11 = jArr3[i15];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                        for (int i17 = 0; i17 < i16; i17++) {
                                            if ((j11 & 255) < 128) {
                                                SnapshotKt.access$processForUnusedRecordsLocked((StateObject) objArr2[(i15 << 3) + i17]);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i16 != 8) {
                                            break;
                                        }
                                    }
                                    if (i15 == length2) {
                                        break;
                                    }
                                    i15++;
                                }
                            }
                        }
                        List<? extends StateObject> list = this.merged;
                        if (list != null) {
                            int size3 = list.size();
                            for (int i18 = 0; i18 < size3; i18++) {
                                SnapshotKt.access$processForUnusedRecordsLocked(list.get(i18));
                            }
                        }
                        this.merged = null;
                        Unit unit2 = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return SnapshotApplyResult.Success.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void closeLocked$runtime_release() {
        SnapshotKt.f15292d = SnapshotKt.f15292d.clear(getId()).andNot(this.previousIds);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed()) {
            return;
        }
        super.dispose();
        mo2167nestedDeactivated$runtime_release(this);
    }

    /* JADX INFO: renamed from: getApplied$runtime_release, reason: from getter */
    public final boolean getApplied() {
        return this.applied;
    }

    @Nullable
    public final List<StateObject> getMerged$runtime_release() {
        return this.merged;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public MutableScatterSet<StateObject> getModified$runtime_release() {
        return this.modified;
    }

    @NotNull
    /* JADX INFO: renamed from: getPreviousIds$runtime_release, reason: from getter */
    public final SnapshotIdSet getPreviousIds() {
        return this.previousIds;
    }

    @NotNull
    /* JADX INFO: renamed from: getPreviousPinnedSnapshots$runtime_release, reason: from getter */
    public final int[] getPreviousPinnedSnapshots() {
        return this.previousPinnedSnapshots;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    /* JADX INFO: renamed from: getReadObserver$runtime_release */
    public Function1<Object, Unit> getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: getWriteCount$runtime_release, reason: from getter */
    public int getWriteCount() {
        return this.writeCount;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public Function1<Object, Unit> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        MutableScatterSet<StateObject> modified$runtime_release = getModified$runtime_release();
        return modified$runtime_release != null && modified$runtime_release.isNotEmpty();
    }

    @NotNull
    public final SnapshotApplyResult innerApplyLocked$runtime_release(int snapshotId, @Nullable Map<StateRecord, ? extends StateRecord> optimisticMerges, @NotNull SnapshotIdSet invalidSnapshots) {
        MutableScatterSet<StateObject> mutableScatterSet;
        List<? extends StateObject> listPlus;
        SnapshotIdSet snapshotIdSet;
        Object[] objArr;
        long[] jArr;
        SnapshotIdSet snapshotIdSet2;
        int i10;
        StateRecord stateRecordG;
        StateRecord stateRecordMergeRecords;
        SnapshotIdSet snapshotIdSetOr = getInvalid().set(getId()).or(this.previousIds);
        MutableScatterSet<StateObject> modified$runtime_release = getModified$runtime_release();
        Intrinsics.checkNotNull(modified$runtime_release);
        Object[] objArr2 = modified$runtime_release.elements;
        long[] jArr2 = modified$runtime_release.metadata;
        int length = jArr2.length - 2;
        ArrayList arrayList = null;
        if (length >= 0) {
            listPlus = null;
            int i11 = 0;
            while (true) {
                long j10 = jArr2[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j10 & 255) < 128) {
                            StateObject stateObject = (StateObject) objArr2[(i11 << 3) + i14];
                            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                            StateRecord stateRecordG2 = SnapshotKt.g(firstStateRecord, snapshotId, invalidSnapshots);
                            if (stateRecordG2 == null || (stateRecordG = SnapshotKt.g(firstStateRecord, getId(), snapshotIdSetOr)) == null) {
                                snapshotIdSet2 = snapshotIdSetOr;
                            } else {
                                snapshotIdSet2 = snapshotIdSetOr;
                                if (stateRecordG.getSnapshotId() != 1 && !Intrinsics.areEqual(stateRecordG2, stateRecordG)) {
                                    StateRecord stateRecordG3 = SnapshotKt.g(firstStateRecord, getId(), getInvalid());
                                    if (stateRecordG3 == null) {
                                        SnapshotKt.access$readError();
                                        throw new KotlinNothingValueException();
                                    }
                                    if (optimisticMerges == null || (stateRecordMergeRecords = optimisticMerges.get(stateRecordG2)) == null) {
                                        stateRecordMergeRecords = stateObject.mergeRecords(stateRecordG, stateRecordG2, stateRecordG3);
                                    }
                                    if (stateRecordMergeRecords == null) {
                                        return new SnapshotApplyResult.Failure(this);
                                    }
                                    if (!Intrinsics.areEqual(stateRecordMergeRecords, stateRecordG3)) {
                                        if (Intrinsics.areEqual(stateRecordMergeRecords, stateRecordG2)) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(TuplesKt.to(stateObject, stateRecordG2.create()));
                                            if (listPlus == null) {
                                                listPlus = new ArrayList<>();
                                            }
                                            listPlus.add(stateObject);
                                        } else {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(!Intrinsics.areEqual(stateRecordMergeRecords, stateRecordG) ? TuplesKt.to(stateObject, stateRecordMergeRecords) : TuplesKt.to(stateObject, stateRecordG.create()));
                                        }
                                    }
                                }
                            }
                            i10 = 8;
                        } else {
                            snapshotIdSet2 = snapshotIdSetOr;
                            i10 = i12;
                        }
                        j10 >>= i10;
                        i14++;
                        i12 = i10;
                        objArr2 = objArr2;
                        jArr2 = jArr2;
                        modified$runtime_release = modified$runtime_release;
                        snapshotIdSetOr = snapshotIdSet2;
                    }
                    snapshotIdSet = snapshotIdSetOr;
                    mutableScatterSet = modified$runtime_release;
                    objArr = objArr2;
                    jArr = jArr2;
                    if (i13 != i12) {
                        break;
                    }
                } else {
                    snapshotIdSet = snapshotIdSetOr;
                    mutableScatterSet = modified$runtime_release;
                    objArr = objArr2;
                    jArr = jArr2;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                objArr2 = objArr;
                jArr2 = jArr;
                modified$runtime_release = mutableScatterSet;
                snapshotIdSetOr = snapshotIdSet;
            }
        } else {
            mutableScatterSet = modified$runtime_release;
            listPlus = null;
        }
        if (arrayList != null) {
            advance$runtime_release();
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                Pair pair = (Pair) arrayList.get(i15);
                StateObject stateObject2 = (StateObject) pair.component1();
                StateRecord stateRecord = (StateRecord) pair.component2();
                stateRecord.setSnapshotId$runtime_release(getId());
                synchronized (SnapshotKt.getLock()) {
                    stateRecord.setNext$runtime_release(stateObject2.getFirstStateRecord());
                    stateObject2.prependStateRecord(stateRecord);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        if (listPlus != null) {
            int size2 = listPlus.size();
            for (int i16 = 0; i16 < size2; i16++) {
                mutableScatterSet.remove(listPlus.get(i16));
            }
            List<? extends StateObject> list = this.merged;
            if (list != null) {
                listPlus = CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) listPlus);
            }
            this.merged = listPlus;
        }
        return SnapshotApplyResult.Success.INSTANCE;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedActivated$runtime_release */
    public void mo2166nestedActivated$runtime_release(@NotNull Snapshot snapshot) {
        this.f15258l++;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0096 A[LOOP:0: B:20:0x003e->B:37:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0099 A[EDGE_INSN: B:41:0x0099->B:38:0x0099 BREAK  A[LOOP:0: B:20:0x003e->B:37:0x0096], SYNTHETIC] */
    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedDeactivated$runtime_release */
    public void mo2167nestedDeactivated$runtime_release(@NotNull Snapshot snapshot) {
        if (!(this.f15258l > 0)) {
            PreconditionsKt.throwIllegalArgumentException("no pending nested snapshots");
        }
        int i10 = this.f15258l - 1;
        this.f15258l = i10;
        if (i10 != 0 || this.applied) {
            return;
        }
        MutableScatterSet<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release != null) {
            if (!(true ^ this.applied)) {
                PreconditionsKt.throwIllegalStateException("Unsupported operation on a snapshot that has been applied");
            }
            setModified(null);
            int id = getId();
            Object[] objArr = modified$runtime_release.elements;
            long[] jArr = modified$runtime_release.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j10 = jArr[i11];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i11 != length) {
                            break;
                            break;
                        }
                        i11++;
                    } else {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j10) < 128) {
                                for (StateRecord firstStateRecord = ((StateObject) objArr[(i11 << 3) + i13]).getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
                                    if (firstStateRecord.getSnapshotId() == id || CollectionsKt___CollectionsKt.contains(this.previousIds, Integer.valueOf(firstStateRecord.getSnapshotId()))) {
                                        firstStateRecord.setSnapshotId$runtime_release(0);
                                    }
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        } else if (i11 != length) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
        }
        closeAndReleasePinning$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        if (this.applied || getDisposed()) {
            return;
        }
        advance$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: recordModified$runtime_release */
    public void mo2168recordModified$runtime_release(@NotNull StateObject state) {
        MutableScatterSet<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release == null) {
            modified$runtime_release = ScatterSetKt.mutableScatterSetOf();
            setModified(modified$runtime_release);
        }
        modified$runtime_release.add(state);
    }

    public final void recordPrevious$runtime_release(int id) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.set(id);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void recordPreviousList$runtime_release(@NotNull SnapshotIdSet snapshots) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.or(snapshots);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void recordPreviousPinnedSnapshot$runtime_release(int id) {
        if (id >= 0) {
            this.previousPinnedSnapshots = ArraysKt___ArraysJvmKt.plus(this.previousPinnedSnapshots, id);
        }
    }

    public final void recordPreviousPinnedSnapshots$runtime_release(@NotNull int[] handles) {
        if (handles.length == 0) {
            return;
        }
        int[] iArr = this.previousPinnedSnapshots;
        if (iArr.length != 0) {
            handles = ArraysKt___ArraysJvmKt.plus(iArr, handles);
        }
        this.previousPinnedSnapshots = handles;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        int length = this.previousPinnedSnapshots.length;
        for (int i10 = 0; i10 < length; i10++) {
            SnapshotKt.releasePinningLocked(this.previousPinnedSnapshots[i10]);
        }
        super.releasePinnedSnapshotsForCloseLocked$runtime_release();
    }

    public final void setApplied$runtime_release(boolean z10) {
        this.applied = z10;
    }

    public final void setMerged$runtime_release(@Nullable List<? extends StateObject> list) {
        this.merged = list;
    }

    public void setModified(@Nullable MutableScatterSet<StateObject> mutableScatterSet) {
        this.modified = mutableScatterSet;
    }

    public final void setPreviousIds$runtime_release(@NotNull SnapshotIdSet snapshotIdSet) {
        this.previousIds = snapshotIdSet;
    }

    public final void setPreviousPinnedSnapshots$runtime_release(@NotNull int[] iArr) {
        this.previousPinnedSnapshots = iArr;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime_release(int i10) {
        this.writeCount = i10;
    }

    @NotNull
    public MutableSnapshot takeNestedMutableSnapshot(@Nullable Function1<Object, Unit> readObserver, @Nullable Function1<Object, Unit> writeObserver) {
        NestedMutableSnapshot nestedMutableSnapshot;
        validateNotDisposed$runtime_release();
        if (this.applied && this.f15269d < 0) {
            PreconditionsKt.throwIllegalStateException("Unsupported operation on a disposed or applied snapshot");
        }
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            int i10 = SnapshotKt.f15293e;
            SnapshotKt.f15293e = i10 + 1;
            SnapshotKt.f15292d = SnapshotKt.f15292d.set(i10);
            SnapshotIdSet invalid = getInvalid();
            setInvalid$runtime_release(invalid.set(i10));
            nestedMutableSnapshot = new NestedMutableSnapshot(i10, SnapshotKt.addRange(invalid, getId() + 1, i10), SnapshotKt.d(readObserver, getReadObserver()), SnapshotKt.access$mergedWriteObserver(writeObserver, getWriteObserver$runtime_release()), this);
        }
        if (!getApplied() && !getDisposed()) {
            int id = getId();
            synchronized (SnapshotKt.getLock()) {
                int i11 = SnapshotKt.f15293e;
                SnapshotKt.f15293e = i11 + 1;
                setId$runtime_release(i11);
                SnapshotKt.f15292d = SnapshotKt.f15292d.set(getId());
                Unit unit = Unit.INSTANCE;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), id + 1, getId()));
        }
        return nestedMutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot takeNestedSnapshot(@Nullable Function1<Object, Unit> readObserver) {
        NestedReadonlySnapshot nestedReadonlySnapshot;
        validateNotDisposed$runtime_release();
        if (this.applied && this.f15269d < 0) {
            PreconditionsKt.throwIllegalStateException("Unsupported operation on a disposed or applied snapshot");
        }
        int id = getId();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            int i10 = SnapshotKt.f15293e;
            SnapshotKt.f15293e = i10 + 1;
            SnapshotKt.f15292d = SnapshotKt.f15292d.set(i10);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(i10, SnapshotKt.addRange(getInvalid(), id + 1, i10), SnapshotKt.d(readObserver, getReadObserver()), this);
        }
        if (!getApplied() && !getDisposed()) {
            int id2 = getId();
            synchronized (SnapshotKt.getLock()) {
                int i11 = SnapshotKt.f15293e;
                SnapshotKt.f15293e = i11 + 1;
                setId$runtime_release(i11);
                SnapshotKt.f15292d = SnapshotKt.f15292d.set(getId());
                Unit unit = Unit.INSTANCE;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), id2 + 1, getId()));
        }
        return nestedReadonlySnapshot;
    }

    public final void advance$runtime_release() {
        recordPrevious$runtime_release(getId());
        Unit unit = Unit.INSTANCE;
        if (getApplied() || getDisposed()) {
            return;
        }
        int id = getId();
        synchronized (SnapshotKt.getLock()) {
            int i10 = SnapshotKt.f15293e;
            SnapshotKt.f15293e = i10 + 1;
            setId$runtime_release(i10);
            SnapshotKt.f15292d = SnapshotKt.f15292d.set(getId());
        }
        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), id + 1, getId()));
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot getRoot() {
        return this;
    }
}
