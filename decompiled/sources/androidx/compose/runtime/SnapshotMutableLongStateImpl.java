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
import m0.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnapshotLongState.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001 B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007H\u0096\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\"\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0014\u0010\u0015\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableLongStateImpl;", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/MutableLongState;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", "component1", "()Ljava/lang/Long;", "Lkotlin/Function1;", "", "component2", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "prependStateRecord", "previous", "current", "applied", "mergeRecords", "", "toString", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getLongValue", "()J", "setLongValue", "(J)V", "longValue", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", Constants.policy, "<init>", "a", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshotLongState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotMutableLongStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,191:1\n2420#2:192\n2341#2,2:193\n1843#2:195\n2343#2,5:197\n2420#2:202\n89#3:196\n*S KotlinDebug\n*F\n+ 1 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotMutableLongStateImpl\n*L\n144#1:192\n146#1:193,2\n146#1:195\n146#1:197,5\n177#1:202\n146#1:196\n*E\n"})
public class SnapshotMutableLongStateImpl extends StateObjectImpl implements MutableLongState, SnapshotMutableState<Long> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public a f14794q0;

    /* JADX INFO: compiled from: SnapshotLongState.kt */
    public static final class a extends StateRecord {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f14795c;

        public a(long j10) {
            this.f14795c = j10;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void assign(@NotNull StateRecord stateRecord) {
            Intrinsics.checkNotNull(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.f14795c = ((a) stateRecord).f14795c;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public final StateRecord create() {
            return new a(this.f14795c);
        }
    }

    /* JADX INFO: compiled from: SnapshotLongState.kt */
    public static final class b extends Lambda implements Function1<Long, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l6) {
            SnapshotMutableLongStateImpl.this.setLongValue(l6.longValue());
            return Unit.INSTANCE;
        }
    }

    public SnapshotMutableLongStateImpl(long j10) {
        a aVar = new a(j10);
        if (Snapshot.INSTANCE.isInSnapshot()) {
            a aVar2 = new a(j10);
            aVar2.setSnapshotId$runtime_release(1);
            aVar.setNext$runtime_release(aVar2);
        }
        this.f14794q0 = aVar;
    }

    @Override // androidx.compose.runtime.MutableState
    @NotNull
    public Function1<Long, Unit> component2() {
        return new b();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.f14794q0;
    }

    @Override // androidx.compose.runtime.MutableLongState, androidx.compose.runtime.LongState
    public long getLongValue() {
        return ((a) SnapshotKt.readable(this.f14794q0, this)).f14795c;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    @NotNull
    public SnapshotMutationPolicy<Long> getPolicy() {
        return SnapshotStateKt.structuralEqualityPolicy();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableLongState, androidx.compose.runtime.LongState, androidx.compose.runtime.State
    public final /* synthetic */ Long getValue() {
        return s.a(this);
    }

    @Override // androidx.compose.runtime.snapshots.StateObjectImpl, androidx.compose.runtime.snapshots.StateObject
    @Nullable
    public StateRecord mergeRecords(@NotNull StateRecord previous, @NotNull StateRecord current, @NotNull StateRecord applied) {
        Intrinsics.checkNotNull(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        Intrinsics.checkNotNull(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        if (((a) current).f14795c == ((a) applied).f14795c) {
            return current;
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord value) {
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f14794q0 = (a) value;
    }

    @Override // androidx.compose.runtime.MutableLongState
    public void setLongValue(long j10) {
        Snapshot current;
        a aVar = (a) SnapshotKt.current(this.f14794q0);
        if (aVar.f14795c != j10) {
            a aVar2 = this.f14794q0;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                ((a) SnapshotKt.overwritableRecord(aVar2, this, current, aVar)).f14795c = j10;
                Unit unit = Unit.INSTANCE;
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // androidx.compose.runtime.MutableLongState
    public final /* synthetic */ void setValue(long j10) {
        s.c(this, j10);
    }

    @NotNull
    public String toString() {
        return "MutableLongState(value=" + ((a) SnapshotKt.current(this.f14794q0)).f14795c + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableState
    @NotNull
    public Long component1() {
        return Long.valueOf(getLongValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Long, java.lang.Object] */
    @Override // androidx.compose.runtime.MutableLongState, androidx.compose.runtime.LongState, androidx.compose.runtime.State
    public final /* bridge */ /* synthetic */ Long getValue() {
        return getValue();
    }

    @Override // androidx.compose.runtime.MutableLongState, androidx.compose.runtime.MutableState
    public final /* bridge */ /* synthetic */ void setValue(Long l6) {
        setValue(l6.longValue());
    }
}
