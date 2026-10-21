package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.collection.h;
import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001BM\u0012\b\u0010G\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\u0014\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\u0006\u0010J\u001a\u00020\u0004\u0012\u0006\u0010K\u001a\u00020\u0004¢\u0006\u0004\bL\u0010MJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0011\u001a\u00020\u00102\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0016J4\u0010\u0013\u001a\u00020\u00012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0016J\u000f\u0010\u0016\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u001c\u0010\u001aRF\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$RF\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u001a\u0010-\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R$\u00104\u001a\u00020.2\u0006\u0010/\u001a\u00020.8V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u0010:\u001a\u0002052\u0006\u0010/\u001a\u0002058P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R4\u0010@\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010;2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010;8P@VX\u0090\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010C\u001a\u00020.2\u0006\u0010/\u001a\u00020.8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bA\u00101\"\u0004\bB\u00103R\u0014\u0010F\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006N"}, d2 = {"Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "", "dispose", "", "hasPendingChanges", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "apply", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "Lkotlin/Function1;", "", "readObserver", "Landroidx/compose/runtime/snapshots/Snapshot;", "takeNestedSnapshot", "writeObserver", "takeNestedMutableSnapshot", "notifyObjectsInitialized$runtime_release", "()V", "notifyObjectsInitialized", "snapshot", "", "nestedActivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "<set-?>", "r", "Lkotlin/jvm/functions/Function1;", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "setReadObserver", "(Lkotlin/jvm/functions/Function1;)V", "s", "getWriteObserver$runtime_release", "setWriteObserver", "", "t", "J", "getThreadId$runtime_release", "()J", "threadId", "", "value", "getId", "()I", "setId$runtime_release", "(I)V", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getInvalid$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "invalid", "Landroidx/collection/MutableScatterSet;", "getModified$runtime_release", "()Landroidx/collection/MutableScatterSet;", "setModified", "(Landroidx/collection/MutableScatterSet;)V", "modified", "getWriteCount$runtime_release", "setWriteCount$runtime_release", "writeCount", "getReadOnly", "()Z", "readOnly", "parentSnapshot", "specifiedReadObserver", "specifiedWriteObserver", "mergeParentObservers", "ownsParentSnapshot", "<init>", "(Landroidx/compose/runtime/snapshots/MutableSnapshot;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class TransparentObserverMutableSnapshot extends MutableSnapshot {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final MutableSnapshot f15357o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f15358p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f15359q;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<Object, Unit> readObserver;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<Object, Unit> writeObserver;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final long threadId;

    public TransparentObserverMutableSnapshot(@Nullable MutableSnapshot mutableSnapshot, @Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function2, boolean z10, boolean z11) {
        Function1<Object, Unit> writeObserver$runtime_release;
        Function1<Object, Unit> readObserver;
        super(0, SnapshotIdSet.INSTANCE.getEMPTY(), SnapshotKt.access$mergedReadObserver(function1, (mutableSnapshot == null || (readObserver = mutableSnapshot.getReadObserver()) == null) ? ((GlobalSnapshot) SnapshotKt.f15298j.get()).getReadObserver() : readObserver, z10), SnapshotKt.access$mergedWriteObserver(function2, (mutableSnapshot == null || (writeObserver$runtime_release = mutableSnapshot.getWriteObserver$runtime_release()) == null) ? ((GlobalSnapshot) SnapshotKt.f15298j.get()).getWriteObserver$runtime_release() : writeObserver$runtime_release));
        this.f15357o = mutableSnapshot;
        this.f15358p = z10;
        this.f15359q = z11;
        this.readObserver = super.getReadObserver();
        this.writeObserver = super.getWriteObserver$runtime_release();
        this.threadId = ActualJvm_jvmKt.currentThreadId();
    }

    public final MutableSnapshot a() {
        MutableSnapshot mutableSnapshot = this.f15357o;
        return mutableSnapshot == null ? (MutableSnapshot) SnapshotKt.f15298j.get() : mutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    @NotNull
    public SnapshotApplyResult apply() {
        return a().apply();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        MutableSnapshot mutableSnapshot;
        setDisposed$runtime_release(true);
        if (!this.f15359q || (mutableSnapshot = this.f15357o) == null) {
            return;
        }
        mutableSnapshot.dispose();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public int getId() {
        return a().getId();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    /* JADX INFO: renamed from: getInvalid$runtime_release */
    public SnapshotIdSet getInvalid() {
        return a().getInvalid();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public MutableScatterSet<StateObject> getModified$runtime_release() {
        return a().getModified$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    /* JADX INFO: renamed from: getReadObserver$runtime_release, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return a().getReadOnly();
    }

    /* JADX INFO: renamed from: getThreadId$runtime_release, reason: from getter */
    public final long getThreadId() {
        return this.threadId;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: getWriteCount$runtime_release */
    public int getWriteCount() {
        return a().getWriteCount();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public Function1<Object, Unit> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return a().hasPendingChanges();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    /* JADX INFO: renamed from: nestedActivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo2166nestedActivated$runtime_release(@NotNull Snapshot snapshot) {
        throw h.f();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    /* JADX INFO: renamed from: nestedDeactivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo2167nestedDeactivated$runtime_release(@NotNull Snapshot snapshot) {
        throw h.f();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        a().notifyObjectsInitialized$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: recordModified$runtime_release */
    public void mo2168recordModified$runtime_release(@NotNull StateObject state) {
        a().mo2168recordModified$runtime_release(state);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setId$runtime_release(int i10) {
        throw h.f();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setInvalid$runtime_release(@NotNull SnapshotIdSet snapshotIdSet) {
        throw h.f();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public void setModified(@Nullable MutableScatterSet<StateObject> mutableScatterSet) {
        throw h.f();
    }

    public void setReadObserver(@Nullable Function1<Object, Unit> function1) {
        this.readObserver = function1;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime_release(int i10) {
        a().setWriteCount$runtime_release(i10);
    }

    public void setWriteObserver(@Nullable Function1<Object, Unit> function1) {
        this.writeObserver = function1;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    @NotNull
    public MutableSnapshot takeNestedMutableSnapshot(@Nullable Function1<Object, Unit> readObserver, @Nullable Function1<Object, Unit> writeObserver) {
        Function1<Object, Unit> function1D = SnapshotKt.d(readObserver, getReadObserver());
        Function1<Object, Unit> function1Access$mergedWriteObserver = SnapshotKt.access$mergedWriteObserver(writeObserver, getWriteObserver$runtime_release());
        return !this.f15358p ? new TransparentObserverMutableSnapshot(a().takeNestedMutableSnapshot(null, function1Access$mergedWriteObserver), function1D, function1Access$mergedWriteObserver, false, true) : a().takeNestedMutableSnapshot(function1D, function1Access$mergedWriteObserver);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot takeNestedSnapshot(@Nullable Function1<Object, Unit> readObserver) {
        Function1<Object, Unit> function1D = SnapshotKt.d(readObserver, getReadObserver());
        return !this.f15358p ? SnapshotKt.c(a().takeNestedSnapshot(null), function1D, true) : a().takeNestedSnapshot(function1D);
    }
}
