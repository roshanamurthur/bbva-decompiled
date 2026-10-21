package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayout$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1549#2:335\n1620#2,3:336\n1963#2,14:339\n1549#2:353\n1620#2,3:354\n1963#2,14:357\n1963#2,14:371\n1603#2,9:385\n1855#2:394\n1856#2:397\n1612#2:398\n1963#2,14:399\n1963#2,14:413\n1549#2:427\n1620#2,3:428\n1963#2,14:431\n1549#2:445\n1620#2,3:446\n1855#2,2:449\n1855#2,2:451\n1855#2,2:453\n1855#2,2:455\n1855#2,2:457\n1#3:395\n1#3:396\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayout$1$1$1\n*L\n129#1:335\n129#1:336,3\n133#1:339,14\n135#1:353\n135#1:354,3\n151#1:357,14\n152#1:371,14\n155#1:385,9\n155#1:394\n155#1:397\n155#1:398\n172#1:399,14\n173#1:413,14\n199#1:427\n199#1:428,3\n201#1:431,14\n240#1:445\n240#1:446,3\n244#1:449,2\n247#1:451,2\n250#1:453,2\n258#1:455,2\n263#1:457,2\n155#1:396\n*E\n"})
public final class d3 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> E0;
    public final /* synthetic */ int F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SubcomposeMeasureScope f12754p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f12755q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f12756r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f12757s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f12758t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ int f12759u0;
    public final /* synthetic */ WindowInsets v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ long f12760w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f12761x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ int f12762y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d3(SubcomposeMeasureScope subcomposeMeasureScope, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, int i10, int i11, WindowInsets windowInsets, long j10, Function2<? super Composer, ? super Integer, Unit> function5, int i12, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function6, int i13) {
        super(1);
        this.f12754p0 = subcomposeMeasureScope;
        this.f12755q0 = function2;
        this.f12756r0 = function3;
        this.f12757s0 = function4;
        this.f12758t0 = i10;
        this.f12759u0 = i11;
        this.v0 = windowInsets;
        this.f12760w0 = j10;
        this.f12761x0 = function5;
        this.f12762y0 = i12;
        this.E0 = function6;
        this.F0 = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Placeable.PlacementScope placementScope) {
        long j10;
        Object next;
        WindowInsets windowInsets;
        Object next2;
        Object next3;
        FabPlacement fabPlacement;
        Object next4;
        Integer numValueOf;
        int iIntValue;
        int i10;
        int height;
        int iMo413roundToPx0680j_4;
        Object next5;
        Object next6;
        d3 d3Var = this;
        Placeable.PlacementScope layout = placementScope;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        l0.c3 c3Var = l0.c3.TopBar;
        Function2<Composer, Integer, Unit> function2 = d3Var.f12755q0;
        SubcomposeMeasureScope subcomposeMeasureScope = d3Var.f12754p0;
        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(c3Var, function2);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSubcompose, 10));
        Iterator<T> it = listSubcompose.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            j10 = d3Var.f12760w0;
            if (!zHasNext) {
                break;
            }
            arrayList.add(((Measurable) it.next()).mo3575measureBRTryo0(j10));
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int height2 = ((Placeable) next).getHeight();
                while (true) {
                    Object next7 = it2.next();
                    int height3 = ((Placeable) next7).getHeight();
                    if (height2 < height3) {
                        next = next7;
                        height2 = height3;
                    }
                    if (!it2.hasNext()) {
                        break;
                    }
                    d3Var = this;
                }
            }
        } else {
            next = null;
        }
        Placeable placeable = (Placeable) next;
        int height4 = placeable != null ? placeable.getHeight() : 0;
        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(l0.c3.Snackbar, d3Var.f12756r0);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSubcompose2, 10));
        Iterator<T> it3 = listSubcompose2.iterator();
        while (true) {
            boolean zHasNext2 = it3.hasNext();
            windowInsets = d3Var.v0;
            if (!zHasNext2) {
                break;
            }
            arrayList2.add(((Measurable) it3.next()).mo3575measureBRTryo0(ConstraintsKt.m4373offsetNN6EwU(j10, (-windowInsets.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets.getBottom(subcomposeMeasureScope))));
        }
        Iterator it4 = arrayList2.iterator();
        if (it4.hasNext()) {
            next2 = it4.next();
            if (it4.hasNext()) {
                int height5 = ((Placeable) next2).getHeight();
                while (true) {
                    Object next8 = it4.next();
                    int height6 = ((Placeable) next8).getHeight();
                    if (height5 < height6) {
                        next2 = next8;
                        height5 = height6;
                    }
                    if (!it4.hasNext()) {
                        break;
                    }
                    d3Var = this;
                }
            }
        } else {
            next2 = null;
        }
        Placeable placeable2 = (Placeable) next2;
        int height7 = placeable2 != null ? placeable2.getHeight() : 0;
        Iterator it5 = arrayList2.iterator();
        if (it5.hasNext()) {
            next3 = it5.next();
            if (it5.hasNext()) {
                int width = ((Placeable) next3).getWidth();
                while (true) {
                    Object next9 = it5.next();
                    int width2 = ((Placeable) next9).getWidth();
                    if (width < width2) {
                        width = width2;
                        next3 = next9;
                    }
                    if (!it5.hasNext()) {
                        break;
                    }
                    d3Var = this;
                }
            }
        } else {
            next3 = null;
        }
        Placeable placeable3 = (Placeable) next3;
        int width3 = placeable3 != null ? placeable3.getWidth() : 0;
        List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(l0.c3.Fab, d3Var.f12757s0);
        ArrayList<Placeable> arrayList3 = new ArrayList();
        Iterator it6 = listSubcompose3.iterator();
        while (it6.hasNext()) {
            Iterator it7 = it6;
            Placeable placeableMo3575measureBRTryo0 = ((Measurable) it6.next()).mo3575measureBRTryo0(ConstraintsKt.m4373offsetNN6EwU(j10, (-windowInsets.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets.getBottom(subcomposeMeasureScope)));
            if (placeableMo3575measureBRTryo0.getHeight() == 0 || placeableMo3575measureBRTryo0.getWidth() == 0) {
                placeableMo3575measureBRTryo0 = null;
            }
            if (placeableMo3575measureBRTryo0 != null) {
                arrayList3.add(placeableMo3575measureBRTryo0);
            }
            it6 = it7;
        }
        boolean z10 = !arrayList3.isEmpty();
        int i11 = d3Var.f12759u0;
        if (z10) {
            Iterator it8 = arrayList3.iterator();
            if (it8.hasNext()) {
                next5 = it8.next();
                if (it8.hasNext()) {
                    int width4 = ((Placeable) next5).getWidth();
                    do {
                        Object next10 = it8.next();
                        int width5 = ((Placeable) next10).getWidth();
                        if (width4 < width5) {
                            width4 = width5;
                            next5 = next10;
                        }
                    } while (it8.hasNext());
                }
            } else {
                next5 = null;
            }
            Intrinsics.checkNotNull(next5);
            int width6 = ((Placeable) next5).getWidth();
            Iterator it9 = arrayList3.iterator();
            if (it9.hasNext()) {
                next6 = it9.next();
                if (it9.hasNext()) {
                    int height8 = ((Placeable) next6).getHeight();
                    do {
                        Object next11 = it9.next();
                        Object obj = next6;
                        int height9 = ((Placeable) next11).getHeight();
                        if (height8 < height9) {
                            height8 = height9;
                            next6 = next11;
                        } else {
                            next6 = obj;
                        }
                    } while (it9.hasNext());
                }
            } else {
                next6 = null;
            }
            Intrinsics.checkNotNull(next6);
            int height10 = ((Placeable) next6).getHeight();
            fabPlacement = new FabPlacement(FabPosition.m1105equalsimpl0(d3Var.f12758t0, FabPosition.INSTANCE.m1110getEndERTFSPs()) ? subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr ? (i11 - subcomposeMeasureScope.mo413roundToPx0680j_4(ScaffoldKt.f11141b)) - width6 : subcomposeMeasureScope.mo413roundToPx0680j_4(ScaffoldKt.f11141b) : (i11 - width6) / 2, width6, height10);
        } else {
            fabPlacement = null;
        }
        List<Measurable> listSubcompose4 = subcomposeMeasureScope.subcompose(l0.c3.BottomBar, ComposableLambdaKt.composableLambdaInstance(-1455477816, true, new l0.z2(fabPlacement, d3Var.f12761x0, d3Var.f12762y0)));
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSubcompose4, 10));
        Iterator<T> it10 = listSubcompose4.iterator();
        while (it10.hasNext()) {
            arrayList4.add(((Measurable) it10.next()).mo3575measureBRTryo0(j10));
        }
        Iterator it11 = arrayList4.iterator();
        if (it11.hasNext()) {
            next4 = it11.next();
            if (it11.hasNext()) {
                int height11 = ((Placeable) next4).getHeight();
                while (true) {
                    Object next12 = it11.next();
                    Object obj2 = next4;
                    int height12 = ((Placeable) next12).getHeight();
                    if (height11 < height12) {
                        height11 = height12;
                        next4 = next12;
                    } else {
                        next4 = obj2;
                    }
                    if (!it11.hasNext()) {
                        break;
                    }
                    windowInsets = windowInsets;
                    arrayList = arrayList;
                    subcomposeMeasureScope = subcomposeMeasureScope;
                    d3Var = d3Var;
                    i11 = i11;
                }
            }
        } else {
            next4 = null;
        }
        Placeable placeable4 = (Placeable) next4;
        Integer numValueOf2 = placeable4 != null ? Integer.valueOf(placeable4.getHeight()) : null;
        if (fabPlacement != null) {
            if (numValueOf2 == null) {
                height = subcomposeMeasureScope.mo413roundToPx0680j_4(ScaffoldKt.f11141b) + fabPlacement.getHeight();
                iMo413roundToPx0680j_4 = windowInsets.getBottom(subcomposeMeasureScope);
            } else {
                height = fabPlacement.getHeight() + numValueOf2.intValue();
                iMo413roundToPx0680j_4 = subcomposeMeasureScope.mo413roundToPx0680j_4(ScaffoldKt.f11141b);
            }
            numValueOf = Integer.valueOf(iMo413roundToPx0680j_4 + height);
        } else {
            numValueOf = null;
        }
        if (height7 != 0) {
            iIntValue = height7 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : windowInsets.getBottom(subcomposeMeasureScope));
        } else {
            iIntValue = 0;
        }
        SubcomposeMeasureScope subcomposeMeasureScope2 = d3Var.f12754p0;
        FabPlacement fabPlacement2 = fabPlacement;
        SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
        int i12 = i11;
        WindowInsets windowInsets2 = windowInsets;
        List<Measurable> listSubcompose5 = subcomposeMeasureScope2.subcompose(l0.c3.MainContent, ComposableLambdaKt.composableLambdaInstance(1643221465, true, new l0.y2(d3Var.v0, subcomposeMeasureScope2, arrayList, height4, arrayList4, numValueOf2, d3Var.E0, d3Var.f12762y0)));
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSubcompose5, 10));
        Iterator<T> it12 = listSubcompose5.iterator();
        while (it12.hasNext()) {
            arrayList5.add(((Measurable) it12.next()).mo3575measureBRTryo0(j10));
        }
        Iterator it13 = arrayList5.iterator();
        while (it13.hasNext()) {
            Placeable.PlacementScope.place$default(layout, (Placeable) it13.next(), 0, 0, 0.0f, 4, null);
            arrayList = arrayList;
            arrayList4 = arrayList4;
        }
        ArrayList arrayList6 = arrayList4;
        Iterator it14 = arrayList.iterator();
        while (it14.hasNext()) {
            Placeable.PlacementScope.place$default(layout, (Placeable) it14.next(), 0, 0, 0.0f, 4, null);
        }
        Iterator it15 = arrayList2.iterator();
        while (true) {
            boolean zHasNext3 = it15.hasNext();
            i10 = this.F0;
            if (!zHasNext3) {
                break;
            }
            Placeable.PlacementScope.place$default(layout, (Placeable) it15.next(), windowInsets2.getLeft(subcomposeMeasureScope3, subcomposeMeasureScope3.getLayoutDirection()) + ((i12 - width3) / 2), i10 - iIntValue, 0.0f, 4, null);
        }
        Iterator it16 = arrayList6.iterator();
        while (it16.hasNext()) {
            Placeable.PlacementScope.place$default(layout, (Placeable) it16.next(), 0, i10 - (numValueOf2 != null ? numValueOf2.intValue() : 0), 0.0f, 4, null);
        }
        if (fabPlacement2 != null) {
            for (Placeable placeable5 : arrayList3) {
                int left = fabPlacement2.getLeft();
                Intrinsics.checkNotNull(numValueOf);
                Placeable.PlacementScope.place$default(layout, placeable5, left, i10 - numValueOf.intValue(), 0.0f, 4, null);
            }
            Unit unit = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
