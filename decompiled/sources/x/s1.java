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
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s1 extends Modifier.Node implements LayoutModifierNode {
    public float H0;
    public float I0;

    /* JADX INFO: compiled from: Size.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f94402p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Placeable placeable) {
            super(1);
            this.f94402p0 = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.placeRelative$default(layout, this.f94402p0, 0, 0, 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return kotlin.ranges.c.coerceAtLeast(measurable.maxIntrinsicHeight(i10), !Dp.m4394equalsimpl0(this.I0, Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo413roundToPx0680j_4(this.I0) : 0);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return kotlin.ranges.c.coerceAtLeast(measurable.maxIntrinsicWidth(i10), !Dp.m4394equalsimpl0(this.H0, Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo413roundToPx0680j_4(this.H0) : 0);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo172measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        float f6 = this.H0;
        Dp.Companion companion = Dp.INSTANCE;
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(ConstraintsKt.Constraints((Dp.m4394equalsimpl0(f6, companion.m4409getUnspecifiedD9Ej5fM()) || Constraints.m4359getMinWidthimpl(j10) != 0) ? Constraints.m4359getMinWidthimpl(j10) : kotlin.ranges.c.coerceAtLeast(kotlin.ranges.c.coerceAtMost(measure.mo413roundToPx0680j_4(this.H0), Constraints.m4357getMaxWidthimpl(j10)), 0), Constraints.m4357getMaxWidthimpl(j10), (Dp.m4394equalsimpl0(this.I0, companion.m4409getUnspecifiedD9Ej5fM()) || Constraints.m4358getMinHeightimpl(j10) != 0) ? Constraints.m4358getMinHeightimpl(j10) : kotlin.ranges.c.coerceAtLeast(kotlin.ranges.c.coerceAtMost(measure.mo413roundToPx0680j_4(this.I0), Constraints.m4356getMaxHeightimpl(j10)), 0), Constraints.m4356getMaxHeightimpl(j10)));
        return MeasureScope.CC.q(measure, placeableMo3575measureBRTryo0.getWidth(), placeableMo3575measureBRTryo0.getHeight(), null, new a(placeableMo3575measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return kotlin.ranges.c.coerceAtLeast(measurable.minIntrinsicHeight(i10), !Dp.m4394equalsimpl0(this.I0, Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo413roundToPx0680j_4(this.I0) : 0);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return kotlin.ranges.c.coerceAtLeast(measurable.minIntrinsicWidth(i10), !Dp.m4394equalsimpl0(this.H0, Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo413roundToPx0680j_4(this.H0) : 0);
    }
}
