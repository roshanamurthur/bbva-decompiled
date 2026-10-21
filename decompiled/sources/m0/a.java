package m0;

import androidx.compose.runtime.SlotTable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83229a;

    public a(int i10) {
        this.f83229a = i10;
    }

    @Override // m0.s0
    @NotNull
    public final Object a(@NotNull SlotTable slotTable) {
        return slotTable.anchor(this.f83229a);
    }
}
