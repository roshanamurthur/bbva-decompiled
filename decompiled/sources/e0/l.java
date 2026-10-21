package e0;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BasicText.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy\n+ 2 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,436:1\n80#2,3:437\n83#2:444\n84#2:446\n85#2:448\n69#3,4:440\n74#3:447\n1#4:445\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy\n*L\n362#1:437,3\n362#1:444\n362#1:446\n362#1:448\n362#1:440,4\n362#1:447\n362#1:445\n*E\n"})
public final class l implements MeasurePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function0<List<Rect>> f68245a;

    /* JADX INFO: compiled from: BasicText.kt */
    @SourceDebugExtension({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy$measure$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,436:1\n33#2,6:437\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy$measure$1\n*L\n381#1:437,6\n*E\n"})
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ List<Pair<Placeable, IntOffset>> f68246p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList) {
            super(1);
            this.f68246p0 = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            List<Pair<Placeable, IntOffset>> list = this.f68246p0;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Pair<Placeable, IntOffset> pair = list.get(i10);
                    Placeable.PlacementScope.m3611place70tqf50$default(layout, pair.component1(), pair.component2().getF18312a(), 0.0f, 2, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@NotNull Function0<? extends List<Rect>> placements) {
        Intrinsics.checkNotNullParameter(placements, "placements");
        this.f68245a = placements;
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
        List<Rect> listInvoke = this.f68245a.invoke();
        ArrayList arrayList = null;
        if (listInvoke != null) {
            ArrayList arrayList2 = new ArrayList(listInvoke.size());
            int size = listInvoke.size();
            for (int i10 = 0; i10 < size; i10++) {
                Rect rect = listInvoke.get(i10);
                Pair pair = rect != null ? new Pair(measurables.get(i10).mo3575measureBRTryo0(ConstraintsKt.Constraints$default(0, (int) Math.floor(rect.getWidth()), 0, (int) Math.floor(rect.getHeight()), 5, null)), IntOffset.m4498boximpl(IntOffsetKt.IntOffset(mk.c.roundToInt(rect.getLeft()), mk.c.roundToInt(rect.getTop())))) : null;
                if (pair != null) {
                    arrayList2.add(pair);
                }
            }
            arrayList = arrayList2;
        }
        return MeasureScope.CC.q(measure, Constraints.m4357getMaxWidthimpl(j10), Constraints.m4356getMaxHeightimpl(j10), null, new a(arrayList), 4, null);
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
