package androidx.compose.foundation.pager;

import androidx.appcompat.widget.g0;
import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyLayoutPager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÙ\u0001\u0010(\u001a\u00020\"2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132#\u0010\u001a\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d21\u0010%\u001a-\u0012\u0004\u0012\u00020 \u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"0\u001f¢\u0006\u0002\b#¢\u0006\u0002\b$H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "flingBehavior", "userScrollEnabled", "", "beyondBoundsPageCount", "Landroidx/compose/ui/unit/Dp;", "pageSpacing", "Landroidx/compose/foundation/pager/PageSize;", "pageSize", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "pageNestedScrollConnection", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.INDEX, "", "key", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "page", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "pageContent", "Pager-fs30GE4", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZIFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "Pager", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyLayoutPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,282:1\n154#2:283\n36#3:284\n36#3:291\n50#3:298\n49#3:299\n83#3,3:307\n1097#4,6:285\n1097#4,6:292\n1097#4,6:300\n1097#4,6:310\n76#5:306\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt\n*L\n77#1:283\n102#1:284\n115#1:291\n118#1:298\n118#1:299\n242#1:307,3\n102#1:285,6\n115#1:292,6\n118#1:300,6\n242#1:310,6\n157#1:306\n*E\n"})
public final class LazyLayoutPagerKt {

    /* JADX INFO: compiled from: LazyLayoutPager.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ NestedScrollConnection E0;
        public final /* synthetic */ Function1<Integer, Object> F0;
        public final /* synthetic */ Alignment.Horizontal G0;
        public final /* synthetic */ Alignment.Vertical H0;
        public final /* synthetic */ Function4<PagerScope, Integer, Composer, Integer, Unit> I0;
        public final /* synthetic */ int J0;
        public final /* synthetic */ int K0;
        public final /* synthetic */ int L0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f5349p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ PagerState f5350q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f5351r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f5352s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Orientation f5353t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ SnapFlingBehavior f5354u0;
        public final /* synthetic */ boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f5355w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ float f5356x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ PageSize f5357y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Modifier modifier, PagerState pagerState, PaddingValues paddingValues, boolean z10, Orientation orientation, SnapFlingBehavior snapFlingBehavior, boolean z11, int i10, float f6, PageSize pageSize, NestedScrollConnection nestedScrollConnection, Function1<? super Integer, ? extends Object> function1, Alignment.Horizontal horizontal, Alignment.Vertical vertical, Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, int i11, int i12, int i13) {
            super(2);
            this.f5349p0 = modifier;
            this.f5350q0 = pagerState;
            this.f5351r0 = paddingValues;
            this.f5352s0 = z10;
            this.f5353t0 = orientation;
            this.f5354u0 = snapFlingBehavior;
            this.v0 = z11;
            this.f5355w0 = i10;
            this.f5356x0 = f6;
            this.f5357y0 = pageSize;
            this.E0 = nestedScrollConnection;
            this.F0 = function1;
            this.G0 = horizontal;
            this.H0 = vertical;
            this.I0 = function4;
            this.J0 = i11;
            this.K0 = i12;
            this.L0 = i13;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LazyLayoutPagerKt.m442Pagerfs30GE4(this.f5349p0, this.f5350q0, this.f5351r0, this.f5352s0, this.f5353t0, this.f5354u0, this.v0, this.f5355w0, this.f5356x0, this.f5357y0, this.E0, this.F0, this.G0, this.H0, this.I0, composer, RecomposeScopeImplKt.updateChangedFlags(this.J0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.K0), this.L0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazyLayoutPager.kt */
    public static final class b extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PagerState f5358p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PagerState pagerState) {
            super(0);
            this.f5358p0 = pagerState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(this.f5358p0.getPageCount());
        }
    }

    /* JADX INFO: compiled from: LazyLayoutPager.kt */
    public static final class c extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PagerState f5359p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PagerState pagerState) {
            super(0);
            this.f5359p0 = pagerState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(this.f5359p0.getPageCount());
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00fc A[LOOP:0: B:25:0x00fa->B:26:0x00fc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0116  */
    /* JADX WARN: Code duplicated, block: B:34:0x0145  */
    /* JADX WARN: Code duplicated, block: B:39:0x0163  */
    /* JADX WARN: Code duplicated, block: B:44:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:47:0x0207  */
    /* JADX WARN: Code duplicated, block: B:49:0x020d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0210  */
    /* JADX WARN: Code duplicated, block: B:52:0x0219  */
    /* JADX WARN: Code duplicated, block: B:55:0x0222  */
    /* JADX WARN: Code duplicated, block: B:56:0x0225  */
    /* JADX WARN: Code duplicated, block: B:59:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:63:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Composable
    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Pager-fs30GE4, reason: not valid java name */
    public static final void m442Pagerfs30GE4(@NotNull Modifier modifier, @NotNull PagerState state, @NotNull PaddingValues contentPadding, boolean z10, @NotNull Orientation orientation, @NotNull SnapFlingBehavior flingBehavior, boolean z11, int i10, float f6, @NotNull PageSize pageSize, @NotNull NestedScrollConnection pageNestedScrollConnection, @Nullable Function1<? super Integer, ? extends Object> function1, @NotNull Alignment.Horizontal horizontalAlignment, @NotNull Alignment.Vertical verticalAlignment, @NotNull Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> pageContent, @Nullable Composer composer, int i11, int i12, int i13) {
        int i14;
        Function0 function0;
        int i15;
        State stateRememberUpdatedState;
        int i16;
        Object[] objArr;
        int i17;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChanged2;
        Object objRememberedValue2;
        int i18;
        boolean zChanged3;
        Object objRememberedValue3;
        Modifier modifierPagerSemantics;
        boolean z12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        boolean z13;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(flingBehavior, "flingBehavior");
        Intrinsics.checkNotNullParameter(pageSize, "pageSize");
        Intrinsics.checkNotNullParameter(pageNestedScrollConnection, "pageNestedScrollConnection");
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        Intrinsics.checkNotNullParameter(pageContent, "pageContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-301644943);
        int i19 = (i13 & 128) != 0 ? 0 : i10;
        float fM4389constructorimpl = (i13 & 256) != 0 ? Dp.m4389constructorimpl(0) : f6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-301644943, i11, i12, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:58)");
        }
        if (i19 < 0) {
            throw new IllegalArgumentException(g0.c("beyondBoundsPageCount should be greater than or equal to 0, you selected ", i19).toString());
        }
        OverscrollEffect overscrollEffect = ScrollableDefaults.INSTANCE.overscrollEffect(composerStartRestartGroup, 6);
        int i20 = i11 >> 3;
        int i21 = i20 & 14;
        int i22 = i19;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged4 = composerStartRestartGroup.changed(state);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (!zChanged4) {
            i14 = i20;
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceableGroup();
            function0 = (Function0) objRememberedValue4;
            i15 = i21 | ((i12 >> 9) & 112) | ((i12 << 3) & 896);
            composerStartRestartGroup.startReplaceableGroup(-1372505274);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1372505274, i15, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:234)");
            }
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(pageContent, composerStartRestartGroup, (i15 >> 3) & 14);
            objArr = new Object[]{state, stateRememberUpdatedState, function1, function0};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            i17 = 0;
            zChanged = false;
            for (i16 = 4; i17 < i16; i16 = 4) {
                zChanged |= composerStartRestartGroup.changed(objArr[i17]);
                i17++;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final State stateDerivedStateOf = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new b0.e(SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new b0.d(stateRememberUpdatedState, function1, function0)), state));
                objRememberedValue = new PropertyReference0Impl(stateDerivedStateOf) { // from class: b0.c
                    @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                    @Nullable
                    public final Object get() {
                        return ((State) this.receiver).getValue();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            KProperty0 kProperty0 = (KProperty0) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged2 = composerStartRestartGroup.changed(state);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new b(state);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            i18 = i11 & 112;
            int i23 = i11 & 7168;
            int i24 = i11 & 57344;
            int i25 = i11 >> 6;
            int i26 = i12 << 18;
            int i27 = i14;
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2M452rememberPagerMeasurePolicyBxUkNYg = PagerMeasurePolicyKt.m452rememberPagerMeasurePolicyBxUkNYg(kProperty0, state, contentPadding, z10, orientation, i22, fM4389constructorimpl, pageSize, horizontalAlignment, verticalAlignment, (Function0) objRememberedValue2, composerStartRestartGroup, i18 | (i11 & 896) | i23 | i24 | (i25 & 458752) | (i25 & 3670016) | (i25 & 29360128) | (234881024 & i26) | (i26 & 1879048192), 0);
            int i28 = i11 >> 15;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged3 = composerStartRestartGroup.changed(flingBehavior) | composerStartRestartGroup.changed(state);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new PagerWrapperFlingBehavior(flingBehavior, state);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            PagerWrapperFlingBehavior pagerWrapperFlingBehavior = (PagerWrapperFlingBehavior) objRememberedValue3;
            composerStartRestartGroup.startReplaceableGroup(1445586192);
            if (z11) {
                Modifier.Companion companion = Modifier.INSTANCE;
                if (orientation == Orientation.Vertical) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                modifierPagerSemantics = PagerKt.pagerSemantics(companion, state, z13, composerStartRestartGroup, i18 | 6);
            } else {
                modifierPagerSemantics = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (orientation == Orientation.Vertical) {
                z12 = true;
            } else {
                z12 = false;
            }
            LazyLayoutKt.LazyLayout(kProperty0, NestedScrollModifierKt.nestedScroll$default(ScrollableKt.scrollable(OverscrollKt.overscroll(PagerBeyondBoundsModifierKt.pagerBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()).then(modifierPagerSemantics), kProperty0, PagerSemanticsKt.rememberPagerSemanticState(state, z10, z12, composerStartRestartGroup, i21 | (i25 & 112)), orientation, z11, z10, composerStartRestartGroup, (i27 & 7168) | (i25 & 57344) | ((i11 << 6) & 458752)), orientation), state, i22, z10, orientation, composerStartRestartGroup, i18 | (i28 & 896) | i23 | i24), overscrollEffect), state, orientation, overscrollEffect, z11, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, z10), pagerWrapperFlingBehavior, state.getInternalInteractionSource()).then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, state, new b0.b(state, null))), pageNestedScrollConnection, null, 2, null), state.getPrefetchState(), function2M452rememberPagerMeasurePolicyBxUkNYg, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier, state, contentPadding, z10, orientation, flingBehavior, z11, i22, fM4389constructorimpl, pageSize, pageNestedScrollConnection, function1, horizontalAlignment, verticalAlignment, pageContent, i11, i12, i13));
        }
        i14 = i20;
        objRememberedValue4 = new c(state);
        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        composerStartRestartGroup.endReplaceableGroup();
        function0 = (Function0) objRememberedValue4;
        i15 = i21 | ((i12 >> 9) & 112) | ((i12 << 3) & 896);
        composerStartRestartGroup.startReplaceableGroup(-1372505274);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1372505274, i15, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:234)");
        }
        stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(pageContent, composerStartRestartGroup, (i15 >> 3) & 14);
        objArr = new Object[]{state, stateRememberUpdatedState, function1, function0};
        composerStartRestartGroup.startReplaceableGroup(-568225417);
        i17 = 0;
        zChanged = false;
        while (i17 < i16) {
            zChanged |= composerStartRestartGroup.changed(objArr[i17]);
            i17++;
        }
        objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged) {
            final State stateDerivedStateOf2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new b0.e(SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new b0.d(stateRememberUpdatedState, function1, function0)), state));
            objRememberedValue = new PropertyReference0Impl(stateDerivedStateOf2) { // from class: b0.c
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                @Nullable
                public final Object get() {
                    return ((State) this.receiver).getValue();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        } else {
            final State stateDerivedStateOf3 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new b0.e(SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new b0.d(stateRememberUpdatedState, function1, function0)), state));
            objRememberedValue = new PropertyReference0Impl(stateDerivedStateOf3) { // from class: b0.c
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                @Nullable
                public final Object get() {
                    return ((State) this.receiver).getValue();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        KProperty0 kProperty1 = (KProperty0) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        zChanged2 = composerStartRestartGroup.changed(state);
        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2) {
            objRememberedValue2 = new b(state);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        } else {
            objRememberedValue2 = new b(state);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        i18 = i11 & 112;
        int i29 = i11 & 7168;
        int i210 = i11 & 57344;
        int i211 = i11 >> 6;
        int i212 = i12 << 18;
        int i213 = i14;
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2M452rememberPagerMeasurePolicyBxUkNYg2 = PagerMeasurePolicyKt.m452rememberPagerMeasurePolicyBxUkNYg(kProperty1, state, contentPadding, z10, orientation, i22, fM4389constructorimpl, pageSize, horizontalAlignment, verticalAlignment, (Function0) objRememberedValue2, composerStartRestartGroup, i18 | (i11 & 896) | i29 | i210 | (i211 & 458752) | (i211 & 3670016) | (i211 & 29360128) | (234881024 & i212) | (i212 & 1879048192), 0);
        int i214 = i11 >> 15;
        composerStartRestartGroup.startReplaceableGroup(511388516);
        zChanged3 = composerStartRestartGroup.changed(flingBehavior) | composerStartRestartGroup.changed(state);
        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged3) {
            objRememberedValue3 = new PagerWrapperFlingBehavior(flingBehavior, state);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        } else {
            objRememberedValue3 = new PagerWrapperFlingBehavior(flingBehavior, state);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        PagerWrapperFlingBehavior pagerWrapperFlingBehavior2 = (PagerWrapperFlingBehavior) objRememberedValue3;
        composerStartRestartGroup.startReplaceableGroup(1445586192);
        if (z11) {
            Modifier.Companion companion2 = Modifier.INSTANCE;
            if (orientation == Orientation.Vertical) {
                z13 = true;
            } else {
                z13 = false;
            }
            modifierPagerSemantics = PagerKt.pagerSemantics(companion2, state, z13, composerStartRestartGroup, i18 | 6);
        } else {
            modifierPagerSemantics = Modifier.INSTANCE;
        }
        composerStartRestartGroup.endReplaceableGroup();
        if (orientation == Orientation.Vertical) {
            z12 = true;
        } else {
            z12 = false;
        }
        LazyLayoutKt.LazyLayout(kProperty1, NestedScrollModifierKt.nestedScroll$default(ScrollableKt.scrollable(OverscrollKt.overscroll(PagerBeyondBoundsModifierKt.pagerBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier()).then(modifierPagerSemantics), kProperty1, PagerSemanticsKt.rememberPagerSemanticState(state, z10, z12, composerStartRestartGroup, i21 | (i211 & 112)), orientation, z11, z10, composerStartRestartGroup, (i213 & 7168) | (i211 & 57344) | ((i11 << 6) & 458752)), orientation), state, i22, z10, orientation, composerStartRestartGroup, i18 | (i214 & 896) | i29 | i210), overscrollEffect), state, orientation, overscrollEffect, z11, ScrollableDefaults.INSTANCE.reverseDirection((LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, z10), pagerWrapperFlingBehavior2, state.getInternalInteractionSource()).then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, state, new b0.b(state, null))), pageNestedScrollConnection, null, 2, null), state.getPrefetchState(), function2M452rememberPagerMeasurePolicyBxUkNYg2, composerStartRestartGroup, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier, state, contentPadding, z10, orientation, flingBehavior, z11, i22, fM4389constructorimpl, pageSize, pageNestedScrollConnection, function1, horizontalAlignment, verticalAlignment, pageContent, i11, i12, i13));
    }
}
