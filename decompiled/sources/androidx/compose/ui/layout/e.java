package androidx.compose.ui.layout;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e implements SubcomposeSlotReusePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f16711a = new e();

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final boolean areCompatible(@Nullable Object obj, @Nullable Object obj2) {
        return false;
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final void getSlotsToRetain(@NotNull SubcomposeSlotReusePolicy.SlotIdsSet slotIds) {
        Intrinsics.checkNotNullParameter(slotIds, "slotIds");
        slotIds.clear();
    }
}
