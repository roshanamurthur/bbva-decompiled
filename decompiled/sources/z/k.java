package z;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridItemProvider;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureKt;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureResult;
import androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider;
import androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider;
import androidx.compose.foundation.lazy.grid.LazyGridSlots;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyGrid.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,375:1\n495#2,4:376\n500#2:385\n129#3,5:380\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1\n*L\n322#1:376,4\n322#1:385\n322#1:380,5\n*E\n"})
public final class k extends Lambda implements Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f94914p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f94915q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f94916r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function0<LazyGridItemProvider> f94917s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function2<Density, Constraints, LazyGridSlots> f94918t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ LazyGridState f94919u0;
    public final /* synthetic */ Arrangement.Vertical v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Horizontal f94920w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(boolean z10, PaddingValues paddingValues, boolean z11, Function0<? extends LazyGridItemProvider> function0, Function2<? super Density, ? super Constraints, LazyGridSlots> function2, LazyGridState lazyGridState, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal) {
        super(2);
        this.f94914p0 = z10;
        this.f94915q0 = paddingValues;
        this.f94916r0 = z11;
        this.f94917s0 = function0;
        this.f94918t0 = function2;
        this.f94919u0 = lazyGridState;
        this.v0 = vertical;
        this.f94920w0 = horizontal;
    }

    /* JADX WARN: Type inference failed for: r32v0, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider] */
    /* JADX WARN: Type inference failed for: r9v2, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider] */
    @Override // kotlin.jvm.functions.Function2
    public final LazyGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
        int i10;
        float spacing;
        long jIntOffset;
        int lineIndexOfItem;
        int firstVisibleItemScrollOffset;
        final LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
        long f18296a = constraints.getF18296a();
        Intrinsics.checkNotNullParameter(lazyLayoutMeasureScope2, "$this$null");
        boolean z10 = this.f94914p0;
        CheckScrollableContainerConstraintsKt.m143checkScrollableContainerConstraintsK40F9xA(f18296a, z10 ? Orientation.Vertical : Orientation.Horizontal);
        PaddingValues paddingValues = this.f94915q0;
        int iMo413roundToPx0680j_4 = z10 ? lazyLayoutMeasureScope2.mo413roundToPx0680j_4(paddingValues.mo302calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope2.getLayoutDirection())) : lazyLayoutMeasureScope2.mo413roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope2.getLayoutDirection()));
        int iMo413roundToPx0680j_5 = z10 ? lazyLayoutMeasureScope2.mo413roundToPx0680j_4(paddingValues.mo303calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope2.getLayoutDirection())) : lazyLayoutMeasureScope2.mo413roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope2.getLayoutDirection()));
        int iMo413roundToPx0680j_6 = lazyLayoutMeasureScope2.mo413roundToPx0680j_4(paddingValues.getTop());
        int iMo413roundToPx0680j_7 = lazyLayoutMeasureScope2.mo413roundToPx0680j_4(paddingValues.getBottom());
        int i11 = iMo413roundToPx0680j_6 + iMo413roundToPx0680j_7;
        int i12 = iMo413roundToPx0680j_4 + iMo413roundToPx0680j_5;
        int i13 = z10 ? i11 : i12;
        boolean z11 = this.f94916r0;
        if (z10 && !z11) {
            i10 = iMo413roundToPx0680j_6;
        } else if (z10 && z11) {
            i10 = iMo413roundToPx0680j_7;
        } else {
            i10 = (z10 || z11) ? iMo413roundToPx0680j_5 : iMo413roundToPx0680j_4;
        }
        final int i14 = i13 - i10;
        long jM4373offsetNN6EwU = ConstraintsKt.m4373offsetNN6EwU(f18296a, -i12, -i11);
        final LazyGridItemProvider lazyGridItemProviderInvoke = this.f94917s0.invoke();
        final LazyGridSpanLayoutProvider spanLayoutProvider = lazyGridItemProviderInvoke.getSpanLayoutProvider();
        final LazyGridSlots lazyGridSlotsInvoke = this.f94918t0.invoke(lazyLayoutMeasureScope2, Constraints.m4346boximpl(f18296a));
        int length = lazyGridSlotsInvoke.getSizes().length;
        spanLayoutProvider.setSlotsPerLine(length);
        LazyGridState lazyGridState = this.f94919u0;
        lazyGridState.setDensity$foundation_release(lazyLayoutMeasureScope2);
        lazyGridState.setSlotsPerLine$foundation_release(length);
        if (z10) {
            Arrangement.Vertical vertical = this.v0;
            if (vertical == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            spacing = vertical.getSpacing();
        } else {
            Arrangement.Horizontal horizontal = this.f94920w0;
            if (horizontal == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            spacing = horizontal.getSpacing();
        }
        final int iMo413roundToPx0680j_8 = lazyLayoutMeasureScope2.mo413roundToPx0680j_4(spacing);
        final int itemCount = lazyGridItemProviderInvoke.getItemCount();
        int iM4356getMaxHeightimpl = z10 ? Constraints.m4356getMaxHeightimpl(f18296a) - i11 : Constraints.m4357getMaxWidthimpl(f18296a) - i12;
        if (!z11 || iM4356getMaxHeightimpl > 0) {
            jIntOffset = IntOffsetKt.IntOffset(iMo413roundToPx0680j_4, iMo413roundToPx0680j_6);
        } else {
            if (!z10) {
                iMo413roundToPx0680j_4 += iM4356getMaxHeightimpl;
            }
            if (z10) {
                iMo413roundToPx0680j_6 += iM4356getMaxHeightimpl;
            }
            jIntOffset = IntOffsetKt.IntOffset(iMo413roundToPx0680j_4, iMo413roundToPx0680j_6);
        }
        final long j10 = jIntOffset;
        final boolean z12 = this.f94914p0;
        final boolean z13 = this.f94916r0;
        final int i15 = i10;
        final ?? r32 = new LazyGridMeasuredItemProvider(lazyGridItemProviderInvoke, lazyLayoutMeasureScope2, iMo413roundToPx0680j_8, z12, z13, i15, i14, j10) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LazyLayoutMeasureScope f4791d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f4792e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ boolean f4793f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ int f4794g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ int f4795h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ long f4796i;

            {
                this.f4791d = lazyLayoutMeasureScope2;
                this.f4792e = z12;
                this.f4793f = z13;
                this.f4794g = i15;
                this.f4795h = i14;
                this.f4796i = j10;
            }

            @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
            @NotNull
            public LazyGridMeasuredItem createItem(int index, @NotNull Object key, @Nullable Object contentType, int crossAxisSize, int mainAxisSpacing, @NotNull List<? extends Placeable> placeables) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(placeables, "placeables");
                return new LazyGridMeasuredItem(index, key, this.f4792e, crossAxisSize, mainAxisSpacing, this.f4793f, this.f4791d.getLayoutDirection(), this.f4794g, this.f4795h, placeables, this.f4796i, contentType, null);
            }
        };
        final boolean z14 = this.f94914p0;
        ?? r10 = new LazyGridMeasuredLineProvider(z14, lazyGridSlotsInvoke, itemCount, iMo413roundToPx0680j_8, r32, spanLayoutProvider) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ boolean f4797g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ LazyGridSlots f4798h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(z14, lazyGridSlotsInvoke, itemCount, iMo413roundToPx0680j_8, r32, spanLayoutProvider);
                this.f4797g = z14;
                this.f4798h = lazyGridSlotsInvoke;
            }

            @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider
            @NotNull
            public LazyGridMeasuredLine createLine(int index, @NotNull LazyGridMeasuredItem[] items, @NotNull List<GridItemSpan> spans, int mainAxisSpacing) {
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(spans, "spans");
                return new LazyGridMeasuredLine(index, items, this.f4798h, spans, this.f4797g, mainAxisSpacing);
            }
        };
        lazyGridState.setPrefetchInfoRetriever$foundation_release(new androidx.compose.foundation.lazy.grid.a(spanLayoutProvider, r10));
        Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
            try {
                int iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyGridItemProviderInvoke, lazyGridState.getFirstVisibleItemIndex());
                if (iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release < itemCount || itemCount <= 0) {
                    lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release);
                    firstVisibleItemScrollOffset = lazyGridState.getFirstVisibleItemScrollOffset();
                } else {
                    lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(itemCount - 1);
                    firstVisibleItemScrollOffset = 0;
                }
                int i16 = lineIndexOfItem;
                int i17 = firstVisibleItemScrollOffset;
                Unit unit = Unit.INSTANCE;
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                snapshotCreateNonObservableSnapshot.dispose();
                LazyGridMeasureResult lazyGridMeasureResultM389measureLazyGridZRKPzZ8 = LazyGridMeasureKt.m389measureLazyGridZRKPzZ8(itemCount, r10, r32, iM4356getMaxHeightimpl, i10, i14, iMo413roundToPx0680j_8, i16, i17, lazyGridState.getScrollToBeConsumed(), jM4373offsetNN6EwU, this.f94914p0, this.v0, this.f94920w0, this.f94916r0, lazyLayoutMeasureScope2, lazyGridState.getPlacementAnimator(), spanLayoutProvider, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyGridItemProviderInvoke, lazyGridState.getPinnedItems(), lazyGridState.getBeyondBoundsInfo()), new j(lazyLayoutMeasureScope2, f18296a, i12, i11));
                lazyGridState.applyMeasureResult$foundation_release(lazyGridMeasureResultM389measureLazyGridZRKPzZ8);
                return lazyGridMeasureResultM389measureLazyGridZRKPzZ8;
            } catch (Throwable th2) {
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                throw th2;
            }
        } catch (Throwable th3) {
            snapshotCreateNonObservableSnapshot.dispose();
            throw th3;
        }
    }
}
