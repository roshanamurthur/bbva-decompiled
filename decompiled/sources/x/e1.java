package x;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Offset.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends Modifier.Node implements LayoutModifierNode {

    @NotNull
    public Function1<? super Density, IntOffset> H0;
    public boolean I0;

    /* JADX INFO: compiled from: Offset.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MeasureScope f94324q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Placeable f94325r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MeasureScope measureScope, Placeable placeable) {
            super(1);
            this.f94324q0 = measureScope;
            this.f94325r0 = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            e1 e1Var = e1.this;
            long f18312a = e1Var.H0.invoke(this.f94324q0).getF18312a();
            if (e1Var.I0) {
                Placeable.PlacementScope.placeRelativeWithLayer$default(layout, this.f94325r0, IntOffset.m4507getXimpl(f18312a), IntOffset.m4508getYimpl(f18312a), 0.0f, null, 12, null);
            } else {
                Placeable.PlacementScope.placeWithLayer$default(layout, this.f94325r0, IntOffset.m4507getXimpl(f18312a), IntOffset.m4508getYimpl(f18312a), 0.0f, null, 12, null);
            }
            return Unit.INSTANCE;
        }
    }

    public e1() {
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
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(j10);
        return MeasureScope.CC.q(measure, placeableMo3575measureBRTryo0.getWidth(), placeableMo3575measureBRTryo0.getHeight(), null, new a(measure, placeableMo3575measureBRTryo0), 4, null);
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
