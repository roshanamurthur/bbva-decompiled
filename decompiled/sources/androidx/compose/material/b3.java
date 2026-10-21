package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import h0.l3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$TabRow$2$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,517:1\n1549#2:518\n1620#2,3:519\n1963#2,14:522\n92#3:536\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$TabRow$2$1$1\n*L\n156#1:518\n156#1:519,3\n160#1:522,14\n163#1:536\n*E\n"})
public final class b3 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f8390p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f8391q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f8392r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f8393s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(int i10, Function2 function2, Function2 function3, Function3 function4) {
        super(2);
        this.f8390p0 = function2;
        this.f8391q0 = function3;
        this.f8392r0 = function4;
        this.f8393s0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        Object next;
        SubcomposeMeasureScope SubcomposeLayout = subcomposeMeasureScope;
        long f18296a = constraints.getF18296a();
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int iM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(f18296a);
        List<Measurable> listSubcompose = SubcomposeLayout.subcompose(l3.Tabs, this.f8390p0);
        int size = listSubcompose.size();
        int i10 = iM4357getMaxWidthimpl / size;
        List<Measurable> list = listSubcompose;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i11 = iM4357getMaxWidthimpl;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(((Measurable) it.next()).mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(f18296a, i10, i10, 0, 0, 12, null)));
            arrayList = arrayList2;
            iM4357getMaxWidthimpl = i11;
        }
        int i12 = iM4357getMaxWidthimpl;
        ArrayList arrayList3 = arrayList;
        Iterator it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int height = ((Placeable) next).getHeight();
                do {
                    Object next2 = it2.next();
                    int height2 = ((Placeable) next2).getHeight();
                    if (height < height2) {
                        next = next2;
                        height = height2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Placeable placeable = (Placeable) next;
        int height3 = placeable != null ? placeable.getHeight() : 0;
        ArrayList arrayList4 = new ArrayList(size);
        for (int i13 = 0; i13 < size; i13++) {
            arrayList4.add(new TabPosition(Dp.m4389constructorimpl(SubcomposeLayout.mo406toDpu2uoSUM(i10) * i13), SubcomposeLayout.mo406toDpu2uoSUM(i10), null));
        }
        return MeasureScope.CC.q(SubcomposeLayout, i12, height3, null, new a3(arrayList3, SubcomposeLayout, this.f8391q0, i10, f18296a, height3, this.f8392r0, arrayList4, this.f8393s0, i12), 4, null);
    }
}
