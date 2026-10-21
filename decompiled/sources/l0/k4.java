package l0;

import androidx.compose.material3.TabKt;
import androidx.compose.runtime.Composer;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Tab.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$TabBaselineLayout$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,445:1\n223#2,2:446\n223#2,2:448\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$TabBaselineLayout$2\n*L\n323#1:446,2\n331#1:448,2\n*E\n"})
public final class k4 implements MeasurePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82660b;

    /* JADX INFO: compiled from: Tab.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82661p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82662q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MeasureScope f82663r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f82664s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f82665t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Integer f82666u0;
        public final /* synthetic */ Integer v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Placeable placeable, Placeable placeable2, MeasureScope measureScope, int i10, int i11, Integer num, Integer num2) {
            super(1);
            this.f82661p0 = placeable;
            this.f82662q0 = placeable2;
            this.f82663r0 = measureScope;
            this.f82664s0 = i10;
            this.f82665t0 = i11;
            this.f82666u0 = num;
            this.v0 = num2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable placeable = this.f82662q0;
            Placeable placeable2 = this.f82661p0;
            if (placeable2 == null || placeable == null) {
                int i10 = this.f82665t0;
                if (placeable2 != null) {
                    Placeable.PlacementScope.placeRelative$default(layout, placeable2, 0, androidx.appcompat.app.i.a(placeable2, i10, 2), 0.0f, 4, null);
                } else if (placeable != null) {
                    Placeable.PlacementScope.placeRelative$default(layout, placeable, 0, androidx.appcompat.app.i.a(placeable, i10, 2), 0.0f, 4, null);
                }
            } else {
                MeasureScope measureScope = this.f82663r0;
                int i11 = this.f82664s0;
                int i12 = this.f82665t0;
                Integer num = this.f82666u0;
                Intrinsics.checkNotNull(num);
                int iIntValue = num.intValue();
                Integer num2 = this.v0;
                Intrinsics.checkNotNull(num2);
                TabKt.access$placeTextAndIcon(layout, measureScope, placeable2, placeable, i11, i12, iIntValue, num2.intValue());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k4(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3) {
        this.f82659a = function2;
        this.f82660b = function3;
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
        Placeable placeableMo3575measureBRTryo0;
        Placeable placeableMo3575measureBRTryo1;
        Measurable measurable;
        Measurable measurable2;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        if (this.f82659a != null) {
            Iterator<T> it = measurables.iterator();
            do {
                if (!it.hasNext()) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                measurable2 = (Measurable) it.next();
            } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "text"));
            placeableMo3575measureBRTryo0 = measurable2.mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null));
        } else {
            placeableMo3575measureBRTryo0 = null;
        }
        if (this.f82660b != null) {
            Iterator<T> it2 = measurables.iterator();
            do {
                if (!it2.hasNext()) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                measurable = (Measurable) it2.next();
            } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "icon"));
            placeableMo3575measureBRTryo1 = measurable.mo3575measureBRTryo0(j10);
        } else {
            placeableMo3575measureBRTryo1 = null;
        }
        int iMax = Math.max(placeableMo3575measureBRTryo0 != null ? placeableMo3575measureBRTryo0.getWidth() : 0, placeableMo3575measureBRTryo1 != null ? placeableMo3575measureBRTryo1.getWidth() : 0);
        int iMax2 = Math.max(Layout.mo413roundToPx0680j_4((placeableMo3575measureBRTryo0 == null || placeableMo3575measureBRTryo1 == null) ? TabKt.f11923a : TabKt.f11924b), Layout.mo412roundToPxR2X_6o(TabKt.f11928f) + (placeableMo3575measureBRTryo1 != null ? placeableMo3575measureBRTryo1.getHeight() : 0) + (placeableMo3575measureBRTryo0 != null ? placeableMo3575measureBRTryo0.getHeight() : 0));
        return MeasureScope.CC.q(Layout, iMax, iMax2, null, new a(placeableMo3575measureBRTryo0, placeableMo3575measureBRTryo1, Layout, iMax, iMax2, placeableMo3575measureBRTryo0 != null ? Integer.valueOf(placeableMo3575measureBRTryo0.get(AlignmentLineKt.getFirstBaseline())) : null, placeableMo3575measureBRTryo0 != null ? Integer.valueOf(placeableMo3575measureBRTryo0.get(AlignmentLineKt.getLastBaseline())) : null), 4, null);
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
