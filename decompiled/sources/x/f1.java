package x;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,467:1\n154#2:468\n154#2:469\n154#2:470\n154#2:471\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingNode\n*L\n382#1:468\n383#1:469\n384#1:470\n385#1:471\n*E\n"})
public final class f1 extends Modifier.Node implements LayoutModifierNode {
    public float H0;
    public float I0;
    public float J0;
    public float K0;
    public boolean L0;

    /* JADX INFO: compiled from: Padding.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Placeable f94329q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MeasureScope f94330r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Placeable placeable, MeasureScope measureScope) {
            super(1);
            this.f94329q0 = placeable;
            this.f94330r0 = measureScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            f1 f1Var = f1.this;
            boolean z10 = f1Var.L0;
            MeasureScope measureScope = this.f94330r0;
            if (z10) {
                Placeable.PlacementScope.placeRelative$default(layout, this.f94329q0, measureScope.mo413roundToPx0680j_4(f1Var.H0), measureScope.mo413roundToPx0680j_4(f1Var.I0), 0.0f, 4, null);
            } else {
                Placeable.PlacementScope.place$default(layout, this.f94329q0, measureScope.mo413roundToPx0680j_4(f1Var.H0), measureScope.mo413roundToPx0680j_4(f1Var.I0), 0.0f, 4, null);
            }
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
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        int iMo413roundToPx0680j_4 = measure.mo413roundToPx0680j_4(this.J0) + measure.mo413roundToPx0680j_4(this.H0);
        int iMo413roundToPx0680j_5 = measure.mo413roundToPx0680j_4(this.K0) + measure.mo413roundToPx0680j_4(this.I0);
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(ConstraintsKt.m4373offsetNN6EwU(j10, -iMo413roundToPx0680j_4, -iMo413roundToPx0680j_5));
        return MeasureScope.CC.q(measure, ConstraintsKt.m4371constrainWidthK40F9xA(j10, placeableMo3575measureBRTryo0.getWidth() + iMo413roundToPx0680j_4), ConstraintsKt.m4370constrainHeightK40F9xA(j10, placeableMo3575measureBRTryo0.getHeight() + iMo413roundToPx0680j_5), null, new a(placeableMo3575measureBRTryo0, measure), 4, null);
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
