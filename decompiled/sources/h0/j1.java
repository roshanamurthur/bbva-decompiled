package h0;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ListItem.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements MeasurePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f68847a;

    /* JADX INFO: compiled from: ListItem.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f68848p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f68849q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, Placeable placeable) {
            super(1);
            this.f68848p0 = placeable;
            this.f68849q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.placeRelative$default(layout, this.f68848p0, 0, this.f68849q0, 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    public j1(float f6) {
        this.f68847a = f6;
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
    public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j10) {
        int iMax;
        int iM4508getYimpl;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Placeable placeableMo3575measureBRTryo0 = measurables.get(0).mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null));
        int i10 = placeableMo3575measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
        if (i10 != Integer.MIN_VALUE) {
            iM4508getYimpl = Layout.mo413roundToPx0680j_4(this.f68847a) - i10;
            iMax = Math.max(Constraints.m4358getMinHeightimpl(j10), placeableMo3575measureBRTryo0.getHeight() + iM4508getYimpl);
        } else {
            iMax = Math.max(Constraints.m4358getMinHeightimpl(j10), placeableMo3575measureBRTryo0.getHeight());
            iM4508getYimpl = IntOffset.m4508getYimpl(Alignment.INSTANCE.getCenter().mo2184alignKFBX0sM(IntSize.INSTANCE.m4554getZeroYbymL2g(), IntSizeKt.IntSize(0, iMax - placeableMo3575measureBRTryo0.getHeight()), Layout.getLayoutDirection()));
        }
        return MeasureScope.CC.q(Layout, placeableMo3575measureBRTryo0.getWidth(), iMax, null, new a(iM4508getYimpl, placeableMo3575measureBRTryo0), 4, null);
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
