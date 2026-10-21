package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyGridSnapLayoutInfoProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a\u0014\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0014\u0010\u000f\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0010"}, d2 = {"singleAxisViewportSize", "", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)I", "SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "lazyGridState", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "positionInLayout", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "offsetOnMainAxis", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "sizeOnMainAxis", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyGridSnapLayoutInfoProviderKt {
    @ExperimentalFoundationApi
    @NotNull
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(@NotNull final LazyGridState lazyGridState, @NotNull final SnapPositionInLayout positionInLayout) {
        Intrinsics.checkNotNullParameter(lazyGridState, "lazyGridState");
        Intrinsics.checkNotNullParameter(positionInLayout, "positionInLayout");
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.SnapLayoutInfoProvider.1
            /* JADX WARN: Code duplicated, block: B:11:0x003a  */
            public final ArrayList a() {
                LazyGridState lazyGridState2 = lazyGridState;
                List<LazyGridItemInfo> visibleItemsInfo = lazyGridState2.getLayoutInfo().getVisibleItemsInfo();
                ArrayList arrayList = new ArrayList(visibleItemsInfo.size());
                int size = visibleItemsInfo.size();
                for (int i10 = 0; i10 < size; i10++) {
                    LazyGridItemInfo lazyGridItemInfo = visibleItemsInfo.get(i10);
                    LazyGridItemInfo lazyGridItemInfo2 = lazyGridItemInfo;
                    if (lazyGridState2.getLayoutInfo().getOrientation() == Orientation.Horizontal) {
                        if (lazyGridItemInfo2.getRow() == 0) {
                            arrayList.add(lazyGridItemInfo);
                        }
                    } else if (lazyGridItemInfo2.getColumn() == 0) {
                        arrayList.add(lazyGridItemInfo);
                    }
                }
                return arrayList;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(@NotNull Density density, float f6) {
                Intrinsics.checkNotNullParameter(density, "<this>");
                float fCoerceAtLeast = c.coerceAtLeast(Math.abs(DecayAnimationSpecKt.calculateTargetValue(SplineBasedDecayKt.splineBasedDecay(density), 0.0f, f6)) - calculateSnapStepSize(density), 0.0f);
                return fCoerceAtLeast == 0.0f ? fCoerceAtLeast : fCoerceAtLeast * Math.signum(f6);
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapStepSize(@NotNull Density density) {
                int iM4549getWidthimpl;
                Intrinsics.checkNotNullParameter(density, "<this>");
                if (!(!a().isEmpty())) {
                    return 0.0f;
                }
                int i10 = 0;
                if (lazyGridState.getLayoutInfo().getOrientation() == Orientation.Vertical) {
                    ArrayList arrayListA = a();
                    int size = arrayListA.size();
                    iM4549getWidthimpl = 0;
                    while (i10 < size) {
                        iM4549getWidthimpl += IntSize.m4548getHeightimpl(((LazyGridItemInfo) arrayListA.get(i10)).getSize());
                        i10++;
                    }
                } else {
                    ArrayList arrayListA2 = a();
                    int size2 = arrayListA2.size();
                    iM4549getWidthimpl = 0;
                    while (i10 < size2) {
                        iM4549getWidthimpl += IntSize.m4549getWidthimpl(((LazyGridItemInfo) arrayListA2.get(i10)).getSize());
                        i10++;
                    }
                }
                return iM4549getWidthimpl / a().size();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnappingOffset(@NotNull Density density, float f6) {
                Intrinsics.checkNotNullParameter(density, "<this>");
                LazyGridState lazyGridState2 = lazyGridState;
                List<LazyGridItemInfo> visibleItemsInfo = lazyGridState2.getLayoutInfo().getVisibleItemsInfo();
                SnapPositionInLayout snapPositionInLayout = positionInLayout;
                int size = visibleItemsInfo.size();
                float f10 = Float.NEGATIVE_INFINITY;
                float f11 = Float.POSITIVE_INFINITY;
                int i10 = 0;
                while (i10 < size) {
                    LazyGridItemInfo lazyGridItemInfo = visibleItemsInfo.get(i10);
                    int i11 = i10;
                    float fCalculateDistanceToDesiredSnapPosition = SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(density, LazyGridSnapLayoutInfoProviderKt.getSingleAxisViewportSize(lazyGridState2.getLayoutInfo()), lazyGridState2.getLayoutInfo().getBeforeContentPadding(), lazyGridState2.getLayoutInfo().getAfterContentPadding(), LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis(lazyGridItemInfo, lazyGridState2.getLayoutInfo().getOrientation()), LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridItemInfo, lazyGridState2.getLayoutInfo().getOrientation()), lazyGridItemInfo.getIndex(), snapPositionInLayout);
                    if (fCalculateDistanceToDesiredSnapPosition <= 0.0f && fCalculateDistanceToDesiredSnapPosition > f10) {
                        f10 = fCalculateDistanceToDesiredSnapPosition;
                    }
                    if (fCalculateDistanceToDesiredSnapPosition >= 0.0f && fCalculateDistanceToDesiredSnapPosition < f11) {
                        f11 = fCalculateDistanceToDesiredSnapPosition;
                    }
                    i10 = i11 + 1;
                }
                return SnapFlingBehaviorKt.calculateFinalOffset(f6, f10, f11);
            }
        };
    }

    public static /* synthetic */ SnapLayoutInfoProvider SnapLayoutInfoProvider$default(LazyGridState lazyGridState, SnapPositionInLayout snapPositionInLayout, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            snapPositionInLayout = SnapPositionInLayout.INSTANCE.getCenterToCenter();
        }
        return SnapLayoutInfoProvider(lazyGridState, snapPositionInLayout);
    }

    public static final int getSingleAxisViewportSize(@NotNull LazyGridLayoutInfo lazyGridLayoutInfo) {
        Intrinsics.checkNotNullParameter(lazyGridLayoutInfo, "<this>");
        return lazyGridLayoutInfo.getOrientation() == Orientation.Vertical ? IntSize.m4548getHeightimpl(lazyGridLayoutInfo.mo388getViewportSizeYbymL2g()) : IntSize.m4549getWidthimpl(lazyGridLayoutInfo.mo388getViewportSizeYbymL2g());
    }

    public static final int offsetOnMainAxis(@NotNull LazyGridItemInfo lazyGridItemInfo, @NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(lazyGridItemInfo, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == Orientation.Vertical ? IntOffset.m4508getYimpl(lazyGridItemInfo.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String()) : IntOffset.m4507getXimpl(lazyGridItemInfo.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String());
    }

    public static final int sizeOnMainAxis(@NotNull LazyGridItemInfo lazyGridItemInfo, @NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(lazyGridItemInfo, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return orientation == Orientation.Vertical ? IntSize.m4548getHeightimpl(lazyGridItemInfo.getSize()) : IntSize.m4549getWidthimpl(lazyGridItemInfo.getSize());
    }
}
