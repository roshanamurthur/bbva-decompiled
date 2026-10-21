package h0;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ListItem.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt$BaselinesOffsetColumn$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,429:1\n1549#2:430\n1620#2,3:431\n1789#2,3:434\n69#3,6:437\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt$BaselinesOffsetColumn$1\n*L\n355#1:430\n355#1:431,3\n357#1:434,3\n362#1:437,6\n*E\n"})
public final class h1 implements MeasurePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<Dp> f68792a;

    /* JADX INFO: compiled from: ListItem.kt */
    @SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt$BaselinesOffsetColumn$1$measure$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,429:1\n69#2,6:430\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt$BaselinesOffsetColumn$1$measure$2\n*L\n375#1:430,6\n*E\n"})
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ List<Placeable> f68793p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Integer[] f68794q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList, Integer[] numArr) {
            super(1);
            this.f68793p0 = arrayList;
            this.f68794q0 = numArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            List<Placeable> list = this.f68793p0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Placeable.PlacementScope.placeRelative$default(layout, list.get(i10), 0, this.f68794q0[i10].intValue(), 0.0f, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public h1(List<Dp> list) {
        this.f68792a = list;
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
        int height;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        long jM4349copyZbe2FdA$default = Constraints.m4349copyZbe2FdA$default(j10, 0, 0, 0, Integer.MAX_VALUE, 3, null);
        List<? extends Measurable> list = measurables;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Measurable) it.next()).mo3575measureBRTryo0(jM4349copyZbe2FdA$default));
        }
        Iterator it2 = arrayList.iterator();
        int iMax = 0;
        while (it2.hasNext()) {
            iMax = Math.max(iMax, ((Placeable) it2.next()).getWidth());
        }
        int size = arrayList.size();
        Integer[] numArr = new Integer[size];
        for (int i10 = 0; i10 < size; i10++) {
            numArr[i10] = 0;
        }
        int size2 = arrayList.size();
        int height2 = 0;
        for (int i11 = 0; i11 < size2; i11++) {
            Placeable placeable = (Placeable) arrayList.get(i11);
            if (i11 > 0) {
                int i12 = i11 - 1;
                height = ((Placeable) arrayList.get(i12)).getHeight() - ((Placeable) arrayList.get(i12)).get(AlignmentLineKt.getLastBaseline());
            } else {
                height = 0;
            }
            int iMax2 = Math.max(0, (Layout.mo413roundToPx0680j_4(this.f68792a.get(i11).m4403unboximpl()) - placeable.get(AlignmentLineKt.getFirstBaseline())) - height);
            numArr[i11] = Integer.valueOf(iMax2 + height2);
            height2 += placeable.getHeight() + iMax2;
        }
        return MeasureScope.CC.q(Layout, iMax, height2, null, new a(arrayList, numArr), 4, null);
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
