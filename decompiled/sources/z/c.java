package z;

import androidx.compose.foundation.lazy.grid.LazyGridSlots;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Function2<Density, Constraints, LazyGridSlots> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Function2<Density, Constraints, LazyGridSlots> f94887p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public long f94888q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f94889r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public LazyGridSlots f94890s0;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull Function2<? super Density, ? super Constraints, LazyGridSlots> calculation) {
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        this.f94887p0 = calculation;
        this.f94888q0 = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    }

    @Override // kotlin.jvm.functions.Function2
    public final LazyGridSlots invoke(Density density, Constraints constraints) {
        Density density2 = density;
        long f18296a = constraints.getF18296a();
        Intrinsics.checkNotNullParameter(density2, "density");
        if (this.f94890s0 != null && Constraints.m4351equalsimpl0(this.f94888q0, f18296a) && this.f94889r0 == density2.getDensity()) {
            LazyGridSlots lazyGridSlots = this.f94890s0;
            Intrinsics.checkNotNull(lazyGridSlots);
            return lazyGridSlots;
        }
        this.f94888q0 = f18296a;
        this.f94889r0 = density2.getDensity();
        LazyGridSlots lazyGridSlotsInvoke = this.f94887p0.invoke(density2, Constraints.m4346boximpl(f18296a));
        this.f94890s0 = lazyGridSlotsInvoke;
        return lazyGridSlotsInvoke;
    }
}
