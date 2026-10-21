package androidx.compose.material3;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bbva.nativesettings.common.Constants;
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

/* JADX INFO: compiled from: TouchExplorationStateProvider.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/State;", "", "touchExplorationState", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTouchExplorationStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/TouchExplorationStateProvider_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,107:1\n76#2:108\n76#2:123\n25#3:109\n25#3:116\n25#3:124\n1114#4,6:110\n1114#4,6:117\n1114#4,6:125\n*S KotlinDebug\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/TouchExplorationStateProvider_androidKt\n*L\n42#1:108\n49#1:123\n43#1:109\n47#1:116\n60#1:124\n43#1:110,6\n47#1:117,6\n60#1:125,6\n*E\n"})
public final class TouchExplorationStateProvider_androidKt {

    /* JADX INFO: compiled from: TouchExplorationStateProvider.android.kt */
    public static final class a extends Lambda implements Function1<Lifecycle.Event, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f12623p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Lifecycle.Event event) {
            Lifecycle.Event it = event;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TouchExplorationStateProvider.android.kt */
    public static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f12624p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TouchExplorationStateProvider.android.kt */
    @SourceDebugExtension({"SMAP\nTouchExplorationStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/TouchExplorationStateProvider_androidKt$ObserveState$3\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,107:1\n62#2,5:108\n*S KotlinDebug\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/TouchExplorationStateProvider_androidKt$ObserveState$3\n*L\n73#1:108,5\n*E\n"})
    public static final class c extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f12625p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Lifecycle.Event, Unit> f12626q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f12627r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Lifecycle lifecycle, Function1<? super Lifecycle.Event, Unit> function1, Function0<Unit> function0) {
            super(1);
            this.f12625p0 = lifecycle;
            this.f12626q0 = function1;
            this.f12627r0 = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final j5 j5Var = new j5(this.f12626q0);
            final Lifecycle lifecycle = this.f12625p0;
            lifecycle.addObserver(j5Var);
            final Function0<Unit> function0 = this.f12627r0;
            return new DisposableEffectResult() { // from class: androidx.compose.material3.TouchExplorationStateProvider_androidKt$ObserveState$3$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    function0.invoke();
                    lifecycle.removeObserver(j5Var);
                }
            };
        }
    }

    /* JADX INFO: compiled from: TouchExplorationStateProvider.android.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f12628p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Lifecycle.Event, Unit> f12629q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f12630r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f12631s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f12632t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Lifecycle lifecycle, Function1<? super Lifecycle.Event, Unit> function1, Function0<Unit> function0, int i10, int i11) {
            super(2);
            this.f12628p0 = lifecycle;
            this.f12629q0 = function1;
            this.f12630r0 = function0;
            this.f12631s0 = i10;
            this.f12632t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TouchExplorationStateProvider_androidKt.a(this.f12628p0, this.f12629q0, this.f12630r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f12631s0 | 1), this.f12632t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TouchExplorationStateProvider.android.kt */
    public static final class e extends Lambda implements Function1<Lifecycle.Event, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ l0.d2 f12633p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ AccessibilityManager f12634q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l0.d2 d2Var, AccessibilityManager accessibilityManager) {
            super(1);
            this.f12633p0 = d2Var;
            this.f12634q0 = accessibilityManager;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Lifecycle.Event event) {
            Lifecycle.Event event2 = event;
            Intrinsics.checkNotNullParameter(event2, "event");
            if (event2 == Lifecycle.Event.ON_RESUME) {
                l0.d2 d2Var = this.f12633p0;
                d2Var.getClass();
                AccessibilityManager am2 = this.f12634q0;
                Intrinsics.checkNotNullParameter(am2, "am");
                d2Var.f82488p0.setValue(Boolean.valueOf(am2.isEnabled()));
                d2Var.f82489q0.setValue(Boolean.valueOf(am2.isTouchExplorationEnabled()));
                am2.addTouchExplorationStateChangeListener(d2Var);
                am2.addAccessibilityStateChangeListener(d2Var);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TouchExplorationStateProvider.android.kt */
    public static final class f extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ l0.d2 f12635p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ AccessibilityManager f12636q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(l0.d2 d2Var, AccessibilityManager accessibilityManager) {
            super(0);
            this.f12635p0 = d2Var;
            this.f12636q0 = accessibilityManager;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            l0.d2 d2Var = this.f12635p0;
            d2Var.getClass();
            AccessibilityManager am2 = this.f12636q0;
            Intrinsics.checkNotNullParameter(am2, "am");
            am2.removeTouchExplorationStateChangeListener(d2Var);
            am2.removeAccessibilityStateChangeListener(d2Var);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TouchExplorationStateProvider.android.kt */
    public static final class g extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ l0.d2 f12637p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(l0.d2 d2Var) {
            super(0);
            this.f12637p0 = d2Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            l0.d2 d2Var = this.f12637p0;
            return Boolean.valueOf(((Boolean) d2Var.f82488p0.getValue()).booleanValue() && ((Boolean) d2Var.f82489q0.getValue()).booleanValue());
        }
    }

    @Composable
    public static final void a(Lifecycle lifecycle, Function1<? super Lifecycle.Event, Unit> function1, Function0<Unit> function0, Composer composer, int i10, int i11) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1703772404);
        if ((i11 & 1) != 0) {
            function1 = a.f12623p0;
        }
        Function1<? super Lifecycle.Event, Unit> function2 = function1;
        if ((i11 & 2) != 0) {
            function0 = b.f12624p0;
        }
        Function0<Unit> function3 = function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1703772404, i10, -1, "androidx.compose.material3.ObserveState (TouchExplorationStateProvider.android.kt:63)");
        }
        EffectsKt.DisposableEffect(lifecycle, new c(lifecycle, function2, function3), composerStartRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(lifecycle, function2, function3, i10, i11));
    }

    @Composable
    @NotNull
    public static final State<Boolean> touchExplorationState(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-906157724);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-906157724, i10, -1, "androidx.compose.material3.touchExplorationState (TouchExplorationStateProvider.android.kt:40)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            Object systemService = context.getSystemService(Constants.ACCESSIBILITY);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            objRememberedValue = (AccessibilityManager) systemService;
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        AccessibilityManager accessibilityManager = (AccessibilityManager) objRememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new l0.d2();
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        l0.d2 d2Var = (l0.d2) objRememberedValue2;
        a(((LifecycleOwner) composer.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle(), new e(d2Var, accessibilityManager), new f(d2Var, accessibilityManager), composer, 8, 0);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt.derivedStateOf(new g(d2Var));
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        State<Boolean> state = (State) objRememberedValue3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return state;
    }
}
