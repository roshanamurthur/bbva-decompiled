package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayout;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PagerState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\t\u001a\u0017\u0010\u000b\u001a\u00020\n*\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\n*\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\f\"\u001d\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\" \u0010\u001b\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018\" \u0010\"\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u001a\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"", "initialPage", "", "initialPageOffsetFraction", "Lkotlin/Function0;", "pageCount", "Landroidx/compose/foundation/pager/PagerState;", "rememberPagerState", "(IFLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/pager/PagerState;", "(IFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/pager/PagerState;", "", "animateToNextPage", "(Landroidx/compose/foundation/pager/PagerState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToPreviousPage", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getDefaultPositionThreshold", "()F", "DefaultPositionThreshold", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "b", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "getEmptyLayoutInfo", "()Landroidx/compose/foundation/pager/PagerLayoutInfo;", "getEmptyLayoutInfo$annotations", "()V", "EmptyLayoutInfo", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "d", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "getSnapAlignmentStartToStart", "()Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "getSnapAlignmentStartToStart$annotations", "SnapAlignmentStartToStart", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,684:1\n67#2,3:685\n66#2:688\n50#2:695\n49#2:696\n1097#3,6:689\n1097#3,6:697\n154#4:703\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n79#1:685,3\n79#1:688\n118#1:695\n118#1:696\n79#1:689,6\n118#1:697,6\n652#1:703\n*E\n"})
public final class PagerStateKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f5535a = Dp.m4389constructorimpl(56);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final PagerStateKt$EmptyLayoutInfo$1 f5536b = new PagerLayoutInfo() { // from class: androidx.compose.foundation.pager.PagerStateKt$EmptyLayoutInfo$1

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<PageInfo> visiblePagesInfo = CollectionsKt__CollectionsKt.emptyList();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final long viewportSize = IntSize.INSTANCE.m4554getZeroYbymL2g();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Orientation orientation = Orientation.Horizontal;

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getAfterContentPadding() {
            return 0;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getBeforeContentPadding() {
            return 0;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        @Nullable
        public PageInfo getClosestPageToSnapPosition() {
            return null;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        @NotNull
        public Orientation getOrientation() {
            return this.orientation;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getPageSize() {
            return 0;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getPageSpacing() {
            return 0;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getPagesCount() {
            return 0;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public boolean getReverseLayout() {
            return false;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getViewportEndOffset() {
            return 0;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        /* JADX INFO: renamed from: getViewportSize-YbymL2g, reason: from getter */
        public long getViewportSize() {
            return this.viewportSize;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getViewportStartOffset() {
            return 0;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        @NotNull
        public List<PageInfo> getVisiblePagesInfo() {
            return this.visiblePagesInfo;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final PagerStateKt$UnitDensity$1 f5537c = new Density() { // from class: androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public final float density = 1.0f;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public final float fontScale = 1.0f;

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getFontScale() {
            return this.fontScale;
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx--R2X_6o */
        public final /* synthetic */ int mo412roundToPxR2X_6o(long j10) {
            return x1.a.a(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx-0680j_4 */
        public final /* synthetic */ int mo413roundToPx0680j_4(float f6) {
            return x1.a.b(this, f6);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-GaN1DYA */
        public final /* synthetic */ float mo404toDpGaN1DYA(long j10) {
            return x1.a.c(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public final /* synthetic */ float mo405toDpu2uoSUM(float f6) {
            return x1.a.d(this, f6);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDpSize-k-rfVVM */
        public final /* synthetic */ long mo407toDpSizekrfVVM(long j10) {
            return x1.a.f(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public final /* synthetic */ float mo414toPxR2X_6o(long j10) {
            return x1.a.g(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx-0680j_4 */
        public final /* synthetic */ float mo415toPx0680j_4(float f6) {
            return x1.a.h(this, f6);
        }

        @Override // androidx.compose.ui.unit.Density
        public final /* synthetic */ Rect toRect(DpRect dpRect) {
            return x1.a.i(this, dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSize-XkaWNTQ */
        public final /* synthetic */ long mo408toSizeXkaWNTQ(long j10) {
            return x1.a.j(this, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-0xMU5do */
        public final /* synthetic */ long mo409toSp0xMU5do(float f6) {
            return x1.a.k(this, f6);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public final /* synthetic */ long mo410toSpkPz2Gy4(float f6) {
            return x1.a.l(this, f6);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public final /* synthetic */ float mo406toDpu2uoSUM(int i10) {
            return x1.a.e(this, i10);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public final /* synthetic */ long mo411toSpkPz2Gy4(int i10) {
            return x1.a.m(this, i10);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f5538d = a.f5544a;

    /* JADX INFO: compiled from: PagerState.kt */
    public static final class a implements SnapPositionInLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5544a = new a();

        @Override // androidx.compose.foundation.gestures.snapping.SnapPositionInLayout
        public final int position(@NotNull Density SnapPositionInLayout, int i10, int i11, int i12) {
            Intrinsics.checkNotNullParameter(SnapPositionInLayout, "$this$SnapPositionInLayout");
            return 0;
        }
    }

    /* JADX INFO: compiled from: PagerState.kt */
    public static final class b extends Lambda implements Function0<PagerStateImpl> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f5545p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f5546q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Integer> f5547r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, float f6, Function0<Integer> function0) {
            super(0);
            this.f5545p0 = i10;
            this.f5546q0 = f6;
            this.f5547r0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final PagerStateImpl invoke() {
            return new PagerStateImpl(this.f5545p0, this.f5546q0, this.f5547r0);
        }
    }

    /* JADX INFO: compiled from: PagerState.kt */
    public static final class c extends Lambda implements Function0<PagerStateImpl> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f5548p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f5549q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, float f6) {
            super(0);
            this.f5548p0 = i10;
            this.f5549q0 = f6;
        }

        @Override // kotlin.jvm.functions.Function0
        public final PagerStateImpl invoke() {
            return new PagerStateImpl(this.f5548p0, this.f5549q0, g.f5569p0);
        }
    }

    @Nullable
    public static final Object animateToNextPage(@NotNull PagerState pagerState, @NotNull Continuation<? super Unit> continuation) {
        if (pagerState.getCurrentPage() + 1 >= pagerState.getPageCount()) {
            return Unit.INSTANCE;
        }
        Object objAnimateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() + 1, 0.0f, null, continuation, 6, null);
        return objAnimateScrollToPage$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateScrollToPage$default : Unit.INSTANCE;
    }

    @Nullable
    public static final Object animateToPreviousPage(@NotNull PagerState pagerState, @NotNull Continuation<? super Unit> continuation) {
        if (pagerState.getCurrentPage() - 1 < 0) {
            return Unit.INSTANCE;
        }
        Object objAnimateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() - 1, 0.0f, null, continuation, 6, null);
        return objAnimateScrollToPage$default == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateScrollToPage$default : Unit.INSTANCE;
    }

    public static final float getDefaultPositionThreshold() {
        return f5535a;
    }

    @NotNull
    public static final PagerLayoutInfo getEmptyLayoutInfo() {
        return f5536b;
    }

    @NotNull
    public static final SnapPositionInLayout getSnapAlignmentStartToStart() {
        return f5538d;
    }

    @Composable
    @ExperimentalFoundationApi
    @NotNull
    public static final PagerState rememberPagerState(int i10, float f6, @NotNull Function0<Integer> pageCount, @Nullable Composer composer, int i11, int i12) {
        Intrinsics.checkNotNullParameter(pageCount, "pageCount");
        composer.startReplaceableGroup(-1210768637);
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            f6 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1210768637, i11, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:73)");
        }
        Object[] objArr = new Object[0];
        Saver<PagerStateImpl, ?> saver = PagerStateImpl.INSTANCE.getSaver();
        Integer numValueOf = Integer.valueOf(i10);
        Float fValueOf = Float.valueOf(f6);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(numValueOf) | composer.changed(fValueOf) | composer.changed(pageCount);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new b(i10, f6, pageCount);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        PagerStateImpl pagerStateImpl = (PagerStateImpl) RememberSaveableKt.m2165rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 72, 4);
        pagerStateImpl.getPageCountState().setValue(pageCount);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pagerStateImpl;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "Please use the overload where you can provide a source of truth for the pageCount.", replaceWith = @ReplaceWith(expression = "rememberPagerState(\n                initialPage = initialPage,\n                initialPageOffsetFraction = initialPageOffsetFraction\n            ){\n                // provide pageCount\n            }", imports = {}))
    @Composable
    @ExperimentalFoundationApi
    public static final PagerState rememberPagerState(int i10, float f6, @Nullable Composer composer, int i11, int i12) {
        composer.startReplaceableGroup(144687223);
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            f6 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(144687223, i11, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:113)");
        }
        Object[] objArr = new Object[0];
        Saver<PagerStateImpl, ?> saver = PagerStateImpl.INSTANCE.getSaver();
        Integer numValueOf = Integer.valueOf(i10);
        Float fValueOf = Float.valueOf(f6);
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(numValueOf) | composer.changed(fValueOf);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new c(i10, f6);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        PagerStateImpl pagerStateImpl = (PagerStateImpl) RememberSaveableKt.m2165rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pagerStateImpl;
    }

    public static /* synthetic */ void getEmptyLayoutInfo$annotations() {
    }

    public static /* synthetic */ void getSnapAlignmentStartToStart$annotations() {
    }
}
