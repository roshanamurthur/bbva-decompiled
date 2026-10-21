package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.component.dm.naturalauth.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnapshotState.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 2)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001%B\u001d\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\"\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0010H\u0096\u0002R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R*\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\"\u001a\u00028\u00008G¢\u0006\f\u0012\u0004\b!\u0010\u001c\u001a\u0004\b \u0010\u000f¨\u0006&"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableStateImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "prependStateRecord", "previous", "current", "applied", "mergeRecords", "", "toString", "component1", "()Ljava/lang/Object;", "Lkotlin/Function1;", "component2", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "q0", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", Constants.policy, "getValue", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "()V", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getDebuggerDisplayValue", "getDebuggerDisplayValue$annotations", "debuggerDisplayValue", "<init>", "(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)V", "a", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,313:1\n2420#2:314\n2341#2,2:315\n1843#2:317\n2343#2,5:319\n2420#2:324\n2420#2:325\n89#3:318\n*S KotlinDebug\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n*L\n136#1:314\n138#1:315,2\n138#1:317\n138#1:319,5\n185#1:324\n221#1:325\n138#1:318\n*E\n"})
public class SnapshotMutableStateImpl<T> extends StateObjectImpl implements SnapshotMutableState<T> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SnapshotMutationPolicy<T> policy;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public a<T> f14798r0;

    /* JADX INFO: compiled from: SnapshotState.kt */
    public static final class a<T> extends StateRecord {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T f14799c;

        public a(T t10) {
            this.f14799c = t10;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void assign(@NotNull StateRecord stateRecord) {
            Intrinsics.checkNotNull(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.f14799c = ((a) stateRecord).f14799c;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public final StateRecord create() {
            return new a(this.f14799c);
        }
    }

    /* JADX INFO: compiled from: SnapshotState.kt */
    public static final class b extends Lambda implements Function1<T, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SnapshotMutableStateImpl<T> f14800p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SnapshotMutableStateImpl<T> snapshotMutableStateImpl) {
            super(1);
            this.f14800p0 = snapshotMutableStateImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            this.f14800p0.setValue(obj);
            return Unit.INSTANCE;
        }
    }

    public SnapshotMutableStateImpl(T t10, @NotNull SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        this.policy = snapshotMutationPolicy;
        a<T> aVar = new a<>(t10);
        if (Snapshot.INSTANCE.isInSnapshot()) {
            a aVar2 = new a(t10);
            aVar2.setSnapshotId$runtime_release(1);
            aVar.setNext$runtime_release(aVar2);
        }
        this.f14798r0 = aVar;
    }

    @Override // androidx.compose.runtime.MutableState
    public T component1() {
        return getValue();
    }

    @Override // androidx.compose.runtime.MutableState
    @NotNull
    public Function1<T, Unit> component2() {
        return new b(this);
    }

    @JvmName(name = "getDebuggerDisplayValue")
    public final T getDebuggerDisplayValue() {
        return ((a) SnapshotKt.current(this.f14798r0)).f14799c;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.f14798r0;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    @NotNull
    public SnapshotMutationPolicy<T> getPolicy() {
        return this.policy;
    }

    @Override // androidx.compose.runtime.MutableState, androidx.compose.runtime.State
    public T getValue() {
        return ((a) SnapshotKt.readable(this.f14798r0, this)).f14799c;
    }

    @Override // androidx.compose.runtime.snapshots.StateObjectImpl, androidx.compose.runtime.snapshots.StateObject
    @Nullable
    public StateRecord mergeRecords(@NotNull StateRecord previous, @NotNull StateRecord current, @NotNull StateRecord applied) {
        Intrinsics.checkNotNull(previous, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar = (a) previous;
        Intrinsics.checkNotNull(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar2 = (a) current;
        Intrinsics.checkNotNull(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar3 = (a) applied;
        if (getPolicy().equivalent(aVar2.f14799c, aVar3.f14799c)) {
            return current;
        }
        T tMerge = getPolicy().merge(aVar.f14799c, aVar2.f14799c, aVar3.f14799c);
        if (tMerge == null) {
            return null;
        }
        StateRecord stateRecordCreate = aVar3.create();
        Intrinsics.checkNotNull(stateRecordCreate, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$4>");
        ((a) stateRecordCreate).f14799c = tMerge;
        return stateRecordCreate;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord value) {
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f14798r0 = (a) value;
    }

    @Override // androidx.compose.runtime.MutableState
    public void setValue(T t10) {
        Snapshot current;
        a aVar = (a) SnapshotKt.current(this.f14798r0);
        if (getPolicy().equivalent(aVar.f14799c, t10)) {
            return;
        }
        a<T> aVar2 = this.f14798r0;
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.INSTANCE.getCurrent();
            ((a) SnapshotKt.overwritableRecord(aVar2, this, current, aVar)).f14799c = t10;
            Unit unit = Unit.INSTANCE;
        }
        SnapshotKt.notifyWrite(current, this);
    }

    @NotNull
    public String toString() {
        return "MutableState(value=" + ((a) SnapshotKt.current(this.f14798r0)).f14799c + ")@" + hashCode();
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }
}
