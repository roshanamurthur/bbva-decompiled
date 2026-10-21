package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Surface.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ap\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0092\u0001\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u009a\u0001\u0010\u0012\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a \u0001\u0010\u0012\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00142\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010 \" \u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070!8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "color", "contentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "Landroidx/compose/foundation/BorderStroke;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "Surface-T9BRK9s", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Surface", "onClick", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Surface-o_FOJdg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "selected", "Surface-d85dljk", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "Lkotlin/Function1;", "onCheckedChange", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalAbsoluteTonalElevation", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalAbsoluteTonalElevation", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,491:1\n154#2:492\n154#2:493\n154#2:496\n154#2:497\n154#2:507\n154#2:508\n154#2:518\n154#2:519\n76#3:494\n76#3:505\n76#3:516\n76#3:527\n51#4:495\n51#4:506\n51#4:517\n51#4:528\n25#5:498\n25#5:509\n25#5:520\n1114#6,6:499\n1114#6,6:510\n1114#6,6:521\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt\n*L\n105#1:492\n106#1:493\n209#1:496\n210#1:497\n318#1:507\n319#1:508\n428#1:518\n429#1:519\n110#1:494\n215#1:505\n324#1:516\n434#1:527\n110#1:495\n215#1:506\n324#1:517\n434#1:528\n212#1:498\n321#1:509\n431#1:520\n212#1:499,6\n321#1:510,6\n431#1:521,6\n*E\n"})
public final class SurfaceKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<Dp> f11661a = CompositionLocalKt.compositionLocalOf$default(null, a.f11662p0, 1, null);

    /* JADX INFO: compiled from: Surface.kt */
    @SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$LocalAbsoluteTonalElevation$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,491:1\n154#2:492\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$LocalAbsoluteTonalElevation$1\n*L\n490#1:492\n*E\n"})
    public static final class a extends Lambda implements Function0<Dp> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f11662p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Dp invoke() {
            return Dp.m4387boximpl(Dp.m4389constructorimpl(0));
        }
    }

    /* JADX INFO: compiled from: Surface.kt */
    @SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,491:1\n67#2,6:492\n73#2:524\n77#2:529\n75#3:498\n76#3,11:500\n89#3:528\n76#4:499\n460#5,13:511\n473#5,3:525\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$1\n*L\n115#1:492,6\n115#1:524\n115#1:529\n115#1:498\n115#1:500,11\n115#1:528\n115#1:499\n115#1:511,13\n115#1:525,3\n*E\n"})
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11663p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Shape f11664q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f11665r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f11666s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f11667t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ BorderStroke f11668u0;
        public final /* synthetic */ float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11669w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Modifier modifier, Shape shape, long j10, float f6, int i10, BorderStroke borderStroke, float f10, Function2<? super Composer, ? super Integer, Unit> function2) {
            super(2);
            this.f11663p0 = modifier;
            this.f11664q0 = shape;
            this.f11665r0 = j10;
            this.f11666s0 = f6;
            this.f11667t0 = i10;
            this.f11668u0 = borderStroke;
            this.v0 = f10;
            this.f11669w0 = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-70914509, iIntValue, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:113)");
                }
                Modifier modifier = this.f11663p0;
                Shape shape = this.f11664q0;
                int i10 = this.f11667t0;
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(SurfaceKt.m1333access$surface8ww4TTg(modifier, shape, SurfaceKt.m1334access$surfaceColorAtElevationCLU3JFs(this.f11665r0, this.f11666s0, composer2, (i10 >> 6) & 14), this.f11668u0, this.v0), false, r3.f13089p0), Unit.INSTANCE, new s3(2, null));
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, true, composer2, 48, -1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierPointerInput);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, density));
                ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (androidx.appcompat.widget.g0.d(this.f11669w0, composer2, Integer.valueOf((i10 >> 21) & 14))) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Surface.kt */
    @SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,491:1\n67#2,6:492\n73#2:524\n77#2:529\n75#3:498\n76#3,11:500\n89#3:528\n76#4:499\n460#5,13:511\n473#5,3:525\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$3\n*L\n220#1:492,6\n220#1:524\n220#1:529\n220#1:498\n220#1:500,11\n220#1:528\n220#1:499\n220#1:511,13\n220#1:525,3\n*E\n"})
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function2<Composer, Integer, Unit> E0;
        public final /* synthetic */ int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11670p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Shape f11671q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f11672r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f11673s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f11674t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ BorderStroke f11675u0;
        public final /* synthetic */ float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f11676w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ boolean f11677x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f11678y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Modifier modifier, Shape shape, long j10, float f6, int i10, BorderStroke borderStroke, float f10, MutableInteractionSource mutableInteractionSource, boolean z10, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, int i11) {
            super(2);
            this.f11670p0 = modifier;
            this.f11671q0 = shape;
            this.f11672r0 = j10;
            this.f11673s0 = f6;
            this.f11674t0 = i10;
            this.f11675u0 = borderStroke;
            this.v0 = f10;
            this.f11676w0 = mutableInteractionSource;
            this.f11677x0 = z10;
            this.f11678y0 = function0;
            this.E0 = function2;
            this.F0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1279702876, iIntValue, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:218)");
                }
                Modifier modifierM146clickableO2vRcR0$default = ClickableKt.m146clickableO2vRcR0$default(SurfaceKt.m1333access$surface8ww4TTg(InteractiveComponentSizeKt.minimumInteractiveComponentSize(this.f11670p0), this.f11671q0, SurfaceKt.m1334access$surfaceColorAtElevationCLU3JFs(this.f11672r0, this.f11673s0, composer2, (this.f11674t0 >> 12) & 14), this.f11675u0, this.v0), this.f11676w0, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), this.f11677x0, null, null, this.f11678y0, 24, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, true, composer2, 48, -1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM146clickableO2vRcR0$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, density));
                ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (androidx.appcompat.widget.g0.d(this.E0, composer2, Integer.valueOf(this.F0 & 14))) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Surface.kt */
    @SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$5\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,491:1\n67#2,6:492\n73#2:524\n77#2:529\n75#3:498\n76#3,11:500\n89#3:528\n76#4:499\n460#5,13:511\n473#5,3:525\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$5\n*L\n329#1:492,6\n329#1:524\n329#1:529\n329#1:498\n329#1:500,11\n329#1:528\n329#1:499\n329#1:511,13\n329#1:525,3\n*E\n"})
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> E0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> F0;
        public final /* synthetic */ int G0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11679p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Shape f11680q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f11681r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f11682s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f11683t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ BorderStroke f11684u0;
        public final /* synthetic */ float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ boolean f11685w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f11686x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ boolean f11687y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Modifier modifier, Shape shape, long j10, float f6, int i10, BorderStroke borderStroke, float f10, boolean z10, MutableInteractionSource mutableInteractionSource, boolean z11, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, int i11) {
            super(2);
            this.f11679p0 = modifier;
            this.f11680q0 = shape;
            this.f11681r0 = j10;
            this.f11682s0 = f6;
            this.f11683t0 = i10;
            this.f11684u0 = borderStroke;
            this.v0 = f10;
            this.f11685w0 = z10;
            this.f11686x0 = mutableInteractionSource;
            this.f11687y0 = z11;
            this.E0 = function0;
            this.F0 = function2;
            this.G0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1164547968, iIntValue, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:327)");
                }
                Modifier modifierM459selectableO2vRcR0$default = SelectableKt.m459selectableO2vRcR0$default(SurfaceKt.m1333access$surface8ww4TTg(InteractiveComponentSizeKt.minimumInteractiveComponentSize(this.f11679p0), this.f11680q0, SurfaceKt.m1334access$surfaceColorAtElevationCLU3JFs(this.f11681r0, this.f11682s0, composer2, (this.f11683t0 >> 15) & 14), this.f11684u0, this.v0), this.f11685w0, this.f11686x0, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), this.f11687y0, null, this.E0, 16, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, true, composer2, 48, -1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM459selectableO2vRcR0$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, density));
                ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (androidx.appcompat.widget.g0.d(this.F0, composer2, Integer.valueOf((this.G0 >> 3) & 14))) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Surface.kt */
    @SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$7\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,491:1\n67#2,6:492\n73#2:524\n77#2:529\n75#3:498\n76#3,11:500\n89#3:528\n76#4:499\n460#5,13:511\n473#5,3:525\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$7\n*L\n439#1:492,6\n439#1:524\n439#1:529\n439#1:498\n439#1:500,11\n439#1:528\n439#1:499\n439#1:511,13\n439#1:525,3\n*E\n"})
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function1<Boolean, Unit> E0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> F0;
        public final /* synthetic */ int G0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11688p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Shape f11689q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f11690r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f11691s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f11692t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ BorderStroke f11693u0;
        public final /* synthetic */ float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ boolean f11694w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f11695x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ boolean f11696y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Modifier modifier, Shape shape, long j10, float f6, int i10, BorderStroke borderStroke, float f10, boolean z10, MutableInteractionSource mutableInteractionSource, boolean z11, Function1<? super Boolean, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function2, int i11) {
            super(2);
            this.f11688p0 = modifier;
            this.f11689q0 = shape;
            this.f11690r0 = j10;
            this.f11691s0 = f6;
            this.f11692t0 = i10;
            this.f11693u0 = borderStroke;
            this.v0 = f10;
            this.f11694w0 = z10;
            this.f11695x0 = mutableInteractionSource;
            this.f11696y0 = z11;
            this.E0 = function1;
            this.F0 = function2;
            this.G0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(712720927, iIntValue, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:437)");
                }
                Modifier modifierM463toggleableO2vRcR0$default = ToggleableKt.m463toggleableO2vRcR0$default(SurfaceKt.m1333access$surface8ww4TTg(InteractiveComponentSizeKt.minimumInteractiveComponentSize(this.f11688p0), this.f11689q0, SurfaceKt.m1334access$surfaceColorAtElevationCLU3JFs(this.f11690r0, this.f11691s0, composer2, (this.f11692t0 >> 15) & 14), this.f11693u0, this.v0), this.f11694w0, this.f11695x0, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), this.f11696y0, null, this.E0, 16, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, true, composer2, 48, -1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM463toggleableO2vRcR0$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, density));
                ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (androidx.appcompat.widget.g0.d(this.F0, composer2, Integer.valueOf((this.G0 >> 3) & 14))) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Surface-T9BRK9s, reason: not valid java name */
    public static final void m1329SurfaceT9BRK9s(@Nullable Modifier modifier, @Nullable Shape shape, long j10, long j11, float f6, float f10, @Nullable BorderStroke borderStroke, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-513881741);
        Modifier modifier2 = (i11 & 1) != 0 ? Modifier.INSTANCE : modifier;
        Shape rectangleShape = (i11 & 2) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        long jM978getSurface0d7_KjU = (i11 & 4) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m978getSurface0d7_KjU() : j10;
        long jM1014contentColorForek8zF_U = (i11 & 8) != 0 ? ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composer, (i10 >> 6) & 14) : j11;
        float fM4389constructorimpl = (i11 & 16) != 0 ? Dp.m4389constructorimpl(0) : f6;
        float fM4389constructorimpl2 = (i11 & 32) != 0 ? Dp.m4389constructorimpl(0) : f10;
        BorderStroke borderStroke2 = (i11 & 64) != 0 ? null : borderStroke;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-513881741, i10, -1, "androidx.compose.material3.Surface (Surface.kt:99)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = f11661a;
        float fM4389constructorimpl3 = Dp.m4389constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m4403unboximpl() + fM4389constructorimpl);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM1014contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m4387boximpl(fM4389constructorimpl3))}, ComposableLambdaKt.composableLambda(composer, -70914509, true, new b(modifier2, rectangleShape, jM978getSurface0d7_KjU, fM4389constructorimpl3, i10, borderStroke2, fM4389constructorimpl2, content)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m1330Surfaced85dljk(boolean z10, @NotNull Function0<Unit> onClick, @Nullable Modifier modifier, boolean z11, @Nullable Shape shape, long j10, long j11, float f6, float f10, @Nullable BorderStroke borderStroke, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11, int i12) {
        MutableInteractionSource mutableInteractionSource2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(540296512);
        Modifier modifier2 = (i12 & 4) != 0 ? Modifier.INSTANCE : modifier;
        boolean z12 = (i12 & 8) != 0 ? true : z11;
        Shape rectangleShape = (i12 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        long jM978getSurface0d7_KjU = (i12 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m978getSurface0d7_KjU() : j10;
        long jM1014contentColorForek8zF_U = (i12 & 64) != 0 ? ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composer, (i10 >> 15) & 14) : j11;
        float fM4389constructorimpl = (i12 & 128) != 0 ? Dp.m4389constructorimpl(0) : f6;
        float fM4389constructorimpl2 = (i12 & 256) != 0 ? Dp.m4389constructorimpl(0) : f10;
        BorderStroke borderStroke2 = (i12 & 512) != 0 ? null : borderStroke;
        if ((i12 & 1024) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(540296512, i10, i11, "androidx.compose.material3.Surface (Surface.kt:309)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = f11661a;
        float fM4389constructorimpl3 = Dp.m4389constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m4403unboximpl() + fM4389constructorimpl);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM1014contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m4387boximpl(fM4389constructorimpl3))}, ComposableLambdaKt.composableLambda(composer, -1164547968, true, new d(modifier2, rectangleShape, jM978getSurface0d7_KjU, fM4389constructorimpl3, i10, borderStroke2, fM4389constructorimpl2, z10, mutableInteractionSource2, z12, onClick, content, i11)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Surface-o_FOJdg, reason: not valid java name */
    public static final void m1332Surfaceo_FOJdg(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, boolean z10, @Nullable Shape shape, long j10, long j11, float f6, float f10, @Nullable BorderStroke borderStroke, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11, int i12) {
        MutableInteractionSource mutableInteractionSource2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-789752804);
        Modifier modifier2 = (i12 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z11 = (i12 & 4) != 0 ? true : z10;
        Shape rectangleShape = (i12 & 8) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        long jM978getSurface0d7_KjU = (i12 & 16) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m978getSurface0d7_KjU() : j10;
        long jM1014contentColorForek8zF_U = (i12 & 32) != 0 ? ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composer, (i10 >> 12) & 14) : j11;
        float fM4389constructorimpl = (i12 & 64) != 0 ? Dp.m4389constructorimpl(0) : f6;
        float fM4389constructorimpl2 = (i12 & 128) != 0 ? Dp.m4389constructorimpl(0) : f10;
        BorderStroke borderStroke2 = (i12 & 256) != 0 ? null : borderStroke;
        if ((i12 & 512) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-789752804, i10, i11, "androidx.compose.material3.Surface (Surface.kt:201)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = f11661a;
        float fM4389constructorimpl3 = Dp.m4389constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m4403unboximpl() + fM4389constructorimpl);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM1014contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m4387boximpl(fM4389constructorimpl3))}, ComposableLambdaKt.composableLambda(composer, 1279702876, true, new c(modifier2, rectangleShape, jM978getSurface0d7_KjU, fM4389constructorimpl3, i10, borderStroke2, fM4389constructorimpl2, mutableInteractionSource2, z11, onClick, content, i11)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    /* JADX INFO: renamed from: access$surface-8ww4TTg, reason: not valid java name */
    public static final Modifier m1333access$surface8ww4TTg(Modifier modifier, Shape shape, long j10, BorderStroke borderStroke, float f6) {
        return ClipKt.clip(BackgroundKt.m121backgroundbw27NRU(ShadowKt.m2202shadows4CzXII$default(modifier, f6, shape, false, 0L, 0L, 24, null).then(borderStroke != null ? BorderKt.border(Modifier.INSTANCE, borderStroke, shape) : Modifier.INSTANCE), j10, shape), shape);
    }

    /* JADX INFO: renamed from: access$surfaceColorAtElevation-CLU3JFs, reason: not valid java name */
    public static final long m1334access$surfaceColorAtElevationCLU3JFs(long j10, float f6, Composer composer, int i10) {
        composer.startReplaceableGroup(-2079918090);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079918090, i10, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:475)");
        }
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        if (Color.m2509equalsimpl0(j10, materialTheme.getColorScheme(composer, 6).m978getSurface0d7_KjU())) {
            j10 = ColorSchemeKt.m1019surfaceColorAtElevation3ABfNKs(materialTheme.getColorScheme(composer, 6), f6);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j10;
    }

    @NotNull
    public static final ProvidableCompositionLocal<Dp> getLocalAbsoluteTonalElevation() {
        return f11661a;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m1331Surfaced85dljk(boolean z10, @NotNull Function1<? super Boolean, Unit> onCheckedChange, @Nullable Modifier modifier, boolean z11, @Nullable Shape shape, long j10, long j11, float f6, float f10, @Nullable BorderStroke borderStroke, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11, int i12) {
        MutableInteractionSource mutableInteractionSource2;
        Intrinsics.checkNotNullParameter(onCheckedChange, "onCheckedChange");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1877401889);
        Modifier modifier2 = (i12 & 4) != 0 ? Modifier.INSTANCE : modifier;
        boolean z12 = (i12 & 8) != 0 ? true : z11;
        Shape rectangleShape = (i12 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        long jM978getSurface0d7_KjU = (i12 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m978getSurface0d7_KjU() : j10;
        long jM1014contentColorForek8zF_U = (i12 & 64) != 0 ? ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composer, (i10 >> 15) & 14) : j11;
        float fM4389constructorimpl = (i12 & 128) != 0 ? Dp.m4389constructorimpl(0) : f6;
        float fM4389constructorimpl2 = (i12 & 256) != 0 ? Dp.m4389constructorimpl(0) : f10;
        BorderStroke borderStroke2 = (i12 & 512) != 0 ? null : borderStroke;
        if ((i12 & 1024) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877401889, i10, i11, "androidx.compose.material3.Surface (Surface.kt:419)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = f11661a;
        float fM4389constructorimpl3 = Dp.m4389constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m4403unboximpl() + fM4389constructorimpl);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM1014contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m4387boximpl(fM4389constructorimpl3))}, ComposableLambdaKt.composableLambda(composer, 712720927, true, new e(modifier2, rectangleShape, jM978getSurface0d7_KjU, fM4389constructorimpl3, i10, borderStroke2, fM4389constructorimpl2, z10, mutableInteractionSource2, z12, onCheckedChange, content, i11)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
