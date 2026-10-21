package x;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Spacer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p1 implements MeasurePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p1 f94385a = new p1();

    /* JADX INFO: compiled from: Spacer.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f94386p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
        return g1.f.a(this, intrinsicMeasureScope, list, i10);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
        return g1.f.b(this, intrinsicMeasureScope, list, i10);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return MeasureScope.CC.q(measure, Constraints.m4355getHasFixedWidthimpl(j10) ? Constraints.m4357getMaxWidthimpl(j10) : 0, Constraints.m4354getHasFixedHeightimpl(j10) ? Constraints.m4356getMaxHeightimpl(j10) : 0, null, a.f94386p0, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
        return g1.f.c(this, intrinsicMeasureScope, list, i10);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
        return g1.f.d(this, intrinsicMeasureScope, list, i10);
    }
}
