package h0;

import androidx.compose.material.SnackbarKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt$OneRowSnackbar$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n223#2,2:365\n223#2,2:367\n1#3:369\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt$OneRowSnackbar$2\n*L\n308#1:365,2\n312#1:367,2\n*E\n"})
public final class e3 implements MeasurePolicy {

    /* JADX INFO: compiled from: Snackbar.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f68736p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f68737q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Placeable f68738r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f68739s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f68740t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Placeable placeable, int i10, Placeable placeable2, int i11, int i12) {
            super(1);
            this.f68736p0 = placeable;
            this.f68737q0 = i10;
            this.f68738r0 = placeable2;
            this.f68739s0 = i11;
            this.f68740t0 = i12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.placeRelative$default(layout, this.f68736p0, 0, this.f68737q0, 0.0f, 4, null);
            Placeable.PlacementScope.placeRelative$default(layout, this.f68738r0, this.f68739s0, this.f68740t0, 0.0f, 4, null);
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
        int iA;
        int iA2;
        int i10;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        List<? extends Measurable> list = measurables;
        for (Measurable measurable : list) {
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "action")) {
                Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(j10);
                int iCoerceAtLeast = kotlin.ranges.c.coerceAtLeast((Constraints.m4357getMaxWidthimpl(j10) - placeableMo3575measureBRTryo0.getWidth()) - Layout.mo413roundToPx0680j_4(SnackbarKt.f7732f), Constraints.m4359getMinWidthimpl(j10));
                for (Measurable measurable2 : list) {
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "text")) {
                        Placeable placeableMo3575measureBRTryo1 = measurable2.mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(j10, 0, iCoerceAtLeast, 0, 0, 9, null));
                        int i11 = placeableMo3575measureBRTryo1.get(AlignmentLineKt.getFirstBaseline());
                        if (i11 == Integer.MIN_VALUE) {
                            throw new IllegalArgumentException("No baselines for text".toString());
                        }
                        int i12 = placeableMo3575measureBRTryo1.get(AlignmentLineKt.getLastBaseline());
                        if (i12 == Integer.MIN_VALUE) {
                            throw new IllegalArgumentException("No baselines for text".toString());
                        }
                        boolean z10 = i11 == i12;
                        int iM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(j10) - placeableMo3575measureBRTryo0.getWidth();
                        if (z10) {
                            int iMax = Math.max(Layout.mo413roundToPx0680j_4(SnackbarKt.f7734h), placeableMo3575measureBRTryo0.getHeight());
                            iA = androidx.appcompat.app.i.a(placeableMo3575measureBRTryo1, iMax, 2);
                            int i13 = placeableMo3575measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
                            iA2 = i13 != Integer.MIN_VALUE ? (i11 + iA) - i13 : 0;
                            i10 = iMax;
                        } else {
                            int iMo413roundToPx0680j_4 = Layout.mo413roundToPx0680j_4(SnackbarKt.f7727a) - i11;
                            int iMax2 = Math.max(Layout.mo413roundToPx0680j_4(SnackbarKt.f7735i), placeableMo3575measureBRTryo1.getHeight() + iMo413roundToPx0680j_4);
                            iA = iMo413roundToPx0680j_4;
                            iA2 = androidx.appcompat.app.i.a(placeableMo3575measureBRTryo0, iMax2, 2);
                            i10 = iMax2;
                        }
                        return MeasureScope.CC.q(Layout, Constraints.m4357getMaxWidthimpl(j10), i10, null, new a(placeableMo3575measureBRTryo1, iA, placeableMo3575measureBRTryo0, iM4357getMaxWidthimpl, iA2), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
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
