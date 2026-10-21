package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import m0.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DerivedState.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n+ 2 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 7 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,400:1\n372#2,2:401\n374#2,2:414\n75#2,4:416\n377#2,2:446\n75#2,4:448\n372#2,2:452\n374#2,5:465\n460#3,11:403\n460#3,11:454\n401#4,4:420\n373#4,6:424\n383#4,3:431\n386#4,2:435\n406#4,2:437\n389#4,6:439\n408#4:445\n1810#5:430\n1672#5:434\n1843#6:470\n1843#6:472\n2420#6:474\n2420#6:475\n2420#6:476\n89#7:471\n89#7:473\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n*L\n179#1:401,2\n179#1:414,2\n181#1:416,4\n179#1:446,2\n195#1:448,4\n197#1:452,2\n197#1:465,5\n179#1:403,11\n197#1:454,11\n183#1:420,4\n183#1:424,6\n183#1:431,3\n183#1:435,2\n183#1:437,2\n183#1:439,6\n183#1:445\n183#1:430\n183#1:434\n220#1:470\n243#1:472\n282#1:474\n293#1:475\n301#1:476\n220#1:471\n243#1:473\n*E\n"})
public final class DerivedSnapshotState<T> extends StateObjectImpl implements DerivedState<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Function0<T> f14542q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public final SnapshotMutationPolicy<T> f14543r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public ResultRecord<T> f14544s0 = new ResultRecord<>();

    /* JADX INFO: compiled from: DerivedState.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0007\u0018\u0000 4*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003:\u00014B\u0007¢\u0006\u0004\b2\u00103J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u001a\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nR\"\u0010\u0016\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R(\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010+\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0011\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010\u0015R\u0014\u00101\u001a\u00028\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010(¨\u00065"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/DerivedState$Record;", "value", "", "assign", "create", "Landroidx/compose/runtime/DerivedState;", "derivedState", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "readableHash", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getValidSnapshotId", "()I", "setValidSnapshotId", "(I)V", "validSnapshotId", "d", "getValidSnapshotWriteCount", "setValidSnapshotWriteCount", "validSnapshotWriteCount", "Landroidx/collection/ObjectIntMap;", "Landroidx/compose/runtime/snapshots/StateObject;", "e", "Landroidx/collection/ObjectIntMap;", "getDependencies", "()Landroidx/collection/ObjectIntMap;", "setDependencies", "(Landroidx/collection/ObjectIntMap;)V", "dependencies", "", "f", "Ljava/lang/Object;", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "result", "g", "getResultHash", "setResultHash", "resultHash", "getCurrentValue", "currentValue", "<init>", "()V", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,400:1\n1843#2:401\n1843#2:403\n1843#2:405\n89#3:402\n89#3:404\n89#3:406\n372#4,2:407\n374#4,2:420\n377#4,2:448\n460#5,11:409\n401#6,4:422\n373#6,6:426\n383#6,3:433\n386#6,2:437\n406#6,2:439\n389#6,6:441\n408#6:447\n1810#7:432\n1672#7:436\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n*L\n110#1:401\n117#1:403\n128#1:405\n110#1:402\n117#1:404\n128#1:406\n130#1:407,2\n130#1:420,2\n130#1:448,2\n130#1:409,11\n131#1:422,4\n131#1:426,6\n131#1:433,3\n131#1:437,2\n131#1:439,2\n131#1:441,6\n131#1:447\n131#1:432\n131#1:436\n*E\n"})
    public static final class ResultRecord<T> extends StateRecord implements DerivedState.Record<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public int validSnapshotId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public int validSnapshotWriteCount;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public ObjectIntMap<StateObject> dependencies = ObjectIntMapKt.emptyObjectIntMap();

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Object result = f14545h;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public int resultHash;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final Object f14545h = new Object();

        /* JADX INFO: compiled from: DerivedState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord$Companion;", "", "()V", "Unset", "getUnset", "()Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Object getUnset() {
                return ResultRecord.f14545h;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@NotNull StateRecord value) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            ResultRecord resultRecord = (ResultRecord) value;
            setDependencies(resultRecord.getDependencies());
            this.result = resultRecord.result;
            this.resultHash = resultRecord.resultHash;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create() {
            return new ResultRecord();
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public T getCurrentValue() {
            return (T) this.result;
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        @NotNull
        public ObjectIntMap<StateObject> getDependencies() {
            return this.dependencies;
        }

        @Nullable
        public final Object getResult() {
            return this.result;
        }

        public final int getResultHash() {
            return this.resultHash;
        }

        public final int getValidSnapshotId() {
            return this.validSnapshotId;
        }

        public final int getValidSnapshotWriteCount() {
            return this.validSnapshotWriteCount;
        }

        public final boolean isValid(@NotNull DerivedState<?> derivedState, @NotNull Snapshot snapshot) {
            boolean z10;
            boolean z11;
            synchronized (SnapshotKt.getLock()) {
                z10 = true;
                z11 = (this.validSnapshotId == snapshot.getId() && this.validSnapshotWriteCount == snapshot.getWriteCount()) ? false : true;
            }
            if (this.result == f14545h || (z11 && this.resultHash != readableHash(derivedState, snapshot))) {
                z10 = false;
            }
            if (z10 && z11) {
                synchronized (SnapshotKt.getLock()) {
                    this.validSnapshotId = snapshot.getId();
                    this.validSnapshotWriteCount = snapshot.getWriteCount();
                    Unit unit = Unit.INSTANCE;
                }
            }
            return z10;
        }

        public final int readableHash(@NotNull DerivedState<?> derivedState, @NotNull Snapshot snapshot) throws Throwable {
            ObjectIntMap<StateObject> dependencies;
            int i10;
            int i11;
            long[] jArr;
            int i12;
            StateRecord stateRecordCurrent;
            synchronized (SnapshotKt.getLock()) {
                dependencies = getDependencies();
            }
            char c10 = 7;
            if (!dependencies.isNotEmpty()) {
                return 7;
            }
            MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
            int size = mutableVectorDerivedStateObservers.getSize();
            int i13 = 1;
            if (size > 0) {
                DerivedStateObserver[] content = mutableVectorDerivedStateObservers.getContent();
                int i14 = 0;
                do {
                    content[i14].start(derivedState);
                    i14++;
                } while (i14 < size);
            }
            try {
                Object[] objArr = dependencies.keys;
                int[] iArr = dependencies.values;
                long[] jArr2 = dependencies.metadata;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int iIdentityHashCode = 7;
                    int i15 = 0;
                    while (true) {
                        long j10 = jArr2[i15];
                        if ((((~j10) << c10) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8;
                            int i17 = 8 - ((~(i15 - length)) >>> 31);
                            int i18 = 0;
                            while (i18 < i17) {
                                if ((j10 & 255) < 128) {
                                    int i19 = (i15 << 3) + i18;
                                    StateObject stateObject = (StateObject) objArr[i19];
                                    if (iArr[i19] != i13) {
                                        jArr2 = jArr2;
                                        i10 = 0;
                                    } else {
                                        if (stateObject instanceof DerivedSnapshotState) {
                                            DerivedSnapshotState derivedSnapshotState = (DerivedSnapshotState) stateObject;
                                            i10 = 0;
                                            stateRecordCurrent = derivedSnapshotState.a((ResultRecord) SnapshotKt.current(derivedSnapshotState.f14544s0, snapshot), snapshot, false, derivedSnapshotState.f14542q0);
                                        } else {
                                            i10 = 0;
                                            stateRecordCurrent = SnapshotKt.current(stateObject.getFirstStateRecord(), snapshot);
                                        }
                                        iIdentityHashCode = (((iIdentityHashCode * 31) + ActualJvm_jvmKt.identityHashCode(stateRecordCurrent)) * 31) + stateRecordCurrent.getSnapshotId();
                                    }
                                    i12 = 8;
                                } else {
                                    jArr2 = jArr2;
                                    i10 = 0;
                                    i12 = i16;
                                }
                                try {
                                    j10 >>= i12;
                                    i18++;
                                    i16 = i12;
                                    jArr2 = jArr2;
                                    i13 = 1;
                                } catch (Throwable th2) {
                                    th = th2;
                                    int size2 = mutableVectorDerivedStateObservers.getSize();
                                    if (size2 > 0) {
                                        DerivedStateObserver[] content2 = mutableVectorDerivedStateObservers.getContent();
                                        int i20 = i10;
                                        do {
                                            content2[i20].done(derivedState);
                                            i20++;
                                        } while (i20 < size2);
                                    }
                                    throw th;
                                }
                            }
                            jArr = jArr2;
                            i10 = 0;
                            if (i17 != i16) {
                                break;
                            }
                        } else {
                            jArr = jArr2;
                            i10 = 0;
                        }
                        if (i15 == length) {
                            break;
                        }
                        i15++;
                        jArr2 = jArr;
                        c10 = 7;
                        i13 = 1;
                    }
                    i11 = iIdentityHashCode;
                } else {
                    i10 = 0;
                    i11 = 7;
                }
                Unit unit = Unit.INSTANCE;
                int size3 = mutableVectorDerivedStateObservers.getSize();
                if (size3 <= 0) {
                    return i11;
                }
                DerivedStateObserver[] content3 = mutableVectorDerivedStateObservers.getContent();
                int i21 = i10;
                do {
                    content3[i21].done(derivedState);
                    i21++;
                } while (i21 < size3);
                return i11;
            } catch (Throwable th3) {
                th = th3;
                i10 = 0;
            }
        }

        public void setDependencies(@NotNull ObjectIntMap<StateObject> objectIntMap) {
            this.dependencies = objectIntMap;
        }

        public final void setResult(@Nullable Object obj) {
            this.result = obj;
        }

        public final void setResultHash(int i10) {
            this.resultHash = i10;
        }

        public final void setValidSnapshotId(int i10) {
            this.validSnapshotId = i10;
        }

        public final void setValidSnapshotWriteCount(int i10) {
            this.validSnapshotWriteCount = i10;
        }
    }

    /* JADX INFO: compiled from: DerivedState.kt */
    public static final class a extends Lambda implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DerivedSnapshotState<T> f14551p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ IntRef f14552q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MutableObjectIntMap<StateObject> f14553r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f14554s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DerivedSnapshotState<T> derivedSnapshotState, IntRef intRef, MutableObjectIntMap<StateObject> mutableObjectIntMap, int i10) {
            super(1);
            this.f14551p0 = derivedSnapshotState;
            this.f14552q0 = intRef;
            this.f14553r0 = mutableObjectIntMap;
            this.f14554s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            if (obj == this.f14551p0) {
                throw new IllegalStateException("A derived state calculation cannot read itself".toString());
            }
            if (obj instanceof StateObject) {
                int element = this.f14552q0.getElement() - this.f14554s0;
                MutableObjectIntMap<StateObject> mutableObjectIntMap = this.f14553r0;
                mutableObjectIntMap.set(obj, Math.min(element, mutableObjectIntMap.getOrDefault(obj, Integer.MAX_VALUE)));
            }
            return Unit.INSTANCE;
        }
    }

    public DerivedSnapshotState(@Nullable SnapshotMutationPolicy snapshotMutationPolicy, @NotNull Function0 function0) {
        this.f14542q0 = function0;
        this.f14543r0 = snapshotMutationPolicy;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x00ae A[EDGE_INSN: B:110:0x00ae->B:34:0x00ae BREAK  A[LOOP:1: B:18:0x0053->B:33:0x00a7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a7 A[Catch: all -> 0x0040, LOOP:1: B:18:0x0053->B:33:0x00a7, LOOP_END, TryCatch #0 {all -> 0x0040, blocks: (B:10:0x0029, B:12:0x0037, B:15:0x0043, B:18:0x0053, B:20:0x0068, B:22:0x0074, B:24:0x007e, B:26:0x0095, B:29:0x009c, B:33:0x00a7, B:34:0x00ae), top: B:102:0x0029 }] */
    public final ResultRecord<T> a(ResultRecord<T> resultRecord, Snapshot snapshot, boolean z10, Function0<? extends T> function0) {
        Snapshot.Companion companion;
        SnapshotMutationPolicy<T> snapshotMutationPolicy;
        int i10;
        ResultRecord<T> resultRecord2 = resultRecord;
        if (!resultRecord2.isValid(this, snapshot)) {
            int i11 = 0;
            MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
            SnapshotThreadLocal<IntRef> snapshotThreadLocal = i0.f83258a;
            IntRef intRef = snapshotThreadLocal.get();
            if (intRef == null) {
                intRef = new IntRef(0);
                snapshotThreadLocal.set(intRef);
            }
            int element = intRef.getElement();
            MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
            int size = mutableVectorDerivedStateObservers.getSize();
            if (size > 0) {
                DerivedStateObserver[] content = mutableVectorDerivedStateObservers.getContent();
                int i12 = 0;
                while (true) {
                    content[i12].start(this);
                    int i13 = i12 + 1;
                    if (i13 >= size) {
                        break;
                    }
                    i12 = i13;
                }
            }
            try {
                intRef.setElement(element + 1);
                Object objObserve = Snapshot.INSTANCE.observe(new a(this, intRef, mutableObjectIntMap, element), null, function0);
                intRef.setElement(element);
                int size2 = mutableVectorDerivedStateObservers.getSize();
                if (size2 > 0) {
                    DerivedStateObserver[] content2 = mutableVectorDerivedStateObservers.getContent();
                    do {
                        content2[i11].done(this);
                        i11++;
                    } while (i11 < size2);
                }
                synchronized (SnapshotKt.getLock()) {
                    try {
                        companion = Snapshot.INSTANCE;
                        Snapshot current = companion.getCurrent();
                        if (resultRecord.getResult() == ResultRecord.INSTANCE.getUnset() || (snapshotMutationPolicy = this.f14543r0) == null || !snapshotMutationPolicy.equivalent((T) objObserve, (T) resultRecord.getResult())) {
                            resultRecord2 = (ResultRecord) SnapshotKt.newWritableRecord(this.f14544s0, this, current);
                            resultRecord2.setDependencies(mutableObjectIntMap);
                            resultRecord2.setResultHash(resultRecord2.readableHash(this, current));
                            resultRecord2.setResult(objObserve);
                        } else {
                            resultRecord2.setDependencies(mutableObjectIntMap);
                            resultRecord2.setResultHash(resultRecord2.readableHash(this, current));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                IntRef intRef2 = i0.f83258a.get();
                if (intRef2 != null && intRef2.getElement() == 0) {
                    companion.notifyObjectsInitialized();
                    synchronized (SnapshotKt.getLock()) {
                        Snapshot current2 = companion.getCurrent();
                        resultRecord2.setValidSnapshotId(current2.getId());
                        resultRecord2.setValidSnapshotWriteCount(current2.getWriteCount());
                        Unit unit = Unit.INSTANCE;
                    }
                }
                return resultRecord2;
            } catch (Throwable th3) {
                int size3 = mutableVectorDerivedStateObservers.getSize();
                if (size3 > 0) {
                    DerivedStateObserver[] content3 = mutableVectorDerivedStateObservers.getContent();
                    do {
                        content3[i11].done(this);
                        i11++;
                    } while (i11 < size3);
                }
                throw th3;
            }
        }
        if (z10) {
            MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers2 = SnapshotStateKt.derivedStateObservers();
            int size4 = mutableVectorDerivedStateObservers2.getSize();
            if (size4 > 0) {
                DerivedStateObserver[] content4 = mutableVectorDerivedStateObservers2.getContent();
                int i14 = 0;
                do {
                    content4[i14].start(this);
                    i14++;
                } while (i14 < size4);
            }
            try {
                ObjectIntMap<StateObject> dependencies = resultRecord.getDependencies();
                SnapshotThreadLocal<IntRef> snapshotThreadLocal2 = i0.f83258a;
                IntRef intRef3 = snapshotThreadLocal2.get();
                if (intRef3 == null) {
                    intRef3 = new IntRef(0);
                    snapshotThreadLocal2.set(intRef3);
                }
                int element2 = intRef3.getElement();
                Object[] objArr = dependencies.keys;
                int[] iArr = dependencies.values;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j10 = jArr[i15];
                        long[] jArr2 = jArr;
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i15 != length) {
                                break;
                                break;
                            }
                            i15++;
                            jArr = jArr2;
                        } else {
                            int i16 = 8;
                            int i17 = 8 - ((~(i15 - length)) >>> 31);
                            int i18 = 0;
                            while (i18 < i17) {
                                if ((j10 & 255) < 128) {
                                    int i19 = (i15 << 3) + i18;
                                    StateObject stateObject = (StateObject) objArr[i19];
                                    intRef3.setElement(element2 + iArr[i19]);
                                    Function1<Object, Unit> readObserver = snapshot.getReadObserver();
                                    if (readObserver != null) {
                                        readObserver.invoke(stateObject);
                                    }
                                    i10 = 8;
                                } else {
                                    i10 = i16;
                                }
                                j10 >>= i10;
                                i18++;
                                i16 = i10;
                            }
                            if (i17 != i16) {
                                break;
                            }
                            if (i15 != length) {
                                break;
                            }
                            i15++;
                            jArr = jArr2;
                        }
                    }
                }
                intRef3.setElement(element2);
                Unit unit2 = Unit.INSTANCE;
                int size5 = mutableVectorDerivedStateObservers2.getSize();
                if (size5 > 0) {
                    DerivedStateObserver[] content5 = mutableVectorDerivedStateObservers2.getContent();
                    int i20 = 0;
                    do {
                        content5[i20].done(this);
                        i20++;
                    } while (i20 < size5);
                }
            } catch (Throwable th4) {
                int size6 = mutableVectorDerivedStateObservers2.getSize();
                if (size6 > 0) {
                    DerivedStateObserver[] content6 = mutableVectorDerivedStateObservers2.getContent();
                    int i21 = 0;
                    do {
                        content6[i21].done(this);
                        i21++;
                    } while (i21 < size6);
                }
                throw th4;
            }
        }
        return resultRecord2;
    }

    @Override // androidx.compose.runtime.DerivedState
    @NotNull
    public final DerivedState.Record<T> getCurrentRecord() {
        Snapshot current = Snapshot.INSTANCE.getCurrent();
        return a((ResultRecord) SnapshotKt.current(this.f14544s0, current), current, false, this.f14542q0);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public final StateRecord getFirstStateRecord() {
        return this.f14544s0;
    }

    @Override // androidx.compose.runtime.DerivedState
    @Nullable
    public final SnapshotMutationPolicy<T> getPolicy() {
        return this.f14543r0;
    }

    @Override // androidx.compose.runtime.State
    public final T getValue() {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Function1<Object, Unit> readObserver = companion.getCurrent().getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(this);
        }
        Snapshot current = companion.getCurrent();
        return (T) a((ResultRecord) SnapshotKt.current(this.f14544s0, current), current, true, this.f14542q0).getResult();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void prependStateRecord(@NotNull StateRecord stateRecord) {
        Intrinsics.checkNotNull(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f14544s0 = (ResultRecord) stateRecord;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.f14544s0);
        sb2.append(resultRecord.isValid(this, Snapshot.INSTANCE.getCurrent()) ? String.valueOf(resultRecord.getResult()) : "<Not calculated>");
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }
}
