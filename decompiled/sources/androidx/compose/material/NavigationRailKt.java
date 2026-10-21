package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NavigationRail.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a}\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052 \b\u0002\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0091\u0001\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0002\b\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00112\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013¢\u0006\u0002\b\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\"²\u0006\f\u0010!\u001a\u00020 8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "elevation", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "header", "content", "NavigationRail-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationRail", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", "label", "alwaysShowLabel", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "selectedContentColor", "unselectedContentColor", "NavigationRailItem-0S3VyRs", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "NavigationRailItem", "", "animationProgress", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,405:1\n25#2:406\n456#2,8:430\n464#2,3:444\n467#2,3:448\n456#2,8:467\n464#2,3:481\n456#2,8:501\n464#2,3:515\n467#2,3:519\n456#2,8:541\n464#2,3:555\n467#2,3:559\n467#2,3:564\n1097#3,6:407\n76#4:413\n67#5,5:414\n72#5:447\n76#5:452\n66#5,6:484\n72#5:518\n76#5:523\n66#5,6:524\n72#5:558\n76#5:563\n78#6,11:419\n91#6:451\n75#6,14:453\n78#6,11:490\n91#6:522\n78#6,11:530\n91#6:562\n91#6:567\n4144#7,6:438\n4144#7,6:475\n4144#7,6:509\n4144#7,6:549\n81#8:568\n154#9:569\n154#9:570\n154#9:571\n154#9:572\n154#9:573\n154#9:574\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt\n*L\n155#1:406\n176#1:430,8\n176#1:444,3\n176#1:448,3\n265#1:467,8\n265#1:481,3\n267#1:501,8\n267#1:515,3\n267#1:519,3\n269#1:541,8\n269#1:555,3\n269#1:559,3\n265#1:564,3\n155#1:407,6\n157#1:413\n176#1:414,5\n176#1:447\n176#1:452\n267#1:484,6\n267#1:518\n267#1:523\n269#1:524,6\n269#1:558\n269#1:563\n176#1:419,11\n176#1:451\n265#1:453,14\n267#1:490,11\n267#1:522\n269#1:530,11\n269#1:562\n265#1:567\n176#1:438,6\n265#1:475,6\n267#1:509,6\n269#1:549,6\n233#1:568\n379#1:569\n384#1:570\n389#1:571\n395#1:572\n400#1:573\n405#1:574\n*E\n"})
public final class NavigationRailKt {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f7374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f7375e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final TweenSpec<Float> f7371a = new TweenSpec<>(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f7372b = Dp.m4389constructorimpl(72);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f7373c = Dp.m4389constructorimpl(56);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f7376f = Dp.m4389constructorimpl(16);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f7377g = Dp.m4389constructorimpl(14);

    /* JADX INFO: compiled from: NavigationRail.kt */
    @SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt$NavigationRail$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,405:1\n72#2,6:406\n78#2:440\n82#2:445\n78#3,11:412\n91#3:444\n456#4,8:423\n464#4,3:437\n467#4,3:441\n4144#5,6:431\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt$NavigationRail$1\n*L\n107#1:406,6\n107#1:440\n107#1:445\n107#1:412,11\n107#1:444\n107#1:423,8\n107#1:437,3\n107#1:441,3\n107#1:431,6\n*E\n"})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f7378p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f7379q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f7380r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function4) {
            super(2);
            this.f7378p0 = function3;
            this.f7379q0 = i10;
            this.f7380r0 = function4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1571506489, iIntValue, -1, "androidx.compose.material.NavigationRail.<anonymous> (NavigationRail.kt:105)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m298paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, NavigationRailKt.f7374d, 1, null));
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierSelectableGroup);
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
                Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyColumnMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(65525382);
                Function3<ColumnScope, Composer, Integer, Unit> function3 = this.f7378p0;
                int i10 = this.f7379q0;
                if (function3 != null) {
                    function3.invoke(columnScopeInstance, composer2, Integer.valueOf(((i10 >> 9) & 112) | 6));
                    SpacerKt.Spacer(SizeKt.m321height3ABfNKs(companion, NavigationRailKt.f7375e), composer2, 6);
                }
                composer2.endReplaceableGroup();
                this.f7380r0.invoke(columnScopeInstance, composer2, Integer.valueOf(((i10 >> 12) & 112) | 6));
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

