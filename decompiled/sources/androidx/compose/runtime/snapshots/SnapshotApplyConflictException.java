package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotApplyConflictException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Landroidx/compose/runtime/snapshots/Snapshot;", "p0", "Landroidx/compose/runtime/snapshots/Snapshot;", "getSnapshot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "<init>", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class SnapshotApplyConflictException extends Exception {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Snapshot snapshot;

    public SnapshotApplyConflictException(@NotNull Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    @NotNull
    public final Snapshot getSnapshot() {
        return this.snapshot;
    }
}
