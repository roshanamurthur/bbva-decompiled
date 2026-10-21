package androidx.compose.material;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.vierge.bluetoothlibrary.BluetoothState;
import h0.k3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Tab.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u008b\u0001\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0083\u0001\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a{\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\u0002\b\b¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d²\u0006\f\u0010\u001c\u001a\u00020\r8\nX\u008a\u0084\u0002"}, d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/runtime/Composable;", "text", "icon", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Color;", "selectedContentColor", "unselectedContentColor", "Tab-0nD-MI0", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "Tab", "LeadingIconTab-0nD-MI0", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "LeadingIconTab", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "content", "Tab-EVJuX4I", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "color", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 6 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,434:1\n25#2:435\n25#2:443\n25#2:451\n36#2:464\n456#2,8:492\n464#2,3:506\n456#2,8:526\n464#2,3:540\n467#2,3:544\n456#2,8:566\n464#2,3:580\n467#2,3:584\n467#2,3:589\n1097#3,6:436\n1097#3,6:444\n1097#3,6:452\n1097#3,3:465\n1100#3,3:469\n76#4:442\n76#4:450\n76#4:458\n66#5,5:459\n71#5:468\n74#5:472\n858#6,5:473\n75#7,14:478\n78#7,11:515\n91#7:547\n78#7,11:555\n91#7:587\n91#7:592\n4144#8,6:500\n4144#8,6:534\n4144#8,6:574\n66#9,6:509\n72#9:543\n76#9:548\n66#9,6:549\n72#9:583\n76#9:588\n81#10:593\n154#11:594\n154#11:595\n154#11:596\n154#11:597\n154#11:598\n154#11:599\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt\n*L\n97#1:435\n159#1:443\n228#1:451\n270#1:464\n305#1:492,8\n305#1:506,3\n308#1:526,8\n308#1:540,3\n308#1:544,3\n313#1:566,8\n313#1:580,3\n313#1:584,3\n305#1:589,3\n97#1:436,6\n159#1:444,6\n228#1:452,6\n270#1:465,3\n270#1:469,3\n98#1:442\n160#1:450\n229#1:458\n270#1:459,5\n270#1:468\n270#1:472\n270#1:473,5\n305#1:478,14\n308#1:515,11\n308#1:547\n313#1:555,11\n313#1:587\n305#1:592\n305#1:500,6\n308#1:534,6\n313#1:574,6\n308#1:509,6\n308#1:543\n308#1:548\n313#1:549,6\n313#1:583\n313#1:588\n270#1:593\n413#1:594\n414#1:595\n422#1:596\n426#1:597\n429#1:598\n433#1:599\n*E\n"})
public final class TabKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f8019a = Dp.m4389constructorimpl(48);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f8020b = Dp.m4389constructorimpl(72);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f8021c = Dp.m4389constructorimpl(16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f8022d = Dp.m4389constructorimpl(14);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f8023e = Dp.m4389constructorimpl(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f8024f = TextUnitKt.getSp(20);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f8025g = Dp.m4389constructorimpl(8);

    /* JADX INFO: compiled from: Tab.kt */
    @SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt$LeadingIconTab$2\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,434:1\n77#2,2:435\n79#2:465\n83#2:470\n78#3,11:437\n91#3:469\n456#4,8:448\n464#4,3:462\n467#4,3:466\n4144#5,6:456\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt$LeadingIconTab$2\n*L\n169#1:435,2\n169#1:465\n169#1:470\n169#1:437,11\n169#1:469\n169#1:448,8\n169#1:462,3\n169#1:466,3\n169#1:456,6\n*E\n"})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f8026p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f8027q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f8028r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Indication f8029s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f8030t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f8031u0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f8032w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8033x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Modifier modifier, boolean z10, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z11, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, int i10, Function2<? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f8026p0 = modifier;
            this.f8027q0 = z10;
            this.f8028r0 = mutableInteractionSource;
            this.f8029s0 = indication;
            this.f8030t0 = z11;
            this.f8031u0 = function0;
            this.v0 = function2;
            this.f8032w0 = i10;
            this.f8033x0 = function3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(866677691, iIntValue, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:167)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m298paddingVpY3zN4$default(SelectableKt.m458selectableO2vRcR0(SizeKt.m321height3ABfNKs(this.f8026p0, TabKt.f8019a), this.f8027q0, this.f8028r0, this.f8029s0, this.f8030t0, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), this.f8031u0), TabKt.f8021c, 0.0f, 2, null), 0.0f, 1, null);
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
                Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i10 = this.f8032w0;
                this.v0.invoke(composer2, Integer.valueOf((i10 >> 9) & 14));
                SpacerKt.Spacer(SizeKt.m332requiredWidth3ABfNKs(Modifier.INSTANCE, TabKt.f8025g), composer2, 6);
                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                TextKt.ProvideTextStyle(button.m3985copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3927getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & 256) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & 512) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & 1024) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & 32768) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m4289boximpl(TextAlign.INSTANCE.m4296getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & 1048576) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & 4194304) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), this.f8033x0, composer2, (i10 >> 3) & 112);
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

    /* JADX INFO: compiled from: Tab.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f8034p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f8035q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8036r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8037s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Modifier f8038t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f8039u0;
        public final /* synthetic */ MutableInteractionSource v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ long f8040w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ long f8041x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f8042y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, int i11, long j10, long j11, MutableInteractionSource mutableInteractionSource, Modifier modifier, Function0 function0, Function2 function2, Function2 function3, boolean z10, boolean z11) {
            super(2);
            this.f8034p0 = z10;
            this.f8035q0 = function0;
            this.f8036r0 = function2;
            this.f8037s0 = function3;
            this.f8038t0 = modifier;
            this.f8039u0 = z11;
            this.v0 = mutableInteractionSource;
            this.f8040w0 = j10;
            this.f8041x0 = j11;
            this.f8042y0 = i10;
            this.E0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TabKt.m845LeadingIconTab0nDMI0(this.f8034p0, this.f8035q0, this.f8036r0, this.f8037s0, this.f8038t0, this.f8039u0, this.v0, this.f8040w0, this.f8041x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8042y0 | 1), this.E0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Tab.kt */
    public static final class c extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8043p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8044q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f8045r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, ComposableLambda composableLambda, Function2 function2) {
            super(3);
            this.f8043p0 = composableLambda;
            this.f8044q0 = function2;
            this.f8045r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            ColumnScope Tab = columnScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-178151495, iIntValue, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:114)");
                }
                TabKt.access$TabBaselineLayout(this.f8043p0, this.f8044q0, composer2, (this.f8045r0 >> 12) & 112);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Tab.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f8046p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f8047q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f8048r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f8049s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8050t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8051u0;
        public final /* synthetic */ MutableInteractionSource v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ long f8052w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ long f8053x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f8054y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10, int i11, long j10, long j11, MutableInteractionSource mutableInteractionSource, Modifier modifier, Function0 function0, Function2 function2, Function2 function3, boolean z10, boolean z11) {
            super(2);
            this.f8046p0 = z10;
            this.f8047q0 = function0;
            this.f8048r0 = modifier;
            this.f8049s0 = z11;
            this.f8050t0 = function2;
            this.f8051u0 = function3;
            this.v0 = mutableInteractionSource;
            this.f8052w0 = j10;
            this.f8053x0 = j11;
            this.f8054y0 = i10;
            this.E0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TabKt.m846Tab0nDMI0(this.f8046p0, this.f8047q0, this.f8048r0, this.f8049s0, this.f8050t0, this.f8051u0, this.v0, this.f8052w0, this.f8053x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8054y0 | 1), this.E0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Tab.kt */
    @SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt$Tab$5\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,434:1\n76#2,2:435\n78#2:465\n82#2:470\n78#3,11:437\n91#3:469\n456#4,8:448\n464#4,3:462\n467#4,3:466\n4144#5,6:456\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt$Tab$5\n*L\n239#1:435,2\n239#1:465\n239#1:470\n239#1:437,11\n239#1:469\n239#1:448,8\n239#1:462,3\n239#1:466,3\n239#1:456,6\n*E\n"})
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f8055p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f8056q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f8057r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Indication f8058s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f8059t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f8060u0;
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f8061w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Modifier modifier, boolean z10, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z11, Function0<Unit> function0, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f8055p0 = modifier;
            this.f8056q0 = z10;
            this.f8057r0 = mutableInteractionSource;
            this.f8058s0 = indication;
            this.f8059t0 = z11;
            this.f8060u0 = function0;
            this.v0 = function3;
            this.f8061w0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1237246709, iIntValue, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:237)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m458selectableO2vRcR0(this.f8055p0, this.f8056q0, this.f8057r0, this.f8058s0, this.f8059t0, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), this.f8060u0), 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                int i10 = ((this.f8061w0 >> 12) & 7168) | 432;
                composer2.startReplaceableGroup(-483455358);
                int i11 = i10 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i11 & 112) | (i11 & 14));
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
                this.v0.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i10 >> 6) & 112) | 6));
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

    /* JADX INFO: compiled from: Tab.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f8062p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f8063q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f8064r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f8065s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f8066t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ long f8067u0;
        public final /* synthetic */ long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f8068w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f8069x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f8070y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i10, int i11, long j10, long j11, MutableInteractionSource mutableInteractionSource, Modifier modifier, Function0 function0, Function3 function3, boolean z10, boolean z11) {
            super(2);
            this.f8062p0 = z10;
            this.f8063q0 = function0;
            this.f8064r0 = modifier;
            this.f8065s0 = z11;
            this.f8066t0 = mutableInteractionSource;
            this.f8067u0 = j10;
            this.v0 = j11;
            this.f8068w0 = function3;
            this.f8069x0 = i10;
            this.f8070y0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TabKt.m847TabEVJuX4I(this.f8062p0, this.f8063q0, this.f8064r0, this.f8065s0, this.f8066t0, this.f8067u0, this.v0, this.f8068w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8069x0 | 1), this.f8070y0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Tab.kt */
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8071p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f8072q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i10, Function2 function2) {
            super(2);
            this.f8071p0 = function2;
            this.f8072q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1729014781, iIntValue, -1, "androidx.compose.material.Tab.<anonymous>.<anonymous> (Tab.kt:101)");
                }
                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                TextKt.ProvideTextStyle(button.m3985copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3927getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & 256) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & 512) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & 1024) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & 32768) != 0 ? button.paragraphStyle.getTextAlign() : TextAlign.m4289boximpl(TextAlign.INSTANCE.m4296getCentere0LSkKk()), (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & 1048576) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & 4194304) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), this.f8071p0, composer2, (this.f8072q0 >> 9) & 112);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Tab.kt */
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f8073p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f8074q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f8075r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8076s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f8077t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(long j10, long j11, boolean z10, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f8073p0 = j10;
            this.f8074q0 = j11;
            this.f8075r0 = z10;
            this.f8076s0 = function2;
            this.f8077t0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TabKt.a(this.f8073p0, this.f8074q0, this.f8075r0, this.f8076s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8077t0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Tab.kt */
    public static final class i extends Lambda implements Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Color>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f8078p0 = new i(3);

        @Override // kotlin.jvm.functions.Function3
        public final FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer, Integer num) {
            Transition.Segment<Boolean> segment2 = segment;
            Composer composer2 = composer;
            int iD = androidx.datastore.preferences.protobuf.e.d(num, segment2, "$this$animateColor", composer2, -2120892502);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2120892502, iD, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:270)");
            }
            TweenSpec tweenSpecTween = segment2.isTransitioningTo(Boolean.FALSE, Boolean.TRUE) ? AnimationSpecKt.tween(150, 100, EasingKt.getLinearEasing()) : AnimationSpecKt.tween$default(100, 0, EasingKt.getLinearEasing(), 2, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return tweenSpecTween;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0134  */
    /* JADX WARN: Code duplicated, block: B:104:0x013f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0168  */
    /* JADX WARN: Code duplicated, block: B:117:0x016d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0170  */
    /* JADX WARN: Code duplicated, block: B:121:0x0182  */
    /* JADX WARN: Code duplicated, block: B:125:0x0193  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:129:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:131:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:137:0x024f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0261  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x0101  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:93:0x0110  */
    /* JADX WARN: Code duplicated, block: B:95:0x0115  */
    /* JADX WARN: Code duplicated, block: B:98:0x0121  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: LeadingIconTab-0nD-MI0, reason: not valid java name */
    public static final void m845LeadingIconTab0nDMI0(boolean z10, @NotNull Function0<Unit> onClick, @NotNull Function2<? super Composer, ? super Integer, Unit> text, @NotNull Function2<? super Composer, ? super Integer, Unit> icon, @Nullable Modifier modifier, boolean z11, @Nullable MutableInteractionSource mutableInteractionSource, long j10, long j11, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        boolean z12;
        int i14;
        int i15;
        MutableInteractionSource mutableInteractionSource2;
        int i16;
        int i17;
        long jM2518unboximpl;
        long jM2507copywmQWz5c$default;
        int i18;
        MutableInteractionSource mutableInteractionSource3;
        Object objRememberedValue;
        Modifier modifier3;
        long j12;
        long j13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i19;
        int i20;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1499861761);
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
            i12 |= composerStartRestartGroup.changedInstance(text) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(icon) ? 2048 : 1024;
        }
        int i21 = i11 & 16;
        if (i21 == 0) {
            if ((57344 & i10) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i13 = i11 & 32;
            if (i13 != 0) {
                if ((458752 & i10) == 0) {
                    z12 = z11;
                    if (composerStartRestartGroup.changed(z12)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 64;
                if (i15 != 0) {
                    if ((3670016 & i10) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i12 |= i16;
                    }
                    if ((29360128 & i10) == 0) {
                        int i22 = i12;
                        if ((i11 & 128) == 0 || !composerStartRestartGroup.changed(j10)) {
                            i20 = 4194304;
                        } else {
                            i20 = 8388608;
                        }
                        i17 = i22 | i20;
                    } else {
                        i17 = i12;
                    }
                    if ((i10 & 234881024) != 0) {
                        if ((i11 & 256) == 0 || !composerStartRestartGroup.changed(j11)) {
                            i19 = 33554432;
                        } else {
                            i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        }
                        i17 |= i19;
                    }
                    if ((i17 & 191739611) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i21 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                z12 = true;
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
                            }
                            if ((i11 & 128) != 0) {
                                jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                                i17 &= -29360129;
                            } else {
                                jM2518unboximpl = j10;
                            }
                            if ((i11 & 256) != 0) {
                                i18 = i17 & (-234881025);
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                jM2507copywmQWz5c$default = j11;
                                i18 = i17;
                            }
                            mutableInteractionSource3 = mutableInteractionSource2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 128) != 0) {
                                i17 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                i17 &= -234881025;
                            }
                            jM2518unboximpl = j10;
                            jM2507copywmQWz5c$default = j11;
                            z12 = z12;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i18 = i17;
                            modifier2 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1499861761, i18, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                        }
                        int i23 = i18;
                        int i24 = i23 >> 21;
                        a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new a(modifier2, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i18 >> 15) & 896) | 6, 2), z12, onClick, icon, i18, text)), composerStartRestartGroup, (i24 & 112) | (i24 & 14) | 3072 | ((i23 << 6) & 896));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        j12 = jM2518unboximpl;
                        j13 = jM2507copywmQWz5c$default;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z12 = z12;
                        j12 = j10;
                        j13 = j11;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, text, icon, z10, z12));
                }
                i12 |= 1572864;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((29360128 & i10) == 0) {
                    int i25 = i12;
                    if ((i11 & 128) == 0) {
                        i20 = 4194304;
                    } else {
                        i20 = 4194304;
                    }
                    i17 = i25 | i20;
                } else {
                    i17 = i12;
                }
                if ((i10 & 234881024) != 0) {
                    if ((i11 & 256) == 0) {
                        i19 = 33554432;
                    } else {
                        i19 = 33554432;
                    }
                    i17 |= i19;
                }
                if ((i17 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i18 = i17 & (-234881025);
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j11;
                            i18 = i17;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i18 = i17 & (-234881025);
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j11;
                            i18 = i17;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1499861761, i18, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                    }
                    int i26 = i18;
                    int i27 = i26 >> 21;
                    a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new a(modifier2, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i18 >> 15) & 896) | 6, 2), z12, onClick, icon, i18, text)), composerStartRestartGroup, (i27 & 112) | (i27 & 14) | 3072 | ((i26 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    j12 = jM2518unboximpl;
                    j13 = jM2507copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i18 = i17 & (-234881025);
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j11;
                            i18 = i17;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i18 = i17 & (-234881025);
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j11;
                            i18 = i17;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1499861761, i18, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                    }
                    int i28 = i18;
                    int i29 = i28 >> 21;
                    a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new a(modifier2, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i18 >> 15) & 896) | 6, 2), z12, onClick, icon, i18, text)), composerStartRestartGroup, (i29 & 112) | (i29 & 14) | 3072 | ((i28 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    j12 = jM2518unboximpl;
                    j13 = jM2507copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, text, icon, z10, z12));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z12 = z11;
            i15 = i11 & 64;
            if (i15 != 0) {
                if ((3670016 & i10) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                if ((29360128 & i10) == 0) {
                    int i210 = i12;
                    if ((i11 & 128) == 0) {
                        i20 = 4194304;
                    } else {
                        i20 = 4194304;
                    }
                    i17 = i210 | i20;
                } else {
                    i17 = i12;
                }
                if ((i10 & 234881024) != 0) {
                    if ((i11 & 256) == 0) {
                        i19 = 33554432;
                    } else {
                        i19 = 33554432;
                    }
                    i17 |= i19;
                }
                if ((i17 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i18 = i17 & (-234881025);
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j11;
                            i18 = i17;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i18 = i17 & (-234881025);
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j11;
                            i18 = i17;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1499861761, i18, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                    }
                    int i211 = i18;
                    int i212 = i211 >> 21;
                    a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new a(modifier2, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i18 >> 15) & 896) | 6, 2), z12, onClick, icon, i18, text)), composerStartRestartGroup, (i212 & 112) | (i212 & 14) | 3072 | ((i211 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    j12 = jM2518unboximpl;
                    j13 = jM2507copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i18 = i17 & (-234881025);
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j11;
                            i18 = i17;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i18 = i17 & (-234881025);
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j11;
                            i18 = i17;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1499861761, i18, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                    }
                    int i213 = i18;
                    int i214 = i213 >> 21;
                    a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new a(modifier2, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i18 >> 15) & 896) | 6, 2), z12, onClick, icon, i18, text)), composerStartRestartGroup, (i214 & 112) | (i214 & 14) | 3072 | ((i213 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    j12 = jM2518unboximpl;
                    j13 = jM2507copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, text, icon, z10, z12));
            }
            i12 |= 1572864;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((29360128 & i10) == 0) {
                int i215 = i12;
                if ((i11 & 128) == 0) {
                    i20 = 4194304;
                } else {
                    i20 = 4194304;
                }
                i17 = i215 | i20;
            } else {
                i17 = i12;
            }
            if ((i10 & 234881024) != 0) {
                if ((i11 & 256) == 0) {
                    i19 = 33554432;
                } else {
                    i19 = 33554432;
                }
                i17 |= i19;
            }
            if ((i17 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i18 = i17 & (-234881025);
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j11;
                        i18 = i17;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i18 = i17 & (-234881025);
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j11;
                        i18 = i17;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1499861761, i18, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                }
                int i216 = i18;
                int i217 = i216 >> 21;
                a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new a(modifier2, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i18 >> 15) & 896) | 6, 2), z12, onClick, icon, i18, text)), composerStartRestartGroup, (i217 & 112) | (i217 & 14) | 3072 | ((i216 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                mutableInteractionSource2 = mutableInteractionSource3;
                j12 = jM2518unboximpl;
                j13 = jM2507copywmQWz5c$default;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i18 = i17 & (-234881025);
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j11;
                        i18 = i17;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i18 = i17 & (-234881025);
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j11;
                        i18 = i17;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1499861761, i18, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                }
                int i218 = i18;
                int i219 = i218 >> 21;
                a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new a(modifier2, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i18 >> 15) & 896) | 6, 2), z12, onClick, icon, i18, text)), composerStartRestartGroup, (i219 & 112) | (i219 & 14) | 3072 | ((i218 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                mutableInteractionSource2 = mutableInteractionSource3;
                j12 = jM2518unboximpl;
                j13 = jM2507copywmQWz5c$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, text, icon, z10, z12));
        }
        i12 |= 24576;
        modifier2 = modifier;
        i13 = i11 & 32;
        if (i13 != 0) {
            if ((458752 & i10) == 0) {
                z12 = z11;
                if (composerStartRestartGroup.changed(z12)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i12 |= i14;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                if ((3670016 & i10) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                if ((29360128 & i10) == 0) {
                    int i2110 = i12;
                    if ((i11 & 128) == 0) {
                        i20 = 4194304;
                    } else {
                        i20 = 4194304;
                    }
                    i17 = i2110 | i20;
                } else {
                    i17 = i12;
                }
                if ((i10 & 234881024) != 0) {
                    if ((i11 & 256) == 0) {
                        i19 = 33554432;
                    } else {
                        i19 = 33554432;
                    }
                    i17 |= i19;
                }
                if ((i17 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i18 = i17 & (-234881025);
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j11;
                            i18 = i17;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i18 = i17 & (-234881025);
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j11;
                            i18 = i17;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1499861761, i18, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                    }
                    int i2111 = i18;
                    int i2112 = i2111 >> 21;
                    a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new a(modifier2, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i18 >> 15) & 896) | 6, 2), z12, onClick, icon, i18, text)), composerStartRestartGroup, (i2112 & 112) | (i2112 & 14) | 3072 | ((i2111 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    j12 = jM2518unboximpl;
                    j13 = jM2507copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i18 = i17 & (-234881025);
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j11;
                            i18 = i17;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i18 = i17 & (-234881025);
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j11;
                            i18 = i17;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1499861761, i18, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                    }
                    int i2113 = i18;
                    int i2114 = i2113 >> 21;
                    a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new a(modifier2, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i18 >> 15) & 896) | 6, 2), z12, onClick, icon, i18, text)), composerStartRestartGroup, (i2114 & 112) | (i2114 & 14) | 3072 | ((i2113 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    j12 = jM2518unboximpl;
                    j13 = jM2507copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, text, icon, z10, z12));
            }
            i12 |= 1572864;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((29360128 & i10) == 0) {
                int i2115 = i12;
                if ((i11 & 128) == 0) {
                    i20 = 4194304;
                } else {
                    i20 = 4194304;
                }
                i17 = i2115 | i20;
            } else {
                i17 = i12;
            }
            if ((i10 & 234881024) != 0) {
                if ((i11 & 256) == 0) {
                    i19 = 33554432;
                } else {
                    i19 = 33554432;
                }
                i17 |= i19;
            }
            if ((i17 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i18 = i17 & (-234881025);
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j11;
                        i18 = i17;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i18 = i17 & (-234881025);
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j11;
                        i18 = i17;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1499861761, i18, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                }
                int i2116 = i18;
                int i2117 = i2116 >> 21;
                a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new a(modifier2, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i18 >> 15) & 896) | 6, 2), z12, onClick, icon, i18, text)), composerStartRestartGroup, (i2117 & 112) | (i2117 & 14) | 3072 | ((i2116 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                mutableInteractionSource2 = mutableInteractionSource3;
                j12 = jM2518unboximpl;
                j13 = jM2507copywmQWz5c$default;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i18 = i17 & (-234881025);
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j11;
                        i18 = i17;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i18 = i17 & (-234881025);
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j11;
                        i18 = i17;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1499861761, i18, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                }
                int i2118 = i18;
                int i2119 = i2118 >> 21;
                a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new a(modifier2, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i18 >> 15) & 896) | 6, 2), z12, onClick, icon, i18, text)), composerStartRestartGroup, (i2119 & 112) | (i2119 & 14) | 3072 | ((i2118 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                mutableInteractionSource2 = mutableInteractionSource3;
                j12 = jM2518unboximpl;
                j13 = jM2507copywmQWz5c$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, text, icon, z10, z12));
        }
        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        z12 = z11;
        i15 = i11 & 64;
        if (i15 != 0) {
            if ((3670016 & i10) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
            if ((29360128 & i10) == 0) {
                int i21110 = i12;
                if ((i11 & 128) == 0) {
                    i20 = 4194304;
                } else {
                    i20 = 4194304;
                }
                i17 = i21110 | i20;
            } else {
                i17 = i12;
            }
            if ((i10 & 234881024) != 0) {
                if ((i11 & 256) == 0) {
                    i19 = 33554432;
                } else {
                    i19 = 33554432;
                }
                i17 |= i19;
            }
            if ((i17 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i18 = i17 & (-234881025);
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j11;
                        i18 = i17;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i18 = i17 & (-234881025);
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j11;
                        i18 = i17;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1499861761, i18, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                }
                int i21111 = i18;
                int i21112 = i21111 >> 21;
                a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new a(modifier2, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i18 >> 15) & 896) | 6, 2), z12, onClick, icon, i18, text)), composerStartRestartGroup, (i21112 & 112) | (i21112 & 14) | 3072 | ((i21111 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                mutableInteractionSource2 = mutableInteractionSource3;
                j12 = jM2518unboximpl;
                j13 = jM2507copywmQWz5c$default;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i18 = i17 & (-234881025);
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j11;
                        i18 = i17;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i18 = i17 & (-234881025);
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j11;
                        i18 = i17;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1499861761, i18, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
                }
                int i21113 = i18;
                int i21114 = i21113 >> 21;
                a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new a(modifier2, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i18 >> 15) & 896) | 6, 2), z12, onClick, icon, i18, text)), composerStartRestartGroup, (i21114 & 112) | (i21114 & 14) | 3072 | ((i21113 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                mutableInteractionSource2 = mutableInteractionSource3;
                j12 = jM2518unboximpl;
                j13 = jM2507copywmQWz5c$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, text, icon, z10, z12));
        }
        i12 |= 1572864;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((29360128 & i10) == 0) {
            int i21115 = i12;
            if ((i11 & 128) == 0) {
                i20 = 4194304;
            } else {
                i20 = 4194304;
            }
            i17 = i21115 | i20;
        } else {
            i17 = i12;
        }
        if ((i10 & 234881024) != 0) {
            if ((i11 & 256) == 0) {
                i19 = 33554432;
            } else {
                i19 = 33554432;
            }
            i17 |= i19;
        }
        if ((i17 & 191739611) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
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
                }
                if ((i11 & 128) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i17 &= -29360129;
                } else {
                    jM2518unboximpl = j10;
                }
                if ((i11 & 256) != 0) {
                    i18 = i17 & (-234881025);
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM2507copywmQWz5c$default = j11;
                    i18 = i17;
                }
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
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
                }
                if ((i11 & 128) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i17 &= -29360129;
                } else {
                    jM2518unboximpl = j10;
                }
                if ((i11 & 256) != 0) {
                    i18 = i17 & (-234881025);
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM2507copywmQWz5c$default = j11;
                    i18 = i17;
                }
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1499861761, i18, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
            }
            int i21116 = i18;
            int i21117 = i21116 >> 21;
            a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new a(modifier2, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i18 >> 15) & 896) | 6, 2), z12, onClick, icon, i18, text)), composerStartRestartGroup, (i21117 & 112) | (i21117 & 14) | 3072 | ((i21116 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            mutableInteractionSource2 = mutableInteractionSource3;
            j12 = jM2518unboximpl;
            j13 = jM2507copywmQWz5c$default;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
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
                }
                if ((i11 & 128) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i17 &= -29360129;
                } else {
                    jM2518unboximpl = j10;
                }
                if ((i11 & 256) != 0) {
                    i18 = i17 & (-234881025);
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM2507copywmQWz5c$default = j11;
                    i18 = i17;
                }
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
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
                }
                if ((i11 & 128) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i17 &= -29360129;
                } else {
                    jM2518unboximpl = j10;
                }
                if ((i11 & 256) != 0) {
                    i18 = i17 & (-234881025);
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM2507copywmQWz5c$default = j11;
                    i18 = i17;
                }
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1499861761, i18, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:151)");
            }
            int i21118 = i18;
            int i21119 = i21118 >> 21;
            a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 866677691, true, new a(modifier2, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i18 >> 15) & 896) | 6, 2), z12, onClick, icon, i18, text)), composerStartRestartGroup, (i21119 & 112) | (i21119 & 14) | 3072 | ((i21118 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            mutableInteractionSource2 = mutableInteractionSource3;
            j12 = jM2518unboximpl;
            j13 = jM2507copywmQWz5c$default;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, text, icon, z10, z12));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0132  */
    /* JADX WARN: Code duplicated, block: B:104:0x0142  */
    /* JADX WARN: Code duplicated, block: B:114:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0169  */
    /* JADX WARN: Code duplicated, block: B:116:0x016c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0170  */
    /* JADX WARN: Code duplicated, block: B:120:0x0173  */
    /* JADX WARN: Code duplicated, block: B:121:0x0176  */
    /* JADX WARN: Code duplicated, block: B:123:0x017a  */
    /* JADX WARN: Code duplicated, block: B:125:0x017e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0190  */
    /* JADX WARN: Code duplicated, block: B:129:0x019d  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:138:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:141:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:143:0x0204  */
    /* JADX WARN: Code duplicated, block: B:146:0x0261  */
    /* JADX WARN: Code duplicated, block: B:151:0x0277  */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    /* JADX WARN: Code duplicated, block: B:95:0x010d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0118  */
    /* JADX WARN: Instruction removed from duplicated block: B:102:0x0132, please report this as an issue */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Tab-0nD-MI0, reason: not valid java name */
    public static final void m846Tab0nDMI0(boolean z10, @NotNull Function0<Unit> onClick, @Nullable Modifier modifier, boolean z11, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable MutableInteractionSource mutableInteractionSource, long j10, long j11, @Nullable Composer composer, int i10, int i11) {
        int i12;
        int i13;
        boolean z12;
        int i14;
        int i15;
        int i16;
        int i17;
        Function2<? super Composer, ? super Integer, Unit> function4;
        int i18;
        int i19;
        int i20;
        long j12;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function5;
        MutableInteractionSource mutableInteractionSource2;
        long jM2518unboximpl;
        long jM2507copywmQWz5c$default;
        Function2<? super Composer, ? super Integer, Unit> function6;
        Function2<? super Composer, ? super Integer, Unit> function7;
        Object objRememberedValue;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function8;
        Function2<? super Composer, ? super Integer, Unit> function9;
        MutableInteractionSource mutableInteractionSource3;
        long j13;
        long j14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i21;
        int i22;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1486097588);
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
        int i23 = i11 & 4;
        if (i23 == 0) {
            if ((i10 & 896) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    z12 = z11;
                    if (composerStartRestartGroup.changed(z12)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 57344) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 32;
                    if (i17 != 0) {
                        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function4 = function3;
                    } else {
                        function4 = function3;
                        if ((i10 & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(function4)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                    }
                    i19 = i11 & 64;
                    if (i19 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    if ((i10 & 29360128) != 0) {
                        if ((i11 & 128) == 0 || !composerStartRestartGroup.changed(j10)) {
                            i22 = 4194304;
                        } else {
                            i22 = 8388608;
                        }
                        i12 |= i22;
                    }
                    if ((234881024 & i10) == 0) {
                        j12 = j11;
                        if ((i11 & 256) == 0 || !composerStartRestartGroup.changed(j12)) {
                            i21 = 33554432;
                        } else {
                            i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        }
                        i12 |= i21;
                    } else {
                        j12 = j11;
                    }
                    if ((191739611 & i12) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            }
                            if (i15 != 0) {
                                function5 = null;
                            } else {
                                function5 = function2;
                            }
                            if (i17 != 0) {
                                function4 = null;
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
                            if ((i11 & 128) != 0) {
                                jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                                i12 &= -29360129;
                            } else {
                                jM2518unboximpl = j10;
                            }
                            if ((i11 & 256) != 0) {
                                i12 &= -234881025;
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                jM2507copywmQWz5c$default = j12;
                            }
                            function6 = function4;
                            function7 = function5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 128) != 0) {
                                i12 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                i12 &= -234881025;
                            }
                            modifier2 = modifier;
                            mutableInteractionSource2 = mutableInteractionSource;
                            jM2518unboximpl = j10;
                            z12 = z12;
                            jM2507copywmQWz5c$default = j12;
                            function6 = function4;
                            function7 = function2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1486097588, i12, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                        }
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new g(i12, function7)) : null, function6));
                        int i24 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                        int i25 = i12 >> 6;
                        Function2<? super Composer, ? super Integer, Unit> function10 = function6;
                        Function2<? super Composer, ? super Integer, Unit> function11 = function7;
                        m847TabEVJuX4I(z10, onClick, modifier2, z12, mutableInteractionSource2, jM2518unboximpl, jM2507copywmQWz5c$default, composableLambda, composerStartRestartGroup, i24 | (57344 & i25) | (458752 & i25) | (i25 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        function8 = function11;
                        function9 = function10;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        j13 = jM2518unboximpl;
                        j14 = jM2507copywmQWz5c$default;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        j13 = j10;
                        z12 = z12;
                        j14 = j12;
                        function9 = function4;
                        modifier3 = modifier;
                        function8 = function2;
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(i10, i11, j13, j14, mutableInteractionSource3, modifier3, onClick, function8, function9, z10, z12));
                }
                i12 |= 24576;
                i17 = i11 & 32;
                if (i17 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function4 = function3;
                } else {
                    function4 = function3;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i10 & 29360128) != 0) {
                    if ((i11 & 128) == 0) {
                        i22 = 4194304;
                    } else {
                        i22 = 4194304;
                    }
                    i12 |= i22;
                }
                if ((234881024 & i10) == 0) {
                    j12 = j11;
                    if ((i11 & 256) == 0) {
                        i21 = 33554432;
                    } else {
                        i21 = 33554432;
                    }
                    i12 |= i21;
                } else {
                    j12 = j11;
                }
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
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
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j12;
                        }
                        function6 = function4;
                        function7 = function5;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
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
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j12;
                        }
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1486097588, i12, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                    }
                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new g(i12, function7)) : null, function6));
                    int i26 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i27 = i12 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function12 = function6;
                    Function2<? super Composer, ? super Integer, Unit> function13 = function7;
                    m847TabEVJuX4I(z10, onClick, modifier2, z12, mutableInteractionSource2, jM2518unboximpl, jM2507copywmQWz5c$default, composableLambda2, composerStartRestartGroup, i26 | (57344 & i27) | (458752 & i27) | (i27 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function13;
                    function9 = function12;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    j13 = jM2518unboximpl;
                    j14 = jM2507copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
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
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j12;
                        }
                        function6 = function4;
                        function7 = function5;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
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
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j12;
                        }
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1486097588, i12, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                    }
                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new g(i12, function7)) : null, function6));
                    int i28 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i29 = i12 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function14 = function6;
                    Function2<? super Composer, ? super Integer, Unit> function15 = function7;
                    m847TabEVJuX4I(z10, onClick, modifier2, z12, mutableInteractionSource2, jM2518unboximpl, jM2507copywmQWz5c$default, composableLambda3, composerStartRestartGroup, i28 | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function15;
                    function9 = function14;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    j13 = jM2518unboximpl;
                    j14 = jM2507copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(i10, i11, j13, j14, mutableInteractionSource3, modifier3, onClick, function8, function9, z10, z12));
            }
            i12 |= 3072;
            z12 = z11;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function4 = function3;
                } else {
                    function4 = function3;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i10 & 29360128) != 0) {
                    if ((i11 & 128) == 0) {
                        i22 = 4194304;
                    } else {
                        i22 = 4194304;
                    }
                    i12 |= i22;
                }
                if ((234881024 & i10) == 0) {
                    j12 = j11;
                    if ((i11 & 256) == 0) {
                        i21 = 33554432;
                    } else {
                        i21 = 33554432;
                    }
                    i12 |= i21;
                } else {
                    j12 = j11;
                }
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
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
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j12;
                        }
                        function6 = function4;
                        function7 = function5;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
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
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j12;
                        }
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1486097588, i12, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                    }
                    ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new g(i12, function7)) : null, function6));
                    int i210 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i211 = i12 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function16 = function6;
                    Function2<? super Composer, ? super Integer, Unit> function17 = function7;
                    m847TabEVJuX4I(z10, onClick, modifier2, z12, mutableInteractionSource2, jM2518unboximpl, jM2507copywmQWz5c$default, composableLambda4, composerStartRestartGroup, i210 | (57344 & i211) | (458752 & i211) | (i211 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function17;
                    function9 = function16;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    j13 = jM2518unboximpl;
                    j14 = jM2507copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
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
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j12;
                        }
                        function6 = function4;
                        function7 = function5;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
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
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j12;
                        }
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1486097588, i12, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                    }
                    ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new g(i12, function7)) : null, function6));
                    int i212 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i213 = i12 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function18 = function6;
                    Function2<? super Composer, ? super Integer, Unit> function19 = function7;
                    m847TabEVJuX4I(z10, onClick, modifier2, z12, mutableInteractionSource2, jM2518unboximpl, jM2507copywmQWz5c$default, composableLambda5, composerStartRestartGroup, i212 | (57344 & i213) | (458752 & i213) | (i213 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function19;
                    function9 = function18;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    j13 = jM2518unboximpl;
                    j14 = jM2507copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(i10, i11, j13, j14, mutableInteractionSource3, modifier3, onClick, function8, function9, z10, z12));
            }
            i12 |= 24576;
            i17 = i11 & 32;
            if (i17 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function4 = function3;
            } else {
                function4 = function3;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            i19 = i11 & 64;
            if (i19 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((i10 & 29360128) != 0) {
                if ((i11 & 128) == 0) {
                    i22 = 4194304;
                } else {
                    i22 = 4194304;
                }
                i12 |= i22;
            }
            if ((234881024 & i10) == 0) {
                j12 = j11;
                if ((i11 & 256) == 0) {
                    i21 = 33554432;
                } else {
                    i21 = 33554432;
                }
                i12 |= i21;
            } else {
                j12 = j11;
            }
            if ((191739611 & i12) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
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
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j12;
                    }
                    function6 = function4;
                    function7 = function5;
                } else {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
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
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j12;
                    }
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1486097588, i12, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                }
                ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new g(i12, function7)) : null, function6));
                int i214 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                int i215 = i12 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function110 = function6;
                Function2<? super Composer, ? super Integer, Unit> function111 = function7;
                m847TabEVJuX4I(z10, onClick, modifier2, z12, mutableInteractionSource2, jM2518unboximpl, jM2507copywmQWz5c$default, composableLambda6, composerStartRestartGroup, i214 | (57344 & i215) | (458752 & i215) | (i215 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function111;
                function9 = function110;
                mutableInteractionSource3 = mutableInteractionSource2;
                j13 = jM2518unboximpl;
                j14 = jM2507copywmQWz5c$default;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
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
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j12;
                    }
                    function6 = function4;
                    function7 = function5;
                } else {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
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
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j12;
                    }
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1486097588, i12, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                }
                ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new g(i12, function7)) : null, function6));
                int i216 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                int i217 = i12 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function112 = function6;
                Function2<? super Composer, ? super Integer, Unit> function113 = function7;
                m847TabEVJuX4I(z10, onClick, modifier2, z12, mutableInteractionSource2, jM2518unboximpl, jM2507copywmQWz5c$default, composableLambda7, composerStartRestartGroup, i216 | (57344 & i217) | (458752 & i217) | (i217 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function113;
                function9 = function112;
                mutableInteractionSource3 = mutableInteractionSource2;
                j13 = jM2518unboximpl;
                j14 = jM2507copywmQWz5c$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(i10, i11, j13, j14, mutableInteractionSource3, modifier3, onClick, function8, function9, z10, z12));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                z12 = z11;
                if (composerStartRestartGroup.changed(z12)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function4 = function3;
                } else {
                    function4 = function3;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i10 & 29360128) != 0) {
                    if ((i11 & 128) == 0) {
                        i22 = 4194304;
                    } else {
                        i22 = 4194304;
                    }
                    i12 |= i22;
                }
                if ((234881024 & i10) == 0) {
                    j12 = j11;
                    if ((i11 & 256) == 0) {
                        i21 = 33554432;
                    } else {
                        i21 = 33554432;
                    }
                    i12 |= i21;
                } else {
                    j12 = j11;
                }
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
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
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j12;
                        }
                        function6 = function4;
                        function7 = function5;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
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
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j12;
                        }
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1486097588, i12, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                    }
                    ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new g(i12, function7)) : null, function6));
                    int i218 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i219 = i12 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function114 = function6;
                    Function2<? super Composer, ? super Integer, Unit> function115 = function7;
                    m847TabEVJuX4I(z10, onClick, modifier2, z12, mutableInteractionSource2, jM2518unboximpl, jM2507copywmQWz5c$default, composableLambda8, composerStartRestartGroup, i218 | (57344 & i219) | (458752 & i219) | (i219 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function115;
                    function9 = function114;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    j13 = jM2518unboximpl;
                    j14 = jM2507copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
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
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j12;
                        }
                        function6 = function4;
                        function7 = function5;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
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
                        if ((i11 & 128) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -29360129;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 256) != 0) {
                            i12 &= -234881025;
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j12;
                        }
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1486097588, i12, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                    }
                    ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new g(i12, function7)) : null, function6));
                    int i2110 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i2111 = i12 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function116 = function6;
                    Function2<? super Composer, ? super Integer, Unit> function117 = function7;
                    m847TabEVJuX4I(z10, onClick, modifier2, z12, mutableInteractionSource2, jM2518unboximpl, jM2507copywmQWz5c$default, composableLambda9, composerStartRestartGroup, i2110 | (57344 & i2111) | (458752 & i2111) | (i2111 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function117;
                    function9 = function116;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    j13 = jM2518unboximpl;
                    j14 = jM2507copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(i10, i11, j13, j14, mutableInteractionSource3, modifier3, onClick, function8, function9, z10, z12));
            }
            i12 |= 24576;
            i17 = i11 & 32;
            if (i17 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function4 = function3;
            } else {
                function4 = function3;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            i19 = i11 & 64;
            if (i19 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((i10 & 29360128) != 0) {
                if ((i11 & 128) == 0) {
                    i22 = 4194304;
                } else {
                    i22 = 4194304;
                }
                i12 |= i22;
            }
            if ((234881024 & i10) == 0) {
                j12 = j11;
                if ((i11 & 256) == 0) {
                    i21 = 33554432;
                } else {
                    i21 = 33554432;
                }
                i12 |= i21;
            } else {
                j12 = j11;
            }
            if ((191739611 & i12) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
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
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j12;
                    }
                    function6 = function4;
                    function7 = function5;
                } else {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
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
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j12;
                    }
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1486097588, i12, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                }
                ComposableLambda composableLambda10 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new g(i12, function7)) : null, function6));
                int i2112 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                int i2113 = i12 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function118 = function6;
                Function2<? super Composer, ? super Integer, Unit> function119 = function7;
                m847TabEVJuX4I(z10, onClick, modifier2, z12, mutableInteractionSource2, jM2518unboximpl, jM2507copywmQWz5c$default, composableLambda10, composerStartRestartGroup, i2112 | (57344 & i2113) | (458752 & i2113) | (i2113 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function119;
                function9 = function118;
                mutableInteractionSource3 = mutableInteractionSource2;
                j13 = jM2518unboximpl;
                j14 = jM2507copywmQWz5c$default;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
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
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j12;
                    }
                    function6 = function4;
                    function7 = function5;
                } else {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
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
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j12;
                    }
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1486097588, i12, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                }
                ComposableLambda composableLambda11 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new g(i12, function7)) : null, function6));
                int i2114 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                int i2115 = i12 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function1110 = function6;
                Function2<? super Composer, ? super Integer, Unit> function1111 = function7;
                m847TabEVJuX4I(z10, onClick, modifier2, z12, mutableInteractionSource2, jM2518unboximpl, jM2507copywmQWz5c$default, composableLambda11, composerStartRestartGroup, i2114 | (57344 & i2115) | (458752 & i2115) | (i2115 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function1111;
                function9 = function1110;
                mutableInteractionSource3 = mutableInteractionSource2;
                j13 = jM2518unboximpl;
                j14 = jM2507copywmQWz5c$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(i10, i11, j13, j14, mutableInteractionSource3, modifier3, onClick, function8, function9, z10, z12));
        }
        i12 |= 3072;
        z12 = z11;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 57344) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 32;
            if (i17 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function4 = function3;
            } else {
                function4 = function3;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            i19 = i11 & 64;
            if (i19 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((i10 & 29360128) != 0) {
                if ((i11 & 128) == 0) {
                    i22 = 4194304;
                } else {
                    i22 = 4194304;
                }
                i12 |= i22;
            }
            if ((234881024 & i10) == 0) {
                j12 = j11;
                if ((i11 & 256) == 0) {
                    i21 = 33554432;
                } else {
                    i21 = 33554432;
                }
                i12 |= i21;
            } else {
                j12 = j11;
            }
            if ((191739611 & i12) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
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
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j12;
                    }
                    function6 = function4;
                    function7 = function5;
                } else {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
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
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j12;
                    }
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1486097588, i12, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                }
                ComposableLambda composableLambda12 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new g(i12, function7)) : null, function6));
                int i2116 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                int i2117 = i12 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function1112 = function6;
                Function2<? super Composer, ? super Integer, Unit> function1113 = function7;
                m847TabEVJuX4I(z10, onClick, modifier2, z12, mutableInteractionSource2, jM2518unboximpl, jM2507copywmQWz5c$default, composableLambda12, composerStartRestartGroup, i2116 | (57344 & i2117) | (458752 & i2117) | (i2117 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function1113;
                function9 = function1112;
                mutableInteractionSource3 = mutableInteractionSource2;
                j13 = jM2518unboximpl;
                j14 = jM2507copywmQWz5c$default;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
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
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j12;
                    }
                    function6 = function4;
                    function7 = function5;
                } else {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
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
                    if ((i11 & 128) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -29360129;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 256) != 0) {
                        i12 &= -234881025;
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j12;
                    }
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1486097588, i12, -1, "androidx.compose.material.Tab (Tab.kt:89)");
                }
                ComposableLambda composableLambda13 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new g(i12, function7)) : null, function6));
                int i2118 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                int i2119 = i12 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function1114 = function6;
                Function2<? super Composer, ? super Integer, Unit> function1115 = function7;
                m847TabEVJuX4I(z10, onClick, modifier2, z12, mutableInteractionSource2, jM2518unboximpl, jM2507copywmQWz5c$default, composableLambda13, composerStartRestartGroup, i2118 | (57344 & i2119) | (458752 & i2119) | (i2119 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function1115;
                function9 = function1114;
                mutableInteractionSource3 = mutableInteractionSource2;
                j13 = jM2518unboximpl;
                j14 = jM2507copywmQWz5c$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(i10, i11, j13, j14, mutableInteractionSource3, modifier3, onClick, function8, function9, z10, z12));
        }
        i12 |= 24576;
        i17 = i11 & 32;
        if (i17 != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function4 = function3;
        } else {
            function4 = function3;
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
        }
        i19 = i11 & 64;
        if (i19 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i20 = 1048576;
            } else {
                i20 = 524288;
            }
            i12 |= i20;
        }
        if ((i10 & 29360128) != 0) {
            if ((i11 & 128) == 0) {
                i22 = 4194304;
            } else {
                i22 = 4194304;
            }
            i12 |= i22;
        }
        if ((234881024 & i10) == 0) {
            j12 = j11;
            if ((i11 & 256) == 0) {
                i21 = 33554432;
            } else {
                i21 = 33554432;
            }
            i12 |= i21;
        } else {
            j12 = j11;
        }
        if ((191739611 & i12) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if (i15 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i17 != 0) {
                    function4 = null;
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
                if ((i11 & 128) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i12 &= -29360129;
                } else {
                    jM2518unboximpl = j10;
                }
                if ((i11 & 256) != 0) {
                    i12 &= -234881025;
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM2507copywmQWz5c$default = j12;
                }
                function6 = function4;
                function7 = function5;
            } else {
                if (i23 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if (i15 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i17 != 0) {
                    function4 = null;
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
                if ((i11 & 128) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i12 &= -29360129;
                } else {
                    jM2518unboximpl = j10;
                }
                if ((i11 & 256) != 0) {
                    i12 &= -234881025;
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM2507copywmQWz5c$default = j12;
                }
                function6 = function4;
                function7 = function5;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1486097588, i12, -1, "androidx.compose.material.Tab (Tab.kt:89)");
            }
            ComposableLambda composableLambda14 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new g(i12, function7)) : null, function6));
            int i21110 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
            int i21111 = i12 >> 6;
            Function2<? super Composer, ? super Integer, Unit> function1116 = function6;
            Function2<? super Composer, ? super Integer, Unit> function1117 = function7;
            m847TabEVJuX4I(z10, onClick, modifier2, z12, mutableInteractionSource2, jM2518unboximpl, jM2507copywmQWz5c$default, composableLambda14, composerStartRestartGroup, i21110 | (57344 & i21111) | (458752 & i21111) | (i21111 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            function8 = function1117;
            function9 = function1116;
            mutableInteractionSource3 = mutableInteractionSource2;
            j13 = jM2518unboximpl;
            j14 = jM2507copywmQWz5c$default;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if (i15 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i17 != 0) {
                    function4 = null;
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
                if ((i11 & 128) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i12 &= -29360129;
                } else {
                    jM2518unboximpl = j10;
                }
                if ((i11 & 256) != 0) {
                    i12 &= -234881025;
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM2507copywmQWz5c$default = j12;
                }
                function6 = function4;
                function7 = function5;
            } else {
                if (i23 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if (i15 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i17 != 0) {
                    function4 = null;
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
                if ((i11 & 128) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i12 &= -29360129;
                } else {
                    jM2518unboximpl = j10;
                }
                if ((i11 & 256) != 0) {
                    i12 &= -234881025;
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM2507copywmQWz5c$default = j12;
                }
                function6 = function4;
                function7 = function5;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1486097588, i12, -1, "androidx.compose.material.Tab (Tab.kt:89)");
            }
            ComposableLambda composableLambda15 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -178151495, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1729014781, true, new g(i12, function7)) : null, function6));
            int i21112 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
            int i21113 = i12 >> 6;
            Function2<? super Composer, ? super Integer, Unit> function1118 = function6;
            Function2<? super Composer, ? super Integer, Unit> function1119 = function7;
            m847TabEVJuX4I(z10, onClick, modifier2, z12, mutableInteractionSource2, jM2518unboximpl, jM2507copywmQWz5c$default, composableLambda15, composerStartRestartGroup, i21112 | (57344 & i21113) | (458752 & i21113) | (i21113 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            function8 = function1119;
            function9 = function1118;
            mutableInteractionSource3 = mutableInteractionSource2;
            j13 = jM2518unboximpl;
            j14 = jM2507copywmQWz5c$default;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(i10, i11, j13, j14, mutableInteractionSource3, modifier3, onClick, function8, function9, z10, z12));
    }

    /* JADX WARN: Code duplicated, block: B:105:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x013f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0144  */
    /* JADX WARN: Code duplicated, block: B:110:0x0147  */
    /* JADX WARN: Code duplicated, block: B:112:0x0159  */
    /* JADX WARN: Code duplicated, block: B:116:0x016a  */
    /* JADX WARN: Code duplicated, block: B:117:0x017b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0181  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:126:0x0208  */
    /* JADX WARN: Code duplicated, block: B:131:0x021a  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:92:0x0110  */
    /* JADX WARN: Code duplicated, block: B:94:0x011b  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Tab-EVJuX4I, reason: not valid java name */
    public static final void m847TabEVJuX4I(boolean z10, @NotNull Function0<Unit> onClick, @Nullable Modifier modifier, boolean z11, @Nullable MutableInteractionSource mutableInteractionSource, long j10, long j11, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        boolean z12;
        int i14;
        int i15;
        MutableInteractionSource mutableInteractionSource2;
        int i16;
        int i17;
        long jM2507copywmQWz5c$default;
        int i18;
        long jM2518unboximpl;
        Object objRememberedValue;
        int i19;
        boolean z13;
        Modifier modifier3;
        long j12;
        long j13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i20;
        int i21;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(713679175);
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
        int i22 = i11 & 4;
        if (i22 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    z12 = z11;
                    if (composerStartRestartGroup.changed(z12)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((57344 & i10) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((458752 & i10) == 0) {
                        int i23 = i12;
                        if ((i11 & 32) == 0 || !composerStartRestartGroup.changed(j10)) {
                            i21 = 65536;
                        } else {
                            i21 = 131072;
                        }
                        i17 = i23 | i21;
                    } else {
                        i17 = i12;
                    }
                    if ((i10 & 3670016) == 0) {
                        jM2507copywmQWz5c$default = j11;
                        if ((i11 & 64) == 0 || !composerStartRestartGroup.changed(jM2507copywmQWz5c$default)) {
                            i20 = 524288;
                        } else {
                            i20 = 1048576;
                        }
                        i17 |= i20;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                    if ((i11 & 128) != 0) {
                        if ((29360128 & i10) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i18 = 8388608;
                            } else {
                                i18 = 4194304;
                            }
                        }
                        if ((23967451 & i17) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    z12 = true;
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
                                }
                                if ((i11 & 32) != 0) {
                                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                                    i17 &= -458753;
                                } else {
                                    jM2518unboximpl = j10;
                                }
                                if ((i11 & 64) != 0) {
                                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i17 &= -3670017;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i11 & 32) != 0) {
                                    i17 &= -458753;
                                }
                                if ((i11 & 64) != 0) {
                                    i17 &= -3670017;
                                }
                                jM2518unboximpl = j10;
                            }
                            MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                            long j14 = jM2507copywmQWz5c$default;
                            i19 = i17;
                            Modifier modifier4 = modifier2;
                            z13 = z12;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                            }
                            int i24 = i19 >> 15;
                            a(jM2518unboximpl, j14, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier4, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i24 & 112) | (i24 & 14) | 3072 | ((i19 << 6) & 896));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            j12 = jM2518unboximpl;
                            j13 = j14;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            z13 = z12;
                            j13 = jM2507copywmQWz5c$default;
                            modifier3 = modifier2;
                            j12 = j10;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, content, z10, z13));
                    }
                    i18 = 12582912;
                    i17 |= i18;
                    if ((23967451 & i17) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                z12 = true;
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
                            }
                            if ((i11 & 32) != 0) {
                                jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                                i17 &= -458753;
                            } else {
                                jM2518unboximpl = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i17 &= -3670017;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                z12 = true;
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
                            }
                            if ((i11 & 32) != 0) {
                                jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                                i17 &= -458753;
                            } else {
                                jM2518unboximpl = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i17 &= -3670017;
                            }
                        }
                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                        long j15 = jM2507copywmQWz5c$default;
                        i19 = i17;
                        Modifier modifier5 = modifier2;
                        z13 = z12;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                        }
                        int i25 = i19 >> 15;
                        a(jM2518unboximpl, j15, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier5, z10, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i25 & 112) | (i25 & 14) | 3072 | ((i19 << 6) & 896));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        mutableInteractionSource2 = mutableInteractionSource4;
                        j12 = jM2518unboximpl;
                        j13 = j15;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                z12 = true;
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
                            }
                            if ((i11 & 32) != 0) {
                                jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                                i17 &= -458753;
                            } else {
                                jM2518unboximpl = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i17 &= -3670017;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                z12 = true;
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
                            }
                            if ((i11 & 32) != 0) {
                                jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                                i17 &= -458753;
                            } else {
                                jM2518unboximpl = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i17 &= -3670017;
                            }
                        }
                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource2;
                        long j16 = jM2507copywmQWz5c$default;
                        i19 = i17;
                        Modifier modifier6 = modifier2;
                        z13 = z12;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                        }
                        int i26 = i19 >> 15;
                        a(jM2518unboximpl, j16, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier6, z10, mutableInteractionSource5, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i26 & 112) | (i26 & 14) | 3072 | ((i19 << 6) & 896));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier6;
                        mutableInteractionSource2 = mutableInteractionSource5;
                        j12 = jM2518unboximpl;
                        j13 = j16;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, content, z10, z13));
                }
                i12 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((458752 & i10) == 0) {
                    int i27 = i12;
                    if ((i11 & 32) == 0) {
                        i21 = 65536;
                    } else {
                        i21 = 65536;
                    }
                    i17 = i27 | i21;
                } else {
                    i17 = i12;
                }
                if ((i10 & 3670016) == 0) {
                    jM2507copywmQWz5c$default = j11;
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i17 |= i20;
                } else {
                    jM2507copywmQWz5c$default = j11;
                }
                if ((i11 & 128) != 0) {
                    if ((29360128 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                    }
                    if ((23967451 & i17) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                z12 = true;
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
                            }
                            if ((i11 & 32) != 0) {
                                jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                                i17 &= -458753;
                            } else {
                                jM2518unboximpl = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i17 &= -3670017;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                z12 = true;
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
                            }
                            if ((i11 & 32) != 0) {
                                jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                                i17 &= -458753;
                            } else {
                                jM2518unboximpl = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i17 &= -3670017;
                            }
                        }
                        MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource2;
                        long j17 = jM2507copywmQWz5c$default;
                        i19 = i17;
                        Modifier modifier7 = modifier2;
                        z13 = z12;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                        }
                        int i28 = i19 >> 15;
                        a(jM2518unboximpl, j17, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier7, z10, mutableInteractionSource6, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i28 & 112) | (i28 & 14) | 3072 | ((i19 << 6) & 896));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier7;
                        mutableInteractionSource2 = mutableInteractionSource6;
                        j12 = jM2518unboximpl;
                        j13 = j17;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                z12 = true;
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
                            }
                            if ((i11 & 32) != 0) {
                                jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                                i17 &= -458753;
                            } else {
                                jM2518unboximpl = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i17 &= -3670017;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                z12 = true;
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
                            }
                            if ((i11 & 32) != 0) {
                                jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                                i17 &= -458753;
                            } else {
                                jM2518unboximpl = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i17 &= -3670017;
                            }
                        }
                        MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource2;
                        long j18 = jM2507copywmQWz5c$default;
                        i19 = i17;
                        Modifier modifier8 = modifier2;
                        z13 = z12;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                        }
                        int i29 = i19 >> 15;
                        a(jM2518unboximpl, j18, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier8, z10, mutableInteractionSource7, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i29 & 112) | (i29 & 14) | 3072 | ((i19 << 6) & 896));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier8;
                        mutableInteractionSource2 = mutableInteractionSource7;
                        j12 = jM2518unboximpl;
                        j13 = j18;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, content, z10, z13));
                }
                i18 = 12582912;
                i17 |= i18;
                if ((23967451 & i17) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    }
                    MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource2;
                    long j19 = jM2507copywmQWz5c$default;
                    i19 = i17;
                    Modifier modifier9 = modifier2;
                    z13 = z12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    int i210 = i19 >> 15;
                    a(jM2518unboximpl, j19, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier9, z10, mutableInteractionSource8, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i210 & 112) | (i210 & 14) | 3072 | ((i19 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier9;
                    mutableInteractionSource2 = mutableInteractionSource8;
                    j12 = jM2518unboximpl;
                    j13 = j19;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    }
                    MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource2;
                    long j110 = jM2507copywmQWz5c$default;
                    i19 = i17;
                    Modifier modifier10 = modifier2;
                    z13 = z12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    int i211 = i19 >> 15;
                    a(jM2518unboximpl, j110, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier10, z10, mutableInteractionSource9, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i211 & 112) | (i211 & 14) | 3072 | ((i19 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier10;
                    mutableInteractionSource2 = mutableInteractionSource9;
                    j12 = jM2518unboximpl;
                    j13 = j110;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, content, z10, z13));
            }
            i12 |= 3072;
            z12 = z11;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((458752 & i10) == 0) {
                    int i212 = i12;
                    if ((i11 & 32) == 0) {
                        i21 = 65536;
                    } else {
                        i21 = 65536;
                    }
                    i17 = i212 | i21;
                } else {
                    i17 = i12;
                }
                if ((i10 & 3670016) == 0) {
                    jM2507copywmQWz5c$default = j11;
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i17 |= i20;
                } else {
                    jM2507copywmQWz5c$default = j11;
                }
                if ((i11 & 128) != 0) {
                    if ((29360128 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                    }
                    if ((23967451 & i17) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                z12 = true;
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
                            }
                            if ((i11 & 32) != 0) {
                                jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                                i17 &= -458753;
                            } else {
                                jM2518unboximpl = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i17 &= -3670017;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                z12 = true;
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
                            }
                            if ((i11 & 32) != 0) {
                                jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                                i17 &= -458753;
                            } else {
                                jM2518unboximpl = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i17 &= -3670017;
                            }
                        }
                        MutableInteractionSource mutableInteractionSource10 = mutableInteractionSource2;
                        long j111 = jM2507copywmQWz5c$default;
                        i19 = i17;
                        Modifier modifier11 = modifier2;
                        z13 = z12;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                        }
                        int i213 = i19 >> 15;
                        a(jM2518unboximpl, j111, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier11, z10, mutableInteractionSource10, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i213 & 112) | (i213 & 14) | 3072 | ((i19 << 6) & 896));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11;
                        mutableInteractionSource2 = mutableInteractionSource10;
                        j12 = jM2518unboximpl;
                        j13 = j111;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                z12 = true;
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
                            }
                            if ((i11 & 32) != 0) {
                                jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                                i17 &= -458753;
                            } else {
                                jM2518unboximpl = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i17 &= -3670017;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                z12 = true;
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
                            }
                            if ((i11 & 32) != 0) {
                                jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                                i17 &= -458753;
                            } else {
                                jM2518unboximpl = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i17 &= -3670017;
                            }
                        }
                        MutableInteractionSource mutableInteractionSource11 = mutableInteractionSource2;
                        long j112 = jM2507copywmQWz5c$default;
                        i19 = i17;
                        Modifier modifier12 = modifier2;
                        z13 = z12;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                        }
                        int i214 = i19 >> 15;
                        a(jM2518unboximpl, j112, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier12, z10, mutableInteractionSource11, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i214 & 112) | (i214 & 14) | 3072 | ((i19 << 6) & 896));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier12;
                        mutableInteractionSource2 = mutableInteractionSource11;
                        j12 = jM2518unboximpl;
                        j13 = j112;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, content, z10, z13));
                }
                i18 = 12582912;
                i17 |= i18;
                if ((23967451 & i17) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    }
                    MutableInteractionSource mutableInteractionSource12 = mutableInteractionSource2;
                    long j113 = jM2507copywmQWz5c$default;
                    i19 = i17;
                    Modifier modifier13 = modifier2;
                    z13 = z12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    int i215 = i19 >> 15;
                    a(jM2518unboximpl, j113, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier13, z10, mutableInteractionSource12, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i215 & 112) | (i215 & 14) | 3072 | ((i19 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier13;
                    mutableInteractionSource2 = mutableInteractionSource12;
                    j12 = jM2518unboximpl;
                    j13 = j113;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    }
                    MutableInteractionSource mutableInteractionSource13 = mutableInteractionSource2;
                    long j114 = jM2507copywmQWz5c$default;
                    i19 = i17;
                    Modifier modifier14 = modifier2;
                    z13 = z12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    int i216 = i19 >> 15;
                    a(jM2518unboximpl, j114, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier14, z10, mutableInteractionSource13, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i216 & 112) | (i216 & 14) | 3072 | ((i19 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier14;
                    mutableInteractionSource2 = mutableInteractionSource13;
                    j12 = jM2518unboximpl;
                    j13 = j114;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, content, z10, z13));
            }
            i12 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((458752 & i10) == 0) {
                int i217 = i12;
                if ((i11 & 32) == 0) {
                    i21 = 65536;
                } else {
                    i21 = 65536;
                }
                i17 = i217 | i21;
            } else {
                i17 = i12;
            }
            if ((i10 & 3670016) == 0) {
                jM2507copywmQWz5c$default = j11;
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i17 |= i20;
            } else {
                jM2507copywmQWz5c$default = j11;
            }
            if ((i11 & 128) != 0) {
                if ((29360128 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                }
                if ((23967451 & i17) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    }
                    MutableInteractionSource mutableInteractionSource14 = mutableInteractionSource2;
                    long j115 = jM2507copywmQWz5c$default;
                    i19 = i17;
                    Modifier modifier15 = modifier2;
                    z13 = z12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    int i218 = i19 >> 15;
                    a(jM2518unboximpl, j115, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier15, z10, mutableInteractionSource14, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i218 & 112) | (i218 & 14) | 3072 | ((i19 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier15;
                    mutableInteractionSource2 = mutableInteractionSource14;
                    j12 = jM2518unboximpl;
                    j13 = j115;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    }
                    MutableInteractionSource mutableInteractionSource15 = mutableInteractionSource2;
                    long j116 = jM2507copywmQWz5c$default;
                    i19 = i17;
                    Modifier modifier16 = modifier2;
                    z13 = z12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    int i219 = i19 >> 15;
                    a(jM2518unboximpl, j116, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier16, z10, mutableInteractionSource15, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i219 & 112) | (i219 & 14) | 3072 | ((i19 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier16;
                    mutableInteractionSource2 = mutableInteractionSource15;
                    j12 = jM2518unboximpl;
                    j13 = j116;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, content, z10, z13));
            }
            i18 = 12582912;
            i17 |= i18;
            if ((23967451 & i17) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 32) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -458753;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i17 &= -3670017;
                    }
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 32) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -458753;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i17 &= -3670017;
                    }
                }
                MutableInteractionSource mutableInteractionSource16 = mutableInteractionSource2;
                long j117 = jM2507copywmQWz5c$default;
                i19 = i17;
                Modifier modifier17 = modifier2;
                z13 = z12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                }
                int i2110 = i19 >> 15;
                a(jM2518unboximpl, j117, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier17, z10, mutableInteractionSource16, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i2110 & 112) | (i2110 & 14) | 3072 | ((i19 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier17;
                mutableInteractionSource2 = mutableInteractionSource16;
                j12 = jM2518unboximpl;
                j13 = j117;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 32) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -458753;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i17 &= -3670017;
                    }
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 32) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -458753;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i17 &= -3670017;
                    }
                }
                MutableInteractionSource mutableInteractionSource17 = mutableInteractionSource2;
                long j118 = jM2507copywmQWz5c$default;
                i19 = i17;
                Modifier modifier18 = modifier2;
                z13 = z12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                }
                int i2111 = i19 >> 15;
                a(jM2518unboximpl, j118, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier18, z10, mutableInteractionSource17, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i2111 & 112) | (i2111 & 14) | 3072 | ((i19 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier18;
                mutableInteractionSource2 = mutableInteractionSource17;
                j12 = jM2518unboximpl;
                j13 = j118;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, content, z10, z13));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                z12 = z11;
                if (composerStartRestartGroup.changed(z12)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((458752 & i10) == 0) {
                    int i2112 = i12;
                    if ((i11 & 32) == 0) {
                        i21 = 65536;
                    } else {
                        i21 = 65536;
                    }
                    i17 = i2112 | i21;
                } else {
                    i17 = i12;
                }
                if ((i10 & 3670016) == 0) {
                    jM2507copywmQWz5c$default = j11;
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i17 |= i20;
                } else {
                    jM2507copywmQWz5c$default = j11;
                }
                if ((i11 & 128) != 0) {
                    if ((29360128 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                    }
                    if ((23967451 & i17) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                z12 = true;
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
                            }
                            if ((i11 & 32) != 0) {
                                jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                                i17 &= -458753;
                            } else {
                                jM2518unboximpl = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i17 &= -3670017;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                z12 = true;
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
                            }
                            if ((i11 & 32) != 0) {
                                jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                                i17 &= -458753;
                            } else {
                                jM2518unboximpl = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i17 &= -3670017;
                            }
                        }
                        MutableInteractionSource mutableInteractionSource18 = mutableInteractionSource2;
                        long j119 = jM2507copywmQWz5c$default;
                        i19 = i17;
                        Modifier modifier19 = modifier2;
                        z13 = z12;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                        }
                        int i2113 = i19 >> 15;
                        a(jM2518unboximpl, j119, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier19, z10, mutableInteractionSource18, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i2113 & 112) | (i2113 & 14) | 3072 | ((i19 << 6) & 896));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier19;
                        mutableInteractionSource2 = mutableInteractionSource18;
                        j12 = jM2518unboximpl;
                        j13 = j119;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                z12 = true;
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
                            }
                            if ((i11 & 32) != 0) {
                                jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                                i17 &= -458753;
                            } else {
                                jM2518unboximpl = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i17 &= -3670017;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                z12 = true;
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
                            }
                            if ((i11 & 32) != 0) {
                                jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                                i17 &= -458753;
                            } else {
                                jM2518unboximpl = j10;
                            }
                            if ((i11 & 64) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i17 &= -3670017;
                            }
                        }
                        MutableInteractionSource mutableInteractionSource19 = mutableInteractionSource2;
                        long j1110 = jM2507copywmQWz5c$default;
                        i19 = i17;
                        Modifier modifier110 = modifier2;
                        z13 = z12;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                        }
                        int i2114 = i19 >> 15;
                        a(jM2518unboximpl, j1110, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier110, z10, mutableInteractionSource19, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i2114 & 112) | (i2114 & 14) | 3072 | ((i19 << 6) & 896));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier110;
                        mutableInteractionSource2 = mutableInteractionSource19;
                        j12 = jM2518unboximpl;
                        j13 = j1110;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, content, z10, z13));
                }
                i18 = 12582912;
                i17 |= i18;
                if ((23967451 & i17) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    }
                    MutableInteractionSource mutableInteractionSource110 = mutableInteractionSource2;
                    long j1111 = jM2507copywmQWz5c$default;
                    i19 = i17;
                    Modifier modifier111 = modifier2;
                    z13 = z12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    int i2115 = i19 >> 15;
                    a(jM2518unboximpl, j1111, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier111, z10, mutableInteractionSource110, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i2115 & 112) | (i2115 & 14) | 3072 | ((i19 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier111;
                    mutableInteractionSource2 = mutableInteractionSource110;
                    j12 = jM2518unboximpl;
                    j13 = j1111;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    }
                    MutableInteractionSource mutableInteractionSource111 = mutableInteractionSource2;
                    long j1112 = jM2507copywmQWz5c$default;
                    i19 = i17;
                    Modifier modifier112 = modifier2;
                    z13 = z12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    int i2116 = i19 >> 15;
                    a(jM2518unboximpl, j1112, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier112, z10, mutableInteractionSource111, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i2116 & 112) | (i2116 & 14) | 3072 | ((i19 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier112;
                    mutableInteractionSource2 = mutableInteractionSource111;
                    j12 = jM2518unboximpl;
                    j13 = j1112;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, content, z10, z13));
            }
            i12 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((458752 & i10) == 0) {
                int i2117 = i12;
                if ((i11 & 32) == 0) {
                    i21 = 65536;
                } else {
                    i21 = 65536;
                }
                i17 = i2117 | i21;
            } else {
                i17 = i12;
            }
            if ((i10 & 3670016) == 0) {
                jM2507copywmQWz5c$default = j11;
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i17 |= i20;
            } else {
                jM2507copywmQWz5c$default = j11;
            }
            if ((i11 & 128) != 0) {
                if ((29360128 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                }
                if ((23967451 & i17) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    }
                    MutableInteractionSource mutableInteractionSource112 = mutableInteractionSource2;
                    long j1113 = jM2507copywmQWz5c$default;
                    i19 = i17;
                    Modifier modifier113 = modifier2;
                    z13 = z12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    int i2118 = i19 >> 15;
                    a(jM2518unboximpl, j1113, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier113, z10, mutableInteractionSource112, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i2118 & 112) | (i2118 & 14) | 3072 | ((i19 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier113;
                    mutableInteractionSource2 = mutableInteractionSource112;
                    j12 = jM2518unboximpl;
                    j13 = j1113;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    }
                    MutableInteractionSource mutableInteractionSource113 = mutableInteractionSource2;
                    long j1114 = jM2507copywmQWz5c$default;
                    i19 = i17;
                    Modifier modifier114 = modifier2;
                    z13 = z12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    int i2119 = i19 >> 15;
                    a(jM2518unboximpl, j1114, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier114, z10, mutableInteractionSource113, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i2119 & 112) | (i2119 & 14) | 3072 | ((i19 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier114;
                    mutableInteractionSource2 = mutableInteractionSource113;
                    j12 = jM2518unboximpl;
                    j13 = j1114;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, content, z10, z13));
            }
            i18 = 12582912;
            i17 |= i18;
            if ((23967451 & i17) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 32) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -458753;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i17 &= -3670017;
                    }
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 32) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -458753;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i17 &= -3670017;
                    }
                }
                MutableInteractionSource mutableInteractionSource114 = mutableInteractionSource2;
                long j1115 = jM2507copywmQWz5c$default;
                i19 = i17;
                Modifier modifier115 = modifier2;
                z13 = z12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                }
                int i21110 = i19 >> 15;
                a(jM2518unboximpl, j1115, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier115, z10, mutableInteractionSource114, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i21110 & 112) | (i21110 & 14) | 3072 | ((i19 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier115;
                mutableInteractionSource2 = mutableInteractionSource114;
                j12 = jM2518unboximpl;
                j13 = j1115;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 32) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -458753;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i17 &= -3670017;
                    }
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 32) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -458753;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i17 &= -3670017;
                    }
                }
                MutableInteractionSource mutableInteractionSource115 = mutableInteractionSource2;
                long j1116 = jM2507copywmQWz5c$default;
                i19 = i17;
                Modifier modifier116 = modifier2;
                z13 = z12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                }
                int i21111 = i19 >> 15;
                a(jM2518unboximpl, j1116, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier116, z10, mutableInteractionSource115, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i21111 & 112) | (i21111 & 14) | 3072 | ((i19 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier116;
                mutableInteractionSource2 = mutableInteractionSource115;
                j12 = jM2518unboximpl;
                j13 = j1116;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, content, z10, z13));
        }
        i12 |= 3072;
        z12 = z11;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((57344 & i10) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((458752 & i10) == 0) {
                int i21112 = i12;
                if ((i11 & 32) == 0) {
                    i21 = 65536;
                } else {
                    i21 = 65536;
                }
                i17 = i21112 | i21;
            } else {
                i17 = i12;
            }
            if ((i10 & 3670016) == 0) {
                jM2507copywmQWz5c$default = j11;
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i17 |= i20;
            } else {
                jM2507copywmQWz5c$default = j11;
            }
            if ((i11 & 128) != 0) {
                if ((29360128 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                }
                if ((23967451 & i17) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    }
                    MutableInteractionSource mutableInteractionSource116 = mutableInteractionSource2;
                    long j1117 = jM2507copywmQWz5c$default;
                    i19 = i17;
                    Modifier modifier117 = modifier2;
                    z13 = z12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    int i21113 = i19 >> 15;
                    a(jM2518unboximpl, j1117, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier117, z10, mutableInteractionSource116, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i21113 & 112) | (i21113 & 14) | 3072 | ((i19 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier117;
                    mutableInteractionSource2 = mutableInteractionSource116;
                    j12 = jM2518unboximpl;
                    j13 = j1117;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
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
                        }
                        if ((i11 & 32) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i17 &= -458753;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 64) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i17 &= -3670017;
                        }
                    }
                    MutableInteractionSource mutableInteractionSource117 = mutableInteractionSource2;
                    long j1118 = jM2507copywmQWz5c$default;
                    i19 = i17;
                    Modifier modifier118 = modifier2;
                    z13 = z12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                    }
                    int i21114 = i19 >> 15;
                    a(jM2518unboximpl, j1118, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier118, z10, mutableInteractionSource117, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i21114 & 112) | (i21114 & 14) | 3072 | ((i19 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier118;
                    mutableInteractionSource2 = mutableInteractionSource117;
                    j12 = jM2518unboximpl;
                    j13 = j1118;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, content, z10, z13));
            }
            i18 = 12582912;
            i17 |= i18;
            if ((23967451 & i17) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 32) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -458753;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i17 &= -3670017;
                    }
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 32) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -458753;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i17 &= -3670017;
                    }
                }
                MutableInteractionSource mutableInteractionSource118 = mutableInteractionSource2;
                long j1119 = jM2507copywmQWz5c$default;
                i19 = i17;
                Modifier modifier119 = modifier2;
                z13 = z12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                }
                int i21115 = i19 >> 15;
                a(jM2518unboximpl, j1119, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier119, z10, mutableInteractionSource118, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i21115 & 112) | (i21115 & 14) | 3072 | ((i19 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier119;
                mutableInteractionSource2 = mutableInteractionSource118;
                j12 = jM2518unboximpl;
                j13 = j1119;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 32) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -458753;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i17 &= -3670017;
                    }
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 32) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -458753;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i17 &= -3670017;
                    }
                }
                MutableInteractionSource mutableInteractionSource119 = mutableInteractionSource2;
                long j11110 = jM2507copywmQWz5c$default;
                i19 = i17;
                Modifier modifier1110 = modifier2;
                z13 = z12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                }
                int i21116 = i19 >> 15;
                a(jM2518unboximpl, j11110, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier1110, z10, mutableInteractionSource119, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i21116 & 112) | (i21116 & 14) | 3072 | ((i19 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1110;
                mutableInteractionSource2 = mutableInteractionSource119;
                j12 = jM2518unboximpl;
                j13 = j11110;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, content, z10, z13));
        }
        i12 |= 24576;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((458752 & i10) == 0) {
            int i21117 = i12;
            if ((i11 & 32) == 0) {
                i21 = 65536;
            } else {
                i21 = 65536;
            }
            i17 = i21117 | i21;
        } else {
            i17 = i12;
        }
        if ((i10 & 3670016) == 0) {
            jM2507copywmQWz5c$default = j11;
            if ((i11 & 64) == 0) {
                i20 = 524288;
            } else {
                i20 = 524288;
            }
            i17 |= i20;
        } else {
            jM2507copywmQWz5c$default = j11;
        }
        if ((i11 & 128) != 0) {
            if ((29360128 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
            }
            if ((23967451 & i17) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 32) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -458753;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i17 &= -3670017;
                    }
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 32) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -458753;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i17 &= -3670017;
                    }
                }
                MutableInteractionSource mutableInteractionSource1110 = mutableInteractionSource2;
                long j11111 = jM2507copywmQWz5c$default;
                i19 = i17;
                Modifier modifier1111 = modifier2;
                z13 = z12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                }
                int i21118 = i19 >> 15;
                a(jM2518unboximpl, j11111, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier1111, z10, mutableInteractionSource1110, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i21118 & 112) | (i21118 & 14) | 3072 | ((i19 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1111;
                mutableInteractionSource2 = mutableInteractionSource1110;
                j12 = jM2518unboximpl;
                j13 = j11111;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 32) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -458753;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i17 &= -3670017;
                    }
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
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
                    }
                    if ((i11 & 32) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i17 &= -458753;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 64) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i17 &= -3670017;
                    }
                }
                MutableInteractionSource mutableInteractionSource1111 = mutableInteractionSource2;
                long j11112 = jM2507copywmQWz5c$default;
                i19 = i17;
                Modifier modifier1112 = modifier2;
                z13 = z12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
                }
                int i21119 = i19 >> 15;
                a(jM2518unboximpl, j11112, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier1112, z10, mutableInteractionSource1111, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i21119 & 112) | (i21119 & 14) | 3072 | ((i19 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1112;
                mutableInteractionSource2 = mutableInteractionSource1111;
                j12 = jM2518unboximpl;
                j13 = j11112;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, content, z10, z13));
        }
        i18 = 12582912;
        i17 |= i18;
        if ((23967451 & i17) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
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
                }
                if ((i11 & 32) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i17 &= -458753;
                } else {
                    jM2518unboximpl = j10;
                }
                if ((i11 & 64) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i17 &= -3670017;
                }
            } else {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
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
                }
                if ((i11 & 32) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i17 &= -458753;
                } else {
                    jM2518unboximpl = j10;
                }
                if ((i11 & 64) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i17 &= -3670017;
                }
            }
            MutableInteractionSource mutableInteractionSource1112 = mutableInteractionSource2;
            long j11113 = jM2507copywmQWz5c$default;
            i19 = i17;
            Modifier modifier1113 = modifier2;
            z13 = z12;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
            }
            int i211110 = i19 >> 15;
            a(jM2518unboximpl, j11113, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier1113, z10, mutableInteractionSource1112, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i211110 & 112) | (i211110 & 14) | 3072 | ((i19 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier1113;
            mutableInteractionSource2 = mutableInteractionSource1112;
            j12 = jM2518unboximpl;
            j13 = j11113;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
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
                }
                if ((i11 & 32) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i17 &= -458753;
                } else {
                    jM2518unboximpl = j10;
                }
                if ((i11 & 64) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i17 &= -3670017;
                }
            } else {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
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
                }
                if ((i11 & 32) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i17 &= -458753;
                } else {
                    jM2518unboximpl = j10;
                }
                if ((i11 & 64) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i17 &= -3670017;
                }
            }
            MutableInteractionSource mutableInteractionSource1113 = mutableInteractionSource2;
            long j11114 = jM2507copywmQWz5c$default;
            i19 = i17;
            Modifier modifier1114 = modifier2;
            z13 = z12;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(713679175, i19, -1, "androidx.compose.material.Tab (Tab.kt:222)");
            }
            int i211111 = i19 >> 15;
            a(jM2518unboximpl, j11114, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1237246709, true, new e(modifier1114, z10, mutableInteractionSource1113, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i19 >> 9) & 896) | 6, 2), z13, onClick, content, i19)), composerStartRestartGroup, (i211111 & 112) | (i211111 & 14) | 3072 | ((i19 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier1114;
            mutableInteractionSource2 = mutableInteractionSource1113;
            j12 = jM2518unboximpl;
            j13 = j11114;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j12, j13, mutableInteractionSource2, modifier3, onClick, content, z10, z13));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void a(long j10, long j11, boolean z10, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-405571117);
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
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-405571117, i11, -1, "androidx.compose.material.TabTransition (Tab.kt:262)");
            }
            int i12 = i11 >> 6;
            Transition transitionUpdateTransition = TransitionKt.updateTransition(Boolean.valueOf(z10), (String) null, composerStartRestartGroup, i12 & 14, 2);
            composerStartRestartGroup.startReplaceableGroup(-1939694975);
            boolean zBooleanValue = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1445938070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:284)");
            }
            long j12 = zBooleanValue ? j10 : j11;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            ColorSpace colorSpaceM2512getColorSpaceimpl = Color.m2512getColorSpaceimpl(j12);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(colorSpaceM2512getColorSpaceimpl);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2512getColorSpaceimpl);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TwoWayConverter twoWayConverter = (TwoWayConverter) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            boolean zBooleanValue2 = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1445938070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:284)");
            }
            long j13 = zBooleanValue2 ? j10 : j11;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Color colorM2498boximpl = Color.m2498boximpl(j13);
            boolean zBooleanValue3 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1445938070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:284)");
            }
            long j14 = zBooleanValue3 ? j10 : j11;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM2498boximpl, Color.m2498boximpl(j14), i.f8078p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), twoWayConverter, "ColorAnimation", composerStartRestartGroup, 32768);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(Color.m2507copywmQWz5c$default(((Color) stateCreateTransitionAnimation.getValue()).m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2510getAlphaimpl(((Color) stateCreateTransitionAnimation.getValue()).m2518unboximpl())))}, function2, composerStartRestartGroup, (i12 & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h(j10, j11, z10, function2, i10));
    }

    public static final void access$TabBaselineLayout(Function2 function2, Function2 function3, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1249848471);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1249848471, i11, -1, "androidx.compose.material.TabBaselineLayout (Tab.kt:300)");
            }
            h0.j3 j3Var = new h0.j3(function2, function3);
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
            Updater.m2081setimpl(composerM2074constructorimpl, j3Var, companion2.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2141028452);
            if (function2 != null) {
                Modifier modifierM298paddingVpY3zN4$default = PaddingKt.m298paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), f8021c, 0.0f, 2, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM298paddingVpY3zN4$default);
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
                androidx.datastore.preferences.protobuf.q.e(i11 & 14, function2, composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(448373045);
            if (function3 != null) {
                Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, "icon");
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierLayoutId);
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
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
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
        scopeUpdateScopeEndRestartGroup.updateScope(new k3(i10, function2, function3));
    }

    public static final void access$placeTextAndIcon(Placeable.PlacementScope placementScope, Density density, Placeable placeable, Placeable placeable2, int i10, int i11, int i12, int i13) {
        int iMo413roundToPx0680j_4 = density.mo413roundToPx0680j_4(TabRowDefaults.INSTANCE.m855getIndicatorHeightD9Ej5fM()) + density.mo413roundToPx0680j_4(i12 == i13 ? f8022d : f8023e);
        int iMo412roundToPxR2X_6o = (density.mo412roundToPxR2X_6o(f8024f) + placeable2.getHeight()) - i12;
        int i14 = (i11 - i13) - iMo413roundToPx0680j_4;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, androidx.collection.a.a(placeable, i10, 2), i14, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, androidx.collection.a.a(placeable2, i10, 2), i14 - iMo412roundToPxR2X_6o, 0.0f, 4, null);
    }
}
