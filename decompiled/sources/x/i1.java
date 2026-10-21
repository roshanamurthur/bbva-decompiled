package x;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,467:1\n154#2:468\n154#2:469\n154#2:470\n154#2:471\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n*L\n443#1:468\n444#1:469\n445#1:470\n446#1:471\n*E\n"})
public final class i1 extends Modifier.Node implements LayoutModifierNode {

    @NotNull
    public PaddingValues H0;

    /* JADX INFO: compiled from: Padding.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f94352p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MeasureScope f94353q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ i1 f94354r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Placeable placeable, MeasureScope measureScope, i1 i1Var) {
            super(1);
            this.f94352p0 = placeable;
            this.f94353q0 = measureScope;
            this.f94354r0 = i1Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable placeable = this.f94352p0;
            i1 i1Var = this.f94354r0;
            PaddingValues paddingValues = i1Var.H0;
            MeasureScope measureScope = this.f94353q0;
            Placeable.PlacementScope.place$default(layout, placeable, measureScope.mo413roundToPx0680j_4(paddingValues.mo302calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection())), measureScope.mo413roundToPx0680j_4(i1Var.H0.getTop()), 0.0f, 4, null);
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
        float f6 = 0;
        if (Dp.m4388compareTo0680j_4(this.H0.mo302calculateLeftPaddingu2uoSUM(measure.getLayoutDirection()), Dp.m4389constructorimpl(f6)) < 0 || Dp.m4388compareTo0680j_4(this.H0.getTop(), Dp.m4389constructorimpl(f6)) < 0 || Dp.m4388compareTo0680j_4(this.H0.mo303calculateRightPaddingu2uoSUM(measure.getLayoutDirection()), Dp.m4389constructorimpl(f6)) < 0 || Dp.m4388compareTo0680j_4(this.H0.getBottom(), Dp.m4389constructorimpl(f6)) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
        int iMo413roundToPx0680j_4 = measure.mo413roundToPx0680j_4(this.H0.mo303calculateRightPaddingu2uoSUM(measure.getLayoutDirection())) + measure.mo413roundToPx0680j_4(this.H0.mo302calculateLeftPaddingu2uoSUM(measure.getLayoutDirection()));
        int iMo413roundToPx0680j_5 = measure.mo413roundToPx0680j_4(this.H0.getBottom()) + measure.mo413roundToPx0680j_4(this.H0.getTop());
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(ConstraintsKt.m4373offsetNN6EwU(j10, -iMo413roundToPx0680j_4, -iMo413roundToPx0680j_5));
        return MeasureScope.CC.q(measure, ConstraintsKt.m4371constrainWidthK40F9xA(j10, placeableMo3575measureBRTryo0.getWidth() + iMo413roundToPx0680j_4), ConstraintsKt.m4370constrainHeightK40F9xA(j10, placeableMo3575measureBRTryo0.getHeight() + iMo413roundToPx0680j_5), null, new a(placeableMo3575measureBRTryo0, measure, this), 4, null);
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
