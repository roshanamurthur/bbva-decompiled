package androidx.compose.ui.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import com.vierge.bluetoothlibrary.BluetoothState;
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

/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001aZ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001f\b\u0002\u0010\u0004\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\t2\u001d\u0010\n\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a9\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001d\u0010\n\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\r\u001ab\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001f\b\u0002\u0010\u0004\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\t2\u001d\u0010\n\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001d\u0010\n\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"SubcomposeLayout", "", "modifier", "Landroidx/compose/ui/Modifier;", "intermediateMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/SubcomposeIntermediateMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "measurePolicy", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "state", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "(Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "SubcomposeSlotReusePolicy", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "maxSlotsToRetainForReuse", "", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1063:1\n25#2:1064\n25#2:1071\n251#2,8:1078\n259#2,2:1092\n36#2:1094\n1097#3,6:1065\n1097#3,6:1072\n1097#3,6:1095\n4144#4,6:1086\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt\n*L\n78#1:1064\n140#1:1071\n324#1:1078,8\n324#1:1092,2\n346#1:1094\n78#1:1065,6\n140#1:1072,6\n346#1:1095,6\n337#1:1086,6\n*E\n"})
public final class SubcomposeLayoutKt {

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SubcomposeLayoutState f16663p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SubcomposeLayoutState subcomposeLayoutState) {
            super(0);
            this.f16663p0 = subcomposeLayoutState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f16663p0.forceRecomposeChildren$ui_release();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$11$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1063:1\n63#2,5:1064\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$11$1\n*L\n347#1:1064,5\n*E\n"})
    public static final class b extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ State<SubcomposeLayoutState> f16664p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(State<SubcomposeLayoutState> state) {
            super(1);
            this.f16664p0 = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final State<SubcomposeLayoutState> state = this.f16664p0;
            return new DisposableEffectResult() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$11$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    ((SubcomposeLayoutState) state.getValue()).disposeCurrentNodes$ui_release();
                }
            };
        }
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SubcomposeLayoutState f16665p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f16666q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<SubcomposeIntermediateMeasureScope, Constraints, MeasureResult> f16667r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<SubcomposeMeasureScope, Constraints, MeasureResult> f16668s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f16669t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f16670u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(SubcomposeLayoutState subcomposeLayoutState, Modifier modifier, Function2<? super SubcomposeIntermediateMeasureScope, ? super Constraints, ? extends MeasureResult> function2, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> function3, int i10, int i11) {
            super(2);
            this.f16665p0 = subcomposeLayoutState;
            this.f16666q0 = modifier;
            this.f16667r0 = function2;
            this.f16668s0 = function3;
            this.f16669t0 = i10;
            this.f16670u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SubcomposeLayoutKt.SubcomposeLayout(this.f16665p0, this.f16666q0, this.f16667r0, this.f16668s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f16669t0 | 1), this.f16670u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f16671p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<SubcomposeMeasureScope, Constraints, MeasureResult> f16672q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f16673r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f16674s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Modifier modifier, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> function2, int i10, int i11) {
            super(2);
            this.f16671p0 = modifier;
            this.f16672q0 = function2;
            this.f16673r0 = i10;
            this.f16674s0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f16673r0 | 1);
            SubcomposeLayoutKt.SubcomposeLayout(this.f16671p0, this.f16672q0, composer, iUpdateChangedFlags, this.f16674s0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public static final class e extends Lambda implements Function2<SubcomposeIntermediateMeasureScope, Constraints, MeasureResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f16675p0 = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final MeasureResult invoke(SubcomposeIntermediateMeasureScope subcomposeIntermediateMeasureScope, Constraints constraints) {
            SubcomposeIntermediateMeasureScope subcomposeIntermediateMeasureScope2 = subcomposeIntermediateMeasureScope;
            long f18296a = constraints.getF18296a();
            Intrinsics.checkNotNullParameter(subcomposeIntermediateMeasureScope2, "$this$null");
            return subcomposeIntermediateMeasureScope2.getLookaheadMeasurePolicy().invoke(subcomposeIntermediateMeasureScope2, Constraints.m4346boximpl(f18296a));
        }
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f16676p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<SubcomposeIntermediateMeasureScope, Constraints, MeasureResult> f16677q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<SubcomposeMeasureScope, Constraints, MeasureResult> f16678r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f16679s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f16680t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i10, int i11, Modifier modifier, Function2 function2, Function2 function3) {
            super(2);
            this.f16676p0 = modifier;
            this.f16677q0 = function2;
            this.f16678r0 = function3;
            this.f16679s0 = i10;
            this.f16680t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SubcomposeLayoutKt.SubcomposeLayout(this.f16676p0, this.f16677q0, this.f16678r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f16679s0 | 1), this.f16680t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public static final class g extends Lambda implements Function2<SubcomposeIntermediateMeasureScope, Constraints, MeasureResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f16681p0 = new g(2);

        @Override // kotlin.jvm.functions.Function2
        public final MeasureResult invoke(SubcomposeIntermediateMeasureScope subcomposeIntermediateMeasureScope, Constraints constraints) {
            SubcomposeIntermediateMeasureScope SubcomposeLayout = subcomposeIntermediateMeasureScope;
            long f18296a = constraints.getF18296a();
            Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
            return SubcomposeLayout.getLookaheadMeasurePolicy().invoke(SubcomposeLayout, Constraints.m4346boximpl(f18296a));
        }
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SubcomposeLayoutState f16682p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f16683q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<SubcomposeMeasureScope, Constraints, MeasureResult> f16684r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f16685s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f16686t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(SubcomposeLayoutState subcomposeLayoutState, Modifier modifier, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> function2, int i10, int i11) {
            super(2);
            this.f16682p0 = subcomposeLayoutState;
            this.f16683q0 = modifier;
            this.f16684r0 = function2;
            this.f16685s0 = i10;
            this.f16686t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SubcomposeLayoutKt.SubcomposeLayout(this.f16682p0, this.f16683q0, this.f16684r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f16685s0 | 1), this.f16686t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public static final class i extends Lambda implements Function2<SubcomposeIntermediateMeasureScope, Constraints, MeasureResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f16687p0 = new i(2);

        @Override // kotlin.jvm.functions.Function2
        public final MeasureResult invoke(SubcomposeIntermediateMeasureScope subcomposeIntermediateMeasureScope, Constraints constraints) {
            SubcomposeIntermediateMeasureScope subcomposeIntermediateMeasureScope2 = subcomposeIntermediateMeasureScope;
            long f18296a = constraints.getF18296a();
            Intrinsics.checkNotNullParameter(subcomposeIntermediateMeasureScope2, "$this$null");
            return subcomposeIntermediateMeasureScope2.getLookaheadMeasurePolicy().invoke(subcomposeIntermediateMeasureScope2, Constraints.m4346boximpl(f18296a));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SubcomposeLayout(@Nullable Modifier modifier, @NotNull Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> measurePolicy, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1298353104);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(measurePolicy) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1298353104, i12, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:72)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SubcomposeLayoutState();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objRememberedValue;
            int i14 = i12 << 3;
            SubcomposeLayout(subcomposeLayoutState, modifier, measurePolicy, composerStartRestartGroup, (i14 & 112) | 8 | (i14 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(modifier, measurePolicy, i10, i11));
    }

    @NotNull
    public static final SubcomposeSlotReusePolicy SubcomposeSlotReusePolicy(int i10) {
        return new androidx.compose.ui.layout.a(i10);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalComposeUiApi
    public static final void SubcomposeLayout(@Nullable Modifier modifier, @Nullable Function2<? super SubcomposeIntermediateMeasureScope, ? super Constraints, ? extends MeasureResult> function2, @NotNull Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> measurePolicy, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        Composer composerStartRestartGroup = composer.startRestartGroup(159215138);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(measurePolicy) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i14 != 0) {
                function2 = e.f16675p0;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(159215138, i12, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:130)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SubcomposeLayoutState();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objRememberedValue;
            int i15 = i12 << 3;
            SubcomposeLayout(subcomposeLayoutState, modifier, function2, measurePolicy, composerStartRestartGroup, (i15 & 112) | 8 | (i15 & 896) | (i15 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        Function2<? super SubcomposeIntermediateMeasureScope, ? super Constraints, ? extends MeasureResult> function3 = function2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, modifier2, function3, measurePolicy));
    }

    @Composable
    @UiComposable
    public static final void SubcomposeLayout(@NotNull SubcomposeLayoutState state, @Nullable Modifier modifier, @NotNull Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> measurePolicy, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        Composer composerStartRestartGroup = composer.startRestartGroup(-511989831);
        if ((i11 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-511989831, i10, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:254)");
        }
        SubcomposeLayout(state, modifier, g.f16681p0, measurePolicy, composerStartRestartGroup, (i10 & 112) | 392 | ((i10 << 3) & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h(state, modifier, measurePolicy, i10, i11));
    }

    @Composable
    @ExperimentalComposeUiApi
    @UiComposable
    public static final void SubcomposeLayout(@NotNull SubcomposeLayoutState state, @Nullable Modifier modifier, @Nullable Function2<? super SubcomposeIntermediateMeasureScope, ? super Constraints, ? extends MeasureResult> function2, @NotNull Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> measurePolicy, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        Composer composerStartRestartGroup = composer.startRestartGroup(2129414763);
        if ((i11 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Modifier modifier2 = modifier;
        if ((i11 & 4) != 0) {
            function2 = i.f16687p0;
        }
        Function2<? super SubcomposeIntermediateMeasureScope, ? super Constraints, ? extends MeasureResult> function3 = function2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2129414763, i10, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:310)");
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionContext compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier2);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        final Function0<LayoutNode> constructor$ui_release = LayoutNode.INSTANCE.getConstructor$ui_release();
        composerStartRestartGroup.startReplaceableGroup(1886828752);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$$inlined$ComposeNode$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final LayoutNode invoke() {
                    return constructor$ui_release.invoke();
                }
            });
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
        Updater.m2081setimpl(composerM2074constructorimpl, state, state.getSetRoot$ui_release());
        Updater.m2081setimpl(composerM2074constructorimpl, compositionContextRememberCompositionContext, state.getSetCompositionContext$ui_release());
        Updater.m2081setimpl(composerM2074constructorimpl, measurePolicy, state.getSetMeasurePolicy$ui_release());
        Updater.m2081setimpl(composerM2074constructorimpl, function3, state.getSetIntermediateMeasurePolicy$ui_release());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Updater.m2081setimpl(composerM2074constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
        }
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-607836798);
        if (!composerStartRestartGroup.getSkipping()) {
            EffectsKt.SideEffect(new a(state), composerStartRestartGroup, 0);
        }
        composerStartRestartGroup.endReplaceableGroup();
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(state, composerStartRestartGroup, 8);
        Unit unit = Unit.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new b(stateRememberUpdatedState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(state, modifier2, function3, measurePolicy, i10, i11));
    }
}
