package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
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
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$ScrollableTabRow$2$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,517:1\n1855#2,2:518\n1855#2,2:520\n1855#2,2:522\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$ScrollableTabRow$2$1$2\n*L\n280#1:518,2\n288#1:520,2\n303#1:522,2\n*E\n"})
public final class x2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public final /* synthetic */ int E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f9102p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ List<Placeable> f9103q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ SubcomposeMeasureScope f9104r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f9105s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ h0.l2 f9106t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ int f9107u0;
    public final /* synthetic */ long v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f9108w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f9109x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f9110y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(int i10, ArrayList arrayList, SubcomposeMeasureScope subcomposeMeasureScope, Function2 function2, h0.l2 l2Var, int i11, long j10, Ref.IntRef intRef, Ref.IntRef intRef2, Function3 function3, int i12) {
        super(1);
        this.f9102p0 = i10;
        this.f9103q0 = arrayList;
        this.f9104r0 = subcomposeMeasureScope;
        this.f9105s0 = function2;
        this.f9106t0 = l2Var;
        this.f9107u0 = i11;
        this.v0 = j10;
        this.f9108w0 = intRef;
        this.f9109x0 = intRef2;
        this.f9110y0 = function3;
        this.E0 = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Placeable.PlacementScope placementScope) {
        SubcomposeMeasureScope density;
        Ref.IntRef intRef;
        Ref.IntRef intRef2;
        Placeable.PlacementScope layout = placementScope;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        ArrayList tabPositions = new ArrayList();
        Iterator<T> it = this.f9103q0.iterator();
        int i10 = this.f9102p0;
        int width = i10;
        while (true) {
            boolean zHasNext = it.hasNext();
            density = this.f9104r0;
            if (!zHasNext) {
                break;
            }
            Placeable placeable = (Placeable) it.next();
            Placeable.PlacementScope.placeRelative$default(layout, placeable, width, 0, 0.0f, 4, null);
            tabPositions.add(new TabPosition(density.mo406toDpu2uoSUM(width), density.mo406toDpu2uoSUM(placeable.getWidth()), null));
            width += placeable.getWidth();
        }
        List<Measurable> listSubcompose = density.subcompose(l3.Divider, this.f9105s0);
        long j10 = this.v0;
        Iterator<T> it2 = listSubcompose.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            intRef = this.f9109x0;
            intRef2 = this.f9108w0;
            if (!zHasNext2) {
                break;
            }
            Measurable measurable = (Measurable) it2.next();
            int i11 = intRef2.element;
            Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(j10, i11, i11, 0, 0, 8, null));
            Placeable.PlacementScope.placeRelative$default(layout, placeableMo3575measureBRTryo0, 0, intRef.element - placeableMo3575measureBRTryo0.getHeight(), 0.0f, 4, null);
            j10 = j10;
        }
        Iterator<T> it3 = density.subcompose(l3.Indicator, ComposableLambdaKt.composableLambdaInstance(230769237, true, new w2(this.f9110y0, tabPositions, this.E0))).iterator();
        while (it3.hasNext()) {
            Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it3.next()).mo3575measureBRTryo0(Constraints.INSTANCE.m4365fixedJhjzzOo(intRef2.element, intRef.element)), 0, 0, 0.0f, 4, null);
        }
        h0.l2 l2Var = this.f9106t0;
        l2Var.getClass();
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
        Integer num = l2Var.f68896c;
        int i12 = this.f9107u0;
        if (num == null || num.intValue() != i12) {
            l2Var.f68896c = Integer.valueOf(i12);
            TabPosition tabPosition = (TabPosition) CollectionsKt___CollectionsKt.getOrNull(tabPositions, i12);
            if (tabPosition != null) {
                int iMo413roundToPx0680j_4 = density.mo413roundToPx0680j_4(((TabPosition) CollectionsKt___CollectionsKt.last((List) tabPositions)).m850getRightD9Ej5fM()) + i10;
                ScrollState scrollState = l2Var.f68894a;
                int maxValue = iMo413roundToPx0680j_4 - scrollState.getMaxValue();
                int iCoerceIn = kotlin.ranges.c.coerceIn(density.mo413roundToPx0680j_4(tabPosition.getCom.dasnano.vdphotoselfiecapture.api.model.Parameters.DIRECTION.LEFT java.lang.String()) - ((maxValue / 2) - (density.mo413roundToPx0680j_4(tabPosition.getWidth()) / 2)), 0, kotlin.ranges.c.coerceAtLeast(iMo413roundToPx0680j_4 - maxValue, 0));
                if (scrollState.getValue() != iCoerceIn) {
                    BuildersKt__Builders_commonKt.launch$default(l2Var.f68895b, null, null, new h0.k2(l2Var, iCoerceIn, null), 3, null);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
