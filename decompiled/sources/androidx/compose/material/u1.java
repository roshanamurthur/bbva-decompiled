package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt$ScaffoldLayout$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,375:1\n151#2,3:376\n33#2,4:379\n154#2,2:383\n38#2:385\n156#2:386\n171#2,13:387\n151#2,3:400\n33#2,4:403\n154#2,2:407\n38#2:409\n156#2:410\n171#2,13:411\n151#2,3:424\n33#2,4:427\n154#2,2:431\n38#2:433\n156#2:434\n171#2,13:435\n171#2,13:448\n151#2,3:461\n33#2,4:464\n154#2,2:468\n38#2:470\n156#2:471\n171#2,13:472\n151#2,3:485\n33#2,4:488\n154#2,2:492\n38#2:494\n156#2:495\n33#2,6:496\n33#2,6:502\n33#2,6:508\n33#2,6:514\n33#2,6:520\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt$ScaffoldLayout$1$1$1\n*L\n244#1:376,3\n244#1:379,4\n244#1:383,2\n244#1:385\n244#1:386\n248#1:387,13\n250#1:400,3\n250#1:403,4\n250#1:407,2\n250#1:409\n250#1:410\n254#1:411,13\n257#1:424,3\n257#1:427,4\n257#1:431,2\n257#1:433\n257#1:434\n262#1:435,13\n263#1:448,13\n294#1:461,3\n294#1:464,4\n294#1:468,2\n294#1:470\n294#1:471\n296#1:472,13\n323#1:485,3\n323#1:488,4\n323#1:492,2\n323#1:494\n323#1:495\n327#1:496,6\n330#1:502,6\n333#1:508,6\n337#1:514,6\n341#1:520,6\n*E\n"})
public final class u1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public final /* synthetic */ int E0;
    public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SubcomposeMeasureScope f9036p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f9037q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f9038r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f9039s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f9040t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ int f9041u0;
    public final /* synthetic */ boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ int f9042w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ long f9043x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f9044y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u1(SubcomposeMeasureScope subcomposeMeasureScope, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, int i10, int i11, boolean z10, int i12, long j10, Function2<? super Composer, ? super Integer, Unit> function5, int i13, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function6) {
        super(1);
        this.f9036p0 = subcomposeMeasureScope;
        this.f9037q0 = function2;
        this.f9038r0 = function3;
        this.f9039s0 = function4;
        this.f9040t0 = i10;
        this.f9041u0 = i11;
        this.v0 = z10;
        this.f9042w0 = i12;
        this.f9043x0 = j10;
        this.f9044y0 = function5;
        this.E0 = i13;
        this.F0 = function6;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01b8  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Placeable.PlacementScope placementScope) {
        long j10;
        Object obj;
        Object obj2;
        FabPlacement fabPlacement;
        Object obj3;
        Integer numValueOf;
        int height;
        int iMo413roundToPx0680j_4;
        int height2;
        Object obj4;
        Object obj5;
        Placeable.PlacementScope layout = placementScope;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        h0.j2 j2Var = h0.j2.TopBar;
        SubcomposeMeasureScope subcomposeMeasureScope = this.f9036p0;
        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(j2Var, this.f9037q0);
        ArrayList arrayList = new ArrayList(listSubcompose.size());
        int size = listSubcompose.size();
        int i10 = 0;
        while (true) {
            j10 = this.f9043x0;
            if (i10 >= size) {
                break;
            }
            arrayList.add(listSubcompose.get(i10).mo3575measureBRTryo0(j10));
            i10++;
        }
        int i11 = 1;
        if (!arrayList.isEmpty()) {
            obj = arrayList.get(0);
            int height3 = ((Placeable) obj).getHeight();
            int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
            if (1 <= lastIndex) {
                int i12 = 1;
                while (true) {
                    Object obj6 = arrayList.get(i12);
                    int height4 = ((Placeable) obj6).getHeight();
                    if (height3 < height4) {
                        obj = obj6;
                        height3 = height4;
                    }
                    if (i12 == lastIndex) {
                        break;
                    }
                    i12++;
                }
            }
        } else {
            obj = null;
        }
        Placeable placeable = (Placeable) obj;
        int height5 = placeable != null ? placeable.getHeight() : 0;
        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(h0.j2.Snackbar, this.f9038r0);
        ArrayList arrayList2 = new ArrayList(listSubcompose2.size());
        int size2 = listSubcompose2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            arrayList2.add(listSubcompose2.get(i13).mo3575measureBRTryo0(j10));
        }
        if (!arrayList2.isEmpty()) {
            obj2 = arrayList2.get(0);
            int height6 = ((Placeable) obj2).getHeight();
            int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
            if (1 <= lastIndex2) {
                int i14 = 1;
                while (true) {
                    Object obj7 = arrayList2.get(i14);
                    int height7 = ((Placeable) obj7).getHeight();
                    if (height6 < height7) {
                        height6 = height7;
                        obj2 = obj7;
                    }
                    if (i14 == lastIndex2) {
                        break;
                    }
                    i14++;
                }
            }
        } else {
            obj2 = null;
        }
        Placeable placeable2 = (Placeable) obj2;
        int height8 = placeable2 != null ? placeable2.getHeight() : 0;
        List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(h0.j2.Fab, this.f9039s0);
        ArrayList arrayList3 = new ArrayList(listSubcompose3.size());
        int size3 = listSubcompose3.size();
        for (int i15 = 0; i15 < size3; i15++) {
            arrayList3.add(listSubcompose3.get(i15).mo3575measureBRTryo0(j10));
        }
        boolean z10 = !arrayList3.isEmpty();
        boolean z11 = this.v0;
        if (z10) {
            if (!arrayList3.isEmpty()) {
                obj4 = arrayList3.get(0);
                int width = ((Placeable) obj4).getWidth();
                int lastIndex3 = CollectionsKt__CollectionsKt.getLastIndex(arrayList3);
                if (1 <= lastIndex3) {
                    while (true) {
                        Object obj8 = arrayList3.get(i11);
                        int width2 = ((Placeable) obj8).getWidth();
                        if (width < width2) {
                            width = width2;
                            obj4 = obj8;
                        }
                        if (i11 == lastIndex3) {
                            break;
                        }
                        i11++;
                    }
                }
            } else {
                obj4 = null;
            }
            Placeable placeable3 = (Placeable) obj4;
            int width3 = placeable3 != null ? placeable3.getWidth() : 0;
            if (!arrayList3.isEmpty()) {
                obj5 = arrayList3.get(0);
                int height9 = ((Placeable) obj5).getHeight();
                int lastIndex4 = CollectionsKt__CollectionsKt.getLastIndex(arrayList3);
                if (1 <= lastIndex4) {
                    int i16 = 1;
                    while (true) {
                        Object obj9 = arrayList3.get(i16);
                        Object obj10 = obj5;
                        int height10 = ((Placeable) obj9).getHeight();
                        if (height9 < height10) {
                            height9 = height10;
                            obj5 = obj9;
                        } else {
                            obj5 = obj10;
                        }
                        if (i16 == lastIndex4) {
                            break;
                        }
                        i16++;
                    }
                }
            } else {
                obj5 = null;
            }
            Placeable placeable4 = (Placeable) obj5;
            int height11 = placeable4 != null ? placeable4.getHeight() : 0;
            if (width3 == 0 || height11 == 0) {
                fabPlacement = null;
            } else {
                boolean zM767equalsimpl0 = FabPosition.m767equalsimpl0(this.f9040t0, FabPosition.INSTANCE.m772getEnd5ygKITE());
                int i17 = this.f9041u0;
                fabPlacement = new FabPlacement(z11, zM767equalsimpl0 ? subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr ? (i17 - subcomposeMeasureScope.mo413roundToPx0680j_4(ScaffoldKt.f7583b)) - width3 : subcomposeMeasureScope.mo413roundToPx0680j_4(ScaffoldKt.f7583b) : (i17 - width3) / 2, width3, height11);
            }
        } else {
            fabPlacement = null;
        }
        h0.j2 j2Var2 = h0.j2.BottomBar;
        Function2<Composer, Integer, Unit> function2 = this.f9044y0;
        int i18 = this.E0;
        ArrayList arrayList4 = arrayList3;
        List<Measurable> listSubcompose4 = subcomposeMeasureScope.subcompose(j2Var2, ComposableLambdaKt.composableLambdaInstance(1529070963, true, new h0.g2(fabPlacement, function2, i18)));
        ArrayList arrayList5 = new ArrayList(listSubcompose4.size());
        int size4 = listSubcompose4.size();
        int i19 = 0;
        while (i19 < size4) {
            arrayList5.add(listSubcompose4.get(i19).mo3575measureBRTryo0(j10));
            i19++;
            listSubcompose4 = listSubcompose4;
        }
        if (!arrayList5.isEmpty()) {
            obj3 = arrayList5.get(0);
            int height12 = ((Placeable) obj3).getHeight();
            int lastIndex5 = CollectionsKt__CollectionsKt.getLastIndex(arrayList5);
            if (1 <= lastIndex5) {
                int i20 = 1;
                while (true) {
                    Object obj11 = arrayList5.get(i20);
                    int height13 = ((Placeable) obj11).getHeight();
                    if (height12 < height13) {
                        height12 = height13;
                        obj3 = obj11;
                    }
                    if (i20 == lastIndex5) {
                        break;
                    }
                    i20++;
                }
            }
        } else {
            obj3 = null;
        }
        Placeable placeable5 = (Placeable) obj3;
        int height14 = placeable5 != null ? placeable5.getHeight() : 0;
        if (fabPlacement != null) {
            if (height14 == 0) {
                height = fabPlacement.getHeight();
                iMo413roundToPx0680j_4 = subcomposeMeasureScope.mo413roundToPx0680j_4(ScaffoldKt.f7583b);
            } else {
                if (z11) {
                    height2 = (fabPlacement.getHeight() / 2) + height14;
                } else {
                    height = fabPlacement.getHeight() + height14;
                    iMo413roundToPx0680j_4 = subcomposeMeasureScope.mo413roundToPx0680j_4(ScaffoldKt.f7583b);
                }
                numValueOf = Integer.valueOf(height2);
            }
            height2 = iMo413roundToPx0680j_4 + height;
            numValueOf = Integer.valueOf(height2);
        } else {
            numValueOf = null;
        }
        int iIntValue = height8 != 0 ? height8 + (numValueOf != null ? numValueOf.intValue() : height14) : 0;
        int i21 = this.f9042w0;
        int i22 = i21 - height5;
        List<Measurable> listSubcompose5 = subcomposeMeasureScope.subcompose(h0.j2.MainContent, ComposableLambdaKt.composableLambdaInstance(-1132241596, true, new h0.f2(subcomposeMeasureScope, height14, this.F0, i18)));
        long j11 = this.f9043x0;
        ArrayList arrayList6 = new ArrayList(listSubcompose5.size());
        int size5 = listSubcompose5.size();
        int i23 = 0;
        while (i23 < size5) {
            arrayList6.add(listSubcompose5.get(i23).mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(j11, 0, 0, 0, i22, 7, null)));
            i23++;
            i22 = i22;
            listSubcompose5 = listSubcompose5;
        }
        int size6 = arrayList6.size();
        int i24 = 0;
        while (i24 < size6) {
            Placeable.PlacementScope.place$default(layout, (Placeable) arrayList6.get(i24), 0, height5, 0.0f, 4, null);
            i24++;
            i21 = i21;
        }
        int i25 = i21;
        int size7 = arrayList.size();
        for (int i26 = 0; i26 < size7; i26++) {
            Placeable.PlacementScope.place$default(layout, (Placeable) arrayList.get(i26), 0, 0, 0.0f, 4, null);
        }
        int size8 = arrayList2.size();
        for (int i27 = 0; i27 < size8; i27++) {
            Placeable.PlacementScope.place$default(layout, (Placeable) arrayList2.get(i27), 0, i25 - iIntValue, 0.0f, 4, null);
        }
        int size9 = arrayList5.size();
        for (int i28 = 0; i28 < size9; i28++) {
            Placeable.PlacementScope.place$default(layout, (Placeable) arrayList5.get(i28), 0, i25 - height14, 0.0f, 4, null);
        }
        int size10 = arrayList4.size();
        int i29 = 0;
        while (i29 < size10) {
            ArrayList arrayList7 = arrayList4;
            Placeable.PlacementScope.place$default(layout, (Placeable) arrayList7.get(i29), fabPlacement != null ? fabPlacement.getLeft() : 0, i25 - (numValueOf != null ? numValueOf.intValue() : 0), 0.0f, 4, null);
            i29++;
            arrayList4 = arrayList7;
        }
        return Unit.INSTANCE;
    }
}
