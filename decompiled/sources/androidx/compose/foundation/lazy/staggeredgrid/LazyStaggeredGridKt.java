package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyStaggeredGrid.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a£\u0001\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001d\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0002\b\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\bH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "Lkotlin/ExtensionFunctionType;", "slots", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacing", "crossAxisSpacing", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "", "content", "LazyStaggeredGrid-LJWHXA8", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZFFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "LazyStaggeredGrid", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyStaggeredGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,135:1\n154#2:136\n154#2:137\n154#2:138\n76#3:139\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n*L\n50#1:136\n58#1:137\n60#1:138\n102#1:139\n*E\n"})
public final class LazyStaggeredGridKt {

    /* JADX INFO: compiled from: LazyStaggeredGrid.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function1<LazyStaggeredGridScope, Unit> E0;
        public final /* synthetic */ int F0;
        public final /* synthetic */ int G0;
        public final /* synthetic */ int H0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LazyStaggeredGridState f5195p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Orientation f5196q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Density, Constraints, LazyStaggeredGridSlots> f5197r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Modifier f5198s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f5199t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f5200u0;
        public final /* synthetic */ FlingBehavior v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ boolean f5201w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ float f5202x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ float f5203y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(LazyStaggeredGridState lazyStaggeredGridState, Orientation orientation, Function2<? super Density, ? super Constraints, LazyStaggeredGridSlots> function2, Modifier modifier, PaddingValues paddingValues, boolean z10, FlingBehavior flingBehavior, boolean z11, float f6, float f10, Function1<? super LazyStaggeredGridScope, Unit> function1, int i10, int i11, int i12) {
            super(2);
            this.f5195p0 = lazyStaggeredGridState;
            this.f5196q0 = orientation;
            this.f5197r0 = function2;
            this.f5198s0 = modifier;
            this.f5199t0 = paddingValues;
            this.f5200u0 = z10;
            this.v0 = flingBehavior;
            this.f5201w0 = z11;
            this.f5202x0 = f6;
            this.f5203y0 = f10;
            this.E0 = function1;
            this.F0 = i10;
            this.G0 = i11;
            this.H0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LazyStaggeredGridKt.m423LazyStaggeredGridLJWHXA8(this.f5195p0, this.f5196q0, this.f5197r0, this.f5198s0, this.f5199t0, this.f5200u0, this.v0, this.f5201w0, this.f5202x0, this.f5203y0, this.E0, composer, RecomposeScopeImplKt.updateChangedFlags(this.F0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.G0), this.H0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazyStaggeredGrid.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<LazyLayoutItemProvider> f5204p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LazyStaggeredGridState f5205q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f5206r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function0<? extends LazyLayoutItemProvider> function0, LazyStaggeredGridState lazyStaggeredGridState, int i10) {
            super(2);
            this.f5204p0 = function0;
            this.f5205q0 = lazyStaggeredGridState;
            this.f5206r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f5206r0 | 1);
            LazyStaggeredGridKt.a(this.f5204p0, this.f5205q0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: LazyStaggeredGrid-LJWHXA8, reason: not valid java name */
    public static final void m423LazyStaggeredGridLJWHXA8(@NotNull LazyStaggeredGridState state, @NotNull Orientation orientation, @NotNull Function2<? super Density, ? super Constraints, LazyStaggeredGridSlots> slots, @Nullable Modifier modifier, @Nullable PaddingValues paddingValues, boolean z10, @Nullable FlingBehavior flingBehavior, boolean z11, float f6, float f10, @NotNull Function1<? super LazyStaggeredGridScope, Unit> content, @Nullable Composer composer, int i10, int i11, int i12) {
        FlingBehavior flingBehavior2;
        int i13;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1320541636);
        Modifier modifier2 = (i12 & 8) != 0 ? Modifier.INSTANCE : modifier;
        PaddingValues paddingValuesM289PaddingValues0680j_4 = (i12 & 16) != 0 ? PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)) : paddingValues;
        boolean z12 = (i12 & 32) != 0 ? false : z10;
        if ((i12 & 64) != 0) {
            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
            i13 = i10 & (-3670017);
        } else {
            flingBehavior2 = flingBehavior;
            i13 = i10;
        }
        boolean z13 = (i12 & 128) != 0 ? true : z11;
        float fM4389constructorimpl = (i12 & 256) != 0 ? Dp.m4389constructorimpl(0) : f6;
        float fM4389constructorimpl2 = (i12 & 512) != 0 ? Dp.m4389constructorimpl(0) : f10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1320541636, i13, i11, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:39)");
        }
        ScrollableDefaults scrollableDefaults = ScrollableDefaults.INSTANCE;
        OverscrollEffect overscrollEffect = scrollableDefaults.overscrollEffect(composerStartRestartGroup, 6);
        Function0<LazyStaggeredGridItemProvider> function0RememberStaggeredGridItemProviderLambda = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(state, content, composerStartRestartGroup, ((i11 << 3) & 112) | 8);
        int i14 = i13 >> 6;
        int i15 = i13 >> 9;
        int i16 = i13;
        boolean z14 = z12;
        Modifier modifier3 = modifier2;
        Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function2M430rememberStaggeredGridMeasurePolicynbWgWpA = LazyStaggeredGridMeasurePolicyKt.m430rememberStaggeredGridMeasurePolicynbWgWpA(state, function0RememberStaggeredGridItemProviderLambda, paddingValuesM289PaddingValues0680j_4, z12, orientation, fM4389constructorimpl, fM4389constructorimpl2, slots, composerStartRestartGroup, (i14 & 7168) | (i14 & 896) | 8 | ((i13 << 9) & 57344) | (i15 & 458752) | (3670016 & i15) | ((i13 << 15) & 29360128));
        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyStaggeredGridSemanticState = LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(state, z14, composerStartRestartGroup, ((i16 >> 12) & 112) | 8);
        a(function0RememberStaggeredGridItemProviderLambda, state, composerStartRestartGroup, 64);
        int i17 = (i16 << 6) & 7168;
        boolean z15 = z13;
        LazyLayoutKt.LazyLayout(function0RememberStaggeredGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyStaggeredGridBeyondBoundsModifierKt.lazyStaggeredGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()), function0RememberStaggeredGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyStaggeredGridSemanticState, orientation, z15, z14, composerStartRestartGroup, (i15 & 57344) | i17 | (i16 & 458752)), orientation), state, z14, orientation, composerStartRestartGroup, (i15 & 896) | 64 | i17), overscrollEffect), state, orientation, overscrollEffect, z15, scrollableDefaults.reverseDirection((LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, z14), flingBehavior2, state.getMutableInteractionSource()), state.getPrefetchState(), function2M430rememberStaggeredGridMeasurePolicynbWgWpA, composerStartRestartGroup, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(state, orientation, slots, modifier3, paddingValuesM289PaddingValues0680j_4, z14, flingBehavior2, z13, fM4389constructorimpl, fM4389constructorimpl2, content, i10, i11, i12));
    }

    @Composable
    public static final void a(Function0<? extends LazyLayoutItemProvider> function0, LazyStaggeredGridState lazyStaggeredGridState, Composer composer, int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(661612410);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(661612410, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.ScrollPositionUpdater (LazyStaggeredGrid.kt:120)");
        }
        LazyLayoutItemProvider lazyLayoutItemProviderInvoke = function0.invoke();
        if (lazyLayoutItemProviderInvoke.getItemCount() > 0) {
            LazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release$default(lazyStaggeredGridState, lazyLayoutItemProviderInvoke, null, 2, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(function0, lazyStaggeredGridState, i10));
    }
}
