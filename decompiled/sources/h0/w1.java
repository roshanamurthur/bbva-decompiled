package h0;

import androidx.compose.material.NavigationRailKt;
import androidx.compose.runtime.Composer;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NavigationRail.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt$NavigationRailItemBaselineLayout$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,405:1\n223#2,2:406\n223#2,2:408\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt$NavigationRailItemBaselineLayout$2\n*L\n277#1:406,2\n280#1:408,2\n*E\n"})
public final class w1 implements MeasurePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f69150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f69151b;

    /* JADX WARN: Multi-variable type inference failed */
    public w1(Function2<? super Composer, ? super Integer, Unit> function2, float f6) {
        this.f69150a = function2;
        this.f69151b = f6;
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
        Measurable measurable;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        List<? extends Measurable> list = measurables;
        for (Measurable measurable2 : list) {
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                Placeable placeableMo3575measureBRTryo1 = measurable2.mo3575measureBRTryo0(j10);
                Function2<Composer, Integer, Unit> function2 = this.f69150a;
                if (function2 != null) {
                    Iterator<T> it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        measurable = (Measurable) it.next();
                    } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "label"));
                    placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null));
                } else {
                    placeableMo3575measureBRTryo0 = null;
                }
                if (function2 == null) {
                    return MeasureScope.CC.q(Layout, Constraints.m4357getMaxWidthimpl(j10), Constraints.m4356getMaxHeightimpl(j10), null, new y1(Math.max(0, (Constraints.m4357getMaxWidthimpl(j10) - placeableMo3575measureBRTryo1.getWidth()) / 2), Math.max(0, (Constraints.m4356getMaxHeightimpl(j10) - placeableMo3575measureBRTryo1.getHeight()) / 2), placeableMo3575measureBRTryo1), 4, null);
                }
                Intrinsics.checkNotNull(placeableMo3575measureBRTryo0);
                return NavigationRailKt.m793access$placeLabelAndIconDIyivk0(Layout, placeableMo3575measureBRTryo0, placeableMo3575measureBRTryo1, j10, this.f69151b);
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
