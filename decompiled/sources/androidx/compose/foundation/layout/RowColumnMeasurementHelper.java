package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RowColumnMeasurementHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001Bt\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012*\u0010%\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00160\u001e\u0012\u0006\u0010+\u001a\u00020&\u0012\u0006\u0010\u0005\u001a\u00020,\u0012\u0006\u00106\u001a\u000201\u0012\f\u0010=\u001a\b\u0012\u0004\u0012\u00020807\u0012\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020>ø\u0001\u0001¢\u0006\u0004\bD\u0010EJ\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0002J\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0002J3\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR;\u0010%\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00160\u001e8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010+\u001a\u00020&8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00106\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u000208078\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001f\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006F"}, d2 = {"Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;", "", "Landroidx/compose/ui/layout/Placeable;", "", "mainAxisSize", "crossAxisSize", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Landroidx/compose/ui/unit/Constraints;", "constraints", "startIndex", "endIndex", "Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "measureWithoutPlacing-_EkL_-Y", "(Landroidx/compose/ui/layout/MeasureScope;JII)Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "measureWithoutPlacing", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placeableScope", "measureResult", "crossAxisOffset", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "placeHelper", "Landroidx/compose/foundation/layout/LayoutOrientation;", "a", "Landroidx/compose/foundation/layout/LayoutOrientation;", "getOrientation", "()Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "Lkotlin/Function5;", "", "Landroidx/compose/ui/unit/Density;", "b", "Lkotlin/jvm/functions/Function5;", "getArrangement", "()Lkotlin/jvm/functions/Function5;", "arrangement", "Landroidx/compose/ui/unit/Dp;", "c", "F", "getArrangementSpacing-D9Ej5fM", "()F", "arrangementSpacing", "Landroidx/compose/foundation/layout/SizeMode;", "d", "Landroidx/compose/foundation/layout/SizeMode;", "getCrossAxisSize", "()Landroidx/compose/foundation/layout/SizeMode;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "e", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "", "Landroidx/compose/ui/layout/Measurable;", "f", "Ljava/util/List;", "getMeasurables", "()Ljava/util/List;", "measurables", "", "g", "[Landroidx/compose/ui/layout/Placeable;", "getPlaceables", "()[Landroidx/compose/ui/layout/Placeable;", "placeables", "<init>", "(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRowColumnMeasurementHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnMeasurementHelper.kt\nandroidx/compose/foundation/layout/RowColumnMeasurementHelper\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,331:1\n321#2:332\n321#2:333\n321#2:334\n320#2:335\n323#2:337\n321#2:338\n320#2:339\n323#2:340\n323#2:341\n322#2:342\n1#3:336\n*S KotlinDebug\n*F\n+ 1 RowColumnMeasurementHelper.kt\nandroidx/compose/foundation/layout/RowColumnMeasurementHelper\n*L\n111#1:332\n143#1:333\n144#1:334\n146#1:335\n181#1:337\n191#1:338\n230#1:339\n232#1:340\n235#1:341\n240#1:342\n*E\n"})
public final class RowColumnMeasurementHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LayoutOrientation orientation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function5<Integer, int[], LayoutDirection, Density, int[], Unit> arrangement;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float arrangementSpacing;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SizeMode crossAxisSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CrossAxisAlignment crossAxisAlignment;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Measurable> measurables;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Placeable[] placeables;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final RowColumnParentData[] f4351h;

    public RowColumnMeasurementHelper() {
        throw null;
    }

    public RowColumnMeasurementHelper(LayoutOrientation orientation, Function5 arrangement, float f6, SizeMode crossAxisSize, CrossAxisAlignment crossAxisAlignment, List measurables, Placeable[] placeables, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(arrangement, "arrangement");
        Intrinsics.checkNotNullParameter(crossAxisSize, "crossAxisSize");
        Intrinsics.checkNotNullParameter(crossAxisAlignment, "crossAxisAlignment");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Intrinsics.checkNotNullParameter(placeables, "placeables");
        this.orientation = orientation;
        this.arrangement = arrangement;
        this.arrangementSpacing = f6;
        this.crossAxisSize = crossAxisSize;
        this.crossAxisAlignment = crossAxisAlignment;
        this.measurables = measurables;
        this.placeables = placeables;
        int size = measurables.size();
        RowColumnParentData[] rowColumnParentDataArr = new RowColumnParentData[size];
        for (int i10 = 0; i10 < size; i10++) {
            rowColumnParentDataArr[i10] = RowColumnImplKt.getRowColumnParentData(this.measurables.get(i10));
        }
        this.f4351h = rowColumnParentDataArr;
    }

    public final int crossAxisSize(@NotNull Placeable placeable) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        return this.orientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    @NotNull
    public final Function5<Integer, int[], LayoutDirection, Density, int[], Unit> getArrangement() {
        return this.arrangement;
    }

    /* JADX INFO: renamed from: getArrangementSpacing-D9Ej5fM, reason: not valid java name and from getter */
    public final float getArrangementSpacing() {
        return this.arrangementSpacing;
    }

    @NotNull
    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @NotNull
    public final SizeMode getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @NotNull
    public final List<Measurable> getMeasurables() {
        return this.measurables;
    }

    @NotNull
    public final LayoutOrientation getOrientation() {
        return this.orientation;
    }

    @NotNull
    public final Placeable[] getPlaceables() {
        return this.placeables;
    }

    public final int mainAxisSize(@NotNull Placeable placeable) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        return this.orientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    @NotNull
    /* JADX INFO: renamed from: measureWithoutPlacing-_EkL_-Y, reason: not valid java name */
    public final RowColumnMeasureHelperResult m315measureWithoutPlacing_EkL_Y(@NotNull MeasureScope measureScope, long constraints, int startIndex, int endIndex) {
        List<Measurable> list;
        RowColumnParentData[] rowColumnParentDataArr;
        long j10;
        Placeable[] placeableArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int iCoerceIn;
        int iMax;
        int i14;
        int i15;
        long j11;
        int iMax2;
        long j12;
        int i16 = endIndex;
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        LayoutOrientation layoutOrientation = this.orientation;
        long jM273constructorimpl = OrientationIndependentConstraints.m273constructorimpl(constraints, layoutOrientation);
        long jMo413roundToPx0680j_4 = measureScope.mo413roundToPx0680j_4(this.arrangementSpacing);
        int i17 = i16 - startIndex;
        float f6 = 0.0f;
        int i18 = startIndex;
        float f10 = 0.0f;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        long jMainAxisSize = 0;
        boolean z10 = false;
        while (true) {
            list = this.measurables;
            rowColumnParentDataArr = this.f4351h;
            int iCoerceAtLeast = Integer.MAX_VALUE;
            j10 = jMo413roundToPx0680j_4;
            placeableArr = this.placeables;
            if (i18 >= i16) {
                break;
            }
            Measurable measurable = list.get(i18);
            RowColumnParentData rowColumnParentData = rowColumnParentDataArr[i18];
            float weight = RowColumnImplKt.getWeight(rowColumnParentData);
            if (weight > f6) {
                f10 += weight;
                i21++;
                iMax2 = i20;
                i18 = i18;
                j11 = j10;
            } else {
                int iM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(jM273constructorimpl);
                Placeable placeableMo3575measureBRTryo0 = placeableArr[i18];
                if (placeableMo3575measureBRTryo0 == null) {
                    if (iM4357getMaxWidthimpl == Integer.MAX_VALUE) {
                        j12 = 0;
                    } else {
                        j12 = 0;
                        iCoerceAtLeast = (int) kotlin.ranges.c.coerceAtLeast(((long) iM4357getMaxWidthimpl) - jMainAxisSize, 0L);
                    }
                    i15 = iM4357getMaxWidthimpl;
                    placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(OrientationIndependentConstraints.m286toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m275copyyUG9Ft0$default(jM273constructorimpl, 0, iCoerceAtLeast, 0, 0, 8, null), layoutOrientation));
                    j11 = j10;
                } else {
                    i15 = iM4357getMaxWidthimpl;
                    j11 = j10;
                }
                int iMin = Math.min((int) j11, (int) kotlin.ranges.c.coerceAtLeast((((long) i15) - jMainAxisSize) - ((long) mainAxisSize(placeableMo3575measureBRTryo0)), 0L));
                jMainAxisSize += (long) (mainAxisSize(placeableMo3575measureBRTryo0) + iMin);
                iMax2 = Math.max(i20, crossAxisSize(placeableMo3575measureBRTryo0));
                boolean z11 = z10 || RowColumnImplKt.isRelative(rowColumnParentData);
                placeableArr[i18] = placeableMo3575measureBRTryo0;
                i19 = iMin;
                z10 = z11;
            }
            jMo413roundToPx0680j_4 = j11;
            i18++;
            i20 = iMax2;
            f6 = 0.0f;
            i16 = endIndex;
        }
        int i22 = i20;
        if (i21 == 0) {
            jMainAxisSize -= (long) i19;
            i11 = endIndex;
            i12 = i17;
            i10 = i22;
            i13 = 0;
            iCoerceIn = 0;
        } else {
            long j13 = ((long) (i21 - 1)) * j10;
            long jCoerceAtLeast = kotlin.ranges.c.coerceAtLeast((((long) ((f10 <= 0.0f || Constraints.m4357getMaxWidthimpl(jM273constructorimpl) == Integer.MAX_VALUE) ? Constraints.m4359getMinWidthimpl(jM273constructorimpl) : Constraints.m4357getMaxWidthimpl(jM273constructorimpl))) - jMainAxisSize) - j13, 0L);
            float f11 = f10 > 0.0f ? jCoerceAtLeast / f10 : 0.0f;
            Iterator<Integer> it = kotlin.ranges.c.until(startIndex, endIndex).iterator();
            int iRoundToInt = 0;
            while (it.hasNext()) {
                iRoundToInt += mk.c.roundToInt(RowColumnImplKt.getWeight(rowColumnParentDataArr[((IntIterator) it).nextInt()]) * f11);
            }
            int i23 = startIndex;
            long j14 = jCoerceAtLeast - ((long) iRoundToInt);
            i10 = i22;
            int i24 = 0;
            i11 = endIndex;
            while (i23 < i11) {
                if (placeableArr[i23] == null) {
                    Measurable measurable2 = list.get(i23);
                    RowColumnParentData rowColumnParentData2 = rowColumnParentDataArr[i23];
                    float weight2 = RowColumnImplKt.getWeight(rowColumnParentData2);
                    if (weight2 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                    int sign = mk.c.getSign(j14);
                    j14 -= (long) sign;
                    int iMax3 = Math.max(0, mk.c.roundToInt(weight2 * f11) + sign);
                    Placeable placeableMo3575measureBRTryo1 = measurable2.mo3575measureBRTryo0(OrientationIndependentConstraints.m286toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m272constructorimpl((!RowColumnImplKt.getFill(rowColumnParentData2) || iMax3 == Integer.MAX_VALUE) ? 0 : iMax3, iMax3, 0, Constraints.m4356getMaxHeightimpl(jM273constructorimpl)), layoutOrientation));
                    int iMainAxisSize = mainAxisSize(placeableMo3575measureBRTryo1) + i24;
                    int iMax4 = Math.max(i10, crossAxisSize(placeableMo3575measureBRTryo1));
                    boolean z12 = z10 || RowColumnImplKt.isRelative(rowColumnParentData2);
                    placeableArr[i23] = placeableMo3575measureBRTryo1;
                    z10 = z12;
                    i10 = iMax4;
                    i24 = iMainAxisSize;
                } else {
                    f11 = f11;
                }
                i23++;
                i17 = i17;
                list = list;
                f11 = f11;
                j13 = j13;
            }
            i12 = i17;
            i13 = 0;
            iCoerceIn = (int) kotlin.ranges.c.coerceIn(((long) i24) + j13, 0L, ((long) Constraints.m4357getMaxWidthimpl(jM273constructorimpl)) - jMainAxisSize);
        }
        if (z10) {
            int iMax5 = i13;
            iMax = iMax5;
            for (int i25 = startIndex; i25 < i11; i25++) {
                Placeable placeable = placeableArr[i25];
                Intrinsics.checkNotNull(placeable);
                CrossAxisAlignment crossAxisAlignment = RowColumnImplKt.getCrossAxisAlignment(rowColumnParentDataArr[i25]);
                Integer numCalculateAlignmentLinePosition$foundation_layout_release = crossAxisAlignment != null ? crossAxisAlignment.calculateAlignmentLinePosition$foundation_layout_release(placeable) : null;
                if (numCalculateAlignmentLinePosition$foundation_layout_release != null) {
                    int iIntValue = numCalculateAlignmentLinePosition$foundation_layout_release.intValue();
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = i13;
                    }
                    iMax5 = Math.max(iMax5, iIntValue);
                    int iCrossAxisSize = crossAxisSize(placeable);
                    int iIntValue2 = numCalculateAlignmentLinePosition$foundation_layout_release.intValue();
                    if (iIntValue2 == Integer.MIN_VALUE) {
                        iIntValue2 = crossAxisSize(placeable);
                    }
                    iMax = Math.max(iMax, iCrossAxisSize - iIntValue2);
                }
            }
            i14 = iMax5;
        } else {
            iMax = i13;
            i14 = iMax;
        }
        int iMax6 = Math.max((int) kotlin.ranges.c.coerceAtLeast(jMainAxisSize + ((long) iCoerceIn), 0L), Constraints.m4359getMinWidthimpl(jM273constructorimpl));
        int iMax7 = (Constraints.m4356getMaxHeightimpl(jM273constructorimpl) == Integer.MAX_VALUE || this.crossAxisSize != SizeMode.Expand) ? Math.max(i10, Math.max(Constraints.m4358getMinHeightimpl(jM273constructorimpl), iMax + i14)) : Constraints.m4356getMaxHeightimpl(jM273constructorimpl);
        int i26 = i12;
        int[] iArr = new int[i26];
        for (int i27 = i13; i27 < i26; i27++) {
            iArr[i27] = i13;
        }
        int[] iArr2 = new int[i26];
        while (i13 < i26) {
            Placeable placeable2 = placeableArr[i13 + startIndex];
            Intrinsics.checkNotNull(placeable2);
            iArr2[i13] = mainAxisSize(placeable2);
            i13++;
        }
        this.arrangement.invoke(Integer.valueOf(iMax6), iArr2, measureScope.getLayoutDirection(), measureScope, iArr);
        return new RowColumnMeasureHelperResult(iMax7, iMax6, startIndex, endIndex, i14, iArr);
    }

    public final void placeHelper(@NotNull Placeable.PlacementScope placeableScope, @NotNull RowColumnMeasureHelperResult measureResult, int crossAxisOffset, @NotNull LayoutDirection layoutDirection) {
        CrossAxisAlignment crossAxisAlignment;
        Intrinsics.checkNotNullParameter(placeableScope, "placeableScope");
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int endIndex = measureResult.getEndIndex();
        for (int startIndex = measureResult.getStartIndex(); startIndex < endIndex; startIndex++) {
            Placeable placeable = this.placeables[startIndex];
            Intrinsics.checkNotNull(placeable);
            int[] mainAxisPositions = measureResult.getMainAxisPositions();
            Object parentData = this.measurables.get(startIndex).getParentData();
            RowColumnParentData rowColumnParentData = parentData instanceof RowColumnParentData ? (RowColumnParentData) parentData : null;
            int crossAxisSize = measureResult.getCrossAxisSize();
            int beforeCrossAxisAlignmentLine = measureResult.getBeforeCrossAxisAlignmentLine();
            if (rowColumnParentData == null || (crossAxisAlignment = rowColumnParentData.getCrossAxisAlignment()) == null) {
                crossAxisAlignment = this.crossAxisAlignment;
            }
            int iCrossAxisSize = crossAxisSize - crossAxisSize(placeable);
            LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
            LayoutOrientation layoutOrientation2 = this.orientation;
            int iAlign$foundation_layout_release = crossAxisAlignment.align$foundation_layout_release(iCrossAxisSize, layoutOrientation2 == layoutOrientation ? LayoutDirection.Ltr : layoutDirection, placeable, beforeCrossAxisAlignmentLine) + crossAxisOffset;
            if (layoutOrientation2 == layoutOrientation) {
                Placeable.PlacementScope.place$default(placeableScope, placeable, mainAxisPositions[startIndex - measureResult.getStartIndex()], iAlign$foundation_layout_release, 0.0f, 4, null);
            } else {
                Placeable.PlacementScope.place$default(placeableScope, placeable, iAlign$foundation_layout_release, mainAxisPositions[startIndex - measureResult.getStartIndex()], 0.0f, 4, null);
            }
        }
    }
}
