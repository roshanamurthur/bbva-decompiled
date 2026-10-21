package x;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends Modifier.Node implements LayoutModifierNode {
    public float H0;
    public float I0;
    public float J0;
    public float K0;
    public boolean L0;

    /* JADX INFO: compiled from: Size.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f94381p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Placeable placeable) {
            super(1);
            this.f94381p0 = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.placeRelative$default(layout, this.f94381p0, 0, 0, 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    public final long a(Density density) {
        int iCoerceAtLeast;
        int iCoerceAtLeast2;
        float f6 = this.J0;
        Dp.Companion companion = Dp.INSTANCE;
        int i10 = 0;
        int iCoerceAtLeast3 = !Dp.m4394equalsimpl0(f6, companion.m4409getUnspecifiedD9Ej5fM()) ? kotlin.ranges.c.coerceAtLeast(density.mo413roundToPx0680j_4(this.J0), 0) : Integer.MAX_VALUE;
        int iCoerceAtLeast4 = !Dp.m4394equalsimpl0(this.K0, companion.m4409getUnspecifiedD9Ej5fM()) ? kotlin.ranges.c.coerceAtLeast(density.mo413roundToPx0680j_4(this.K0), 0) : Integer.MAX_VALUE;
        if (Dp.m4394equalsimpl0(this.H0, companion.m4409getUnspecifiedD9Ej5fM()) || (iCoerceAtLeast = kotlin.ranges.c.coerceAtLeast(kotlin.ranges.c.coerceAtMost(density.mo413roundToPx0680j_4(this.H0), iCoerceAtLeast3), 0)) == Integer.MAX_VALUE) {
            iCoerceAtLeast = 0;
        }
        if (!Dp.m4394equalsimpl0(this.I0, companion.m4409getUnspecifiedD9Ej5fM()) && (iCoerceAtLeast2 = kotlin.ranges.c.coerceAtLeast(kotlin.ranges.c.coerceAtMost(density.mo413roundToPx0680j_4(this.I0), iCoerceAtLeast4), 0)) != Integer.MAX_VALUE) {
            i10 = iCoerceAtLeast2;
        }
        return ConstraintsKt.Constraints(iCoerceAtLeast, iCoerceAtLeast3, i10, iCoerceAtLeast4);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jA = a(intrinsicMeasureScope);
        return Constraints.m4354getHasFixedHeightimpl(jA) ? Constraints.m4356getMaxHeightimpl(jA) : ConstraintsKt.m4370constrainHeightK40F9xA(jA, measurable.maxIntrinsicHeight(i10));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jA = a(intrinsicMeasureScope);
        return Constraints.m4355getHasFixedWidthimpl(jA) ? Constraints.m4357getMaxWidthimpl(jA) : ConstraintsKt.m4371constrainWidthK40F9xA(jA, measurable.maxIntrinsicWidth(i10));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo172measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        long jConstraints;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jA = a(measure);
        if (this.L0) {
            jConstraints = ConstraintsKt.m4369constrainN9IONVI(j10, jA);
        } else {
            float f6 = this.H0;
            Dp.Companion companion = Dp.INSTANCE;
            jConstraints = ConstraintsKt.Constraints(!Dp.m4394equalsimpl0(f6, companion.m4409getUnspecifiedD9Ej5fM()) ? Constraints.m4359getMinWidthimpl(jA) : kotlin.ranges.c.coerceAtMost(Constraints.m4359getMinWidthimpl(j10), Constraints.m4357getMaxWidthimpl(jA)), !Dp.m4394equalsimpl0(this.J0, companion.m4409getUnspecifiedD9Ej5fM()) ? Constraints.m4357getMaxWidthimpl(jA) : kotlin.ranges.c.coerceAtLeast(Constraints.m4357getMaxWidthimpl(j10), Constraints.m4359getMinWidthimpl(jA)), !Dp.m4394equalsimpl0(this.I0, companion.m4409getUnspecifiedD9Ej5fM()) ? Constraints.m4358getMinHeightimpl(jA) : kotlin.ranges.c.coerceAtMost(Constraints.m4358getMinHeightimpl(j10), Constraints.m4356getMaxHeightimpl(jA)), !Dp.m4394equalsimpl0(this.K0, companion.m4409getUnspecifiedD9Ej5fM()) ? Constraints.m4356getMaxHeightimpl(jA) : kotlin.ranges.c.coerceAtLeast(Constraints.m4356getMaxHeightimpl(j10), Constraints.m4358getMinHeightimpl(jA)));
        }
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(jConstraints);
        return MeasureScope.CC.q(measure, placeableMo3575measureBRTryo0.getWidth(), placeableMo3575measureBRTryo0.getHeight(), null, new a(placeableMo3575measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jA = a(intrinsicMeasureScope);
        return Constraints.m4354getHasFixedHeightimpl(jA) ? Constraints.m4356getMaxHeightimpl(jA) : ConstraintsKt.m4370constrainHeightK40F9xA(jA, measurable.minIntrinsicHeight(i10));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jA = a(intrinsicMeasureScope);
        return Constraints.m4355getHasFixedWidthimpl(jA) ? Constraints.m4357getMaxWidthimpl(jA) : ConstraintsKt.m4371constrainWidthK40F9xA(jA, measurable.minIntrinsicWidth(i10));
    }
}
