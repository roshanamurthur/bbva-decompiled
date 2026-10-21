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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B7\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\u0006\u0010E\u001a\u00020\u0004\u0012\u0006\u0010F\u001a\u00020\u0004¢\u0006\u0004\bG\u0010HJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bH\u0016J\u000f\u0010\u0011\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0017\u0010\u0015RF\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010*\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R(\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010\u001dR$\u00103\u001a\u00020-2\u0006\u0010.\u001a\u00020-8V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00109\u001a\u0002042\u0006\u0010.\u001a\u0002048P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R4\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010:2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010:8P@VX\u0090\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006I"}, d2 = {"Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "dispose", "", "hasPendingChanges", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "Lkotlin/Function1;", "", "readObserver", "takeNestedSnapshot", "notifyObjectsInitialized$runtime_release", "()V", "notifyObjectsInitialized", "snapshot", "", "nestedActivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "<set-?>", "h", "Lkotlin/jvm/functions/Function1;", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "setReadObserver", "(Lkotlin/jvm/functions/Function1;)V", "", "i", "J", "getThreadId$runtime_release", "()J", "threadId", "j", "Landroidx/compose/runtime/snapshots/Snapshot;", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "root", "writeObserver", "getWriteObserver$runtime_release", "", "value", "getId", "()I", "setId$runtime_release", "(I)V", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getInvalid$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "invalid", "Landroidx/collection/MutableScatterSet;", "getModified$runtime_release", "()Landroidx/collection/MutableScatterSet;", "setModified", "(Landroidx/collection/MutableScatterSet;)V", "modified", "getReadOnly", "()Z", "readOnly", "previousSnapshot", "specifiedReadObserver", "mergeParentObservers", "ownsPreviousSnapshot", "<init>", "(Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;ZZ)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class TransparentObserverSnapshot extends Snapshot {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Snapshot f15363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f15364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f15365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<Object, Unit> readObserver;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final long threadId;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final TransparentObserverSnapshot f15368j;

    public TransparentObserverSnapshot(@Nullable Snapshot snapshot, @Nullable Function1<Object, Unit> function1, boolean z10, boolean z11) {
        Function1<Object, Unit> readObserver;
        super(0, SnapshotIdSet.INSTANCE.getEMPTY(), null);
        this.f15363e = snapshot;
        this.f15364f = z10;
        this.f15365g = z11;
        this.readObserver = SnapshotKt.access$mergedReadObserver(function1, (snapshot == null || (readObserver = snapshot.getReadObserver()) == null) ? ((GlobalSnapshot) SnapshotKt.f15298j.get()).getReadObserver() : readObserver, z10);
        this.threadId = ActualJvm_jvmKt.currentThreadId();
        this.f15368j = this;
    }

    public final Snapshot a() {
        Snapshot snapshot = this.f15363e;
        return snapshot == null ? (Snapshot) SnapshotKt.f15298j.get() : snapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        Snapshot snapshot;
        setDisposed$runtime_release(true);
        if (!this.f15365g || (snapshot = this.f15363e) == null) {
            return;
        }
        snapshot.dispose();
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

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public MutableScatterSet<StateObject> getModified$runtime_release() {
        return a().getModified$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    /* JADX INFO: renamed from: getReadObserver$runtime_release, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return a().getReadOnly();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot getRoot() {
        return this.f15368j;
    }

    /* JADX INFO: renamed from: getThreadId$runtime_release, reason: from getter */
    public final long getThreadId() {
        return this.threadId;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public Function1<Object, Unit> getWriteObserver$runtime_release() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return a().hasPendingChanges();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    /* JADX INFO: renamed from: nestedActivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo2166nestedActivated$runtime_release(@NotNull Snapshot snapshot) {
        throw h.f();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    /* JADX INFO: renamed from: nestedDeactivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo2167nestedDeactivated$runtime_release(@NotNull Snapshot snapshot) {
        throw h.f();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        a().notifyObjectsInitialized$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
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

    public void setModified(@Nullable MutableScatterSet<StateObject> mutableScatterSet) {
        throw h.f();
    }

    public void setReadObserver(@Nullable Function1<Object, Unit> function1) {
        this.readObserver = function1;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot takeNestedSnapshot(@Nullable Function1<Object, Unit> readObserver) {
        Function1<Object, Unit> function1D = SnapshotKt.d(readObserver, getReadObserver());
        return !this.f15364f ? SnapshotKt.c(a().takeNestedSnapshot(null), function1D, true) : a().takeNestedSnapshot(function1D);
    }
}
