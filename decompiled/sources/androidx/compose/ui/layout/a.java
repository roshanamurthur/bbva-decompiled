package androidx.compose.ui.layout;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements SubcomposeSlotReusePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16706a;

    public a(int i10) {
        this.f16706a = i10;
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final boolean areCompatible(@Nullable Object obj, @Nullable Object obj2) {
        return true;
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final void getSlotsToRetain(@NotNull SubcomposeSlotReusePolicy.SlotIdsSet slotIds) {
        Intrinsics.checkNotNullParameter(slotIds, "slotIds");
        int size = slotIds.size();
        int i10 = this.f16706a;
        if (size > i10) {
            Iterator<Object> it = slotIds.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                it.next();
                i11++;
                if (i11 > i10) {
                    it.remove();
                }
            }
        }
    }
}
