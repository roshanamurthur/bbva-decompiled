package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$ScrollableTabRow$2$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,505:1\n1855#2,2:506\n1855#2,2:508\n1855#2,2:510\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$ScrollableTabRow$2$1$1\n*L\n291#1:506,2\n299#1:508,2\n314#1:510,2\n*E\n"})
public final class x3 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public final /* synthetic */ int E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f14374p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ List<Placeable> f14375q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ SubcomposeMeasureScope f14376r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f14377s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ l0.e3 f14378t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ int f14379u0;
    public final /* synthetic */ long v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ int f14380w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ int f14381x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f14382y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(int i10, ArrayList arrayList, SubcomposeMeasureScope subcomposeMeasureScope, Function2 function2, l0.e3 e3Var, int i11, long j10, int i12, int i13, Function3 function3, int i14) {
        super(1);
        this.f14374p0 = i10;
        this.f14375q0 = arrayList;
        this.f14376r0 = subcomposeMeasureScope;
        this.f14377s0 = function2;
        this.f14378t0 = e3Var;
        this.f14379u0 = i11;
        this.v0 = j10;
        this.f14380w0 = i12;
        this.f14381x0 = i13;
        this.f14382y0 = function3;
        this.E0 = i14;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Placeable.PlacementScope placementScope) {
        SubcomposeMeasureScope density;
        int i10;
        Placeable.PlacementScope layout = placementScope;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        ArrayList tabPositions = new ArrayList();
        Iterator<T> it = this.f14375q0.iterator();
        int i11 = this.f14374p0;
        int width = i11;
        while (true) {
            boolean zHasNext = it.hasNext();
            density = this.f14376r0;
            if (!zHasNext) {
                break;
            }
            Placeable placeable = (Placeable) it.next();
            Placeable.PlacementScope.placeRelative$default(layout, placeable, width, 0, 0.0f, 4, null);
            tabPositions.add(new TabPosition(density.mo406toDpu2uoSUM(width), density.mo406toDpu2uoSUM(placeable.getWidth()), null));
            width += placeable.getWidth();
        }
        List<Measurable> listSubcompose = density.subcompose(l0.m4.Divider, this.f14377s0);
        long j10 = this.v0;
        int i12 = this.f14380w0;
        Iterator<T> it2 = listSubcompose.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            i10 = this.f14381x0;
            if (!zHasNext2) {
                break;
            }
            Placeable placeableMo3575measureBRTryo0 = ((Measurable) it2.next()).mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(j10, i12, i12, 0, 0, 8, null));
            Placeable.PlacementScope.placeRelative$default(layout, placeableMo3575measureBRTryo0, 0, i10 - placeableMo3575measureBRTryo0.getHeight(), 0.0f, 4, null);
            j10 = j10;
        }
        Iterator<T> it3 = density.subcompose(l0.m4.Indicator, ComposableLambdaKt.composableLambdaInstance(963343607, true, new w3(this.f14382y0, tabPositions, this.E0))).iterator();
        while (it3.hasNext()) {
            Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it3.next()).mo3575measureBRTryo0(Constraints.INSTANCE.m4365fixedJhjzzOo(this.f14380w0, i10)), 0, 0, 0.0f, 4, null);
            i10 = i10;
        }
        l0.e3 e3Var = this.f14378t0;
        e3Var.getClass();
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
        Integer num = e3Var.f82516c;
        int i13 = this.f14379u0;
        if (num == null || num.intValue() != i13) {
            e3Var.f82516c = Integer.valueOf(i13);
            TabPosition tabPosition = (TabPosition) CollectionsKt___CollectionsKt.getOrNull(tabPositions, i13);
            if (tabPosition != null) {
                int iMo413roundToPx0680j_4 = density.mo413roundToPx0680j_4(((TabPosition) CollectionsKt___CollectionsKt.last((List) tabPositions)).m1351getRightD9Ej5fM()) + i11;
                ScrollState scrollState = e3Var.f82514a;
                int maxValue = iMo413roundToPx0680j_4 - scrollState.getMaxValue();
                int iCoerceIn = kotlin.ranges.c.coerceIn(density.mo413roundToPx0680j_4(tabPosition.getCom.dasnano.vdphotoselfiecapture.api.model.Parameters.DIRECTION.LEFT java.lang.String()) - ((maxValue / 2) - (density.mo413roundToPx0680j_4(tabPosition.getWidth()) / 2)), 0, kotlin.ranges.c.coerceAtLeast(iMo413roundToPx0680j_4 - maxValue, 0));
                if (scrollState.getValue() != iCoerceIn) {
                    BuildersKt__Builders_commonKt.launch$default(e3Var.f82515b, null, null, new l0.d3(e3Var, iCoerceIn, null), 3, null);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
