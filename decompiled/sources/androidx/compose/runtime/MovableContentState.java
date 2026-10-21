package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@InternalComposeApi
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/MovableContentState;", "", "Landroidx/compose/runtime/SlotTable;", "a", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "slotTable", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class MovableContentState {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SlotTable slotTable;

    public MovableContentState(@NotNull SlotTable slotTable) {
        this.slotTable = slotTable;
    }

    @NotNull
    /* JADX INFO: renamed from: getSlotTable$runtime_release, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }
}
