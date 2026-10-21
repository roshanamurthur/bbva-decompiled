package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.AtomicInt;
import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.compose.runtime.WeakReference;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.nativesettings.common.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s0.e;
import s0.f;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u000e\u001a\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0000\u001a\b\u0010\t\u001a\u00020\bH\u0000\u001a$\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0081\b¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\u000f*\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\u000f*\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0015\u001a-\u0010\u0016\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\u000f*\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0016\u0010\u0015\u001a5\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\u000f*\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a-\u0010\u001a\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\u000f*\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001a\u0010\u0015\u001a%\u0010\u001b\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\u000f*\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001b\u0010\u0013\u001a\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001\u001aM\u0010 \u001a\u00028\u0001\"\b\b\u0000\u0010\n*\u00020\u000f\"\u0004\b\u0001\u0010\u001d*\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e¢\u0006\u0002\b\u001fH\u0086\b¢\u0006\u0004\b \u0010!\u001aE\u0010 \u001a\u00028\u0001\"\b\b\u0000\u0010\n*\u00020\u000f\"\u0004\b\u0001\u0010\u001d*\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e¢\u0006\u0002\b\u001fH\u0086\b¢\u0006\u0004\b \u0010\"\u001aM\u0010#\u001a\u00028\u0001\"\b\b\u0000\u0010\n*\u00020\u000f\"\u0004\b\u0001\u0010\u001d*\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00028\u00002\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e¢\u0006\u0002\b\u001fH\u0080\b¢\u0006\u0004\b#\u0010$\u001a)\u0010&\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\u000f2\u0006\u0010%\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\bH\u0001¢\u0006\u0004\b&\u0010'\u001a!\u0010&\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\u000f2\u0006\u0010%\u001a\u00028\u0000H\u0001¢\u0006\u0004\b&\u0010(\u001aG\u0010+\u001a\u00028\u0001\"\b\b\u0000\u0010\n*\u00020\u000f\"\u0004\b\u0001\u0010\u001d*\u00028\u00002!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(%\u0012\u0004\u0012\u00028\u00010\u001eH\u0086\b¢\u0006\u0004\b+\u0010,\u001a\u001c\u0010/\u001a\u00020\u0002*\u00020\u00022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0000H\u0000\" \u00107\u001a\u0002008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u00106\u001a\u0004\b3\u00104\" \u0010=\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u00106\u001a\u0004\b:\u0010;¨\u0006>"}, d2 = {"", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "trackPinning", "handle", "", "releasePinningLocked", "Landroidx/compose/runtime/snapshots/Snapshot;", "currentSnapshot", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "block", Constants.SYNC, "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "readable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", "snapshot", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "writableRecord", "candidate", "overwritableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "newWritableRecord", "newOverwritableRecordLocked", "notifyWrite", "R", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "writable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "overwritable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/StateRecord;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "r", "current", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "Lkotlin/ParameterName;", "name", "withCurrent", "(Landroidx/compose/runtime/snapshots/StateRecord;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "from", "until", "addRange", "", "c", "Ljava/lang/Object;", "getLock", "()Ljava/lang/Object;", "getLock$annotations", "()V", "lock", "k", "Landroidx/compose/runtime/snapshots/Snapshot;", "getSnapshotInitializer", "()Landroidx/compose/runtime/snapshots/Snapshot;", "getSnapshotInitializer$annotations", "snapshotInitializer", "runtime_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 SnapshotWeakSet.kt\nandroidx/compose/runtime/snapshots/SnapshotWeakSet\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2431:1\n1843#1:2432\n1843#1:2435\n1843#1:2437\n1843#1:2445\n1843#1:2474\n1843#1:2476\n2163#1,9:2478\n1843#1:2515\n1843#1:2517\n1843#1:2519\n1843#1:2521\n1843#1:2524\n1843#1:2526\n1843#1:2555\n89#2:2433\n89#2:2434\n89#2:2436\n89#2:2438\n89#2:2446\n89#2:2475\n89#2:2477\n89#2:2516\n89#2:2518\n89#2:2520\n89#2:2522\n89#2:2525\n89#2:2527\n89#2:2556\n33#3,6:2439\n267#4,4:2447\n237#4,7:2451\n248#4,3:2459\n251#4,2:2463\n272#4,2:2465\n254#4,6:2467\n274#4:2473\n267#4,4:2528\n237#4,7:2532\n248#4,3:2540\n251#4,2:2544\n272#4,2:2546\n254#4,6:2548\n274#4:2554\n1810#5:2458\n1672#5:2462\n1810#5:2539\n1672#5:2543\n125#6,28:2487\n1#7:2523\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n720#1:2432\n1904#1:2435\n1930#1:2437\n1952#1:2445\n1982#1:2474\n2035#1:2476\n2145#1:2478,9\n2199#1:2515\n2225#1:2517\n2234#1:2519\n2302#1:2521\n2314#1:2524\n2342#1:2526\n2407#1:2555\n720#1:2433\n1843#1:2434\n1904#1:2436\n1930#1:2438\n1952#1:2446\n1982#1:2475\n2035#1:2477\n2199#1:2516\n2225#1:2518\n2234#1:2520\n2302#1:2522\n2314#1:2525\n2342#1:2527\n2407#1:2556\n1944#1:2439,6\n1954#1:2447,4\n1954#1:2451,7\n1954#1:2459,3\n1954#1:2463,2\n1954#1:2465,2\n1954#1:2467,6\n1954#1:2473\n2365#1:2528,4\n2365#1:2532,7\n2365#1:2540,3\n2365#1:2544,2\n2365#1:2546,2\n2365#1:2548,6\n2365#1:2554\n1954#1:2458\n1954#1:2462\n2365#1:2539\n2365#1:2543\n2175#1:2487,28\n*E\n"})
public final class SnapshotKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f15289a = a.f15301p0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SnapshotThreadLocal<Snapshot> f15290b = new SnapshotThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Object f15291c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static SnapshotIdSet f15292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f15293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final SnapshotDoubleIndexHeap f15294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final SnapshotWeakSet<StateObject> f15295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static List<? extends Function2<? super Set<? extends Object>, ? super Snapshot, Unit>> f15296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static List<? extends Function1<Object, Unit>> f15297i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final AtomicReference<GlobalSnapshot> f15298j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Snapshot f15299k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final AtomicInt f15300l;

    /* JADX INFO: compiled from: Snapshot.kt */
    public static final class a extends Lambda implements Function1<SnapshotIdSet, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f15301p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(SnapshotIdSet snapshotIdSet) {
            return Unit.INSTANCE;
        }
    }

    static {
        SnapshotIdSet.Companion companion = SnapshotIdSet.INSTANCE;
        f15292d = companion.getEMPTY();
        f15293e = 2;
        f15294f = new SnapshotDoubleIndexHeap();
        f15295g = new SnapshotWeakSet<>();
        f15296h = CollectionsKt__CollectionsKt.emptyList();
        f15297i = CollectionsKt__CollectionsKt.emptyList();
        int i10 = f15293e;
        f15293e = i10 + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i10, companion.getEMPTY());
        f15292d = f15292d.set(globalSnapshot.getId());
        AtomicReference<GlobalSnapshot> atomicReference = new AtomicReference<>(globalSnapshot);
        f15298j = atomicReference;
        f15299k = atomicReference.get();
        f15300l = new AtomicInt(0);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0 A[Catch: all -> 0x00a6, LOOP:1: B:30:0x006e->B:44:0x00b0, LOOP_END, TryCatch #1 {all -> 0x00a6, blocks: (B:25:0x005f, B:27:0x0064, B:30:0x006e, B:32:0x007e, B:34:0x008a, B:36:0x0093, B:38:0x00a0, B:41:0x00a8, B:44:0x00b0, B:45:0x00b3), top: B:54:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3 A[EDGE_INSN: B:60:0x00b3->B:45:0x00b3 BREAK  A[LOOP:1: B:30:0x006e->B:44:0x00b0], SYNTHETIC] */
    public static final <T> T a(Function1<? super SnapshotIdSet, ? extends T> function1) {
        GlobalSnapshot globalSnapshot;
        MutableScatterSet<StateObject> modified$runtime_release;
        T t10;
        Snapshot snapshot = f15299k;
        Intrinsics.checkNotNull(snapshot, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (getLock()) {
            try {
                globalSnapshot = f15298j.get();
                modified$runtime_release = globalSnapshot.getModified$runtime_release();
                if (modified$runtime_release != null) {
                    f15300l.add(1);
                }
                t10 = (T) h(globalSnapshot, function1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (modified$runtime_release != null) {
            try {
                List<? extends Function2<? super Set<? extends Object>, ? super Snapshot, Unit>> list = f15296h;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).invoke(ScatterSetWrapperKt.wrapIntoSet(modified$runtime_release), globalSnapshot);
                }
                f15300l.add(-1);
            } catch (Throwable th3) {
                f15300l.add(-1);
                throw th3;
            }
        }
        synchronized (getLock()) {
            try {
                b();
                if (modified$runtime_release != null) {
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
                                        StateObject stateObject = (StateObject) objArr[(i11 << 3) + i13];
                                        if (e(stateObject)) {
                                            f15295g.add(stateObject);
                                        }
                                    }
                                    j10 >>= 8;
                                }
                                if (i12 != 8) {
                                    break;
                                }
                                if (i11 != length) {
                                    break;
                                }
                                i11++;
                            }
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return t10;
    }

    public static final Function1 access$mergedReadObserver(Function1 function1, Function1 function2, boolean z10) {
        if (!z10) {
            function2 = null;
        }
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new s0.d(function1, function2);
    }

    public static final Function1 access$mergedWriteObserver(Function1 function1, Function1 function2) {
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new e(function1, function2);
    }

    public static final Map access$optimisticMerges(MutableSnapshot mutableSnapshot, MutableSnapshot mutableSnapshot2, SnapshotIdSet snapshotIdSet) {
        long[] jArr;
        int i10;
        int i11;
        StateRecord stateRecordG;
        MutableScatterSet<StateObject> modified$runtime_release = mutableSnapshot2.getModified$runtime_release();
        int id = mutableSnapshot.getId();
        if (modified$runtime_release != null) {
            SnapshotIdSet snapshotIdSetOr = mutableSnapshot2.getInvalid().set(mutableSnapshot2.getId()).or(mutableSnapshot2.getPreviousIds$runtime_release());
            Object[] objArr = modified$runtime_release.elements;
            long[] jArr2 = modified$runtime_release.metadata;
            int length = jArr2.length - 2;
            if (length < 0) {
                return null;
            }
            int i12 = 0;
            HashMap map = null;
            while (true) {
                long j10 = jArr2[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j10) < 128) {
                            StateObject stateObject = (StateObject) objArr[(i12 << 3) + i15];
                            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                            StateRecord stateRecordG2 = g(firstStateRecord, id, snapshotIdSet);
                            if (stateRecordG2 != null && (stateRecordG = g(firstStateRecord, id, snapshotIdSetOr)) != null && !Intrinsics.areEqual(stateRecordG2, stateRecordG)) {
                                StateRecord stateRecordG3 = g(firstStateRecord, mutableSnapshot2.getId(), mutableSnapshot2.getInvalid());
                                if (stateRecordG3 == null) {
                                    f();
                                    throw null;
                                }
                                StateRecord stateRecordMergeRecords = stateObject.mergeRecords(stateRecordG, stateRecordG2, stateRecordG3);
                                if (stateRecordMergeRecords != null) {
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(stateRecordG2, stateRecordMergeRecords);
                                    map = map;
                                }
                            }
                            i11 = 8;
                        } else {
                            jArr2 = jArr2;
                            id = id;
                            i11 = i13;
                        }
                        j10 >>= i11;
                        i15++;
                        i13 = i11;
                        jArr2 = jArr2;
                        id = id;
                    }
                    jArr = jArr2;
                    i10 = id;
                    if (i14 == i13) {
                    }
                    return map;
                }
                jArr = jArr2;
                i10 = id;
                if (i12 == length) {
                    return map;
                }
                i12++;
                jArr2 = jArr;
                id = i10;
            }
        }
        return null;
    }

    public static final void access$processForUnusedRecordsLocked(StateObject stateObject) {
        if (e(stateObject)) {
            f15295g.add(stateObject);
        }
    }

    public static final /* synthetic */ Void access$readError() {
        f();
        throw null;
    }

    public static final Void access$reportReadonlySnapshotWrite() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    public static final Snapshot access$takeNewSnapshot(Function1 function1) {
        return (Snapshot) a(new f(function1));
    }

    public static final void access$validateOpen(Snapshot snapshot) {
        int iLowestOrDefault;
        if (f15292d.get(snapshot.getId())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Snapshot is not open: id=");
        sb2.append(snapshot.getId());
        sb2.append(", disposed=");
        sb2.append(snapshot.getDisposed());
        sb2.append(", applied=");
        MutableSnapshot mutableSnapshot = snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null;
        sb2.append(mutableSnapshot != null ? Boolean.valueOf(mutableSnapshot.getApplied$runtime_release()) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (getLock()) {
            iLowestOrDefault = f15294f.lowestOrDefault(-1);
        }
        sb2.append(iLowestOrDefault);
        throw new IllegalStateException(sb2.toString().toString());
    }

    @NotNull
    public static final SnapshotIdSet addRange(@NotNull SnapshotIdSet snapshotIdSet, int i10, int i11) {
        while (i10 < i11) {
            snapshotIdSet = snapshotIdSet.set(i10);
            i10++;
        }
        return snapshotIdSet;
    }

    public static final void b() {
        SnapshotWeakSet<StateObject> snapshotWeakSet = f15295g;
        int size$runtime_release = snapshotWeakSet.getSize();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= size$runtime_release) {
                break;
            }
            WeakReference<StateObject> weakReference = snapshotWeakSet.getValues$runtime_release()[i10];
            StateObject stateObject = weakReference != null ? weakReference.get() : null;
            if (stateObject != null && !(!e(stateObject))) {
                if (i11 != i10) {
                    snapshotWeakSet.getValues$runtime_release()[i11] = weakReference;
                    snapshotWeakSet.getHashes()[i11] = snapshotWeakSet.getHashes()[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < size$runtime_release; i12++) {
            snapshotWeakSet.getValues$runtime_release()[i12] = null;
            snapshotWeakSet.getHashes()[i12] = 0;
        }
        if (i11 != size$runtime_release) {
            snapshotWeakSet.setSize$runtime_release(i11);
        }
    }

    public static final Snapshot c(Snapshot snapshot, Function1<Object, Unit> function1, boolean z10) {
        boolean z11 = snapshot instanceof MutableSnapshot;
        if (z11 || snapshot == null) {
            return new TransparentObserverMutableSnapshot(z11 ? (MutableSnapshot) snapshot : null, function1, null, false, z10);
        }
        return new TransparentObserverSnapshot(snapshot, function1, false, z10);
    }

    @PublishedApi
    @NotNull
    public static final <T extends StateRecord> T current(@NotNull T t10, @NotNull Snapshot snapshot) {
        T t11 = (T) g(t10, snapshot.getId(), snapshot.getInvalid());
        if (t11 != null) {
            return t11;
        }
        f();
        throw null;
    }

    @NotNull
    public static final Snapshot currentSnapshot() {
        Snapshot snapshot = f15290b.get();
        return snapshot == null ? f15298j.get() : snapshot;
    }

    public static Function1 d(Function1 function1, Function1 function2) {
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new s0.d(function1, function2);
    }

    public static final boolean e(StateObject stateObject) {
        StateRecord stateRecord;
        int iLowestOrDefault = f15294f.lowestOrDefault(f15293e);
        StateRecord stateRecord2 = null;
        StateRecord firstStateRecord = null;
        int i10 = 0;
        for (StateRecord firstStateRecord2 = stateObject.getFirstStateRecord(); firstStateRecord2 != null; firstStateRecord2 = firstStateRecord2.getNext()) {
            int snapshotId$runtime_release = firstStateRecord2.getSnapshotId();
            if (snapshotId$runtime_release != 0) {
                if (snapshotId$runtime_release >= iLowestOrDefault) {
                    i10++;
                } else if (stateRecord2 == null) {
                    i10++;
                    stateRecord2 = firstStateRecord2;
                } else {
                    if (firstStateRecord2.getSnapshotId() < stateRecord2.getSnapshotId()) {
                        stateRecord = stateRecord2;
                        stateRecord2 = firstStateRecord2;
                    } else {
                        stateRecord = firstStateRecord2;
                    }
                    if (firstStateRecord == null) {
                        firstStateRecord = stateObject.getFirstStateRecord();
                        StateRecord stateRecord3 = firstStateRecord;
                        while (true) {
                            if (firstStateRecord == null) {
                                firstStateRecord = stateRecord3;
                                break;
                            }
                            if (firstStateRecord.getSnapshotId() >= iLowestOrDefault) {
                                break;
                            }
                            if (stateRecord3.getSnapshotId() < firstStateRecord.getSnapshotId()) {
                                stateRecord3 = firstStateRecord;
                            }
                            firstStateRecord = firstStateRecord.getNext();
                        }
                    }
                    stateRecord2.setSnapshotId$runtime_release(0);
                    stateRecord2.assign(firstStateRecord);
                    stateRecord2 = stateRecord;
                }
            }
        }
        return i10 > 1;
    }

    public static final void f() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    public static final <T extends StateRecord> T g(T t10, int i10, SnapshotIdSet snapshotIdSet) {
        T t11 = null;
        while (t10 != null) {
            int snapshotId$runtime_release = t10.getSnapshotId();
            if (snapshotId$runtime_release != 0 && snapshotId$runtime_release <= i10 && !snapshotIdSet.get(snapshotId$runtime_release) && (t11 == null || t11.getSnapshotId() < t10.getSnapshotId())) {
                t11 = t10;
            }
            t10 = (T) t10.getNext();
        }
        if (t11 != null) {
            return t11;
        }
        return null;
    }

    @NotNull
    public static final Object getLock() {
        return f15291c;
    }

    @NotNull
    public static final Snapshot getSnapshotInitializer() {
        return f15299k;
    }

    public static final <T> T h(Snapshot snapshot, Function1<? super SnapshotIdSet, ? extends T> function1) {
        T tInvoke = function1.invoke(f15292d.clear(snapshot.getId()));
        synchronized (getLock()) {
            int i10 = f15293e;
            f15293e = i10 + 1;
            f15292d = f15292d.clear(snapshot.getId());
            f15298j.set(new GlobalSnapshot(i10, f15292d));
            snapshot.dispose();
            f15292d = f15292d.set(i10);
            Unit unit = Unit.INSTANCE;
        }
        return tInvoke;
    }

    @NotNull
    public static final <T extends StateRecord> T newOverwritableRecordLocked(@NotNull T t10, @NotNull StateObject stateObject) {
        int iLowestOrDefault = f15294f.lowestOrDefault(f15293e) - 1;
        SnapshotIdSet empty = SnapshotIdSet.INSTANCE.getEMPTY();
        T t11 = null;
        StateRecord stateRecord = null;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
            if (firstStateRecord.getSnapshotId() != 0) {
                int snapshotId$runtime_release = firstStateRecord.getSnapshotId();
                if (snapshotId$runtime_release != 0 && snapshotId$runtime_release <= iLowestOrDefault && !empty.get(snapshotId$runtime_release)) {
                    if (stateRecord != null) {
                        if (firstStateRecord.getSnapshotId() >= stateRecord.getSnapshotId()) {
                            t11 = (T) stateRecord;
                            break;
                        }
                        break;
                    }
                    stateRecord = firstStateRecord;
                }
            }
            t11 = (T) firstStateRecord;
            break;
        }
        if (t11 != null) {
            t11.setSnapshotId$runtime_release(Integer.MAX_VALUE);
            return t11;
        }
        T t12 = (T) t10.create();
        t12.setSnapshotId$runtime_release(Integer.MAX_VALUE);
        t12.setNext$runtime_release(stateObject.getFirstStateRecord());
        Intrinsics.checkNotNull(t12, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$16");
        stateObject.prependStateRecord(t12);
        Intrinsics.checkNotNull(t12, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return t12;
    }

    @NotNull
    public static final <T extends StateRecord> T newWritableRecord(@NotNull T t10, @NotNull StateObject stateObject, @NotNull Snapshot snapshot) {
        T t11;
        synchronized (getLock()) {
            t11 = (T) newOverwritableRecordLocked(t10, stateObject);
            t11.assign(t10);
            t11.setSnapshotId$runtime_release(snapshot.getId());
        }
        return t11;
    }

    @PublishedApi
    public static final void notifyWrite(@NotNull Snapshot snapshot, @NotNull StateObject stateObject) {
        snapshot.setWriteCount$runtime_release(snapshot.getWriteCount$runtime_release() + 1);
        Function1<Object, Unit> writeObserver$runtime_release = snapshot.getWriteObserver$runtime_release();
        if (writeObserver$runtime_release != null) {
            writeObserver$runtime_release.invoke(stateObject);
        }
    }

    public static final <T extends StateRecord, R> R overwritable(@NotNull T t10, @NotNull StateObject stateObject, @NotNull T t11, @NotNull Function1<? super T, ? extends R> function1) {
        Snapshot current;
        R rInvoke;
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.INSTANCE.getCurrent();
                rInvoke = function1.invoke(overwritableRecord(t10, stateObject, current, t11));
                InlineMarker.finallyStart(1);
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
        InlineMarker.finallyEnd(1);
        notifyWrite(current, stateObject);
        return rInvoke;
    }

    @NotNull
    public static final <T extends StateRecord> T overwritableRecord(@NotNull T t10, @NotNull StateObject stateObject, @NotNull Snapshot snapshot, @NotNull T t11) {
        T t12;
        if (snapshot.getReadOnly()) {
            snapshot.mo2168recordModified$runtime_release(stateObject);
        }
        int id = snapshot.getId();
        if (t11.getSnapshotId() == id) {
            return t11;
        }
        synchronized (getLock()) {
            t12 = (T) newOverwritableRecordLocked(t10, stateObject);
        }
        t12.setSnapshotId$runtime_release(id);
        if (t11.getSnapshotId() != 1) {
            snapshot.mo2168recordModified$runtime_release(stateObject);
        }
        return t12;
    }

    @NotNull
    public static final <T extends StateRecord> T readable(@NotNull T t10, @NotNull StateObject stateObject) {
        T t11;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot current = companion.getCurrent();
        Function1<Object, Unit> readObserver = current.getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(stateObject);
        }
        T t12 = (T) g(t10, current.getId(), current.getInvalid());
        if (t12 != null) {
            return t12;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            t11 = (T) g(firstStateRecord, current2.getId(), current2.getInvalid());
            if (t11 == null) {
                f();
                throw null;
            }
        }
        return t11;
    }

    public static final void releasePinningLocked(int i10) {
        f15294f.remove(i10);
    }

    @PublishedApi
    public static final <T> T sync(@NotNull Function0<? extends T> function0) {
        T tInvoke;
        synchronized (getLock()) {
            try {
                tInvoke = function0.invoke();
                InlineMarker.finallyStart(1);
            } finally {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
            }
        }
        return tInvoke;
    }

    public static final int trackPinning(int i10, @NotNull SnapshotIdSet snapshotIdSet) {
        int iAdd;
        int iLowest = snapshotIdSet.lowest(i10);
        synchronized (getLock()) {
            iAdd = f15294f.add(iLowest);
        }
        return iAdd;
    }

    public static final <T extends StateRecord, R> R withCurrent(@NotNull T t10, @NotNull Function1<? super T, ? extends R> function1) {
        return function1.invoke(current(t10));
    }

    public static final <T extends StateRecord, R> R writable(@NotNull T t10, @NotNull StateObject stateObject, @NotNull Function1<? super T, ? extends R> function1) {
        Snapshot current;
        R rInvoke;
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.INSTANCE.getCurrent();
                rInvoke = function1.invoke(writableRecord(t10, stateObject, current));
                InlineMarker.finallyStart(1);
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
        InlineMarker.finallyEnd(1);
        notifyWrite(current, stateObject);
        return rInvoke;
    }

    @PublishedApi
    @NotNull
    public static final <T extends StateRecord> T writableRecord(@NotNull T t10, @NotNull StateObject stateObject, @NotNull Snapshot snapshot) {
        T t11;
        if (snapshot.getReadOnly()) {
            snapshot.mo2168recordModified$runtime_release(stateObject);
        }
        int id = snapshot.getId();
        T t12 = (T) g(t10, id, snapshot.getInvalid());
        if (t12 == null) {
            f();
            throw null;
        }
        if (t12.getSnapshotId() == snapshot.getId()) {
            return t12;
        }
        synchronized (getLock()) {
            t11 = (T) g(stateObject.getFirstStateRecord(), id, snapshot.getInvalid());
            if (t11 == null) {
                f();
                throw null;
            }
            if (t11.getSnapshotId() != id) {
                StateRecord stateRecordNewOverwritableRecordLocked = newOverwritableRecordLocked(t11, stateObject);
                stateRecordNewOverwritableRecordLocked.assign(t11);
                stateRecordNewOverwritableRecordLocked.setSnapshotId$runtime_release(snapshot.getId());
                t11 = (T) stateRecordNewOverwritableRecordLocked;
            }
        }
        Intrinsics.checkNotNull(t11, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
        if (t12.getSnapshotId() != 1) {
            snapshot.mo2168recordModified$runtime_release(stateObject);
        }
        return t11;
    }

    @PublishedApi
    @NotNull
    public static final <T extends StateRecord> T current(@NotNull T t10) {
        T t11;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot current = companion.getCurrent();
        T t12 = (T) g(t10, current.getId(), current.getInvalid());
        if (t12 != null) {
            return t12;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            t11 = (T) g(t10, current2.getId(), current2.getInvalid());
        }
        if (t11 != null) {
            return t11;
        }
        f();
        throw null;
    }

    public static final <T extends StateRecord, R> R writable(@NotNull T t10, @NotNull StateObject stateObject, @NotNull Snapshot snapshot, @NotNull Function1<? super T, ? extends R> function1) {
        R rInvoke;
        synchronized (getLock()) {
            try {
                rInvoke = function1.invoke(writableRecord(t10, stateObject, snapshot));
                InlineMarker.finallyStart(1);
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
        InlineMarker.finallyEnd(1);
        notifyWrite(snapshot, stateObject);
        return rInvoke;
    }

    @NotNull
    public static final <T extends StateRecord> T readable(@NotNull T t10, @NotNull StateObject stateObject, @NotNull Snapshot snapshot) {
        Function1<Object, Unit> readObserver = snapshot.getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(stateObject);
        }
        T t11 = (T) g(t10, snapshot.getId(), snapshot.getInvalid());
        if (t11 != null) {
            return t11;
        }
        f();
        throw null;
    }

    @PublishedApi
    public static /* synthetic */ void getLock$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getSnapshotInitializer$annotations() {
    }
}
