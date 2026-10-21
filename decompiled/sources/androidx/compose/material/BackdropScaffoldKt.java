package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BackdropScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001aG\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aõ\u0001\u0010(\u001a\u00020\u000e2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u00172\b\b\u0002\u0010\"\u001a\u00020\u001c2\b\b\u0002\u0010#\u001a\u00020\u001c2\b\b\u0002\u0010$\u001a\u00020\u001c2\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\u0005¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+²\u0006\f\u0010)\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\f\u0010*\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/BackdropValue;", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/material/BackdropScaffoldState;", "rememberBackdropScaffoldState", "(Landroidx/compose/material/BackdropValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BackdropScaffoldState;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "appBar", "backLayerContent", "frontLayerContent", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "gesturesEnabled", "Landroidx/compose/ui/unit/Dp;", "peekHeight", "headerHeight", "persistentAppBar", "stickyFrontLayer", "Landroidx/compose/ui/graphics/Color;", "backLayerBackgroundColor", "backLayerContentColor", "Landroidx/compose/ui/graphics/Shape;", "frontLayerShape", "frontLayerElevation", "frontLayerBackgroundColor", "frontLayerContentColor", "frontLayerScrimColor", "snackbarHost", "BackdropScaffold-BZszfkY", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BackdropScaffoldState;ZFFZZJJLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BackdropScaffold", "alpha", "animationProgress", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,522:1\n25#2:523\n36#2:533\n36#2:541\n50#2:548\n49#2:549\n456#2,8:575\n464#2,3:589\n456#2,8:610\n464#2,3:624\n467#2,3:628\n456#2,8:650\n464#2,3:664\n467#2,3:668\n467#2,3:673\n67#2,3:678\n66#2:681\n1097#3,6:524\n1097#3,6:534\n1097#3,6:542\n1097#3,6:550\n1097#3,6:682\n76#4:530\n76#4:532\n76#4:556\n1#5:531\n646#6:540\n65#7,7:557\n72#7:592\n66#7,6:593\n72#7:627\n76#7:632\n66#7,6:633\n72#7:667\n76#7:672\n76#7:677\n78#8,11:564\n78#8,11:599\n91#8:631\n78#8,11:639\n91#8:671\n91#8:676\n4144#9,6:583\n4144#9,6:618\n4144#9,6:658\n81#10:688\n81#10:689\n154#11:690\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt\n*L\n172#1:523\n289#1:533\n394#1:541\n402#1:548\n402#1:549\n430#1:575,8\n430#1:589,3\n431#1:610,8\n431#1:624,3\n431#1:628,3\n439#1:650,8\n439#1:664,3\n439#1:668,3\n430#1:673,3\n458#1:678,3\n458#1:681\n172#1:524,6\n289#1:534,6\n394#1:542,6\n402#1:550,6\n458#1:682,6\n276#1:530\n277#1:532\n425#1:556\n388#1:540\n430#1:557,7\n430#1:592\n431#1:593,6\n431#1:627\n431#1:632\n439#1:633,6\n439#1:667\n439#1:672\n430#1:677\n430#1:564,11\n431#1:599,11\n431#1:631\n439#1:639,11\n439#1:671\n430#1:676\n430#1:583,6\n431#1:618,6\n439#1:658,6\n389#1:688\n422#1:689\n521#1:690\n*E\n"})
public final class BackdropScaffoldKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f6720a = Dp.m4389constructorimpl(20);

    /* JADX INFO: compiled from: BackdropScaffold.kt */
    @SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,522:1\n486#2,4:523\n490#2,2:531\n494#2:537\n25#3:527\n1097#4,3:528\n1100#4,3:534\n486#5:533\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$1\n*L\n298#1:523,4\n298#1:531,2\n298#1:537\n298#1:527\n298#1:528,3\n298#1:534,3\n298#1:533\n*E\n"})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ long E0;
        public final /* synthetic */ long F0;
        public final /* synthetic */ float G0;
        public final /* synthetic */ int H0;
        public final /* synthetic */ float I0;
        public final /* synthetic */ float J0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> K0;
        public final /* synthetic */ long L0;
        public final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> M0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6721p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6722q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<Constraints, Constraints> f6723r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f6724s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f6725t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f6726u0;
        public final /* synthetic */ BackdropScaffoldState v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ float f6727w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f6728x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Shape f6729y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Modifier modifier, ComposableLambda composableLambda, Function1 function1, float f6, boolean z10, boolean z11, BackdropScaffoldState backdropScaffoldState, float f10, int i10, Shape shape, long j10, long j11, float f11, int i11, float f12, float f13, Function2 function2, long j12, Function3 function3) {
            super(2);
            this.f6721p0 = modifier;
            this.f6722q0 = composableLambda;
            this.f6723r0 = function1;
            this.f6724s0 = f6;
            this.f6725t0 = z10;
            this.f6726u0 = z11;
            this.v0 = backdropScaffoldState;
            this.f6727w0 = f10;
            this.f6728x0 = i10;
            this.f6729y0 = shape;
            this.E0 = j10;
            this.F0 = j11;
            this.G0 = f11;
            this.H0 = i11;
            this.I0 = f12;
            this.J0 = f13;
            this.K0 = function2;
            this.L0 = j12;
            this.M0 = function3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1049909631, iIntValue, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:296)");
                }
                Object objB = androidx.databinding.c.b(composer2, 773894976, -492369756);
                if (objB == Composer.INSTANCE.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                }
                composer2.endReplaceableGroup();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composer2.endReplaceableGroup();
                BackdropScaffoldKt.access$BackdropStack(SizeKt.fillMaxSize$default(this.f6721p0, 0.0f, 1, null), this.f6722q0, this.f6723r0, ComposableLambdaKt.composableLambda(composer2, 1800047509, true, new s(this.f6724s0, this.f6725t0, this.f6726u0, this.v0, this.f6727w0, this.f6728x0, this.f6729y0, this.E0, this.F0, this.G0, this.H0, this.I0, coroutineScope, this.J0, this.K0, this.L0, this.M0)), composer2, 3120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BackdropScaffold.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ long E0;
        public final /* synthetic */ long F0;
        public final /* synthetic */ Shape G0;
        public final /* synthetic */ float H0;
        public final /* synthetic */ long I0;
        public final /* synthetic */ long J0;
        public final /* synthetic */ long K0;
        public final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> L0;
        public final /* synthetic */ int M0;
        public final /* synthetic */ int N0;
        public final /* synthetic */ int O0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6730p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6731q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6732r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6733s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ BackdropScaffoldState f6734t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f6735u0;
        public final /* synthetic */ float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ float f6736w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ boolean f6737x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ boolean f6738y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Modifier modifier, BackdropScaffoldState backdropScaffoldState, boolean z10, float f6, float f10, boolean z11, boolean z12, long j10, long j11, Shape shape, float f11, long j12, long j13, long j14, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function5, int i10, int i11, int i12) {
            super(2);
            this.f6730p0 = function2;
            this.f6731q0 = function3;
            this.f6732r0 = function4;
            this.f6733s0 = modifier;
            this.f6734t0 = backdropScaffoldState;
            this.f6735u0 = z10;
            this.v0 = f6;
            this.f6736w0 = f10;
            this.f6737x0 = z11;
            this.f6738y0 = z12;
            this.E0 = j10;
            this.F0 = j11;
            this.G0 = shape;
            this.H0 = f11;
            this.I0 = j12;
            this.J0 = j13;
            this.K0 = j14;
            this.L0 = function5;
            this.M0 = i10;
            this.N0 = i11;
            this.O0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            BackdropScaffoldKt.m666BackdropScaffoldBZszfkY(this.f6730p0, this.f6731q0, this.f6732r0, this.f6733s0, this.f6734t0, this.f6735u0, this.v0, this.f6736w0, this.f6737x0, this.f6738y0, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, this.L0, composer, RecomposeScopeImplKt.updateChangedFlags(this.M0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.N0), this.O0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BackdropScaffold.kt */
    @SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$backLayer$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,522:1\n71#2,7:523\n78#2:558\n82#2:563\n78#3,11:530\n91#3:562\n456#4,8:541\n464#4,3:555\n467#4,3:559\n4144#5,6:549\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$backLayer$1\n*L\n281#1:523,7\n281#1:558\n281#1:563\n281#1:530,11\n281#1:562\n281#1:541,8\n281#1:555,3\n281#1:559,3\n281#1:549,6\n*E\n"})
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f6739p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ BackdropScaffoldState f6740q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6741r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6742s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f6743t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(boolean z10, BackdropScaffoldState backdropScaffoldState, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f6739p0 = z10;
            this.f6740q0 = backdropScaffoldState;
            this.f6741r0 = function2;
            this.f6742s0 = function3;
            this.f6743t0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1744778315, iIntValue, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:278)");
                }
                boolean z10 = this.f6739p0;
                Function2<Composer, Integer, Unit> function2 = this.f6742s0;
                int i10 = this.f6743t0;
                Function2<Composer, Integer, Unit> function3 = this.f6741r0;
                if (z10) {
                    composer2.startReplaceableGroup(-1017265331);
                    composer2.startReplaceableGroup(-483455358);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyA = androidx.camera.core.impl.v.a(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                    Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyA, composerM2074constructorimpl, currentCompositionLocalMap);
                    if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    function3.invoke(composer2, Integer.valueOf(i10 & 14));
                    function2.invoke(composer2, Integer.valueOf((i10 >> 3) & 14));
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(-1017265219);
                    int i11 = i10 << 3;
                    BackdropScaffoldKt.access$BackLayerTransition(this.f6740q0.getTargetValue(), function3, function2, composer2, (i11 & 896) | (i11 & 112));
                    composer2.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BackdropScaffold.kt */
    public static final class d extends Lambda implements Function1<Constraints, Constraints> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f6744p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f6) {
            super(1);
            this.f6744p0 = f6;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Constraints invoke(Constraints constraints) {
            return Constraints.m4346boximpl(ConstraintsKt.m4374offsetNN6EwU$default(Constraints.m4349copyZbe2FdA$default(constraints.getF18296a(), 0, 0, 0, 0, 10, null), 0, -mk.c.roundToInt(this.f6744p0), 1, null));
        }
    }

    /* JADX INFO: compiled from: BackdropScaffold.kt */
    public static final class e extends Lambda implements Function1<BackdropValue, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f6745p0 = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(BackdropValue backdropValue) {
            BackdropValue it = backdropValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: BackdropScaffold.kt */
    public static final class f extends Lambda implements Function0<BackdropScaffoldState> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ BackdropValue f6746p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ AnimationSpec<Float> f6747q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<BackdropValue, Boolean> f6748r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ SnackbarHostState f6749s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(BackdropValue backdropValue, AnimationSpec<Float> animationSpec, Function1<? super BackdropValue, Boolean> function1, SnackbarHostState snackbarHostState) {
            super(0);
            this.f6746p0 = backdropValue;
            this.f6747q0 = animationSpec;
            this.f6748r0 = function1;
            this.f6749s0 = snackbarHostState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final BackdropScaffoldState invoke() {
            return new BackdropScaffoldState(this.f6746p0, this.f6747q0, this.f6748r0, this.f6749s0);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r10v32 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v32 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v34 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v35 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v35 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r58v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r58v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r62v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r62v0 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r63v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r63v0 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v10 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v19 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v21 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v22 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r62v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r62v0 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r63v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r63v0 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v13 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: BackdropScaffold-BZszfkY, reason: not valid java name */
    public static final void m666BackdropScaffoldBZszfkY(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r54, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r56, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r57, @org.jetbrains.annotations.Nullable androidx.compose.material.BackdropScaffoldState r58, boolean r59, float r60, float r61, boolean r62, boolean r63, long r64, long r66, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r68, float r69, long r70, long r72, long r74, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r76, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r77, int r78, int r79, int r80) {
        /*
            Method dump skipped, instruction units count: 1308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt.m666BackdropScaffoldBZszfkY(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, androidx.compose.material.BackdropScaffoldState, boolean, float, float, boolean, boolean, long, long, androidx.compose.ui.graphics.Shape, float, long, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void access$BackLayerTransition(BackdropValue backdropValue, Function2 function2, Function2 function3, Composer composer, int i10) {
        int i11;
        Function2 function4 = function3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-950970976);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(backdropValue) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function4) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-950970976, i12, -1, "androidx.compose.material.BackLayerTransition (BackdropScaffold.kt:414)");
            }
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(backdropValue == BackdropValue.Revealed ? 0.0f : 2.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
            float fMo415toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f6720a);
            float f6 = 1;
            float fCoerceIn = kotlin.ranges.c.coerceIn(stateAnimateFloatAsState.getValue().floatValue() - f6, 0.0f, 1.0f);
            float fCoerceIn2 = kotlin.ranges.c.coerceIn(f6 - stateAnimateFloatAsState.getValue().floatValue(), 0.0f, 1.0f);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, currentCompositionLocalMap);
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM2651graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m2651graphicsLayerAp8cVGQ$default(ZIndexModifierKt.zIndex(companion, fCoerceIn), 0.0f, 0.0f, fCoerceIn, 0.0f, (f6 - fCoerceIn) * fMo415toPx0680j_4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131051, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM2651graphicsLayerAp8cVGQ$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Function2 function2C2 = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl2, measurePolicyC2, composerM2074constructorimpl2, currentCompositionLocalMap2);
            if (composerM2074constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
            }
            ai.a.j(0, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 3) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM2651graphicsLayerAp8cVGQ$default2 = GraphicsLayerModifierKt.m2651graphicsLayerAp8cVGQ$default(ZIndexModifierKt.zIndex(companion, fCoerceIn2), 0.0f, 0.0f, fCoerceIn2, 0.0f, (f6 - fCoerceIn2) * (-fMo415toPx0680j_4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131051, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC3 = androidx.databinding.f.c(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM2651graphicsLayerAp8cVGQ$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Function2 function2C3 = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl3, measurePolicyC3, composerM2074constructorimpl3, currentCompositionLocalMap3);
            if (composerM2074constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash3, composerM2074constructorimpl3, currentCompositeKeyHash3, function2C3);
            }
            ai.a.j(0, function3ModifierMaterializerOf3, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            function4 = function3;
            function4.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 6) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h0.c(backdropValue, function2, function4, i10));
    }

    public static final void access$BackdropStack(Modifier modifier, Function2 function2, Function1 function1, Function4 function4, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1248995194);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function4) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1248995194, i11, -1, "androidx.compose.material.BackdropStack (BackdropScaffold.kt:451)");
            }
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            boolean zChanged = composerStartRestartGroup.changed(function2) | composerStartRestartGroup.changed(function1) | composerStartRestartGroup.changed(function4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new h0.f(i11, function2, function1, function4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (Function2) objRememberedValue, composerStartRestartGroup, i11 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h0.g(modifier, function2, function1, function4, i10));
    }

    /* JADX INFO: renamed from: access$Scrim-3J-VO9M, reason: not valid java name */
    public static final void m667access$Scrim3JVO9M(long j10, Function0 function0, boolean z10, Composer composer, int i10) {
        int i11;
        Modifier modifierPointerInput;
        Composer composerStartRestartGroup = composer.startRestartGroup(-92141505);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-92141505, i11, -1, "androidx.compose.material.Scrim (BackdropScaffold.kt:382)");
            }
            if (j10 != Color.INSTANCE.m2544getUnspecified0d7_KjU()) {
                State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z10 ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                composerStartRestartGroup.startReplaceableGroup(1010547004);
                if (z10) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Unit unit = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    boolean zChanged = composerStartRestartGroup.changed(function0);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new h0.j(function0, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, unit, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue);
                } else {
                    modifierPointerInput = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifierPointerInput);
                Color colorM2498boximpl = Color.m2498boximpl(j10);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                boolean zChanged2 = composerStartRestartGroup.changed(colorM2498boximpl) | composerStartRestartGroup.changed(stateAnimateFloatAsState);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new h0.h(j10, stateAnimateFloatAsState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h0.i(j10, function0, z10, i10));
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final BackdropScaffoldState rememberBackdropScaffoldState(@NotNull BackdropValue initialValue, @Nullable AnimationSpec<Float> animationSpec, @Nullable Function1<? super BackdropValue, Boolean> function1, @Nullable SnackbarHostState snackbarHostState, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-862178912);
        if ((i11 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i11 & 4) != 0) {
            function1 = e.f6745p0;
        }
        if ((i11 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) objRememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-862178912, i10, -1, "androidx.compose.material.rememberBackdropScaffoldState (BackdropScaffold.kt:167)");
        }
        BackdropScaffoldState backdropScaffoldState = (BackdropScaffoldState) RememberSaveableKt.m2165rememberSaveable(new Object[]{animationSpec, function1, snackbarHostState}, (Saver) BackdropScaffoldState.INSTANCE.Saver(animationSpec, function1, snackbarHostState), (String) null, (Function0) new f(initialValue, animationSpec, function1, snackbarHostState), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return backdropScaffoldState;
    }
}
