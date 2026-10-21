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
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends Modifier.Node implements LayoutModifierNode {

    @NotNull
    public Direction H0;
    public boolean I0;

    @NotNull
    public Function2<? super IntSize, ? super LayoutDirection, IntOffset> J0;

    /* JADX INFO: compiled from: Size.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f94467q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Placeable f94468r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f94469s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MeasureScope f94470t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, Placeable placeable, int i11, MeasureScope measureScope) {
            super(1);
            this.f94467q0 = i10;
            this.f94468r0 = placeable;
            this.f94469s0 = i11;
            this.f94470t0 = measureScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Function2<? super IntSize, ? super LayoutDirection, IntOffset> function2 = w1.this.J0;
            Placeable placeable = this.f94468r0;
            Placeable.PlacementScope.m3611place70tqf50$default(layout, this.f94468r0, function2.invoke(IntSize.m4541boximpl(IntSizeKt.IntSize(this.f94467q0 - placeable.getWidth(), this.f94469s0 - placeable.getHeight())), this.f94470t0.getLayoutDirection()).getF18312a(), 0.0f, 2, null);
            return Unit.INSTANCE;
        }
    }

    public w1() {
        throw null;
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
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Direction direction = this.H0;
        Direction direction2 = Direction.Vertical;
        int iM4359getMinWidthimpl = direction != direction2 ? 0 : Constraints.m4359getMinWidthimpl(j10);
        Direction direction3 = this.H0;
        Direction direction4 = Direction.Horizontal;
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(ConstraintsKt.Constraints(iM4359getMinWidthimpl, (this.H0 == direction2 || !this.I0) ? Constraints.m4357getMaxWidthimpl(j10) : Integer.MAX_VALUE, direction3 == direction4 ? Constraints.m4358getMinHeightimpl(j10) : 0, (this.H0 == direction4 || !this.I0) ? Constraints.m4356getMaxHeightimpl(j10) : Integer.MAX_VALUE));
        int iCoerceIn = kotlin.ranges.c.coerceIn(placeableMo3575measureBRTryo0.getWidth(), Constraints.m4359getMinWidthimpl(j10), Constraints.m4357getMaxWidthimpl(j10));
        int iCoerceIn2 = kotlin.ranges.c.coerceIn(placeableMo3575measureBRTryo0.getHeight(), Constraints.m4358getMinHeightimpl(j10), Constraints.m4356getMaxHeightimpl(j10));
        return MeasureScope.CC.q(measure, iCoerceIn, iCoerceIn2, null, new a(iCoerceIn, placeableMo3575measureBRTryo0, iCoerceIn2, measure), 4, null);
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
