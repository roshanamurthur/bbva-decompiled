package g1;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LayoutModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Measurable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final IntrinsicMeasurable f68577p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final j f68578q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final k f68579r0;

    public h(@NotNull IntrinsicMeasurable measurable, @NotNull j minMax, @NotNull k widthHeight) {
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Intrinsics.checkNotNullParameter(minMax, "minMax");
        Intrinsics.checkNotNullParameter(widthHeight, "widthHeight");
        this.f68577p0 = measurable;
        this.f68578q0 = minMax;
        this.f68579r0 = widthHeight;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    @Nullable
    public final Object getParentData() {
        return this.f68577p0.getParentData();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicHeight(int i10) {
        return this.f68577p0.maxIntrinsicHeight(i10);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicWidth(int i10) {
        return this.f68577p0.maxIntrinsicWidth(i10);
    }

    @Override // androidx.compose.ui.layout.Measurable
    @NotNull
    /* JADX INFO: renamed from: measure-BRTryo0 */
    public final Placeable mo3575measureBRTryo0(long j10) {
        k kVar = this.f68579r0;
        k kVar2 = k.Width;
        j jVar = this.f68578q0;
        IntrinsicMeasurable intrinsicMeasurable = this.f68577p0;
        if (kVar == kVar2) {
            return new i(jVar == j.Max ? intrinsicMeasurable.maxIntrinsicWidth(Constraints.m4356getMaxHeightimpl(j10)) : intrinsicMeasurable.minIntrinsicWidth(Constraints.m4356getMaxHeightimpl(j10)), Constraints.m4356getMaxHeightimpl(j10));
        }
        return new i(Constraints.m4357getMaxWidthimpl(j10), jVar == j.Max ? intrinsicMeasurable.maxIntrinsicHeight(Constraints.m4357getMaxWidthimpl(j10)) : intrinsicMeasurable.minIntrinsicHeight(Constraints.m4357getMaxWidthimpl(j10)));
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicHeight(int i10) {
        return this.f68577p0.minIntrinsicHeight(i10);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicWidth(int i10) {
        return this.f68577p0.minIntrinsicWidth(i10);
    }
}
