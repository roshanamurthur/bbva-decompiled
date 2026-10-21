package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$ScrollableTabRow$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,517:1\n1549#2:518\n1620#2,3:519\n1855#2,2:522\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$ScrollableTabRow$2$1\n*L\n266#1:518\n266#1:519,3\n270#1:522,2\n*E\n"})
public final class y2 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ float f9128p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f9129q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f9130r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ h0.l2 f9131s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f9132t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f9133u0;
    public final /* synthetic */ int v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y2(float f6, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, h0.l2 l2Var, int i10, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function4, int i11) {
        super(2);
        this.f9128p0 = f6;
        this.f9129q0 = function2;
        this.f9130r0 = function3;
        this.f9131s0 = l2Var;
        this.f9132t0 = i10;
        this.f9133u0 = function4;
        this.v0 = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        SubcomposeMeasureScope SubcomposeLayout = subcomposeMeasureScope;
        long f18296a = constraints.getF18296a();
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int iMo413roundToPx0680j_4 = SubcomposeLayout.mo413roundToPx0680j_4(TabRowKt.f8098a);
        int iMo413roundToPx0680j_5 = SubcomposeLayout.mo413roundToPx0680j_4(this.f9128p0);
        long jM4349copyZbe2FdA$default = Constraints.m4349copyZbe2FdA$default(f18296a, iMo413roundToPx0680j_4, 0, 0, 0, 14, null);
        List<Measurable> listSubcompose = SubcomposeLayout.subcompose(l3.Tabs, this.f9129q0);
        ArrayList<Placeable> arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSubcompose, 10));
        Iterator<T> it = listSubcompose.iterator();
        while (it.hasNext()) {
            arrayList.add(((Measurable) it.next()).mo3575measureBRTryo0(jM4349copyZbe2FdA$default));
        }
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = iMo413roundToPx0680j_5 * 2;
        Ref.IntRef intRef2 = new Ref.IntRef();
        for (Placeable placeable : arrayList) {
            intRef.element = placeable.getWidth() + intRef.element;
            intRef2.element = Math.max(intRef2.element, placeable.getHeight());
        }
        return MeasureScope.CC.q(SubcomposeLayout, intRef.element, intRef2.element, null, new x2(iMo413roundToPx0680j_5, arrayList, SubcomposeLayout, this.f9130r0, this.f9131s0, this.f9132t0, f18296a, intRef, intRef2, this.f9133u0, this.v0), 4, null);
    }
}
