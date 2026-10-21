package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H&J\b\u0010\u0005\u001a\u00020\u0000H&R\"\u0010\r\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/snapshots/StateRecord;", "", "value", "", "assign", "create", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSnapshotId$runtime_release", "()I", "setSnapshotId$runtime_release", "(I)V", "snapshotId", "b", "Landroidx/compose/runtime/snapshots/StateRecord;", "getNext$runtime_release", "()Landroidx/compose/runtime/snapshots/StateRecord;", "setNext$runtime_release", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "next", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public abstract class StateRecord {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int snapshotId = SnapshotKt.currentSnapshot().getId();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public StateRecord next;

    public abstract void assign(@NotNull StateRecord value);

    @NotNull
    public abstract StateRecord create();

    @Nullable
    /* JADX INFO: renamed from: getNext$runtime_release, reason: from getter */
    public final StateRecord getNext() {
        return this.next;
    }

    /* JADX INFO: renamed from: getSnapshotId$runtime_release, reason: from getter */
    public final int getSnapshotId() {
        return this.snapshotId;
    }

    public final void setNext$runtime_release(@Nullable StateRecord stateRecord) {
        this.next = stateRecord;
    }

    public final void setSnapshotId$runtime_release(int i10) {
        this.snapshotId = i10;
    }
}
