package h0;

import androidx.compose.material.SnackbarKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt$TextOnlySnackbar$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n1#2:365\n*E\n"})
public final class g3 implements MeasurePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g3 f68786a = new g3();

    /* JADX INFO: compiled from: Snackbar.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f68787p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Placeable f68788q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, Placeable placeable) {
            super(1);
            this.f68787p0 = i10;
            this.f68788q0 = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.placeRelative$default(layout, this.f68788q0, 0, (this.f68787p0 - this.f68788q0.getHeight()) / 2, 0.0f, 4, null);
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
    public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j10) {
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        if (measurables.size() != 1) {
            throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child".toString());
        }
        Placeable placeableMo3575measureBRTryo0 = ((Measurable) CollectionsKt___CollectionsKt.first((List) measurables)).mo3575measureBRTryo0(j10);
        int i10 = placeableMo3575measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
        int i11 = placeableMo3575measureBRTryo0.get(AlignmentLineKt.getLastBaseline());
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No baselines for text".toString());
        }
        if (i11 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No baselines for text".toString());
        }
        int iMax = Math.max(Layout.mo413roundToPx0680j_4(i10 == i11 ? SnackbarKt.f7734h : SnackbarKt.f7735i), placeableMo3575measureBRTryo0.getHeight());
        return MeasureScope.CC.q(Layout, Constraints.m4357getMaxWidthimpl(j10), iMax, null, new a(iMax, placeableMo3575measureBRTryo0), 4, null);
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
