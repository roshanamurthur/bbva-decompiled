package t;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Scroll.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends Modifier.Node implements LayoutModifierNode {

    @NotNull
    public ScrollState H0;
    public boolean I0;
    public boolean J0;

    /* JADX INFO: compiled from: Scroll.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f93414q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Placeable f93415r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, Placeable placeable) {
            super(1);
            this.f93414q0 = i10;
            this.f93415r0 = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            l0 l0Var = l0.this;
            int value = l0Var.H0.getValue();
            int i10 = this.f93414q0;
            int iCoerceIn = kotlin.ranges.c.coerceIn(value, 0, i10);
            int i11 = l0Var.I0 ? iCoerceIn - i10 : -iCoerceIn;
            boolean z10 = l0Var.J0;
            Placeable.PlacementScope.placeRelativeWithLayer$default(layout, this.f93415r0, z10 ? 0 : i11, z10 ? i11 : 0, 0.0f, null, 12, null);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return this.J0 ? measurable.maxIntrinsicHeight(i10) : measurable.maxIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return this.J0 ? measurable.maxIntrinsicWidth(Integer.MAX_VALUE) : measurable.maxIntrinsicWidth(i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo172measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        CheckScrollableContainerConstraintsKt.m143checkScrollableContainerConstraintsK40F9xA(j10, this.J0 ? Orientation.Vertical : Orientation.Horizontal);
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(j10, 0, this.J0 ? Constraints.m4357getMaxWidthimpl(j10) : Integer.MAX_VALUE, 0, this.J0 ? Integer.MAX_VALUE : Constraints.m4356getMaxHeightimpl(j10), 5, null));
        int iCoerceAtMost = kotlin.ranges.c.coerceAtMost(placeableMo3575measureBRTryo0.getWidth(), Constraints.m4357getMaxWidthimpl(j10));
        int iCoerceAtMost2 = kotlin.ranges.c.coerceAtMost(placeableMo3575measureBRTryo0.getHeight(), Constraints.m4356getMaxHeightimpl(j10));
        int height = placeableMo3575measureBRTryo0.getHeight() - iCoerceAtMost2;
        int width = placeableMo3575measureBRTryo0.getWidth() - iCoerceAtMost;
        if (!this.J0) {
            height = width;
        }
        this.H0.setMaxValue$foundation_release(height);
        this.H0.setViewportSize$foundation_release(this.J0 ? iCoerceAtMost2 : iCoerceAtMost);
        return MeasureScope.CC.q(measure, iCoerceAtMost, iCoerceAtMost2, null, new a(height, placeableMo3575measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return this.J0 ? measurable.minIntrinsicHeight(i10) : measurable.minIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return this.J0 ? measurable.minIntrinsicWidth(Integer.MAX_VALUE) : measurable.minIntrinsicWidth(i10);
    }
}
