package y;

import androidx.compose.runtime.State;
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
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyItemScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i extends Modifier.Node implements LayoutModifierNode {
    public float H0;

    @Nullable
    public State<Integer> I0;

    @Nullable
    public State<Integer> J0;

    /* JADX INFO: compiled from: LazyItemScopeImpl.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f94713p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Placeable placeable) {
            super(1);
            this.f94713p0 = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.place$default(layout, this.f94713p0, 0, 0, 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    public i() {
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
        State<Integer> state = this.I0;
        int iRoundToInt = (state == null || state.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : mk.c.roundToInt(state.getValue().floatValue() * this.H0);
        State<Integer> state2 = this.J0;
        int iRoundToInt2 = (state2 == null || state2.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : mk.c.roundToInt(state2.getValue().floatValue() * this.H0);
        int iM4359getMinWidthimpl = iRoundToInt != Integer.MAX_VALUE ? iRoundToInt : Constraints.m4359getMinWidthimpl(j10);
        int iM4358getMinHeightimpl = iRoundToInt2 != Integer.MAX_VALUE ? iRoundToInt2 : Constraints.m4358getMinHeightimpl(j10);
        if (iRoundToInt == Integer.MAX_VALUE) {
            iRoundToInt = Constraints.m4357getMaxWidthimpl(j10);
        }
        if (iRoundToInt2 == Integer.MAX_VALUE) {
            iRoundToInt2 = Constraints.m4356getMaxHeightimpl(j10);
        }
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(ConstraintsKt.Constraints(iM4359getMinWidthimpl, iRoundToInt, iM4358getMinHeightimpl, iRoundToInt2));
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
