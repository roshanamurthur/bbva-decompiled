package l0;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1672:1\n223#2,2:1673\n766#2:1675\n857#2,2:1676\n1549#2:1678\n1620#2,3:1679\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1\n*L\n885#1:1673,2\n893#1:1675\n893#1:1676,2\n893#1:1678\n893#1:1679,3\n*E\n"})
public final class z4 implements MeasurePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z4 f83076a = new z4();

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ List<Placeable> f83077p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Placeable f83078q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Placeable placeable, ArrayList arrayList) {
            super(1);
            this.f83077p0 = arrayList;
            this.f83078q0 = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            List<Placeable> list = this.f83077p0;
            Placeable.PlacementScope.place$default(layout, list.get(0), 0, 0, 0.0f, 4, null);
            Placeable.PlacementScope.place$default(layout, list.get(1), list.get(0).getWidth(), 0, 0.0f, 4, null);
            Placeable.PlacementScope.place$default(layout, this.f83078q0, list.get(0).getWidth() - (this.f83078q0.getWidth() / 2), 0, 0.0f, 4, null);
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
    public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope MeasurePolicy, @NotNull List<? extends Measurable> measurables, long j10) {
        Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        List<? extends Measurable> list = measurables;
        for (Measurable measurable : list) {
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "Spacer")) {
                Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(j10, 0, mk.c.roundToInt(MeasurePolicy.mo415toPx0680j_4(TimePickerTokens.INSTANCE.m1988getPeriodSelectorOutlineWidthD9Ej5fM())), 0, 0, 12, null));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj), "Spacer")) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Measurable) it.next()).mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(j10, 0, Constraints.m4357getMaxWidthimpl(j10) / 2, 0, 0, 12, null)));
                }
                return MeasureScope.CC.q(MeasurePolicy, Constraints.m4357getMaxWidthimpl(j10), Constraints.m4356getMaxHeightimpl(j10), null, new a(placeableMo3575measureBRTryo0, arrayList2), 4, null);
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
