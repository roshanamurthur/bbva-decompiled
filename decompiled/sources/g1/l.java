package g1;

import androidx.compose.ui.layout.DefaultIntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.IntrinsicMinMax;
import androidx.compose.ui.layout.IntrinsicWidthHeight;
import androidx.compose.ui.layout.IntrinsicsMeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MultiContentMeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l {
    public static int a(MultiContentMeasurePolicy multiContentMeasurePolicy, @NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list = (List) measurables.get(i11);
            ArrayList arrayList2 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i12), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
            }
            arrayList.add(arrayList2);
        }
        return multiContentMeasurePolicy.m3603measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null)).getHeight();
    }

    public static int b(MultiContentMeasurePolicy multiContentMeasurePolicy, @NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list = (List) measurables.get(i11);
            ArrayList arrayList2 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i12), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
            }
            arrayList.add(arrayList2);
        }
        return multiContentMeasurePolicy.m3603measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null)).getWidth();
    }

    public static int c(MultiContentMeasurePolicy multiContentMeasurePolicy, @NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list = (List) measurables.get(i11);
            ArrayList arrayList2 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i12), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
            }
            arrayList.add(arrayList2);
        }
        return multiContentMeasurePolicy.m3603measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null)).getHeight();
    }

    public static int d(MultiContentMeasurePolicy multiContentMeasurePolicy, @NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list = (List) measurables.get(i11);
            ArrayList arrayList2 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i12), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
            }
            arrayList.add(arrayList2);
        }
        return multiContentMeasurePolicy.m3603measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null)).getWidth();
    }
}
