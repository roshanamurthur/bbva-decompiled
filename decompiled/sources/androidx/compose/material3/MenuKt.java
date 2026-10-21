package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.MenuTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\u001aV\u0010\u000e\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0082\u0001\u0010\u001c\u001a\u00020\n2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0002\b\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0013\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010¢\u0006\u0002\b\u000b2\u0013\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010¢\u0006\u0002\b\u000b2\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\"\u0010!\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0000ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\"\u001d\u0010(\u001a\u00020#8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u001d\u0010+\u001a\u00020#8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'\"\u0014\u0010-\u001a\u00020,8\u0000X\u0080T¢\u0006\u0006\n\u0004\b-\u0010.\"\u0014\u0010/\u001a\u00020,8\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Landroidx/compose/animation/core/MutableTransitionState;", "", "expandedStates", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOriginState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "DropdownMenuContent", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "Landroidx/compose/material3/MenuItemColors;", "colors", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "DropdownMenuItemContent", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/IntRect;", "parentBounds", "menuBounds", "calculateTransformOrigin", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)J", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getMenuVerticalMargin", "()F", "MenuVerticalMargin", "c", "getDropdownMenuVerticalPadding", "DropdownMenuVerticalPadding", "", "InTransitionDuration", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "OutTransitionDuration", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,443:1\n936#2,4:444\n857#2,5:448\n936#2,4:453\n857#2,5:457\n67#3,3:462\n66#3:465\n460#3,13:491\n473#3,3:505\n1114#4,6:466\n75#5,6:472\n81#5:504\n85#5:509\n75#6:478\n76#6,11:480\n89#6:508\n76#7:479\n76#8:510\n76#8:511\n154#9:512\n154#9:513\n154#9:514\n154#9:515\n154#9:516\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt\n*L\n75#1:444,4\n75#1:448,5\n101#1:453,4\n101#1:457,5\n121#1:462,3\n121#1:465\n154#1:491,13\n154#1:505,3\n121#1:466,6\n154#1:472,6\n154#1:504\n154#1:509\n154#1:478\n154#1:480,11\n154#1:508\n154#1:479\n75#1:510\n101#1:511\n434#1:512\n435#1:513\n436#1:514\n437#1:515\n438#1:516\n*E\n"})
public final class MenuKt {
    public static final int InTransitionDuration = 120;
    public static final int OutTransitionDuration = 75;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f10611a = Dp.m4389constructorimpl(48);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f10612b = Dp.m4389constructorimpl(12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f10613c = Dp.m4389constructorimpl(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f10614d = Dp.m4389constructorimpl(112);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f10615e = Dp.m4389constructorimpl(280);

    /* JADX INFO: compiled from: Menu.kt */
    public static final class a extends Lambda implements Function1<GraphicsLayerScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TransformOrigin> f10616p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f10617q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f10618r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableState<TransformOrigin> mutableState, State<Float> state, State<Float> state2) {
            super(1);
            this.f10616p0 = mutableState;
            this.f10617q0 = state;
            this.f10618r0 = state2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
            GraphicsLayerScope graphicsLayer = graphicsLayerScope;
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            State<Float> state = this.f10617q0;
            graphicsLayer.setScaleX(MenuKt.access$DropdownMenuContent$lambda$1(state));
            graphicsLayer.setScaleY(MenuKt.access$DropdownMenuContent$lambda$1(state));
            graphicsLayer.setAlpha(MenuKt.access$DropdownMenuContent$lambda$3(this.f10618r0));
            graphicsLayer.mo2664setTransformOrigin__ExYCQ(this.f10616p0.getValue().getF15746a());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Menu.kt */
    @SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt$DropdownMenuContent$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,443:1\n74#2,6:444\n80#2:476\n84#2:481\n75#3:450\n76#3,11:452\n89#3:480\n76#4:451\n460#5,13:463\n473#5,3:477\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt$DropdownMenuContent$2\n*L\n132#1:444,6\n132#1:476\n132#1:481\n132#1:450\n132#1:452,11\n132#1:480\n132#1:451\n132#1:463,13\n132#1:477,3\n*E\n"})
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10619p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f10620q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f10621r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Modifier modifier, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f10619p0 = modifier;
            this.f10620q0 = function3;
            this.f10621r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1651673913, iIntValue, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:130)");
                }
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(IntrinsicKt.width(PaddingKt.m298paddingVpY3zN4$default(this.f10619p0, 0.0f, MenuKt.getDropdownMenuVerticalPadding(), 1, null), IntrinsicSize.Max), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                int i10 = this.f10621r0 & 7168;
                composer2.startReplaceableGroup(-483455358);
                int i11 = i10 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, (i11 & 112) | (i11 & 14));
                Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierVerticalScroll$default);
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
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicyColumnMeasurePolicy, composerM2074constructorimpl, density));
                ai.a.j((i12 >> 3) & 112, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                this.f10620q0.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i10 >> 6) & 112) | 6));
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

    /* JADX INFO: compiled from: Menu.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MutableTransitionState<Boolean> f10622p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TransformOrigin> f10623q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10624r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f10625s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f10626t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f10627u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(MutableTransitionState<Boolean> mutableTransitionState, MutableState<TransformOrigin> mutableState, Modifier modifier, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f10622p0 = mutableTransitionState;
            this.f10623q0 = mutableState;
            this.f10624r0 = modifier;
            this.f10625s0 = function3;
            this.f10626t0 = i10;
            this.f10627u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MenuKt.DropdownMenuContent(this.f10622p0, this.f10623q0, this.f10624r0, this.f10625s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10626t0 | 1), this.f10627u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Menu.kt */
    public static final class d extends Lambda implements Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f10628p0 = new d(3);

        @Override // kotlin.jvm.functions.Function3
        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer, Integer num) {
            Transition.Segment<Boolean> segment2 = segment;
            Composer composer2 = composer;
            int iD = androidx.datastore.preferences.protobuf.e.d(num, segment2, "$this$animateFloat", composer2, 896631233);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(896631233, iD, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:101)");
            }
            TweenSpec tweenSpecTween$default = segment2.isTransitioningTo(Boolean.FALSE, Boolean.TRUE) ? AnimationSpecKt.tween$default(30, 0, null, 6, null) : AnimationSpecKt.tween$default(75, 0, null, 6, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return tweenSpecTween$default;
        }
    }

    /* JADX INFO: compiled from: Menu.kt */
    public static final class e extends Lambda implements Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f10629p0 = new e(3);

        @Override // kotlin.jvm.functions.Function3
        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer, Integer num) {
            Transition.Segment<Boolean> segment2 = segment;
            Composer composer2 = composer;
            int iD = androidx.datastore.preferences.protobuf.e.d(num, segment2, "$this$animateFloat", composer2, 839979861);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(839979861, iD, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:75)");
            }
            TweenSpec tweenSpecTween$default = segment2.isTransitioningTo(Boolean.FALSE, Boolean.TRUE) ? AnimationSpecKt.tween$default(120, 0, EasingKt.getLinearOutSlowInEasing(), 2, null) : AnimationSpecKt.tween$default(1, 74, null, 4, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return tweenSpecTween$default;
        }
    }

    /* JADX INFO: compiled from: Menu.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10630p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MenuItemColors f10631q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f10632r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f10633s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10634t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ RowScope f10635u0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function2 function2, MenuItemColors menuItemColors, boolean z10, int i10, Function2 function3, RowScopeInstance rowScopeInstance, Function2 function4) {
            super(2);
            this.f10630p0 = function2;
            this.f10631q0 = menuItemColors;
            this.f10632r0 = z10;
            this.f10633s0 = i10;
            this.f10634t0 = function3;
            this.f10635u0 = rowScopeInstance;
            this.v0 = function4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1065051884, iIntValue, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:171)");
                }
                composer2.startReplaceableGroup(1426254055);
                Function2<Composer, Integer, Unit> function2 = this.f10630p0;
                boolean z10 = this.f10632r0;
                MenuItemColors menuItemColors = this.f10631q0;
                int i10 = this.f10633s0;
                if (function2 != null) {
                    int i11 = i10 >> 15;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(menuItemColors.leadingIconColor$material3_release(z10, composer2, (i11 & 112) | (i11 & 14)).getValue())}, ComposableLambdaKt.composableLambda(composer2, 2035552199, true, new p1(i10, function2)), composer2, 56);
                }
                composer2.endReplaceableGroup();
                int i12 = i10 >> 15;
                int i13 = (i12 & 112) | (i12 & 14);
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(menuItemColors.textColor$material3_release(z10, composer2, i13).getValue())}, ComposableLambdaKt.composableLambda(composer2, -1728894036, true, new q1(this.f10635u0, this.f10630p0, this.f10634t0, this.v0, this.f10633s0)), composer2, 56);
                Function2<Composer, Integer, Unit> function3 = this.f10634t0;
                if (function3 != null) {
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(menuItemColors.trailingIconColor$material3_release(z10, composer2, i13).getValue())}, ComposableLambdaKt.composableLambda(composer2, 580312062, true, new r1(i10, function3)), composer2, 56);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Menu.kt */
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10636p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f10637q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10638r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10639s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10640t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f10641u0;
        public final /* synthetic */ MenuItemColors v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f10642w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f10643x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f10644y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function2<? super Composer, ? super Integer, Unit> function2, Function0<Unit> function0, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, boolean z10, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i10) {
            super(2);
            this.f10636p0 = function2;
            this.f10637q0 = function0;
            this.f10638r0 = modifier;
            this.f10639s0 = function3;
            this.f10640t0 = function4;
            this.f10641u0 = z10;
            this.v0 = menuItemColors;
            this.f10642w0 = paddingValues;
            this.f10643x0 = mutableInteractionSource;
            this.f10644y0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MenuKt.DropdownMenuItemContent(this.f10636p0, this.f10637q0, this.f10638r0, this.f10639s0, this.f10640t0, this.f10641u0, this.v0, this.f10642w0, this.f10643x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10644y0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0266  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:69:0x0116  */
    /* JADX WARN: Code duplicated, block: B:71:0x011b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0123  */
    /* JADX WARN: Code duplicated, block: B:77:0x017f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0185  */
    /* JADX WARN: Code duplicated, block: B:81:0x0188  */
    /* JADX WARN: Code duplicated, block: B:84:0x018f  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:96:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:98:0x0206  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void DropdownMenuContent(@NotNull MutableTransitionState<Boolean> expandedStates, @NotNull MutableState<TransformOrigin> transformOriginState, @Nullable Modifier modifier, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        int i14;
        Modifier modifier3;
        boolean zBooleanValue;
        float f6;
        State stateCreateTransitionAnimation;
        boolean zBooleanValue2;
        float f10;
        State stateCreateTransitionAnimation2;
        boolean zChanged;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(expandedStates, "expandedStates");
        Intrinsics.checkNotNullParameter(transformOriginState, "transformOriginState");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-159754260);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(expandedStates) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(transformOriginState) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            i14 = i12;
            if ((i14 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-159754260, i14, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:65)");
                }
                Transition transitionUpdateTransition = TransitionKt.updateTransition((MutableTransitionState) expandedStates, "DropDownMenu", composerStartRestartGroup, MutableTransitionState.$stable | 48 | (i14 & 14), 0);
                e eVar = e.f10629p0;
                composerStartRestartGroup.startReplaceableGroup(-1338768149);
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                composerStartRestartGroup.startReplaceableGroup(-142660079);
                zBooleanValue = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
                composerStartRestartGroup.startReplaceableGroup(1808111696);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1808111696, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:90)");
                }
                if (zBooleanValue) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.8f;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf = Float.valueOf(f6);
                boolean zBooleanValue3 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
                composerStartRestartGroup.startReplaceableGroup(1808111696);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1808111696, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:90)");
                }
                float f11 = zBooleanValue3 ? 1.0f : 0.8f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f11), eVar.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter, "FloatAnimation", composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                d dVar = d.f10628p0;
                composerStartRestartGroup.startReplaceableGroup(-1338768149);
                TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                composerStartRestartGroup.startReplaceableGroup(-142660079);
                zBooleanValue2 = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
                composerStartRestartGroup.startReplaceableGroup(1864763068);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1864763068, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:110)");
                }
                if (zBooleanValue2) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf2 = Float.valueOf(f10);
                boolean zBooleanValue4 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
                composerStartRestartGroup.startReplaceableGroup(1864763068);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1864763068, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:110)");
                }
                float f12 = zBooleanValue4 ? 1.0f : 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf2, Float.valueOf(f12), dVar.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter2, "FloatAnimation", composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier.Companion companion = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(stateCreateTransitionAnimation) | composerStartRestartGroup.changed(stateCreateTransitionAnimation2) | composerStartRestartGroup.changed(transformOriginState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new a(transformOriginState, stateCreateTransitionAnimation, stateCreateTransitionAnimation2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) objRememberedValue);
                MenuTokens menuTokens = MenuTokens.INSTANCE;
                Modifier modifier4 = modifier3;
                SurfaceKt.m1329SurfaceT9BRK9s(modifierGraphicsLayer, ShapesKt.toShape(menuTokens.getContainerShape(), composerStartRestartGroup, 6), ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), menuTokens.getContainerColor()), 0L, menuTokens.m1780getContainerElevationD9Ej5fM(), menuTokens.m1780getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1651673913, true, new b(modifier3, content, i14)), composerStartRestartGroup, 12804096, 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(expandedStates, transformOriginState, modifier2, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        i14 = i12;
        if ((i14 & 5851) == 1170) {
            if (i15 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-159754260, i14, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:65)");
            }
            Transition transitionUpdateTransition2 = TransitionKt.updateTransition((MutableTransitionState) expandedStates, "DropDownMenu", composerStartRestartGroup, MutableTransitionState.$stable | 48 | (i14 & 14), 0);
            e eVar2 = e.f10629p0;
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            FloatCompanionObject floatCompanionObject2 = FloatCompanionObject.INSTANCE;
            TwoWayConverter<Float, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(floatCompanionObject2);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            zBooleanValue = ((Boolean) transitionUpdateTransition2.getCurrentState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1808111696);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1808111696, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:90)");
            }
            if (zBooleanValue) {
                f6 = 1.0f;
            } else {
                f6 = 0.8f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Float fValueOf3 = Float.valueOf(f6);
            boolean zBooleanValue5 = ((Boolean) transitionUpdateTransition2.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1808111696);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1808111696, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:90)");
            }
            if (zBooleanValue5) {
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition2, fValueOf3, Float.valueOf(f11), eVar2.invoke(transitionUpdateTransition2.getSegment(), composerStartRestartGroup, 0), vectorConverter3, "FloatAnimation", composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            d dVar2 = d.f10628p0;
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter4 = VectorConvertersKt.getVectorConverter(floatCompanionObject2);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            zBooleanValue2 = ((Boolean) transitionUpdateTransition2.getCurrentState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1864763068);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1864763068, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:110)");
            }
            if (zBooleanValue2) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Float fValueOf4 = Float.valueOf(f10);
            boolean zBooleanValue6 = ((Boolean) transitionUpdateTransition2.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1864763068);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1864763068, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:110)");
            }
            if (zBooleanValue6) {
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition2, fValueOf4, Float.valueOf(f12), dVar2.invoke(transitionUpdateTransition2.getSegment(), composerStartRestartGroup, 0), vectorConverter4, "FloatAnimation", composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged = composerStartRestartGroup.changed(stateCreateTransitionAnimation) | composerStartRestartGroup.changed(stateCreateTransitionAnimation2) | composerStartRestartGroup.changed(transformOriginState);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new a(transformOriginState, stateCreateTransitionAnimation, stateCreateTransitionAnimation2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new a(transformOriginState, stateCreateTransitionAnimation, stateCreateTransitionAnimation2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierGraphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(companion2, (Function1) objRememberedValue);
            MenuTokens menuTokens2 = MenuTokens.INSTANCE;
            Modifier modifier5 = modifier3;
            SurfaceKt.m1329SurfaceT9BRK9s(modifierGraphicsLayer2, ShapesKt.toShape(menuTokens2.getContainerShape(), composerStartRestartGroup, 6), ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), menuTokens2.getContainerColor()), 0L, menuTokens2.m1780getContainerElevationD9Ej5fM(), menuTokens2.m1780getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1651673913, true, new b(modifier3, content, i14)), composerStartRestartGroup, 12804096, 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier5;
        } else {
            if (i15 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-159754260, i14, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:65)");
            }
            Transition transitionUpdateTransition3 = TransitionKt.updateTransition((MutableTransitionState) expandedStates, "DropDownMenu", composerStartRestartGroup, MutableTransitionState.$stable | 48 | (i14 & 14), 0);
            e eVar3 = e.f10629p0;
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            FloatCompanionObject floatCompanionObject3 = FloatCompanionObject.INSTANCE;
            TwoWayConverter<Float, AnimationVector1D> vectorConverter5 = VectorConvertersKt.getVectorConverter(floatCompanionObject3);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            zBooleanValue = ((Boolean) transitionUpdateTransition3.getCurrentState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1808111696);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1808111696, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:90)");
            }
            if (zBooleanValue) {
                f6 = 1.0f;
            } else {
                f6 = 0.8f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Float fValueOf5 = Float.valueOf(f6);
            boolean zBooleanValue7 = ((Boolean) transitionUpdateTransition3.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1808111696);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1808111696, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:90)");
            }
            if (zBooleanValue7) {
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition3, fValueOf5, Float.valueOf(f11), eVar3.invoke(transitionUpdateTransition3.getSegment(), composerStartRestartGroup, 0), vectorConverter5, "FloatAnimation", composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            d dVar3 = d.f10628p0;
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter6 = VectorConvertersKt.getVectorConverter(floatCompanionObject3);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            zBooleanValue2 = ((Boolean) transitionUpdateTransition3.getCurrentState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1864763068);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1864763068, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:110)");
            }
            if (zBooleanValue2) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Float fValueOf6 = Float.valueOf(f10);
            boolean zBooleanValue8 = ((Boolean) transitionUpdateTransition3.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1864763068);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1864763068, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:110)");
            }
            if (zBooleanValue8) {
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition3, fValueOf6, Float.valueOf(f12), dVar3.invoke(transitionUpdateTransition3.getSegment(), composerStartRestartGroup, 0), vectorConverter6, "FloatAnimation", composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged = composerStartRestartGroup.changed(stateCreateTransitionAnimation) | composerStartRestartGroup.changed(stateCreateTransitionAnimation2) | composerStartRestartGroup.changed(transformOriginState);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new a(transformOriginState, stateCreateTransitionAnimation, stateCreateTransitionAnimation2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new a(transformOriginState, stateCreateTransitionAnimation, stateCreateTransitionAnimation2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierGraphicsLayer3 = GraphicsLayerModifierKt.graphicsLayer(companion3, (Function1) objRememberedValue);
            MenuTokens menuTokens3 = MenuTokens.INSTANCE;
            Modifier modifier6 = modifier3;
            SurfaceKt.m1329SurfaceT9BRK9s(modifierGraphicsLayer3, ShapesKt.toShape(menuTokens3.getContainerShape(), composerStartRestartGroup, 6), ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), menuTokens3.getContainerColor()), 0L, menuTokens3.m1780getContainerElevationD9Ej5fM(), menuTokens3.m1780getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1651673913, true, new b(modifier3, content, i14)), composerStartRestartGroup, 12804096, 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier6;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(expandedStates, transformOriginState, modifier2, content, i10, i11));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void DropdownMenuItemContent(@NotNull Function2<? super Composer, ? super Integer, Unit> text, @NotNull Function0<Unit> onClick, @NotNull Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, boolean z10, @NotNull MenuItemColors colors, @NotNull PaddingValues contentPadding, @NotNull MutableInteractionSource interactionSource, @Nullable Composer composer, int i10) {
        int i11;
        Composer composer2;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1564716777);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(text) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(colors) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(contentPadding) ? 8388608 : 4194304;
        }
        if ((234881024 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(interactionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i12 = i11;
        if ((191739611 & i12) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1564716777, i12, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:142)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier, interactionSource, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z10, null, null, onClick, 24, null), 0.0f, 1, null);
            float f6 = f10614d;
            float f10 = f10615e;
            MenuTokens menuTokens = MenuTokens.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(modifierFillMaxWidth$default, f6, menuTokens.m1781getListItemContainerHeightD9Ej5fM(), f10, 0.0f, 8, null), contentPadding);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierPadding);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, density));
            ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            composer2 = composerStartRestartGroup;
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), menuTokens.getListItemLabelTextFont()), ComposableLambdaKt.composableLambda(composer2, 1065051884, true, new f(function2, colors, z10, i12, function3, RowScopeInstance.INSTANCE, text)), composer2, 48);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new g(text, onClick, modifier, function2, function3, z10, colors, contentPadding, interactionSource, i10));
    }

    public static final float access$DropdownMenuContent$lambda$1(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final float access$DropdownMenuContent$lambda$3(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    /* JADX WARN: Code duplicated, block: B:4:0x0017  */
    public static final long calculateTransformOrigin(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
        float fMin;
        Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
        Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
        float fMin2 = 1.0f;
        if (menuBounds.getLeft() >= parentBounds.getRight()) {
            fMin = 0.0f;
        } else if (menuBounds.getRight() <= parentBounds.getLeft()) {
            fMin = 1.0f;
        } else if (menuBounds.getWidth() == 0) {
            fMin = 0.0f;
        } else {
            fMin = (((Math.min(parentBounds.getRight(), menuBounds.getRight()) + Math.max(parentBounds.getLeft(), menuBounds.getLeft())) / 2) - menuBounds.getLeft()) / menuBounds.getWidth();
        }
        if (menuBounds.getTop() >= parentBounds.getBottom()) {
            fMin2 = 0.0f;
        } else if (menuBounds.getBottom() > parentBounds.getTop()) {
            if (menuBounds.getHeight() == 0) {
                fMin2 = 0.0f;
            } else {
                fMin2 = (((Math.min(parentBounds.getBottom(), menuBounds.getBottom()) + Math.max(parentBounds.getTop(), menuBounds.getTop())) / 2) - menuBounds.getTop()) / menuBounds.getHeight();
            }
        }
        return TransformOriginKt.TransformOrigin(fMin, fMin2);
    }

    public static final float getDropdownMenuVerticalPadding() {
        return f10613c;
    }

    public static final float getMenuVerticalMargin() {
        return f10611a;
    }
}
