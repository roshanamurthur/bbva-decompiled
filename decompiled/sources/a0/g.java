package a0;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Function2<Density, Constraints, LazyStaggeredGridSlots> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Function2<Density, Constraints, LazyStaggeredGridSlots> f160p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public long f161q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f162r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public LazyStaggeredGridSlots f163s0;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull Function2<? super Density, ? super Constraints, LazyStaggeredGridSlots> calculation) {
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        this.f160p0 = calculation;
        this.f161q0 = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    }

    @Override // kotlin.jvm.functions.Function2
    public final LazyStaggeredGridSlots invoke(Density density, Constraints constraints) {
        Density density2 = density;
        long f18296a = constraints.getF18296a();
        Intrinsics.checkNotNullParameter(density2, "density");
        if (this.f163s0 != null && Constraints.m4351equalsimpl0(this.f161q0, f18296a) && this.f162r0 == density2.getDensity()) {
            LazyStaggeredGridSlots lazyStaggeredGridSlots = this.f163s0;
            Intrinsics.checkNotNull(lazyStaggeredGridSlots);
            return lazyStaggeredGridSlots;
        }
        this.f161q0 = f18296a;
        this.f162r0 = density2.getDensity();
        LazyStaggeredGridSlots lazyStaggeredGridSlotsInvoke = this.f160p0.invoke(density2, Constraints.m4346boximpl(f18296a));
        this.f163s0 = lazyStaggeredGridSlotsInvoke;
        return lazyStaggeredGridSlotsInvoke;
    }
}
