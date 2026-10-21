package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.FabPrimaryLargeTokens;
import androidx.compose.material3.tokens.FabPrimarySmallTokens;
import androidx.compose.material3.tokens.FabPrimaryTokens;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u001ar\u0010\u0012\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001ar\u0010\u0014\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0011\u001ar\u0010\u0016\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0011\u001a}\u0010\u001c\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u008f\u0001\u0010\u001c\u001a\u00020\u00012\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000e2\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/material3/FloatingActionButtonElevation;", "elevation", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/runtime/Composable;", "content", "FloatingActionButton-X-z6DiA", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FloatingActionButton", "SmallFloatingActionButton-X-z6DiA", "SmallFloatingActionButton", "LargeFloatingActionButton-X-z6DiA", "LargeFloatingActionButton", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "ExtendedFloatingActionButton-X-z6DiA", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ExtendedFloatingActionButton", "text", "icon", "", "expanded", "ExtendedFloatingActionButton-ElI5-7k", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,619:1\n25#2:620\n25#2:627\n25#2:634\n25#2:641\n25#2:648\n1114#3,6:621\n1114#3,6:628\n1114#3,6:635\n1114#3,6:642\n1114#3,6:649\n154#4:655\n154#4:656\n154#4:657\n154#4:658\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt\n*L\n103#1:620\n171#1:627\n223#1:634\n278#1:641\n348#1:648\n103#1:621,6\n171#1:628,6\n223#1:635,6\n278#1:642,6\n348#1:649,6\n585#1:655\n587#1:656\n589#1:657\n591#1:658\n*E\n"})
public final class FloatingActionButtonKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f10299a = Dp.m4389constructorimpl(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f10300b = Dp.m4389constructorimpl(12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f10301c = Dp.m4389constructorimpl(20);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f10302d = Dp.m4389constructorimpl(80);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final ExitTransition f10303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final EnterTransition f10304f;

    /* JADX INFO: compiled from: FloatingActionButton.kt */
    @SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$2\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,619:1\n79#2,2:620\n81#2:648\n85#2:653\n75#3:622\n76#3,11:624\n89#3:652\n76#4:623\n460#5,13:635\n473#5,3:649\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$2\n*L\n290#1:620,2\n290#1:648\n290#1:653\n290#1:622\n290#1:624,11\n290#1:652\n290#1:623\n290#1:635,13\n290#1:649,3\n*E\n"})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f10305p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f10306q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f10305p0 = function3;
            this.f10306q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(398457247, iIntValue, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:288)");
                }
                Modifier modifierM298paddingVpY3zN4$default = PaddingKt.m298paddingVpY3zN4$default(SizeKt.m339sizeInqDBjuR0$default(Modifier.INSTANCE, FloatingActionButtonKt.f10302d, 0.0f, 0.0f, 0.0f, 14, null), FloatingActionButtonKt.f10301c, 0.0f, 2, null);
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                int i10 = ((this.f10306q0 >> 12) & 7168) | 438;
                composer2.startReplaceableGroup(693286680);
                int i11 = i10 >> 3;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, (i11 & 112) | (i11 & 14));
                Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM298paddingVpY3zN4$default);
                int i12 = ((((i10 << 3) & 112) << 9) & 7168) | 6;
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
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, density));
                ai.a.j((i12 >> 3) & 112, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                this.f10305p0.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i10 >> 6) & 112) | 6));
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButton.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f10307p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10308q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Shape f10309r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f10310s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f10311t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ FloatingActionButtonElevation f10312u0;
        public final /* synthetic */ MutableInteractionSource v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f10313w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f10314x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f10315y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function0<Unit> function0, Modifier modifier, Shape shape, long j10, long j11, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f10307p0 = function0;
            this.f10308q0 = modifier;
            this.f10309r0 = shape;
            this.f10310s0 = j10;
            this.f10311t0 = j11;
            this.f10312u0 = floatingActionButtonElevation;
            this.v0 = mutableInteractionSource;
            this.f10313w0 = function3;
            this.f10314x0 = i10;
            this.f10315y0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            FloatingActionButtonKt.m1126ExtendedFloatingActionButtonXz6DiA(this.f10307p0, this.f10308q0, this.f10309r0, this.f10310s0, this.f10311t0, this.f10312u0, this.v0, this.f10313w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10314x0 | 1), this.f10315y0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButton.kt */
    @SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$5\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,619:1\n154#2:620\n154#2:621\n79#3,2:622\n81#3:650\n85#3:655\n75#4:624\n76#4,11:626\n89#4:654\n76#5:625\n460#6,13:637\n473#6,3:651\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$5\n*L\n359#1:620\n360#1:621\n362#1:622,2\n362#1:650\n362#1:655\n362#1:624\n362#1:626,11\n362#1:654\n362#1:625\n362#1:637,13\n362#1:651,3\n*E\n"})
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f10316p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10317q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f10318r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10319s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, Function2 function2, Function2 function3, boolean z10) {
            super(2);
            this.f10316p0 = z10;
            this.f10317q0 = function2;
            this.f10318r0 = i10;
            this.f10319s0 = function3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1172118032, iIntValue, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:357)");
                }
                boolean z10 = this.f10316p0;
                Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(SizeKt.m339sizeInqDBjuR0$default(Modifier.INSTANCE, z10 ? FloatingActionButtonKt.f10302d : FabPrimaryTokens.INSTANCE.m1676getContainerWidthD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), z10 ? FloatingActionButtonKt.f10299a : Dp.m4389constructorimpl(0), 0.0f, z10 ? FloatingActionButtonKt.f10301c : Dp.m4389constructorimpl(0), 0.0f, 10, null);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Arrangement.Horizontal start = z10 ? Arrangement.INSTANCE.getStart() : Arrangement.INSTANCE.getCenter();
                boolean z11 = this.f10316p0;
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 48);
                Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM300paddingqDBjuR0$default);
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
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, density));
                ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i10 = this.f10318r0;
                this.f10317q0.invoke(composer2, Integer.valueOf((i10 >> 3) & 14));
                AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, z11, (Modifier) null, FloatingActionButtonKt.f10304f, FloatingActionButtonKt.f10303e, (String) null, ComposableLambdaKt.composableLambda(composer2, 176242764, true, new l1(i10, this.f10319s0)), composer2, 1600518 | ((i10 >> 9) & 112), 18);
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButton.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;
        public final /* synthetic */ int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10320p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10321q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f10322r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10323s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f10324t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Shape f10325u0;
        public final /* synthetic */ long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ long f10326w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ FloatingActionButtonElevation f10327x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f10328y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function0<Unit> function0, Modifier modifier, boolean z10, Shape shape, long j10, long j11, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, int i10, int i11) {
            super(2);
            this.f10320p0 = function2;
            this.f10321q0 = function3;
            this.f10322r0 = function0;
            this.f10323s0 = modifier;
            this.f10324t0 = z10;
            this.f10325u0 = shape;
            this.v0 = j10;
            this.f10326w0 = j11;
            this.f10327x0 = floatingActionButtonElevation;
            this.f10328y0 = mutableInteractionSource;
            this.E0 = i10;
            this.F0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            FloatingActionButtonKt.m1125ExtendedFloatingActionButtonElI57k(this.f10320p0, this.f10321q0, this.f10322r0, this.f10323s0, this.f10324t0, this.f10325u0, this.v0, this.f10326w0, this.f10327x0, this.f10328y0, composer, RecomposeScopeImplKt.updateChangedFlags(this.E0 | 1), this.F0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButton.kt */
    public static final class e extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f10329p0 = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.m3843setRolekuIjeqM(semantics, Role.INSTANCE.m3831getButtono7Vup1c());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButton.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f10330p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10331q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f10332r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(long j10, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f10330p0 = j10;
            this.f10331q0 = function2;
            this.f10332r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1249316354, iIntValue, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:114)");
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(this.f10330p0))}, ComposableLambdaKt.composableLambda(composer2, -945978686, true, new n1(this.f10332r0, this.f10331q0)), composer2, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButton.kt */
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f10333p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10334q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Shape f10335r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f10336s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f10337t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ FloatingActionButtonElevation f10338u0;
        public final /* synthetic */ MutableInteractionSource v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10339w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f10340x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f10341y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function0<Unit> function0, Modifier modifier, Shape shape, long j10, long j11, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f10333p0 = function0;
            this.f10334q0 = modifier;
            this.f10335r0 = shape;
            this.f10336s0 = j10;
            this.f10337t0 = j11;
            this.f10338u0 = floatingActionButtonElevation;
            this.v0 = mutableInteractionSource;
            this.f10339w0 = function2;
            this.f10340x0 = i10;
            this.f10341y0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            FloatingActionButtonKt.m1127FloatingActionButtonXz6DiA(this.f10333p0, this.f10334q0, this.f10335r0, this.f10336s0, this.f10337t0, this.f10338u0, this.v0, this.f10339w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10340x0 | 1), this.f10341y0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButton.kt */
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f10342p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10343q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Shape f10344r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f10345s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f10346t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ FloatingActionButtonElevation f10347u0;
        public final /* synthetic */ MutableInteractionSource v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10348w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f10349x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f10350y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Function0<Unit> function0, Modifier modifier, Shape shape, long j10, long j11, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f10342p0 = function0;
            this.f10343q0 = modifier;
            this.f10344r0 = shape;
            this.f10345s0 = j10;
            this.f10346t0 = j11;
            this.f10347u0 = floatingActionButtonElevation;
            this.v0 = mutableInteractionSource;
            this.f10348w0 = function2;
            this.f10349x0 = i10;
            this.f10350y0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            FloatingActionButtonKt.m1128LargeFloatingActionButtonXz6DiA(this.f10342p0, this.f10343q0, this.f10344r0, this.f10345s0, this.f10346t0, this.f10347u0, this.v0, this.f10348w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10349x0 | 1), this.f10350y0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButton.kt */
    public static final class i extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f10351p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10352q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Shape f10353r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f10354s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f10355t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ FloatingActionButtonElevation f10356u0;
        public final /* synthetic */ MutableInteractionSource v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10357w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f10358x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f10359y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(Function0<Unit> function0, Modifier modifier, Shape shape, long j10, long j11, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f10351p0 = function0;
            this.f10352q0 = modifier;
            this.f10353r0 = shape;
            this.f10354s0 = j10;
            this.f10355t0 = j11;
            this.f10356u0 = floatingActionButtonElevation;
            this.v0 = mutableInteractionSource;
            this.f10357w0 = function2;
            this.f10358x0 = i10;
            this.f10359y0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            FloatingActionButtonKt.m1129SmallFloatingActionButtonXz6DiA(this.f10351p0, this.f10352q0, this.f10353r0, this.f10354s0, this.f10355t0, this.f10356u0, this.v0, this.f10357w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10358x0 | 1), this.f10359y0);
            return Unit.INSTANCE;
        }
    }

    static {
        MotionTokens motionTokens = MotionTokens.INSTANCE;
        ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, motionTokens.getEasingLinearCubicBezier(), 2, null), 0.0f, 2, null);
        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(500, 0, motionTokens.getEasingEmphasizedCubicBezier(), 2, null);
        Alignment.Companion companion = Alignment.INSTANCE;
        f10303e = exitTransitionFadeOut$default.plus(EnterExitTransitionKt.shrinkHorizontally$default(tweenSpecTween$default, companion.getStart(), false, null, 12, null));
        f10304f = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween(200, 100, motionTokens.getEasingLinearCubicBezier()), 0.0f, 2, null).plus(EnterExitTransitionKt.expandHorizontally$default(AnimationSpecKt.tween$default(500, 0, motionTokens.getEasingEmphasizedCubicBezier(), 2, null), companion.getStart(), false, null, 12, null));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:104:0x012d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0130  */
    /* JADX WARN: Code duplicated, block: B:109:0x013e  */
    /* JADX WARN: Code duplicated, block: B:113:0x015d  */
    /* JADX WARN: Code duplicated, block: B:115:0x016d  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:135:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:149:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:150:0x0202  */
    /* JADX WARN: Code duplicated, block: B:152:0x0205  */
    /* JADX WARN: Code duplicated, block: B:154:0x0217  */
    /* JADX WARN: Code duplicated, block: B:157:0x022f  */
    /* JADX WARN: Code duplicated, block: B:160:0x023b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0293  */
    /* JADX WARN: Code duplicated, block: B:168:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108  */
    /* JADX WARN: Code duplicated, block: B:93:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0112  */
    /* JADX WARN: Code duplicated, block: B:99:0x0118  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: ExtendedFloatingActionButton-ElI5-7k, reason: not valid java name */
    public static final void m1125ExtendedFloatingActionButtonElI57k(@NotNull Function2<? super Composer, ? super Integer, Unit> text, @NotNull Function2<? super Composer, ? super Integer, Unit> icon, @NotNull Function0<Unit> onClick, @Nullable Modifier modifier, boolean z10, @Nullable Shape shape, long j10, long j11, @Nullable FloatingActionButtonElevation floatingActionButtonElevation, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Composer composer, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        long containerColor;
        long jM1014contentColorForek8zF_U;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        int i15;
        int i16;
        Modifier modifier2;
        boolean z11;
        Shape extendedFabShape;
        FloatingActionButtonElevation floatingActionButtonElevationM1122elevationxZ9QkE;
        MutableInteractionSource mutableInteractionSource2;
        boolean z12;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        Shape shape2;
        long j12;
        long j13;
        Object objRememberedValue;
        Modifier modifier3;
        Shape shape3;
        long j14;
        FloatingActionButtonElevation floatingActionButtonElevation4;
        boolean z13;
        long j15;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i17;
        int i18;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1387401842);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(text) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(icon) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        int i19 = i11 & 8;
        if (i19 == 0) {
            if ((i10 & 7168) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                if ((i10 & 458752) != 0) {
                    i12 |= ((i11 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
                }
                if ((i10 & 3670016) == 0) {
                    containerColor = j10;
                    if ((i11 & 64) == 0 || !composerStartRestartGroup.changed(containerColor)) {
                        i18 = 524288;
                    } else {
                        i18 = 1048576;
                    }
                    i12 |= i18;
                } else {
                    containerColor = j10;
                }
                if ((i10 & 29360128) == 0) {
                    jM1014contentColorForek8zF_U = j11;
                    if ((i11 & 128) == 0 || !composerStartRestartGroup.changed(jM1014contentColorForek8zF_U)) {
                        i17 = 4194304;
                    } else {
                        i17 = 8388608;
                    }
                    i12 |= i17;
                } else {
                    jM1014contentColorForek8zF_U = j11;
                }
                if ((i10 & 234881024) == 0) {
                    if ((i11 & 256) == 0) {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                        int i20 = composerStartRestartGroup.changed(floatingActionButtonElevation2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        i12 |= i20;
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    i12 |= i20;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i15 = i11 & 512;
                if (i15 != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i16 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i16 = 268435456;
                    }
                    i12 |= i16;
                }
                if ((i12 & 1533916891) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 32) != 0) {
                            extendedFabShape = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        } else {
                            extendedFabShape = shape;
                        }
                        if ((i11 & 64) != 0) {
                            containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 18) & 14);
                            i12 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i12 &= -234881025;
                        } else {
                            floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation2;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        z12 = z11;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM1122elevationxZ9QkE;
                        shape2 = extendedFabShape;
                        j12 = jM1014contentColorForek8zF_U;
                        j13 = containerColor;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                        }
                        modifier2 = modifier;
                        shape2 = shape;
                        mutableInteractionSource2 = mutableInteractionSource;
                        j12 = jM1014contentColorForek8zF_U;
                        j13 = containerColor;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                        z12 = z10;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1387401842, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:337)");
                    }
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1172118032, true, new c(i12, icon, text, z12));
                    int i21 = i12 >> 6;
                    int i22 = i12 >> 9;
                    boolean z14 = z12;
                    m1127FloatingActionButtonXz6DiA(onClick, modifier2, shape2, j13, j12, floatingActionButtonElevation3, mutableInteractionSource2, composableLambda, composerStartRestartGroup, (i21 & 112) | (i21 & 14) | 12582912 | (i22 & 896) | (i22 & 7168) | (57344 & i22) | (458752 & i22) | (i22 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    shape3 = shape2;
                    j14 = j13;
                    floatingActionButtonElevation4 = floatingActionButtonElevation3;
                    z13 = z14;
                    j15 = j12;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    z13 = z10;
                    shape3 = shape;
                    FloatingActionButtonElevation floatingActionButtonElevation5 = floatingActionButtonElevation2;
                    mutableInteractionSource3 = mutableInteractionSource;
                    floatingActionButtonElevation4 = floatingActionButtonElevation5;
                    j15 = jM1014contentColorForek8zF_U;
                    j14 = containerColor;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(text, icon, onClick, modifier3, z13, shape3, j14, j15, floatingActionButtonElevation4, mutableInteractionSource3, i10, i11));
            }
            i12 |= 24576;
            if ((i10 & 458752) != 0) {
                i12 |= ((i11 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
            }
            if ((i10 & 3670016) == 0) {
                containerColor = j10;
                if ((i11 & 64) == 0) {
                    i18 = 524288;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            } else {
                containerColor = j10;
            }
            if ((i10 & 29360128) == 0) {
                jM1014contentColorForek8zF_U = j11;
                if ((i11 & 128) == 0) {
                    i17 = 4194304;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            } else {
                jM1014contentColorForek8zF_U = j11;
            }
            if ((i10 & 234881024) == 0) {
                if ((i11 & 256) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                    }
                    i12 |= i20;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i12 |= i20;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            i15 = i11 & 512;
            if (i15 != 0) {
                i12 |= 805306368;
            } else if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i16 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i16 = 268435456;
                }
                i12 |= i16;
            }
            if ((i12 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 32) != 0) {
                        extendedFabShape = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        extendedFabShape = shape;
                    }
                    if ((i11 & 64) != 0) {
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 &= -234881025;
                    } else {
                        floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    z12 = z11;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM1122elevationxZ9QkE;
                    shape2 = extendedFabShape;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = containerColor;
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 32) != 0) {
                        extendedFabShape = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        extendedFabShape = shape;
                    }
                    if ((i11 & 64) != 0) {
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 &= -234881025;
                    } else {
                        floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    z12 = z11;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM1122elevationxZ9QkE;
                    shape2 = extendedFabShape;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = containerColor;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1387401842, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:337)");
                }
                ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1172118032, true, new c(i12, icon, text, z12));
                int i23 = i12 >> 6;
                int i24 = i12 >> 9;
                boolean z15 = z12;
                m1127FloatingActionButtonXz6DiA(onClick, modifier2, shape2, j13, j12, floatingActionButtonElevation3, mutableInteractionSource2, composableLambda2, composerStartRestartGroup, (i23 & 112) | (i23 & 14) | 12582912 | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (i24 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                shape3 = shape2;
                j14 = j13;
                floatingActionButtonElevation4 = floatingActionButtonElevation3;
                z13 = z15;
                j15 = j12;
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 32) != 0) {
                        extendedFabShape = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        extendedFabShape = shape;
                    }
                    if ((i11 & 64) != 0) {
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 &= -234881025;
                    } else {
                        floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    z12 = z11;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM1122elevationxZ9QkE;
                    shape2 = extendedFabShape;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = containerColor;
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 32) != 0) {
                        extendedFabShape = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        extendedFabShape = shape;
                    }
                    if ((i11 & 64) != 0) {
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 &= -234881025;
                    } else {
                        floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    z12 = z11;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM1122elevationxZ9QkE;
                    shape2 = extendedFabShape;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = containerColor;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1387401842, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:337)");
                }
                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1172118032, true, new c(i12, icon, text, z12));
                int i25 = i12 >> 6;
                int i26 = i12 >> 9;
                boolean z16 = z12;
                m1127FloatingActionButtonXz6DiA(onClick, modifier2, shape2, j13, j12, floatingActionButtonElevation3, mutableInteractionSource2, composableLambda3, composerStartRestartGroup, (i25 & 112) | (i25 & 14) | 12582912 | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (458752 & i26) | (i26 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                shape3 = shape2;
                j14 = j13;
                floatingActionButtonElevation4 = floatingActionButtonElevation3;
                z13 = z16;
                j15 = j12;
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(text, icon, onClick, modifier3, z13, shape3, j14, j15, floatingActionButtonElevation4, mutableInteractionSource3, i10, i11));
        }
        i12 |= 3072;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 57344) == 0) {
                if (composerStartRestartGroup.changed(z10)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((i10 & 458752) != 0) {
                i12 |= ((i11 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
            }
            if ((i10 & 3670016) == 0) {
                containerColor = j10;
                if ((i11 & 64) == 0) {
                    i18 = 524288;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            } else {
                containerColor = j10;
            }
            if ((i10 & 29360128) == 0) {
                jM1014contentColorForek8zF_U = j11;
                if ((i11 & 128) == 0) {
                    i17 = 4194304;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            } else {
                jM1014contentColorForek8zF_U = j11;
            }
            if ((i10 & 234881024) == 0) {
                if ((i11 & 256) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                    }
                    i12 |= i20;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i12 |= i20;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            i15 = i11 & 512;
            if (i15 != 0) {
                i12 |= 805306368;
            } else if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i16 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i16 = 268435456;
                }
                i12 |= i16;
            }
            if ((i12 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 32) != 0) {
                        extendedFabShape = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        extendedFabShape = shape;
                    }
                    if ((i11 & 64) != 0) {
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 &= -234881025;
                    } else {
                        floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    z12 = z11;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM1122elevationxZ9QkE;
                    shape2 = extendedFabShape;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = containerColor;
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 32) != 0) {
                        extendedFabShape = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        extendedFabShape = shape;
                    }
                    if ((i11 & 64) != 0) {
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 &= -234881025;
                    } else {
                        floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    z12 = z11;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM1122elevationxZ9QkE;
                    shape2 = extendedFabShape;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = containerColor;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1387401842, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:337)");
                }
                ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1172118032, true, new c(i12, icon, text, z12));
                int i27 = i12 >> 6;
                int i28 = i12 >> 9;
                boolean z17 = z12;
                m1127FloatingActionButtonXz6DiA(onClick, modifier2, shape2, j13, j12, floatingActionButtonElevation3, mutableInteractionSource2, composableLambda4, composerStartRestartGroup, (i27 & 112) | (i27 & 14) | 12582912 | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | (i28 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                shape3 = shape2;
                j14 = j13;
                floatingActionButtonElevation4 = floatingActionButtonElevation3;
                z13 = z17;
                j15 = j12;
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 32) != 0) {
                        extendedFabShape = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        extendedFabShape = shape;
                    }
                    if ((i11 & 64) != 0) {
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 &= -234881025;
                    } else {
                        floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    z12 = z11;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM1122elevationxZ9QkE;
                    shape2 = extendedFabShape;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = containerColor;
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 32) != 0) {
                        extendedFabShape = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    } else {
                        extendedFabShape = shape;
                    }
                    if ((i11 & 64) != 0) {
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 18) & 14);
                        i12 &= -29360129;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 &= -234881025;
                    } else {
                        floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    z12 = z11;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM1122elevationxZ9QkE;
                    shape2 = extendedFabShape;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = containerColor;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1387401842, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:337)");
                }
                ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1172118032, true, new c(i12, icon, text, z12));
                int i29 = i12 >> 6;
                int i210 = i12 >> 9;
                boolean z18 = z12;
                m1127FloatingActionButtonXz6DiA(onClick, modifier2, shape2, j13, j12, floatingActionButtonElevation3, mutableInteractionSource2, composableLambda5, composerStartRestartGroup, (i29 & 112) | (i29 & 14) | 12582912 | (i210 & 896) | (i210 & 7168) | (57344 & i210) | (458752 & i210) | (i210 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                shape3 = shape2;
                j14 = j13;
                floatingActionButtonElevation4 = floatingActionButtonElevation3;
                z13 = z18;
                j15 = j12;
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(text, icon, onClick, modifier3, z13, shape3, j14, j15, floatingActionButtonElevation4, mutableInteractionSource3, i10, i11));
        }
        i12 |= 24576;
        if ((i10 & 458752) != 0) {
            i12 |= ((i11 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
        }
        if ((i10 & 3670016) == 0) {
            containerColor = j10;
            if ((i11 & 64) == 0) {
                i18 = 524288;
            } else {
                i18 = 524288;
            }
            i12 |= i18;
        } else {
            containerColor = j10;
        }
        if ((i10 & 29360128) == 0) {
            jM1014contentColorForek8zF_U = j11;
            if ((i11 & 128) == 0) {
                i17 = 4194304;
            } else {
                i17 = 4194304;
            }
            i12 |= i17;
        } else {
            jM1014contentColorForek8zF_U = j11;
        }
        if ((i10 & 234881024) == 0) {
            if ((i11 & 256) == 0) {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
                if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                }
                i12 |= i20;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            i12 |= i20;
        } else {
            floatingActionButtonElevation2 = floatingActionButtonElevation;
        }
        i15 = i11 & 512;
        if (i15 != 0) {
            i12 |= 805306368;
        } else if ((i10 & 1879048192) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i16 = PKIFailureInfo.duplicateCertReq;
            } else {
                i16 = 268435456;
            }
            i12 |= i16;
        }
        if ((i12 & 1533916891) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 32) != 0) {
                    extendedFabShape = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composerStartRestartGroup, 6);
                    i12 &= -458753;
                } else {
                    extendedFabShape = shape;
                }
                if ((i11 & 64) != 0) {
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 18) & 14);
                    i12 &= -29360129;
                }
                if ((i11 & 256) != 0) {
                    floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i12 &= -234881025;
                } else {
                    floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation2;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                z12 = z11;
                floatingActionButtonElevation3 = floatingActionButtonElevationM1122elevationxZ9QkE;
                shape2 = extendedFabShape;
                j12 = jM1014contentColorForek8zF_U;
                j13 = containerColor;
            } else {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 32) != 0) {
                    extendedFabShape = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composerStartRestartGroup, 6);
                    i12 &= -458753;
                } else {
                    extendedFabShape = shape;
                }
                if ((i11 & 64) != 0) {
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 18) & 14);
                    i12 &= -29360129;
                }
                if ((i11 & 256) != 0) {
                    floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i12 &= -234881025;
                } else {
                    floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation2;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                z12 = z11;
                floatingActionButtonElevation3 = floatingActionButtonElevationM1122elevationxZ9QkE;
                shape2 = extendedFabShape;
                j12 = jM1014contentColorForek8zF_U;
                j13 = containerColor;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1387401842, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:337)");
            }
            ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1172118032, true, new c(i12, icon, text, z12));
            int i211 = i12 >> 6;
            int i212 = i12 >> 9;
            boolean z19 = z12;
            m1127FloatingActionButtonXz6DiA(onClick, modifier2, shape2, j13, j12, floatingActionButtonElevation3, mutableInteractionSource2, composableLambda6, composerStartRestartGroup, (i211 & 112) | (i211 & 14) | 12582912 | (i212 & 896) | (i212 & 7168) | (57344 & i212) | (458752 & i212) | (i212 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            shape3 = shape2;
            j14 = j13;
            floatingActionButtonElevation4 = floatingActionButtonElevation3;
            z13 = z19;
            j15 = j12;
            mutableInteractionSource3 = mutableInteractionSource2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 32) != 0) {
                    extendedFabShape = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composerStartRestartGroup, 6);
                    i12 &= -458753;
                } else {
                    extendedFabShape = shape;
                }
                if ((i11 & 64) != 0) {
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 18) & 14);
                    i12 &= -29360129;
                }
                if ((i11 & 256) != 0) {
                    floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i12 &= -234881025;
                } else {
                    floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation2;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                z12 = z11;
                floatingActionButtonElevation3 = floatingActionButtonElevationM1122elevationxZ9QkE;
                shape2 = extendedFabShape;
                j12 = jM1014contentColorForek8zF_U;
                j13 = containerColor;
            } else {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 32) != 0) {
                    extendedFabShape = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composerStartRestartGroup, 6);
                    i12 &= -458753;
                } else {
                    extendedFabShape = shape;
                }
                if ((i11 & 64) != 0) {
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i12 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 18) & 14);
                    i12 &= -29360129;
                }
                if ((i11 & 256) != 0) {
                    floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i12 &= -234881025;
                } else {
                    floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation2;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                z12 = z11;
                floatingActionButtonElevation3 = floatingActionButtonElevationM1122elevationxZ9QkE;
                shape2 = extendedFabShape;
                j12 = jM1014contentColorForek8zF_U;
                j13 = containerColor;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1387401842, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:337)");
            }
            ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1172118032, true, new c(i12, icon, text, z12));
            int i213 = i12 >> 6;
            int i214 = i12 >> 9;
            boolean z110 = z12;
            m1127FloatingActionButtonXz6DiA(onClick, modifier2, shape2, j13, j12, floatingActionButtonElevation3, mutableInteractionSource2, composableLambda7, composerStartRestartGroup, (i213 & 112) | (i213 & 14) | 12582912 | (i214 & 896) | (i214 & 7168) | (57344 & i214) | (458752 & i214) | (i214 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            shape3 = shape2;
            j14 = j13;
            floatingActionButtonElevation4 = floatingActionButtonElevation3;
            z13 = z110;
            j15 = j12;
            mutableInteractionSource3 = mutableInteractionSource2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(text, icon, onClick, modifier3, z13, shape3, j14, j15, floatingActionButtonElevation4, mutableInteractionSource3, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0152  */
    /* JADX WARN: Code duplicated, block: B:115:0x0155  */
    /* JADX WARN: Code duplicated, block: B:118:0x015c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0167  */
    /* JADX WARN: Code duplicated, block: B:122:0x016d  */
    /* JADX WARN: Code duplicated, block: B:125:0x017a  */
    /* JADX WARN: Code duplicated, block: B:126:0x018b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0193  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:142:0x0233  */
    /* JADX WARN: Code duplicated, block: B:147:0x0249  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:93:0x0114  */
    /* JADX WARN: Code duplicated, block: B:95:0x0121  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: ExtendedFloatingActionButton-X-z6DiA, reason: not valid java name */
    public static final void m1126ExtendedFloatingActionButtonXz6DiA(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, @Nullable Shape shape, long j10, long j11, @Nullable FloatingActionButtonElevation floatingActionButtonElevation, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Shape shape2;
        long containerColor;
        long j12;
        FloatingActionButtonElevation floatingActionButtonElevationM1122elevationxZ9QkE;
        int i13;
        MutableInteractionSource mutableInteractionSource2;
        int i14;
        int i15;
        Modifier modifier2;
        Shape extendedFabShape;
        int i16;
        long jM1014contentColorForek8zF_U;
        Modifier modifier3;
        Object objRememberedValue;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier4;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        Shape shape3;
        long j13;
        long j14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i17;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-326283107);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                if ((i11 & 4) == 0) {
                    shape2 = shape;
                    int i19 = composerStartRestartGroup.changed(shape2) ? 256 : 128;
                    i12 |= i19;
                } else {
                    shape2 = shape;
                }
                i12 |= i19;
            } else {
                shape2 = shape;
            }
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    containerColor = j10;
                    int i20 = composerStartRestartGroup.changed(containerColor) ? 2048 : 1024;
                    i12 |= i20;
                } else {
                    containerColor = j10;
                }
                i12 |= i20;
            } else {
                containerColor = j10;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    j12 = j11;
                    int i21 = composerStartRestartGroup.changed(j12) ? 16384 : 8192;
                    i12 |= i21;
                } else {
                    j12 = j11;
                }
                i12 |= i21;
            } else {
                j12 = j11;
            }
            if ((i10 & 458752) == 0) {
                floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation;
                if ((i11 & 32) == 0 || !composerStartRestartGroup.changed(floatingActionButtonElevationM1122elevationxZ9QkE)) {
                    i17 = 65536;
                } else {
                    i17 = 131072;
                }
                i12 |= i17;
            } else {
                floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                i12 |= 1572864;
                mutableInteractionSource2 = mutableInteractionSource;
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i12 |= i14;
                }
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((29360128 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i12 |= i15;
            }
            if ((23967451 & i12) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        extendedFabShape = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composerStartRestartGroup, 6);
                    } else {
                        extendedFabShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        modifier3 = modifier2;
                    }
                    FloatingActionButtonElevation floatingActionButtonElevation3 = floatingActionButtonElevationM1122elevationxZ9QkE;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-326283107, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:270)");
                    }
                    m1127FloatingActionButtonXz6DiA(onClick, modifier3, extendedFabShape, containerColor, jM1014contentColorForek8zF_U, floatingActionButtonElevation3, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 398457247, true, new a(content, i12)), composerStartRestartGroup, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    floatingActionButtonElevation2 = floatingActionButtonElevation3;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    shape3 = extendedFabShape;
                    j13 = jM1014contentColorForek8zF_U;
                    j14 = containerColor;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                    }
                    modifier3 = modifier;
                    extendedFabShape = shape2;
                    containerColor = containerColor;
                    jM1014contentColorForek8zF_U = j12;
                }
                mutableInteractionSource3 = mutableInteractionSource2;
                FloatingActionButtonElevation floatingActionButtonElevation4 = floatingActionButtonElevationM1122elevationxZ9QkE;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-326283107, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:270)");
                }
                m1127FloatingActionButtonXz6DiA(onClick, modifier3, extendedFabShape, containerColor, jM1014contentColorForek8zF_U, floatingActionButtonElevation4, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 398457247, true, new a(content, i12)), composerStartRestartGroup, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                floatingActionButtonElevation2 = floatingActionButtonElevation4;
                mutableInteractionSource2 = mutableInteractionSource3;
                shape3 = extendedFabShape;
                j13 = jM1014contentColorForek8zF_U;
                j14 = containerColor;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier;
                shape3 = shape2;
                j14 = containerColor;
                j13 = j12;
                floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(onClick, modifier4, shape3, j14, j13, floatingActionButtonElevation2, mutableInteractionSource2, content, i10, i11));
        }
        i12 |= 48;
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i12 |= i19;
            } else {
                shape2 = shape;
            }
            i12 |= i19;
        } else {
            shape2 = shape;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                containerColor = j10;
                if (composerStartRestartGroup.changed(containerColor)) {
                }
                i12 |= i20;
            } else {
                containerColor = j10;
            }
            i12 |= i20;
        } else {
            containerColor = j10;
        }
        if ((i10 & 57344) == 0) {
            if ((i11 & 16) == 0) {
                j12 = j11;
                if (composerStartRestartGroup.changed(j12)) {
                }
                i12 |= i21;
            } else {
                j12 = j11;
            }
            i12 |= i21;
        } else {
            j12 = j11;
        }
        if ((i10 & 458752) == 0) {
            floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation;
            if ((i11 & 32) == 0) {
                i17 = 65536;
            } else {
                i17 = 65536;
            }
            i12 |= i17;
        } else {
            floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation;
        }
        i13 = i11 & 64;
        if (i13 != 0) {
            i12 |= 1572864;
            mutableInteractionSource2 = mutableInteractionSource;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((29360128 & i10) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i12 |= i15;
        }
        if ((23967451 & i12) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    extendedFabShape = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composerStartRestartGroup, 6);
                } else {
                    extendedFabShape = shape2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jM1014contentColorForek8zF_U = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifier3 = modifier2;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    modifier3 = modifier2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            } else {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    extendedFabShape = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composerStartRestartGroup, 6);
                } else {
                    extendedFabShape = shape2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jM1014contentColorForek8zF_U = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifier3 = modifier2;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    modifier3 = modifier2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            }
            FloatingActionButtonElevation floatingActionButtonElevation5 = floatingActionButtonElevationM1122elevationxZ9QkE;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-326283107, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:270)");
            }
            m1127FloatingActionButtonXz6DiA(onClick, modifier3, extendedFabShape, containerColor, jM1014contentColorForek8zF_U, floatingActionButtonElevation5, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 398457247, true, new a(content, i12)), composerStartRestartGroup, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            floatingActionButtonElevation2 = floatingActionButtonElevation5;
            mutableInteractionSource2 = mutableInteractionSource3;
            shape3 = extendedFabShape;
            j13 = jM1014contentColorForek8zF_U;
            j14 = containerColor;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    extendedFabShape = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composerStartRestartGroup, 6);
                } else {
                    extendedFabShape = shape2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jM1014contentColorForek8zF_U = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifier3 = modifier2;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    modifier3 = modifier2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            } else {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    extendedFabShape = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composerStartRestartGroup, 6);
                } else {
                    extendedFabShape = shape2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jM1014contentColorForek8zF_U = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifier3 = modifier2;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    modifier3 = modifier2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            }
            FloatingActionButtonElevation floatingActionButtonElevation6 = floatingActionButtonElevationM1122elevationxZ9QkE;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-326283107, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:270)");
            }
            m1127FloatingActionButtonXz6DiA(onClick, modifier3, extendedFabShape, containerColor, jM1014contentColorForek8zF_U, floatingActionButtonElevation6, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 398457247, true, new a(content, i12)), composerStartRestartGroup, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            floatingActionButtonElevation2 = floatingActionButtonElevation6;
            mutableInteractionSource2 = mutableInteractionSource3;
            shape3 = extendedFabShape;
            j13 = jM1014contentColorForek8zF_U;
            j14 = containerColor;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(onClick, modifier4, shape3, j14, j13, floatingActionButtonElevation2, mutableInteractionSource2, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:111:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0150  */
    /* JADX WARN: Code duplicated, block: B:113:0x0153  */
    /* JADX WARN: Code duplicated, block: B:116:0x015a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0167  */
    /* JADX WARN: Code duplicated, block: B:122:0x0174  */
    /* JADX WARN: Code duplicated, block: B:123:0x017f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0184  */
    /* JADX WARN: Code duplicated, block: B:128:0x019d  */
    /* JADX WARN: Code duplicated, block: B:130:0x01af  */
    /* JADX WARN: Code duplicated, block: B:132:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:138:0x025b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0271  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:93:0x0114  */
    /* JADX WARN: Code duplicated, block: B:95:0x0121  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: FloatingActionButton-X-z6DiA, reason: not valid java name */
    public static final void m1127FloatingActionButtonXz6DiA(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, @Nullable Shape shape, long j10, long j11, @Nullable FloatingActionButtonElevation floatingActionButtonElevation, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Shape shape2;
        long containerColor;
        long j12;
        FloatingActionButtonElevation floatingActionButtonElevationM1122elevationxZ9QkE;
        int i13;
        int i14;
        int i15;
        Modifier modifier2;
        long jM1014contentColorForek8zF_U;
        int i16;
        Shape shape3;
        long j13;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        Modifier modifier3;
        MutableInteractionSource mutableInteractionSource2;
        Object objRememberedValue;
        Composer composer2;
        Shape shape4;
        long j14;
        MutableInteractionSource mutableInteractionSource3;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        long j15;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i17;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-731723913);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                if ((i11 & 4) == 0) {
                    shape2 = shape;
                    int i19 = composerStartRestartGroup.changed(shape2) ? 256 : 128;
                    i12 |= i19;
                } else {
                    shape2 = shape;
                }
                i12 |= i19;
            } else {
                shape2 = shape;
            }
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    containerColor = j10;
                    int i20 = composerStartRestartGroup.changed(containerColor) ? 2048 : 1024;
                    i12 |= i20;
                } else {
                    containerColor = j10;
                }
                i12 |= i20;
            } else {
                containerColor = j10;
            }
            if ((i10 & 57344) == 0) {
                j12 = j11;
                if ((i11 & 16) == 0 || !composerStartRestartGroup.changed(j12)) {
                    i17 = 8192;
                } else {
                    i17 = 16384;
                }
                i12 |= i17;
            } else {
                j12 = j11;
            }
            if ((i10 & 458752) == 0) {
                if ((i11 & 32) == 0) {
                    floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation;
                    int i21 = composerStartRestartGroup.changed(floatingActionButtonElevationM1122elevationxZ9QkE) ? 131072 : 65536;
                    i12 |= i21;
                } else {
                    floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation;
                }
                i12 |= i21;
            } else {
                floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
            if ((i11 & 128) != 0) {
                if ((29360128 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                }
                if ((23967451 & i12) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            shape2 = FloatingActionButtonDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 16) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                            i12 &= -57345;
                        } else {
                            jM1014contentColorForek8zF_U = j12;
                        }
                        if ((i11 & 32) != 0) {
                            floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i12 &= -458753;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            j12 = jM1014contentColorForek8zF_U;
                            shape3 = shape2;
                            j13 = containerColor;
                            floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                            modifier3 = modifier2;
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            i16 = i12;
                        } else {
                            i16 = i12;
                            j12 = jM1014contentColorForek8zF_U;
                            shape3 = shape2;
                            j13 = containerColor;
                            floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                            modifier3 = modifier2;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        mutableInteractionSource2 = mutableInteractionSource;
                        i16 = i12;
                        shape3 = shape2;
                        j13 = containerColor;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                        modifier3 = modifier;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-731723913, i16, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:95)");
                    }
                    int i22 = ((i16 >> 12) & 112) | ((i16 >> 18) & 14);
                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                    int i23 = i16;
                    int i24 = i23 << 3;
                    FloatingActionButtonElevation floatingActionButtonElevation4 = floatingActionButtonElevation2;
                    long j16 = j12;
                    composer2 = composerStartRestartGroup;
                    Modifier modifier5 = modifier3;
                    SurfaceKt.m1332Surfaceo_FOJdg(onClick, SemanticsModifierKt.semantics$default(modifier3, false, e.f10329p0, 1, null), false, shape3, j13, j16, floatingActionButtonElevation2.tonalElevation$material3_release(mutableInteractionSource2, composerStartRestartGroup, i22).getValue().m4403unboximpl(), floatingActionButtonElevation2.shadowElevation$material3_release(mutableInteractionSource2, composerStartRestartGroup, i22).getValue().m4403unboximpl(), null, mutableInteractionSource4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1249316354, true, new f(j12, content, i16)), composer2, (i23 & 14) | (i24 & 7168) | (i24 & 57344) | (i24 & 458752) | ((i23 << 9) & 1879048192), 6, 260);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape4 = shape3;
                    j14 = j13;
                    mutableInteractionSource3 = mutableInteractionSource4;
                    floatingActionButtonElevation3 = floatingActionButtonElevation4;
                    j15 = j16;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier;
                    composer2 = composerStartRestartGroup;
                    shape4 = shape2;
                    j14 = containerColor;
                    floatingActionButtonElevation3 = floatingActionButtonElevationM1122elevationxZ9QkE;
                    j15 = j12;
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, shape4, j14, j15, floatingActionButtonElevation3, mutableInteractionSource3, content, i10, i11));
            }
            i15 = 12582912;
            i12 |= i15;
            if ((23967451 & i12) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        shape2 = FloatingActionButtonDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 &= -458753;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        j12 = jM1014contentColorForek8zF_U;
                        shape3 = shape2;
                        j13 = containerColor;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                        modifier3 = modifier2;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        i16 = i12;
                    } else {
                        i16 = i12;
                        j12 = jM1014contentColorForek8zF_U;
                        shape3 = shape2;
                        j13 = containerColor;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                        modifier3 = modifier2;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        shape2 = FloatingActionButtonDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 &= -458753;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        j12 = jM1014contentColorForek8zF_U;
                        shape3 = shape2;
                        j13 = containerColor;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                        modifier3 = modifier2;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        i16 = i12;
                    } else {
                        i16 = i12;
                        j12 = jM1014contentColorForek8zF_U;
                        shape3 = shape2;
                        j13 = containerColor;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                        modifier3 = modifier2;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-731723913, i16, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:95)");
                }
                int i25 = ((i16 >> 12) & 112) | ((i16 >> 18) & 14);
                MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource2;
                int i26 = i16;
                int i27 = i26 << 3;
                FloatingActionButtonElevation floatingActionButtonElevation5 = floatingActionButtonElevation2;
                long j17 = j12;
                composer2 = composerStartRestartGroup;
                Modifier modifier6 = modifier3;
                SurfaceKt.m1332Surfaceo_FOJdg(onClick, SemanticsModifierKt.semantics$default(modifier3, false, e.f10329p0, 1, null), false, shape3, j13, j17, floatingActionButtonElevation2.tonalElevation$material3_release(mutableInteractionSource2, composerStartRestartGroup, i25).getValue().m4403unboximpl(), floatingActionButtonElevation2.shadowElevation$material3_release(mutableInteractionSource2, composerStartRestartGroup, i25).getValue().m4403unboximpl(), null, mutableInteractionSource5, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1249316354, true, new f(j12, content, i16)), composer2, (i26 & 14) | (i27 & 7168) | (i27 & 57344) | (i27 & 458752) | ((i26 << 9) & 1879048192), 6, 260);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape4 = shape3;
                j14 = j13;
                mutableInteractionSource3 = mutableInteractionSource5;
                floatingActionButtonElevation3 = floatingActionButtonElevation5;
                j15 = j17;
                modifier4 = modifier6;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        shape2 = FloatingActionButtonDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 &= -458753;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        j12 = jM1014contentColorForek8zF_U;
                        shape3 = shape2;
                        j13 = containerColor;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                        modifier3 = modifier2;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        i16 = i12;
                    } else {
                        i16 = i12;
                        j12 = jM1014contentColorForek8zF_U;
                        shape3 = shape2;
                        j13 = containerColor;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                        modifier3 = modifier2;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        shape2 = FloatingActionButtonDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 &= -458753;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        j12 = jM1014contentColorForek8zF_U;
                        shape3 = shape2;
                        j13 = containerColor;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                        modifier3 = modifier2;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        i16 = i12;
                    } else {
                        i16 = i12;
                        j12 = jM1014contentColorForek8zF_U;
                        shape3 = shape2;
                        j13 = containerColor;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                        modifier3 = modifier2;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-731723913, i16, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:95)");
                }
                int i28 = ((i16 >> 12) & 112) | ((i16 >> 18) & 14);
                MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource2;
                int i29 = i16;
                int i210 = i29 << 3;
                FloatingActionButtonElevation floatingActionButtonElevation6 = floatingActionButtonElevation2;
                long j18 = j12;
                composer2 = composerStartRestartGroup;
                Modifier modifier7 = modifier3;
                SurfaceKt.m1332Surfaceo_FOJdg(onClick, SemanticsModifierKt.semantics$default(modifier3, false, e.f10329p0, 1, null), false, shape3, j13, j18, floatingActionButtonElevation2.tonalElevation$material3_release(mutableInteractionSource2, composerStartRestartGroup, i28).getValue().m4403unboximpl(), floatingActionButtonElevation2.shadowElevation$material3_release(mutableInteractionSource2, composerStartRestartGroup, i28).getValue().m4403unboximpl(), null, mutableInteractionSource6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1249316354, true, new f(j12, content, i16)), composer2, (i29 & 14) | (i210 & 7168) | (i210 & 57344) | (i210 & 458752) | ((i29 << 9) & 1879048192), 6, 260);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape4 = shape3;
                j14 = j13;
                mutableInteractionSource3 = mutableInteractionSource6;
                floatingActionButtonElevation3 = floatingActionButtonElevation6;
                j15 = j18;
                modifier4 = modifier7;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, shape4, j14, j15, floatingActionButtonElevation3, mutableInteractionSource3, content, i10, i11));
        }
        i12 |= 48;
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i12 |= i19;
            } else {
                shape2 = shape;
            }
            i12 |= i19;
        } else {
            shape2 = shape;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                containerColor = j10;
                if (composerStartRestartGroup.changed(containerColor)) {
                }
                i12 |= i20;
            } else {
                containerColor = j10;
            }
            i12 |= i20;
        } else {
            containerColor = j10;
        }
        if ((i10 & 57344) == 0) {
            j12 = j11;
            if ((i11 & 16) == 0) {
                i17 = 8192;
            } else {
                i17 = 8192;
            }
            i12 |= i17;
        } else {
            j12 = j11;
        }
        if ((i10 & 458752) == 0) {
            if ((i11 & 32) == 0) {
                floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation;
                if (composerStartRestartGroup.changed(floatingActionButtonElevationM1122elevationxZ9QkE)) {
                }
                i12 |= i21;
            } else {
                floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation;
            }
            i12 |= i21;
        } else {
            floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation;
        }
        i13 = i11 & 64;
        if (i13 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i12 |= i14;
        }
        if ((i11 & 128) != 0) {
            if ((29360128 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
            }
            if ((23967451 & i12) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        shape2 = FloatingActionButtonDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 &= -458753;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        j12 = jM1014contentColorForek8zF_U;
                        shape3 = shape2;
                        j13 = containerColor;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                        modifier3 = modifier2;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        i16 = i12;
                    } else {
                        i16 = i12;
                        j12 = jM1014contentColorForek8zF_U;
                        shape3 = shape2;
                        j13 = containerColor;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                        modifier3 = modifier2;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        shape2 = FloatingActionButtonDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 &= -458753;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        j12 = jM1014contentColorForek8zF_U;
                        shape3 = shape2;
                        j13 = containerColor;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                        modifier3 = modifier2;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        i16 = i12;
                    } else {
                        i16 = i12;
                        j12 = jM1014contentColorForek8zF_U;
                        shape3 = shape2;
                        j13 = containerColor;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                        modifier3 = modifier2;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-731723913, i16, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:95)");
                }
                int i211 = ((i16 >> 12) & 112) | ((i16 >> 18) & 14);
                MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource2;
                int i212 = i16;
                int i213 = i212 << 3;
                FloatingActionButtonElevation floatingActionButtonElevation7 = floatingActionButtonElevation2;
                long j19 = j12;
                composer2 = composerStartRestartGroup;
                Modifier modifier8 = modifier3;
                SurfaceKt.m1332Surfaceo_FOJdg(onClick, SemanticsModifierKt.semantics$default(modifier3, false, e.f10329p0, 1, null), false, shape3, j13, j19, floatingActionButtonElevation2.tonalElevation$material3_release(mutableInteractionSource2, composerStartRestartGroup, i211).getValue().m4403unboximpl(), floatingActionButtonElevation2.shadowElevation$material3_release(mutableInteractionSource2, composerStartRestartGroup, i211).getValue().m4403unboximpl(), null, mutableInteractionSource7, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1249316354, true, new f(j12, content, i16)), composer2, (i212 & 14) | (i213 & 7168) | (i213 & 57344) | (i213 & 458752) | ((i212 << 9) & 1879048192), 6, 260);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape4 = shape3;
                j14 = j13;
                mutableInteractionSource3 = mutableInteractionSource7;
                floatingActionButtonElevation3 = floatingActionButtonElevation7;
                j15 = j19;
                modifier4 = modifier8;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        shape2 = FloatingActionButtonDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 &= -458753;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        j12 = jM1014contentColorForek8zF_U;
                        shape3 = shape2;
                        j13 = containerColor;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                        modifier3 = modifier2;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        i16 = i12;
                    } else {
                        i16 = i12;
                        j12 = jM1014contentColorForek8zF_U;
                        shape3 = shape2;
                        j13 = containerColor;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                        modifier3 = modifier2;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        shape2 = FloatingActionButtonDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 &= -458753;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        j12 = jM1014contentColorForek8zF_U;
                        shape3 = shape2;
                        j13 = containerColor;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                        modifier3 = modifier2;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        i16 = i12;
                    } else {
                        i16 = i12;
                        j12 = jM1014contentColorForek8zF_U;
                        shape3 = shape2;
                        j13 = containerColor;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                        modifier3 = modifier2;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-731723913, i16, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:95)");
                }
                int i214 = ((i16 >> 12) & 112) | ((i16 >> 18) & 14);
                MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource2;
                int i215 = i16;
                int i216 = i215 << 3;
                FloatingActionButtonElevation floatingActionButtonElevation8 = floatingActionButtonElevation2;
                long j110 = j12;
                composer2 = composerStartRestartGroup;
                Modifier modifier9 = modifier3;
                SurfaceKt.m1332Surfaceo_FOJdg(onClick, SemanticsModifierKt.semantics$default(modifier3, false, e.f10329p0, 1, null), false, shape3, j13, j110, floatingActionButtonElevation2.tonalElevation$material3_release(mutableInteractionSource2, composerStartRestartGroup, i214).getValue().m4403unboximpl(), floatingActionButtonElevation2.shadowElevation$material3_release(mutableInteractionSource2, composerStartRestartGroup, i214).getValue().m4403unboximpl(), null, mutableInteractionSource8, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1249316354, true, new f(j12, content, i16)), composer2, (i215 & 14) | (i216 & 7168) | (i216 & 57344) | (i216 & 458752) | ((i215 << 9) & 1879048192), 6, 260);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape4 = shape3;
                j14 = j13;
                mutableInteractionSource3 = mutableInteractionSource8;
                floatingActionButtonElevation3 = floatingActionButtonElevation8;
                j15 = j110;
                modifier4 = modifier9;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, shape4, j14, j15, floatingActionButtonElevation3, mutableInteractionSource3, content, i10, i11));
        }
        i15 = 12582912;
        i12 |= i15;
        if ((23967451 & i12) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    shape2 = FloatingActionButtonDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                }
                if ((i11 & 16) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                    i12 &= -57345;
                } else {
                    jM1014contentColorForek8zF_U = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i12 &= -458753;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    j12 = jM1014contentColorForek8zF_U;
                    shape3 = shape2;
                    j13 = containerColor;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                    modifier3 = modifier2;
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    i16 = i12;
                } else {
                    i16 = i12;
                    j12 = jM1014contentColorForek8zF_U;
                    shape3 = shape2;
                    j13 = containerColor;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                    modifier3 = modifier2;
                    mutableInteractionSource2 = mutableInteractionSource;
                }
            } else {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    shape2 = FloatingActionButtonDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                }
                if ((i11 & 16) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                    i12 &= -57345;
                } else {
                    jM1014contentColorForek8zF_U = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i12 &= -458753;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    j12 = jM1014contentColorForek8zF_U;
                    shape3 = shape2;
                    j13 = containerColor;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                    modifier3 = modifier2;
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    i16 = i12;
                } else {
                    i16 = i12;
                    j12 = jM1014contentColorForek8zF_U;
                    shape3 = shape2;
                    j13 = containerColor;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                    modifier3 = modifier2;
                    mutableInteractionSource2 = mutableInteractionSource;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-731723913, i16, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:95)");
            }
            int i217 = ((i16 >> 12) & 112) | ((i16 >> 18) & 14);
            MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource2;
            int i218 = i16;
            int i219 = i218 << 3;
            FloatingActionButtonElevation floatingActionButtonElevation9 = floatingActionButtonElevation2;
            long j111 = j12;
            composer2 = composerStartRestartGroup;
            Modifier modifier10 = modifier3;
            SurfaceKt.m1332Surfaceo_FOJdg(onClick, SemanticsModifierKt.semantics$default(modifier3, false, e.f10329p0, 1, null), false, shape3, j13, j111, floatingActionButtonElevation2.tonalElevation$material3_release(mutableInteractionSource2, composerStartRestartGroup, i217).getValue().m4403unboximpl(), floatingActionButtonElevation2.shadowElevation$material3_release(mutableInteractionSource2, composerStartRestartGroup, i217).getValue().m4403unboximpl(), null, mutableInteractionSource9, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1249316354, true, new f(j12, content, i16)), composer2, (i218 & 14) | (i219 & 7168) | (i219 & 57344) | (i219 & 458752) | ((i218 << 9) & 1879048192), 6, 260);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape4 = shape3;
            j14 = j13;
            mutableInteractionSource3 = mutableInteractionSource9;
            floatingActionButtonElevation3 = floatingActionButtonElevation9;
            j15 = j111;
            modifier4 = modifier10;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    shape2 = FloatingActionButtonDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                }
                if ((i11 & 16) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                    i12 &= -57345;
                } else {
                    jM1014contentColorForek8zF_U = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i12 &= -458753;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    j12 = jM1014contentColorForek8zF_U;
                    shape3 = shape2;
                    j13 = containerColor;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                    modifier3 = modifier2;
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    i16 = i12;
                } else {
                    i16 = i12;
                    j12 = jM1014contentColorForek8zF_U;
                    shape3 = shape2;
                    j13 = containerColor;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                    modifier3 = modifier2;
                    mutableInteractionSource2 = mutableInteractionSource;
                }
            } else {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    shape2 = FloatingActionButtonDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                }
                if ((i11 & 16) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                    i12 &= -57345;
                } else {
                    jM1014contentColorForek8zF_U = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i12 &= -458753;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    j12 = jM1014contentColorForek8zF_U;
                    shape3 = shape2;
                    j13 = containerColor;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                    modifier3 = modifier2;
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    i16 = i12;
                } else {
                    i16 = i12;
                    j12 = jM1014contentColorForek8zF_U;
                    shape3 = shape2;
                    j13 = containerColor;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                    modifier3 = modifier2;
                    mutableInteractionSource2 = mutableInteractionSource;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-731723913, i16, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:95)");
            }
            int i2110 = ((i16 >> 12) & 112) | ((i16 >> 18) & 14);
            MutableInteractionSource mutableInteractionSource10 = mutableInteractionSource2;
            int i2111 = i16;
            int i2112 = i2111 << 3;
            FloatingActionButtonElevation floatingActionButtonElevation10 = floatingActionButtonElevation2;
            long j112 = j12;
            composer2 = composerStartRestartGroup;
            Modifier modifier11 = modifier3;
            SurfaceKt.m1332Surfaceo_FOJdg(onClick, SemanticsModifierKt.semantics$default(modifier3, false, e.f10329p0, 1, null), false, shape3, j13, j112, floatingActionButtonElevation2.tonalElevation$material3_release(mutableInteractionSource2, composerStartRestartGroup, i2110).getValue().m4403unboximpl(), floatingActionButtonElevation2.shadowElevation$material3_release(mutableInteractionSource2, composerStartRestartGroup, i2110).getValue().m4403unboximpl(), null, mutableInteractionSource10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1249316354, true, new f(j12, content, i16)), composer2, (i2111 & 14) | (i2112 & 7168) | (i2112 & 57344) | (i2112 & 458752) | ((i2111 << 9) & 1879048192), 6, 260);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape4 = shape3;
            j14 = j13;
            mutableInteractionSource3 = mutableInteractionSource10;
            floatingActionButtonElevation3 = floatingActionButtonElevation10;
            j15 = j112;
            modifier4 = modifier11;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, shape4, j14, j15, floatingActionButtonElevation3, mutableInteractionSource3, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0152  */
    /* JADX WARN: Code duplicated, block: B:115:0x0155  */
    /* JADX WARN: Code duplicated, block: B:118:0x015c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0167  */
    /* JADX WARN: Code duplicated, block: B:122:0x016d  */
    /* JADX WARN: Code duplicated, block: B:125:0x017a  */
    /* JADX WARN: Code duplicated, block: B:126:0x018b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0193  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:142:0x0246  */
    /* JADX WARN: Code duplicated, block: B:147:0x025c  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0114  */
    /* JADX WARN: Code duplicated, block: B:95:0x0121  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: LargeFloatingActionButton-X-z6DiA, reason: not valid java name */
    public static final void m1128LargeFloatingActionButtonXz6DiA(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, @Nullable Shape shape, long j10, long j11, @Nullable FloatingActionButtonElevation floatingActionButtonElevation, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Shape shape2;
        long containerColor;
        long j12;
        FloatingActionButtonElevation floatingActionButtonElevationM1122elevationxZ9QkE;
        int i13;
        MutableInteractionSource mutableInteractionSource2;
        int i14;
        int i15;
        Modifier modifier2;
        Shape largeShape;
        int i16;
        long jM1014contentColorForek8zF_U;
        Modifier modifier3;
        Object objRememberedValue;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier4;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        Shape shape3;
        long j13;
        long j14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i17;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1650866856);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                if ((i11 & 4) == 0) {
                    shape2 = shape;
                    int i19 = composerStartRestartGroup.changed(shape2) ? 256 : 128;
                    i12 |= i19;
                } else {
                    shape2 = shape;
                }
                i12 |= i19;
            } else {
                shape2 = shape;
            }
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    containerColor = j10;
                    int i20 = composerStartRestartGroup.changed(containerColor) ? 2048 : 1024;
                    i12 |= i20;
                } else {
                    containerColor = j10;
                }
                i12 |= i20;
            } else {
                containerColor = j10;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    j12 = j11;
                    int i21 = composerStartRestartGroup.changed(j12) ? 16384 : 8192;
                    i12 |= i21;
                } else {
                    j12 = j11;
                }
                i12 |= i21;
            } else {
                j12 = j11;
            }
            if ((i10 & 458752) == 0) {
                floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation;
                if ((i11 & 32) == 0 || !composerStartRestartGroup.changed(floatingActionButtonElevationM1122elevationxZ9QkE)) {
                    i17 = 65536;
                } else {
                    i17 = 131072;
                }
                i12 |= i17;
            } else {
                floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                i12 |= 1572864;
                mutableInteractionSource2 = mutableInteractionSource;
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i12 |= i14;
                }
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                }
                if ((23967451 & i12) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            largeShape = FloatingActionButtonDefaults.INSTANCE.getLargeShape(composerStartRestartGroup, 6);
                        } else {
                            largeShape = shape2;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                        } else {
                            i16 = i12;
                            jM1014contentColorForek8zF_U = j12;
                        }
                        if ((i11 & 32) != 0) {
                            floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i12 = i16 & (-458753);
                        } else {
                            i12 = i16;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = modifier2;
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            modifier3 = modifier2;
                        }
                        FloatingActionButtonElevation floatingActionButtonElevation3 = floatingActionButtonElevationM1122elevationxZ9QkE;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1650866856, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:215)");
                        }
                        FabPrimaryLargeTokens fabPrimaryLargeTokens = FabPrimaryLargeTokens.INSTANCE;
                        m1127FloatingActionButtonXz6DiA(onClick, SizeKt.m339sizeInqDBjuR0$default(modifier3, fabPrimaryLargeTokens.m1654getContainerWidthD9Ej5fM(), fabPrimaryLargeTokens.m1653getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), largeShape, containerColor, jM1014contentColorForek8zF_U, floatingActionButtonElevation3, mutableInteractionSource3, content, composerStartRestartGroup, (i12 & 14) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        floatingActionButtonElevation2 = floatingActionButtonElevation3;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        shape3 = largeShape;
                        j13 = jM1014contentColorForek8zF_U;
                        j14 = containerColor;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        modifier3 = modifier;
                        largeShape = shape2;
                        containerColor = containerColor;
                        jM1014contentColorForek8zF_U = j12;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                    FloatingActionButtonElevation floatingActionButtonElevation4 = floatingActionButtonElevationM1122elevationxZ9QkE;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1650866856, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:215)");
                    }
                    FabPrimaryLargeTokens fabPrimaryLargeTokens2 = FabPrimaryLargeTokens.INSTANCE;
                    m1127FloatingActionButtonXz6DiA(onClick, SizeKt.m339sizeInqDBjuR0$default(modifier3, fabPrimaryLargeTokens2.m1654getContainerWidthD9Ej5fM(), fabPrimaryLargeTokens2.m1653getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), largeShape, containerColor, jM1014contentColorForek8zF_U, floatingActionButtonElevation4, mutableInteractionSource3, content, composerStartRestartGroup, (i12 & 14) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    floatingActionButtonElevation2 = floatingActionButtonElevation4;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    shape3 = largeShape;
                    j13 = jM1014contentColorForek8zF_U;
                    j14 = containerColor;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier;
                    shape3 = shape2;
                    j14 = containerColor;
                    j13 = j12;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new h(onClick, modifier4, shape3, j14, j13, floatingActionButtonElevation2, mutableInteractionSource2, content, i10, i11));
            }
            i15 = 12582912;
            i12 |= i15;
            if ((23967451 & i12) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        largeShape = FloatingActionButtonDefaults.INSTANCE.getLargeShape(composerStartRestartGroup, 6);
                    } else {
                        largeShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        largeShape = FloatingActionButtonDefaults.INSTANCE.getLargeShape(composerStartRestartGroup, 6);
                    } else {
                        largeShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                FloatingActionButtonElevation floatingActionButtonElevation5 = floatingActionButtonElevationM1122elevationxZ9QkE;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1650866856, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:215)");
                }
                FabPrimaryLargeTokens fabPrimaryLargeTokens3 = FabPrimaryLargeTokens.INSTANCE;
                m1127FloatingActionButtonXz6DiA(onClick, SizeKt.m339sizeInqDBjuR0$default(modifier3, fabPrimaryLargeTokens3.m1654getContainerWidthD9Ej5fM(), fabPrimaryLargeTokens3.m1653getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), largeShape, containerColor, jM1014contentColorForek8zF_U, floatingActionButtonElevation5, mutableInteractionSource3, content, composerStartRestartGroup, (i12 & 14) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                floatingActionButtonElevation2 = floatingActionButtonElevation5;
                mutableInteractionSource2 = mutableInteractionSource3;
                shape3 = largeShape;
                j13 = jM1014contentColorForek8zF_U;
                j14 = containerColor;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        largeShape = FloatingActionButtonDefaults.INSTANCE.getLargeShape(composerStartRestartGroup, 6);
                    } else {
                        largeShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        largeShape = FloatingActionButtonDefaults.INSTANCE.getLargeShape(composerStartRestartGroup, 6);
                    } else {
                        largeShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                FloatingActionButtonElevation floatingActionButtonElevation6 = floatingActionButtonElevationM1122elevationxZ9QkE;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1650866856, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:215)");
                }
                FabPrimaryLargeTokens fabPrimaryLargeTokens4 = FabPrimaryLargeTokens.INSTANCE;
                m1127FloatingActionButtonXz6DiA(onClick, SizeKt.m339sizeInqDBjuR0$default(modifier3, fabPrimaryLargeTokens4.m1654getContainerWidthD9Ej5fM(), fabPrimaryLargeTokens4.m1653getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), largeShape, containerColor, jM1014contentColorForek8zF_U, floatingActionButtonElevation6, mutableInteractionSource3, content, composerStartRestartGroup, (i12 & 14) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                floatingActionButtonElevation2 = floatingActionButtonElevation6;
                mutableInteractionSource2 = mutableInteractionSource3;
                shape3 = largeShape;
                j13 = jM1014contentColorForek8zF_U;
                j14 = containerColor;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new h(onClick, modifier4, shape3, j14, j13, floatingActionButtonElevation2, mutableInteractionSource2, content, i10, i11));
        }
        i12 |= 48;
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i12 |= i19;
            } else {
                shape2 = shape;
            }
            i12 |= i19;
        } else {
            shape2 = shape;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                containerColor = j10;
                if (composerStartRestartGroup.changed(containerColor)) {
                }
                i12 |= i20;
            } else {
                containerColor = j10;
            }
            i12 |= i20;
        } else {
            containerColor = j10;
        }
        if ((i10 & 57344) == 0) {
            if ((i11 & 16) == 0) {
                j12 = j11;
                if (composerStartRestartGroup.changed(j12)) {
                }
                i12 |= i21;
            } else {
                j12 = j11;
            }
            i12 |= i21;
        } else {
            j12 = j11;
        }
        if ((i10 & 458752) == 0) {
            floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation;
            if ((i11 & 32) == 0) {
                i17 = 65536;
            } else {
                i17 = 65536;
            }
            i12 |= i17;
        } else {
            floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation;
        }
        i13 = i11 & 64;
        if (i13 != 0) {
            i12 |= 1572864;
            mutableInteractionSource2 = mutableInteractionSource;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
        }
        if ((i11 & 128) != 0) {
            if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
            }
            if ((23967451 & i12) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        largeShape = FloatingActionButtonDefaults.INSTANCE.getLargeShape(composerStartRestartGroup, 6);
                    } else {
                        largeShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        largeShape = FloatingActionButtonDefaults.INSTANCE.getLargeShape(composerStartRestartGroup, 6);
                    } else {
                        largeShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                FloatingActionButtonElevation floatingActionButtonElevation7 = floatingActionButtonElevationM1122elevationxZ9QkE;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1650866856, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:215)");
                }
                FabPrimaryLargeTokens fabPrimaryLargeTokens5 = FabPrimaryLargeTokens.INSTANCE;
                m1127FloatingActionButtonXz6DiA(onClick, SizeKt.m339sizeInqDBjuR0$default(modifier3, fabPrimaryLargeTokens5.m1654getContainerWidthD9Ej5fM(), fabPrimaryLargeTokens5.m1653getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), largeShape, containerColor, jM1014contentColorForek8zF_U, floatingActionButtonElevation7, mutableInteractionSource3, content, composerStartRestartGroup, (i12 & 14) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                floatingActionButtonElevation2 = floatingActionButtonElevation7;
                mutableInteractionSource2 = mutableInteractionSource3;
                shape3 = largeShape;
                j13 = jM1014contentColorForek8zF_U;
                j14 = containerColor;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        largeShape = FloatingActionButtonDefaults.INSTANCE.getLargeShape(composerStartRestartGroup, 6);
                    } else {
                        largeShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        largeShape = FloatingActionButtonDefaults.INSTANCE.getLargeShape(composerStartRestartGroup, 6);
                    } else {
                        largeShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                FloatingActionButtonElevation floatingActionButtonElevation8 = floatingActionButtonElevationM1122elevationxZ9QkE;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1650866856, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:215)");
                }
                FabPrimaryLargeTokens fabPrimaryLargeTokens6 = FabPrimaryLargeTokens.INSTANCE;
                m1127FloatingActionButtonXz6DiA(onClick, SizeKt.m339sizeInqDBjuR0$default(modifier3, fabPrimaryLargeTokens6.m1654getContainerWidthD9Ej5fM(), fabPrimaryLargeTokens6.m1653getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), largeShape, containerColor, jM1014contentColorForek8zF_U, floatingActionButtonElevation8, mutableInteractionSource3, content, composerStartRestartGroup, (i12 & 14) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                floatingActionButtonElevation2 = floatingActionButtonElevation8;
                mutableInteractionSource2 = mutableInteractionSource3;
                shape3 = largeShape;
                j13 = jM1014contentColorForek8zF_U;
                j14 = containerColor;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new h(onClick, modifier4, shape3, j14, j13, floatingActionButtonElevation2, mutableInteractionSource2, content, i10, i11));
        }
        i15 = 12582912;
        i12 |= i15;
        if ((23967451 & i12) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    largeShape = FloatingActionButtonDefaults.INSTANCE.getLargeShape(composerStartRestartGroup, 6);
                } else {
                    largeShape = shape2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jM1014contentColorForek8zF_U = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifier3 = modifier2;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    modifier3 = modifier2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            } else {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    largeShape = FloatingActionButtonDefaults.INSTANCE.getLargeShape(composerStartRestartGroup, 6);
                } else {
                    largeShape = shape2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jM1014contentColorForek8zF_U = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifier3 = modifier2;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    modifier3 = modifier2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            }
            FloatingActionButtonElevation floatingActionButtonElevation9 = floatingActionButtonElevationM1122elevationxZ9QkE;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1650866856, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:215)");
            }
            FabPrimaryLargeTokens fabPrimaryLargeTokens7 = FabPrimaryLargeTokens.INSTANCE;
            m1127FloatingActionButtonXz6DiA(onClick, SizeKt.m339sizeInqDBjuR0$default(modifier3, fabPrimaryLargeTokens7.m1654getContainerWidthD9Ej5fM(), fabPrimaryLargeTokens7.m1653getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), largeShape, containerColor, jM1014contentColorForek8zF_U, floatingActionButtonElevation9, mutableInteractionSource3, content, composerStartRestartGroup, (i12 & 14) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            floatingActionButtonElevation2 = floatingActionButtonElevation9;
            mutableInteractionSource2 = mutableInteractionSource3;
            shape3 = largeShape;
            j13 = jM1014contentColorForek8zF_U;
            j14 = containerColor;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    largeShape = FloatingActionButtonDefaults.INSTANCE.getLargeShape(composerStartRestartGroup, 6);
                } else {
                    largeShape = shape2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jM1014contentColorForek8zF_U = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifier3 = modifier2;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    modifier3 = modifier2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            } else {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    largeShape = FloatingActionButtonDefaults.INSTANCE.getLargeShape(composerStartRestartGroup, 6);
                } else {
                    largeShape = shape2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jM1014contentColorForek8zF_U = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifier3 = modifier2;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    modifier3 = modifier2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            }
            FloatingActionButtonElevation floatingActionButtonElevation10 = floatingActionButtonElevationM1122elevationxZ9QkE;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1650866856, i12, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:215)");
            }
            FabPrimaryLargeTokens fabPrimaryLargeTokens8 = FabPrimaryLargeTokens.INSTANCE;
            m1127FloatingActionButtonXz6DiA(onClick, SizeKt.m339sizeInqDBjuR0$default(modifier3, fabPrimaryLargeTokens8.m1654getContainerWidthD9Ej5fM(), fabPrimaryLargeTokens8.m1653getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), largeShape, containerColor, jM1014contentColorForek8zF_U, floatingActionButtonElevation10, mutableInteractionSource3, content, composerStartRestartGroup, (i12 & 14) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            floatingActionButtonElevation2 = floatingActionButtonElevation10;
            mutableInteractionSource2 = mutableInteractionSource3;
            shape3 = largeShape;
            j13 = jM1014contentColorForek8zF_U;
            j14 = containerColor;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h(onClick, modifier4, shape3, j14, j13, floatingActionButtonElevation2, mutableInteractionSource2, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0152  */
    /* JADX WARN: Code duplicated, block: B:115:0x0155  */
    /* JADX WARN: Code duplicated, block: B:118:0x015c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0167  */
    /* JADX WARN: Code duplicated, block: B:122:0x016d  */
    /* JADX WARN: Code duplicated, block: B:125:0x017a  */
    /* JADX WARN: Code duplicated, block: B:126:0x018b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0193  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:142:0x0246  */
    /* JADX WARN: Code duplicated, block: B:147:0x025c  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0114  */
    /* JADX WARN: Code duplicated, block: B:95:0x0121  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: SmallFloatingActionButton-X-z6DiA, reason: not valid java name */
    public static final void m1129SmallFloatingActionButtonXz6DiA(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, @Nullable Shape shape, long j10, long j11, @Nullable FloatingActionButtonElevation floatingActionButtonElevation, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Shape shape2;
        long containerColor;
        long j12;
        FloatingActionButtonElevation floatingActionButtonElevationM1122elevationxZ9QkE;
        int i13;
        MutableInteractionSource mutableInteractionSource2;
        int i14;
        int i15;
        Modifier modifier2;
        Shape smallShape;
        int i16;
        long jM1014contentColorForek8zF_U;
        Modifier modifier3;
        Object objRememberedValue;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier4;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        Shape shape3;
        long j13;
        long j14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i17;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1444748300);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                if ((i11 & 4) == 0) {
                    shape2 = shape;
                    int i19 = composerStartRestartGroup.changed(shape2) ? 256 : 128;
                    i12 |= i19;
                } else {
                    shape2 = shape;
                }
                i12 |= i19;
            } else {
                shape2 = shape;
            }
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    containerColor = j10;
                    int i20 = composerStartRestartGroup.changed(containerColor) ? 2048 : 1024;
                    i12 |= i20;
                } else {
                    containerColor = j10;
                }
                i12 |= i20;
            } else {
                containerColor = j10;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    j12 = j11;
                    int i21 = composerStartRestartGroup.changed(j12) ? 16384 : 8192;
                    i12 |= i21;
                } else {
                    j12 = j11;
                }
                i12 |= i21;
            } else {
                j12 = j11;
            }
            if ((i10 & 458752) == 0) {
                floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation;
                if ((i11 & 32) == 0 || !composerStartRestartGroup.changed(floatingActionButtonElevationM1122elevationxZ9QkE)) {
                    i17 = 65536;
                } else {
                    i17 = 131072;
                }
                i12 |= i17;
            } else {
                floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                i12 |= 1572864;
                mutableInteractionSource2 = mutableInteractionSource;
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i12 |= i14;
                }
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                }
                if ((23967451 & i12) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            smallShape = FloatingActionButtonDefaults.INSTANCE.getSmallShape(composerStartRestartGroup, 6);
                        } else {
                            smallShape = shape2;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                        } else {
                            i16 = i12;
                            jM1014contentColorForek8zF_U = j12;
                        }
                        if ((i11 & 32) != 0) {
                            floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i12 = i16 & (-458753);
                        } else {
                            i12 = i16;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = modifier2;
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            modifier3 = modifier2;
                        }
                        FloatingActionButtonElevation floatingActionButtonElevation3 = floatingActionButtonElevationM1122elevationxZ9QkE;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1444748300, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:163)");
                        }
                        FabPrimarySmallTokens fabPrimarySmallTokens = FabPrimarySmallTokens.INSTANCE;
                        m1127FloatingActionButtonXz6DiA(onClick, SizeKt.m339sizeInqDBjuR0$default(modifier3, fabPrimarySmallTokens.m1665getContainerWidthD9Ej5fM(), fabPrimarySmallTokens.m1664getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), smallShape, containerColor, jM1014contentColorForek8zF_U, floatingActionButtonElevation3, mutableInteractionSource3, content, composerStartRestartGroup, (i12 & 14) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        floatingActionButtonElevation2 = floatingActionButtonElevation3;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        shape3 = smallShape;
                        j13 = jM1014contentColorForek8zF_U;
                        j14 = containerColor;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        modifier3 = modifier;
                        smallShape = shape2;
                        containerColor = containerColor;
                        jM1014contentColorForek8zF_U = j12;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                    FloatingActionButtonElevation floatingActionButtonElevation4 = floatingActionButtonElevationM1122elevationxZ9QkE;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1444748300, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:163)");
                    }
                    FabPrimarySmallTokens fabPrimarySmallTokens2 = FabPrimarySmallTokens.INSTANCE;
                    m1127FloatingActionButtonXz6DiA(onClick, SizeKt.m339sizeInqDBjuR0$default(modifier3, fabPrimarySmallTokens2.m1665getContainerWidthD9Ej5fM(), fabPrimarySmallTokens2.m1664getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), smallShape, containerColor, jM1014contentColorForek8zF_U, floatingActionButtonElevation4, mutableInteractionSource3, content, composerStartRestartGroup, (i12 & 14) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    floatingActionButtonElevation2 = floatingActionButtonElevation4;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    shape3 = smallShape;
                    j13 = jM1014contentColorForek8zF_U;
                    j14 = containerColor;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier;
                    shape3 = shape2;
                    j14 = containerColor;
                    j13 = j12;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM1122elevationxZ9QkE;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new i(onClick, modifier4, shape3, j14, j13, floatingActionButtonElevation2, mutableInteractionSource2, content, i10, i11));
            }
            i15 = 12582912;
            i12 |= i15;
            if ((23967451 & i12) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        smallShape = FloatingActionButtonDefaults.INSTANCE.getSmallShape(composerStartRestartGroup, 6);
                    } else {
                        smallShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        smallShape = FloatingActionButtonDefaults.INSTANCE.getSmallShape(composerStartRestartGroup, 6);
                    } else {
                        smallShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                FloatingActionButtonElevation floatingActionButtonElevation5 = floatingActionButtonElevationM1122elevationxZ9QkE;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1444748300, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:163)");
                }
                FabPrimarySmallTokens fabPrimarySmallTokens3 = FabPrimarySmallTokens.INSTANCE;
                m1127FloatingActionButtonXz6DiA(onClick, SizeKt.m339sizeInqDBjuR0$default(modifier3, fabPrimarySmallTokens3.m1665getContainerWidthD9Ej5fM(), fabPrimarySmallTokens3.m1664getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), smallShape, containerColor, jM1014contentColorForek8zF_U, floatingActionButtonElevation5, mutableInteractionSource3, content, composerStartRestartGroup, (i12 & 14) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                floatingActionButtonElevation2 = floatingActionButtonElevation5;
                mutableInteractionSource2 = mutableInteractionSource3;
                shape3 = smallShape;
                j13 = jM1014contentColorForek8zF_U;
                j14 = containerColor;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        smallShape = FloatingActionButtonDefaults.INSTANCE.getSmallShape(composerStartRestartGroup, 6);
                    } else {
                        smallShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        smallShape = FloatingActionButtonDefaults.INSTANCE.getSmallShape(composerStartRestartGroup, 6);
                    } else {
                        smallShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                FloatingActionButtonElevation floatingActionButtonElevation6 = floatingActionButtonElevationM1122elevationxZ9QkE;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1444748300, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:163)");
                }
                FabPrimarySmallTokens fabPrimarySmallTokens4 = FabPrimarySmallTokens.INSTANCE;
                m1127FloatingActionButtonXz6DiA(onClick, SizeKt.m339sizeInqDBjuR0$default(modifier3, fabPrimarySmallTokens4.m1665getContainerWidthD9Ej5fM(), fabPrimarySmallTokens4.m1664getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), smallShape, containerColor, jM1014contentColorForek8zF_U, floatingActionButtonElevation6, mutableInteractionSource3, content, composerStartRestartGroup, (i12 & 14) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                floatingActionButtonElevation2 = floatingActionButtonElevation6;
                mutableInteractionSource2 = mutableInteractionSource3;
                shape3 = smallShape;
                j13 = jM1014contentColorForek8zF_U;
                j14 = containerColor;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new i(onClick, modifier4, shape3, j14, j13, floatingActionButtonElevation2, mutableInteractionSource2, content, i10, i11));
        }
        i12 |= 48;
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i12 |= i19;
            } else {
                shape2 = shape;
            }
            i12 |= i19;
        } else {
            shape2 = shape;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                containerColor = j10;
                if (composerStartRestartGroup.changed(containerColor)) {
                }
                i12 |= i20;
            } else {
                containerColor = j10;
            }
            i12 |= i20;
        } else {
            containerColor = j10;
        }
        if ((i10 & 57344) == 0) {
            if ((i11 & 16) == 0) {
                j12 = j11;
                if (composerStartRestartGroup.changed(j12)) {
                }
                i12 |= i21;
            } else {
                j12 = j11;
            }
            i12 |= i21;
        } else {
            j12 = j11;
        }
        if ((i10 & 458752) == 0) {
            floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation;
            if ((i11 & 32) == 0) {
                i17 = 65536;
            } else {
                i17 = 65536;
            }
            i12 |= i17;
        } else {
            floatingActionButtonElevationM1122elevationxZ9QkE = floatingActionButtonElevation;
        }
        i13 = i11 & 64;
        if (i13 != 0) {
            i12 |= 1572864;
            mutableInteractionSource2 = mutableInteractionSource;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
        }
        if ((i11 & 128) != 0) {
            if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
            }
            if ((23967451 & i12) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        smallShape = FloatingActionButtonDefaults.INSTANCE.getSmallShape(composerStartRestartGroup, 6);
                    } else {
                        smallShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        smallShape = FloatingActionButtonDefaults.INSTANCE.getSmallShape(composerStartRestartGroup, 6);
                    } else {
                        smallShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                FloatingActionButtonElevation floatingActionButtonElevation7 = floatingActionButtonElevationM1122elevationxZ9QkE;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1444748300, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:163)");
                }
                FabPrimarySmallTokens fabPrimarySmallTokens5 = FabPrimarySmallTokens.INSTANCE;
                m1127FloatingActionButtonXz6DiA(onClick, SizeKt.m339sizeInqDBjuR0$default(modifier3, fabPrimarySmallTokens5.m1665getContainerWidthD9Ej5fM(), fabPrimarySmallTokens5.m1664getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), smallShape, containerColor, jM1014contentColorForek8zF_U, floatingActionButtonElevation7, mutableInteractionSource3, content, composerStartRestartGroup, (i12 & 14) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                floatingActionButtonElevation2 = floatingActionButtonElevation7;
                mutableInteractionSource2 = mutableInteractionSource3;
                shape3 = smallShape;
                j13 = jM1014contentColorForek8zF_U;
                j14 = containerColor;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        smallShape = FloatingActionButtonDefaults.INSTANCE.getSmallShape(composerStartRestartGroup, 6);
                    } else {
                        smallShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        smallShape = FloatingActionButtonDefaults.INSTANCE.getSmallShape(composerStartRestartGroup, 6);
                    } else {
                        smallShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                    } else {
                        i16 = i12;
                        jM1014contentColorForek8zF_U = j12;
                    }
                    if ((i11 & 32) != 0) {
                        floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i12 = i16 & (-458753);
                    } else {
                        i12 = i16;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                FloatingActionButtonElevation floatingActionButtonElevation8 = floatingActionButtonElevationM1122elevationxZ9QkE;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1444748300, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:163)");
                }
                FabPrimarySmallTokens fabPrimarySmallTokens6 = FabPrimarySmallTokens.INSTANCE;
                m1127FloatingActionButtonXz6DiA(onClick, SizeKt.m339sizeInqDBjuR0$default(modifier3, fabPrimarySmallTokens6.m1665getContainerWidthD9Ej5fM(), fabPrimarySmallTokens6.m1664getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), smallShape, containerColor, jM1014contentColorForek8zF_U, floatingActionButtonElevation8, mutableInteractionSource3, content, composerStartRestartGroup, (i12 & 14) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                floatingActionButtonElevation2 = floatingActionButtonElevation8;
                mutableInteractionSource2 = mutableInteractionSource3;
                shape3 = smallShape;
                j13 = jM1014contentColorForek8zF_U;
                j14 = containerColor;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new i(onClick, modifier4, shape3, j14, j13, floatingActionButtonElevation2, mutableInteractionSource2, content, i10, i11));
        }
        i15 = 12582912;
        i12 |= i15;
        if ((23967451 & i12) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    smallShape = FloatingActionButtonDefaults.INSTANCE.getSmallShape(composerStartRestartGroup, 6);
                } else {
                    smallShape = shape2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jM1014contentColorForek8zF_U = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifier3 = modifier2;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    modifier3 = modifier2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            } else {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    smallShape = FloatingActionButtonDefaults.INSTANCE.getSmallShape(composerStartRestartGroup, 6);
                } else {
                    smallShape = shape2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jM1014contentColorForek8zF_U = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifier3 = modifier2;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    modifier3 = modifier2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            }
            FloatingActionButtonElevation floatingActionButtonElevation9 = floatingActionButtonElevationM1122elevationxZ9QkE;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1444748300, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:163)");
            }
            FabPrimarySmallTokens fabPrimarySmallTokens7 = FabPrimarySmallTokens.INSTANCE;
            m1127FloatingActionButtonXz6DiA(onClick, SizeKt.m339sizeInqDBjuR0$default(modifier3, fabPrimarySmallTokens7.m1665getContainerWidthD9Ej5fM(), fabPrimarySmallTokens7.m1664getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), smallShape, containerColor, jM1014contentColorForek8zF_U, floatingActionButtonElevation9, mutableInteractionSource3, content, composerStartRestartGroup, (i12 & 14) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            floatingActionButtonElevation2 = floatingActionButtonElevation9;
            mutableInteractionSource2 = mutableInteractionSource3;
            shape3 = smallShape;
            j13 = jM1014contentColorForek8zF_U;
            j14 = containerColor;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    smallShape = FloatingActionButtonDefaults.INSTANCE.getSmallShape(composerStartRestartGroup, 6);
                } else {
                    smallShape = shape2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jM1014contentColorForek8zF_U = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifier3 = modifier2;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    modifier3 = modifier2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            } else {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    smallShape = FloatingActionButtonDefaults.INSTANCE.getSmallShape(composerStartRestartGroup, 6);
                } else {
                    smallShape = shape2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 9) & 14);
                } else {
                    i16 = i12;
                    jM1014contentColorForek8zF_U = j12;
                }
                if ((i11 & 32) != 0) {
                    floatingActionButtonElevationM1122elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m1122elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i12 = i16 & (-458753);
                } else {
                    i12 = i16;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifier3 = modifier2;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    modifier3 = modifier2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            }
            FloatingActionButtonElevation floatingActionButtonElevation10 = floatingActionButtonElevationM1122elevationxZ9QkE;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1444748300, i12, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:163)");
            }
            FabPrimarySmallTokens fabPrimarySmallTokens8 = FabPrimarySmallTokens.INSTANCE;
            m1127FloatingActionButtonXz6DiA(onClick, SizeKt.m339sizeInqDBjuR0$default(modifier3, fabPrimarySmallTokens8.m1665getContainerWidthD9Ej5fM(), fabPrimarySmallTokens8.m1664getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), smallShape, containerColor, jM1014contentColorForek8zF_U, floatingActionButtonElevation10, mutableInteractionSource3, content, composerStartRestartGroup, (i12 & 14) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (i12 & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            floatingActionButtonElevation2 = floatingActionButtonElevation10;
            mutableInteractionSource2 = mutableInteractionSource3;
            shape3 = smallShape;
            j13 = jM1014contentColorForek8zF_U;
            j14 = containerColor;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new i(onClick, modifier4, shape3, j14, j13, floatingActionButtonElevation2, mutableInteractionSource2, content, i10, i11));
    }
}
