package l0;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material3.AppBarKt;
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

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$TopAppBarLayout$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1664:1\n223#2,2:1665\n223#2,2:1667\n223#2,2:1669\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$TopAppBarLayout$2\n*L\n1337#1:1665,2\n1340#1:1667,2\n1350#1:1669,2\n*E\n"})
public final class f implements MeasurePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f82527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Horizontal f82528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Vertical f82529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f82530d;

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82531p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f82532q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82533r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Arrangement.Horizontal f82534s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f82535t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82536u0;
        public final /* synthetic */ MeasureScope v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Arrangement.Vertical f82537w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f82538x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f82539y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Placeable placeable, int i10, Placeable placeable2, Arrangement.Horizontal horizontal, long j10, Placeable placeable3, MeasureScope measureScope, Arrangement.Vertical vertical, int i11, int i12) {
            super(1);
            this.f82531p0 = placeable;
            this.f82532q0 = i10;
            this.f82533r0 = placeable2;
            this.f82534s0 = horizontal;
            this.f82535t0 = j10;
            this.f82536u0 = placeable3;
            this.v0 = measureScope;
            this.f82537w0 = vertical;
            this.f82538x0 = i11;
            this.f82539y0 = i12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            int iM4357getMaxWidthimpl;
            int height;
            int height2;
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable placeable = this.f82531p0;
            int height3 = placeable.getHeight();
            int i10 = this.f82532q0;
            Placeable.PlacementScope.placeRelative$default(layout, placeable, 0, (i10 - height3) / 2, 0.0f, 4, null);
            Placeable placeable2 = this.f82533r0;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
            Arrangement.Horizontal horizontal = this.f82534s0;
            boolean zAreEqual = Intrinsics.areEqual(horizontal, center);
            Placeable placeable3 = this.f82536u0;
            long j10 = this.f82535t0;
            Placeable placeable4 = this.f82533r0;
            if (zAreEqual) {
                iM4357getMaxWidthimpl = androidx.collection.a.a(placeable4, Constraints.m4357getMaxWidthimpl(j10), 2);
            } else {
                iM4357getMaxWidthimpl = Intrinsics.areEqual(horizontal, arrangement.getEnd()) ? (Constraints.m4357getMaxWidthimpl(j10) - placeable4.getWidth()) - placeable3.getWidth() : Math.max(this.v0.mo413roundToPx0680j_4(AppBarKt.f9246i), placeable.getWidth());
            }
            Arrangement.HorizontalOrVertical center2 = arrangement.getCenter();
            Arrangement.Vertical vertical = this.f82537w0;
            if (!Intrinsics.areEqual(vertical, center2)) {
                height = 0;
                if (Intrinsics.areEqual(vertical, arrangement.getBottom())) {
                    int i11 = this.f82538x0;
                    if (i11 == 0) {
                        height2 = i10 - placeable4.getHeight();
                    } else {
                        height = (i10 - placeable4.getHeight()) - Math.max(0, (i11 - placeable4.getHeight()) + this.f82539y0);
                    }
                }
                Placeable.PlacementScope.placeRelative$default(layout, placeable2, iM4357getMaxWidthimpl, height, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(layout, this.f82536u0, Constraints.m4357getMaxWidthimpl(j10) - placeable3.getWidth(), androidx.appcompat.app.i.a(placeable3, i10, 2), 0.0f, 4, null);
                return Unit.INSTANCE;
            }
            height2 = androidx.appcompat.app.i.a(placeable4, i10, 2);
            height = height2;
            Placeable.PlacementScope.placeRelative$default(layout, placeable2, iM4357getMaxWidthimpl, height, 0.0f, 4, null);
            Placeable.PlacementScope.placeRelative$default(layout, this.f82536u0, Constraints.m4357getMaxWidthimpl(j10) - placeable3.getWidth(), androidx.appcompat.app.i.a(placeable3, i10, 2), 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    public f(float f6, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i10) {
        this.f82527a = f6;
        this.f82528b = horizontal;
        this.f82529c = vertical;
        this.f82530d = i10;
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
        List<? extends Measurable> list = measurables;
        for (Measurable measurable : list) {
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "navigationIcon")) {
                Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(j10, 0, 0, 0, 0, 14, null));
                for (Measurable measurable2 : list) {
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "actionIcons")) {
                        Placeable placeableMo3575measureBRTryo1 = measurable2.mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(j10, 0, 0, 0, 0, 14, null));
                        int iM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(j10) == Integer.MAX_VALUE ? Constraints.m4357getMaxWidthimpl(j10) : kotlin.ranges.c.coerceAtLeast((Constraints.m4357getMaxWidthimpl(j10) - placeableMo3575measureBRTryo0.getWidth()) - placeableMo3575measureBRTryo1.getWidth(), 0);
                        for (Measurable measurable3 : list) {
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "title")) {
                                Placeable placeableMo3575measureBRTryo2 = measurable3.mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(j10, 0, iM4357getMaxWidthimpl, 0, 0, 12, null));
                                int i10 = placeableMo3575measureBRTryo2.get(AlignmentLineKt.getLastBaseline()) != Integer.MIN_VALUE ? placeableMo3575measureBRTryo2.get(AlignmentLineKt.getLastBaseline()) : 0;
                                int iRoundToInt = mk.c.roundToInt(this.f82527a);
                                return MeasureScope.CC.q(Layout, Constraints.m4357getMaxWidthimpl(j10), iRoundToInt, null, new a(placeableMo3575measureBRTryo0, iRoundToInt, placeableMo3575measureBRTryo2, this.f82528b, j10, placeableMo3575measureBRTryo1, Layout, this.f82529c, this.f82530d, i10), 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
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
