package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.HandleReferencePoint;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidCursorHandle.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u001a:\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0013\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u0006H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\f\u0010\r\u001a\u00020\u0002*\u00020\u0002H\u0000\"\u001d\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u001d\u0010\u0016\u001a\u00020\u000e8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "handlePosition", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "CursorHandle-ULxng0E", "(JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "CursorHandle", "DefaultCursorHandle", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "drawCursorHandle", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getCursorHandleHeight", "()F", "CursorHandleHeight", "b", "getCursorHandleWidth", "CursorHandleWidth", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,81:1\n154#2:82\n88#3:83\n71#3:84\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt\n*L\n35#1:82\n36#1:83\n36#1:84\n*E\n"})
public final class AndroidCursorHandle_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f5636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f5637b;

    /* JADX INFO: compiled from: AndroidCursorHandle.android.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f5638p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f5639q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f5640r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, Modifier modifier, Function2 function2) {
            super(2);
            this.f5638p0 = function2;
            this.f5639q0 = modifier;
            this.f5640r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1458480226, iIntValue, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:46)");
                }
                int i10 = this.f5640r0;
                Function2<Composer, Integer, Unit> function2 = this.f5638p0;
                if (function2 == null) {
                    composer2.startReplaceableGroup(1275643833);
                    AndroidCursorHandle_androidKt.DefaultCursorHandle(this.f5639q0, composer2, (i10 >> 3) & 14);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(1275643903);
                    function2.invoke(composer2, Integer.valueOf((i10 >> 6) & 14));
                    composer2.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidCursorHandle.android.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f5641p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f5642q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f5643r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f5644s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(long j10, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f5641p0 = j10;
            this.f5642q0 = modifier;
            this.f5643r0 = function2;
            this.f5644s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AndroidCursorHandle_androidKt.m485CursorHandleULxng0E(this.f5641p0, this.f5642q0, this.f5643r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5644s0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidCursorHandle.android.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f5645p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f5646q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Modifier modifier, int i10) {
            super(2);
            this.f5645p0 = modifier;
            this.f5646q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f5646q0 | 1);
            AndroidCursorHandle_androidKt.DefaultCursorHandle(this.f5645p0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidCursorHandle.android.kt */
    @SourceDebugExtension({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,81:1\n76#2:82\n36#3:83\n1097#4,6:84\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1\n*L\n63#1:82\n65#1:83\n65#1:84,6\n*E\n"})
    public static final class d extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f5647p0 = new d(3);

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Modifier modifier2 = modifier;
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier2, "$this$composed", composer2, -2126899193);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2126899193, iA, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:61)");
            }
            long handleColor = ((TextSelectionColors) composer2.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getHandleColor();
            Modifier.Companion companion = Modifier.INSTANCE;
            Color colorM2498boximpl = Color.m2498boximpl(handleColor);
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged = composer2.changed(colorM2498boximpl);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new androidx.compose.foundation.text.b(handleColor);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            Modifier modifierThen = modifier2.then(DrawModifierKt.drawWithCache(companion, (Function1) objRememberedValue));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierThen;
        }
    }

    static {
        float fM4389constructorimpl = Dp.m4389constructorimpl(25);
        f5636a = fM4389constructorimpl;
        f5637b = Dp.m4389constructorimpl(Dp.m4389constructorimpl(fM4389constructorimpl * 2.0f) / 2.4142137f);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: CursorHandle-ULxng0E, reason: not valid java name */
    public static final void m485CursorHandleULxng0E(long j10, @NotNull Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-5185995);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-5185995, i11, -1, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:38)");
            }
            AndroidSelectionHandles_androidKt.m596HandlePopupULxng0E(j10, HandleReferencePoint.TopMiddle, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1458480226, true, new a(i11, modifier, function2)), composerStartRestartGroup, (i11 & 14) | 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(j10, modifier, function2, i10));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DefaultCursorHandle(@NotNull Modifier modifier, @Nullable Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(694251107);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(694251107, i10, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:57)");
            }
            SpacerKt.Spacer(drawCursorHandle(SizeKt.m337sizeVpY3zN4(modifier, f5637b, f5636a)), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier, i10));
    }

    @NotNull
    public static final Modifier drawCursorHandle(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed$default(modifier, null, d.f5647p0, 1, null);
    }

    public static final float getCursorHandleHeight() {
        return f5636a;
    }

    public static final float getCursorHandleWidth() {
        return f5637b;
    }
}
