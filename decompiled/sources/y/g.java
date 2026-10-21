package y;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListItemProvider;
import androidx.compose.foundation.lazy.LazyListMeasureKt;
import androidx.compose.foundation.lazy.LazyListMeasureResult;
import androidx.compose.foundation.lazy.LazyListMeasuredItemProvider;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
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

/* JADX INFO: compiled from: LazyList.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,339:1\n495#2,4:340\n500#2:349\n129#3,5:344\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1\n*L\n294#1:340,4\n294#1:349\n294#1:344,5\n*E\n"})
public final class g extends Lambda implements Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f94704p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f94705q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f94706r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ LazyListState f94707s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function0<LazyListItemProvider> f94708t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Vertical f94709u0;
    public final /* synthetic */ Arrangement.Horizontal v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ int f94710w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Alignment.Horizontal f94711x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Alignment.Vertical f94712y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(boolean z10, PaddingValues paddingValues, boolean z11, LazyListState lazyListState, Function0<? extends LazyListItemProvider> function0, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i10, Alignment.Horizontal horizontal2, Alignment.Vertical vertical2) {
        super(2);
        this.f94704p0 = z10;
        this.f94705q0 = paddingValues;
        this.f94706r0 = z11;
        this.f94707s0 = lazyListState;
        this.f94708t0 = function0;
        this.f94709u0 = vertical;
        this.v0 = horizontal;
        this.f94710w0 = i10;
        this.f94711x0 = horizontal2;
        this.f94712y0 = vertical2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) throws Throwable {
        int i10;
        float spacing;
        long jIntOffset;
        final LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
        long f18296a = constraints.getF18296a();
        Intrinsics.checkNotNullParameter(lazyLayoutMeasureScope2, "$this$null");
        boolean z10 = this.f94704p0;
        CheckScrollableContainerConstraintsKt.m143checkScrollableContainerConstraintsK40F9xA(f18296a, z10 ? Orientation.Vertical : Orientation.Horizontal);
        PaddingValues paddingValues = this.f94705q0;
        int iMo413roundToPx0680j_4 = z10 ? lazyLayoutMeasureScope2.mo413roundToPx0680j_4(paddingValues.mo302calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope2.getLayoutDirection())) : lazyLayoutMeasureScope2.mo413roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope2.getLayoutDirection()));
        int iMo413roundToPx0680j_5 = z10 ? lazyLayoutMeasureScope2.mo413roundToPx0680j_4(paddingValues.mo303calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope2.getLayoutDirection())) : lazyLayoutMeasureScope2.mo413roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope2.getLayoutDirection()));
        int iMo413roundToPx0680j_6 = lazyLayoutMeasureScope2.mo413roundToPx0680j_4(paddingValues.getTop());
        int iMo413roundToPx0680j_7 = lazyLayoutMeasureScope2.mo413roundToPx0680j_4(paddingValues.getBottom());
        int i11 = iMo413roundToPx0680j_6 + iMo413roundToPx0680j_7;
        int i12 = iMo413roundToPx0680j_4 + iMo413roundToPx0680j_5;
        int i13 = z10 ? i11 : i12;
        boolean z11 = this.f94706r0;
        if (z10 && !z11) {
            i10 = iMo413roundToPx0680j_6;
        } else if (z10 && z11) {
            i10 = iMo413roundToPx0680j_7;
        } else {
            i10 = (z10 || z11) ? iMo413roundToPx0680j_5 : iMo413roundToPx0680j_4;
        }
        final int i14 = i13 - i10;
        final long jM4373offsetNN6EwU = ConstraintsKt.m4373offsetNN6EwU(f18296a, -i12, -i11);
        LazyListState lazyListState = this.f94707s0;
        lazyListState.setDensity$foundation_release(lazyLayoutMeasureScope2);
        final LazyListItemProvider lazyListItemProviderInvoke = this.f94708t0.invoke();
        lazyListItemProviderInvoke.getItemScope().setMaxSize(Constraints.m4357getMaxWidthimpl(jM4373offsetNN6EwU), Constraints.m4356getMaxHeightimpl(jM4373offsetNN6EwU));
        if (z10) {
            Arrangement.Vertical vertical = this.f94709u0;
            if (vertical == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            spacing = vertical.getSpacing();
        } else {
            Arrangement.Horizontal horizontal = this.v0;
            if (horizontal == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            spacing = horizontal.getSpacing();
        }
        final int iMo413roundToPx0680j_8 = lazyLayoutMeasureScope2.mo413roundToPx0680j_4(spacing);
        final int itemCount = lazyListItemProviderInvoke.getItemCount();
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
        final boolean z12 = this.f94704p0;
        final Alignment.Horizontal horizontal2 = this.f94711x0;
        final Alignment.Vertical vertical2 = this.f94712y0;
        final boolean z13 = this.f94706r0;
        final int i15 = i10;
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(jM4373offsetNN6EwU, z12, lazyListItemProviderInvoke, lazyLayoutMeasureScope2, itemCount, iMo413roundToPx0680j_8, horizontal2, vertical2, z13, i15, i14, j10) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ boolean f4598d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ LazyLayoutMeasureScope f4599e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ int f4600f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ int f4601g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ Alignment.Horizontal f4602h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ Alignment.Vertical f4603i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ boolean f4604j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ int f4605k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ int f4606l;
            public final /* synthetic */ long m;

            {
                this.f4598d = z12;
                this.f4599e = lazyLayoutMeasureScope2;
                this.f4600f = itemCount;
                this.f4601g = iMo413roundToPx0680j_8;
                this.f4602h = horizontal2;
                this.f4603i = vertical2;
                this.f4604j = z13;
                this.f4605k = i15;
                this.f4606l = i14;
                this.m = j10;
            }

            @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
            @NotNull
            public LazyListMeasuredItem createItem(int index, @NotNull Object key, @Nullable Object contentType, @NotNull List<? extends Placeable> placeables) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(placeables, "placeables");
                return new LazyListMeasuredItem(index, placeables, this.f4598d, this.f4602h, this.f4603i, this.f4599e.getLayoutDirection(), this.f4604j, this.f4605k, this.f4606l, index == this.f4600f + (-1) ? 0 : this.f4601g, this.m, key, contentType, null);
            }
        };
        lazyListState.m373setPremeasureConstraintsBRTryo0$foundation_release(lazyListMeasuredItemProvider.getChildConstraints());
        Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
            try {
                int iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProviderInvoke, lazyListState.getFirstVisibleItemIndex());
                int firstVisibleItemScrollOffset = lazyListState.getFirstVisibleItemScrollOffset();
                Unit unit = Unit.INSTANCE;
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                snapshotCreateNonObservableSnapshot.dispose();
                LazyListMeasureResult lazyListMeasureResultM369measureLazyListCD5nmq0 = LazyListMeasureKt.m369measureLazyListCD5nmq0(itemCount, lazyListMeasuredItemProvider, iM4356getMaxHeightimpl, i10, i14, iMo413roundToPx0680j_8, iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, lazyListState.getScrollToBeConsumed(), jM4373offsetNN6EwU, this.f94704p0, lazyListItemProviderInvoke.getHeaderIndexes(), this.f94709u0, this.v0, this.f94706r0, lazyLayoutMeasureScope2, lazyListState.getPlacementAnimator(), this.f94710w0, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyListItemProviderInvoke, lazyListState.getPinnedItems(), lazyListState.getBeyondBoundsInfo()), new f(lazyLayoutMeasureScope2, f18296a, i12, i11));
                lazyListState.applyMeasureResult$foundation_release(lazyListMeasureResultM369measureLazyListCD5nmq0);
                return lazyListMeasureResultM369measureLazyListCD5nmq0;
            } catch (Throwable th2) {
                try {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th2;
                } catch (Throwable th3) {
                    th = th3;
                    snapshotCreateNonObservableSnapshot.dispose();
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
