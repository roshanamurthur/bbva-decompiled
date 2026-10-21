package x;

import androidx.compose.foundation.layout.Direction;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q extends Modifier.Node implements LayoutModifierNode {

    @NotNull
    public Direction H0;
    public float I0;

    /* JADX INFO: compiled from: Size.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f94387p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Placeable placeable) {
            super(1);
            this.f94387p0 = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.placeRelative$default(layout, this.f94387p0, 0, 0, 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.node.a.a(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.node.a.b(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo172measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        int iM4359getMinWidthimpl;
        int iM4357getMaxWidthimpl;
        int iM4356getMaxHeightimpl;
        int iCoerceIn;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (!Constraints.m4353getHasBoundedWidthimpl(j10) || this.H0 == Direction.Vertical) {
            iM4359getMinWidthimpl = Constraints.m4359getMinWidthimpl(j10);
            iM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(j10);
        } else {
            iM4359getMinWidthimpl = kotlin.ranges.c.coerceIn(mk.c.roundToInt(Constraints.m4357getMaxWidthimpl(j10) * this.I0), Constraints.m4359getMinWidthimpl(j10), Constraints.m4357getMaxWidthimpl(j10));
            iM4357getMaxWidthimpl = iM4359getMinWidthimpl;
        }
        if (!Constraints.m4352getHasBoundedHeightimpl(j10) || this.H0 == Direction.Horizontal) {
            int iM4358getMinHeightimpl = Constraints.m4358getMinHeightimpl(j10);
            iM4356getMaxHeightimpl = Constraints.m4356getMaxHeightimpl(j10);
            iCoerceIn = iM4358getMinHeightimpl;
        } else {
            iCoerceIn = kotlin.ranges.c.coerceIn(mk.c.roundToInt(Constraints.m4356getMaxHeightimpl(j10) * this.I0), Constraints.m4358getMinHeightimpl(j10), Constraints.m4356getMaxHeightimpl(j10));
            iM4356getMaxHeightimpl = iCoerceIn;
        }
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(ConstraintsKt.Constraints(iM4359getMinWidthimpl, iM4357getMaxWidthimpl, iCoerceIn, iM4356getMaxHeightimpl));
        return MeasureScope.CC.q(measure, placeableMo3575measureBRTryo0.getWidth(), placeableMo3575measureBRTryo0.getHeight(), null, new a(placeableMo3575measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.node.a.c(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return androidx.compose.ui.node.a.d(this, intrinsicMeasureScope, intrinsicMeasurable, i10);
    }
}
