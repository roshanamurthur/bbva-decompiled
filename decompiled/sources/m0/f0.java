package m0;

import androidx.compose.runtime.SlotTable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final s0 f83250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f83251b;

    public f0(@NotNull s0 s0Var, int i10) {
        this.f83250a = s0Var;
        this.f83251b = i10;
    }

    @Override // m0.s0
    @NotNull
    public final Object a(@NotNull SlotTable slotTable) {
        return new u0(this.f83250a.a(slotTable), this.f83251b);
    }
}
