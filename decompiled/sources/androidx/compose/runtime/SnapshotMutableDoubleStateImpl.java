package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import com.bbva.component.dm.naturalauth.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import m0.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnapshotDoubleState.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001 B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007H\u0096\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\"\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0014\u0010\u0015\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableDoubleStateImpl;", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/MutableDoubleState;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", "component1", "()Ljava/lang/Double;", "Lkotlin/Function1;", "", "component2", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "prependStateRecord", "previous", "current", "applied", "mergeRecords", "", "toString", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getDoubleValue", "()D", "setDoubleValue", "(D)V", "doubleValue", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", Constants.policy, "<init>", "a", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshotDoubleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotDoubleState.kt\nandroidx/compose/runtime/SnapshotMutableDoubleStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 FloatingPointEquality.android.kt\nandroidx/compose/runtime/internal/FloatingPointEquality_androidKt\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,195:1\n2420#2:196\n2341#2,2:202\n1843#2:204\n2343#2,5:206\n2420#2:216\n49#3,5:197\n49#3,5:211\n89#4:205\n*S KotlinDebug\n*F\n+ 1 SnapshotDoubleState.kt\nandroidx/compose/runtime/SnapshotMutableDoubleStateImpl\n*L\n148#1:196\n150#1:202,2\n150#1:204\n150#1:206,5\n181#1:216\n149#1:197,5\n174#1:211,5\n150#1:205\n*E\n"})
public class SnapshotMutableDoubleStateImpl extends StateObjectImpl implements MutableDoubleState, SnapshotMutableState<Double> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public a f14785q0;

    /* JADX INFO: compiled from: SnapshotDoubleState.kt */
    public static final class a extends StateRecord {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f14786c;

        public a(double d2) {
            this.f14786c = d2;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void assign(@NotNull StateRecord stateRecord) {
            Intrinsics.checkNotNull(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
            this.f14786c = ((a) stateRecord).f14786c;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public final StateRecord create() {
            return new a(this.f14786c);
        }
    }

    /* JADX INFO: compiled from: SnapshotDoubleState.kt */
    public static final class b extends Lambda implements Function1<Double, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Double d2) {
            SnapshotMutableDoubleStateImpl.this.setDoubleValue(d2.doubleValue());
            return Unit.INSTANCE;
        }
    }

    public SnapshotMutableDoubleStateImpl(double d2) {
        a aVar = new a(d2);
        if (Snapshot.INSTANCE.isInSnapshot()) {
            a aVar2 = new a(d2);
            aVar2.setSnapshotId$runtime_release(1);
            aVar.setNext$runtime_release(aVar2);
        }
        this.f14785q0 = aVar;
    }

    @Override // androidx.compose.runtime.MutableState
    @NotNull
    public Function1<Double, Unit> component2() {
        return new b();
    }

    @Override // androidx.compose.runtime.MutableDoubleState, androidx.compose.runtime.DoubleState
    public double getDoubleValue() {
        return ((a) SnapshotKt.readable(this.f14785q0, this)).f14786c;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.f14785q0;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    @NotNull
    public SnapshotMutationPolicy<Double> getPolicy() {
        return SnapshotStateKt.structuralEqualityPolicy();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableDoubleState, androidx.compose.runtime.DoubleState, androidx.compose.runtime.State
    public final /* synthetic */ Double getValue() {
        return p.a(this);
    }

    @Override // androidx.compose.runtime.snapshots.StateObjectImpl, androidx.compose.runtime.snapshots.StateObject
    @Nullable
    public StateRecord mergeRecords(@NotNull StateRecord previous, @NotNull StateRecord current, @NotNull StateRecord applied) {
        Intrinsics.checkNotNull(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        Intrinsics.checkNotNull(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        if (((a) current).f14786c == ((a) applied).f14786c) {
            return current;
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord value) {
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.f14785q0 = (a) value;
    }

    @Override // androidx.compose.runtime.MutableDoubleState
    public void setDoubleValue(double d2) {
        Snapshot current;
        a aVar = (a) SnapshotKt.current(this.f14785q0);
        if (aVar.f14786c == d2) {
            return;
        }
        a aVar2 = this.f14785q0;
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.INSTANCE.getCurrent();
            ((a) SnapshotKt.overwritableRecord(aVar2, this, current, aVar)).f14786c = d2;
            Unit unit = Unit.INSTANCE;
        }
        SnapshotKt.notifyWrite(current, this);
    }

    @Override // androidx.compose.runtime.MutableDoubleState
    public final /* synthetic */ void setValue(double d2) {
        p.c(this, d2);
    }

    @NotNull
    public String toString() {
        return "MutableDoubleState(value=" + ((a) SnapshotKt.current(this.f14785q0)).f14786c + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableState
    @NotNull
    public Double component1() {
        return Double.valueOf(getDoubleValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Double, java.lang.Object] */
    @Override // androidx.compose.runtime.MutableDoubleState, androidx.compose.runtime.DoubleState, androidx.compose.runtime.State
    public final /* bridge */ /* synthetic */ Double getValue() {
        return getValue();
    }

    @Override // androidx.compose.runtime.MutableDoubleState, androidx.compose.runtime.MutableState
    public final /* bridge */ /* synthetic */ void setValue(Double d2) {
        setValue(d2.doubleValue());
    }
}
