package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RootMeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/compose/ui/layout/RootMeasurePolicy;", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "()V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRootMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,67:1\n151#2,3:68\n33#2,4:71\n154#2,2:75\n38#2:77\n156#2:78\n33#2,6:79\n*S KotlinDebug\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy\n*L\n47#1:68,3\n47#1:71,4\n47#1:75,2\n47#1:77\n47#1:78\n52#1:79,6\n*E\n"})
public final class RootMeasurePolicy extends LayoutNode.NoIntrinsicsMeasurePolicy {

    @NotNull
    public static final RootMeasurePolicy INSTANCE = new RootMeasurePolicy();

    /* JADX INFO: compiled from: RootMeasurePolicy.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f16656p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: RootMeasurePolicy.kt */
    public static final class b extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f16657p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Placeable placeable) {
            super(1);
            this.f16657p0 = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.placeRelativeWithLayer$default(layout, this.f16657p0, 0, 0, 0.0f, null, 12, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: RootMeasurePolicy.kt */
    @SourceDebugExtension({"SMAP\nRootMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy$measure$4\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,67:1\n33#2,6:68\n*S KotlinDebug\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy$measure$4\n*L\n60#1:68,6\n*E\n"})
    public static final class c extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ List<Placeable> f16658p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ArrayList arrayList) {
            super(1);
            this.f16658p0 = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            List<Placeable> list = this.f16658p0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Placeable.PlacementScope.placeRelativeWithLayer$default(layout, list.get(i10), 0, 0, 0.0f, null, 12, null);
            }
            return Unit.INSTANCE;
        }
    }

    public RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo113measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        if (measurables.isEmpty()) {
            return MeasureScope.CC.q(measure, Constraints.m4359getMinWidthimpl(j10), Constraints.m4358getMinHeightimpl(j10), null, a.f16656p0, 4, null);
        }
        if (measurables.size() == 1) {
            Placeable placeableMo3575measureBRTryo0 = measurables.get(0).mo3575measureBRTryo0(j10);
            return MeasureScope.CC.q(measure, ConstraintsKt.m4371constrainWidthK40F9xA(j10, placeableMo3575measureBRTryo0.getWidth()), ConstraintsKt.m4370constrainHeightK40F9xA(j10, placeableMo3575measureBRTryo0.getHeight()), null, new b(placeableMo3575measureBRTryo0), 4, null);
        }
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(measurables.get(i10).mo3575measureBRTryo0(j10));
        }
        int size2 = arrayList.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i11 = 0; i11 < size2; i11++) {
            Placeable placeable = (Placeable) arrayList.get(i11);
            iMax = Math.max(placeable.getWidth(), iMax);
            iMax2 = Math.max(placeable.getHeight(), iMax2);
        }
        return MeasureScope.CC.q(measure, ConstraintsKt.m4371constrainWidthK40F9xA(j10, iMax), ConstraintsKt.m4370constrainHeightK40F9xA(j10, iMax2), null, new c(arrayList), 4, null);
    }
}
