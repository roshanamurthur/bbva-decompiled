package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowInsetsAnimationController;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x.o;
import x.u1;
import x.v1;

/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Landroidx/compose/ui/Modifier;", "imeNestedScroll", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "side", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "rememberWindowInsetsConnection-VRgvIgI", "(Landroidx/compose/foundation/layout/AndroidWindowInsets;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "rememberWindowInsetsConnection", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,724:1\n135#2:725\n76#3:726\n76#3:727\n76#3:728\n83#4,3:729\n1097#5,6:732\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n*L\n77#1:725\n113#1:726\n115#1:727\n116#1:728\n117#1:729,3\n117#1:732,6\n*E\n"})
public final class WindowInsetsConnection_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f4411a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f4412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f4413c;

    /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
    public static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f4414p0 = new a(3);

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Modifier modifier2 = modifier;
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier2, "$this$composed", composer2, -369978792);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-369978792, iA, -1, "androidx.compose.foundation.layout.imeNestedScroll.<anonymous> (WindowInsetsConnection.android.kt:79)");
            }
            Modifier modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifier2, WindowInsetsConnection_androidKt.m343rememberWindowInsetsConnectionVRgvIgI(WindowInsetsHolder.INSTANCE.current(composer2, 8).getIme(), WindowInsetsSides.INSTANCE.m359getBottomJoeWqyM(), composer2, 48), null, 2, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierNestedScroll$default;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
    @SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,724:1\n63#2,5:725\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1\n*L\n121#1:725,5\n*E\n"})
    public static final class b extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ u1 f4415p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u1 u1Var) {
            super(1);
            this.f4415p0 = u1Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final u1 u1Var = this.f4415p0;
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    u1 u1Var2 = u1Var;
                    CancellableContinuation<? super WindowInsetsAnimationController> cancellableContinuation = u1Var2.f94415y0;
                    if (cancellableContinuation != null) {
                        cancellableContinuation.resume(null, v1.f94463p0);
                    }
                    Job job = u1Var2.f94414x0;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    WindowInsetsAnimationController windowInsetsAnimationController = u1Var2.f94411t0;
                    if (windowInsetsAnimationController != null) {
                        windowInsetsAnimationController.finish(!Intrinsics.areEqual(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
                    }
                }
            };
        }
    }

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f4412b = dLog;
        f4413c = dLog - 1.0d;
    }

    @ExperimentalLayoutApi
    @NotNull
    public static final Modifier imeNestedScroll(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        if (Build.VERSION.SDK_INT < 30) {
            return modifier;
        }
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$imeNestedScroll$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("imeNestedScroll");
            }
        } : InspectableValueKt.getNoInspectorInfo(), a.f4414p0);
    }

    @Composable
    @ExperimentalLayoutApi
    @NotNull
    /* JADX INFO: renamed from: rememberWindowInsetsConnection-VRgvIgI, reason: not valid java name */
    public static final NestedScrollConnection m343rememberWindowInsetsConnectionVRgvIgI(@NotNull AndroidWindowInsets windowInsets, int i10, @Nullable Composer composer, int i11) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        composer.startReplaceableGroup(-1011341039);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1011341039, i11, -1, "androidx.compose.foundation.layout.rememberWindowInsetsConnection (WindowInsetsConnection.android.kt:105)");
        }
        if (Build.VERSION.SDK_INT < 30) {
            o oVar = o.f94379p0;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return oVar;
        }
        SideCalculator sideCalculatorM318chooseCalculatorni1skBw = SideCalculator.f4358a.m318chooseCalculatorni1skBw(i10, (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection()));
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = {windowInsets, view, sideCalculatorM318chooseCalculatorni1skBw, density};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i12 = 0; i12 < 4; i12++) {
            zChanged |= composer.changed(objArr[i12]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new u1(windowInsets, view, sideCalculatorM318chooseCalculatorni1skBw, density);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        u1 u1Var = (u1) objRememberedValue;
        EffectsKt.DisposableEffect(u1Var, new b(u1Var), composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return u1Var;
    }
}
