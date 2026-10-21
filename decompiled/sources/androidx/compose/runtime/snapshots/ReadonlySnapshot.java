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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\b\u001a\u00020\u00012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0016J\u000f\u0010\u000b\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u0006H\u0016J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\"\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001bR4\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010$2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010$8P@VX\u0090\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00061"}, d2 = {"Landroidx/compose/runtime/snapshots/ReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "hasPendingChanges", "Lkotlin/Function1;", "", "", "readObserver", "takeNestedSnapshot", "notifyObjectsInitialized$runtime_release", "()V", "notifyObjectsInitialized", "dispose", "snapshot", "nestedActivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "e", "Lkotlin/jvm/functions/Function1;", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "getReadOnly", "()Z", "readOnly", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "root", "getWriteObserver$runtime_release", "writeObserver", "Landroidx/collection/MutableScatterSet;", "value", "getModified$runtime_release", "()Landroidx/collection/MutableScatterSet;", "setModified", "(Landroidx/collection/MutableScatterSet;)V", "modified", "", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class ReadonlySnapshot extends Snapshot {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Function1<Object, Unit> readObserver;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15265f;

    public ReadonlySnapshot(int i10, @NotNull SnapshotIdSet snapshotIdSet, @Nullable Function1<Object, Unit> function1) {
        super(i10, snapshotIdSet, null);
        this.readObserver = function1;
        this.f15265f = 1;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed()) {
            return;
        }
        mo2167nestedDeactivated$runtime_release(this);
        super.dispose();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public MutableScatterSet<StateObject> getModified$runtime_release() {
        return null;
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
    @Nullable
    public Function1<Object, Unit> getWriteObserver$runtime_release() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedActivated$runtime_release */
    public void mo2166nestedActivated$runtime_release(@NotNull Snapshot snapshot) {
        this.f15265f++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedDeactivated$runtime_release */
    public void mo2167nestedDeactivated$runtime_release(@NotNull Snapshot snapshot) {
        int i10 = this.f15265f - 1;
        this.f15265f = i10;
        if (i10 == 0) {
            closeAndReleasePinning$runtime_release();
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: recordModified$runtime_release */
    public void mo2168recordModified$runtime_release(@NotNull StateObject state) {
        SnapshotKt.access$reportReadonlySnapshotWrite();
        throw new KotlinNothingValueException();
    }

    public void setModified(@Nullable MutableScatterSet<StateObject> mutableScatterSet) {
        throw h.f();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot takeNestedSnapshot(@Nullable Function1<Object, Unit> readObserver) {
        SnapshotKt.access$validateOpen(this);
        return new NestedReadonlySnapshot(getId(), getInvalid(), SnapshotKt.d(readObserver, getReadObserver()), this);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot getRoot() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
    }
}
