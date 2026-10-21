package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
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
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$ScrollableTabRow$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,505:1\n1789#2,3:506\n1549#2:509\n1620#2,3:510\n1789#2,3:513\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$ScrollableTabRow$2$1\n*L\n270#1:506,3\n280#1:509\n280#1:510,3\n282#1:513,3\n*E\n"})
public final class y3 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ float f14396p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f14397q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f14398r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ l0.e3 f14399s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f14400t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f14401u0;
    public final /* synthetic */ int v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y3(float f6, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, l0.e3 e3Var, int i10, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function4, int i11) {
        super(2);
        this.f14396p0 = f6;
        this.f14397q0 = function2;
        this.f14398r0 = function3;
        this.f14399s0 = e3Var;
        this.f14400t0 = i10;
        this.f14401u0 = function4;
        this.v0 = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        SubcomposeMeasureScope SubcomposeLayout = subcomposeMeasureScope;
        long f18296a = constraints.getF18296a();
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int iMo413roundToPx0680j_4 = SubcomposeLayout.mo413roundToPx0680j_4(TabRowKt.f11993a);
        int iMo413roundToPx0680j_5 = SubcomposeLayout.mo413roundToPx0680j_4(this.f14396p0);
        List<Measurable> listSubcompose = SubcomposeLayout.subcompose(l0.m4.Tabs, this.f14397q0);
        Iterator<T> it = listSubcompose.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((Measurable) it.next()).maxIntrinsicHeight(Integer.MAX_VALUE));
        }
        long jM4349copyZbe2FdA$default = Constraints.m4349copyZbe2FdA$default(f18296a, iMo413roundToPx0680j_4, 0, iMax, iMax, 2, null);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSubcompose, 10));
        Iterator<T> it2 = listSubcompose.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Measurable) it2.next()).mo3575measureBRTryo0(jM4349copyZbe2FdA$default));
        }
        Iterator it3 = arrayList.iterator();
        int width = iMo413roundToPx0680j_5 * 2;
        while (it3.hasNext()) {
            width = ((Placeable) it3.next()).getWidth() + width;
        }
        return MeasureScope.CC.q(SubcomposeLayout, width, iMax, null, new x3(iMo413roundToPx0680j_5, arrayList, SubcomposeLayout, this.f14398r0, this.f14399s0, this.f14400t0, f18296a, width, iMax, this.f14401u0, this.v0), 4, null);
    }
}
