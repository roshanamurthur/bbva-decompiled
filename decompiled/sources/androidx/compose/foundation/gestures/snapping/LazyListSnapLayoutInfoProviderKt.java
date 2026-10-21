package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyListSnapLayoutInfoProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\r\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000e"}, d2 = {"singleAxisViewportSize", "", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)I", "SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "positionInLayout", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "rememberSnapFlingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyListSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,121:1\n36#2:122\n1097#3,6:123\n*S KotlinDebug\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt\n*L\n116#1:122\n116#1:123,6\n*E\n"})
public final class LazyListSnapLayoutInfoProviderKt {
    @ExperimentalFoundationApi
    @NotNull
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(@NotNull final LazyListState lazyListState, @NotNull final SnapPositionInLayout positionInLayout) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(positionInLayout, "positionInLayout");
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.SnapLayoutInfoProvider.1
            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(@NotNull Density density, float f6) {
                Intrinsics.checkNotNullParameter(density, "<this>");
                float fCoerceAtLeast = c.coerceAtLeast(Math.abs(DecayAnimationSpecKt.calculateTargetValue(SplineBasedDecayKt.splineBasedDecay(density), 0.0f, f6)) - calculateSnapStepSize(density), 0.0f);
                return fCoerceAtLeast == 0.0f ? fCoerceAtLeast : fCoerceAtLeast * Math.signum(f6);
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapStepSize(@NotNull Density density) {
                Intrinsics.checkNotNullParameter(density, "<this>");
                LazyListLayoutInfo layoutInfo = lazyListState.getLayoutInfo();
                if (!(!layoutInfo.getVisibleItemsInfo().isEmpty())) {
                    return 0.0f;
                }
                List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
                int size = visibleItemsInfo.size();
                int size2 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    size2 += visibleItemsInfo.get(i10).getSize();
                }
                return size2 / layoutInfo.getVisibleItemsInfo().size();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnappingOffset(@NotNull Density density, float f6) {
                Intrinsics.checkNotNullParameter(density, "<this>");
                LazyListState lazyListState2 = lazyListState;
                List<LazyListItemInfo> visibleItemsInfo = lazyListState2.getLayoutInfo().getVisibleItemsInfo();
                SnapPositionInLayout snapPositionInLayout = positionInLayout;
                int size = visibleItemsInfo.size();
                float f10 = Float.NEGATIVE_INFINITY;
                float f11 = Float.POSITIVE_INFINITY;
                int i10 = 0;
                while (i10 < size) {
                    LazyListItemInfo lazyListItemInfo = visibleItemsInfo.get(i10);
                    int i11 = i10;
                    float fCalculateDistanceToDesiredSnapPosition = SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(density, LazyListSnapLayoutInfoProviderKt.getSingleAxisViewportSize(lazyListState2.getLayoutInfo()), lazyListState2.getLayoutInfo().getBeforeContentPadding(), lazyListState2.getLayoutInfo().getAfterContentPadding(), lazyListItemInfo.getSize(), lazyListItemInfo.getOffset(), lazyListItemInfo.getIndex(), snapPositionInLayout);
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

    public static /* synthetic */ SnapLayoutInfoProvider SnapLayoutInfoProvider$default(LazyListState lazyListState, SnapPositionInLayout snapPositionInLayout, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            snapPositionInLayout = SnapPositionInLayout.INSTANCE.getCenterToCenter();
        }
        return SnapLayoutInfoProvider(lazyListState, snapPositionInLayout);
    }

    public static final int getSingleAxisViewportSize(@NotNull LazyListLayoutInfo lazyListLayoutInfo) {
        Intrinsics.checkNotNullParameter(lazyListLayoutInfo, "<this>");
        return lazyListLayoutInfo.getOrientation() == Orientation.Vertical ? IntSize.m4548getHeightimpl(lazyListLayoutInfo.mo367getViewportSizeYbymL2g()) : IntSize.m4549getWidthimpl(lazyListLayoutInfo.mo367getViewportSizeYbymL2g());
    }

    @Composable
    @ExperimentalFoundationApi
    @NotNull
    public static final FlingBehavior rememberSnapFlingBehavior(@NotNull LazyListState lazyListState, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        composer.startReplaceableGroup(1148456277);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1148456277, i10, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:114)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(lazyListState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapLayoutInfoProvider$default(lazyListState, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        SnapFlingBehavior snapFlingBehaviorRememberSnapFlingBehavior = SnapFlingBehaviorKt.rememberSnapFlingBehavior((SnapLayoutInfoProvider) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snapFlingBehaviorRememberSnapFlingBehavior;
    }
}
