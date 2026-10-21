package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRow$2$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,505:1\n1789#2,3:506\n1549#2:509\n1620#2,3:510\n92#3:513\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRow$2$1$1\n*L\n156#1:506,3\n160#1:509\n160#1:510,3\n172#1:513\n*E\n"})
public final class b4 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f12694p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f12695q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f12696r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f12697s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(int i10, Function2 function2, Function2 function3, Function3 function4) {
        super(2);
        this.f12694p0 = function2;
        this.f12695q0 = function3;
        this.f12696r0 = function4;
        this.f12697s0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        SubcomposeMeasureScope SubcomposeLayout = subcomposeMeasureScope;
        long f18296a = constraints.getF18296a();
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int iM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(f18296a);
        List<Measurable> listSubcompose = SubcomposeLayout.subcompose(l0.m4.Tabs, this.f12694p0);
        int size = listSubcompose.size();
        Ref.IntRef intRef = new Ref.IntRef();
        if (size > 0) {
            intRef.element = iM4357getMaxWidthimpl / size;
        }
        List<Measurable> list = listSubcompose;
        Iterator<T> it = list.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(((Measurable) it.next()).maxIntrinsicHeight(intRef.element), iMax);
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Measurable measurable : list) {
            int i10 = intRef.element;
            int i11 = iM4357getMaxWidthimpl;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(measurable.mo3575measureBRTryo0(Constraints.m4348copyZbe2FdA(f18296a, i10, i10, iMax, iMax)));
            arrayList = arrayList2;
            iM4357getMaxWidthimpl = i11;
        }
        int i12 = iM4357getMaxWidthimpl;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = new ArrayList(size);
        for (int i13 = 0; i13 < size; i13++) {
            arrayList4.add(new TabPosition(Dp.m4389constructorimpl(SubcomposeLayout.mo406toDpu2uoSUM(intRef.element) * i13), SubcomposeLayout.mo406toDpu2uoSUM(intRef.element), null));
        }
        return MeasureScope.CC.q(SubcomposeLayout, i12, iMax, null, new a4(arrayList3, SubcomposeLayout, this.f12695q0, intRef, f18296a, iMax, this.f12696r0, arrayList4, this.f12697s0, i12), 4, null);
    }
}
