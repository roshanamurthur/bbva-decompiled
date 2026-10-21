package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x.i0;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001aa\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002*\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0014*\u00020\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u001b\u001a\u00020\u0018*\u0004\u0018\u00010\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u001a\u0010\u001f\u001a\u00020\u001c*\u0004\u0018\u00010\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\"\u001a\u0010\"\u001a\u00020\u001c*\u0004\u0018\u00010\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006#"}, d2 = {"Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "Lkotlin/Function5;", "", "", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "", "arrangement", "Landroidx/compose/ui/unit/Dp;", "arrangementSpacing", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisSize", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "Landroidx/compose/ui/layout/MeasurePolicy;", "rowColumnMeasurePolicy-TDGSqEk", "(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;)Landroidx/compose/ui/layout/MeasurePolicy;", "rowColumnMeasurePolicy", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "Landroidx/compose/foundation/layout/RowColumnParentData;", "getRowColumnParentData", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;", "rowColumnParentData", "", "getWeight", "(Landroidx/compose/foundation/layout/RowColumnParentData;)F", "weight", "", "getFill", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Z", "fill", "getCrossAxisAlignment", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Landroidx/compose/foundation/layout/CrossAxisAlignment;", "isRelative", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,868:1\n33#2,6:869\n33#2,6:875\n33#2,6:881\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n*L\n563#1:869,6\n587#1:875,6\n613#1:881,6\n*E\n"})
public final class RowColumnImplKt {
    public static final Function3 access$MaxIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? i0.f94342g : i0.f94343h;
    }

    public static final Function3 access$MaxIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? i0.f94340e : i0.f94341f;
    }

    public static final Function3 access$MinIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? i0.f94338c : i0.f94339d;
    }

    public static final Function3 access$MinIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? i0.f94336a : i0.f94337b;
    }

    public static final int access$intrinsicSize(List list, Function2 function2, Function2 function3, int i10, int i11, LayoutOrientation layoutOrientation, LayoutOrientation layoutOrientation2) {
        int i12 = 0;
        if (layoutOrientation == layoutOrientation2) {
            int size = list.size();
            float f6 = 0.0f;
            int iMax = 0;
            int i13 = 0;
            while (i12 < size) {
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i12);
                float weight = getWeight(getRowColumnParentData(intrinsicMeasurable));
                int iIntValue = ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(i10))).intValue();
                if (weight == 0.0f) {
                    i13 += iIntValue;
                } else if (weight > 0.0f) {
                    f6 += weight;
                    iMax = Math.max(iMax, mk.c.roundToInt(iIntValue / weight));
                }
                i12++;
            }
            return ((list.size() - 1) * i11) + mk.c.roundToInt(iMax * f6) + i13;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size2 = list.size();
        float f10 = 0.0f;
        int iMax2 = 0;
        for (int i14 = 0; i14 < size2; i14++) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i14);
            float weight2 = getWeight(getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 == 0.0f) {
                int iMin2 = Math.min(((Number) function3.invoke(intrinsicMeasurable2, Integer.MAX_VALUE)).intValue(), i10 - iMin);
                iMin += iMin2;
                iMax2 = Math.max(iMax2, ((Number) function2.invoke(intrinsicMeasurable2, Integer.valueOf(iMin2))).intValue());
            } else if (weight2 > 0.0f) {
                f10 += weight2;
            }
        }
        int iRoundToInt = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : mk.c.roundToInt(Math.max(i10 - iMin, 0) / f10);
        int size3 = list.size();
        while (i12 < size3) {
            IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) list.get(i12);
            float weight3 = getWeight(getRowColumnParentData(intrinsicMeasurable3));
            if (weight3 > 0.0f) {
                iMax2 = Math.max(iMax2, ((Number) function2.invoke(intrinsicMeasurable3, Integer.valueOf(iRoundToInt != Integer.MAX_VALUE ? mk.c.roundToInt(iRoundToInt * weight3) : Integer.MAX_VALUE))).intValue());
            }
            i12++;
        }
        return iMax2;
    }

    @Nullable
    public static final CrossAxisAlignment getCrossAxisAlignment(@Nullable RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getCrossAxisAlignment();
        }
        return null;
    }

    public static final boolean getFill(@Nullable RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getFill();
        }
        return true;
    }

    @Nullable
    public static final RowColumnParentData getRowColumnParentData(@NotNull IntrinsicMeasurable intrinsicMeasurable) {
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "<this>");
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof RowColumnParentData) {
            return (RowColumnParentData) parentData;
        }
        return null;
    }

    public static final float getWeight(@Nullable RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getWeight();
        }
        return 0.0f;
    }

    public static final boolean isRelative(@Nullable RowColumnParentData rowColumnParentData) {
        CrossAxisAlignment crossAxisAlignment = getCrossAxisAlignment(rowColumnParentData);
        if (crossAxisAlignment != null) {
            return crossAxisAlignment.isRelative$foundation_layout_release();
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: rowColumnMeasurePolicy-TDGSqEk, reason: not valid java name */
    public static final MeasurePolicy m313rowColumnMeasurePolicyTDGSqEk(@NotNull final LayoutOrientation orientation, @NotNull final Function5<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], Unit> arrangement, final float f6, @NotNull final SizeMode crossAxisSize, @NotNull final CrossAxisAlignment crossAxisAlignment) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(arrangement, "arrangement");
        Intrinsics.checkNotNullParameter(crossAxisSize, "crossAxisSize");
        Intrinsics.checkNotNullParameter(crossAxisAlignment, "crossAxisAlignment");
        return new MeasurePolicy() { // from class: androidx.compose.foundation.layout.RowColumnImplKt$rowColumnMeasurePolicy$1

            /* JADX INFO: compiled from: RowColumnImpl.kt */
            public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ RowColumnMeasurementHelper f4335p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ RowColumnMeasureHelperResult f4336q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ MeasureScope f4337r0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(RowColumnMeasurementHelper rowColumnMeasurementHelper, RowColumnMeasureHelperResult rowColumnMeasureHelperResult, MeasureScope measureScope) {
                    super(1);
                    this.f4335p0 = rowColumnMeasurementHelper;
                    this.f4336q0 = rowColumnMeasureHelperResult;
                    this.f4337r0 = measureScope;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope layout = placementScope;
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    LayoutDirection layoutDirection = this.f4337r0.getLayoutDirection();
                    this.f4335p0.placeHelper(layout, this.f4336q0, 0, layoutDirection);
                    return Unit.INSTANCE;
                }
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return ((Number) RowColumnImplKt.access$MaxIntrinsicHeightMeasureBlock(orientation).invoke(measurables, Integer.valueOf(i10), Integer.valueOf(intrinsicMeasureScope.mo413roundToPx0680j_4(f6)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return ((Number) RowColumnImplKt.access$MaxIntrinsicWidthMeasureBlock(orientation).invoke(measurables, Integer.valueOf(i10), Integer.valueOf(intrinsicMeasureScope.mo413roundToPx0680j_4(f6)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s */
            public MeasureResult mo113measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j10) {
                int crossAxisSize2;
                int mainAxisSize;
                Intrinsics.checkNotNullParameter(measure, "$this$measure");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                RowColumnMeasurementHelper rowColumnMeasurementHelper = new RowColumnMeasurementHelper(orientation, arrangement, f6, crossAxisSize, crossAxisAlignment, measurables, new Placeable[measurables.size()], null);
                RowColumnMeasureHelperResult rowColumnMeasureHelperResultM315measureWithoutPlacing_EkL_Y = rowColumnMeasurementHelper.m315measureWithoutPlacing_EkL_Y(measure, j10, 0, measurables.size());
                if (orientation == LayoutOrientation.Horizontal) {
                    crossAxisSize2 = rowColumnMeasureHelperResultM315measureWithoutPlacing_EkL_Y.getMainAxisSize();
                    mainAxisSize = rowColumnMeasureHelperResultM315measureWithoutPlacing_EkL_Y.getCrossAxisSize();
                } else {
                    crossAxisSize2 = rowColumnMeasureHelperResultM315measureWithoutPlacing_EkL_Y.getCrossAxisSize();
                    mainAxisSize = rowColumnMeasureHelperResultM315measureWithoutPlacing_EkL_Y.getMainAxisSize();
                }
                return MeasureScope.CC.q(measure, crossAxisSize2, mainAxisSize, null, new a(rowColumnMeasurementHelper, rowColumnMeasureHelperResultM315measureWithoutPlacing_EkL_Y, measure), 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return ((Number) RowColumnImplKt.access$MinIntrinsicHeightMeasureBlock(orientation).invoke(measurables, Integer.valueOf(i10), Integer.valueOf(intrinsicMeasureScope.mo413roundToPx0680j_4(f6)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return ((Number) RowColumnImplKt.access$MinIntrinsicWidthMeasureBlock(orientation).invoke(measurables, Integer.valueOf(i10), Integer.valueOf(intrinsicMeasureScope.mo413roundToPx0680j_4(f6)))).intValue();
            }
        };
    }
}
