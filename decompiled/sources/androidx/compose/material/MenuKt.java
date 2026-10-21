package androidx.compose.material;

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
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
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
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntRect;
import androidx.profileinstaller.ProfileVerifier;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
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
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a^\u0010\u0010\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001ac\u0010\u001a\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\"\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \"\u001d\u0010&\u001a\u00020!8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u001d\u0010)\u001a\u00020!8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%\"\u0014\u0010+\u001a\u00020*8\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010-\u001a\u00020*8\u0000X\u0080T¢\u0006\u0006\n\u0004\b-\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061²\u0006\f\u0010/\u001a\u00020.8\nX\u008a\u0084\u0002²\u0006\f\u00100\u001a\u00020.8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/animation/core/MutableTransitionState;", "", "expandedStates", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOriginState", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "DropdownMenuContent", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onClick", "enabled", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/RowScope;", "DropdownMenuItemContent", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/IntRect;", "parentBounds", "menuBounds", "calculateTransformOrigin", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)J", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getMenuVerticalMargin", "()F", "MenuVerticalMargin", "d", "getDropdownMenuVerticalPadding", "DropdownMenuVerticalPadding", "", "InTransitionDuration", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "OutTransitionDuration", "", ImageScaleTypeHandler.ID, "alpha", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,298:1\n937#2,4:299\n858#2,5:303\n937#2,4:308\n858#2,5:312\n67#3,3:317\n66#3:320\n25#3:327\n456#3,8:351\n464#3,3:365\n467#3,3:369\n1097#4,6:321\n1097#4,6:328\n73#5,6:334\n79#5:368\n83#5:373\n78#6,11:340\n91#6:372\n4144#7,6:359\n81#8:374\n81#8:375\n154#9:376\n154#9:377\n154#9:378\n154#9:379\n154#9:380\n154#9:381\n154#9:382\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt\n*L\n71#1:299,4\n71#1:303,5\n97#1:308,4\n97#1:312,5\n117#1:317,3\n117#1:320\n141#1:327\n145#1:351,8\n145#1:365,3\n145#1:369,3\n117#1:321,6\n141#1:328,6\n145#1:334,6\n145#1:368\n145#1:373\n145#1:340,11\n145#1:372\n145#1:359,6\n71#1:374\n97#1:375\n187#1:376\n188#1:377\n189#1:378\n190#1:379\n191#1:380\n192#1:381\n193#1:382\n*E\n"})
public final class MenuKt {
    public static final int InTransitionDuration = 120;
    public static final int OutTransitionDuration = 75;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f7278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f7279b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f7281d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f7284g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f7280c = Dp.m4389constructorimpl(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f7282e = Dp.m4389constructorimpl(112);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f7283f = Dp.m4389constructorimpl(280);

    /* JADX INFO: compiled from: Menu.kt */
    public static final class a extends Lambda implements Function1<GraphicsLayerScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TransformOrigin> f7285p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f7286q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f7287r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableState<TransformOrigin> mutableState, State<Float> state, State<Float> state2) {
            super(1);
            this.f7285p0 = mutableState;
            this.f7286q0 = state;
            this.f7287r0 = state2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
            GraphicsLayerScope graphicsLayer = graphicsLayerScope;
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            State<Float> state = this.f7286q0;
            graphicsLayer.setScaleX(MenuKt.access$DropdownMenuContent$lambda$1(state));
            graphicsLayer.setScaleY(MenuKt.access$DropdownMenuContent$lambda$1(state));
            graphicsLayer.setAlpha(MenuKt.access$DropdownMenuContent$lambda$3(this.f7287r0));
            graphicsLayer.mo2664setTransformOrigin__ExYCQ(this.f7285p0.getValue().getF15746a());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Menu.kt */
    @SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt$DropdownMenuContent$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,298:1\n72#2,6:299\n78#2:333\n82#2:338\n78#3,11:305\n91#3:337\n456#4,8:316\n464#4,3:330\n467#4,3:334\n4144#5,6:324\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt$DropdownMenuContent$2\n*L\n125#1:299,6\n125#1:333\n125#1:338\n125#1:305,11\n125#1:337\n125#1:316,8\n125#1:330,3\n125#1:334,3\n125#1:324,6\n*E\n"})
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7288p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ScrollState f7289q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f7290r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f7291s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Modifier modifier, ScrollState scrollState, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f7288p0 = modifier;
            this.f7289q0 = scrollState;
            this.f7290r0 = function3;
            this.f7291s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(895555282, iIntValue, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:123)");
                }
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(IntrinsicKt.width(PaddingKt.m298paddingVpY3zN4$default(this.f7288p0, 0.0f, MenuKt.getDropdownMenuVerticalPadding(), 1, null), IntrinsicSize.Max), this.f7289q0, false, null, false, 14, null);
                int i10 = (this.f7291s0 >> 3) & 7168;
                composer2.startReplaceableGroup(-483455358);
                int i11 = i10 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, (i11 & 112) | (i11 & 14));
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default);
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
                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyColumnMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j((i12 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                this.f7290r0.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i10 >> 6) & 112) | 6));
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
        public final /* synthetic */ MutableTransitionState<Boolean> f7292p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TransformOrigin> f7293q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ScrollState f7294r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7295s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f7296t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f7297u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(MutableTransitionState<Boolean> mutableTransitionState, MutableState<TransformOrigin> mutableState, ScrollState scrollState, Modifier modifier, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f7292p0 = mutableTransitionState;
            this.f7293q0 = mutableState;
            this.f7294r0 = scrollState;
            this.f7295s0 = modifier;
            this.f7296t0 = function3;
            this.f7297u0 = i10;
            this.v0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MenuKt.DropdownMenuContent(this.f7292p0, this.f7293q0, this.f7294r0, this.f7295s0, this.f7296t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7297u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Menu.kt */
    public static final class d extends Lambda implements Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f7298p0 = new d(3);

        @Override // kotlin.jvm.functions.Function3
        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer, Integer num) {
            Transition.Segment<Boolean> segment2 = segment;
            Composer composer2 = composer;
            int iD = androidx.datastore.preferences.protobuf.e.d(num, segment2, "$this$animateFloat", composer2, -2065494304);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2065494304, iD, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:97)");
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
        public static final e f7299p0 = new e(3);

        @Override // kotlin.jvm.functions.Function3
        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer, Integer num) {
            Transition.Segment<Boolean> segment2 = segment;
            Composer composer2 = composer;
            int iD = androidx.datastore.preferences.protobuf.e.d(num, segment2, "$this$animateFloat", composer2, -800950068);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-800950068, iD, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:71)");
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
        public final /* synthetic */ boolean f7300p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f7301q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ RowScope f7302r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f7303s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z10, Function3 function3, RowScopeInstance rowScopeInstance, int i10) {
            super(2);
            this.f7300p0 = z10;
            this.f7301q0 = function3;
            this.f7302r0 = rowScopeInstance;
            this.f7303s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            float disabled;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1190489496, iIntValue, -1, "androidx.compose.material.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:163)");
                }
                if (this.f7300p0) {
                    composer2.startReplaceableGroup(-1945695304);
                    disabled = ContentAlpha.INSTANCE.getHigh(composer2, 6);
                } else {
                    composer2.startReplaceableGroup(-1945695281);
                    disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                }
                composer2.endReplaceableGroup();
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, ComposableLambdaKt.composableLambda(composer2, -1705995688, true, new d1(this.f7301q0, this.f7302r0, 6, this.f7303s0)), composer2, 56);
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
        public final /* synthetic */ Function0<Unit> f7304p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7305q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f7306r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f7307s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f7308t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f7309u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f7310w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function0<Unit> function0, Modifier modifier, boolean z10, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f7304p0 = function0;
            this.f7305q0 = modifier;
            this.f7306r0 = z10;
            this.f7307s0 = paddingValues;
            this.f7308t0 = mutableInteractionSource;
            this.f7309u0 = function3;
            this.v0 = i10;
            this.f7310w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MenuKt.DropdownMenuItemContent(this.f7304p0, this.f7305q0, this.f7306r0, this.f7307s0, this.f7308t0, this.f7309u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f7310w0);
            return Unit.INSTANCE;
        }
    }

    static {
        float f6 = 8;
        f7278a = Dp.m4389constructorimpl(f6);
        float f10 = 48;
        f7279b = Dp.m4389constructorimpl(f10);
        f7281d = Dp.m4389constructorimpl(f6);
        f7284g = Dp.m4389constructorimpl(f10);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:104:0x01df  */
    /* JADX WARN: Code duplicated, block: B:107:0x0228  */
    /* JADX WARN: Code duplicated, block: B:109:0x0230  */
    /* JADX WARN: Code duplicated, block: B:112:0x0268  */
    /* JADX WARN: Code duplicated, block: B:117:0x0273  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:69:0x0105  */
    /* JADX WARN: Code duplicated, block: B:72:0x010f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0112  */
    /* JADX WARN: Code duplicated, block: B:76:0x0119  */
    /* JADX WARN: Code duplicated, block: B:79:0x0136  */
    /* JADX WARN: Code duplicated, block: B:81:0x013b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0143  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:91:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d1  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void DropdownMenuContent(@NotNull MutableTransitionState<Boolean> expandedStates, @NotNull MutableState<TransformOrigin> transformOriginState, @NotNull ScrollState scrollState, @Nullable Modifier modifier, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        int i14;
        Modifier modifier3;
        boolean zBooleanValue;
        float f6;
        State stateCreateTransitionAnimation;
        boolean zBooleanValue2;
        int i15;
        float f10;
        State stateCreateTransitionAnimation2;
        boolean zChanged;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(expandedStates, "expandedStates");
        Intrinsics.checkNotNullParameter(transformOriginState, "transformOriginState");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(435109845);
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
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changed(scrollState) ? 256 : 128;
        }
        int i16 = i11 & 8;
        if (i16 == 0) {
            if ((i10 & 7168) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i13 = 16384;
                } else {
                    i13 = 8192;
                }
                i12 |= i13;
            }
            i14 = i12;
            if ((46811 & i14) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(435109845, i14, -1, "androidx.compose.material.DropdownMenuContent (Menu.kt:60)");
                }
                Transition transitionUpdateTransition = TransitionKt.updateTransition((MutableTransitionState) expandedStates, "DropDownMenu", composerStartRestartGroup, MutableTransitionState.$stable | 48 | (i14 & 14), 0);
                composerStartRestartGroup.startReplaceableGroup(-1338768149);
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                composerStartRestartGroup.startReplaceableGroup(-142660079);
                zBooleanValue = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
                composerStartRestartGroup.startReplaceableGroup(1652594929);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1652594929, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:86)");
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
                composerStartRestartGroup.startReplaceableGroup(1652594929);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1652594929, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:86)");
                }
                float f11 = zBooleanValue3 ? 1.0f : 0.8f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier4 = modifier3;
                stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f11), e.f7299p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter, "FloatAnimation", composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1338768149);
                TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                composerStartRestartGroup.startReplaceableGroup(-142660079);
                zBooleanValue2 = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
                composerStartRestartGroup.startReplaceableGroup(388050693);
                if (ComposerKt.isTraceInProgress()) {
                    i15 = 0;
                    ComposerKt.traceEventStart(388050693, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:106)");
                } else {
                    i15 = 0;
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
                composerStartRestartGroup.startReplaceableGroup(388050693);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(388050693, i15, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:106)");
                }
                float f12 = zBooleanValue4 ? 1.0f : 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf2, Float.valueOf(f12), d.f7298p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, Integer.valueOf(i15)), vectorConverter2, "FloatAnimation", composerStartRestartGroup, 0);
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
                CardKt.m691CardFjzlyU(GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) objRememberedValue), null, 0L, 0L, null, f7278a, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 895555282, true, new b(modifier4, scrollState, content, i14)), composerStartRestartGroup, 1769472, 30);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new c(expandedStates, transformOriginState, scrollState, modifier2, content, i10, i11));
        }
        i12 |= 3072;
        modifier2 = modifier;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i12 |= i13;
        }
        i14 = i12;
        if ((46811 & i14) == 9362) {
            if (i16 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(435109845, i14, -1, "androidx.compose.material.DropdownMenuContent (Menu.kt:60)");
            }
            Transition transitionUpdateTransition2 = TransitionKt.updateTransition((MutableTransitionState) expandedStates, "DropDownMenu", composerStartRestartGroup, MutableTransitionState.$stable | 48 | (i14 & 14), 0);
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            FloatCompanionObject floatCompanionObject2 = FloatCompanionObject.INSTANCE;
            TwoWayConverter<Float, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(floatCompanionObject2);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            zBooleanValue = ((Boolean) transitionUpdateTransition2.getCurrentState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1652594929);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1652594929, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:86)");
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
            composerStartRestartGroup.startReplaceableGroup(1652594929);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1652594929, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:86)");
            }
            if (zBooleanValue5) {
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifier5 = modifier3;
            stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition2, fValueOf3, Float.valueOf(f11), e.f7299p0.invoke(transitionUpdateTransition2.getSegment(), composerStartRestartGroup, 0), vectorConverter3, "FloatAnimation", composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter4 = VectorConvertersKt.getVectorConverter(floatCompanionObject2);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            zBooleanValue2 = ((Boolean) transitionUpdateTransition2.getCurrentState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(388050693);
            if (ComposerKt.isTraceInProgress()) {
                i15 = 0;
                ComposerKt.traceEventStart(388050693, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:106)");
            } else {
                i15 = 0;
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
            composerStartRestartGroup.startReplaceableGroup(388050693);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(388050693, i15, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:106)");
            }
            if (zBooleanValue6) {
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition2, fValueOf4, Float.valueOf(f12), d.f7298p0.invoke(transitionUpdateTransition2.getSegment(), composerStartRestartGroup, Integer.valueOf(i15)), vectorConverter4, "FloatAnimation", composerStartRestartGroup, 0);
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
            CardKt.m691CardFjzlyU(GraphicsLayerModifierKt.graphicsLayer(companion2, (Function1) objRememberedValue), null, 0L, 0L, null, f7278a, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 895555282, true, new b(modifier5, scrollState, content, i14)), composerStartRestartGroup, 1769472, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier5;
        } else {
            if (i16 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(435109845, i14, -1, "androidx.compose.material.DropdownMenuContent (Menu.kt:60)");
            }
            Transition transitionUpdateTransition3 = TransitionKt.updateTransition((MutableTransitionState) expandedStates, "DropDownMenu", composerStartRestartGroup, MutableTransitionState.$stable | 48 | (i14 & 14), 0);
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            FloatCompanionObject floatCompanionObject3 = FloatCompanionObject.INSTANCE;
            TwoWayConverter<Float, AnimationVector1D> vectorConverter5 = VectorConvertersKt.getVectorConverter(floatCompanionObject3);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            zBooleanValue = ((Boolean) transitionUpdateTransition3.getCurrentState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1652594929);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1652594929, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:86)");
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
            composerStartRestartGroup.startReplaceableGroup(1652594929);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1652594929, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:86)");
            }
            if (zBooleanValue7) {
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifier6 = modifier3;
            stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition3, fValueOf5, Float.valueOf(f11), e.f7299p0.invoke(transitionUpdateTransition3.getSegment(), composerStartRestartGroup, 0), vectorConverter5, "FloatAnimation", composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter6 = VectorConvertersKt.getVectorConverter(floatCompanionObject3);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            zBooleanValue2 = ((Boolean) transitionUpdateTransition3.getCurrentState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(388050693);
            if (ComposerKt.isTraceInProgress()) {
                i15 = 0;
                ComposerKt.traceEventStart(388050693, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:106)");
            } else {
                i15 = 0;
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
            composerStartRestartGroup.startReplaceableGroup(388050693);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(388050693, i15, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:106)");
            }
            if (zBooleanValue8) {
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition3, fValueOf6, Float.valueOf(f12), d.f7298p0.invoke(transitionUpdateTransition3.getSegment(), composerStartRestartGroup, Integer.valueOf(i15)), vectorConverter6, "FloatAnimation", composerStartRestartGroup, 0);
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
            CardKt.m691CardFjzlyU(GraphicsLayerModifierKt.graphicsLayer(companion3, (Function1) objRememberedValue), null, 0L, 0L, null, f7278a, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 895555282, true, new b(modifier6, scrollState, content, i14)), composerStartRestartGroup, 1769472, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier6;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(expandedStates, transformOriginState, scrollState, modifier2, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:109:0x020c  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x010c  */
    /* JADX WARN: Code duplicated, block: B:92:0x018d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0199  */
    /* JADX WARN: Code duplicated, block: B:96:0x019d  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ae  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void DropdownMenuItemContent(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, boolean z10, @Nullable PaddingValues paddingValues, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        PaddingValues dropdownMenuItemContentPadding;
        int i16;
        int i17;
        MutableInteractionSource mutableInteractionSource2;
        int i18;
        int i19;
        int i20;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM2074constructorimpl;
        Function2 function2C;
        boolean z12;
        PaddingValues paddingValues2;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier4;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(87134531);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        dropdownMenuItemContentPadding = paddingValues;
                        if (composerStartRestartGroup.changed(dropdownMenuItemContentPadding)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((57344 & i10) == 0) {
                            mutableInteractionSource2 = mutableInteractionSource;
                            if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((i11 & 32) != 0) {
                            if ((458752 & i10) == 0) {
                                if (composerStartRestartGroup.changedInstance(content)) {
                                    i19 = 131072;
                                } else {
                                    i19 = 65536;
                                }
                            }
                            i20 = i12;
                            if ((374491 & i20) == 74898 || !composerStartRestartGroup.getSkipping()) {
                                if (i21 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                }
                                if (i15 != 0) {
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                }
                                if (i17 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                                }
                                boolean z13 = z11;
                                PaddingValues paddingValues3 = dropdownMenuItemContentPadding;
                                Modifier modifierPadding = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z13, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues3);
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                composerStartRestartGroup.startReplaceableGroup(693286680);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
                                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                                function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
                                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                                }
                                ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                                z12 = z13;
                                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                paddingValues2 = paddingValues3;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                modifier4 = modifier3;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier4 = modifier2;
                                z12 = z11;
                                paddingValues2 = dropdownMenuItemContentPadding;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
                        }
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        i12 |= i19;
                        i20 = i12;
                        if ((374491 & i20) == 74898) {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            }
                            if (i17 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                            }
                            boolean z14 = z11;
                            PaddingValues paddingValues4 = dropdownMenuItemContentPadding;
                            Modifier modifierPadding2 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z14, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues4);
                            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                            composerStartRestartGroup.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierPadding2);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                            function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyRowMeasurePolicy2, composerM2074constructorimpl, currentCompositionLocalMap2);
                            if (composerM2074constructorimpl.getInserting()) {
                                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                            } else {
                                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                            }
                            ai.a.j(0, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            z12 = z14;
                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            paddingValues2 = paddingValues4;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            modifier4 = modifier3;
                        } else {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            }
                            if (i17 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                            }
                            boolean z15 = z11;
                            PaddingValues paddingValues5 = dropdownMenuItemContentPadding;
                            Modifier modifierPadding3 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z15, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues5);
                            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                            composerStartRestartGroup.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, composerStartRestartGroup, 48);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierPadding3);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                            function2C = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl, measurePolicyRowMeasurePolicy3, composerM2074constructorimpl, currentCompositionLocalMap3);
                            if (composerM2074constructorimpl.getInserting()) {
                                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                            } else {
                                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                            }
                            ai.a.j(0, function3ModifierMaterializerOf3, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            z12 = z15;
                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            paddingValues2 = paddingValues5;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            modifier4 = modifier3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
                    }
                    i12 |= 24576;
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i11 & 32) != 0) {
                        if ((458752 & i10) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        i20 = i12;
                        if ((374491 & i20) == 74898) {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            }
                            if (i17 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                            }
                            boolean z16 = z11;
                            PaddingValues paddingValues6 = dropdownMenuItemContentPadding;
                            Modifier modifierPadding4 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z16, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues6);
                            Alignment.Vertical centerVertically4 = Alignment.INSTANCE.getCenterVertically();
                            composerStartRestartGroup.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically4, composerStartRestartGroup, 48);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            constructor = companion4.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierPadding4);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                            function2C = com.google.android.gms.measurement.internal.a.c(companion4, composerM2074constructorimpl, measurePolicyRowMeasurePolicy4, composerM2074constructorimpl, currentCompositionLocalMap4);
                            if (composerM2074constructorimpl.getInserting()) {
                                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                            } else {
                                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                            }
                            ai.a.j(0, function3ModifierMaterializerOf4, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            z12 = z16;
                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            paddingValues2 = paddingValues6;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            modifier4 = modifier3;
                        } else {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            }
                            if (i17 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                            }
                            boolean z17 = z11;
                            PaddingValues paddingValues7 = dropdownMenuItemContentPadding;
                            Modifier modifierPadding5 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z17, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues7);
                            Alignment.Vertical centerVertically5 = Alignment.INSTANCE.getCenterVertically();
                            composerStartRestartGroup.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically5, composerStartRestartGroup, 48);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                            constructor = companion5.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierPadding5);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                            function2C = com.google.android.gms.measurement.internal.a.c(companion5, composerM2074constructorimpl, measurePolicyRowMeasurePolicy5, composerM2074constructorimpl, currentCompositionLocalMap5);
                            if (composerM2074constructorimpl.getInserting()) {
                                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                            } else {
                                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                            }
                            ai.a.j(0, function3ModifierMaterializerOf5, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            z12 = z17;
                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            paddingValues2 = paddingValues7;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            modifier4 = modifier3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
                    }
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 |= i19;
                    i20 = i12;
                    if ((374491 & i20) == 74898) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                        }
                        boolean z18 = z11;
                        PaddingValues paddingValues8 = dropdownMenuItemContentPadding;
                        Modifier modifierPadding6 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z18, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues8);
                        Alignment.Vertical centerVertically6 = Alignment.INSTANCE.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically6, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        constructor = companion6.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierPadding6);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion6, composerM2074constructorimpl, measurePolicyRowMeasurePolicy6, composerM2074constructorimpl, currentCompositionLocalMap6);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf6, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        z12 = z18;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        paddingValues2 = paddingValues8;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier3;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                        }
                        boolean z19 = z11;
                        PaddingValues paddingValues9 = dropdownMenuItemContentPadding;
                        Modifier modifierPadding7 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z19, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues9);
                        Alignment.Vertical centerVertically7 = Alignment.INSTANCE.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically7, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                        constructor = companion7.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierPadding7);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion7, composerM2074constructorimpl, measurePolicyRowMeasurePolicy7, composerM2074constructorimpl, currentCompositionLocalMap7);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf7, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        z12 = z19;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        paddingValues2 = paddingValues9;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
                }
                i12 |= 3072;
                dropdownMenuItemContentPadding = paddingValues;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        if ((458752 & i10) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        i20 = i12;
                        if ((374491 & i20) == 74898) {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            }
                            if (i17 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                            }
                            boolean z110 = z11;
                            PaddingValues paddingValues10 = dropdownMenuItemContentPadding;
                            Modifier modifierPadding8 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z110, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues10);
                            Alignment.Vertical centerVertically8 = Alignment.INSTANCE.getCenterVertically();
                            composerStartRestartGroup.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy8 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically8, composerStartRestartGroup, 48);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                            constructor = companion8.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierPadding8);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                            function2C = com.google.android.gms.measurement.internal.a.c(companion8, composerM2074constructorimpl, measurePolicyRowMeasurePolicy8, composerM2074constructorimpl, currentCompositionLocalMap8);
                            if (composerM2074constructorimpl.getInserting()) {
                                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                            } else {
                                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                            }
                            ai.a.j(0, function3ModifierMaterializerOf8, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            z12 = z110;
                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            paddingValues2 = paddingValues10;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            modifier4 = modifier3;
                        } else {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            }
                            if (i17 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                            }
                            boolean z111 = z11;
                            PaddingValues paddingValues11 = dropdownMenuItemContentPadding;
                            Modifier modifierPadding9 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z111, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues11);
                            Alignment.Vertical centerVertically9 = Alignment.INSTANCE.getCenterVertically();
                            composerStartRestartGroup.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy9 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically9, composerStartRestartGroup, 48);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                            constructor = companion9.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierPadding9);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                            function2C = com.google.android.gms.measurement.internal.a.c(companion9, composerM2074constructorimpl, measurePolicyRowMeasurePolicy9, composerM2074constructorimpl, currentCompositionLocalMap9);
                            if (composerM2074constructorimpl.getInserting()) {
                                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                            } else {
                                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                            }
                            ai.a.j(0, function3ModifierMaterializerOf9, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            z12 = z111;
                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            paddingValues2 = paddingValues11;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            modifier4 = modifier3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
                    }
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 |= i19;
                    i20 = i12;
                    if ((374491 & i20) == 74898) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                        }
                        boolean z112 = z11;
                        PaddingValues paddingValues12 = dropdownMenuItemContentPadding;
                        Modifier modifierPadding10 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z112, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues12);
                        Alignment.Vertical centerVertically10 = Alignment.INSTANCE.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy10 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically10, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                        constructor = companion10.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierPadding10);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion10, composerM2074constructorimpl, measurePolicyRowMeasurePolicy10, composerM2074constructorimpl, currentCompositionLocalMap10);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf10, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        z12 = z112;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        paddingValues2 = paddingValues12;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier3;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                        }
                        boolean z113 = z11;
                        PaddingValues paddingValues13 = dropdownMenuItemContentPadding;
                        Modifier modifierPadding11 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z113, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues13);
                        Alignment.Vertical centerVertically11 = Alignment.INSTANCE.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy11 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically11, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                        constructor = companion11.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierPadding11);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion11, composerM2074constructorimpl, measurePolicyRowMeasurePolicy11, composerM2074constructorimpl, currentCompositionLocalMap11);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf11, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        z12 = z113;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        paddingValues2 = paddingValues13;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
                }
                i12 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    i20 = i12;
                    if ((374491 & i20) == 74898) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                        }
                        boolean z114 = z11;
                        PaddingValues paddingValues14 = dropdownMenuItemContentPadding;
                        Modifier modifierPadding12 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z114, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues14);
                        Alignment.Vertical centerVertically12 = Alignment.INSTANCE.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy12 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically12, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                        constructor = companion12.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierPadding12);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion12, composerM2074constructorimpl, measurePolicyRowMeasurePolicy12, composerM2074constructorimpl, currentCompositionLocalMap12);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf12, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        z12 = z114;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        paddingValues2 = paddingValues14;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier3;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                        }
                        boolean z115 = z11;
                        PaddingValues paddingValues15 = dropdownMenuItemContentPadding;
                        Modifier modifierPadding13 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z115, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues15);
                        Alignment.Vertical centerVertically13 = Alignment.INSTANCE.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy13 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically13, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                        constructor = companion13.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierPadding13);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion13, composerM2074constructorimpl, measurePolicyRowMeasurePolicy13, composerM2074constructorimpl, currentCompositionLocalMap13);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf13, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        z12 = z115;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        paddingValues2 = paddingValues15;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                i20 = i12;
                if ((374491 & i20) == 74898) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                    }
                    boolean z116 = z11;
                    PaddingValues paddingValues16 = dropdownMenuItemContentPadding;
                    Modifier modifierPadding14 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z116, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues16);
                    Alignment.Vertical centerVertically14 = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy14 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically14, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                    constructor = companion14.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierPadding14);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion14, composerM2074constructorimpl, measurePolicyRowMeasurePolicy14, composerM2074constructorimpl, currentCompositionLocalMap14);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf14, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    z12 = z116;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    paddingValues2 = paddingValues16;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier3;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                    }
                    boolean z117 = z11;
                    PaddingValues paddingValues17 = dropdownMenuItemContentPadding;
                    Modifier modifierPadding15 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z117, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues17);
                    Alignment.Vertical centerVertically15 = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy15 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically15, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                    constructor = companion15.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierPadding15);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion15, composerM2074constructorimpl, measurePolicyRowMeasurePolicy15, composerM2074constructorimpl, currentCompositionLocalMap15);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf15, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    z12 = z117;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    paddingValues2 = paddingValues17;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            z11 = z10;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    dropdownMenuItemContentPadding = paddingValues;
                    if (composerStartRestartGroup.changed(dropdownMenuItemContentPadding)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        if ((458752 & i10) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        i20 = i12;
                        if ((374491 & i20) == 74898) {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            }
                            if (i17 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                            }
                            boolean z118 = z11;
                            PaddingValues paddingValues18 = dropdownMenuItemContentPadding;
                            Modifier modifierPadding16 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z118, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues18);
                            Alignment.Vertical centerVertically16 = Alignment.INSTANCE.getCenterVertically();
                            composerStartRestartGroup.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy16 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically16, composerStartRestartGroup, 48);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                            constructor = companion16.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierPadding16);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                            function2C = com.google.android.gms.measurement.internal.a.c(companion16, composerM2074constructorimpl, measurePolicyRowMeasurePolicy16, composerM2074constructorimpl, currentCompositionLocalMap16);
                            if (composerM2074constructorimpl.getInserting()) {
                                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                            } else {
                                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                            }
                            ai.a.j(0, function3ModifierMaterializerOf16, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            z12 = z118;
                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            paddingValues2 = paddingValues18;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            modifier4 = modifier3;
                        } else {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            }
                            if (i17 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                            }
                            boolean z119 = z11;
                            PaddingValues paddingValues19 = dropdownMenuItemContentPadding;
                            Modifier modifierPadding17 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z119, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues19);
                            Alignment.Vertical centerVertically17 = Alignment.INSTANCE.getCenterVertically();
                            composerStartRestartGroup.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy17 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically17, composerStartRestartGroup, 48);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap17 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                            constructor = companion17.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf17 = LayoutKt.modifierMaterializerOf(modifierPadding17);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                            function2C = com.google.android.gms.measurement.internal.a.c(companion17, composerM2074constructorimpl, measurePolicyRowMeasurePolicy17, composerM2074constructorimpl, currentCompositionLocalMap17);
                            if (composerM2074constructorimpl.getInserting()) {
                                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                            } else {
                                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                            }
                            ai.a.j(0, function3ModifierMaterializerOf17, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            z12 = z119;
                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            paddingValues2 = paddingValues19;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            modifier4 = modifier3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
                    }
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 |= i19;
                    i20 = i12;
                    if ((374491 & i20) == 74898) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                        }
                        boolean z1110 = z11;
                        PaddingValues paddingValues110 = dropdownMenuItemContentPadding;
                        Modifier modifierPadding18 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z1110, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues110);
                        Alignment.Vertical centerVertically18 = Alignment.INSTANCE.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy18 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically18, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap18 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                        constructor = companion18.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf18 = LayoutKt.modifierMaterializerOf(modifierPadding18);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion18, composerM2074constructorimpl, measurePolicyRowMeasurePolicy18, composerM2074constructorimpl, currentCompositionLocalMap18);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf18, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        z12 = z1110;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        paddingValues2 = paddingValues110;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier3;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                        }
                        boolean z1111 = z11;
                        PaddingValues paddingValues111 = dropdownMenuItemContentPadding;
                        Modifier modifierPadding19 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z1111, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues111);
                        Alignment.Vertical centerVertically19 = Alignment.INSTANCE.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy19 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically19, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap19 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                        constructor = companion19.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf19 = LayoutKt.modifierMaterializerOf(modifierPadding19);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion19, composerM2074constructorimpl, measurePolicyRowMeasurePolicy19, composerM2074constructorimpl, currentCompositionLocalMap19);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf19, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        z12 = z1111;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        paddingValues2 = paddingValues111;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
                }
                i12 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    i20 = i12;
                    if ((374491 & i20) == 74898) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                        }
                        boolean z1112 = z11;
                        PaddingValues paddingValues112 = dropdownMenuItemContentPadding;
                        Modifier modifierPadding110 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z1112, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues112);
                        Alignment.Vertical centerVertically110 = Alignment.INSTANCE.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy110 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically110, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                        constructor = companion110.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf110 = LayoutKt.modifierMaterializerOf(modifierPadding110);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion110, composerM2074constructorimpl, measurePolicyRowMeasurePolicy110, composerM2074constructorimpl, currentCompositionLocalMap110);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf110, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        z12 = z1112;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        paddingValues2 = paddingValues112;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier3;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                        }
                        boolean z1113 = z11;
                        PaddingValues paddingValues113 = dropdownMenuItemContentPadding;
                        Modifier modifierPadding111 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z1113, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues113);
                        Alignment.Vertical centerVertically111 = Alignment.INSTANCE.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy111 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically111, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                        constructor = companion111.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111 = LayoutKt.modifierMaterializerOf(modifierPadding111);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion111, composerM2074constructorimpl, measurePolicyRowMeasurePolicy111, composerM2074constructorimpl, currentCompositionLocalMap111);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf111, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        z12 = z1113;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        paddingValues2 = paddingValues113;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                i20 = i12;
                if ((374491 & i20) == 74898) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                    }
                    boolean z1114 = z11;
                    PaddingValues paddingValues114 = dropdownMenuItemContentPadding;
                    Modifier modifierPadding112 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z1114, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues114);
                    Alignment.Vertical centerVertically112 = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy112 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically112, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion112 = ComposeUiNode.INSTANCE;
                    constructor = companion112.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf112 = LayoutKt.modifierMaterializerOf(modifierPadding112);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion112, composerM2074constructorimpl, measurePolicyRowMeasurePolicy112, composerM2074constructorimpl, currentCompositionLocalMap112);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf112, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    z12 = z1114;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    paddingValues2 = paddingValues114;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier3;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                    }
                    boolean z1115 = z11;
                    PaddingValues paddingValues115 = dropdownMenuItemContentPadding;
                    Modifier modifierPadding113 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z1115, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues115);
                    Alignment.Vertical centerVertically113 = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy113 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically113, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                    constructor = companion113.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf113 = LayoutKt.modifierMaterializerOf(modifierPadding113);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion113, composerM2074constructorimpl, measurePolicyRowMeasurePolicy113, composerM2074constructorimpl, currentCompositionLocalMap113);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf113, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    z12 = z1115;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    paddingValues2 = paddingValues115;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
            }
            i12 |= 3072;
            dropdownMenuItemContentPadding = paddingValues;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    i20 = i12;
                    if ((374491 & i20) == 74898) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                        }
                        boolean z1116 = z11;
                        PaddingValues paddingValues116 = dropdownMenuItemContentPadding;
                        Modifier modifierPadding114 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z1116, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues116);
                        Alignment.Vertical centerVertically114 = Alignment.INSTANCE.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy114 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically114, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                        constructor = companion114.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf114 = LayoutKt.modifierMaterializerOf(modifierPadding114);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion114, composerM2074constructorimpl, measurePolicyRowMeasurePolicy114, composerM2074constructorimpl, currentCompositionLocalMap114);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf114, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        z12 = z1116;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        paddingValues2 = paddingValues116;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier3;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                        }
                        boolean z1117 = z11;
                        PaddingValues paddingValues117 = dropdownMenuItemContentPadding;
                        Modifier modifierPadding115 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z1117, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues117);
                        Alignment.Vertical centerVertically115 = Alignment.INSTANCE.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy115 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically115, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion115 = ComposeUiNode.INSTANCE;
                        constructor = companion115.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf115 = LayoutKt.modifierMaterializerOf(modifierPadding115);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion115, composerM2074constructorimpl, measurePolicyRowMeasurePolicy115, composerM2074constructorimpl, currentCompositionLocalMap115);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf115, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        z12 = z1117;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        paddingValues2 = paddingValues117;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                i20 = i12;
                if ((374491 & i20) == 74898) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                    }
                    boolean z1118 = z11;
                    PaddingValues paddingValues118 = dropdownMenuItemContentPadding;
                    Modifier modifierPadding116 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z1118, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues118);
                    Alignment.Vertical centerVertically116 = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy116 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically116, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion116 = ComposeUiNode.INSTANCE;
                    constructor = companion116.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf116 = LayoutKt.modifierMaterializerOf(modifierPadding116);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion116, composerM2074constructorimpl, measurePolicyRowMeasurePolicy116, composerM2074constructorimpl, currentCompositionLocalMap116);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf116, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    z12 = z1118;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    paddingValues2 = paddingValues118;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier3;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                    }
                    boolean z1119 = z11;
                    PaddingValues paddingValues119 = dropdownMenuItemContentPadding;
                    Modifier modifierPadding117 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z1119, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues119);
                    Alignment.Vertical centerVertically117 = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy117 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically117, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                    constructor = companion117.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf117 = LayoutKt.modifierMaterializerOf(modifierPadding117);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion117, composerM2074constructorimpl, measurePolicyRowMeasurePolicy117, composerM2074constructorimpl, currentCompositionLocalMap117);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf117, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    z12 = z1119;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    paddingValues2 = paddingValues119;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
            }
            i12 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                i20 = i12;
                if ((374491 & i20) == 74898) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                    }
                    boolean z11110 = z11;
                    PaddingValues paddingValues1110 = dropdownMenuItemContentPadding;
                    Modifier modifierPadding118 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z11110, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues1110);
                    Alignment.Vertical centerVertically118 = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy118 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically118, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion118 = ComposeUiNode.INSTANCE;
                    constructor = companion118.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf118 = LayoutKt.modifierMaterializerOf(modifierPadding118);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion118, composerM2074constructorimpl, measurePolicyRowMeasurePolicy118, composerM2074constructorimpl, currentCompositionLocalMap118);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf118, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    z12 = z11110;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    paddingValues2 = paddingValues1110;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier3;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                    }
                    boolean z11111 = z11;
                    PaddingValues paddingValues1111 = dropdownMenuItemContentPadding;
                    Modifier modifierPadding119 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z11111, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues1111);
                    Alignment.Vertical centerVertically119 = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy119 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically119, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
                    constructor = companion119.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf119 = LayoutKt.modifierMaterializerOf(modifierPadding119);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion119, composerM2074constructorimpl, measurePolicyRowMeasurePolicy119, composerM2074constructorimpl, currentCompositionLocalMap119);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf119, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    z12 = z11111;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    paddingValues2 = paddingValues1111;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
            }
            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i19;
            i20 = i12;
            if ((374491 & i20) == 74898) {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if (i15 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                }
                boolean z11112 = z11;
                PaddingValues paddingValues1112 = dropdownMenuItemContentPadding;
                Modifier modifierPadding1110 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z11112, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues1112);
                Alignment.Vertical centerVertically1110 = Alignment.INSTANCE.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy1110 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically1110, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
                constructor = companion1110.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1110 = LayoutKt.modifierMaterializerOf(modifierPadding1110);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion1110, composerM2074constructorimpl, measurePolicyRowMeasurePolicy1110, composerM2074constructorimpl, currentCompositionLocalMap1110);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf1110, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                z12 = z11112;
                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                paddingValues2 = paddingValues1112;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier4 = modifier3;
            } else {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if (i15 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                }
                boolean z11113 = z11;
                PaddingValues paddingValues1113 = dropdownMenuItemContentPadding;
                Modifier modifierPadding1111 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z11113, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues1113);
                Alignment.Vertical centerVertically1111 = Alignment.INSTANCE.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy1111 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically1111, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
                constructor = companion1111.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111 = LayoutKt.modifierMaterializerOf(modifierPadding1111);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion1111, composerM2074constructorimpl, measurePolicyRowMeasurePolicy1111, composerM2074constructorimpl, currentCompositionLocalMap1111);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf1111, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                z12 = z11113;
                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                paddingValues2 = paddingValues1113;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    dropdownMenuItemContentPadding = paddingValues;
                    if (composerStartRestartGroup.changed(dropdownMenuItemContentPadding)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        if ((458752 & i10) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        i20 = i12;
                        if ((374491 & i20) == 74898) {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            }
                            if (i17 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                            }
                            boolean z11114 = z11;
                            PaddingValues paddingValues1114 = dropdownMenuItemContentPadding;
                            Modifier modifierPadding1112 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z11114, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues1114);
                            Alignment.Vertical centerVertically1112 = Alignment.INSTANCE.getCenterVertically();
                            composerStartRestartGroup.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy1112 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically1112, composerStartRestartGroup, 48);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap1112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion1112 = ComposeUiNode.INSTANCE;
                            constructor = companion1112.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1112 = LayoutKt.modifierMaterializerOf(modifierPadding1112);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                            function2C = com.google.android.gms.measurement.internal.a.c(companion1112, composerM2074constructorimpl, measurePolicyRowMeasurePolicy1112, composerM2074constructorimpl, currentCompositionLocalMap1112);
                            if (composerM2074constructorimpl.getInserting()) {
                                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                            } else {
                                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                            }
                            ai.a.j(0, function3ModifierMaterializerOf1112, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            z12 = z11114;
                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            paddingValues2 = paddingValues1114;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            modifier4 = modifier3;
                        } else {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            }
                            if (i17 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                            }
                            boolean z11115 = z11;
                            PaddingValues paddingValues1115 = dropdownMenuItemContentPadding;
                            Modifier modifierPadding1113 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z11115, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues1115);
                            Alignment.Vertical centerVertically1113 = Alignment.INSTANCE.getCenterVertically();
                            composerStartRestartGroup.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy1113 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically1113, composerStartRestartGroup, 48);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap1113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion1113 = ComposeUiNode.INSTANCE;
                            constructor = companion1113.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1113 = LayoutKt.modifierMaterializerOf(modifierPadding1113);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                            function2C = com.google.android.gms.measurement.internal.a.c(companion1113, composerM2074constructorimpl, measurePolicyRowMeasurePolicy1113, composerM2074constructorimpl, currentCompositionLocalMap1113);
                            if (composerM2074constructorimpl.getInserting()) {
                                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                            } else {
                                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                            }
                            ai.a.j(0, function3ModifierMaterializerOf1113, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            z12 = z11115;
                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            paddingValues2 = paddingValues1115;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            modifier4 = modifier3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
                    }
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 |= i19;
                    i20 = i12;
                    if ((374491 & i20) == 74898) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                        }
                        boolean z11116 = z11;
                        PaddingValues paddingValues1116 = dropdownMenuItemContentPadding;
                        Modifier modifierPadding1114 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z11116, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues1116);
                        Alignment.Vertical centerVertically1114 = Alignment.INSTANCE.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy1114 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically1114, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion1114 = ComposeUiNode.INSTANCE;
                        constructor = companion1114.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1114 = LayoutKt.modifierMaterializerOf(modifierPadding1114);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion1114, composerM2074constructorimpl, measurePolicyRowMeasurePolicy1114, composerM2074constructorimpl, currentCompositionLocalMap1114);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf1114, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        z12 = z11116;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        paddingValues2 = paddingValues1116;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier3;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                        }
                        boolean z11117 = z11;
                        PaddingValues paddingValues1117 = dropdownMenuItemContentPadding;
                        Modifier modifierPadding1115 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z11117, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues1117);
                        Alignment.Vertical centerVertically1115 = Alignment.INSTANCE.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy1115 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically1115, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion1115 = ComposeUiNode.INSTANCE;
                        constructor = companion1115.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1115 = LayoutKt.modifierMaterializerOf(modifierPadding1115);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion1115, composerM2074constructorimpl, measurePolicyRowMeasurePolicy1115, composerM2074constructorimpl, currentCompositionLocalMap1115);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf1115, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        z12 = z11117;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        paddingValues2 = paddingValues1117;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
                }
                i12 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    i20 = i12;
                    if ((374491 & i20) == 74898) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                        }
                        boolean z11118 = z11;
                        PaddingValues paddingValues1118 = dropdownMenuItemContentPadding;
                        Modifier modifierPadding1116 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z11118, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues1118);
                        Alignment.Vertical centerVertically1116 = Alignment.INSTANCE.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy1116 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically1116, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion1116 = ComposeUiNode.INSTANCE;
                        constructor = companion1116.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1116 = LayoutKt.modifierMaterializerOf(modifierPadding1116);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion1116, composerM2074constructorimpl, measurePolicyRowMeasurePolicy1116, composerM2074constructorimpl, currentCompositionLocalMap1116);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf1116, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        z12 = z11118;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        paddingValues2 = paddingValues1118;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier3;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                        }
                        boolean z11119 = z11;
                        PaddingValues paddingValues1119 = dropdownMenuItemContentPadding;
                        Modifier modifierPadding1117 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z11119, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues1119);
                        Alignment.Vertical centerVertically1117 = Alignment.INSTANCE.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy1117 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically1117, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion1117 = ComposeUiNode.INSTANCE;
                        constructor = companion1117.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1117 = LayoutKt.modifierMaterializerOf(modifierPadding1117);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion1117, composerM2074constructorimpl, measurePolicyRowMeasurePolicy1117, composerM2074constructorimpl, currentCompositionLocalMap1117);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf1117, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        z12 = z11119;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        paddingValues2 = paddingValues1119;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                i20 = i12;
                if ((374491 & i20) == 74898) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                    }
                    boolean z111110 = z11;
                    PaddingValues paddingValues11110 = dropdownMenuItemContentPadding;
                    Modifier modifierPadding1118 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z111110, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues11110);
                    Alignment.Vertical centerVertically1118 = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy1118 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically1118, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion1118 = ComposeUiNode.INSTANCE;
                    constructor = companion1118.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1118 = LayoutKt.modifierMaterializerOf(modifierPadding1118);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion1118, composerM2074constructorimpl, measurePolicyRowMeasurePolicy1118, composerM2074constructorimpl, currentCompositionLocalMap1118);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf1118, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    z12 = z111110;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    paddingValues2 = paddingValues11110;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier3;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                    }
                    boolean z111111 = z11;
                    PaddingValues paddingValues11111 = dropdownMenuItemContentPadding;
                    Modifier modifierPadding1119 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z111111, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues11111);
                    Alignment.Vertical centerVertically1119 = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy1119 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically1119, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion1119 = ComposeUiNode.INSTANCE;
                    constructor = companion1119.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1119 = LayoutKt.modifierMaterializerOf(modifierPadding1119);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion1119, composerM2074constructorimpl, measurePolicyRowMeasurePolicy1119, composerM2074constructorimpl, currentCompositionLocalMap1119);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf1119, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    z12 = z111111;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    paddingValues2 = paddingValues11111;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
            }
            i12 |= 3072;
            dropdownMenuItemContentPadding = paddingValues;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    i20 = i12;
                    if ((374491 & i20) == 74898) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                        }
                        boolean z111112 = z11;
                        PaddingValues paddingValues11112 = dropdownMenuItemContentPadding;
                        Modifier modifierPadding11110 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z111112, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues11112);
                        Alignment.Vertical centerVertically11110 = Alignment.INSTANCE.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy11110 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically11110, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion11110 = ComposeUiNode.INSTANCE;
                        constructor = companion11110.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11110 = LayoutKt.modifierMaterializerOf(modifierPadding11110);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion11110, composerM2074constructorimpl, measurePolicyRowMeasurePolicy11110, composerM2074constructorimpl, currentCompositionLocalMap11110);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf11110, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        z12 = z111112;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        paddingValues2 = paddingValues11112;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier3;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                        }
                        boolean z111113 = z11;
                        PaddingValues paddingValues11113 = dropdownMenuItemContentPadding;
                        Modifier modifierPadding11111 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z111113, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues11113);
                        Alignment.Vertical centerVertically11111 = Alignment.INSTANCE.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy11111 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically11111, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion11111 = ComposeUiNode.INSTANCE;
                        constructor = companion11111.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11111 = LayoutKt.modifierMaterializerOf(modifierPadding11111);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion11111, composerM2074constructorimpl, measurePolicyRowMeasurePolicy11111, composerM2074constructorimpl, currentCompositionLocalMap11111);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf11111, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        z12 = z111113;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        paddingValues2 = paddingValues11113;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                i20 = i12;
                if ((374491 & i20) == 74898) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                    }
                    boolean z111114 = z11;
                    PaddingValues paddingValues11114 = dropdownMenuItemContentPadding;
                    Modifier modifierPadding11112 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z111114, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues11114);
                    Alignment.Vertical centerVertically11112 = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy11112 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically11112, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion11112 = ComposeUiNode.INSTANCE;
                    constructor = companion11112.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11112 = LayoutKt.modifierMaterializerOf(modifierPadding11112);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion11112, composerM2074constructorimpl, measurePolicyRowMeasurePolicy11112, composerM2074constructorimpl, currentCompositionLocalMap11112);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf11112, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    z12 = z111114;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    paddingValues2 = paddingValues11114;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier3;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                    }
                    boolean z111115 = z11;
                    PaddingValues paddingValues11115 = dropdownMenuItemContentPadding;
                    Modifier modifierPadding11113 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z111115, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues11115);
                    Alignment.Vertical centerVertically11113 = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy11113 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically11113, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion11113 = ComposeUiNode.INSTANCE;
                    constructor = companion11113.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11113 = LayoutKt.modifierMaterializerOf(modifierPadding11113);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion11113, composerM2074constructorimpl, measurePolicyRowMeasurePolicy11113, composerM2074constructorimpl, currentCompositionLocalMap11113);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf11113, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    z12 = z111115;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    paddingValues2 = paddingValues11115;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
            }
            i12 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                i20 = i12;
                if ((374491 & i20) == 74898) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                    }
                    boolean z111116 = z11;
                    PaddingValues paddingValues11116 = dropdownMenuItemContentPadding;
                    Modifier modifierPadding11114 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z111116, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues11116);
                    Alignment.Vertical centerVertically11114 = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy11114 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically11114, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion11114 = ComposeUiNode.INSTANCE;
                    constructor = companion11114.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11114 = LayoutKt.modifierMaterializerOf(modifierPadding11114);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion11114, composerM2074constructorimpl, measurePolicyRowMeasurePolicy11114, composerM2074constructorimpl, currentCompositionLocalMap11114);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf11114, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    z12 = z111116;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    paddingValues2 = paddingValues11116;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier3;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                    }
                    boolean z111117 = z11;
                    PaddingValues paddingValues11117 = dropdownMenuItemContentPadding;
                    Modifier modifierPadding11115 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z111117, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues11117);
                    Alignment.Vertical centerVertically11115 = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy11115 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically11115, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion11115 = ComposeUiNode.INSTANCE;
                    constructor = companion11115.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11115 = LayoutKt.modifierMaterializerOf(modifierPadding11115);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion11115, composerM2074constructorimpl, measurePolicyRowMeasurePolicy11115, composerM2074constructorimpl, currentCompositionLocalMap11115);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf11115, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    z12 = z111117;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    paddingValues2 = paddingValues11117;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
            }
            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i19;
            i20 = i12;
            if ((374491 & i20) == 74898) {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if (i15 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                }
                boolean z111118 = z11;
                PaddingValues paddingValues11118 = dropdownMenuItemContentPadding;
                Modifier modifierPadding11116 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z111118, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues11118);
                Alignment.Vertical centerVertically11116 = Alignment.INSTANCE.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy11116 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically11116, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion11116 = ComposeUiNode.INSTANCE;
                constructor = companion11116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11116 = LayoutKt.modifierMaterializerOf(modifierPadding11116);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion11116, composerM2074constructorimpl, measurePolicyRowMeasurePolicy11116, composerM2074constructorimpl, currentCompositionLocalMap11116);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf11116, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                z12 = z111118;
                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                paddingValues2 = paddingValues11118;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier4 = modifier3;
            } else {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if (i15 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                }
                boolean z111119 = z11;
                PaddingValues paddingValues11119 = dropdownMenuItemContentPadding;
                Modifier modifierPadding11117 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z111119, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues11119);
                Alignment.Vertical centerVertically11117 = Alignment.INSTANCE.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy11117 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically11117, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion11117 = ComposeUiNode.INSTANCE;
                constructor = companion11117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11117 = LayoutKt.modifierMaterializerOf(modifierPadding11117);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion11117, composerM2074constructorimpl, measurePolicyRowMeasurePolicy11117, composerM2074constructorimpl, currentCompositionLocalMap11117);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf11117, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                z12 = z111119;
                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                paddingValues2 = paddingValues11119;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        z11 = z10;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                dropdownMenuItemContentPadding = paddingValues;
                if (composerStartRestartGroup.changed(dropdownMenuItemContentPadding)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    i20 = i12;
                    if ((374491 & i20) == 74898) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                        }
                        boolean z1111110 = z11;
                        PaddingValues paddingValues111110 = dropdownMenuItemContentPadding;
                        Modifier modifierPadding11118 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z1111110, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues111110);
                        Alignment.Vertical centerVertically11118 = Alignment.INSTANCE.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy11118 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically11118, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion11118 = ComposeUiNode.INSTANCE;
                        constructor = companion11118.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11118 = LayoutKt.modifierMaterializerOf(modifierPadding11118);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion11118, composerM2074constructorimpl, measurePolicyRowMeasurePolicy11118, composerM2074constructorimpl, currentCompositionLocalMap11118);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf11118, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        z12 = z1111110;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        paddingValues2 = paddingValues111110;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier3;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                        }
                        boolean z1111111 = z11;
                        PaddingValues paddingValues111111 = dropdownMenuItemContentPadding;
                        Modifier modifierPadding11119 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z1111111, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues111111);
                        Alignment.Vertical centerVertically11119 = Alignment.INSTANCE.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy11119 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically11119, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion11119 = ComposeUiNode.INSTANCE;
                        constructor = companion11119.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11119 = LayoutKt.modifierMaterializerOf(modifierPadding11119);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion11119, composerM2074constructorimpl, measurePolicyRowMeasurePolicy11119, composerM2074constructorimpl, currentCompositionLocalMap11119);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf11119, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        z12 = z1111111;
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        paddingValues2 = paddingValues111111;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                i20 = i12;
                if ((374491 & i20) == 74898) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                    }
                    boolean z1111112 = z11;
                    PaddingValues paddingValues111112 = dropdownMenuItemContentPadding;
                    Modifier modifierPadding111110 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z1111112, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues111112);
                    Alignment.Vertical centerVertically111110 = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy111110 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically111110, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion111110 = ComposeUiNode.INSTANCE;
                    constructor = companion111110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111110 = LayoutKt.modifierMaterializerOf(modifierPadding111110);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion111110, composerM2074constructorimpl, measurePolicyRowMeasurePolicy111110, composerM2074constructorimpl, currentCompositionLocalMap111110);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf111110, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    z12 = z1111112;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    paddingValues2 = paddingValues111112;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier3;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                    }
                    boolean z1111113 = z11;
                    PaddingValues paddingValues111113 = dropdownMenuItemContentPadding;
                    Modifier modifierPadding111111 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z1111113, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues111113);
                    Alignment.Vertical centerVertically111111 = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy111111 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically111111, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion111111 = ComposeUiNode.INSTANCE;
                    constructor = companion111111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111111 = LayoutKt.modifierMaterializerOf(modifierPadding111111);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion111111, composerM2074constructorimpl, measurePolicyRowMeasurePolicy111111, composerM2074constructorimpl, currentCompositionLocalMap111111);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf111111, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    z12 = z1111113;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    paddingValues2 = paddingValues111113;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
            }
            i12 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                i20 = i12;
                if ((374491 & i20) == 74898) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                    }
                    boolean z1111114 = z11;
                    PaddingValues paddingValues111114 = dropdownMenuItemContentPadding;
                    Modifier modifierPadding111112 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z1111114, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues111114);
                    Alignment.Vertical centerVertically111112 = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy111112 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically111112, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion111112 = ComposeUiNode.INSTANCE;
                    constructor = companion111112.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111112 = LayoutKt.modifierMaterializerOf(modifierPadding111112);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion111112, composerM2074constructorimpl, measurePolicyRowMeasurePolicy111112, composerM2074constructorimpl, currentCompositionLocalMap111112);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf111112, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    z12 = z1111114;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    paddingValues2 = paddingValues111114;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier3;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                    }
                    boolean z1111115 = z11;
                    PaddingValues paddingValues111115 = dropdownMenuItemContentPadding;
                    Modifier modifierPadding111113 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z1111115, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues111115);
                    Alignment.Vertical centerVertically111113 = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy111113 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically111113, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion111113 = ComposeUiNode.INSTANCE;
                    constructor = companion111113.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111113 = LayoutKt.modifierMaterializerOf(modifierPadding111113);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion111113, composerM2074constructorimpl, measurePolicyRowMeasurePolicy111113, composerM2074constructorimpl, currentCompositionLocalMap111113);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf111113, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    z12 = z1111115;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    paddingValues2 = paddingValues111115;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
            }
            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i19;
            i20 = i12;
            if ((374491 & i20) == 74898) {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if (i15 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                }
                boolean z1111116 = z11;
                PaddingValues paddingValues111116 = dropdownMenuItemContentPadding;
                Modifier modifierPadding111114 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z1111116, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues111116);
                Alignment.Vertical centerVertically111114 = Alignment.INSTANCE.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy111114 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically111114, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion111114 = ComposeUiNode.INSTANCE;
                constructor = companion111114.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111114 = LayoutKt.modifierMaterializerOf(modifierPadding111114);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion111114, composerM2074constructorimpl, measurePolicyRowMeasurePolicy111114, composerM2074constructorimpl, currentCompositionLocalMap111114);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf111114, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                z12 = z1111116;
                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                paddingValues2 = paddingValues111116;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier4 = modifier3;
            } else {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if (i15 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                }
                boolean z1111117 = z11;
                PaddingValues paddingValues111117 = dropdownMenuItemContentPadding;
                Modifier modifierPadding111115 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z1111117, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues111117);
                Alignment.Vertical centerVertically111115 = Alignment.INSTANCE.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy111115 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically111115, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion111115 = ComposeUiNode.INSTANCE;
                constructor = companion111115.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111115 = LayoutKt.modifierMaterializerOf(modifierPadding111115);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion111115, composerM2074constructorimpl, measurePolicyRowMeasurePolicy111115, composerM2074constructorimpl, currentCompositionLocalMap111115);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf111115, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                z12 = z1111117;
                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                paddingValues2 = paddingValues111117;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
        }
        i12 |= 3072;
        dropdownMenuItemContentPadding = paddingValues;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((57344 & i10) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                i20 = i12;
                if ((374491 & i20) == 74898) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                    }
                    boolean z1111118 = z11;
                    PaddingValues paddingValues111118 = dropdownMenuItemContentPadding;
                    Modifier modifierPadding111116 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z1111118, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues111118);
                    Alignment.Vertical centerVertically111116 = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy111116 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically111116, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion111116 = ComposeUiNode.INSTANCE;
                    constructor = companion111116.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111116 = LayoutKt.modifierMaterializerOf(modifierPadding111116);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion111116, composerM2074constructorimpl, measurePolicyRowMeasurePolicy111116, composerM2074constructorimpl, currentCompositionLocalMap111116);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf111116, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    z12 = z1111118;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    paddingValues2 = paddingValues111118;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier3;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                    }
                    boolean z1111119 = z11;
                    PaddingValues paddingValues111119 = dropdownMenuItemContentPadding;
                    Modifier modifierPadding111117 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z1111119, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues111119);
                    Alignment.Vertical centerVertically111117 = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy111117 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically111117, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion111117 = ComposeUiNode.INSTANCE;
                    constructor = companion111117.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111117 = LayoutKt.modifierMaterializerOf(modifierPadding111117);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion111117, composerM2074constructorimpl, measurePolicyRowMeasurePolicy111117, composerM2074constructorimpl, currentCompositionLocalMap111117);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf111117, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    z12 = z1111119;
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    paddingValues2 = paddingValues111119;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
            }
            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i19;
            i20 = i12;
            if ((374491 & i20) == 74898) {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if (i15 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                }
                boolean z11111110 = z11;
                PaddingValues paddingValues1111110 = dropdownMenuItemContentPadding;
                Modifier modifierPadding111118 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z11111110, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues1111110);
                Alignment.Vertical centerVertically111118 = Alignment.INSTANCE.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy111118 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically111118, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion111118 = ComposeUiNode.INSTANCE;
                constructor = companion111118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111118 = LayoutKt.modifierMaterializerOf(modifierPadding111118);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion111118, composerM2074constructorimpl, measurePolicyRowMeasurePolicy111118, composerM2074constructorimpl, currentCompositionLocalMap111118);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf111118, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                z12 = z11111110;
                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                paddingValues2 = paddingValues1111110;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier4 = modifier3;
            } else {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if (i15 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                }
                boolean z11111111 = z11;
                PaddingValues paddingValues1111111 = dropdownMenuItemContentPadding;
                Modifier modifierPadding111119 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z11111111, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues1111111);
                Alignment.Vertical centerVertically111119 = Alignment.INSTANCE.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy111119 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically111119, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion111119 = ComposeUiNode.INSTANCE;
                constructor = companion111119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111119 = LayoutKt.modifierMaterializerOf(modifierPadding111119);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion111119, composerM2074constructorimpl, measurePolicyRowMeasurePolicy111119, composerM2074constructorimpl, currentCompositionLocalMap111119);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf111119, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                z12 = z11111111;
                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                paddingValues2 = paddingValues1111111;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
        }
        i12 |= 24576;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i11 & 32) != 0) {
            if ((458752 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
            }
            i20 = i12;
            if ((374491 & i20) == 74898) {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if (i15 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                }
                boolean z11111112 = z11;
                PaddingValues paddingValues1111112 = dropdownMenuItemContentPadding;
                Modifier modifierPadding1111110 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z11111112, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues1111112);
                Alignment.Vertical centerVertically1111110 = Alignment.INSTANCE.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy1111110 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically1111110, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1111110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion1111110 = ComposeUiNode.INSTANCE;
                constructor = companion1111110.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111110 = LayoutKt.modifierMaterializerOf(modifierPadding1111110);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion1111110, composerM2074constructorimpl, measurePolicyRowMeasurePolicy1111110, composerM2074constructorimpl, currentCompositionLocalMap1111110);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf1111110, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                z12 = z11111112;
                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                paddingValues2 = paddingValues1111112;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier4 = modifier3;
            } else {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if (i15 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
                }
                boolean z11111113 = z11;
                PaddingValues paddingValues1111113 = dropdownMenuItemContentPadding;
                Modifier modifierPadding1111111 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z11111113, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues1111113);
                Alignment.Vertical centerVertically1111111 = Alignment.INSTANCE.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy1111111 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically1111111, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1111111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion1111111 = ComposeUiNode.INSTANCE;
                constructor = companion1111111.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111111 = LayoutKt.modifierMaterializerOf(modifierPadding1111111);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion1111111, composerM2074constructorimpl, measurePolicyRowMeasurePolicy1111111, composerM2074constructorimpl, currentCompositionLocalMap1111111);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf1111111, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                z12 = z11111113;
                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                paddingValues2 = paddingValues1111113;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
        }
        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i12 |= i19;
        i20 = i12;
        if ((374491 & i20) == 74898) {
            if (i21 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                z11 = true;
            }
            if (i15 != 0) {
                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
            }
            if (i17 != 0) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
            }
            boolean z11111114 = z11;
            PaddingValues paddingValues1111114 = dropdownMenuItemContentPadding;
            Modifier modifierPadding1111112 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z11111114, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues1111114);
            Alignment.Vertical centerVertically1111112 = Alignment.INSTANCE.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy1111112 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically1111112, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1111112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion1111112 = ComposeUiNode.INSTANCE;
            constructor = companion1111112.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111112 = LayoutKt.modifierMaterializerOf(modifierPadding1111112);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C = com.google.android.gms.measurement.internal.a.c(companion1111112, composerM2074constructorimpl, measurePolicyRowMeasurePolicy1111112, composerM2074constructorimpl, currentCompositionLocalMap1111112);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf1111112, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            z12 = z11111114;
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            paddingValues2 = paddingValues1111114;
            mutableInteractionSource3 = mutableInteractionSource2;
            modifier4 = modifier3;
        } else {
            if (i21 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                z11 = true;
            }
            if (i15 != 0) {
                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
            }
            if (i17 != 0) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(87134531, i20, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:135)");
            }
            boolean z11111115 = z11;
            PaddingValues paddingValues1111115 = dropdownMenuItemContentPadding;
            Modifier modifierPadding1111113 = PaddingKt.padding(SizeKt.m339sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, 0L, composerStartRestartGroup, 6, 6), z11111115, null, null, onClick, 24, null), 0.0f, 1, null), f7282e, f7284g, f7283f, 0.0f, 8, null), paddingValues1111115);
            Alignment.Vertical centerVertically1111113 = Alignment.INSTANCE.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy1111113 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically1111113, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1111113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion1111113 = ComposeUiNode.INSTANCE;
            constructor = companion1111113.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111113 = LayoutKt.modifierMaterializerOf(modifierPadding1111113);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C = com.google.android.gms.measurement.internal.a.c(companion1111113, composerM2074constructorimpl, measurePolicyRowMeasurePolicy1111113, composerM2074constructorimpl, currentCompositionLocalMap1111113);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf1111113, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            z12 = z11111115;
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1190489496, true, new f(z12, content, RowScopeInstance.INSTANCE, i20)), composerStartRestartGroup, 48);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            paddingValues2 = paddingValues1111115;
            mutableInteractionSource3 = mutableInteractionSource2;
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new g(onClick, modifier4, z12, paddingValues2, mutableInteractionSource3, content, i10, i11));
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
        return f7281d;
    }

    public static final float getMenuVerticalMargin() {
        return f7279b;
    }
}