    /* JADX INFO: compiled from: NavigationRail.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7381p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f7382q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f7383r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f7384s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f7385t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f7386u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f7387w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Modifier modifier, long j10, long j11, float f6, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function4, int i10, int i11) {
            super(2);
            this.f7381p0 = modifier;
            this.f7382q0 = j10;
            this.f7383r0 = j11;
            this.f7384s0 = f6;
            this.f7385t0 = function3;
            this.f7386u0 = function4;
            this.v0 = i10;
            this.f7387w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            NavigationRailKt.m789NavigationRailHsRjFd4(this.f7381p0, this.f7382q0, this.f7383r0, this.f7384s0, this.f7385t0, this.f7386u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f7387w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationRail.kt */
    public static final class c extends Lambda implements Function3<Float, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f7388p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7389q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7390r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f7391s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, Function2 function2, ComposableLambda composableLambda, boolean z10) {
            super(3);
            this.f7388p0 = z10;
            this.f7389q0 = function2;
            this.f7390r0 = composableLambda;
            this.f7391s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Float f6, Composer composer, Integer num) {
            int i10;
            float fFloatValue = f6.floatValue();
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                i10 = (composer2.changed(fFloatValue) ? 4 : 2) | iIntValue;
            } else {
                i10 = iIntValue;
            }
            if ((i10 & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(670576792, iIntValue, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
                }
                if (this.f7388p0) {
                    fFloatValue = 1.0f;
                }
                NavigationRailKt.access$NavigationRailItemBaselineLayout(this.f7389q0, this.f7390r0, fFloatValue, composer2, (this.f7391s0 >> 6) & 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationRail.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;
        public final /* synthetic */ int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f7392p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f7393q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7394r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7395s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f7396t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7397u0;
        public final /* synthetic */ boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f7398w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ long f7399x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ long f7400y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(boolean z10, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z11, Function2<? super Composer, ? super Integer, Unit> function3, boolean z12, MutableInteractionSource mutableInteractionSource, long j10, long j11, int i10, int i11) {
            super(2);
            this.f7392p0 = z10;
            this.f7393q0 = function0;
            this.f7394r0 = function2;
            this.f7395s0 = modifier;
            this.f7396t0 = z11;
            this.f7397u0 = function3;
            this.v0 = z12;
            this.f7398w0 = mutableInteractionSource;
            this.f7399x0 = j10;
            this.f7400y0 = j11;
            this.E0 = i10;
            this.F0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            NavigationRailKt.m790NavigationRailItem0S3VyRs(this.f7392p0, this.f7393q0, this.f7394r0, this.f7395s0, this.f7396t0, this.f7397u0, this.v0, this.f7398w0, this.f7399x0, this.f7400y0, composer, RecomposeScopeImplKt.updateChangedFlags(this.E0 | 1), this.F0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationRail.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7401p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f7402q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10, Function2 function2) {
            super(2);
            this.f7401p0 = function2;
            this.f7402q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-180398615, iIntValue, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:159)");
                }
                TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                TextKt.ProvideTextStyle(caption.m3985copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3927getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & 256) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & 512) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & 1024) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & 32768) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m4289boximpl(TextAlign.INSTANCE.m4296getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & 1048576) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & 4194304) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), this.f7401p0, composer2, (this.f7402q0 >> 12) & 112);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationRail.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<Float, Composer, Integer, Unit> f7403p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f7404q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f7405r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function3<? super Float, ? super Composer, ? super Integer, Unit> function3, int i10, State<Float> state) {
            super(2);
            this.f7403p0 = function3;
            this.f7404q0 = i10;
            this.f7405r0 = state;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1688205042, iIntValue, -1, "androidx.compose.material.NavigationRailTransition.<anonymous> (NavigationRail.kt:242)");
                }
                this.f7403p0.invoke(Float.valueOf(NavigationRailKt.access$NavigationRailTransition_Klgx_Pg$lambda$3(this.f7405r0)), composer2, Integer.valueOf((this.f7404q0 >> 6) & 112));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationRail.kt */
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f7406p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f7407q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f7408r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function3<Float, Composer, Integer, Unit> f7409s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f7410t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(long j10, long j11, boolean z10, Function3<? super Float, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f7406p0 = j10;
            this.f7407q0 = j11;
            this.f7408r0 = z10;
            this.f7409s0 = function3;
            this.f7410t0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            NavigationRailKt.a(this.f7406p0, this.f7407q0, this.f7408r0, this.f7409s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7410t0 | 1));
            return Unit.INSTANCE;
        }
    }

    static {
        float f6 = 8;
        f7374d = Dp.m4389constructorimpl(f6);
        f7375e = Dp.m4389constructorimpl(f6);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012e  */
    /* JADX WARN: Code duplicated, block: B:104:0x016d  */
    /* JADX WARN: Code duplicated, block: B:109:0x017a  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb A[PHI: r0 r4 r5 r10 r12
      0x00eb: PHI (r0v8 androidx.compose.ui.Modifier) = (r0v5 androidx.compose.ui.Modifier), (r0v12 androidx.compose.ui.Modifier) binds: [B:97:0x011f, B:83:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r4v20 int) = (r4v15 int), (r4v22 int) binds: [B:97:0x011f, B:83:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r5v6 long) = (r5v3 long), (r5v2 long) binds: [B:97:0x011f, B:83:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r10v10 long) = (r10v2 long), (r10v1 long) binds: [B:97:0x011f, B:83:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r12v14 float) = (r12v3 float), (r12v2 float) binds: [B:97:0x011f, B:83:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:94:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0118  */
    /* JADX WARN: Code duplicated, block: B:98:0x0121  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: NavigationRail-HsRjFd4, reason: not valid java name */
    public static final void m789NavigationRailHsRjFd4(@Nullable Modifier modifier, long j10, long j11, float f6, @Nullable Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        long jM717getSurface0d7_KjU;
        long j12;
        float fM788getElevationD9Ej5fM;
        int i13;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function4;
        int i14;
        int i15;
        Modifier modifier3;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function5;
        long j13;
        int i16;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1790971523);
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                jM717getSurface0d7_KjU = j10;
                int i18 = composerStartRestartGroup.changed(jM717getSurface0d7_KjU) ? 32 : 16;
                i12 |= i18;
            } else {
                jM717getSurface0d7_KjU = j10;
            }
            i12 |= i18;
        } else {
            jM717getSurface0d7_KjU = j10;
        }
        if ((i10 & 896) == 0) {
            j12 = j11;
            i12 |= ((i11 & 4) == 0 && composerStartRestartGroup.changed(j12)) ? 256 : 128;
        } else {
            j12 = j11;
        }
        int i19 = i11 & 8;
        if (i19 == 0) {
            if ((i10 & 7168) == 0) {
                fM788getElevationD9Ej5fM = f6;
                i12 |= composerStartRestartGroup.changed(fM788getElevationD9Ej5fM) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((57344 & i10) == 0) {
                    function4 = function3;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i17 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i11 & 2) != 0) {
                                i12 &= -113;
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                            }
                            if ((i11 & 4) != 0) {
                                long jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                                i12 &= -897;
                                j12 = jM731contentColorForek8zF_U;
                            }
                            if (i19 != 0) {
                                fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                            }
                            if (i13 != 0) {
                                function5 = null;
                                j13 = j12;
                            }
                            i16 = i12;
                            float f10 = fM788getElevationD9Ej5fM;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1790971523, i16, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                            }
                            int i20 = i16 << 3;
                            SurfaceKt.m834SurfaceFjzlyU(modifier3, null, jM717getSurface0d7_KjU, j13, null, f10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new a(function5, i16, content)), composerStartRestartGroup, (i16 & 14) | 1572864 | (i20 & 896) | (i20 & 7168) | ((i16 << 6) & 458752), 18);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            j12 = j13;
                            fM788getElevationD9Ej5fM = f10;
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 2) != 0) {
                                i12 &= -113;
                            }
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                            }
                            modifier3 = modifier2;
                        }
                        j13 = j12;
                        function5 = function4;
                        i16 = i12;
                        float f11 = fM788getElevationD9Ej5fM;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1790971523, i16, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                        }
                        int i21 = i16 << 3;
                        SurfaceKt.m834SurfaceFjzlyU(modifier3, null, jM717getSurface0d7_KjU, j13, null, f11, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new a(function5, i16, content)), composerStartRestartGroup, (i16 & 14) | 1572864 | (i21 & 896) | (i21 & 7168) | ((i16 << 6) & 458752), 18);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j12 = j13;
                        fM788getElevationD9Ej5fM = f11;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function5 = function4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, jM717getSurface0d7_KjU, j12, fM788getElevationD9Ej5fM, function5, content, i10, i11));
                }
                i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i15;
                if ((374491 & i12) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U2 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U2;
                        }
                        if (i19 != 0) {
                            fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            function5 = null;
                            j13 = j12;
                        } else {
                            j13 = j12;
                            function5 = function4;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U3 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U3;
                        }
                        if (i19 != 0) {
                            fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            function5 = null;
                            j13 = j12;
                        } else {
                            j13 = j12;
                            function5 = function4;
                        }
                    }
                    i16 = i12;
                    float f12 = fM788getElevationD9Ej5fM;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1790971523, i16, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                    }
                    int i22 = i16 << 3;
                    SurfaceKt.m834SurfaceFjzlyU(modifier3, null, jM717getSurface0d7_KjU, j13, null, f12, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new a(function5, i16, content)), composerStartRestartGroup, (i16 & 14) | 1572864 | (i22 & 896) | (i22 & 7168) | ((i16 << 6) & 458752), 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j12 = j13;
                    fM788getElevationD9Ej5fM = f12;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U4 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U4;
                        }
                        if (i19 != 0) {
                            fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            function5 = null;
                            j13 = j12;
                        } else {
                            j13 = j12;
                            function5 = function4;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U5 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U5;
                        }
                        if (i19 != 0) {
                            fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            function5 = null;
                            j13 = j12;
                        } else {
                            j13 = j12;
                            function5 = function4;
                        }
                    }
                    i16 = i12;
                    float f13 = fM788getElevationD9Ej5fM;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1790971523, i16, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                    }
                    int i23 = i16 << 3;
                    SurfaceKt.m834SurfaceFjzlyU(modifier3, null, jM717getSurface0d7_KjU, j13, null, f13, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new a(function5, i16, content)), composerStartRestartGroup, (i16 & 14) | 1572864 | (i23 & 896) | (i23 & 7168) | ((i16 << 6) & 458752), 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j12 = j13;
                    fM788getElevationD9Ej5fM = f13;
                    modifier2 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, jM717getSurface0d7_KjU, j12, fM788getElevationD9Ej5fM, function5, content, i10, i11));
            }
            i12 |= 24576;
            function4 = function3;
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U6 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U6;
                        }
                        if (i19 != 0) {
                            fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            function5 = null;
                            j13 = j12;
                        } else {
                            j13 = j12;
                            function5 = function4;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U7 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U7;
                        }
                        if (i19 != 0) {
                            fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            function5 = null;
                            j13 = j12;
                        } else {
                            j13 = j12;
                            function5 = function4;
                        }
                    }
                    i16 = i12;
                    float f14 = fM788getElevationD9Ej5fM;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1790971523, i16, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                    }
                    int i24 = i16 << 3;
                    SurfaceKt.m834SurfaceFjzlyU(modifier3, null, jM717getSurface0d7_KjU, j13, null, f14, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new a(function5, i16, content)), composerStartRestartGroup, (i16 & 14) | 1572864 | (i24 & 896) | (i24 & 7168) | ((i16 << 6) & 458752), 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j12 = j13;
                    fM788getElevationD9Ej5fM = f14;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U8 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U8;
                        }
                        if (i19 != 0) {
                            fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            function5 = null;
                            j13 = j12;
                        } else {
                            j13 = j12;
                            function5 = function4;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U9 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U9;
                        }
                        if (i19 != 0) {
                            fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            function5 = null;
                            j13 = j12;
                        } else {
                            j13 = j12;
                            function5 = function4;
                        }
                    }
                    i16 = i12;
                    float f15 = fM788getElevationD9Ej5fM;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1790971523, i16, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                    }
                    int i25 = i16 << 3;
                    SurfaceKt.m834SurfaceFjzlyU(modifier3, null, jM717getSurface0d7_KjU, j13, null, f15, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new a(function5, i16, content)), composerStartRestartGroup, (i16 & 14) | 1572864 | (i25 & 896) | (i25 & 7168) | ((i16 << 6) & 458752), 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j12 = j13;
                    fM788getElevationD9Ej5fM = f15;
                    modifier2 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, jM717getSurface0d7_KjU, j12, fM788getElevationD9Ej5fM, function5, content, i10, i11));
            }
            i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i15;
            if ((374491 & i12) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U10 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U10;
                    }
                    if (i19 != 0) {
                        fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        function5 = null;
                        j13 = j12;
                    } else {
                        j13 = j12;
                        function5 = function4;
                    }
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U11 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U11;
                    }
                    if (i19 != 0) {
                        fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        function5 = null;
                        j13 = j12;
                    } else {
                        j13 = j12;
                        function5 = function4;
                    }
                }
                i16 = i12;
                float f16 = fM788getElevationD9Ej5fM;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1790971523, i16, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                }
                int i26 = i16 << 3;
                SurfaceKt.m834SurfaceFjzlyU(modifier3, null, jM717getSurface0d7_KjU, j13, null, f16, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new a(function5, i16, content)), composerStartRestartGroup, (i16 & 14) | 1572864 | (i26 & 896) | (i26 & 7168) | ((i16 << 6) & 458752), 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j12 = j13;
                fM788getElevationD9Ej5fM = f16;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U12 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U12;
                    }
                    if (i19 != 0) {
                        fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        function5 = null;
                        j13 = j12;
                    } else {
                        j13 = j12;
                        function5 = function4;
                    }
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U13 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U13;
                    }
                    if (i19 != 0) {
                        fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        function5 = null;
                        j13 = j12;
                    } else {
                        j13 = j12;
                        function5 = function4;
                    }
                }
                i16 = i12;
                float f17 = fM788getElevationD9Ej5fM;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1790971523, i16, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                }
                int i27 = i16 << 3;
                SurfaceKt.m834SurfaceFjzlyU(modifier3, null, jM717getSurface0d7_KjU, j13, null, f17, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new a(function5, i16, content)), composerStartRestartGroup, (i16 & 14) | 1572864 | (i27 & 896) | (i27 & 7168) | ((i16 << 6) & 458752), 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j12 = j13;
                fM788getElevationD9Ej5fM = f17;
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, jM717getSurface0d7_KjU, j12, fM788getElevationD9Ej5fM, function5, content, i10, i11));
        }
        i12 |= 3072;
        fM788getElevationD9Ej5fM = f6;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((57344 & i10) == 0) {
                function4 = function3;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U14 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U14;
                        }
                        if (i19 != 0) {
                            fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            function5 = null;
                            j13 = j12;
                        } else {
                            j13 = j12;
                            function5 = function4;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U15 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U15;
                        }
                        if (i19 != 0) {
                            fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            function5 = null;
                            j13 = j12;
                        } else {
                            j13 = j12;
                            function5 = function4;
                        }
                    }
                    i16 = i12;
                    float f18 = fM788getElevationD9Ej5fM;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1790971523, i16, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                    }
                    int i28 = i16 << 3;
                    SurfaceKt.m834SurfaceFjzlyU(modifier3, null, jM717getSurface0d7_KjU, j13, null, f18, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new a(function5, i16, content)), composerStartRestartGroup, (i16 & 14) | 1572864 | (i28 & 896) | (i28 & 7168) | ((i16 << 6) & 458752), 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j12 = j13;
                    fM788getElevationD9Ej5fM = f18;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U16 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U16;
                        }
                        if (i19 != 0) {
                            fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            function5 = null;
                            j13 = j12;
                        } else {
                            j13 = j12;
                            function5 = function4;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U17 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U17;
                        }
                        if (i19 != 0) {
                            fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            function5 = null;
                            j13 = j12;
                        } else {
                            j13 = j12;
                            function5 = function4;
                        }
                    }
                    i16 = i12;
                    float f19 = fM788getElevationD9Ej5fM;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1790971523, i16, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                    }
                    int i29 = i16 << 3;
                    SurfaceKt.m834SurfaceFjzlyU(modifier3, null, jM717getSurface0d7_KjU, j13, null, f19, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new a(function5, i16, content)), composerStartRestartGroup, (i16 & 14) | 1572864 | (i29 & 896) | (i29 & 7168) | ((i16 << 6) & 458752), 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j12 = j13;
                    fM788getElevationD9Ej5fM = f19;
                    modifier2 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, jM717getSurface0d7_KjU, j12, fM788getElevationD9Ej5fM, function5, content, i10, i11));
            }
            i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i15;
            if ((374491 & i12) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U18 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U18;
                    }
                    if (i19 != 0) {
                        fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        function5 = null;
                        j13 = j12;
                    } else {
                        j13 = j12;
                        function5 = function4;
                    }
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U19 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U19;
                    }
                    if (i19 != 0) {
                        fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        function5 = null;
                        j13 = j12;
                    } else {
                        j13 = j12;
                        function5 = function4;
                    }
                }
                i16 = i12;
                float f110 = fM788getElevationD9Ej5fM;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1790971523, i16, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                }
                int i210 = i16 << 3;
                SurfaceKt.m834SurfaceFjzlyU(modifier3, null, jM717getSurface0d7_KjU, j13, null, f110, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new a(function5, i16, content)), composerStartRestartGroup, (i16 & 14) | 1572864 | (i210 & 896) | (i210 & 7168) | ((i16 << 6) & 458752), 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j12 = j13;
                fM788getElevationD9Ej5fM = f110;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U110 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U110;
                    }
                    if (i19 != 0) {
                        fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        function5 = null;
                        j13 = j12;
                    } else {
                        j13 = j12;
                        function5 = function4;
                    }
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U111 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U111;
                    }
                    if (i19 != 0) {
                        fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        function5 = null;
                        j13 = j12;
                    } else {
                        j13 = j12;
                        function5 = function4;
                    }
                }
                i16 = i12;
                float f111 = fM788getElevationD9Ej5fM;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1790971523, i16, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                }
                int i211 = i16 << 3;
                SurfaceKt.m834SurfaceFjzlyU(modifier3, null, jM717getSurface0d7_KjU, j13, null, f111, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new a(function5, i16, content)), composerStartRestartGroup, (i16 & 14) | 1572864 | (i211 & 896) | (i211 & 7168) | ((i16 << 6) & 458752), 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j12 = j13;
                fM788getElevationD9Ej5fM = f111;
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, jM717getSurface0d7_KjU, j12, fM788getElevationD9Ej5fM, function5, content, i10, i11));
        }
        i12 |= 24576;
        function4 = function3;
        if ((i11 & 32) != 0) {
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
            }
            if ((374491 & i12) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U112 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U112;
                    }
                    if (i19 != 0) {
                        fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        function5 = null;
                        j13 = j12;
                    } else {
                        j13 = j12;
                        function5 = function4;
                    }
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U113 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U113;
                    }
                    if (i19 != 0) {
                        fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        function5 = null;
                        j13 = j12;
                    } else {
                        j13 = j12;
                        function5 = function4;
                    }
                }
                i16 = i12;
                float f112 = fM788getElevationD9Ej5fM;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1790971523, i16, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                }
                int i212 = i16 << 3;
                SurfaceKt.m834SurfaceFjzlyU(modifier3, null, jM717getSurface0d7_KjU, j13, null, f112, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new a(function5, i16, content)), composerStartRestartGroup, (i16 & 14) | 1572864 | (i212 & 896) | (i212 & 7168) | ((i16 << 6) & 458752), 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j12 = j13;
                fM788getElevationD9Ej5fM = f112;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U114 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U114;
                    }
                    if (i19 != 0) {
                        fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        function5 = null;
                        j13 = j12;
                    } else {
                        j13 = j12;
                        function5 = function4;
                    }
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U115 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U115;
                    }
                    if (i19 != 0) {
                        fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        function5 = null;
                        j13 = j12;
                    } else {
                        j13 = j12;
                        function5 = function4;
                    }
                }
                i16 = i12;
                float f113 = fM788getElevationD9Ej5fM;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1790971523, i16, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
                }
                int i213 = i16 << 3;
                SurfaceKt.m834SurfaceFjzlyU(modifier3, null, jM717getSurface0d7_KjU, j13, null, f113, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new a(function5, i16, content)), composerStartRestartGroup, (i16 & 14) | 1572864 | (i213 & 896) | (i213 & 7168) | ((i16 << 6) & 458752), 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j12 = j13;
                fM788getElevationD9Ej5fM = f113;
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, jM717getSurface0d7_KjU, j12, fM788getElevationD9Ej5fM, function5, content, i10, i11));
        }
        i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i12 |= i15;
        if ((374491 & i12) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                }
                if ((i11 & 4) != 0) {
                    long jM731contentColorForek8zF_U116 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                    j12 = jM731contentColorForek8zF_U116;
                }
                if (i19 != 0) {
                    fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                }
                if (i13 != 0) {
                    function5 = null;
                    j13 = j12;
                } else {
                    j13 = j12;
                    function5 = function4;
                }
            } else {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                }
                if ((i11 & 4) != 0) {
                    long jM731contentColorForek8zF_U117 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                    j12 = jM731contentColorForek8zF_U117;
                }
                if (i19 != 0) {
                    fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                }
                if (i13 != 0) {
                    function5 = null;
                    j13 = j12;
                } else {
                    j13 = j12;
                    function5 = function4;
                }
            }
            i16 = i12;
            float f114 = fM788getElevationD9Ej5fM;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1790971523, i16, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
            }
            int i214 = i16 << 3;
            SurfaceKt.m834SurfaceFjzlyU(modifier3, null, jM717getSurface0d7_KjU, j13, null, f114, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new a(function5, i16, content)), composerStartRestartGroup, (i16 & 14) | 1572864 | (i214 & 896) | (i214 & 7168) | ((i16 << 6) & 458752), 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j12 = j13;
            fM788getElevationD9Ej5fM = f114;
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                }
                if ((i11 & 4) != 0) {
                    long jM731contentColorForek8zF_U118 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                    j12 = jM731contentColorForek8zF_U118;
                }
                if (i19 != 0) {
                    fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                }
                if (i13 != 0) {
                    function5 = null;
                    j13 = j12;
                } else {
                    j13 = j12;
                    function5 = function4;
                }
            } else {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m717getSurface0d7_KjU();
                }
                if ((i11 & 4) != 0) {
                    long jM731contentColorForek8zF_U119 = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                    j12 = jM731contentColorForek8zF_U119;
                }
                if (i19 != 0) {
                    fM788getElevationD9Ej5fM = NavigationRailDefaults.INSTANCE.m788getElevationD9Ej5fM();
                }
                if (i13 != 0) {
                    function5 = null;
                    j13 = j12;
                } else {
                    j13 = j12;
                    function5 = function4;
                }
            }
            i16 = i12;
            float f115 = fM788getElevationD9Ej5fM;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1790971523, i16, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:92)");
            }
            int i215 = i16 << 3;
            SurfaceKt.m834SurfaceFjzlyU(modifier3, null, jM717getSurface0d7_KjU, j13, null, f115, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1571506489, true, new a(function5, i16, content)), composerStartRestartGroup, (i16 & 14) | 1572864 | (i215 & 896) | (i215 & 7168) | ((i16 << 6) & 458752), 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j12 = j13;
            fM788getElevationD9Ej5fM = f115;
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, jM717getSurface0d7_KjU, j12, fM788getElevationD9Ej5fM, function5, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0122  */
    /* JADX WARN: Code duplicated, block: B:105:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0134  */
    /* JADX WARN: Code duplicated, block: B:111:0x0140  */
    /* JADX WARN: Code duplicated, block: B:115:0x0158  */
    /* JADX WARN: Code duplicated, block: B:117:0x0168  */
    /* JADX WARN: Code duplicated, block: B:127:0x0187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x0189  */
    /* JADX WARN: Code duplicated, block: B:129:0x018c  */
    /* JADX WARN: Code duplicated, block: B:131:0x018f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0192  */
    /* JADX WARN: Code duplicated, block: B:135:0x0196  */
    /* JADX WARN: Code duplicated, block: B:137:0x0199  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:144:0x01be  */
    /* JADX WARN: Code duplicated, block: B:145:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:149:0x0204  */
    /* JADX WARN: Code duplicated, block: B:152:0x020f  */
    /* JADX WARN: Code duplicated, block: B:154:0x021a  */
    /* JADX WARN: Code duplicated, block: B:157:0x022a  */
    /* JADX WARN: Code duplicated, block: B:158:0x022d  */
    /* JADX WARN: Code duplicated, block: B:161:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:164:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:165:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:168:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:170:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:173:0x031a  */
    /* JADX WARN: Code duplicated, block: B:178:0x032f  */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0116  */
    /* JADX WARN: Instruction removed from duplicated block: B:115:0x0158, please report this as an issue */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: NavigationRailItem-0S3VyRs, reason: not valid java name */
    public static final void m790NavigationRailItem0S3VyRs(boolean z10, @NotNull Function0<Unit> onClick, @NotNull Function2<? super Composer, ? super Integer, Unit> icon, @Nullable Modifier modifier, boolean z11, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, boolean z12, @Nullable MutableInteractionSource mutableInteractionSource, long j10, long j11, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        boolean z13;
        int i14;
        int i15;
        Function2<? super Composer, ? super Integer, Unit> function3;
        int i16;
        int i17;
        boolean z14;
        int i18;
        int i19;
        int i20;
        Modifier modifier3;
        MutableInteractionSource mutableInteractionSource2;
        long jM713getPrimary0d7_KjU;
        long jM2507copywmQWz5c$default;
        Object objRememberedValue;
        float f6;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM2074constructorimpl;
        Function2 function2C;
        MutableInteractionSource mutableInteractionSource3;
        long j12;
        Function2<? super Composer, ? super Integer, Unit> function4;
        boolean z15;
        Modifier modifier4;
        boolean z16;
        long j13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1813548445);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(icon) ? 256 : 128;
        }
        int i21 = i11 & 8;
        if (i21 == 0) {
            if ((i10 & 7168) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((57344 & i10) == 0) {
                    z13 = z11;
                    if (composerStartRestartGroup.changed(z13)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((458752 & i10) == 0) {
                        function3 = function2;
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        if ((3670016 & i10) == 0) {
                            z14 = z12;
                            if (composerStartRestartGroup.changed(z14)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i12 |= i18;
                        }
                        i19 = i11 & 128;
                        if (i19 != 0) {
                            i12 |= 12582912;
                        } else if ((i10 & 29360128) == 0) {
                            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                            i12 |= i20;
                        }
                        if ((i10 & 234881024) != 0) {
                            i12 |= ((i11 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        }
                        if ((i10 & 1879048192) != 0) {
                            i12 |= ((i11 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                        }
                        if ((i12 & 1533916891) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i21 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if (i15 != 0) {
                                    function3 = null;
                                }
                                if (i17 != 0) {
                                    z14 = true;
                                }
                                if (i19 != 0) {
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
                                if ((i11 & 256) != 0) {
                                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                                    i12 &= -234881025;
                                } else {
                                    jM713getPrimary0d7_KjU = j10;
                                }
                                if ((i11 & 512) != 0) {
                                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i12 &= -1879048193;
                                } else {
                                    jM2507copywmQWz5c$default = j11;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i11 & 256) != 0) {
                                    i12 &= -234881025;
                                }
                                if ((i11 & 512) != 0) {
                                    i12 &= -1879048193;
                                }
                                mutableInteractionSource2 = mutableInteractionSource;
                                jM2507copywmQWz5c$default = j11;
                                modifier3 = modifier2;
                                jM713getPrimary0d7_KjU = j10;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                            }
                            ComposableLambda composableLambda = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                            if (function3 == null) {
                                f6 = f7373c;
                            } else {
                                f6 = f7372b;
                            }
                            Modifier modifierM335size3ABfNKs = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifier5 = modifier3;
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs);
                            boolean z17 = z13;
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
                            function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
                            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                            }
                            ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            int i22 = i12 >> 24;
                            a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda, z14)), composerStartRestartGroup, (i22 & 112) | (i22 & 14) | 3072 | ((i12 << 6) & 896));
                            if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                                ComposerKt.traceEventEnd();
                            }
                            mutableInteractionSource3 = mutableInteractionSource4;
                            j12 = jM713getPrimary0d7_KjU;
                            function4 = function3;
                            z15 = z14;
                            modifier4 = modifier5;
                            z16 = z17;
                            j13 = jM2507copywmQWz5c$default;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            mutableInteractionSource3 = mutableInteractionSource;
                            modifier4 = modifier2;
                            z16 = z13;
                            function4 = function3;
                            z15 = z14;
                            j12 = j10;
                            j13 = j11;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new d(z10, onClick, icon, modifier4, z16, function4, z15, mutableInteractionSource3, j12, j13, i10, i11));
                    }
                    i12 |= 1572864;
                    z14 = z12;
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    if ((i10 & 234881024) != 0) {
                        i12 |= ((i11 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    }
                    if ((i10 & 1879048192) != 0) {
                        i12 |= ((i11 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                    }
                    if ((i12 & 1533916891) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
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
                            if ((i11 & 256) != 0) {
                                jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                                i12 &= -234881025;
                            } else {
                                jM713getPrimary0d7_KjU = j10;
                            }
                            if ((i11 & 512) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i12 &= -1879048193;
                            } else {
                                jM2507copywmQWz5c$default = j11;
                            }
                        } else {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
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
                            if ((i11 & 256) != 0) {
                                jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                                i12 &= -234881025;
                            } else {
                                jM713getPrimary0d7_KjU = j10;
                            }
                            if ((i11 & 512) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i12 &= -1879048193;
                            } else {
                                jM2507copywmQWz5c$default = j11;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                        }
                        ComposableLambda composableLambda2 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                        if (function3 == null) {
                            f6 = f7373c;
                        } else {
                            f6 = f7372b;
                        }
                        Modifier modifierM335size3ABfNKs2 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                        Alignment center2 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource2;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifier6 = modifier3;
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs2);
                        boolean z18 = z13;
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
                        function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy2, composerM2074constructorimpl, currentCompositionLocalMap2);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        int i23 = i12 >> 24;
                        a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda2, z14)), composerStartRestartGroup, (i23 & 112) | (i23 & 14) | 3072 | ((i12 << 6) & 896));
                        if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource3 = mutableInteractionSource5;
                        j12 = jM713getPrimary0d7_KjU;
                        function4 = function3;
                        z15 = z14;
                        modifier4 = modifier6;
                        z16 = z18;
                        j13 = jM2507copywmQWz5c$default;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
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
                            if ((i11 & 256) != 0) {
                                jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                                i12 &= -234881025;
                            } else {
                                jM713getPrimary0d7_KjU = j10;
                            }
                            if ((i11 & 512) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i12 &= -1879048193;
                            } else {
                                jM2507copywmQWz5c$default = j11;
                            }
                        } else {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
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
                            if ((i11 & 256) != 0) {
                                jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                                i12 &= -234881025;
                            } else {
                                jM713getPrimary0d7_KjU = j10;
                            }
                            if ((i11 & 512) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i12 &= -1879048193;
                            } else {
                                jM2507copywmQWz5c$default = j11;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                        }
                        ComposableLambda composableLambda3 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                        if (function3 == null) {
                            f6 = f7373c;
                        } else {
                            f6 = f7372b;
                        }
                        Modifier modifierM335size3ABfNKs3 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                        Alignment center3 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource2;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifier7 = modifier3;
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs3);
                        boolean z19 = z13;
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
                        function2C = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy3, composerM2074constructorimpl, currentCompositionLocalMap3);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf3, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                        int i24 = i12 >> 24;
                        a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda3, z14)), composerStartRestartGroup, (i24 & 112) | (i24 & 14) | 3072 | ((i12 << 6) & 896));
                        if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource3 = mutableInteractionSource6;
                        j12 = jM713getPrimary0d7_KjU;
                        function4 = function3;
                        z15 = z14;
                        modifier4 = modifier7;
                        z16 = z19;
                        j13 = jM2507copywmQWz5c$default;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(z10, onClick, icon, modifier4, z16, function4, z15, mutableInteractionSource3, j12, j13, i10, i11));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function3 = function2;
                i17 = i11 & 64;
                if (i17 != 0) {
                    if ((3670016 & i10) == 0) {
                        z14 = z12;
                        if (composerStartRestartGroup.changed(z14)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    if ((i10 & 234881024) != 0) {
                        i12 |= ((i11 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    }
                    if ((i10 & 1879048192) != 0) {
                        i12 |= ((i11 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                    }
                    if ((i12 & 1533916891) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
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
                            if ((i11 & 256) != 0) {
                                jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                                i12 &= -234881025;
                            } else {
                                jM713getPrimary0d7_KjU = j10;
                            }
                            if ((i11 & 512) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i12 &= -1879048193;
                            } else {
                                jM2507copywmQWz5c$default = j11;
                            }
                        } else {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
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
                            if ((i11 & 256) != 0) {
                                jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                                i12 &= -234881025;
                            } else {
                                jM713getPrimary0d7_KjU = j10;
                            }
                            if ((i11 & 512) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i12 &= -1879048193;
                            } else {
                                jM2507copywmQWz5c$default = j11;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                        }
                        ComposableLambda composableLambda4 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                        if (function3 == null) {
                            f6 = f7373c;
                        } else {
                            f6 = f7372b;
                        }
                        Modifier modifierM335size3ABfNKs4 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                        Alignment center4 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource2;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center4, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifier8 = modifier3;
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        constructor = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs4);
                        boolean z110 = z13;
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
                        function2C = com.google.android.gms.measurement.internal.a.c(companion4, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy4, composerM2074constructorimpl, currentCompositionLocalMap4);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf4, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                        int i25 = i12 >> 24;
                        a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda4, z14)), composerStartRestartGroup, (i25 & 112) | (i25 & 14) | 3072 | ((i12 << 6) & 896));
                        if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource3 = mutableInteractionSource7;
                        j12 = jM713getPrimary0d7_KjU;
                        function4 = function3;
                        z15 = z14;
                        modifier4 = modifier8;
                        z16 = z110;
                        j13 = jM2507copywmQWz5c$default;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
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
                            if ((i11 & 256) != 0) {
                                jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                                i12 &= -234881025;
                            } else {
                                jM713getPrimary0d7_KjU = j10;
                            }
                            if ((i11 & 512) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i12 &= -1879048193;
                            } else {
                                jM2507copywmQWz5c$default = j11;
                            }
                        } else {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
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
                            if ((i11 & 256) != 0) {
                                jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                                i12 &= -234881025;
                            } else {
                                jM713getPrimary0d7_KjU = j10;
                            }
                            if ((i11 & 512) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i12 &= -1879048193;
                            } else {
                                jM2507copywmQWz5c$default = j11;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                        }
                        ComposableLambda composableLambda5 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                        if (function3 == null) {
                            f6 = f7373c;
                        } else {
                            f6 = f7372b;
                        }
                        Modifier modifierM335size3ABfNKs5 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                        Alignment center5 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource2;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center5, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifier9 = modifier3;
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        constructor = companion5.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs5);
                        boolean z111 = z13;
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
                        function2C = com.google.android.gms.measurement.internal.a.c(companion5, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy5, composerM2074constructorimpl, currentCompositionLocalMap5);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf5, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                        int i26 = i12 >> 24;
                        a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda5, z14)), composerStartRestartGroup, (i26 & 112) | (i26 & 14) | 3072 | ((i12 << 6) & 896));
                        if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource3 = mutableInteractionSource8;
                        j12 = jM713getPrimary0d7_KjU;
                        function4 = function3;
                        z15 = z14;
                        modifier4 = modifier9;
                        z16 = z111;
                        j13 = jM2507copywmQWz5c$default;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(z10, onClick, icon, modifier4, z16, function4, z15, mutableInteractionSource3, j12, j13, i10, i11));
                }
                i12 |= 1572864;
                z14 = z12;
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i10 & 234881024) != 0) {
                    i12 |= ((i11 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                }
                if ((i10 & 1879048192) != 0) {
                    i12 |= ((i11 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i12 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    ComposableLambda composableLambda6 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                    if (function3 == null) {
                        f6 = f7373c;
                    } else {
                        f6 = f7372b;
                    }
                    Modifier modifierM335size3ABfNKs6 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                    Alignment center6 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(center6, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifier10 = modifier3;
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    constructor = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs6);
                    boolean z112 = z13;
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
                    function2C = com.google.android.gms.measurement.internal.a.c(companion6, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy6, composerM2074constructorimpl, currentCompositionLocalMap6);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf6, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                    int i27 = i12 >> 24;
                    a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda6, z14)), composerStartRestartGroup, (i27 & 112) | (i27 & 14) | 3072 | ((i12 << 6) & 896));
                    if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource3 = mutableInteractionSource9;
                    j12 = jM713getPrimary0d7_KjU;
                    function4 = function3;
                    z15 = z14;
                    modifier4 = modifier10;
                    z16 = z112;
                    j13 = jM2507copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    ComposableLambda composableLambda7 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                    if (function3 == null) {
                        f6 = f7373c;
                    } else {
                        f6 = f7372b;
                    }
                    Modifier modifierM335size3ABfNKs7 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                    Alignment center7 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource10 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(center7, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifier11 = modifier3;
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    constructor = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs7);
                    boolean z113 = z13;
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
                    function2C = com.google.android.gms.measurement.internal.a.c(companion7, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy7, composerM2074constructorimpl, currentCompositionLocalMap7);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf7, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                    int i28 = i12 >> 24;
                    a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda7, z14)), composerStartRestartGroup, (i28 & 112) | (i28 & 14) | 3072 | ((i12 << 6) & 896));
                    if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource3 = mutableInteractionSource10;
                    j12 = jM713getPrimary0d7_KjU;
                    function4 = function3;
                    z15 = z14;
                    modifier4 = modifier11;
                    z16 = z113;
                    j13 = jM2507copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(z10, onClick, icon, modifier4, z16, function4, z15, mutableInteractionSource3, j12, j13, i10, i11));
            }
            i12 |= 24576;
            z13 = z11;
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((458752 & i10) == 0) {
                    function3 = function2;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    if ((3670016 & i10) == 0) {
                        z14 = z12;
                        if (composerStartRestartGroup.changed(z14)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    if ((i10 & 234881024) != 0) {
                        i12 |= ((i11 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    }
                    if ((i10 & 1879048192) != 0) {
                        i12 |= ((i11 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                    }
                    if ((i12 & 1533916891) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
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
                            if ((i11 & 256) != 0) {
                                jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                                i12 &= -234881025;
                            } else {
                                jM713getPrimary0d7_KjU = j10;
                            }
                            if ((i11 & 512) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i12 &= -1879048193;
                            } else {
                                jM2507copywmQWz5c$default = j11;
                            }
                        } else {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
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
                            if ((i11 & 256) != 0) {
                                jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                                i12 &= -234881025;
                            } else {
                                jM713getPrimary0d7_KjU = j10;
                            }
                            if ((i11 & 512) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i12 &= -1879048193;
                            } else {
                                jM2507copywmQWz5c$default = j11;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                        }
                        ComposableLambda composableLambda8 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                        if (function3 == null) {
                            f6 = f7373c;
                        } else {
                            f6 = f7372b;
                        }
                        Modifier modifierM335size3ABfNKs8 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                        Alignment center8 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MutableInteractionSource mutableInteractionSource11 = mutableInteractionSource2;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy8 = BoxKt.rememberBoxMeasurePolicy(center8, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifier12 = modifier3;
                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                        constructor = companion8.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs8);
                        boolean z114 = z13;
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
                        function2C = com.google.android.gms.measurement.internal.a.c(companion8, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy8, composerM2074constructorimpl, currentCompositionLocalMap8);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf8, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                        int i29 = i12 >> 24;
                        a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda8, z14)), composerStartRestartGroup, (i29 & 112) | (i29 & 14) | 3072 | ((i12 << 6) & 896));
                        if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource3 = mutableInteractionSource11;
                        j12 = jM713getPrimary0d7_KjU;
                        function4 = function3;
                        z15 = z14;
                        modifier4 = modifier12;
                        z16 = z114;
                        j13 = jM2507copywmQWz5c$default;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
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
                            if ((i11 & 256) != 0) {
                                jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                                i12 &= -234881025;
                            } else {
                                jM713getPrimary0d7_KjU = j10;
                            }
                            if ((i11 & 512) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i12 &= -1879048193;
                            } else {
                                jM2507copywmQWz5c$default = j11;
                            }
                        } else {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
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
                            if ((i11 & 256) != 0) {
                                jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                                i12 &= -234881025;
                            } else {
                                jM713getPrimary0d7_KjU = j10;
                            }
                            if ((i11 & 512) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i12 &= -1879048193;
                            } else {
                                jM2507copywmQWz5c$default = j11;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                        }
                        ComposableLambda composableLambda9 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                        if (function3 == null) {
                            f6 = f7373c;
                        } else {
                            f6 = f7372b;
                        }
                        Modifier modifierM335size3ABfNKs9 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                        Alignment center9 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MutableInteractionSource mutableInteractionSource12 = mutableInteractionSource2;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy9 = BoxKt.rememberBoxMeasurePolicy(center9, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifier13 = modifier3;
                        ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                        constructor = companion9.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs9);
                        boolean z115 = z13;
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
                        function2C = com.google.android.gms.measurement.internal.a.c(companion9, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy9, composerM2074constructorimpl, currentCompositionLocalMap9);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf9, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                        int i210 = i12 >> 24;
                        a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda9, z14)), composerStartRestartGroup, (i210 & 112) | (i210 & 14) | 3072 | ((i12 << 6) & 896));
                        if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource3 = mutableInteractionSource12;
                        j12 = jM713getPrimary0d7_KjU;
                        function4 = function3;
                        z15 = z14;
                        modifier4 = modifier13;
                        z16 = z115;
                        j13 = jM2507copywmQWz5c$default;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(z10, onClick, icon, modifier4, z16, function4, z15, mutableInteractionSource3, j12, j13, i10, i11));
                }
                i12 |= 1572864;
                z14 = z12;
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i10 & 234881024) != 0) {
                    i12 |= ((i11 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                }
                if ((i10 & 1879048192) != 0) {
                    i12 |= ((i11 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i12 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    ComposableLambda composableLambda10 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                    if (function3 == null) {
                        f6 = f7373c;
                    } else {
                        f6 = f7372b;
                    }
                    Modifier modifierM335size3ABfNKs10 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                    Alignment center10 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource13 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy10 = BoxKt.rememberBoxMeasurePolicy(center10, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifier14 = modifier3;
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    constructor = companion10.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs10);
                    boolean z116 = z13;
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
                    function2C = com.google.android.gms.measurement.internal.a.c(companion10, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy10, composerM2074constructorimpl, currentCompositionLocalMap10);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf10, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                    int i211 = i12 >> 24;
                    a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda10, z14)), composerStartRestartGroup, (i211 & 112) | (i211 & 14) | 3072 | ((i12 << 6) & 896));
                    if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource3 = mutableInteractionSource13;
                    j12 = jM713getPrimary0d7_KjU;
                    function4 = function3;
                    z15 = z14;
                    modifier4 = modifier14;
                    z16 = z116;
                    j13 = jM2507copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    ComposableLambda composableLambda11 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                    if (function3 == null) {
                        f6 = f7373c;
                    } else {
                        f6 = f7372b;
                    }
                    Modifier modifierM335size3ABfNKs11 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                    Alignment center11 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource14 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy11 = BoxKt.rememberBoxMeasurePolicy(center11, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifier15 = modifier3;
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    constructor = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs11);
                    boolean z117 = z13;
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
                    function2C = com.google.android.gms.measurement.internal.a.c(companion11, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy11, composerM2074constructorimpl, currentCompositionLocalMap11);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf11, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                    int i212 = i12 >> 24;
                    a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda11, z14)), composerStartRestartGroup, (i212 & 112) | (i212 & 14) | 3072 | ((i12 << 6) & 896));
                    if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource3 = mutableInteractionSource14;
                    j12 = jM713getPrimary0d7_KjU;
                    function4 = function3;
                    z15 = z14;
                    modifier4 = modifier15;
                    z16 = z117;
                    j13 = jM2507copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(z10, onClick, icon, modifier4, z16, function4, z15, mutableInteractionSource3, j12, j13, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function3 = function2;
            i17 = i11 & 64;
            if (i17 != 0) {
                if ((3670016 & i10) == 0) {
                    z14 = z12;
                    if (composerStartRestartGroup.changed(z14)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i10 & 234881024) != 0) {
                    i12 |= ((i11 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                }
                if ((i10 & 1879048192) != 0) {
                    i12 |= ((i11 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i12 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    ComposableLambda composableLambda12 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                    if (function3 == null) {
                        f6 = f7373c;
                    } else {
                        f6 = f7372b;
                    }
                    Modifier modifierM335size3ABfNKs12 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                    Alignment center12 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource15 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy12 = BoxKt.rememberBoxMeasurePolicy(center12, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifier16 = modifier3;
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    constructor = companion12.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs12);
                    boolean z118 = z13;
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
                    function2C = com.google.android.gms.measurement.internal.a.c(companion12, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy12, composerM2074constructorimpl, currentCompositionLocalMap12);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf12, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                    int i213 = i12 >> 24;
                    a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda12, z14)), composerStartRestartGroup, (i213 & 112) | (i213 & 14) | 3072 | ((i12 << 6) & 896));
                    if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource3 = mutableInteractionSource15;
                    j12 = jM713getPrimary0d7_KjU;
                    function4 = function3;
                    z15 = z14;
                    modifier4 = modifier16;
                    z16 = z118;
                    j13 = jM2507copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    ComposableLambda composableLambda13 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                    if (function3 == null) {
                        f6 = f7373c;
                    } else {
                        f6 = f7372b;
                    }
                    Modifier modifierM335size3ABfNKs13 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                    Alignment center13 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource16 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy13 = BoxKt.rememberBoxMeasurePolicy(center13, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifier17 = modifier3;
                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                    constructor = companion13.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs13);
                    boolean z119 = z13;
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
                    function2C = com.google.android.gms.measurement.internal.a.c(companion13, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy13, composerM2074constructorimpl, currentCompositionLocalMap13);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf13, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                    int i214 = i12 >> 24;
                    a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda13, z14)), composerStartRestartGroup, (i214 & 112) | (i214 & 14) | 3072 | ((i12 << 6) & 896));
                    if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource3 = mutableInteractionSource16;
                    j12 = jM713getPrimary0d7_KjU;
                    function4 = function3;
                    z15 = z14;
                    modifier4 = modifier17;
                    z16 = z119;
                    j13 = jM2507copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(z10, onClick, icon, modifier4, z16, function4, z15, mutableInteractionSource3, j12, j13, i10, i11));
            }
            i12 |= 1572864;
            z14 = z12;
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i10 & 234881024) != 0) {
                i12 |= ((i11 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            }
            if ((i10 & 1879048192) != 0) {
                i12 |= ((i11 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i12 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
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
                    if ((i11 & 256) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -234881025;
                    } else {
                        jM713getPrimary0d7_KjU = j10;
                    }
                    if ((i11 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -1879048193;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
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
                    if ((i11 & 256) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -234881025;
                    } else {
                        jM713getPrimary0d7_KjU = j10;
                    }
                    if ((i11 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -1879048193;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                }
                ComposableLambda composableLambda14 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                if (function3 == null) {
                    f6 = f7373c;
                } else {
                    f6 = f7372b;
                }
                Modifier modifierM335size3ABfNKs14 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                Alignment center14 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MutableInteractionSource mutableInteractionSource17 = mutableInteractionSource2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy14 = BoxKt.rememberBoxMeasurePolicy(center14, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifier18 = modifier3;
                ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                constructor = companion14.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs14);
                boolean z1110 = z13;
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
                function2C = com.google.android.gms.measurement.internal.a.c(companion14, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy14, composerM2074constructorimpl, currentCompositionLocalMap14);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf14, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
                int i215 = i12 >> 24;
                a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda14, z14)), composerStartRestartGroup, (i215 & 112) | (i215 & 14) | 3072 | ((i12 << 6) & 896));
                if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource3 = mutableInteractionSource17;
                j12 = jM713getPrimary0d7_KjU;
                function4 = function3;
                z15 = z14;
                modifier4 = modifier18;
                z16 = z1110;
                j13 = jM2507copywmQWz5c$default;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
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
                    if ((i11 & 256) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -234881025;
                    } else {
                        jM713getPrimary0d7_KjU = j10;
                    }
                    if ((i11 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -1879048193;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
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
                    if ((i11 & 256) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -234881025;
                    } else {
                        jM713getPrimary0d7_KjU = j10;
                    }
                    if ((i11 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -1879048193;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                }
                ComposableLambda composableLambda15 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                if (function3 == null) {
                    f6 = f7373c;
                } else {
                    f6 = f7372b;
                }
                Modifier modifierM335size3ABfNKs15 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                Alignment center15 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MutableInteractionSource mutableInteractionSource18 = mutableInteractionSource2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy15 = BoxKt.rememberBoxMeasurePolicy(center15, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifier19 = modifier3;
                ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                constructor = companion15.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs15);
                boolean z1111 = z13;
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
                function2C = com.google.android.gms.measurement.internal.a.c(companion15, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy15, composerM2074constructorimpl, currentCompositionLocalMap15);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf15, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
                int i216 = i12 >> 24;
                a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda15, z14)), composerStartRestartGroup, (i216 & 112) | (i216 & 14) | 3072 | ((i12 << 6) & 896));
                if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource3 = mutableInteractionSource18;
                j12 = jM713getPrimary0d7_KjU;
                function4 = function3;
                z15 = z14;
                modifier4 = modifier19;
                z16 = z1111;
                j13 = jM2507copywmQWz5c$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(z10, onClick, icon, modifier4, z16, function4, z15, mutableInteractionSource3, j12, j13, i10, i11));
        }
        i12 |= 3072;
        modifier2 = modifier;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((57344 & i10) == 0) {
                z13 = z11;
                if (composerStartRestartGroup.changed(z13)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((458752 & i10) == 0) {
                    function3 = function2;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    if ((3670016 & i10) == 0) {
                        z14 = z12;
                        if (composerStartRestartGroup.changed(z14)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    if ((i10 & 234881024) != 0) {
                        i12 |= ((i11 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    }
                    if ((i10 & 1879048192) != 0) {
                        i12 |= ((i11 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                    }
                    if ((i12 & 1533916891) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
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
                            if ((i11 & 256) != 0) {
                                jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                                i12 &= -234881025;
                            } else {
                                jM713getPrimary0d7_KjU = j10;
                            }
                            if ((i11 & 512) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i12 &= -1879048193;
                            } else {
                                jM2507copywmQWz5c$default = j11;
                            }
                        } else {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
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
                            if ((i11 & 256) != 0) {
                                jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                                i12 &= -234881025;
                            } else {
                                jM713getPrimary0d7_KjU = j10;
                            }
                            if ((i11 & 512) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i12 &= -1879048193;
                            } else {
                                jM2507copywmQWz5c$default = j11;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                        }
                        ComposableLambda composableLambda16 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                        if (function3 == null) {
                            f6 = f7373c;
                        } else {
                            f6 = f7372b;
                        }
                        Modifier modifierM335size3ABfNKs16 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                        Alignment center16 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MutableInteractionSource mutableInteractionSource19 = mutableInteractionSource2;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy16 = BoxKt.rememberBoxMeasurePolicy(center16, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifier110 = modifier3;
                        ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                        constructor = companion16.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs16);
                        boolean z1112 = z13;
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
                        function2C = com.google.android.gms.measurement.internal.a.c(companion16, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy16, composerM2074constructorimpl, currentCompositionLocalMap16);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf16, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance16 = BoxScopeInstance.INSTANCE;
                        int i217 = i12 >> 24;
                        a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda16, z14)), composerStartRestartGroup, (i217 & 112) | (i217 & 14) | 3072 | ((i12 << 6) & 896));
                        if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource3 = mutableInteractionSource19;
                        j12 = jM713getPrimary0d7_KjU;
                        function4 = function3;
                        z15 = z14;
                        modifier4 = modifier110;
                        z16 = z1112;
                        j13 = jM2507copywmQWz5c$default;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
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
                            if ((i11 & 256) != 0) {
                                jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                                i12 &= -234881025;
                            } else {
                                jM713getPrimary0d7_KjU = j10;
                            }
                            if ((i11 & 512) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i12 &= -1879048193;
                            } else {
                                jM2507copywmQWz5c$default = j11;
                            }
                        } else {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
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
                            if ((i11 & 256) != 0) {
                                jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                                i12 &= -234881025;
                            } else {
                                jM713getPrimary0d7_KjU = j10;
                            }
                            if ((i11 & 512) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i12 &= -1879048193;
                            } else {
                                jM2507copywmQWz5c$default = j11;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                        }
                        ComposableLambda composableLambda17 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                        if (function3 == null) {
                            f6 = f7373c;
                        } else {
                            f6 = f7372b;
                        }
                        Modifier modifierM335size3ABfNKs17 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                        Alignment center17 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MutableInteractionSource mutableInteractionSource110 = mutableInteractionSource2;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy17 = BoxKt.rememberBoxMeasurePolicy(center17, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap17 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifier111 = modifier3;
                        ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                        constructor = companion17.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf17 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs17);
                        boolean z1113 = z13;
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
                        function2C = com.google.android.gms.measurement.internal.a.c(companion17, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy17, composerM2074constructorimpl, currentCompositionLocalMap17);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf17, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance17 = BoxScopeInstance.INSTANCE;
                        int i218 = i12 >> 24;
                        a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda17, z14)), composerStartRestartGroup, (i218 & 112) | (i218 & 14) | 3072 | ((i12 << 6) & 896));
                        if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource3 = mutableInteractionSource110;
                        j12 = jM713getPrimary0d7_KjU;
                        function4 = function3;
                        z15 = z14;
                        modifier4 = modifier111;
                        z16 = z1113;
                        j13 = jM2507copywmQWz5c$default;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(z10, onClick, icon, modifier4, z16, function4, z15, mutableInteractionSource3, j12, j13, i10, i11));
                }
                i12 |= 1572864;
                z14 = z12;
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i10 & 234881024) != 0) {
                    i12 |= ((i11 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                }
                if ((i10 & 1879048192) != 0) {
                    i12 |= ((i11 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i12 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    ComposableLambda composableLambda18 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                    if (function3 == null) {
                        f6 = f7373c;
                    } else {
                        f6 = f7372b;
                    }
                    Modifier modifierM335size3ABfNKs18 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                    Alignment center18 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource111 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy18 = BoxKt.rememberBoxMeasurePolicy(center18, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap18 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifier112 = modifier3;
                    ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                    constructor = companion18.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf18 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs18);
                    boolean z1114 = z13;
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
                    function2C = com.google.android.gms.measurement.internal.a.c(companion18, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy18, composerM2074constructorimpl, currentCompositionLocalMap18);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf18, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance18 = BoxScopeInstance.INSTANCE;
                    int i219 = i12 >> 24;
                    a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda18, z14)), composerStartRestartGroup, (i219 & 112) | (i219 & 14) | 3072 | ((i12 << 6) & 896));
                    if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource3 = mutableInteractionSource111;
                    j12 = jM713getPrimary0d7_KjU;
                    function4 = function3;
                    z15 = z14;
                    modifier4 = modifier112;
                    z16 = z1114;
                    j13 = jM2507copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    ComposableLambda composableLambda19 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                    if (function3 == null) {
                        f6 = f7373c;
                    } else {
                        f6 = f7372b;
                    }
                    Modifier modifierM335size3ABfNKs19 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                    Alignment center19 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource112 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy19 = BoxKt.rememberBoxMeasurePolicy(center19, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap19 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifier113 = modifier3;
                    ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                    constructor = companion19.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf19 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs19);
                    boolean z1115 = z13;
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
                    function2C = com.google.android.gms.measurement.internal.a.c(companion19, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy19, composerM2074constructorimpl, currentCompositionLocalMap19);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf19, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance19 = BoxScopeInstance.INSTANCE;
                    int i2110 = i12 >> 24;
                    a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda19, z14)), composerStartRestartGroup, (i2110 & 112) | (i2110 & 14) | 3072 | ((i12 << 6) & 896));
                    if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource3 = mutableInteractionSource112;
                    j12 = jM713getPrimary0d7_KjU;
                    function4 = function3;
                    z15 = z14;
                    modifier4 = modifier113;
                    z16 = z1115;
                    j13 = jM2507copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(z10, onClick, icon, modifier4, z16, function4, z15, mutableInteractionSource3, j12, j13, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function3 = function2;
            i17 = i11 & 64;
            if (i17 != 0) {
                if ((3670016 & i10) == 0) {
                    z14 = z12;
                    if (composerStartRestartGroup.changed(z14)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i10 & 234881024) != 0) {
                    i12 |= ((i11 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                }
                if ((i10 & 1879048192) != 0) {
                    i12 |= ((i11 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i12 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    ComposableLambda composableLambda110 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                    if (function3 == null) {
                        f6 = f7373c;
                    } else {
                        f6 = f7372b;
                    }
                    Modifier modifierM335size3ABfNKs110 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                    Alignment center110 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource113 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy110 = BoxKt.rememberBoxMeasurePolicy(center110, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifier114 = modifier3;
                    ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                    constructor = companion110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf110 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs110);
                    boolean z1116 = z13;
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
                    function2C = com.google.android.gms.measurement.internal.a.c(companion110, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy110, composerM2074constructorimpl, currentCompositionLocalMap110);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf110, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance110 = BoxScopeInstance.INSTANCE;
                    int i2111 = i12 >> 24;
                    a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda110, z14)), composerStartRestartGroup, (i2111 & 112) | (i2111 & 14) | 3072 | ((i12 << 6) & 896));
                    if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource3 = mutableInteractionSource113;
                    j12 = jM713getPrimary0d7_KjU;
                    function4 = function3;
                    z15 = z14;
                    modifier4 = modifier114;
                    z16 = z1116;
                    j13 = jM2507copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    ComposableLambda composableLambda111 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                    if (function3 == null) {
                        f6 = f7373c;
                    } else {
                        f6 = f7372b;
                    }
                    Modifier modifierM335size3ABfNKs111 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                    Alignment center111 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource114 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy111 = BoxKt.rememberBoxMeasurePolicy(center111, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifier115 = modifier3;
                    ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                    constructor = companion111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs111);
                    boolean z1117 = z13;
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
                    function2C = com.google.android.gms.measurement.internal.a.c(companion111, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy111, composerM2074constructorimpl, currentCompositionLocalMap111);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf111, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance111 = BoxScopeInstance.INSTANCE;
                    int i2112 = i12 >> 24;
                    a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda111, z14)), composerStartRestartGroup, (i2112 & 112) | (i2112 & 14) | 3072 | ((i12 << 6) & 896));
                    if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource3 = mutableInteractionSource114;
                    j12 = jM713getPrimary0d7_KjU;
                    function4 = function3;
                    z15 = z14;
                    modifier4 = modifier115;
                    z16 = z1117;
                    j13 = jM2507copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(z10, onClick, icon, modifier4, z16, function4, z15, mutableInteractionSource3, j12, j13, i10, i11));
            }
            i12 |= 1572864;
            z14 = z12;
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i10 & 234881024) != 0) {
                i12 |= ((i11 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            }
            if ((i10 & 1879048192) != 0) {
                i12 |= ((i11 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i12 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
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
                    if ((i11 & 256) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -234881025;
                    } else {
                        jM713getPrimary0d7_KjU = j10;
                    }
                    if ((i11 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -1879048193;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
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
                    if ((i11 & 256) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -234881025;
                    } else {
                        jM713getPrimary0d7_KjU = j10;
                    }
                    if ((i11 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -1879048193;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                }
                ComposableLambda composableLambda112 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                if (function3 == null) {
                    f6 = f7373c;
                } else {
                    f6 = f7372b;
                }
                Modifier modifierM335size3ABfNKs112 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                Alignment center112 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MutableInteractionSource mutableInteractionSource115 = mutableInteractionSource2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy112 = BoxKt.rememberBoxMeasurePolicy(center112, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifier116 = modifier3;
                ComposeUiNode.Companion companion112 = ComposeUiNode.INSTANCE;
                constructor = companion112.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf112 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs112);
                boolean z1118 = z13;
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
                function2C = com.google.android.gms.measurement.internal.a.c(companion112, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy112, composerM2074constructorimpl, currentCompositionLocalMap112);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf112, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance112 = BoxScopeInstance.INSTANCE;
                int i2113 = i12 >> 24;
                a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda112, z14)), composerStartRestartGroup, (i2113 & 112) | (i2113 & 14) | 3072 | ((i12 << 6) & 896));
                if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource3 = mutableInteractionSource115;
                j12 = jM713getPrimary0d7_KjU;
                function4 = function3;
                z15 = z14;
                modifier4 = modifier116;
                z16 = z1118;
                j13 = jM2507copywmQWz5c$default;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
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
                    if ((i11 & 256) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -234881025;
                    } else {
                        jM713getPrimary0d7_KjU = j10;
                    }
                    if ((i11 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -1879048193;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
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
                    if ((i11 & 256) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -234881025;
                    } else {
                        jM713getPrimary0d7_KjU = j10;
                    }
                    if ((i11 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -1879048193;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                }
                ComposableLambda composableLambda113 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                if (function3 == null) {
                    f6 = f7373c;
                } else {
                    f6 = f7372b;
                }
                Modifier modifierM335size3ABfNKs113 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                Alignment center113 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MutableInteractionSource mutableInteractionSource116 = mutableInteractionSource2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy113 = BoxKt.rememberBoxMeasurePolicy(center113, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifier117 = modifier3;
                ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                constructor = companion113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf113 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs113);
                boolean z1119 = z13;
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
                function2C = com.google.android.gms.measurement.internal.a.c(companion113, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy113, composerM2074constructorimpl, currentCompositionLocalMap113);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf113, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance113 = BoxScopeInstance.INSTANCE;
                int i2114 = i12 >> 24;
                a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda113, z14)), composerStartRestartGroup, (i2114 & 112) | (i2114 & 14) | 3072 | ((i12 << 6) & 896));
                if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource3 = mutableInteractionSource116;
                j12 = jM713getPrimary0d7_KjU;
                function4 = function3;
                z15 = z14;
                modifier4 = modifier117;
                z16 = z1119;
                j13 = jM2507copywmQWz5c$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(z10, onClick, icon, modifier4, z16, function4, z15, mutableInteractionSource3, j12, j13, i10, i11));
        }
        i12 |= 24576;
        z13 = z11;
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((458752 & i10) == 0) {
                function3 = function2;
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                if ((3670016 & i10) == 0) {
                    z14 = z12;
                    if (composerStartRestartGroup.changed(z14)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i10 & 234881024) != 0) {
                    i12 |= ((i11 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                }
                if ((i10 & 1879048192) != 0) {
                    i12 |= ((i11 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i12 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    ComposableLambda composableLambda114 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                    if (function3 == null) {
                        f6 = f7373c;
                    } else {
                        f6 = f7372b;
                    }
                    Modifier modifierM335size3ABfNKs114 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                    Alignment center114 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource117 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy114 = BoxKt.rememberBoxMeasurePolicy(center114, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifier118 = modifier3;
                    ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                    constructor = companion114.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf114 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs114);
                    boolean z11110 = z13;
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
                    function2C = com.google.android.gms.measurement.internal.a.c(companion114, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy114, composerM2074constructorimpl, currentCompositionLocalMap114);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf114, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance114 = BoxScopeInstance.INSTANCE;
                    int i2115 = i12 >> 24;
                    a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda114, z14)), composerStartRestartGroup, (i2115 & 112) | (i2115 & 14) | 3072 | ((i12 << 6) & 896));
                    if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource3 = mutableInteractionSource117;
                    j12 = jM713getPrimary0d7_KjU;
                    function4 = function3;
                    z15 = z14;
                    modifier4 = modifier118;
                    z16 = z11110;
                    j13 = jM2507copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
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
                        if ((i11 & 256) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -234881025;
                        } else {
                            jM713getPrimary0d7_KjU = j10;
                        }
                        if ((i11 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -1879048193;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                    }
                    ComposableLambda composableLambda115 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                    if (function3 == null) {
                        f6 = f7373c;
                    } else {
                        f6 = f7372b;
                    }
                    Modifier modifierM335size3ABfNKs115 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                    Alignment center115 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource118 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy115 = BoxKt.rememberBoxMeasurePolicy(center115, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifier119 = modifier3;
                    ComposeUiNode.Companion companion115 = ComposeUiNode.INSTANCE;
                    constructor = companion115.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf115 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs115);
                    boolean z11111 = z13;
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
                    function2C = com.google.android.gms.measurement.internal.a.c(companion115, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy115, composerM2074constructorimpl, currentCompositionLocalMap115);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf115, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance115 = BoxScopeInstance.INSTANCE;
                    int i2116 = i12 >> 24;
                    a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda115, z14)), composerStartRestartGroup, (i2116 & 112) | (i2116 & 14) | 3072 | ((i12 << 6) & 896));
                    if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource3 = mutableInteractionSource118;
                    j12 = jM713getPrimary0d7_KjU;
                    function4 = function3;
                    z15 = z14;
                    modifier4 = modifier119;
                    z16 = z11111;
                    j13 = jM2507copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(z10, onClick, icon, modifier4, z16, function4, z15, mutableInteractionSource3, j12, j13, i10, i11));
            }
            i12 |= 1572864;
            z14 = z12;
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i10 & 234881024) != 0) {
                i12 |= ((i11 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            }
            if ((i10 & 1879048192) != 0) {
                i12 |= ((i11 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i12 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
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
                    if ((i11 & 256) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -234881025;
                    } else {
                        jM713getPrimary0d7_KjU = j10;
                    }
                    if ((i11 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -1879048193;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
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
                    if ((i11 & 256) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -234881025;
                    } else {
                        jM713getPrimary0d7_KjU = j10;
                    }
                    if ((i11 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -1879048193;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                }
                ComposableLambda composableLambda116 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                if (function3 == null) {
                    f6 = f7373c;
                } else {
                    f6 = f7372b;
                }
                Modifier modifierM335size3ABfNKs116 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                Alignment center116 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MutableInteractionSource mutableInteractionSource119 = mutableInteractionSource2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy116 = BoxKt.rememberBoxMeasurePolicy(center116, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifier1110 = modifier3;
                ComposeUiNode.Companion companion116 = ComposeUiNode.INSTANCE;
                constructor = companion116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf116 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs116);
                boolean z11112 = z13;
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
                function2C = com.google.android.gms.measurement.internal.a.c(companion116, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy116, composerM2074constructorimpl, currentCompositionLocalMap116);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf116, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance116 = BoxScopeInstance.INSTANCE;
                int i2117 = i12 >> 24;
                a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda116, z14)), composerStartRestartGroup, (i2117 & 112) | (i2117 & 14) | 3072 | ((i12 << 6) & 896));
                if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource3 = mutableInteractionSource119;
                j12 = jM713getPrimary0d7_KjU;
                function4 = function3;
                z15 = z14;
                modifier4 = modifier1110;
                z16 = z11112;
                j13 = jM2507copywmQWz5c$default;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
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
                    if ((i11 & 256) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -234881025;
                    } else {
                        jM713getPrimary0d7_KjU = j10;
                    }
                    if ((i11 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -1879048193;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
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
                    if ((i11 & 256) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -234881025;
                    } else {
                        jM713getPrimary0d7_KjU = j10;
                    }
                    if ((i11 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -1879048193;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                }
                ComposableLambda composableLambda117 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                if (function3 == null) {
                    f6 = f7373c;
                } else {
                    f6 = f7372b;
                }
                Modifier modifierM335size3ABfNKs117 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                Alignment center117 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MutableInteractionSource mutableInteractionSource1110 = mutableInteractionSource2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy117 = BoxKt.rememberBoxMeasurePolicy(center117, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifier1111 = modifier3;
                ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                constructor = companion117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf117 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs117);
                boolean z11113 = z13;
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
                function2C = com.google.android.gms.measurement.internal.a.c(companion117, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy117, composerM2074constructorimpl, currentCompositionLocalMap117);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf117, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance117 = BoxScopeInstance.INSTANCE;
                int i2118 = i12 >> 24;
                a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda117, z14)), composerStartRestartGroup, (i2118 & 112) | (i2118 & 14) | 3072 | ((i12 << 6) & 896));
                if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource3 = mutableInteractionSource1110;
                j12 = jM713getPrimary0d7_KjU;
                function4 = function3;
                z15 = z14;
                modifier4 = modifier1111;
                z16 = z11113;
                j13 = jM2507copywmQWz5c$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(z10, onClick, icon, modifier4, z16, function4, z15, mutableInteractionSource3, j12, j13, i10, i11));
        }
        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        function3 = function2;
        i17 = i11 & 64;
        if (i17 != 0) {
            if ((3670016 & i10) == 0) {
                z14 = z12;
                if (composerStartRestartGroup.changed(z14)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i10 & 234881024) != 0) {
                i12 |= ((i11 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            }
            if ((i10 & 1879048192) != 0) {
                i12 |= ((i11 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i12 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
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
                    if ((i11 & 256) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -234881025;
                    } else {
                        jM713getPrimary0d7_KjU = j10;
                    }
                    if ((i11 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -1879048193;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
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
                    if ((i11 & 256) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -234881025;
                    } else {
                        jM713getPrimary0d7_KjU = j10;
                    }
                    if ((i11 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -1879048193;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                }
                ComposableLambda composableLambda118 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                if (function3 == null) {
                    f6 = f7373c;
                } else {
                    f6 = f7372b;
                }
                Modifier modifierM335size3ABfNKs118 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                Alignment center118 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MutableInteractionSource mutableInteractionSource1111 = mutableInteractionSource2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy118 = BoxKt.rememberBoxMeasurePolicy(center118, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifier1112 = modifier3;
                ComposeUiNode.Companion companion118 = ComposeUiNode.INSTANCE;
                constructor = companion118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf118 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs118);
                boolean z11114 = z13;
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
                function2C = com.google.android.gms.measurement.internal.a.c(companion118, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy118, composerM2074constructorimpl, currentCompositionLocalMap118);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf118, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance118 = BoxScopeInstance.INSTANCE;
                int i2119 = i12 >> 24;
                a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda118, z14)), composerStartRestartGroup, (i2119 & 112) | (i2119 & 14) | 3072 | ((i12 << 6) & 896));
                if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource3 = mutableInteractionSource1111;
                j12 = jM713getPrimary0d7_KjU;
                function4 = function3;
                z15 = z14;
                modifier4 = modifier1112;
                z16 = z11114;
                j13 = jM2507copywmQWz5c$default;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
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
                    if ((i11 & 256) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -234881025;
                    } else {
                        jM713getPrimary0d7_KjU = j10;
                    }
                    if ((i11 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -1879048193;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
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
                    if ((i11 & 256) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -234881025;
                    } else {
                        jM713getPrimary0d7_KjU = j10;
                    }
                    if ((i11 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -1879048193;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
                }
                ComposableLambda composableLambda119 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
                if (function3 == null) {
                    f6 = f7373c;
                } else {
                    f6 = f7372b;
                }
                Modifier modifierM335size3ABfNKs119 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
                Alignment center119 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MutableInteractionSource mutableInteractionSource1112 = mutableInteractionSource2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy119 = BoxKt.rememberBoxMeasurePolicy(center119, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifier1113 = modifier3;
                ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
                constructor = companion119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf119 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs119);
                boolean z11115 = z13;
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
                function2C = com.google.android.gms.measurement.internal.a.c(companion119, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy119, composerM2074constructorimpl, currentCompositionLocalMap119);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf119, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance119 = BoxScopeInstance.INSTANCE;
                int i21110 = i12 >> 24;
                a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda119, z14)), composerStartRestartGroup, (i21110 & 112) | (i21110 & 14) | 3072 | ((i12 << 6) & 896));
                if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource3 = mutableInteractionSource1112;
                j12 = jM713getPrimary0d7_KjU;
                function4 = function3;
                z15 = z14;
                modifier4 = modifier1113;
                z16 = z11115;
                j13 = jM2507copywmQWz5c$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(z10, onClick, icon, modifier4, z16, function4, z15, mutableInteractionSource3, j12, j13, i10, i11));
        }
        i12 |= 1572864;
        z14 = z12;
        i19 = i11 & 128;
        if (i19 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i12 |= i20;
        }
        if ((i10 & 234881024) != 0) {
            i12 |= ((i11 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        }
        if ((i10 & 1879048192) != 0) {
            i12 |= ((i11 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
        }
        if ((i12 & 1533916891) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if (i15 != 0) {
                    function3 = null;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if (i19 != 0) {
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
                if ((i11 & 256) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    i12 &= -234881025;
                } else {
                    jM713getPrimary0d7_KjU = j10;
                }
                if ((i11 & 512) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i12 &= -1879048193;
                } else {
                    jM2507copywmQWz5c$default = j11;
                }
            } else {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if (i15 != 0) {
                    function3 = null;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if (i19 != 0) {
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
                if ((i11 & 256) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    i12 &= -234881025;
                } else {
                    jM713getPrimary0d7_KjU = j10;
                }
                if ((i11 & 512) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i12 &= -1879048193;
                } else {
                    jM2507copywmQWz5c$default = j11;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
            }
            ComposableLambda composableLambda1110 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
            if (function3 == null) {
                f6 = f7373c;
            } else {
                f6 = f7372b;
            }
            Modifier modifierM335size3ABfNKs1110 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
            Alignment center1110 = Alignment.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MutableInteractionSource mutableInteractionSource1113 = mutableInteractionSource2;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy1110 = BoxKt.rememberBoxMeasurePolicy(center1110, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifier1114 = modifier3;
            ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
            constructor = companion1110.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1110 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs1110);
            boolean z11116 = z13;
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
            function2C = com.google.android.gms.measurement.internal.a.c(companion1110, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy1110, composerM2074constructorimpl, currentCompositionLocalMap1110);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf1110, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance1110 = BoxScopeInstance.INSTANCE;
            int i21111 = i12 >> 24;
            a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda1110, z14)), composerStartRestartGroup, (i21111 & 112) | (i21111 & 14) | 3072 | ((i12 << 6) & 896));
            if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource3 = mutableInteractionSource1113;
            j12 = jM713getPrimary0d7_KjU;
            function4 = function3;
            z15 = z14;
            modifier4 = modifier1114;
            z16 = z11116;
            j13 = jM2507copywmQWz5c$default;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if (i15 != 0) {
                    function3 = null;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if (i19 != 0) {
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
                if ((i11 & 256) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    i12 &= -234881025;
                } else {
                    jM713getPrimary0d7_KjU = j10;
                }
                if ((i11 & 512) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i12 &= -1879048193;
                } else {
                    jM2507copywmQWz5c$default = j11;
                }
            } else {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if (i15 != 0) {
                    function3 = null;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if (i19 != 0) {
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
                if ((i11 & 256) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    i12 &= -234881025;
                } else {
                    jM713getPrimary0d7_KjU = j10;
                }
                if ((i11 & 512) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i12 &= -1879048193;
                } else {
                    jM2507copywmQWz5c$default = j11;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1813548445, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)");
            }
            ComposableLambda composableLambda1111 = function3 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -180398615, true, new e(i12, function3)) : null;
            if (function3 == null) {
                f6 = f7373c;
            } else {
                f6 = f7372b;
            }
            Modifier modifierM335size3ABfNKs1111 = SizeKt.m335size3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM713getPrimary0d7_KjU, composerStartRestartGroup, ((i12 >> 18) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f6);
            Alignment center1111 = Alignment.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MutableInteractionSource mutableInteractionSource1114 = mutableInteractionSource2;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy1111 = BoxKt.rememberBoxMeasurePolicy(center1111, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifier1115 = modifier3;
            ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
            constructor = companion1111.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111 = LayoutKt.modifierMaterializerOf(modifierM335size3ABfNKs1111);
            boolean z11117 = z13;
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
            function2C = com.google.android.gms.measurement.internal.a.c(companion1111, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy1111, composerM2074constructorimpl, currentCompositionLocalMap1111);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf1111, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance1111 = BoxScopeInstance.INSTANCE;
            int i21112 = i12 >> 24;
            a(jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 670576792, true, new c(i12, icon, composableLambda1111, z14)), composerStartRestartGroup, (i21112 & 112) | (i21112 & 14) | 3072 | ((i12 << 6) & 896));
            if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource3 = mutableInteractionSource1114;
            j12 = jM713getPrimary0d7_KjU;
            function4 = function3;
            z15 = z14;
            modifier4 = modifier1115;
            z16 = z11117;
            j13 = jM2507copywmQWz5c$default;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(z10, onClick, icon, modifier4, z16, function4, z15, mutableInteractionSource3, j12, j13, i10, i11));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void a(long j10, long j11, boolean z10, Function3<? super Float, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i10) {
        int i11;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-207161906);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(j11) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i12 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-207161906, i12, -1, "androidx.compose.material.NavigationRailTransition (NavigationRail.kt:226)");
            }
            composer2 = composerStartRestartGroup;
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z10 ? 1.0f : 0.0f, f7371a, 0.0f, null, null, composerStartRestartGroup, 48, 28);
            long jM2558lerpjxsXWHM = ColorKt.m2558lerpjxsXWHM(j11, j10, stateAnimateFloatAsState.getValue().floatValue());
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(Color.m2507copywmQWz5c$default(jM2558lerpjxsXWHM, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2510getAlphaimpl(jM2558lerpjxsXWHM)))}, ComposableLambdaKt.composableLambda(composer2, -1688205042, true, new f(function3, i12, stateAnimateFloatAsState)), composer2, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new g(j10, j11, z10, function3, i10));
    }

    public static final void access$NavigationRailItemBaselineLayout(Function2 function2, Function2 function3, float f6, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1903861684);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(f6) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1903861684, i11, -1, "androidx.compose.material.NavigationRailItemBaselineLayout (NavigationRail.kt:258)");
            }
            h0.w1 w1Var = new h0.w1(function3, f6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.INSTANCE;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m2081setimpl(composerM2074constructorimpl, w1Var, companion2.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, "icon");
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion3, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierLayoutId);
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
            Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl2, measurePolicyC, composerM2074constructorimpl2, currentCompositionLocalMap2);
            if (composerM2074constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i11 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(286683862);
            if (function3 != null) {
                Modifier modifierAlpha = AlphaKt.alpha(LayoutIdKt.layoutId(companion, "label"), f6);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(companion3, false, composerStartRestartGroup, 0, -1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierAlpha);
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
                Function2 function2C2 = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl3, measurePolicyC2, composerM2074constructorimpl3, currentCompositionLocalMap3);
                if (composerM2074constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash3, composerM2074constructorimpl3, currentCompositeKeyHash3, function2C2);
                }
                ai.a.j(0, function3ModifierMaterializerOf3, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                androidx.datastore.preferences.protobuf.q.e((i11 >> 3) & 14, function3, composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h0.x1(function2, function3, f6, i10));
    }

    public static final float access$NavigationRailTransition_Klgx_Pg$lambda$3(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: access$placeLabelAndIcon-DIyivk0, reason: not valid java name */
    public static final MeasureResult m793access$placeLabelAndIconDIyivk0(MeasureScope measureScope, Placeable placeable, Placeable placeable2, long j10, float f6) {
        int iM4356getMaxHeightimpl = (Constraints.m4356getMaxHeightimpl(j10) - placeable.get(AlignmentLineKt.getLastBaseline())) - measureScope.mo413roundToPx0680j_4(f7376f);
        int iA = androidx.collection.a.a(placeable, Constraints.m4357getMaxWidthimpl(j10), 2);
        int iMo413roundToPx0680j_4 = measureScope.mo413roundToPx0680j_4(f7377g);
        int iA2 = androidx.appcompat.app.i.a(placeable2, Constraints.m4356getMaxHeightimpl(j10), 2);
        return MeasureScope.CC.q(measureScope, Constraints.m4357getMaxWidthimpl(j10), Constraints.m4356getMaxHeightimpl(j10), null, new h0.z1(f6, placeable, iA, iM4356getMaxHeightimpl, mk.c.roundToInt((1 - f6) * (iA2 - iMo413roundToPx0680j_4)), placeable2, androidx.collection.a.a(placeable2, Constraints.m4357getMaxWidthimpl(j10), 2), iMo413roundToPx0680j_4), 4, null);
    }
}
