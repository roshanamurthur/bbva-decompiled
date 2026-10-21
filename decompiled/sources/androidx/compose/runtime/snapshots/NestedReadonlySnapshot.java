package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.collection.h;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0006\u0010!\u001a\u00020\u0001¢\u0006\u0004\b1\u00102J\u001e\u0010\u0006\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J\u000f\u0010\t\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0017\u0010\u0015R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010!\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010 R\u001c\u0010*\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010'8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\"\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001c¨\u00063"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "Lkotlin/Function1;", "", "", "readObserver", "takeNestedSnapshot", "notifyObjectsInitialized$runtime_release", "()V", "notifyObjectsInitialized", "", "hasPendingChanges", "dispose", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)Ljava/lang/Void;", "recordModified", "snapshot", "nestedDeactivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;", "nestedDeactivated", "nestedActivated$runtime_release", "nestedActivated", "e", "Lkotlin/jvm/functions/Function1;", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "f", "Landroidx/compose/runtime/snapshots/Snapshot;", "getParent", "()Landroidx/compose/runtime/snapshots/Snapshot;", "parent", "getReadOnly", "()Z", "readOnly", "getRoot", "root", "Landroidx/collection/MutableScatterSet;", "getModified$runtime_release", "()Landroidx/collection/MutableScatterSet;", "modified", "getWriteObserver$runtime_release", "writeObserver", "", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/Snapshot;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class NestedReadonlySnapshot extends Snapshot {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Function1<Object, Unit> readObserver;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Snapshot parent;

    public NestedReadonlySnapshot(int i10, @NotNull SnapshotIdSet snapshotIdSet, @Nullable Function1<Object, Unit> function1, @NotNull Snapshot snapshot) {
        super(i10, snapshotIdSet, null);
        this.readObserver = function1;
        this.parent = snapshot;
        snapshot.mo2166nestedActivated$runtime_release(this);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed()) {
            return;
        }
        int id = getId();
        Snapshot snapshot = this.parent;
        if (id != snapshot.getId()) {
            closeAndReleasePinning$runtime_release();
        }
        snapshot.mo2167nestedDeactivated$runtime_release(this);
        super.dispose();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public MutableScatterSet<StateObject> getModified$runtime_release() {
        return null;
    }

    @NotNull
    public final Snapshot getParent() {
        return this.parent;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    /* JADX INFO: renamed from: getReadObserver$runtime_release, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot getRoot() {
        return this.parent.getRoot();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public Function1<Object, Unit> getWriteObserver$runtime_release() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return false;
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
    public /* bridge */ /* synthetic */ Snapshot takeNestedSnapshot(Function1 function1) {
        return takeNestedSnapshot((Function1<Object, Unit>) function1);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    /* JADX INFO: renamed from: recordModified$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo2168recordModified$runtime_release(@NotNull StateObject state) {
        SnapshotKt.access$reportReadonlySnapshotWrite();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public NestedReadonlySnapshot takeNestedSnapshot(@Nullable Function1<Object, Unit> readObserver) {
        return new NestedReadonlySnapshot(getId(), getInvalid(), SnapshotKt.d(readObserver, getReadObserver()), this.parent);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
    }
}
