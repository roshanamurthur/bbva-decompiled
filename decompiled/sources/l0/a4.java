package l0;

import androidx.compose.material3.SnackbarKt;
import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.Iterator;
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
@SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$OneRowSnackbar$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,435:1\n288#2,2:436\n288#2,2:438\n223#2,2:440\n1#3:442\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$OneRowSnackbar$2\n*L\n336#1:436,2\n338#1:438,2\n347#1:440,2\n*E\n"})
public final class a4 implements MeasurePolicy {

    /* JADX INFO: compiled from: Snackbar.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82420p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f82421q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82422r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f82423s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f82424t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82425u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f82426w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Placeable placeable, int i10, Placeable placeable2, int i11, int i12, Placeable placeable3, int i13, int i14) {
            super(1);
            this.f82420p0 = placeable;
            this.f82421q0 = i10;
            this.f82422r0 = placeable2;
            this.f82423s0 = i11;
            this.f82424t0 = i12;
            this.f82425u0 = placeable3;
            this.v0 = i13;
            this.f82426w0 = i14;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.placeRelative$default(layout, this.f82420p0, 0, this.f82421q0, 0.0f, 4, null);
            Placeable placeable = this.f82422r0;
            if (placeable != null) {
                Placeable.PlacementScope.placeRelative$default(layout, placeable, this.f82423s0, this.f82424t0, 0.0f, 4, null);
            }
            Placeable placeable2 = this.f82425u0;
            if (placeable2 != null) {
                Placeable.PlacementScope.placeRelative$default(layout, placeable2, this.v0, this.f82426w0, 0.0f, 4, null);
            }
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
        Object next;
        Object next2;
        int iMax;
        int i10;
        int iA;
        Placeable placeable;
        int iA2;
        int i11;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int iMin = Math.min(Constraints.m4357getMaxWidthimpl(j10), Layout.mo413roundToPx0680j_4(SnackbarKt.f11532a));
        List<? extends Measurable> list = measurables;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next), "action"));
        Measurable measurable = (Measurable) next;
        Placeable placeableMo3575measureBRTryo0 = measurable != null ? measurable.mo3575measureBRTryo0(j10) : null;
        Iterator<T> it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next2), "dismissAction"));
        Measurable measurable2 = (Measurable) next2;
        Placeable placeableMo3575measureBRTryo1 = measurable2 != null ? measurable2.mo3575measureBRTryo0(j10) : null;
        int width = placeableMo3575measureBRTryo0 != null ? placeableMo3575measureBRTryo0.getWidth() : 0;
        int height = placeableMo3575measureBRTryo0 != null ? placeableMo3575measureBRTryo0.getHeight() : 0;
        int width2 = placeableMo3575measureBRTryo1 != null ? placeableMo3575measureBRTryo1.getWidth() : 0;
        int height2 = placeableMo3575measureBRTryo1 != null ? placeableMo3575measureBRTryo1.getHeight() : 0;
        int iCoerceAtLeast = kotlin.ranges.c.coerceAtLeast(((iMin - width) - width2) - (width2 == 0 ? Layout.mo413roundToPx0680j_4(SnackbarKt.f11538g) : 0), Constraints.m4359getMinWidthimpl(j10));
        for (Measurable measurable3 : list) {
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "text")) {
                int i12 = height2;
                Placeable placeableMo3575measureBRTryo2 = measurable3.mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(j10, 0, iCoerceAtLeast, 0, 0, 9, null));
                int i13 = placeableMo3575measureBRTryo2.get(AlignmentLineKt.getFirstBaseline());
                if (i13 == Integer.MIN_VALUE) {
                    throw new IllegalArgumentException("No baselines for text".toString());
                }
                int i14 = placeableMo3575measureBRTryo2.get(AlignmentLineKt.getLastBaseline());
                if (i14 == Integer.MIN_VALUE) {
                    throw new IllegalArgumentException("No baselines for text".toString());
                }
                int i15 = iMin - width2;
                int i16 = i15 - width;
                if (i13 == i14) {
                    int iMax2 = Math.max(Layout.mo413roundToPx0680j_4(SnackbarTokens.INSTANCE.m1946getSingleLineContainerHeightD9Ej5fM()), Math.max(height, i12));
                    int iA3 = androidx.appcompat.app.i.a(placeableMo3575measureBRTryo2, iMax2, 2);
                    iA = (placeableMo3575measureBRTryo0 == null || (i11 = placeableMo3575measureBRTryo0.get(AlignmentLineKt.getFirstBaseline())) == Integer.MIN_VALUE) ? 0 : (i13 + iA3) - i11;
                    iMax = iMax2;
                    i10 = iA3;
                } else {
                    int iMo413roundToPx0680j_4 = Layout.mo413roundToPx0680j_4(SnackbarKt.f11533b) - i13;
                    iMax = Math.max(Layout.mo413roundToPx0680j_4(SnackbarTokens.INSTANCE.m1947getTwoLinesContainerHeightD9Ej5fM()), placeableMo3575measureBRTryo2.getHeight() + iMo413roundToPx0680j_4);
                    i10 = iMo413roundToPx0680j_4;
                    iA = placeableMo3575measureBRTryo0 != null ? androidx.appcompat.app.i.a(placeableMo3575measureBRTryo0, iMax, 2) : 0;
                }
                if (placeableMo3575measureBRTryo1 != null) {
                    placeable = placeableMo3575measureBRTryo1;
                    iA2 = androidx.appcompat.app.i.a(placeable, iMax, 2);
                } else {
                    placeable = placeableMo3575measureBRTryo1;
                    iA2 = 0;
                }
                return MeasureScope.CC.q(Layout, iMin, iMax, null, new a(placeableMo3575measureBRTryo2, i10, placeable, i15, iA2, placeableMo3575measureBRTryo0, i16, iA), 4, null);
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
