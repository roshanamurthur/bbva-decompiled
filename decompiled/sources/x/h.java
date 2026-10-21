package x;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AspectRatio.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,235:1\n1#2:236\n*E\n"})
public final class h extends Modifier.Node implements LayoutModifierNode {
    public float H0;
    public boolean I0;

    /* JADX INFO: compiled from: AspectRatio.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f94333p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Placeable placeable) {
            super(1);
            this.f94333p0 = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.placeRelative$default(layout, this.f94333p0, 0, 0, 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    public final long a(long j10, boolean z10) {
        int iRoundToInt;
        int iM4356getMaxHeightimpl = Constraints.m4356getMaxHeightimpl(j10);
        if (iM4356getMaxHeightimpl != Integer.MAX_VALUE && (iRoundToInt = mk.c.roundToInt(iM4356getMaxHeightimpl * this.H0)) > 0) {
            long jIntSize = IntSizeKt.IntSize(iRoundToInt, iM4356getMaxHeightimpl);
            if (!z10 || ConstraintsKt.m4372isSatisfiedBy4WqzIAM(j10, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m4554getZeroYbymL2g();
    }

    public final long b(long j10, boolean z10) {
        int iRoundToInt;
        int iM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(j10);
        if (iM4357getMaxWidthimpl != Integer.MAX_VALUE && (iRoundToInt = mk.c.roundToInt(iM4357getMaxWidthimpl / this.H0)) > 0) {
            long jIntSize = IntSizeKt.IntSize(iM4357getMaxWidthimpl, iRoundToInt);
            if (!z10 || ConstraintsKt.m4372isSatisfiedBy4WqzIAM(j10, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m4554getZeroYbymL2g();
    }

    public final long c(long j10, boolean z10) {
        int iM4358getMinHeightimpl = Constraints.m4358getMinHeightimpl(j10);
        int iRoundToInt = mk.c.roundToInt(iM4358getMinHeightimpl * this.H0);
        if (iRoundToInt > 0) {
            long jIntSize = IntSizeKt.IntSize(iRoundToInt, iM4358getMinHeightimpl);
            if (!z10 || ConstraintsKt.m4372isSatisfiedBy4WqzIAM(j10, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m4554getZeroYbymL2g();
    }

    public final long d(long j10, boolean z10) {
        int iM4359getMinWidthimpl = Constraints.m4359getMinWidthimpl(j10);
        int iRoundToInt = mk.c.roundToInt(iM4359getMinWidthimpl / this.H0);
        if (iRoundToInt > 0) {
            long jIntSize = IntSizeKt.IntSize(iM4359getMinWidthimpl, iRoundToInt);
            if (!z10 || ConstraintsKt.m4372isSatisfiedBy4WqzIAM(j10, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m4554getZeroYbymL2g();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return i10 != Integer.MAX_VALUE ? mk.c.roundToInt(i10 / this.H0) : measurable.maxIntrinsicHeight(i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return i10 != Integer.MAX_VALUE ? mk.c.roundToInt(i10 * this.H0) : measurable.maxIntrinsicWidth(i10);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x010d  */
    @Override // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo172measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        long jA;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (this.I0) {
            jA = a(j10, true);
            IntSize.Companion companion = IntSize.INSTANCE;
            if (IntSize.m4547equalsimpl0(jA, companion.m4554getZeroYbymL2g())) {
                jA = b(j10, true);
                if (IntSize.m4547equalsimpl0(jA, companion.m4554getZeroYbymL2g())) {
                    jA = c(j10, true);
                    if (IntSize.m4547equalsimpl0(jA, companion.m4554getZeroYbymL2g())) {
                        jA = d(j10, true);
                        if (IntSize.m4547equalsimpl0(jA, companion.m4554getZeroYbymL2g())) {
                            jA = a(j10, false);
                            if (IntSize.m4547equalsimpl0(jA, companion.m4554getZeroYbymL2g())) {
                                jA = b(j10, false);
                                if (IntSize.m4547equalsimpl0(jA, companion.m4554getZeroYbymL2g())) {
                                    jA = c(j10, false);
                                    if (IntSize.m4547equalsimpl0(jA, companion.m4554getZeroYbymL2g())) {
                                        jA = d(j10, false);
                                        if (IntSize.m4547equalsimpl0(jA, companion.m4554getZeroYbymL2g())) {
                                            jA = IntSize.INSTANCE.m4554getZeroYbymL2g();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            jA = b(j10, true);
            IntSize.Companion companion2 = IntSize.INSTANCE;
            if (IntSize.m4547equalsimpl0(jA, companion2.m4554getZeroYbymL2g())) {
                jA = a(j10, true);
                if (IntSize.m4547equalsimpl0(jA, companion2.m4554getZeroYbymL2g())) {
                    jA = d(j10, true);
                    if (IntSize.m4547equalsimpl0(jA, companion2.m4554getZeroYbymL2g())) {
                        jA = c(j10, true);
                        if (IntSize.m4547equalsimpl0(jA, companion2.m4554getZeroYbymL2g())) {
                            jA = b(j10, false);
                            if (IntSize.m4547equalsimpl0(jA, companion2.m4554getZeroYbymL2g())) {
                                jA = a(j10, false);
                                if (IntSize.m4547equalsimpl0(jA, companion2.m4554getZeroYbymL2g())) {
                                    jA = d(j10, false);
                                    if (IntSize.m4547equalsimpl0(jA, companion2.m4554getZeroYbymL2g())) {
                                        jA = c(j10, false);
                                        if (IntSize.m4547equalsimpl0(jA, companion2.m4554getZeroYbymL2g())) {
                                            jA = IntSize.INSTANCE.m4554getZeroYbymL2g();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!IntSize.m4547equalsimpl0(jA, IntSize.INSTANCE.m4554getZeroYbymL2g())) {
            j10 = Constraints.INSTANCE.m4365fixedJhjzzOo(IntSize.m4549getWidthimpl(jA), IntSize.m4548getHeightimpl(jA));
        }
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(j10);
        return MeasureScope.CC.q(measure, placeableMo3575measureBRTryo0.getWidth(), placeableMo3575measureBRTryo0.getHeight(), null, new a(placeableMo3575measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return i10 != Integer.MAX_VALUE ? mk.c.roundToInt(i10 / this.H0) : measurable.minIntrinsicHeight(i10);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return i10 != Integer.MAX_VALUE ? mk.c.roundToInt(i10 * this.H0) : measurable.minIntrinsicWidth(i10);
    }
}
