package androidx.compose.runtime.snapshots;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.plugin.localstorage.command.ClearCommand;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: compiled from: SnapshotStateObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB0\u0012'\u0010\u001a\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001b\u0010\u001cJA\u0010\t\u001a\u00020\u0005\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001J)\u0010\u0011\u001a\u00020\u00052!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u000f0\u0004J\u0006\u0010\u0012\u001a\u00020\u0005J\u0006\u0010\u0013\u001a\u00020\u0005J\u001e\u0010\u0018\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007J\u0006\u0010\f\u001a\u00020\u0005¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", ExifInterface.GPS_DIRECTION_TRUE, "scope", "Lkotlin/Function1;", "", "onValueChangedForScope", "Lkotlin/Function0;", "block", "observeReads", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "withNoObservations", ClearCommand.ID, "Lkotlin/ParameterName;", "name", "", "predicate", "clearIf", EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "", "changes", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "notifyChanges", "callback", "onChangedExecutor", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ObservedScopeMap", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,654:1\n186#1:659\n187#1:661\n188#1,2:673\n192#1:711\n193#1:713\n194#1,2:729\n192#1:731\n193#1:733\n194#1,2:749\n186#1:751\n187#1:753\n188#1,2:765\n1208#2:655\n1187#2,2:656\n89#3:658\n89#3:660\n89#3:675\n89#3:687\n89#3:703\n89#3:712\n89#3:732\n89#3:752\n460#4,11:662\n460#4,11:676\n838#4,15:688\n838#4,15:714\n838#4,15:734\n460#4,11:754\n366#4,12:767\n728#4,2:779\n33#5,7:704\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n*L\n70#1:659\n70#1:661\n70#1:673,2\n292#1:711\n292#1:713\n292#1:729,2\n303#1:731\n303#1:733\n303#1:749,2\n336#1:751\n336#1:753\n336#1:765,2\n178#1:655\n178#1:656,2\n64#1:658\n70#1:660\n186#1:675\n192#1:687\n234#1:703\n292#1:712\n303#1:732\n336#1:752\n70#1:662,11\n187#1:676,11\n193#1:688,15\n292#1:714,15\n303#1:734,15\n336#1:754,11\n349#1:767,12\n352#1:779,2\n243#1:704,7\n*E\n"})
public final class SnapshotStateObserver {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<Function0<Unit>, Unit> f15317a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15319c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ObserverHandle f15323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public ObservedScopeMap f15325i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AtomicReference<Object> f15318b = new AtomicReference<>(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f15320d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final b f15321e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableVector<ObservedScopeMap> f15322f = new MutableVector<>(new ObservedScopeMap[16], 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f15326j = -1;

    /* JADX INFO: compiled from: SnapshotStateObserver.kt */
    @SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 6 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 9 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 10 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 11 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 12 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 13 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 14 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,654:1\n1208#2:655\n1187#2,2:656\n415#3,3:658\n373#3,6:661\n383#3,3:668\n386#3,2:672\n419#3:674\n420#3:676\n389#3,6:677\n421#3:683\n373#3,6:695\n383#3,3:702\n386#3,2:706\n389#3,6:712\n401#3,4:719\n373#3,6:723\n383#3,3:730\n386#3,2:734\n406#3,2:736\n389#3,6:738\n408#3:744\n401#3,4:760\n373#3,6:764\n383#3,3:771\n386#3,2:775\n406#3,2:777\n389#3,6:779\n408#3:785\n1810#4:667\n1672#4:671\n1810#4:701\n1672#4:705\n1810#4:729\n1672#4:733\n1810#4:752\n1672#4:756\n1810#4:770\n1672#4:774\n1810#4:810\n1672#4:814\n1810#4:835\n1672#4:839\n1810#4:859\n1672#4:863\n1810#4:904\n1672#4:908\n1810#4:941\n1672#4:945\n1810#4:982\n1672#4:986\n1810#4:1006\n1672#4:1010\n1810#4:1051\n1672#4:1055\n1810#4:1088\n1672#4:1092\n1810#4:1137\n1672#4:1141\n1810#4:1168\n1672#4:1172\n52#5:675\n52#5:684\n52#5:818\n392#6,6:685\n398#6,2:692\n48#7:691\n460#7,11:1110\n843#8:694\n845#8,4:708\n849#8:718\n1047#9:745\n1049#9:759\n1050#9,3:786\n1053#9:795\n363#10,6:746\n373#10,3:753\n376#10,2:757\n379#10,6:789\n48#11,3:796\n53#11:969\n55#11:1109\n267#12,4:799\n237#12,7:803\n248#12,3:811\n251#12,2:815\n272#12:817\n267#12,4:824\n237#12,7:828\n248#12,3:836\n251#12,2:840\n272#12:842\n267#12,4:848\n237#12,7:852\n248#12,3:860\n251#12,2:864\n272#12,2:866\n254#12,6:868\n274#12:874\n273#12:879\n254#12,6:880\n274#12:886\n267#12,4:893\n237#12,7:897\n248#12,3:905\n251#12,2:909\n272#12,2:911\n254#12,6:913\n274#12:919\n267#12,4:930\n237#12,7:934\n248#12,3:942\n251#12,2:946\n272#12,2:948\n254#12,6:950\n274#12:956\n273#12:961\n254#12,6:962\n274#12:968\n267#12,4:971\n237#12,7:975\n248#12,3:983\n251#12,2:987\n272#12:989\n267#12,4:995\n237#12,7:999\n248#12,3:1007\n251#12,2:1011\n272#12,2:1013\n254#12,6:1015\n274#12:1021\n273#12:1026\n254#12,6:1027\n274#12:1033\n267#12,4:1040\n237#12,7:1044\n248#12,3:1052\n251#12,2:1056\n272#12,2:1058\n254#12,6:1060\n274#12:1066\n267#12,4:1077\n237#12,7:1081\n248#12,3:1089\n251#12,2:1093\n272#12,2:1095\n254#12,6:1097\n274#12:1103\n267#12,4:1126\n237#12,7:1130\n248#12,3:1138\n251#12,2:1142\n272#12,2:1144\n254#12,6:1146\n274#12:1152\n267#12,4:1157\n237#12,7:1161\n248#12,3:1169\n251#12,2:1173\n272#12,2:1175\n254#12,6:1177\n274#12:1183\n77#13,5:819\n77#13,5:843\n85#13,4:875\n85#13:887\n77#13,5:888\n85#13,4:920\n88#13:924\n77#13,5:925\n85#13,4:957\n77#13,5:990\n85#13,4:1022\n85#13:1034\n77#13,5:1035\n85#13,4:1067\n88#13:1071\n77#13,5:1072\n85#13,4:1104\n77#13,5:1121\n85#13,4:1153\n1855#14:970\n1856#14:1108\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n*L\n399#1:655\n399#1:656,2\n471#1:658,3\n471#1:661,6\n471#1:668,3\n471#1:672,2\n471#1:674\n471#1:676\n471#1:677,6\n471#1:683\n514#1:695,6\n514#1:702,3\n514#1:706,2\n514#1:712,6\n528#1:719,4\n528#1:723,6\n528#1:730,3\n528#1:734,2\n528#1:736,2\n528#1:738,6\n528#1:744\n540#1:760,4\n540#1:764,6\n540#1:771,3\n540#1:775,2\n540#1:777,2\n540#1:779,6\n540#1:785\n471#1:667\n471#1:671\n514#1:701\n514#1:705\n528#1:729\n528#1:733\n537#1:752\n537#1:756\n540#1:770\n540#1:774\n581#1:810\n581#1:814\n590#1:835\n590#1:839\n601#1:859\n601#1:863\n601#1:904\n601#1:908\n612#1:941\n612#1:945\n590#1:982\n590#1:986\n601#1:1006\n601#1:1010\n601#1:1051\n601#1:1055\n612#1:1088\n612#1:1092\n632#1:1137\n632#1:1141\n649#1:1168\n649#1:1172\n473#1:675\n481#1:684\n583#1:818\n501#1:685,6\n501#1:692,2\n501#1:691\n619#1:1110,11\n514#1:694\n514#1:708,4\n514#1:718\n537#1:745\n537#1:759\n537#1:786,3\n537#1:795\n537#1:746,6\n537#1:753,3\n537#1:757,2\n537#1:789,6\n581#1:796,3\n581#1:969\n581#1:1109\n581#1:799,4\n581#1:803,7\n581#1:811,3\n581#1:815,2\n581#1:817\n590#1:824,4\n590#1:828,7\n590#1:836,3\n590#1:840,2\n590#1:842\n601#1:848,4\n601#1:852,7\n601#1:860,3\n601#1:864,2\n601#1:866,2\n601#1:868,6\n601#1:874\n590#1:879\n590#1:880,6\n590#1:886\n601#1:893,4\n601#1:897,7\n601#1:905,3\n601#1:909,2\n601#1:911,2\n601#1:913,6\n601#1:919\n612#1:930,4\n612#1:934,7\n612#1:942,3\n612#1:946,2\n612#1:948,2\n612#1:950,6\n612#1:956\n581#1:961\n581#1:962,6\n581#1:968\n590#1:971,4\n590#1:975,7\n590#1:983,3\n590#1:987,2\n590#1:989\n601#1:995,4\n601#1:999,7\n601#1:1007,3\n601#1:1011,2\n601#1:1013,2\n601#1:1015,6\n601#1:1021\n590#1:1026\n590#1:1027,6\n590#1:1033\n601#1:1040,4\n601#1:1044,7\n601#1:1052,3\n601#1:1056,2\n601#1:1058,2\n601#1:1060,6\n601#1:1066\n612#1:1077,4\n612#1:1081,7\n612#1:1089,3\n612#1:1093,2\n612#1:1095,2\n612#1:1097,6\n612#1:1103\n632#1:1126,4\n632#1:1130,7\n632#1:1138,3\n632#1:1142,2\n632#1:1144,2\n632#1:1146,6\n632#1:1152\n649#1:1157,4\n649#1:1161,7\n649#1:1169,3\n649#1:1173,2\n649#1:1175,2\n649#1:1177,6\n649#1:1183\n590#1:819,5\n601#1:843,5\n601#1:875,4\n590#1:887\n601#1:888,5\n601#1:920,4\n590#1:924\n612#1:925,5\n612#1:957,4\n601#1:990,5\n601#1:1022,4\n590#1:1034\n601#1:1035,5\n601#1:1067,4\n590#1:1071\n612#1:1072,5\n612#1:1104,4\n632#1:1121,5\n632#1:1153,4\n581#1:970\n581#1:1108\n*E\n"})
    public static final class ObservedScopeMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Function1<Object, Unit> f15327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Object f15328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public MutableObjectIntMap<Object> f15329c;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f15336j;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f15330d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final ScopeMap<Object, Object> f15331e = new ScopeMap<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final MutableScatterMap<Object, MutableObjectIntMap<Object>> f15332f = new MutableScatterMap<>(0, 1, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final MutableScatterSet<Object> f15333g = new MutableScatterSet<>(0, 1, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public final MutableVector<DerivedState<?>> f15334h = new MutableVector<>(new DerivedState[16], 0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1 f15335i = new DerivedStateObserver() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(@NotNull DerivedState<?> derivedState) {
                this.f15339a.f15336j--;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(@NotNull DerivedState<?> derivedState) {
                this.f15339a.f15336j++;
            }
        };

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final ScopeMap<Object, DerivedState<?>> f15337k = new ScopeMap<>();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public final HashMap<DerivedState<?>, Object> f15338l = new HashMap<>();

        /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1] */
        public ObservedScopeMap(@NotNull Function1<Object, Unit> function1) {
            this.f15327a = function1;
        }

        public final void a(@NotNull Object obj, @NotNull b bVar, @NotNull Function0 function0) {
            long[] jArr;
            int i10;
            Object obj2 = this.f15328b;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.f15329c;
            int i11 = this.f15330d;
            this.f15328b = obj;
            this.f15329c = this.f15332f.get(obj);
            if (this.f15330d == -1) {
                this.f15330d = SnapshotKt.currentSnapshot().getId();
            }
            SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1 snapshotStateObserver$ObservedScopeMap$derivedStateObserver$1 = this.f15335i;
            MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
            try {
                mutableVectorDerivedStateObservers.add(snapshotStateObserver$ObservedScopeMap$derivedStateObserver$1);
                Snapshot.INSTANCE.observe(bVar, null, function0);
                mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                Object obj3 = this.f15328b;
                Intrinsics.checkNotNull(obj3);
                int i12 = this.f15330d;
                MutableObjectIntMap<Object> mutableObjectIntMap2 = this.f15329c;
                if (mutableObjectIntMap2 != null) {
                    long[] jArr2 = mutableObjectIntMap2.metadata;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i13 = 0;
                        while (true) {
                            long j10 = jArr2[i13];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i14 = 8;
                                int i15 = 8 - ((~(i13 - length)) >>> 31);
                                int i16 = 0;
                                while (i16 < i15) {
                                    if ((j10 & 255) < 128) {
                                        int i17 = (i13 << 3) + i16;
                                        Object obj4 = mutableObjectIntMap2.keys[i17];
                                        boolean z10 = mutableObjectIntMap2.values[i17] != i12;
                                        if (z10) {
                                            d(obj3, obj4);
                                        }
                                        if (z10) {
                                            mutableObjectIntMap2.removeValueAt(i17);
                                        }
                                        i10 = 8;
                                    } else {
                                        i10 = i14;
                                    }
                                    j10 >>= i10;
                                    i16++;
                                    i14 = i10;
                                    jArr2 = jArr2;
                                }
                                jArr = jArr2;
                                if (i15 != i14) {
                                    break;
                                }
                            } else {
                                jArr = jArr2;
                            }
                            if (i13 == length) {
                                break;
                            }
                            i13++;
                            jArr2 = jArr;
                        }
                    }
                }
                this.f15328b = obj2;
                this.f15329c = mutableObjectIntMap;
                this.f15330d = i11;
            } catch (Throwable th2) {
                mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                throw th2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0284 A[LOOP:8: B:88:0x0245->B:100:0x0284, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:122:0x02f9 A[DONT_INVERT, PHI: r20
          0x02f9: PHI (r20v27 boolean) = (r20v26 boolean), (r20v28 boolean) binds: [B:112:0x02ca, B:121:0x02f7] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:123:0x02fb A[LOOP:6: B:111:0x02bc->B:123:0x02fb, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:186:0x0490  */
        /* JADX WARN: Code duplicated, block: B:249:0x0611 A[DONT_INVERT, PHI: r0
          0x0611: PHI (r0v8 boolean) = (r0v7 boolean), (r0v9 boolean) binds: [B:240:0x05e6, B:248:0x060f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:250:0x0613 A[LOOP:18: B:239:0x05d8->B:250:0x0613, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:315:0x0303 A[EDGE_INSN: B:315:0x0303->B:125:0x0303 BREAK  A[LOOP:6: B:111:0x02bc->B:123:0x02fb], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:320:0x02a2 A[EDGE_INSN: B:320:0x02a2->B:104:0x02a2 BREAK  A[LOOP:8: B:88:0x0245->B:100:0x0284], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:340:0x061a A[EDGE_INSN: B:340:0x061a->B:252:0x061a BREAK  A[LOOP:18: B:239:0x05d8->B:250:0x0613], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:62:0x0173  */
        /* JADX WARN: Code duplicated, block: B:99:0x0282 A[DONT_INVERT, PHI: r20
          0x0282: PHI (r20v33 boolean) = (r20v32 boolean), (r20v34 boolean) binds: [B:89:0x0253, B:98:0x0280] A[DONT_GENERATE, DONT_INLINE]] */
        public final boolean b(@NotNull Set<? extends Object> set) {
            boolean z10;
            Iterator it;
            Object obj;
            HashMap<DerivedState<?>, Object> map;
            Object obj2;
            HashMap<DerivedState<?>, Object> map2;
            long[] jArr;
            Object[] objArr;
            HashMap<DerivedState<?>, Object> map3;
            Iterator it2;
            Object obj3;
            ScopeMap<Object, DerivedState<?>> scopeMap;
            long[] jArr2;
            Object[] objArr2;
            int i10;
            char c10;
            DerivedState<?>[] derivedStateArr;
            ScopeMap<Object, Object> scopeMap2;
            long[] jArr3;
            Object[] objArr3;
            int i11;
            MutableObjectIntMap<Object> mutableObjectIntMap;
            long[] jArr4;
            HashMap<DerivedState<?>, Object> map4;
            String str;
            ScopeMap<Object, DerivedState<?>> scopeMap3;
            Object[] objArr4;
            int i12;
            long[] jArr5;
            HashMap<DerivedState<?>, Object> map5;
            String str2;
            int i13;
            int i14;
            int i15;
            int i16;
            long j10;
            ScopeMap<Object, DerivedState<?>> scopeMap4;
            Object[] objArr5;
            char c11;
            Object obj4;
            char c12;
            HashMap<DerivedState<?>, Object> map6;
            long[] jArr6;
            Object[] objArr6;
            int i17;
            long[] jArr7;
            HashMap<DerivedState<?>, Object> map7;
            Object[] objArr7;
            String str3;
            int i18;
            int i19;
            long j11;
            char c13;
            HashMap<DerivedState<?>, Object> map8 = this.f15338l;
            boolean z11 = set instanceof ScatterSetWrapper;
            String str4 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
            MutableVector<DerivedState<?>> mutableVector = this.f15334h;
            char c14 = 7;
            ScopeMap<Object, DerivedState<?>> scopeMap5 = this.f15337k;
            ScopeMap<Object, Object> scopeMap6 = this.f15331e;
            MutableScatterSet<Object> mutableScatterSet = this.f15333g;
            if (z11) {
                ScatterSet set$runtime_release = ((ScatterSetWrapper) set).getSet$runtime_release();
                Object[] objArr8 = set$runtime_release.elements;
                long[] jArr8 = set$runtime_release.metadata;
                int length = jArr8.length - 2;
                if (length >= 0) {
                    ScopeMap<Object, DerivedState<?>> scopeMap7 = scopeMap5;
                    int i20 = 0;
                    z10 = false;
                    while (true) {
                        long j12 = jArr8[i20];
                        if ((((~j12) << c14) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i21 = 8 - ((~(i20 - length)) >>> 31);
                            int i22 = 0;
                            while (i22 < i21) {
                                if ((j12 & 255) < 128) {
                                    Object obj5 = objArr8[(i20 << 3) + i22];
                                    if (obj5 instanceof StateObjectImpl) {
                                        jArr5 = jArr8;
                                        if (!((StateObjectImpl) obj5).m2182isReadInh_f27i8$runtime_release(ReaderKind.m2170constructorimpl(2))) {
                                        }
                                        j12 = j10 >> 8;
                                        i22 = i16 + 1;
                                        length = i13;
                                        map8 = map5;
                                        objArr8 = objArr5;
                                        jArr8 = jArr5;
                                        scopeMap7 = scopeMap4;
                                        i20 = i14;
                                        i21 = i15;
                                        str4 = str2;
                                    } else {
                                        jArr5 = jArr8;
                                    }
                                    ScopeMap<Object, DerivedState<?>> scopeMap8 = scopeMap7;
                                    if (!scopeMap8.contains(obj5) || (obj4 = scopeMap8.getMap().get(obj5)) == null) {
                                        map5 = map8;
                                        objArr5 = objArr8;
                                        str2 = str4;
                                        i13 = length;
                                        i14 = i20;
                                        scopeMap4 = scopeMap8;
                                        i15 = i21;
                                        i16 = i22;
                                        j10 = j12;
                                    } else {
                                        objArr5 = objArr8;
                                        if (obj4 instanceof MutableScatterSet) {
                                            MutableScatterSet mutableScatterSet2 = (MutableScatterSet) obj4;
                                            Object[] objArr9 = mutableScatterSet2.elements;
                                            long[] jArr9 = mutableScatterSet2.metadata;
                                            int length2 = jArr9.length - 2;
                                            if (length2 >= 0) {
                                                i13 = length;
                                                i14 = i20;
                                                scopeMap4 = scopeMap8;
                                                int i23 = 0;
                                                while (true) {
                                                    long j13 = jArr9[i23];
                                                    i15 = i21;
                                                    i16 = i22;
                                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i24 = 8 - ((~(i23 - length2)) >>> 31);
                                                        int i25 = 0;
                                                        while (i25 < i24) {
                                                            if ((j13 & 255) < 128) {
                                                                jArr7 = jArr9;
                                                                DerivedState<?> derivedState = (DerivedState) objArr9[(i23 << 3) + i25];
                                                                Intrinsics.checkNotNull(derivedState, str4);
                                                                objArr7 = objArr9;
                                                                Object obj6 = map8.get(derivedState);
                                                                SnapshotMutationPolicy<?> policy = derivedState.getPolicy();
                                                                if (policy == null) {
                                                                    policy = SnapshotStateKt.structuralEqualityPolicy();
                                                                }
                                                                str3 = str4;
                                                                j11 = j12;
                                                                if (policy.equivalent(derivedState.getCurrentRecord().getCurrentValue(), obj6)) {
                                                                    map7 = map8;
                                                                    i18 = i23;
                                                                    i19 = i24;
                                                                    mutableVector.add(derivedState);
                                                                } else {
                                                                    Object obj7 = scopeMap6.getMap().get(derivedState);
                                                                    if (obj7 == null) {
                                                                        map7 = map8;
                                                                        i18 = i23;
                                                                        i19 = i24;
                                                                    } else if (obj7 instanceof MutableScatterSet) {
                                                                        MutableScatterSet mutableScatterSet3 = (MutableScatterSet) obj7;
                                                                        Object[] objArr10 = mutableScatterSet3.elements;
                                                                        long[] jArr10 = mutableScatterSet3.metadata;
                                                                        int length3 = jArr10.length - 2;
                                                                        if (length3 >= 0) {
                                                                            int i26 = i23;
                                                                            i19 = i24;
                                                                            int i27 = 0;
                                                                            while (true) {
                                                                                long j14 = jArr10[i27];
                                                                                long[] jArr11 = jArr10;
                                                                                map7 = map8;
                                                                                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                    int i28 = 8 - ((~(i27 - length3)) >>> 31);
                                                                                    int i29 = 0;
                                                                                    while (i29 < i28) {
                                                                                        if ((j14 & 255) < 128) {
                                                                                            mutableScatterSet.add(objArr10[(i27 << 3) + i29]);
                                                                                            c13 = '\b';
                                                                                            z10 = true;
                                                                                        } else {
                                                                                            c13 = '\b';
                                                                                        }
                                                                                        j14 >>= c13;
                                                                                        i29++;
                                                                                        i26 = i26;
                                                                                    }
                                                                                    i18 = i26;
                                                                                    if (i28 != 8) {
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    i18 = i26;
                                                                                }
                                                                                if (i27 == length3) {
                                                                                    break;
                                                                                }
                                                                                i27++;
                                                                                map8 = map7;
                                                                                jArr10 = jArr11;
                                                                                i26 = i18;
                                                                            }
                                                                        } else {
                                                                            map7 = map8;
                                                                            i18 = i23;
                                                                            i19 = i24;
                                                                        }
                                                                    } else {
                                                                        map7 = map8;
                                                                        i18 = i23;
                                                                        i19 = i24;
                                                                        mutableScatterSet.add(obj7);
                                                                        z10 = true;
                                                                    }
                                                                }
                                                            } else {
                                                                jArr7 = jArr9;
                                                                map7 = map8;
                                                                objArr7 = objArr9;
                                                                str3 = str4;
                                                                i18 = i23;
                                                                i19 = i24;
                                                                j11 = j12;
                                                            }
                                                            j13 >>= 8;
                                                            i25++;
                                                            objArr9 = objArr7;
                                                            jArr9 = jArr7;
                                                            i24 = i19;
                                                            str4 = str3;
                                                            j12 = j11;
                                                            map8 = map7;
                                                            i23 = i18;
                                                        }
                                                        jArr6 = jArr9;
                                                        map6 = map8;
                                                        objArr6 = objArr9;
                                                        str2 = str4;
                                                        int i30 = i23;
                                                        j10 = j12;
                                                        if (i24 != 8) {
                                                            break;
                                                        }
                                                        i17 = i30;
                                                    } else {
                                                        jArr6 = jArr9;
                                                        map6 = map8;
                                                        objArr6 = objArr9;
                                                        str2 = str4;
                                                        j10 = j12;
                                                        i17 = i23;
                                                    }
                                                    if (i17 == length2) {
                                                        break;
                                                    }
                                                    i23 = i17 + 1;
                                                    i21 = i15;
                                                    i22 = i16;
                                                    objArr9 = objArr6;
                                                    jArr9 = jArr6;
                                                    str4 = str2;
                                                    j12 = j10;
                                                    map8 = map6;
                                                }
                                            } else {
                                                map6 = map8;
                                                str2 = str4;
                                                i13 = length;
                                                i14 = i20;
                                                scopeMap4 = scopeMap8;
                                                i15 = i21;
                                                i16 = i22;
                                                j10 = j12;
                                            }
                                            map5 = map6;
                                        } else {
                                            str2 = str4;
                                            i13 = length;
                                            i14 = i20;
                                            scopeMap4 = scopeMap8;
                                            i15 = i21;
                                            i16 = i22;
                                            j10 = j12;
                                            DerivedState<?> derivedState2 = (DerivedState) obj4;
                                            map5 = map8;
                                            Object obj8 = map5.get(derivedState2);
                                            SnapshotMutationPolicy<?> policy2 = derivedState2.getPolicy();
                                            if (policy2 == null) {
                                                policy2 = SnapshotStateKt.structuralEqualityPolicy();
                                            }
                                            if (policy2.equivalent(derivedState2.getCurrentRecord().getCurrentValue(), obj8)) {
                                                mutableVector.add(derivedState2);
                                            } else {
                                                Object obj9 = scopeMap6.getMap().get(derivedState2);
                                                if (obj9 != null) {
                                                    if (obj9 instanceof MutableScatterSet) {
                                                        MutableScatterSet mutableScatterSet4 = (MutableScatterSet) obj9;
                                                        Object[] objArr11 = mutableScatterSet4.elements;
                                                        long[] jArr12 = mutableScatterSet4.metadata;
                                                        int length4 = jArr12.length - 2;
                                                        if (length4 >= 0) {
                                                            int i31 = 0;
                                                            while (true) {
                                                                long j15 = jArr12[i31];
                                                                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                    if (i31 != length4) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i31++;
                                                                } else {
                                                                    int i32 = 8 - ((~(i31 - length4)) >>> 31);
                                                                    for (int i33 = 0; i33 < i32; i33++) {
                                                                        if ((j15 & 255) < 128) {
                                                                            mutableScatterSet.add(objArr11[(i31 << 3) + i33]);
                                                                            c12 = '\b';
                                                                            z10 = true;
                                                                        } else {
                                                                            c12 = '\b';
                                                                        }
                                                                        j15 >>= c12;
                                                                    }
                                                                    if (i32 != 8) {
                                                                        break;
                                                                    }
                                                                    if (i31 != length4) {
                                                                        break;
                                                                    }
                                                                    i31++;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        mutableScatterSet.add(obj9);
                                                        z10 = true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    Object obj10 = scopeMap6.getMap().get(obj5);
                                    if (obj10 != null) {
                                        if (obj10 instanceof MutableScatterSet) {
                                            MutableScatterSet mutableScatterSet5 = (MutableScatterSet) obj10;
                                            Object[] objArr12 = mutableScatterSet5.elements;
                                            long[] jArr13 = mutableScatterSet5.metadata;
                                            int length5 = jArr13.length - 2;
                                            if (length5 >= 0) {
                                                int i34 = 0;
                                                while (true) {
                                                    long j16 = jArr13[i34];
                                                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                        if (i34 != length5) {
                                                            break;
                                                            break;
                                                        }
                                                        i34++;
                                                    } else {
                                                        int i35 = 8 - ((~(i34 - length5)) >>> 31);
                                                        for (int i36 = 0; i36 < i35; i36++) {
                                                            if ((j16 & 255) < 128) {
                                                                mutableScatterSet.add(objArr12[(i34 << 3) + i36]);
                                                                c11 = '\b';
                                                                z10 = true;
                                                            } else {
                                                                c11 = '\b';
                                                            }
                                                            j16 >>= c11;
                                                        }
                                                        if (i35 != 8) {
                                                            break;
                                                        }
                                                        if (i34 != length5) {
                                                            break;
                                                        }
                                                        i34++;
                                                    }
                                                }
                                            }
                                        } else {
                                            mutableScatterSet.add(obj10);
                                            z10 = true;
                                        }
                                    }
                                    j12 = j10 >> 8;
                                    i22 = i16 + 1;
                                    length = i13;
                                    map8 = map5;
                                    objArr8 = objArr5;
                                    jArr8 = jArr5;
                                    scopeMap7 = scopeMap4;
                                    i20 = i14;
                                    i21 = i15;
                                    str4 = str2;
                                } else {
                                    jArr5 = jArr8;
                                }
                                map5 = map8;
                                str2 = str4;
                                i13 = length;
                                i14 = i20;
                                i15 = i21;
                                i16 = i22;
                                j10 = j12;
                                scopeMap4 = scopeMap7;
                                objArr5 = objArr8;
                                j12 = j10 >> 8;
                                i22 = i16 + 1;
                                length = i13;
                                map8 = map5;
                                objArr8 = objArr5;
                                jArr8 = jArr5;
                                scopeMap7 = scopeMap4;
                                i20 = i14;
                                i21 = i15;
                                str4 = str2;
                            }
                            jArr4 = jArr8;
                            map4 = map8;
                            str = str4;
                            int i37 = length;
                            int i38 = i20;
                            scopeMap3 = scopeMap7;
                            objArr4 = objArr8;
                            if (i21 != 8) {
                                break;
                            }
                            length = i37;
                            i12 = i38;
                        } else {
                            jArr4 = jArr8;
                            map4 = map8;
                            str = str4;
                            scopeMap3 = scopeMap7;
                            objArr4 = objArr8;
                            i12 = i20;
                        }
                        if (i12 == length) {
                            break;
                        }
                        i20 = i12 + 1;
                        map8 = map4;
                        objArr8 = objArr4;
                        jArr8 = jArr4;
                        scopeMap7 = scopeMap3;
                        str4 = str;
                        c14 = 7;
                    }
                } else {
                    z10 = false;
                }
            } else {
                HashMap<DerivedState<?>, Object> map9 = map8;
                ScopeMap<Object, DerivedState<?>> scopeMap9 = scopeMap5;
                Iterator it3 = set.iterator();
                boolean z12 = false;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!(next instanceof StateObjectImpl) || ((StateObjectImpl) next).m2182isReadInh_f27i8$runtime_release(ReaderKind.m2170constructorimpl(2))) {
                        ScopeMap<Object, DerivedState<?>> scopeMap10 = scopeMap9;
                        if (!scopeMap10.contains(next) || (obj2 = scopeMap10.getMap().get(next)) == null) {
                            it = it3;
                            obj = next;
                            scopeMap9 = scopeMap10;
                            map = map9;
                        } else if (obj2 instanceof MutableScatterSet) {
                            MutableScatterSet mutableScatterSet6 = (MutableScatterSet) obj2;
                            Object[] objArr13 = mutableScatterSet6.elements;
                            long[] jArr14 = mutableScatterSet6.metadata;
                            int length6 = jArr14.length - 2;
                            if (length6 >= 0) {
                                int i39 = 0;
                                while (true) {
                                    long j17 = jArr14[i39];
                                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i40 = 8 - ((~(i39 - length6)) >>> 31);
                                        int i41 = 0;
                                        while (i41 < i40) {
                                            if ((j17 & 255) < 128) {
                                                it2 = it3;
                                                DerivedState<?> derivedState3 = (DerivedState) objArr13[(i39 << 3) + i41];
                                                boolean z13 = z12;
                                                Intrinsics.checkNotNull(derivedState3, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                Object obj11 = map9.get(derivedState3);
                                                SnapshotMutationPolicy<?> policy3 = derivedState3.getPolicy();
                                                if (policy3 == null) {
                                                    policy3 = SnapshotStateKt.structuralEqualityPolicy();
                                                }
                                                scopeMap = scopeMap10;
                                                jArr2 = jArr14;
                                                if (policy3.equivalent(derivedState3.getCurrentRecord().getCurrentValue(), obj11)) {
                                                    map3 = map9;
                                                    obj3 = next;
                                                    objArr2 = objArr13;
                                                    i10 = length6;
                                                    mutableVector.add(derivedState3);
                                                } else {
                                                    Object obj12 = scopeMap6.getMap().get(derivedState3);
                                                    if (obj12 == null) {
                                                        map3 = map9;
                                                        obj3 = next;
                                                        objArr2 = objArr13;
                                                        i10 = length6;
                                                    } else if (obj12 instanceof MutableScatterSet) {
                                                        MutableScatterSet mutableScatterSet7 = (MutableScatterSet) obj12;
                                                        Object[] objArr14 = mutableScatterSet7.elements;
                                                        long[] jArr15 = mutableScatterSet7.metadata;
                                                        int length7 = jArr15.length - 2;
                                                        if (length7 >= 0) {
                                                            objArr2 = objArr13;
                                                            i10 = length6;
                                                            int i42 = 0;
                                                            while (true) {
                                                                long j18 = jArr15[i42];
                                                                map3 = map9;
                                                                long[] jArr16 = jArr15;
                                                                if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i43 = 8 - ((~(i42 - length7)) >>> 31);
                                                                    int i44 = 0;
                                                                    while (i44 < i43) {
                                                                        if ((j18 & 255) < 128) {
                                                                            mutableScatterSet.add(objArr14[(i42 << 3) + i44]);
                                                                            c10 = '\b';
                                                                            z13 = true;
                                                                        } else {
                                                                            c10 = '\b';
                                                                        }
                                                                        j18 >>= c10;
                                                                        i44++;
                                                                        next = next;
                                                                    }
                                                                    obj3 = next;
                                                                    if (i43 != 8) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    obj3 = next;
                                                                }
                                                                if (i42 == length7) {
                                                                    break;
                                                                }
                                                                i42++;
                                                                jArr15 = jArr16;
                                                                next = obj3;
                                                                map9 = map3;
                                                            }
                                                        } else {
                                                            map3 = map9;
                                                            obj3 = next;
                                                            objArr2 = objArr13;
                                                            i10 = length6;
                                                        }
                                                    } else {
                                                        map3 = map9;
                                                        obj3 = next;
                                                        objArr2 = objArr13;
                                                        i10 = length6;
                                                        mutableScatterSet.add(obj12);
                                                        z12 = true;
                                                    }
                                                }
                                                z12 = z13;
                                            } else {
                                                map3 = map9;
                                                it2 = it3;
                                                obj3 = next;
                                                scopeMap = scopeMap10;
                                                jArr2 = jArr14;
                                                objArr2 = objArr13;
                                                i10 = length6;
                                            }
                                            j17 >>= 8;
                                            i41++;
                                            it3 = it2;
                                            objArr13 = objArr2;
                                            jArr14 = jArr2;
                                            scopeMap10 = scopeMap;
                                            length6 = i10;
                                            next = obj3;
                                            map9 = map3;
                                        }
                                        map2 = map9;
                                        it = it3;
                                        obj = next;
                                        scopeMap9 = scopeMap10;
                                        jArr = jArr14;
                                        objArr = objArr13;
                                        int i45 = length6;
                                        if (i40 != 8) {
                                            break;
                                        }
                                        length6 = i45;
                                    } else {
                                        map2 = map9;
                                        it = it3;
                                        obj = next;
                                        scopeMap9 = scopeMap10;
                                        jArr = jArr14;
                                        objArr = objArr13;
                                    }
                                    if (i39 == length6) {
                                        break;
                                    }
                                    i39++;
                                    it3 = it;
                                    objArr13 = objArr;
                                    jArr14 = jArr;
                                    scopeMap10 = scopeMap9;
                                    next = obj;
                                    map9 = map2;
                                }
                            } else {
                                map2 = map9;
                                it = it3;
                                obj = next;
                                scopeMap9 = scopeMap10;
                            }
                            map = map2;
                        } else {
                            HashMap<DerivedState<?>, Object> map10 = map9;
                            it = it3;
                            boolean z14 = z12;
                            obj = next;
                            scopeMap9 = scopeMap10;
                            DerivedState<?> derivedState4 = (DerivedState) obj2;
                            map = map10;
                            Object obj13 = map.get(derivedState4);
                            SnapshotMutationPolicy<?> policy4 = derivedState4.getPolicy();
                            if (policy4 == null) {
                                policy4 = SnapshotStateKt.structuralEqualityPolicy();
                            }
                            if (policy4.equivalent(derivedState4.getCurrentRecord().getCurrentValue(), obj13)) {
                                mutableVector.add(derivedState4);
                            } else {
                                Object obj14 = scopeMap6.getMap().get(derivedState4);
                                if (obj14 != null) {
                                    if (obj14 instanceof MutableScatterSet) {
                                        MutableScatterSet mutableScatterSet8 = (MutableScatterSet) obj14;
                                        Object[] objArr15 = mutableScatterSet8.elements;
                                        long[] jArr17 = mutableScatterSet8.metadata;
                                        int length8 = jArr17.length - 2;
                                        if (length8 < 0) {
                                            z14 = z14;
                                            break;
                                        }
                                        int i46 = 0;
                                        while (true) {
                                            long j19 = jArr17[i46];
                                            if ((((~j19) << 7) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i47 = 8 - ((~(i46 - length8)) >>> 31);
                                                for (int i48 = 0; i48 < i47; i48++) {
                                                    if ((j19 & 255) < 128) {
                                                        mutableScatterSet.add(objArr15[(i46 << 3) + i48]);
                                                        z14 = true;
                                                    }
                                                    j19 >>= 8;
                                                }
                                                if (i47 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i46 == length8) {
                                                z14 = z14;
                                                break;
                                            }
                                            i46++;
                                        }
                                    } else {
                                        mutableScatterSet.add(obj14);
                                        z14 = true;
                                    }
                                }
                            }
                            z12 = z14;
                        }
                        boolean z15 = z12;
                        Object obj15 = scopeMap6.getMap().get(obj);
                        if (obj15 != null) {
                            if (obj15 instanceof MutableScatterSet) {
                                MutableScatterSet mutableScatterSet9 = (MutableScatterSet) obj15;
                                Object[] objArr16 = mutableScatterSet9.elements;
                                long[] jArr18 = mutableScatterSet9.metadata;
                                int length9 = jArr18.length - 2;
                                if (length9 >= 0) {
                                    int i49 = 0;
                                    while (true) {
                                        long j20 = jArr18[i49];
                                        if ((((~j20) << 7) & j20 & (-9187201950435737472L)) == -9187201950435737472L) {
                                            if (i49 != length9) {
                                                break;
                                                break;
                                            }
                                            i49++;
                                        } else {
                                            int i50 = 8 - ((~(i49 - length9)) >>> 31);
                                            for (int i51 = 0; i51 < i50; i51++) {
                                                if ((j20 & 255) < 128) {
                                                    mutableScatterSet.add(objArr16[(i49 << 3) + i51]);
                                                    z15 = true;
                                                }
                                                j20 >>= 8;
                                            }
                                            if (i50 != 8) {
                                                break;
                                            }
                                            if (i49 != length9) {
                                                break;
                                            }
                                            i49++;
                                        }
                                    }
                                }
                            } else {
                                mutableScatterSet.add(obj15);
                                z15 = true;
                            }
                        }
                        z12 = z15;
                    } else {
                        it = it3;
                        map = map9;
                    }
                    map9 = map;
                    it3 = it;
                }
                z10 = z12;
            }
            if (mutableVector.isNotEmpty()) {
                int size = mutableVector.getSize();
                if (size > 0) {
                    DerivedState<?>[] content = mutableVector.getContent();
                    int i52 = 0;
                    while (true) {
                        DerivedState<?> derivedState5 = content[i52];
                        int id = SnapshotKt.currentSnapshot().getId();
                        Object obj16 = scopeMap6.getMap().get(derivedState5);
                        if (obj16 != null) {
                            boolean z16 = obj16 instanceof MutableScatterSet;
                            MutableScatterMap<Object, MutableObjectIntMap<Object>> mutableScatterMap = this.f15332f;
                            if (z16) {
                                MutableScatterSet mutableScatterSet10 = (MutableScatterSet) obj16;
                                Object[] objArr17 = mutableScatterSet10.elements;
                                long[] jArr19 = mutableScatterSet10.metadata;
                                int length10 = jArr19.length - 2;
                                if (length10 >= 0) {
                                    int i53 = 0;
                                    while (true) {
                                        long j21 = jArr19[i53];
                                        int i54 = i53;
                                        if ((((~j21) << 7) & j21 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i55 = 8 - ((~(i54 - length10)) >>> 31);
                                            int i56 = 0;
                                            while (i56 < i55) {
                                                if ((j21 & 255) < 128) {
                                                    Object obj17 = objArr17[(i54 << 3) + i56];
                                                    MutableObjectIntMap<Object> mutableObjectIntMap2 = mutableScatterMap.get(obj17);
                                                    if (mutableObjectIntMap2 == null) {
                                                        mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
                                                        mutableScatterMap.set(obj17, mutableObjectIntMap);
                                                        Unit unit = Unit.INSTANCE;
                                                    } else {
                                                        mutableObjectIntMap = mutableObjectIntMap2;
                                                    }
                                                    c(derivedState5, id, obj17, mutableObjectIntMap);
                                                } else {
                                                    jArr19 = jArr19;
                                                    objArr17 = objArr17;
                                                    i54 = i54;
                                                }
                                                j21 >>= 8;
                                                i56++;
                                                content = content;
                                                scopeMap6 = scopeMap6;
                                                jArr19 = jArr19;
                                                objArr17 = objArr17;
                                                i54 = i54;
                                            }
                                            derivedStateArr = content;
                                            scopeMap2 = scopeMap6;
                                            jArr3 = jArr19;
                                            objArr3 = objArr17;
                                            int i57 = i54;
                                            if (i55 != 8) {
                                                break;
                                            }
                                            i11 = i57;
                                        } else {
                                            derivedStateArr = content;
                                            scopeMap2 = scopeMap6;
                                            jArr3 = jArr19;
                                            objArr3 = objArr17;
                                            i11 = i54;
                                        }
                                        if (i11 == length10) {
                                            break;
                                        }
                                        i53 = i11 + 1;
                                        content = derivedStateArr;
                                        scopeMap6 = scopeMap2;
                                        jArr19 = jArr3;
                                        objArr17 = objArr3;
                                    }
                                } else {
                                    derivedStateArr = content;
                                    scopeMap2 = scopeMap6;
                                }
                            } else {
                                derivedStateArr = content;
                                scopeMap2 = scopeMap6;
                                MutableObjectIntMap<Object> mutableObjectIntMap3 = mutableScatterMap.get(obj16);
                                if (mutableObjectIntMap3 == null) {
                                    mutableObjectIntMap3 = new MutableObjectIntMap<>(0, 1, null);
                                    mutableScatterMap.set(obj16, mutableObjectIntMap3);
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                c(derivedState5, id, obj16, mutableObjectIntMap3);
                            }
                        } else {
                            derivedStateArr = content;
                            scopeMap2 = scopeMap6;
                        }
                        i52++;
                        if (i52 >= size) {
                            break;
                        }
                        content = derivedStateArr;
                        scopeMap6 = scopeMap2;
                    }
                }
                mutableVector.clear();
            }
            return z10;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0089 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:26:0x008b A[LOOP:0: B:11:0x003b->B:26:0x008b, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:36:0x008f A[EDGE_INSN: B:36:0x008f->B:27:0x008f BREAK  A[LOOP:0: B:11:0x003b->B:26:0x008b], SYNTHETIC] */
        public final void c(Object obj, int i10, Object obj2, MutableObjectIntMap<Object> mutableObjectIntMap) {
            int i11;
            int i12;
            if (this.f15336j > 0) {
                return;
            }
            int iPut = mutableObjectIntMap.put(obj, i10, -1);
            if (!(obj instanceof DerivedState) || iPut == i10) {
                i11 = -1;
            } else {
                DerivedState.Record currentRecord = ((DerivedState) obj).getCurrentRecord();
                this.f15338l.put(obj, currentRecord.getCurrentValue());
                ObjectIntMap<StateObject> dependencies = currentRecord.getDependencies();
                ScopeMap<Object, DerivedState<?>> scopeMap = this.f15337k;
                scopeMap.removeScope(obj);
                Object[] objArr = dependencies.keys;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j10 = jArr[i13];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i13 != length) {
                                break;
                                break;
                            }
                            i13++;
                        } else {
                            int i14 = 8;
                            int i15 = 8 - ((~(i13 - length)) >>> 31);
                            int i16 = 0;
                            while (i16 < i15) {
                                if ((j10 & 255) < 128) {
                                    StateObject stateObject = (StateObject) objArr[(i13 << 3) + i16];
                                    if (stateObject instanceof StateObjectImpl) {
                                        ((StateObjectImpl) stateObject).m2183recordReadInh_f27i8$runtime_release(ReaderKind.m2170constructorimpl(2));
                                    }
                                    scopeMap.add(stateObject, obj);
                                    i12 = 8;
                                } else {
                                    i12 = i14;
                                }
                                j10 >>= i12;
                                i16++;
                                i14 = i12;
                            }
                            if (i15 != i14) {
                                break;
                            } else if (i13 != length) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                i11 = -1;
            }
            if (iPut == i11) {
                if (obj instanceof StateObjectImpl) {
                    ((StateObjectImpl) obj).m2183recordReadInh_f27i8$runtime_release(ReaderKind.m2170constructorimpl(2));
                }
                this.f15331e.add(obj, obj2);
            }
        }

        public final void d(Object obj, Object obj2) {
            ScopeMap<Object, Object> scopeMap = this.f15331e;
            scopeMap.remove(obj2, obj);
            if (!(obj2 instanceof DerivedState) || scopeMap.contains(obj2)) {
                return;
            }
            this.f15337k.removeScope(obj2);
            this.f15338l.remove(obj2);
        }

        public final void e(@NotNull Function1<Object, Boolean> function1) {
            long[] jArr;
            int i10;
            long[] jArr2;
            int i11;
            long j10;
            int i12;
            long j11;
            int i13;
            MutableScatterMap<Object, MutableObjectIntMap<Object>> mutableScatterMap = this.f15332f;
            long[] jArr3 = mutableScatterMap.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i14 = 0;
            while (true) {
                long j12 = jArr3[i14];
                long j13 = -9187201950435737472L;
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8;
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j12 & 255) < 128) {
                            int i18 = (i14 << 3) + i17;
                            Object obj = mutableScatterMap.keys[i18];
                            MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) mutableScatterMap.values[i18];
                            Boolean boolInvoke = function1.invoke(obj);
                            if (boolInvoke.booleanValue()) {
                                Object[] objArr = mutableObjectIntMap.keys;
                                int[] iArr = mutableObjectIntMap.values;
                                long[] jArr4 = mutableObjectIntMap.metadata;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                if (length2 >= 0) {
                                    i12 = i16;
                                    int i19 = 0;
                                    while (true) {
                                        long j14 = jArr4[i19];
                                        i11 = i14;
                                        j10 = j12;
                                        j11 = -9187201950435737472L;
                                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                            for (int i21 = 0; i21 < i20; i21++) {
                                                if ((j14 & 255) < 128) {
                                                    int i22 = (i19 << 3) + i21;
                                                    Object obj2 = objArr[i22];
                                                    int i23 = iArr[i22];
                                                    d(obj, obj2);
                                                }
                                                j14 >>= 8;
                                            }
                                            if (i20 != 8) {
                                                break;
                                            }
                                        }
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        i14 = i11;
                                        j12 = j10;
                                    }
                                } else {
                                    i11 = i14;
                                    j10 = j12;
                                    i12 = i16;
                                    j11 = -9187201950435737472L;
                                }
                            } else {
                                jArr2 = jArr3;
                                i11 = i14;
                                j10 = j12;
                                i12 = i16;
                                j11 = j13;
                            }
                            if (boolInvoke.booleanValue()) {
                                mutableScatterMap.removeValueAt(i18);
                            }
                            i13 = 8;
                        } else {
                            jArr2 = jArr3;
                            i11 = i14;
                            j10 = j12;
                            i12 = i16;
                            j11 = j13;
                            i13 = i15;
                        }
                        j12 = j10 >> i13;
                        i17++;
                        i15 = i13;
                        j13 = j11;
                        jArr3 = jArr2;
                        i16 = i12;
                        i14 = i11;
                    }
                    jArr = jArr3;
                    int i24 = i14;
                    if (i16 != i15) {
                        return;
                    } else {
                        i10 = i24;
                    }
                } else {
                    jArr = jArr3;
                    i10 = i14;
                }
                if (i10 == length) {
                    return;
                }
                i14 = i10 + 1;
                jArr3 = jArr;
            }
        }
    }

    /* JADX INFO: compiled from: SnapshotStateObserver.kt */
    public static final class a extends Lambda implements Function2<Set<? extends Object>, Snapshot, Unit> {
        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Set<? extends Object> set, Snapshot snapshot) {
            SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
            SnapshotStateObserver.access$addChanges(snapshotStateObserver, set);
            if (SnapshotStateObserver.access$drainChanges(snapshotStateObserver)) {
                SnapshotStateObserver.access$sendNotifications(snapshotStateObserver);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SnapshotStateObserver.kt */
    @SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$readObserver$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,654:1\n89#2:655\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$readObserver$1\n*L\n167#1:655\n*E\n"})
    public static final class b extends Lambda implements Function1<Object, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            if (!SnapshotStateObserver.this.f15324h) {
                MutableVector mutableVector = SnapshotStateObserver.this.f15322f;
                SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
                synchronized (mutableVector) {
                    ObservedScopeMap observedScopeMap = snapshotStateObserver.f15325i;
                    Intrinsics.checkNotNull(observedScopeMap);
                    Object obj2 = observedScopeMap.f15328b;
                    Intrinsics.checkNotNull(obj2);
                    int i10 = observedScopeMap.f15330d;
                    MutableObjectIntMap<Object> mutableObjectIntMap = observedScopeMap.f15329c;
                    if (mutableObjectIntMap == null) {
                        mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
                        observedScopeMap.f15329c = mutableObjectIntMap;
                        observedScopeMap.f15332f.set(obj2, mutableObjectIntMap);
                        Unit unit = Unit.INSTANCE;
                    }
                    observedScopeMap.c(obj, i10, obj2, mutableObjectIntMap);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(@NotNull Function1<? super Function0<Unit>, Unit> function1) {
        this.f15317a = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void access$addChanges(SnapshotStateObserver snapshotStateObserver, Set set) {
        List listPlus;
        while (true) {
            AtomicReference<Object> atomicReference = snapshotStateObserver.f15318b;
            Object obj = atomicReference.get();
            if (obj == null) {
                listPlus = set;
            } else if (obj instanceof Set) {
                listPlus = CollectionsKt__CollectionsKt.listOf((Object[]) new Set[]{obj, set});
            } else {
                if (!(obj instanceof List)) {
                    ComposerKt.composeRuntimeError("Unexpected notification");
                    throw new KotlinNothingValueException();
                }
                listPlus = CollectionsKt___CollectionsKt.plus((Collection) obj, (Iterable) bk.d.listOf(set));
            }
            while (!atomicReference.compareAndSet(obj, listPlus)) {
                if (atomicReference.get() != obj) {
                }
            }
            return;
        }
    }

    public static final boolean access$drainChanges(SnapshotStateObserver snapshotStateObserver) {
        boolean z10;
        Set<? extends Object> set;
        synchronized (snapshotStateObserver.f15322f) {
            z10 = snapshotStateObserver.f15319c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            AtomicReference<Object> atomicReference = snapshotStateObserver.f15318b;
            Object obj = atomicReference.get();
            Set<? extends Object> set2 = null;
            objSubList = null;
            Object objSubList = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        ComposerKt.composeRuntimeError("Unexpected notification");
                        throw new KotlinNothingValueException();
                    }
                    List list = (List) obj;
                    Set<? extends Object> set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set = set3;
                }
                while (true) {
                    if (atomicReference.compareAndSet(obj, objSubList)) {
                        set2 = set;
                    } else if (atomicReference.get() != obj) {
                    }
                }
            }
            if (set2 == null) {
                return z11;
            }
            synchronized (snapshotStateObserver.f15322f) {
                try {
                    MutableVector<ObservedScopeMap> mutableVector = snapshotStateObserver.f15322f;
                    int size = mutableVector.getSize();
                    if (size > 0) {
                        ObservedScopeMap[] content = mutableVector.getContent();
                        int i10 = 0;
                        do {
                            z11 = content[i10].b(set2) || z11;
                            i10++;
                        } while (i10 < size);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static final void access$sendNotifications(SnapshotStateObserver snapshotStateObserver) {
        snapshotStateObserver.getClass();
        snapshotStateObserver.f15317a.invoke(new d(snapshotStateObserver));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0076 A[Catch: all -> 0x009b, LOOP:1: B:12:0x0032->B:23:0x0076, LOOP_END, TryCatch #0 {all -> 0x009b, blocks: (B:4:0x0007, B:6:0x0011, B:24:0x007d, B:26:0x0087, B:31:0x009d, B:28:0x008c, B:9:0x0026, B:12:0x0032, B:14:0x0047, B:16:0x0053, B:18:0x005d, B:19:0x0068, B:23:0x0076, B:32:0x00a3), top: B:37:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x007d A[EDGE_INSN: B:44:0x007d->B:24:0x007d BREAK  A[LOOP:1: B:12:0x0032->B:23:0x0076], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    public final void clear(@NotNull Object scope) {
        int i10;
        synchronized (this.f15322f) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.f15322f;
                int size = mutableVector.getSize();
                int i11 = 0;
                int i12 = 0;
                while (i11 < size) {
                    ObservedScopeMap observedScopeMap = mutableVector.getContent()[i11];
                    MutableObjectIntMap<Object> mutableObjectIntMapRemove = observedScopeMap.f15332f.remove(scope);
                    if (mutableObjectIntMapRemove == null) {
                        i10 = i11;
                    } else {
                        Object[] objArr = mutableObjectIntMapRemove.keys;
                        int[] iArr = mutableObjectIntMapRemove.values;
                        long[] jArr = mutableObjectIntMapRemove.metadata;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i13 = 0;
                            while (true) {
                                long j10 = jArr[i13];
                                i10 = i11;
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                                    for (int i15 = 0; i15 < i14; i15++) {
                                        if ((j10 & 255) < 128) {
                                            int i16 = (i13 << 3) + i15;
                                            Object obj = objArr[i16];
                                            int i17 = iArr[i16];
                                            observedScopeMap.d(scope, obj);
                                        }
                                        j10 >>= 8;
                                    }
                                    if (i14 != 8) {
                                        break;
                                    }
                                    if (i13 != length) {
                                        break;
                                    }
                                    i13++;
                                    i11 = i10;
                                } else if (i13 != length) {
                                    break;
                                    break;
                                } else {
                                    i13++;
                                    i11 = i10;
                                }
                            }
                        } else {
                            i10 = i11;
                        }
                    }
                    if (!observedScopeMap.f15332f.isNotEmpty()) {
                        i12++;
                    } else if (i12 > 0) {
                        mutableVector.getContent()[i10 - i12] = mutableVector.getContent()[i10];
                    }
                    i11 = i10 + 1;
                }
                int i18 = size - i12;
                ArraysKt___ArraysJvmKt.fill(mutableVector.getContent(), (Object) null, i18, size);
                mutableVector.setSize(i18);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clearIf(@NotNull Function1<Object, Boolean> predicate) {
        synchronized (this.f15322f) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.f15322f;
                int size = mutableVector.getSize();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    ObservedScopeMap observedScopeMap = mutableVector.getContent()[i11];
                    observedScopeMap.e(predicate);
                    if (!observedScopeMap.f15332f.isNotEmpty()) {
                        i10++;
                    } else if (i10 > 0) {
                        mutableVector.getContent()[i11 - i10] = mutableVector.getContent()[i11];
                    }
                }
                int i12 = size - i10;
                ArraysKt___ArraysJvmKt.fill(mutableVector.getContent(), (Object) null, i12, size);
                mutableVector.setSize(i12);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @TestOnly
    public final void notifyChanges(@NotNull Set<? extends Object> changes, @NotNull Snapshot snapshot) {
        this.f15320d.invoke(changes, snapshot);
    }

    public final <T> void observeReads(@NotNull T scope, @NotNull Function1<? super T, Unit> onValueChangedForScope, @NotNull Function0<Unit> block) {
        ObservedScopeMap observedScopeMap;
        ObservedScopeMap observedScopeMap2;
        synchronized (this.f15322f) {
            MutableVector<ObservedScopeMap> mutableVector = this.f15322f;
            int size = mutableVector.getSize();
            if (size <= 0) {
                observedScopeMap = null;
                break;
            }
            ObservedScopeMap[] content = mutableVector.getContent();
            int i10 = 0;
            while (true) {
                observedScopeMap = content[i10];
                if (observedScopeMap.f15327a == onValueChangedForScope) {
                    break;
                }
                i10++;
                if (i10 >= size) {
                    observedScopeMap = null;
                    break;
                }
            }
            observedScopeMap2 = observedScopeMap;
            if (observedScopeMap2 == null) {
                Intrinsics.checkNotNull(onValueChangedForScope, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                observedScopeMap2 = new ObservedScopeMap((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(onValueChangedForScope, 1));
                mutableVector.add(observedScopeMap2);
            }
        }
        boolean z10 = this.f15324h;
        ObservedScopeMap observedScopeMap3 = this.f15325i;
        long j10 = this.f15326j;
        if (j10 != -1 && j10 != ActualJvm_jvmKt.currentThreadId()) {
            PreconditionsKt.throwIllegalArgumentException("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j10 + "), currentThread={id=" + ActualJvm_jvmKt.currentThreadId() + ", name=" + ActualJvm_jvmKt.currentThreadName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.f15324h = false;
            this.f15325i = observedScopeMap2;
            this.f15326j = ActualJvm_jvmKt.currentThreadId();
            observedScopeMap2.a(scope, this.f15321e, block);
        } finally {
            this.f15325i = observedScopeMap3;
            this.f15324h = z10;
            this.f15326j = j10;
        }
    }

    public final void start() {
        this.f15323g = Snapshot.INSTANCE.registerApplyObserver(this.f15320d);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.f15323g;
        if (observerHandle != null) {
            observerHandle.dispose();
        }
    }

    @Deprecated(message = "Replace with Snapshot.withoutReadObservation()", replaceWith = @ReplaceWith(expression = "Snapshot.withoutReadObservation(block)", imports = {"androidx.compose.runtime.snapshots.Snapshot"}))
    public final void withNoObservations(@NotNull Function0<Unit> block) {
        boolean z10 = this.f15324h;
        this.f15324h = true;
        try {
            block.invoke();
        } finally {
            this.f15324h = z10;
        }
    }

    public final void clear() {
        synchronized (this.f15322f) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.f15322f;
                int size = mutableVector.getSize();
                if (size > 0) {
                    ObservedScopeMap[] content = mutableVector.getContent();
                    int i10 = 0;
                    do {
                        ObservedScopeMap observedScopeMap = content[i10];
                        observedScopeMap.f15331e.clear();
                        observedScopeMap.f15332f.clear();
                        observedScopeMap.f15337k.clear();
                        observedScopeMap.f15338l.clear();
                        i10++;
                    } while (i10 < size);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
