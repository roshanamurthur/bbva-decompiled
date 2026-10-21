package l0;

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
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$CircularLayout$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1672:1\n766#2:1673\n857#2,2:1674\n1549#2:1676\n1620#2,3:1677\n1#3:1680\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$CircularLayout$1\n*L\n1507#1:1673\n1507#1:1674,2\n1509#1:1676\n1509#1:1677,3\n*E\n"})
public final class o4 implements MeasurePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f82769a;

    /* JADX INFO: compiled from: TimePicker.kt */
    @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$CircularLayout$1$measure$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1672:1\n1864#2,3:1673\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$CircularLayout$1$measure$1\n*L\n1522#1:1673,3\n*E\n"})
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82770p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<Placeable> f82771q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82772r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f82773s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ float f82774t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ float f82775u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Placeable placeable, ArrayList arrayList, Placeable placeable2, long j10, float f6, float f10) {
            super(1);
            this.f82770p0 = placeable;
            this.f82771q0 = arrayList;
            this.f82772r0 = placeable2;
            this.f82773s0 = j10;
            this.f82774t0 = f6;
            this.f82775u0 = f10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            long j10;
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable placeable = this.f82770p0;
            if (placeable != null) {
                Placeable.PlacementScope.place$default(layout, placeable, 0, 0, 0.0f, 4, null);
            }
            Iterator<T> it = this.f82771q0.iterator();
            int i10 = 0;
            while (true) {
                boolean zHasNext = it.hasNext();
                j10 = this.f82773s0;
                if (!zHasNext) {
                    break;
                }
                Object next = it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Placeable placeable2 = (Placeable) next;
                int iM4357getMaxWidthimpl = (Constraints.m4357getMaxWidthimpl(j10) / 2) - (placeable2.getWidth() / 2);
                int iM4356getMaxHeightimpl = (Constraints.m4356getMaxHeightimpl(j10) / 2) - (placeable2.getHeight() / 2);
                double d2 = this.f82774t0;
                double d3 = ((double) (this.f82775u0 * i10)) - 1.5707963267948966d;
                Placeable.PlacementScope.place$default(layout, placeable2, mk.c.roundToInt((Math.cos(d3) * d2) + ((double) iM4357getMaxWidthimpl)), mk.c.roundToInt((Math.sin(d3) * d2) + ((double) iM4356getMaxHeightimpl)), 0.0f, 4, null);
                i10 = i11;
            }
            Placeable placeable3 = this.f82772r0;
            if (placeable3 != null) {
                Placeable.PlacementScope.place$default(layout, placeable3, androidx.collection.a.a(placeable3, Constraints.m4359getMinWidthimpl(j10), 2), androidx.appcompat.app.i.a(placeable3, Constraints.m4358getMinHeightimpl(j10), 2), 0.0f, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public o4(float f6) {
        this.f82769a = f6;
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
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        float fMo415toPx0680j_4 = Layout.mo415toPx0680j_4(this.f82769a);
        long jM4349copyZbe2FdA$default = Constraints.m4349copyZbe2FdA$default(j10, 0, 0, 0, 0, 10, null);
        List<? extends Measurable> list = measurables;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Measurable measurable = (Measurable) obj;
            if (LayoutIdKt.getLayoutId(measurable) != z1.Selector && LayoutIdKt.getLayoutId(measurable) != z1.InnerCircle) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Measurable) it.next()).mo3575measureBRTryo0(jM4349copyZbe2FdA$default));
        }
        Iterator<T> it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (LayoutIdKt.getLayoutId((Measurable) next) != z1.Selector);
        Measurable measurable2 = (Measurable) next;
        Iterator<T> it3 = list.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (LayoutIdKt.getLayoutId((Measurable) next2) != z1.InnerCircle);
        Measurable measurable3 = (Measurable) next2;
        return MeasureScope.CC.q(Layout, Constraints.m4359getMinWidthimpl(j10), Constraints.m4358getMinHeightimpl(j10), null, new a(measurable2 != null ? measurable2.mo3575measureBRTryo0(jM4349copyZbe2FdA$default) : null, arrayList2, measurable3 != null ? measurable3.mo3575measureBRTryo0(jM4349copyZbe2FdA$default) : null, j10, fMo415toPx0680j_4, 6.2831855f / arrayList2.size()), 4, null);
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
