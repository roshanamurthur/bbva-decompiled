package h0;

import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,748:1\n33#2,6:749\n33#2,6:755\n33#2,6:761\n33#2,6:767\n33#2,6:773\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$1\n*L\n659#1:749,6\n660#1:755,6\n661#1:761,6\n662#1:767,6\n663#1:773,6\n*E\n"})
public final class y extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public final /* synthetic */ int E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ List<Placeable> f69215p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ List<Placeable> f69216q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ List<Placeable> f69217r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ List<Placeable> f69218s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ List<Placeable> f69219t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ int f69220u0;
    public final /* synthetic */ int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ int f69221w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ int f69222x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ int f69223y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, int i10, int i11, int i12, int i13, int i14, int i15) {
        super(1);
        this.f69215p0 = arrayList;
        this.f69216q0 = arrayList2;
        this.f69217r0 = arrayList3;
        this.f69218s0 = arrayList4;
        this.f69219t0 = arrayList5;
        this.f69220u0 = i10;
        this.v0 = i11;
        this.f69221w0 = i12;
        this.f69222x0 = i13;
        this.f69223y0 = i14;
        this.E0 = i15;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope layout = placementScope;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        int i10 = this.f69220u0;
        List<Placeable> list = this.f69215p0;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Placeable.PlacementScope.placeRelative$default(layout, list.get(i11), 0, i10, 0.0f, 4, null);
        }
        List<Placeable> list2 = this.f69216q0;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                Placeable.PlacementScope.placeRelative$default(layout, list2.get(i12), 0, 0, 0.0f, 4, null);
            }
        }
        int i13 = this.v0;
        List<Placeable> list3 = this.f69217r0;
        int size3 = list3.size();
        for (int i14 = 0; i14 < size3; i14++) {
            Placeable.PlacementScope.placeRelative$default(layout, list3.get(i14), 0, i13, 0.0f, 4, null);
        }
        List<Placeable> list4 = this.f69218s0;
        if (list4 != null) {
            int i15 = this.f69221w0;
            int i16 = this.f69222x0;
            int size4 = list4.size();
            for (int i17 = 0; i17 < size4; i17++) {
                Placeable.PlacementScope.placeRelative$default(layout, list4.get(i17), i15, i16, 0.0f, 4, null);
            }
        }
        int i18 = this.f69223y0;
        int i19 = this.E0;
        List<Placeable> list5 = this.f69219t0;
        int size5 = list5.size();
        for (int i20 = 0; i20 < size5; i20++) {
            Placeable.PlacementScope.placeRelative$default(layout, list5.get(i20), i18, i19, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}
