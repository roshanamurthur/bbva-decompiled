package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import h0.l3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$TabRow$2$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,517:1\n1864#2,3:518\n1855#2,2:521\n1855#2,2:523\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$TabRow$2$1$1$1\n*L\n167#1:518,3\n171#1:521,2\n178#1:523,2\n*E\n"})
public final class a3 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ List<Placeable> f8370p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ SubcomposeMeasureScope f8371q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f8372r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f8373s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ long f8374t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ int f8375u0;
    public final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ List<TabPosition> f8376w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ int f8377x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ int f8378y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(ArrayList arrayList, SubcomposeMeasureScope subcomposeMeasureScope, Function2 function2, int i10, long j10, int i11, Function3 function3, ArrayList arrayList2, int i12, int i13) {
        super(1);
        this.f8370p0 = arrayList;
        this.f8371q0 = subcomposeMeasureScope;
        this.f8372r0 = function2;
        this.f8373s0 = i10;
        this.f8374t0 = j10;
        this.f8375u0 = i11;
        this.v0 = function3;
        this.f8376w0 = arrayList2;
        this.f8377x0 = i12;
        this.f8378y0 = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Placeable.PlacementScope placementScope) {
        int i10;
        Placeable.PlacementScope layout = placementScope;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        int i11 = 0;
        for (Object obj : this.f8370p0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Placeable.PlacementScope.placeRelative$default(layout, (Placeable) obj, this.f8373s0 * i11, 0, 0.0f, 4, null);
            i11 = i12;
        }
        l3 l3Var = l3.Divider;
        SubcomposeMeasureScope subcomposeMeasureScope = this.f8371q0;
        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(l3Var, this.f8372r0);
        long j10 = this.f8374t0;
        Iterator<T> it = listSubcompose.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i10 = this.f8375u0;
            if (!zHasNext) {
                break;
            }
            Placeable placeableMo3575measureBRTryo0 = ((Measurable) it.next()).mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null));
            Placeable.PlacementScope.placeRelative$default(layout, placeableMo3575measureBRTryo0, 0, i10 - placeableMo3575measureBRTryo0.getHeight(), 0.0f, 4, null);
            j10 = j10;
        }
        Iterator<T> it2 = subcomposeMeasureScope.subcompose(l3.Indicator, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new z2(this.v0, this.f8376w0, this.f8377x0))).iterator();
        while (it2.hasNext()) {
            Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo3575measureBRTryo0(Constraints.INSTANCE.m4365fixedJhjzzOo(this.f8378y0, i10)), 0, 0, 0.0f, 4, null);
            i10 = i10;
        }
        return Unit.INSTANCE;
    }
}
