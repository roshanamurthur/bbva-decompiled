package androidx.compose.material3;

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
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
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
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Tab.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u008b\u0001\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0083\u0001\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a{\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\u0002\b\b¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/runtime/Composable;", "text", "icon", "Landroidx/compose/ui/graphics/Color;", "selectedContentColor", "unselectedContentColor", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Tab-wqdebIU", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Tab", "LeadingIconTab-wqdebIU", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "LeadingIconTab", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "content", "Tab-bogVsAg", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 6 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,445:1\n76#2:446\n76#2:454\n76#2:462\n76#2:493\n76#2:523\n76#2:561\n25#3:447\n25#3:455\n25#3:463\n36#3:475\n456#3,11:505\n460#3,13:535\n473#3,3:549\n460#3,13:573\n473#3,3:587\n467#3,3:592\n1114#4,6:448\n1114#4,6:456\n1114#4,6:464\n1057#4,3:476\n1060#4,3:480\n66#5,5:470\n71#5:479\n74#5:483\n857#6,5:484\n71#7,4:489\n75#7,11:494\n75#7:522\n76#7,11:524\n89#7:552\n75#7:560\n76#7,11:562\n89#7:590\n88#7:595\n67#8,6:516\n73#8:548\n77#8:553\n67#8,6:554\n73#8:586\n77#8:591\n76#9:596\n154#10:597\n154#10:598\n154#10:599\n154#10:600\n154#10:601\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt\n*L\n100#1:446\n162#1:454\n232#1:462\n308#1:493\n311#1:523\n318#1:561\n102#1:447\n164#1:455\n234#1:463\n274#1:475\n308#1:505,11\n311#1:535,13\n311#1:549,3\n318#1:573,13\n318#1:587,3\n308#1:592,3\n102#1:448,6\n164#1:456,6\n234#1:464,6\n274#1:476,3\n274#1:480,3\n274#1:470,5\n274#1:479\n274#1:483\n274#1:484,5\n308#1:489,4\n308#1:494,11\n311#1:522\n311#1:524,11\n311#1:552\n318#1:560\n318#1:562,11\n318#1:590\n308#1:595\n311#1:516,6\n311#1:548\n311#1:553\n318#1:554,6\n318#1:586\n318#1:591\n274#1:596\n425#1:597\n433#1:598\n437#1:599\n440#1:600\n444#1:601\n*E\n"})
public final class TabKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11923a = PrimaryNavigationTabTokens.INSTANCE.m1915getContainerHeightD9Ej5fM();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11924b = Dp.m4389constructorimpl(72);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f11925c = Dp.m4389constructorimpl(16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f11926d = Dp.m4389constructorimpl(14);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f11927e = Dp.m4389constructorimpl(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f11928f = TextUnitKt.getSp(20);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f11929g = Dp.m4389constructorimpl(8);

    /* JADX INFO: compiled from: Tab.kt */
    @SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$LeadingIconTab$2\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,445:1\n79#2,2:446\n81#2:474\n85#2:479\n75#3:448\n76#3,11:450\n89#3:478\n76#4:449\n460#5,13:461\n473#5,3:475\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$LeadingIconTab$2\n*L\n172#1:446,2\n172#1:474\n172#1:479\n172#1:448\n172#1:450,11\n172#1:478\n172#1:449\n172#1:461,13\n172#1:475,3\n*E\n"})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11930p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f11931q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f11932r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Indication f11933s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f11934t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f11935u0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f11936w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11937x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Modifier modifier, boolean z10, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z11, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, int i10, Function2<? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f11930p0 = modifier;
            this.f11931q0 = z10;
            this.f11932r0 = mutableInteractionSource;
            this.f11933s0 = indication;
            this.f11934t0 = z11;
            this.f11935u0 = function0;
            this.v0 = function2;
            this.f11936w0 = i10;
            this.f11937x0 = function3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-429037564, iIntValue, -1, "androidx.compose.material3.LeadingIconTab.<anonymous> (Tab.kt:170)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m298paddingVpY3zN4$default(SelectableKt.m458selectableO2vRcR0(SizeKt.m321height3ABfNKs(this.f11930p0, TabKt.f11923a), this.f11931q0, this.f11932r0, this.f11933s0, this.f11934t0, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), this.f11935u0), TabKt.f11925c, 0.0f, 2, null), 0.0f, 1, null);
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxWidth$default);
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
                int i10 = this.f11936w0;
                this.v0.invoke(composer2, Integer.valueOf((i10 >> 9) & 14));
                SpacerKt.Spacer(SizeKt.m332requiredWidth3ABfNKs(Modifier.INSTANCE, TabKt.f11929g), composer2, 6);
                TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont());
                TextKt.ProvideTextStyle(textStyleFromToken.m3981copyCXVQc50((3653631 & 1) != 0 ? textStyleFromToken.spanStyle.m3927getColor0d7_KjU() : 0L, (3653631 & 2) != 0 ? textStyleFromToken.spanStyle.getFontSize() : 0L, (3653631 & 4) != 0 ? textStyleFromToken.spanStyle.getFontWeight() : null, (3653631 & 8) != 0 ? textStyleFromToken.spanStyle.getFontStyle() : null, (3653631 & 16) != 0 ? textStyleFromToken.spanStyle.getFontSynthesis() : null, (3653631 & 32) != 0 ? textStyleFromToken.spanStyle.getFontFamily() : null, (3653631 & 64) != 0 ? textStyleFromToken.spanStyle.getFontFeatureSettings() : null, (3653631 & 128) != 0 ? textStyleFromToken.spanStyle.getLetterSpacing() : 0L, (3653631 & 256) != 0 ? textStyleFromToken.spanStyle.getBaselineShift() : null, (3653631 & 512) != 0 ? textStyleFromToken.spanStyle.getTextGeometricTransform() : null, (3653631 & 1024) != 0 ? textStyleFromToken.spanStyle.getLocaleList() : null, (3653631 & 2048) != 0 ? textStyleFromToken.spanStyle.getBackground() : 0L, (3653631 & 4096) != 0 ? textStyleFromToken.spanStyle.getTextDecoration() : null, (3653631 & 8192) != 0 ? textStyleFromToken.spanStyle.getShadow() : null, (3653631 & 16384) != 0 ? textStyleFromToken.paragraphStyle.getTextAlign() : TextAlign.m4289boximpl(TextAlign.INSTANCE.m4296getCentere0LSkKk()), (3653631 & 32768) != 0 ? textStyleFromToken.paragraphStyle.getTextDirection() : null, (3653631 & 65536) != 0 ? textStyleFromToken.paragraphStyle.getLineHeight() : 0L, (3653631 & 131072) != 0 ? textStyleFromToken.paragraphStyle.getTextIndent() : null, (3653631 & 262144) != 0 ? textStyleFromToken.platformStyle : null, (3653631 & 524288) != 0 ? textStyleFromToken.paragraphStyle.getLineHeightStyle() : null, (3653631 & 1048576) != 0 ? textStyleFromToken.paragraphStyle.getLineBreak() : null, (3653631 & 2097152) != 0 ? textStyleFromToken.paragraphStyle.getHyphens() : null), this.f11937x0, composer2, (i10 >> 3) & 112);
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
        public final /* synthetic */ boolean f11938p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f11939q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11940r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11941s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11942t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f11943u0;
        public final /* synthetic */ long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ long f11944w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f11945x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f11946y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, int i11, long j10, long j11, MutableInteractionSource mutableInteractionSource, Modifier modifier, Function0 function0, Function2 function2, Function2 function3, boolean z10, boolean z11) {
            super(2);
            this.f11938p0 = z10;
            this.f11939q0 = function0;
            this.f11940r0 = function2;
            this.f11941s0 = function3;
            this.f11942t0 = modifier;
            this.f11943u0 = z11;
            this.v0 = j10;
            this.f11944w0 = j11;
            this.f11945x0 = mutableInteractionSource;
            this.f11946y0 = i10;
            this.E0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TabKt.m1346LeadingIconTabwqdebIU(this.f11938p0, this.f11939q0, this.f11940r0, this.f11941s0, this.f11942t0, this.f11943u0, this.v0, this.f11944w0, this.f11945x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11946y0 | 1), this.E0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Tab.kt */
    public static final class c extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11947p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11948q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f11949r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, ComposableLambda composableLambda, Function2 function2) {
            super(3);
            this.f11947p0 = composableLambda;
            this.f11948q0 = function2;
            this.f11949r0 = i10;
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
                    ComposerKt.traceEventStart(1540996038, iIntValue, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:119)");
                }
                TabKt.access$TabBaselineLayout(this.f11947p0, this.f11948q0, composer2, (this.f11949r0 >> 12) & 112);
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
        public final /* synthetic */ boolean f11950p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f11951q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11952r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f11953s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11954t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11955u0;
        public final /* synthetic */ long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ long f11956w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f11957x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f11958y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10, int i11, long j10, long j11, MutableInteractionSource mutableInteractionSource, Modifier modifier, Function0 function0, Function2 function2, Function2 function3, boolean z10, boolean z11) {
            super(2);
            this.f11950p0 = z10;
            this.f11951q0 = function0;
            this.f11952r0 = modifier;
            this.f11953s0 = z11;
            this.f11954t0 = function2;
            this.f11955u0 = function3;
            this.v0 = j10;
            this.f11956w0 = j11;
            this.f11957x0 = mutableInteractionSource;
            this.f11958y0 = i10;
            this.E0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TabKt.m1348TabwqdebIU(this.f11950p0, this.f11951q0, this.f11952r0, this.f11953s0, this.f11954t0, this.f11955u0, this.v0, this.f11956w0, this.f11957x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11958y0 | 1), this.E0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Tab.kt */
    @SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$Tab$5\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,445:1\n78#2,2:446\n80#2:474\n84#2:479\n75#3:448\n76#3,11:450\n89#3:478\n76#4:449\n460#5,13:461\n473#5,3:475\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$Tab$5\n*L\n243#1:446,2\n243#1:474\n243#1:479\n243#1:448\n243#1:450,11\n243#1:478\n243#1:449\n243#1:461,13\n243#1:475,3\n*E\n"})
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11959p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f11960q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f11961r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Indication f11962s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f11963t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f11964u0;
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f11965w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Modifier modifier, boolean z10, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z11, Function0<Unit> function0, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f11959p0 = modifier;
            this.f11960q0 = z10;
            this.f11961r0 = mutableInteractionSource;
            this.f11962s0 = indication;
            this.f11963t0 = z11;
            this.f11964u0 = function0;
            this.v0 = function3;
            this.f11965w0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-551896140, iIntValue, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:241)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m458selectableO2vRcR0(this.f11959p0, this.f11960q0, this.f11961r0, this.f11962s0, this.f11963t0, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), this.f11964u0), 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                int i10 = ((this.f11965w0 >> 12) & 7168) | 432;
                composer2.startReplaceableGroup(-483455358);
                int i11 = i10 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, (i11 & 112) | (i11 & 14));
                Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxWidth$default);
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
        public final /* synthetic */ boolean f11966p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f11967q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11968r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f11969s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f11970t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ long f11971u0;
        public final /* synthetic */ MutableInteractionSource v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f11972w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f11973x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f11974y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i10, int i11, long j10, long j11, MutableInteractionSource mutableInteractionSource, Modifier modifier, Function0 function0, Function3 function3, boolean z10, boolean z11) {
            super(2);
            this.f11966p0 = z10;
            this.f11967q0 = function0;
            this.f11968r0 = modifier;
            this.f11969s0 = z11;
            this.f11970t0 = j10;
            this.f11971u0 = j11;
            this.v0 = mutableInteractionSource;
            this.f11972w0 = function3;
            this.f11973x0 = i10;
            this.f11974y0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TabKt.m1347TabbogVsAg(this.f11966p0, this.f11967q0, this.f11968r0, this.f11969s0, this.f11970t0, this.f11971u0, this.v0, this.f11972w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11973x0 | 1), this.f11974y0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Tab.kt */
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11975p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f11976q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i10, Function2 function2) {
            super(2);
            this.f11975p0 = function2;
            this.f11976q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(708874428, iIntValue, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:104)");
                }
                TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont());
                TextKt.ProvideTextStyle(textStyleFromToken.m3981copyCXVQc50((3653631 & 1) != 0 ? textStyleFromToken.spanStyle.m3927getColor0d7_KjU() : 0L, (3653631 & 2) != 0 ? textStyleFromToken.spanStyle.getFontSize() : 0L, (3653631 & 4) != 0 ? textStyleFromToken.spanStyle.getFontWeight() : null, (3653631 & 8) != 0 ? textStyleFromToken.spanStyle.getFontStyle() : null, (3653631 & 16) != 0 ? textStyleFromToken.spanStyle.getFontSynthesis() : null, (3653631 & 32) != 0 ? textStyleFromToken.spanStyle.getFontFamily() : null, (3653631 & 64) != 0 ? textStyleFromToken.spanStyle.getFontFeatureSettings() : null, (3653631 & 128) != 0 ? textStyleFromToken.spanStyle.getLetterSpacing() : 0L, (3653631 & 256) != 0 ? textStyleFromToken.spanStyle.getBaselineShift() : null, (3653631 & 512) != 0 ? textStyleFromToken.spanStyle.getTextGeometricTransform() : null, (3653631 & 1024) != 0 ? textStyleFromToken.spanStyle.getLocaleList() : null, (3653631 & 2048) != 0 ? textStyleFromToken.spanStyle.getBackground() : 0L, (3653631 & 4096) != 0 ? textStyleFromToken.spanStyle.getTextDecoration() : null, (3653631 & 8192) != 0 ? textStyleFromToken.spanStyle.getShadow() : null, (3653631 & 16384) != 0 ? textStyleFromToken.paragraphStyle.getTextAlign() : TextAlign.m4289boximpl(TextAlign.INSTANCE.m4296getCentere0LSkKk()), (3653631 & 32768) != 0 ? textStyleFromToken.paragraphStyle.getTextDirection() : null, (3653631 & 65536) != 0 ? textStyleFromToken.paragraphStyle.getLineHeight() : 0L, (3653631 & 131072) != 0 ? textStyleFromToken.paragraphStyle.getTextIndent() : null, (3653631 & 262144) != 0 ? textStyleFromToken.platformStyle : null, (3653631 & 524288) != 0 ? textStyleFromToken.paragraphStyle.getLineHeightStyle() : null, (3653631 & 1048576) != 0 ? textStyleFromToken.paragraphStyle.getLineBreak() : null, (3653631 & 2097152) != 0 ? textStyleFromToken.paragraphStyle.getHyphens() : null), this.f11975p0, composer2, (this.f11976q0 >> 9) & 112);
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
        public final /* synthetic */ long f11977p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f11978q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f11979r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11980s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f11981t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(long j10, long j11, boolean z10, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f11977p0 = j10;
            this.f11978q0 = j11;
            this.f11979r0 = z10;
            this.f11980s0 = function2;
            this.f11981t0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TabKt.a(this.f11977p0, this.f11978q0, this.f11979r0, this.f11980s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11981t0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Tab.kt */
    public static final class i extends Lambda implements Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Color>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f11982p0 = new i(3);

        @Override // kotlin.jvm.functions.Function3
        public final FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer, Integer num) {
            Transition.Segment<Boolean> segment2 = segment;
            Composer composer2 = composer;
            int iD = androidx.datastore.preferences.protobuf.e.d(num, segment2, "$this$animateColor", composer2, -899623535);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-899623535, iD, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:274)");
            }
            TweenSpec tweenSpecTween = segment2.isTransitioningTo(Boolean.FALSE, Boolean.TRUE) ? AnimationSpecKt.tween(150, 100, EasingKt.getLinearEasing()) : AnimationSpecKt.tween$default(100, 0, EasingKt.getLinearEasing(), 2, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return tweenSpecTween;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0138  */
    /* JADX WARN: Code duplicated, block: B:104:0x0143  */
    /* JADX WARN: Code duplicated, block: B:114:0x0169 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x016b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0170  */
    /* JADX WARN: Code duplicated, block: B:120:0x0175  */
    /* JADX WARN: Code duplicated, block: B:123:0x0189  */
    /* JADX WARN: Code duplicated, block: B:124:0x0191  */
    /* JADX WARN: Code duplicated, block: B:126:0x0197  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:131:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:137:0x0233  */
    /* JADX WARN: Code duplicated, block: B:142:0x0245  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:89:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x010d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0113  */
    /* JADX WARN: Code duplicated, block: B:94:0x0116  */
    /* JADX WARN: Code duplicated, block: B:98:0x0124  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: LeadingIconTab-wqdebIU, reason: not valid java name */
    public static final void m1346LeadingIconTabwqdebIU(boolean z10, @NotNull Function0<Unit> onClick, @NotNull Function2<? super Composer, ? super Integer, Unit> text, @NotNull Function2<? super Composer, ? super Integer, Unit> icon, @Nullable Modifier modifier, boolean z11, long j10, long j11, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        boolean z12;
        int i14;
        long jM2518unboximpl;
        int i15;
        int i16;
        int i17;
        int i18;
        long j12;
        MutableInteractionSource mutableInteractionSource2;
        long j13;
        long j14;
        Modifier modifier3;
        boolean z13;
        Object objRememberedValue;
        Modifier modifier4;
        long j15;
        long j16;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i19;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer composerStartRestartGroup = composer.startRestartGroup(-777316544);
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
        int i20 = i11 & 16;
        if (i20 == 0) {
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
                if ((3670016 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        jM2518unboximpl = j10;
                        int i21 = composerStartRestartGroup.changed(jM2518unboximpl) ? 1048576 : 524288;
                        i12 |= i21;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    i12 |= i21;
                } else {
                    jM2518unboximpl = j10;
                }
                if ((29360128 & i10) == 0) {
                    int i22 = i12;
                    if ((i11 & 128) == 0 || !composerStartRestartGroup.changed(j11)) {
                        i19 = 4194304;
                    } else {
                        i19 = 8388608;
                    }
                    i15 = i22 | i19;
                } else {
                    i15 = i12;
                }
                i16 = i11 & 256;
                if (i16 != 0) {
                    i15 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i17 = 33554432;
                    }
                    i15 |= i17;
                }
                if ((i15 & 191739611) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 64) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i15 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i18 = i15 & (-29360129);
                            j12 = jM2518unboximpl;
                        } else {
                            i18 = i15;
                            j12 = j11;
                        }
                        if (i16 != 0) {
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
                        j13 = jM2518unboximpl;
                        j14 = j12;
                        modifier3 = modifier2;
                        z13 = z12;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i11 & 64) != 0) {
                            i15 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i15 &= -29360129;
                        }
                        j14 = j11;
                        mutableInteractionSource2 = mutableInteractionSource;
                        z13 = z12;
                        j13 = jM2518unboximpl;
                        i18 = i15;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-777316544, i18, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:154)");
                    }
                    int i23 = i18;
                    int i24 = i23 >> 18;
                    a(j13, j14, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -429037564, true, new a(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, j13, composerStartRestartGroup, ((i18 >> 12) & 896) | 6, 2), z13, onClick, icon, i18, text)), composerStartRestartGroup, (i24 & 112) | (i24 & 14) | 3072 | ((i23 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    j15 = j13;
                    j16 = j14;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    z13 = z12;
                    j15 = jM2518unboximpl;
                    j16 = j11;
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, j15, j16, mutableInteractionSource3, modifier4, onClick, text, icon, z10, z13));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z12 = z11;
            if ((3670016 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    jM2518unboximpl = j10;
                    if (composerStartRestartGroup.changed(jM2518unboximpl)) {
                    }
                    i12 |= i21;
                } else {
                    jM2518unboximpl = j10;
                }
                i12 |= i21;
            } else {
                jM2518unboximpl = j10;
            }
            if ((29360128 & i10) == 0) {
                int i25 = i12;
                if ((i11 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i15 = i25 | i19;
            } else {
                i15 = i12;
            }
            i16 = i11 & 256;
            if (i16 != 0) {
                i15 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i17 = 33554432;
                }
                i15 |= i17;
            }
            if ((i15 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i15 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 = i15 & (-29360129);
                        j12 = jM2518unboximpl;
                    } else {
                        i18 = i15;
                        j12 = j11;
                    }
                    if (i16 != 0) {
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
                    j13 = jM2518unboximpl;
                    j14 = j12;
                    modifier3 = modifier2;
                    z13 = z12;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i15 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 = i15 & (-29360129);
                        j12 = jM2518unboximpl;
                    } else {
                        i18 = i15;
                        j12 = j11;
                    }
                    if (i16 != 0) {
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
                    j13 = jM2518unboximpl;
                    j14 = j12;
                    modifier3 = modifier2;
                    z13 = z12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-777316544, i18, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:154)");
                }
                int i26 = i18;
                int i27 = i26 >> 18;
                a(j13, j14, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -429037564, true, new a(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, j13, composerStartRestartGroup, ((i18 >> 12) & 896) | 6, 2), z13, onClick, icon, i18, text)), composerStartRestartGroup, (i27 & 112) | (i27 & 14) | 3072 | ((i26 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j15 = j13;
                j16 = j14;
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i15 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 = i15 & (-29360129);
                        j12 = jM2518unboximpl;
                    } else {
                        i18 = i15;
                        j12 = j11;
                    }
                    if (i16 != 0) {
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
                    j13 = jM2518unboximpl;
                    j14 = j12;
                    modifier3 = modifier2;
                    z13 = z12;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i15 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 = i15 & (-29360129);
                        j12 = jM2518unboximpl;
                    } else {
                        i18 = i15;
                        j12 = j11;
                    }
                    if (i16 != 0) {
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
                    j13 = jM2518unboximpl;
                    j14 = j12;
                    modifier3 = modifier2;
                    z13 = z12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-777316544, i18, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:154)");
                }
                int i28 = i18;
                int i29 = i28 >> 18;
                a(j13, j14, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -429037564, true, new a(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, j13, composerStartRestartGroup, ((i18 >> 12) & 896) | 6, 2), z13, onClick, icon, i18, text)), composerStartRestartGroup, (i29 & 112) | (i29 & 14) | 3072 | ((i28 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j15 = j13;
                j16 = j14;
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, j15, j16, mutableInteractionSource3, modifier4, onClick, text, icon, z10, z13));
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
            if ((3670016 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    jM2518unboximpl = j10;
                    if (composerStartRestartGroup.changed(jM2518unboximpl)) {
                    }
                    i12 |= i21;
                } else {
                    jM2518unboximpl = j10;
                }
                i12 |= i21;
            } else {
                jM2518unboximpl = j10;
            }
            if ((29360128 & i10) == 0) {
                int i210 = i12;
                if ((i11 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i15 = i210 | i19;
            } else {
                i15 = i12;
            }
            i16 = i11 & 256;
            if (i16 != 0) {
                i15 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i17 = 33554432;
                }
                i15 |= i17;
            }
            if ((i15 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i15 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 = i15 & (-29360129);
                        j12 = jM2518unboximpl;
                    } else {
                        i18 = i15;
                        j12 = j11;
                    }
                    if (i16 != 0) {
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
                    j13 = jM2518unboximpl;
                    j14 = j12;
                    modifier3 = modifier2;
                    z13 = z12;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i15 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 = i15 & (-29360129);
                        j12 = jM2518unboximpl;
                    } else {
                        i18 = i15;
                        j12 = j11;
                    }
                    if (i16 != 0) {
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
                    j13 = jM2518unboximpl;
                    j14 = j12;
                    modifier3 = modifier2;
                    z13 = z12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-777316544, i18, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:154)");
                }
                int i211 = i18;
                int i212 = i211 >> 18;
                a(j13, j14, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -429037564, true, new a(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, j13, composerStartRestartGroup, ((i18 >> 12) & 896) | 6, 2), z13, onClick, icon, i18, text)), composerStartRestartGroup, (i212 & 112) | (i212 & 14) | 3072 | ((i211 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j15 = j13;
                j16 = j14;
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i15 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 = i15 & (-29360129);
                        j12 = jM2518unboximpl;
                    } else {
                        i18 = i15;
                        j12 = j11;
                    }
                    if (i16 != 0) {
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
                    j13 = jM2518unboximpl;
                    j14 = j12;
                    modifier3 = modifier2;
                    z13 = z12;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 64) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i15 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i18 = i15 & (-29360129);
                        j12 = jM2518unboximpl;
                    } else {
                        i18 = i15;
                        j12 = j11;
                    }
                    if (i16 != 0) {
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
                    j13 = jM2518unboximpl;
                    j14 = j12;
                    modifier3 = modifier2;
                    z13 = z12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-777316544, i18, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:154)");
                }
                int i213 = i18;
                int i214 = i213 >> 18;
                a(j13, j14, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -429037564, true, new a(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, j13, composerStartRestartGroup, ((i18 >> 12) & 896) | 6, 2), z13, onClick, icon, i18, text)), composerStartRestartGroup, (i214 & 112) | (i214 & 14) | 3072 | ((i213 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j15 = j13;
                j16 = j14;
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, j15, j16, mutableInteractionSource3, modifier4, onClick, text, icon, z10, z13));
        }
        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        z12 = z11;
        if ((3670016 & i10) == 0) {
            if ((i11 & 64) == 0) {
                jM2518unboximpl = j10;
                if (composerStartRestartGroup.changed(jM2518unboximpl)) {
                }
                i12 |= i21;
            } else {
                jM2518unboximpl = j10;
            }
            i12 |= i21;
        } else {
            jM2518unboximpl = j10;
        }
        if ((29360128 & i10) == 0) {
            int i215 = i12;
            if ((i11 & 128) == 0) {
                i19 = 4194304;
            } else {
                i19 = 4194304;
            }
            i15 = i215 | i19;
        } else {
            i15 = i12;
        }
        i16 = i11 & 256;
        if (i16 != 0) {
            i15 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i17 = 33554432;
            }
            i15 |= i17;
        }
        if ((i15 & 191739611) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if ((i11 & 64) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i15 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    i18 = i15 & (-29360129);
                    j12 = jM2518unboximpl;
                } else {
                    i18 = i15;
                    j12 = j11;
                }
                if (i16 != 0) {
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
                j13 = jM2518unboximpl;
                j14 = j12;
                modifier3 = modifier2;
                z13 = z12;
            } else {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if ((i11 & 64) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i15 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    i18 = i15 & (-29360129);
                    j12 = jM2518unboximpl;
                } else {
                    i18 = i15;
                    j12 = j11;
                }
                if (i16 != 0) {
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
                j13 = jM2518unboximpl;
                j14 = j12;
                modifier3 = modifier2;
                z13 = z12;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-777316544, i18, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:154)");
            }
            int i216 = i18;
            int i217 = i216 >> 18;
            a(j13, j14, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -429037564, true, new a(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, j13, composerStartRestartGroup, ((i18 >> 12) & 896) | 6, 2), z13, onClick, icon, i18, text)), composerStartRestartGroup, (i217 & 112) | (i217 & 14) | 3072 | ((i216 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            j15 = j13;
            j16 = j14;
            mutableInteractionSource3 = mutableInteractionSource2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if ((i11 & 64) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i15 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    i18 = i15 & (-29360129);
                    j12 = jM2518unboximpl;
                } else {
                    i18 = i15;
                    j12 = j11;
                }
                if (i16 != 0) {
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
                j13 = jM2518unboximpl;
                j14 = j12;
                modifier3 = modifier2;
                z13 = z12;
            } else {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if ((i11 & 64) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i15 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    i18 = i15 & (-29360129);
                    j12 = jM2518unboximpl;
                } else {
                    i18 = i15;
                    j12 = j11;
                }
                if (i16 != 0) {
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
                j13 = jM2518unboximpl;
                j14 = j12;
                modifier3 = modifier2;
                z13 = z12;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-777316544, i18, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:154)");
            }
            int i218 = i18;
            int i219 = i218 >> 18;
            a(j13, j14, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -429037564, true, new a(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, j13, composerStartRestartGroup, ((i18 >> 12) & 896) | 6, 2), z13, onClick, icon, i18, text)), composerStartRestartGroup, (i219 & 112) | (i219 & 14) | 3072 | ((i218 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            j15 = j13;
            j16 = j14;
            mutableInteractionSource3 = mutableInteractionSource2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, i11, j15, j16, mutableInteractionSource3, modifier4, onClick, text, icon, z10, z13));
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0149  */
    /* JADX WARN: Code duplicated, block: B:107:0x014e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0153  */
    /* JADX WARN: Code duplicated, block: B:113:0x0167  */
    /* JADX WARN: Code duplicated, block: B:114:0x016f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0173  */
    /* JADX WARN: Code duplicated, block: B:118:0x0185  */
    /* JADX WARN: Code duplicated, block: B:121:0x019c  */
    /* JADX WARN: Code duplicated, block: B:124:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:127:0x0208  */
    /* JADX WARN: Code duplicated, block: B:132:0x0219  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x0103  */
    /* JADX WARN: Code duplicated, block: B:92:0x0119  */
    /* JADX WARN: Code duplicated, block: B:94:0x0124  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Tab-bogVsAg, reason: not valid java name */
    public static final void m1347TabbogVsAg(boolean z10, @NotNull Function0<Unit> onClick, @Nullable Modifier modifier, boolean z11, long j10, long j11, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        boolean z12;
        int i14;
        long jM2518unboximpl;
        int i15;
        int i16;
        MutableInteractionSource mutableInteractionSource2;
        int i17;
        int i18;
        long j12;
        MutableInteractionSource mutableInteractionSource3;
        int i19;
        long j13;
        Modifier modifier3;
        long j14;
        Object objRememberedValue;
        Modifier modifier4;
        long j15;
        long j16;
        MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i20;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-202735880);
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
        int i21 = i11 & 4;
        if (i21 == 0) {
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
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        jM2518unboximpl = j10;
                        int i22 = composerStartRestartGroup.changed(jM2518unboximpl) ? 16384 : 8192;
                        i12 |= i22;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    i12 |= i22;
                } else {
                    jM2518unboximpl = j10;
                }
                if ((458752 & i10) == 0) {
                    int i23 = i12;
                    if ((i11 & 32) == 0 || !composerStartRestartGroup.changed(j11)) {
                        i20 = 65536;
                    } else {
                        i20 = 131072;
                    }
                    i15 = i23 | i20;
                } else {
                    i15 = i12;
                }
                i16 = i11 & 64;
                if (i16 != 0) {
                    i15 |= 1572864;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i15 |= i17;
                    }
                }
                if ((i11 & 128) != 0) {
                    if ((29360128 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                    }
                    if ((23967451 & i15) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i21 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                                i15 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                i15 = (-458753) & i15;
                                j12 = jM2518unboximpl;
                            } else {
                                j12 = j11;
                            }
                            if (i16 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            i19 = i15;
                            j13 = j12;
                            modifier3 = modifier2;
                            j14 = jM2518unboximpl;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 16) != 0) {
                                i15 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                i15 &= -458753;
                            }
                            j13 = j11;
                            z12 = z12;
                            j14 = jM2518unboximpl;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i19 = i15;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:226)");
                        }
                        int i24 = i19;
                        int i25 = i24 >> 12;
                        a(j14, j13, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -551896140, true, new e(modifier3, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, j14, composerStartRestartGroup, ((i19 >> 6) & 896) | 6, 2), z12, onClick, content, i19)), composerStartRestartGroup, (i25 & 112) | (i25 & 14) | 3072 | ((i24 << 6) & 896));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        j15 = j14;
                        j16 = j13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        z12 = z12;
                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource2;
                        modifier4 = modifier2;
                        j15 = jM2518unboximpl;
                        mutableInteractionSource4 = mutableInteractionSource5;
                        j16 = j11;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j15, j16, mutableInteractionSource4, modifier4, onClick, content, z10, z12));
                }
                i18 = 12582912;
                i15 |= i18;
                if ((23967451 & i15) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM2518unboximpl;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        i19 = i15;
                        j13 = j12;
                        modifier3 = modifier2;
                        j14 = jM2518unboximpl;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM2518unboximpl;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        i19 = i15;
                        j13 = j12;
                        modifier3 = modifier2;
                        j14 = jM2518unboximpl;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:226)");
                    }
                    int i26 = i19;
                    int i27 = i26 >> 12;
                    a(j14, j13, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -551896140, true, new e(modifier3, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, j14, composerStartRestartGroup, ((i19 >> 6) & 896) | 6, 2), z12, onClick, content, i19)), composerStartRestartGroup, (i27 & 112) | (i27 & 14) | 3072 | ((i26 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    j15 = j14;
                    j16 = j13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM2518unboximpl;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        i19 = i15;
                        j13 = j12;
                        modifier3 = modifier2;
                        j14 = jM2518unboximpl;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM2518unboximpl;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        i19 = i15;
                        j13 = j12;
                        modifier3 = modifier2;
                        j14 = jM2518unboximpl;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:226)");
                    }
                    int i28 = i19;
                    int i29 = i28 >> 12;
                    a(j14, j13, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -551896140, true, new e(modifier3, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, j14, composerStartRestartGroup, ((i19 >> 6) & 896) | 6, 2), z12, onClick, content, i19)), composerStartRestartGroup, (i29 & 112) | (i29 & 14) | 3072 | ((i28 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    j15 = j14;
                    j16 = j13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j15, j16, mutableInteractionSource4, modifier4, onClick, content, z10, z12));
            }
            i12 |= 3072;
            z12 = z11;
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    jM2518unboximpl = j10;
                    if (composerStartRestartGroup.changed(jM2518unboximpl)) {
                    }
                    i12 |= i22;
                } else {
                    jM2518unboximpl = j10;
                }
                i12 |= i22;
            } else {
                jM2518unboximpl = j10;
            }
            if ((458752 & i10) == 0) {
                int i210 = i12;
                if ((i11 & 32) == 0) {
                    i20 = 65536;
                } else {
                    i20 = 65536;
                }
                i15 = i210 | i20;
            } else {
                i15 = i12;
            }
            i16 = i11 & 64;
            if (i16 != 0) {
                i15 |= 1572864;
                mutableInteractionSource2 = mutableInteractionSource;
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i15 |= i17;
                }
            }
            if ((i11 & 128) != 0) {
                if ((29360128 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                }
                if ((23967451 & i15) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM2518unboximpl;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        i19 = i15;
                        j13 = j12;
                        modifier3 = modifier2;
                        j14 = jM2518unboximpl;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM2518unboximpl;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        i19 = i15;
                        j13 = j12;
                        modifier3 = modifier2;
                        j14 = jM2518unboximpl;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:226)");
                    }
                    int i211 = i19;
                    int i212 = i211 >> 12;
                    a(j14, j13, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -551896140, true, new e(modifier3, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, j14, composerStartRestartGroup, ((i19 >> 6) & 896) | 6, 2), z12, onClick, content, i19)), composerStartRestartGroup, (i212 & 112) | (i212 & 14) | 3072 | ((i211 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    j15 = j14;
                    j16 = j13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM2518unboximpl;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        i19 = i15;
                        j13 = j12;
                        modifier3 = modifier2;
                        j14 = jM2518unboximpl;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM2518unboximpl;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        i19 = i15;
                        j13 = j12;
                        modifier3 = modifier2;
                        j14 = jM2518unboximpl;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:226)");
                    }
                    int i213 = i19;
                    int i214 = i213 >> 12;
                    a(j14, j13, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -551896140, true, new e(modifier3, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, j14, composerStartRestartGroup, ((i19 >> 6) & 896) | 6, 2), z12, onClick, content, i19)), composerStartRestartGroup, (i214 & 112) | (i214 & 14) | 3072 | ((i213 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    j15 = j14;
                    j16 = j13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j15, j16, mutableInteractionSource4, modifier4, onClick, content, z10, z12));
            }
            i18 = 12582912;
            i15 |= i18;
            if ((23967451 & i15) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM2518unboximpl;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    i19 = i15;
                    j13 = j12;
                    modifier3 = modifier2;
                    j14 = jM2518unboximpl;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM2518unboximpl;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    i19 = i15;
                    j13 = j12;
                    modifier3 = modifier2;
                    j14 = jM2518unboximpl;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:226)");
                }
                int i215 = i19;
                int i216 = i215 >> 12;
                a(j14, j13, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -551896140, true, new e(modifier3, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, j14, composerStartRestartGroup, ((i19 >> 6) & 896) | 6, 2), z12, onClick, content, i19)), composerStartRestartGroup, (i216 & 112) | (i216 & 14) | 3072 | ((i215 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j15 = j14;
                j16 = j13;
                mutableInteractionSource4 = mutableInteractionSource3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM2518unboximpl;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    i19 = i15;
                    j13 = j12;
                    modifier3 = modifier2;
                    j14 = jM2518unboximpl;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM2518unboximpl;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    i19 = i15;
                    j13 = j12;
                    modifier3 = modifier2;
                    j14 = jM2518unboximpl;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:226)");
                }
                int i217 = i19;
                int i218 = i217 >> 12;
                a(j14, j13, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -551896140, true, new e(modifier3, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, j14, composerStartRestartGroup, ((i19 >> 6) & 896) | 6, 2), z12, onClick, content, i19)), composerStartRestartGroup, (i218 & 112) | (i218 & 14) | 3072 | ((i217 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j15 = j14;
                j16 = j13;
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j15, j16, mutableInteractionSource4, modifier4, onClick, content, z10, z12));
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
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    jM2518unboximpl = j10;
                    if (composerStartRestartGroup.changed(jM2518unboximpl)) {
                    }
                    i12 |= i22;
                } else {
                    jM2518unboximpl = j10;
                }
                i12 |= i22;
            } else {
                jM2518unboximpl = j10;
            }
            if ((458752 & i10) == 0) {
                int i219 = i12;
                if ((i11 & 32) == 0) {
                    i20 = 65536;
                } else {
                    i20 = 65536;
                }
                i15 = i219 | i20;
            } else {
                i15 = i12;
            }
            i16 = i11 & 64;
            if (i16 != 0) {
                i15 |= 1572864;
                mutableInteractionSource2 = mutableInteractionSource;
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i15 |= i17;
                }
            }
            if ((i11 & 128) != 0) {
                if ((29360128 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                }
                if ((23967451 & i15) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM2518unboximpl;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        i19 = i15;
                        j13 = j12;
                        modifier3 = modifier2;
                        j14 = jM2518unboximpl;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM2518unboximpl;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        i19 = i15;
                        j13 = j12;
                        modifier3 = modifier2;
                        j14 = jM2518unboximpl;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:226)");
                    }
                    int i2110 = i19;
                    int i2111 = i2110 >> 12;
                    a(j14, j13, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -551896140, true, new e(modifier3, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, j14, composerStartRestartGroup, ((i19 >> 6) & 896) | 6, 2), z12, onClick, content, i19)), composerStartRestartGroup, (i2111 & 112) | (i2111 & 14) | 3072 | ((i2110 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    j15 = j14;
                    j16 = j13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM2518unboximpl;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        i19 = i15;
                        j13 = j12;
                        modifier3 = modifier2;
                        j14 = jM2518unboximpl;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i15 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i15 = (-458753) & i15;
                            j12 = jM2518unboximpl;
                        } else {
                            j12 = j11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        i19 = i15;
                        j13 = j12;
                        modifier3 = modifier2;
                        j14 = jM2518unboximpl;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:226)");
                    }
                    int i2112 = i19;
                    int i2113 = i2112 >> 12;
                    a(j14, j13, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -551896140, true, new e(modifier3, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, j14, composerStartRestartGroup, ((i19 >> 6) & 896) | 6, 2), z12, onClick, content, i19)), composerStartRestartGroup, (i2113 & 112) | (i2113 & 14) | 3072 | ((i2112 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    j15 = j14;
                    j16 = j13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j15, j16, mutableInteractionSource4, modifier4, onClick, content, z10, z12));
            }
            i18 = 12582912;
            i15 |= i18;
            if ((23967451 & i15) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM2518unboximpl;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    i19 = i15;
                    j13 = j12;
                    modifier3 = modifier2;
                    j14 = jM2518unboximpl;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM2518unboximpl;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    i19 = i15;
                    j13 = j12;
                    modifier3 = modifier2;
                    j14 = jM2518unboximpl;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:226)");
                }
                int i2114 = i19;
                int i2115 = i2114 >> 12;
                a(j14, j13, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -551896140, true, new e(modifier3, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, j14, composerStartRestartGroup, ((i19 >> 6) & 896) | 6, 2), z12, onClick, content, i19)), composerStartRestartGroup, (i2115 & 112) | (i2115 & 14) | 3072 | ((i2114 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j15 = j14;
                j16 = j13;
                mutableInteractionSource4 = mutableInteractionSource3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM2518unboximpl;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    i19 = i15;
                    j13 = j12;
                    modifier3 = modifier2;
                    j14 = jM2518unboximpl;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM2518unboximpl;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    i19 = i15;
                    j13 = j12;
                    modifier3 = modifier2;
                    j14 = jM2518unboximpl;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:226)");
                }
                int i2116 = i19;
                int i2117 = i2116 >> 12;
                a(j14, j13, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -551896140, true, new e(modifier3, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, j14, composerStartRestartGroup, ((i19 >> 6) & 896) | 6, 2), z12, onClick, content, i19)), composerStartRestartGroup, (i2117 & 112) | (i2117 & 14) | 3072 | ((i2116 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j15 = j14;
                j16 = j13;
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j15, j16, mutableInteractionSource4, modifier4, onClick, content, z10, z12));
        }
        i12 |= 3072;
        z12 = z11;
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                jM2518unboximpl = j10;
                if (composerStartRestartGroup.changed(jM2518unboximpl)) {
                }
                i12 |= i22;
            } else {
                jM2518unboximpl = j10;
            }
            i12 |= i22;
        } else {
            jM2518unboximpl = j10;
        }
        if ((458752 & i10) == 0) {
            int i2118 = i12;
            if ((i11 & 32) == 0) {
                i20 = 65536;
            } else {
                i20 = 65536;
            }
            i15 = i2118 | i20;
        } else {
            i15 = i12;
        }
        i16 = i11 & 64;
        if (i16 != 0) {
            i15 |= 1572864;
            mutableInteractionSource2 = mutableInteractionSource;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i15 |= i17;
            }
        }
        if ((i11 & 128) != 0) {
            if ((29360128 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
            }
            if ((23967451 & i15) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM2518unboximpl;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    i19 = i15;
                    j13 = j12;
                    modifier3 = modifier2;
                    j14 = jM2518unboximpl;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM2518unboximpl;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    i19 = i15;
                    j13 = j12;
                    modifier3 = modifier2;
                    j14 = jM2518unboximpl;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:226)");
                }
                int i2119 = i19;
                int i21110 = i2119 >> 12;
                a(j14, j13, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -551896140, true, new e(modifier3, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, j14, composerStartRestartGroup, ((i19 >> 6) & 896) | 6, 2), z12, onClick, content, i19)), composerStartRestartGroup, (i21110 & 112) | (i21110 & 14) | 3072 | ((i2119 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j15 = j14;
                j16 = j13;
                mutableInteractionSource4 = mutableInteractionSource3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM2518unboximpl;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    i19 = i15;
                    j13 = j12;
                    modifier3 = modifier2;
                    j14 = jM2518unboximpl;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i15 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i15 = (-458753) & i15;
                        j12 = jM2518unboximpl;
                    } else {
                        j12 = j11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    i19 = i15;
                    j13 = j12;
                    modifier3 = modifier2;
                    j14 = jM2518unboximpl;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:226)");
                }
                int i21111 = i19;
                int i21112 = i21111 >> 12;
                a(j14, j13, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -551896140, true, new e(modifier3, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, j14, composerStartRestartGroup, ((i19 >> 6) & 896) | 6, 2), z12, onClick, content, i19)), composerStartRestartGroup, (i21112 & 112) | (i21112 & 14) | 3072 | ((i21111 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j15 = j14;
                j16 = j13;
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j15, j16, mutableInteractionSource4, modifier4, onClick, content, z10, z12));
        }
        i18 = 12582912;
        i15 |= i18;
        if ((23967451 & i15) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if ((i11 & 16) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i15 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i15 = (-458753) & i15;
                    j12 = jM2518unboximpl;
                } else {
                    j12 = j11;
                }
                if (i16 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                i19 = i15;
                j13 = j12;
                modifier3 = modifier2;
                j14 = jM2518unboximpl;
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if ((i11 & 16) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i15 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i15 = (-458753) & i15;
                    j12 = jM2518unboximpl;
                } else {
                    j12 = j11;
                }
                if (i16 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                i19 = i15;
                j13 = j12;
                modifier3 = modifier2;
                j14 = jM2518unboximpl;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:226)");
            }
            int i21113 = i19;
            int i21114 = i21113 >> 12;
            a(j14, j13, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -551896140, true, new e(modifier3, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, j14, composerStartRestartGroup, ((i19 >> 6) & 896) | 6, 2), z12, onClick, content, i19)), composerStartRestartGroup, (i21114 & 112) | (i21114 & 14) | 3072 | ((i21113 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            j15 = j14;
            j16 = j13;
            mutableInteractionSource4 = mutableInteractionSource3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if ((i11 & 16) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i15 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i15 = (-458753) & i15;
                    j12 = jM2518unboximpl;
                } else {
                    j12 = j11;
                }
                if (i16 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                i19 = i15;
                j13 = j12;
                modifier3 = modifier2;
                j14 = jM2518unboximpl;
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if ((i11 & 16) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i15 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i15 = (-458753) & i15;
                    j12 = jM2518unboximpl;
                } else {
                    j12 = j11;
                }
                if (i16 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                i19 = i15;
                j13 = j12;
                modifier3 = modifier2;
                j14 = jM2518unboximpl;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-202735880, i19, -1, "androidx.compose.material3.Tab (Tab.kt:226)");
            }
            int i21115 = i19;
            int i21116 = i21115 >> 12;
            a(j14, j13, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -551896140, true, new e(modifier3, z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(true, 0.0f, j14, composerStartRestartGroup, ((i19 >> 6) & 896) | 6, 2), z12, onClick, content, i19)), composerStartRestartGroup, (i21116 & 112) | (i21116 & 14) | 3072 | ((i21115 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            j15 = j14;
            j16 = j13;
            mutableInteractionSource4 = mutableInteractionSource3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, i11, j15, j16, mutableInteractionSource4, modifier4, onClick, content, z10, z12));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0135  */
    /* JADX WARN: Code duplicated, block: B:104:0x0145  */
    /* JADX WARN: Code duplicated, block: B:114:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x016c  */
    /* JADX WARN: Code duplicated, block: B:116:0x016f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0173  */
    /* JADX WARN: Code duplicated, block: B:119:0x0175  */
    /* JADX WARN: Code duplicated, block: B:121:0x0179  */
    /* JADX WARN: Code duplicated, block: B:122:0x017c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0180  */
    /* JADX WARN: Code duplicated, block: B:127:0x0186  */
    /* JADX WARN: Code duplicated, block: B:128:0x0197  */
    /* JADX WARN: Code duplicated, block: B:131:0x019d  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:138:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:143:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:146:0x0240  */
    /* JADX WARN: Code duplicated, block: B:151:0x0256  */
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
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104  */
    /* JADX WARN: Code duplicated, block: B:93:0x010a  */
    /* JADX WARN: Code duplicated, block: B:94:0x010d  */
    /* JADX WARN: Code duplicated, block: B:98:0x011b  */
    /* JADX WARN: Instruction removed from duplicated block: B:102:0x0135, please report this as an issue */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Tab-wqdebIU, reason: not valid java name */
    public static final void m1348TabwqdebIU(boolean z10, @NotNull Function0<Unit> onClick, @Nullable Modifier modifier, boolean z11, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, long j10, long j11, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Composer composer, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Function2<? super Composer, ? super Integer, Unit> function4;
        int i18;
        long j12;
        int i19;
        int i20;
        Modifier modifier2;
        boolean z12;
        Function2<? super Composer, ? super Integer, Unit> function5;
        long jM2518unboximpl;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        boolean z13;
        long j13;
        Function2<? super Composer, ? super Integer, Unit> function6;
        Function2<? super Composer, ? super Integer, Unit> function7;
        Object objRememberedValue;
        Function2<? super Composer, ? super Integer, Unit> function8;
        Modifier modifier4;
        Function2<? super Composer, ? super Integer, Unit> function9;
        long j14;
        long j15;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i21;
        int i22;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-350627181);
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
                    if (composerStartRestartGroup.changed(z11)) {
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
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0 || !composerStartRestartGroup.changed(j10)) {
                            i22 = 524288;
                        } else {
                            i22 = 1048576;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 29360128) == 0) {
                        j12 = j11;
                        if ((i11 & 128) == 0 || !composerStartRestartGroup.changed(j12)) {
                            i21 = 4194304;
                        } else {
                            i21 = 8388608;
                        }
                        i12 |= i21;
                    } else {
                        j12 = j11;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 191739611) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (i15 != 0) {
                                function5 = null;
                            } else {
                                function5 = function2;
                            }
                            if (i17 != 0) {
                                function4 = null;
                            }
                            if ((i11 & 64) != 0) {
                                jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                                i12 &= -3670017;
                            } else {
                                jM2518unboximpl = j10;
                            }
                            if ((i11 & 128) != 0) {
                                i12 &= -29360129;
                                j12 = jM2518unboximpl;
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
                            modifier3 = modifier2;
                            z13 = z12;
                            j13 = j12;
                            function6 = function4;
                            function7 = function5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i12 &= -29360129;
                            }
                            modifier3 = modifier;
                            z13 = z11;
                            jM2518unboximpl = j10;
                            mutableInteractionSource2 = mutableInteractionSource;
                            j13 = j12;
                            function6 = function4;
                            function7 = function2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:92)");
                        }
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1540996038, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, 708874428, true, new g(i12, function7)) : null, function6));
                        int i24 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                        int i25 = i12 >> 6;
                        Function2<? super Composer, ? super Integer, Unit> function10 = function6;
                        Function2<? super Composer, ? super Integer, Unit> function11 = function7;
                        m1347TabbogVsAg(z10, onClick, modifier3, z13, jM2518unboximpl, j13, mutableInteractionSource2, composableLambda, composerStartRestartGroup, i24 | (57344 & i25) | (458752 & i25) | (i25 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function11;
                        modifier4 = modifier3;
                        function9 = function10;
                        j14 = jM2518unboximpl;
                        j15 = j13;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        z13 = z11;
                        j14 = j10;
                        j15 = j12;
                        function9 = function4;
                        modifier4 = modifier;
                        function8 = function2;
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(i10, i11, j14, j15, mutableInteractionSource3, modifier4, onClick, function8, function9, z10, z13));
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
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) == 0) {
                    j12 = j11;
                    if ((i11 & 128) == 0) {
                        i21 = 4194304;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                } else {
                    j12 = j11;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -3670017;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM2518unboximpl;
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
                        modifier3 = modifier2;
                        z13 = z12;
                        j13 = j12;
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
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -3670017;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM2518unboximpl;
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
                        modifier3 = modifier2;
                        z13 = z12;
                        j13 = j12;
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:92)");
                    }
                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1540996038, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, 708874428, true, new g(i12, function7)) : null, function6));
                    int i26 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i27 = i12 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function12 = function6;
                    Function2<? super Composer, ? super Integer, Unit> function13 = function7;
                    m1347TabbogVsAg(z10, onClick, modifier3, z13, jM2518unboximpl, j13, mutableInteractionSource2, composableLambda2, composerStartRestartGroup, i26 | (57344 & i27) | (458752 & i27) | (i27 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function13;
                    modifier4 = modifier3;
                    function9 = function12;
                    j14 = jM2518unboximpl;
                    j15 = j13;
                    mutableInteractionSource3 = mutableInteractionSource2;
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
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -3670017;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM2518unboximpl;
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
                        modifier3 = modifier2;
                        z13 = z12;
                        j13 = j12;
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
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -3670017;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM2518unboximpl;
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
                        modifier3 = modifier2;
                        z13 = z12;
                        j13 = j12;
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:92)");
                    }
                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1540996038, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, 708874428, true, new g(i12, function7)) : null, function6));
                    int i28 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i29 = i12 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function14 = function6;
                    Function2<? super Composer, ? super Integer, Unit> function15 = function7;
                    m1347TabbogVsAg(z10, onClick, modifier3, z13, jM2518unboximpl, j13, mutableInteractionSource2, composableLambda3, composerStartRestartGroup, i28 | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function15;
                    modifier4 = modifier3;
                    function9 = function14;
                    j14 = jM2518unboximpl;
                    j15 = j13;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(i10, i11, j14, j15, mutableInteractionSource3, modifier4, onClick, function8, function9, z10, z13));
            }
            i12 |= 3072;
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
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) == 0) {
                    j12 = j11;
                    if ((i11 & 128) == 0) {
                        i21 = 4194304;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                } else {
                    j12 = j11;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -3670017;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM2518unboximpl;
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
                        modifier3 = modifier2;
                        z13 = z12;
                        j13 = j12;
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
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -3670017;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM2518unboximpl;
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
                        modifier3 = modifier2;
                        z13 = z12;
                        j13 = j12;
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:92)");
                    }
                    ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1540996038, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, 708874428, true, new g(i12, function7)) : null, function6));
                    int i210 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i211 = i12 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function16 = function6;
                    Function2<? super Composer, ? super Integer, Unit> function17 = function7;
                    m1347TabbogVsAg(z10, onClick, modifier3, z13, jM2518unboximpl, j13, mutableInteractionSource2, composableLambda4, composerStartRestartGroup, i210 | (57344 & i211) | (458752 & i211) | (i211 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function17;
                    modifier4 = modifier3;
                    function9 = function16;
                    j14 = jM2518unboximpl;
                    j15 = j13;
                    mutableInteractionSource3 = mutableInteractionSource2;
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
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -3670017;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM2518unboximpl;
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
                        modifier3 = modifier2;
                        z13 = z12;
                        j13 = j12;
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
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -3670017;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM2518unboximpl;
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
                        modifier3 = modifier2;
                        z13 = z12;
                        j13 = j12;
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:92)");
                    }
                    ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1540996038, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, 708874428, true, new g(i12, function7)) : null, function6));
                    int i212 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i213 = i12 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function18 = function6;
                    Function2<? super Composer, ? super Integer, Unit> function19 = function7;
                    m1347TabbogVsAg(z10, onClick, modifier3, z13, jM2518unboximpl, j13, mutableInteractionSource2, composableLambda5, composerStartRestartGroup, i212 | (57344 & i213) | (458752 & i213) | (i213 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function19;
                    modifier4 = modifier3;
                    function9 = function18;
                    j14 = jM2518unboximpl;
                    j15 = j13;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(i10, i11, j14, j15, mutableInteractionSource3, modifier4, onClick, function8, function9, z10, z13));
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
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            if ((i10 & 29360128) == 0) {
                j12 = j11;
                if ((i11 & 128) == 0) {
                    i21 = 4194304;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            } else {
                j12 = j11;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i12 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -3670017;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM2518unboximpl;
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
                    modifier3 = modifier2;
                    z13 = z12;
                    j13 = j12;
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
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -3670017;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM2518unboximpl;
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
                    modifier3 = modifier2;
                    z13 = z12;
                    j13 = j12;
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:92)");
                }
                ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1540996038, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, 708874428, true, new g(i12, function7)) : null, function6));
                int i214 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                int i215 = i12 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function110 = function6;
                Function2<? super Composer, ? super Integer, Unit> function111 = function7;
                m1347TabbogVsAg(z10, onClick, modifier3, z13, jM2518unboximpl, j13, mutableInteractionSource2, composableLambda6, composerStartRestartGroup, i214 | (57344 & i215) | (458752 & i215) | (i215 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function111;
                modifier4 = modifier3;
                function9 = function110;
                j14 = jM2518unboximpl;
                j15 = j13;
                mutableInteractionSource3 = mutableInteractionSource2;
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
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -3670017;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM2518unboximpl;
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
                    modifier3 = modifier2;
                    z13 = z12;
                    j13 = j12;
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
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -3670017;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM2518unboximpl;
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
                    modifier3 = modifier2;
                    z13 = z12;
                    j13 = j12;
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:92)");
                }
                ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1540996038, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, 708874428, true, new g(i12, function7)) : null, function6));
                int i216 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                int i217 = i12 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function112 = function6;
                Function2<? super Composer, ? super Integer, Unit> function113 = function7;
                m1347TabbogVsAg(z10, onClick, modifier3, z13, jM2518unboximpl, j13, mutableInteractionSource2, composableLambda7, composerStartRestartGroup, i216 | (57344 & i217) | (458752 & i217) | (i217 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function113;
                modifier4 = modifier3;
                function9 = function112;
                j14 = jM2518unboximpl;
                j15 = j13;
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(i10, i11, j14, j15, mutableInteractionSource3, modifier4, onClick, function8, function9, z10, z13));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
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
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) == 0) {
                    j12 = j11;
                    if ((i11 & 128) == 0) {
                        i21 = 4194304;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                } else {
                    j12 = j11;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -3670017;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM2518unboximpl;
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
                        modifier3 = modifier2;
                        z13 = z12;
                        j13 = j12;
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
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -3670017;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM2518unboximpl;
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
                        modifier3 = modifier2;
                        z13 = z12;
                        j13 = j12;
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:92)");
                    }
                    ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1540996038, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, 708874428, true, new g(i12, function7)) : null, function6));
                    int i218 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i219 = i12 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function114 = function6;
                    Function2<? super Composer, ? super Integer, Unit> function115 = function7;
                    m1347TabbogVsAg(z10, onClick, modifier3, z13, jM2518unboximpl, j13, mutableInteractionSource2, composableLambda8, composerStartRestartGroup, i218 | (57344 & i219) | (458752 & i219) | (i219 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function115;
                    modifier4 = modifier3;
                    function9 = function114;
                    j14 = jM2518unboximpl;
                    j15 = j13;
                    mutableInteractionSource3 = mutableInteractionSource2;
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
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -3670017;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM2518unboximpl;
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
                        modifier3 = modifier2;
                        z13 = z12;
                        j13 = j12;
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
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if ((i11 & 64) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i12 &= -3670017;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            j12 = jM2518unboximpl;
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
                        modifier3 = modifier2;
                        z13 = z12;
                        j13 = j12;
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:92)");
                    }
                    ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1540996038, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, 708874428, true, new g(i12, function7)) : null, function6));
                    int i2110 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i2111 = i12 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function116 = function6;
                    Function2<? super Composer, ? super Integer, Unit> function117 = function7;
                    m1347TabbogVsAg(z10, onClick, modifier3, z13, jM2518unboximpl, j13, mutableInteractionSource2, composableLambda9, composerStartRestartGroup, i2110 | (57344 & i2111) | (458752 & i2111) | (i2111 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function117;
                    modifier4 = modifier3;
                    function9 = function116;
                    j14 = jM2518unboximpl;
                    j15 = j13;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(i10, i11, j14, j15, mutableInteractionSource3, modifier4, onClick, function8, function9, z10, z13));
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
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            if ((i10 & 29360128) == 0) {
                j12 = j11;
                if ((i11 & 128) == 0) {
                    i21 = 4194304;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            } else {
                j12 = j11;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i12 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -3670017;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM2518unboximpl;
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
                    modifier3 = modifier2;
                    z13 = z12;
                    j13 = j12;
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
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -3670017;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM2518unboximpl;
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
                    modifier3 = modifier2;
                    z13 = z12;
                    j13 = j12;
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:92)");
                }
                ComposableLambda composableLambda10 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1540996038, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, 708874428, true, new g(i12, function7)) : null, function6));
                int i2112 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                int i2113 = i12 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function118 = function6;
                Function2<? super Composer, ? super Integer, Unit> function119 = function7;
                m1347TabbogVsAg(z10, onClick, modifier3, z13, jM2518unboximpl, j13, mutableInteractionSource2, composableLambda10, composerStartRestartGroup, i2112 | (57344 & i2113) | (458752 & i2113) | (i2113 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function119;
                modifier4 = modifier3;
                function9 = function118;
                j14 = jM2518unboximpl;
                j15 = j13;
                mutableInteractionSource3 = mutableInteractionSource2;
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
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -3670017;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM2518unboximpl;
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
                    modifier3 = modifier2;
                    z13 = z12;
                    j13 = j12;
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
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -3670017;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM2518unboximpl;
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
                    modifier3 = modifier2;
                    z13 = z12;
                    j13 = j12;
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:92)");
                }
                ComposableLambda composableLambda11 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1540996038, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, 708874428, true, new g(i12, function7)) : null, function6));
                int i2114 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                int i2115 = i12 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function1110 = function6;
                Function2<? super Composer, ? super Integer, Unit> function1111 = function7;
                m1347TabbogVsAg(z10, onClick, modifier3, z13, jM2518unboximpl, j13, mutableInteractionSource2, composableLambda11, composerStartRestartGroup, i2114 | (57344 & i2115) | (458752 & i2115) | (i2115 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function1111;
                modifier4 = modifier3;
                function9 = function1110;
                j14 = jM2518unboximpl;
                j15 = j13;
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(i10, i11, j14, j15, mutableInteractionSource3, modifier4, onClick, function8, function9, z10, z13));
        }
        i12 |= 3072;
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
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            if ((i10 & 29360128) == 0) {
                j12 = j11;
                if ((i11 & 128) == 0) {
                    i21 = 4194304;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            } else {
                j12 = j11;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i12 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -3670017;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM2518unboximpl;
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
                    modifier3 = modifier2;
                    z13 = z12;
                    j13 = j12;
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
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -3670017;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM2518unboximpl;
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
                    modifier3 = modifier2;
                    z13 = z12;
                    j13 = j12;
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:92)");
                }
                ComposableLambda composableLambda12 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1540996038, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, 708874428, true, new g(i12, function7)) : null, function6));
                int i2116 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                int i2117 = i12 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function1112 = function6;
                Function2<? super Composer, ? super Integer, Unit> function1113 = function7;
                m1347TabbogVsAg(z10, onClick, modifier3, z13, jM2518unboximpl, j13, mutableInteractionSource2, composableLambda12, composerStartRestartGroup, i2116 | (57344 & i2117) | (458752 & i2117) | (i2117 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function1113;
                modifier4 = modifier3;
                function9 = function1112;
                j14 = jM2518unboximpl;
                j15 = j13;
                mutableInteractionSource3 = mutableInteractionSource2;
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
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -3670017;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM2518unboximpl;
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
                    modifier3 = modifier2;
                    z13 = z12;
                    j13 = j12;
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
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 64) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i12 &= -3670017;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        j12 = jM2518unboximpl;
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
                    modifier3 = modifier2;
                    z13 = z12;
                    j13 = j12;
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:92)");
                }
                ComposableLambda composableLambda13 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1540996038, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, 708874428, true, new g(i12, function7)) : null, function6));
                int i2118 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                int i2119 = i12 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function1114 = function6;
                Function2<? super Composer, ? super Integer, Unit> function1115 = function7;
                m1347TabbogVsAg(z10, onClick, modifier3, z13, jM2518unboximpl, j13, mutableInteractionSource2, composableLambda13, composerStartRestartGroup, i2118 | (57344 & i2119) | (458752 & i2119) | (i2119 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function1115;
                modifier4 = modifier3;
                function9 = function1114;
                j14 = jM2518unboximpl;
                j15 = j13;
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(i10, i11, j14, j15, mutableInteractionSource3, modifier4, onClick, function8, function9, z10, z13));
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
        if ((i10 & 3670016) != 0) {
            if ((i11 & 64) == 0) {
                i22 = 524288;
            } else {
                i22 = 524288;
            }
            i12 |= i22;
        }
        if ((i10 & 29360128) == 0) {
            j12 = j11;
            if ((i11 & 128) == 0) {
                i21 = 4194304;
            } else {
                i21 = 4194304;
            }
            i12 |= i21;
        } else {
            j12 = j11;
        }
        i19 = i11 & 256;
        if (i19 != 0) {
            i12 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i20 = 33554432;
            }
            i12 |= i20;
        }
        if ((i12 & 191739611) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i17 != 0) {
                    function4 = null;
                }
                if ((i11 & 64) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i12 &= -3670017;
                } else {
                    jM2518unboximpl = j10;
                }
                if ((i11 & 128) != 0) {
                    i12 &= -29360129;
                    j12 = jM2518unboximpl;
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
                modifier3 = modifier2;
                z13 = z12;
                j13 = j12;
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
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i17 != 0) {
                    function4 = null;
                }
                if ((i11 & 64) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i12 &= -3670017;
                } else {
                    jM2518unboximpl = j10;
                }
                if ((i11 & 128) != 0) {
                    i12 &= -29360129;
                    j12 = jM2518unboximpl;
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
                modifier3 = modifier2;
                z13 = z12;
                j13 = j12;
                function6 = function4;
                function7 = function5;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:92)");
            }
            ComposableLambda composableLambda14 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1540996038, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, 708874428, true, new g(i12, function7)) : null, function6));
            int i21110 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
            int i21111 = i12 >> 6;
            Function2<? super Composer, ? super Integer, Unit> function1116 = function6;
            Function2<? super Composer, ? super Integer, Unit> function1117 = function7;
            m1347TabbogVsAg(z10, onClick, modifier3, z13, jM2518unboximpl, j13, mutableInteractionSource2, composableLambda14, composerStartRestartGroup, i21110 | (57344 & i21111) | (458752 & i21111) | (i21111 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function8 = function1117;
            modifier4 = modifier3;
            function9 = function1116;
            j14 = jM2518unboximpl;
            j15 = j13;
            mutableInteractionSource3 = mutableInteractionSource2;
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
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i17 != 0) {
                    function4 = null;
                }
                if ((i11 & 64) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i12 &= -3670017;
                } else {
                    jM2518unboximpl = j10;
                }
                if ((i11 & 128) != 0) {
                    i12 &= -29360129;
                    j12 = jM2518unboximpl;
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
                modifier3 = modifier2;
                z13 = z12;
                j13 = j12;
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
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i17 != 0) {
                    function4 = null;
                }
                if ((i11 & 64) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i12 &= -3670017;
                } else {
                    jM2518unboximpl = j10;
                }
                if ((i11 & 128) != 0) {
                    i12 &= -29360129;
                    j12 = jM2518unboximpl;
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
                modifier3 = modifier2;
                z13 = z12;
                j13 = j12;
                function6 = function4;
                function7 = function5;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-350627181, i12, -1, "androidx.compose.material3.Tab (Tab.kt:92)");
            }
            ComposableLambda composableLambda15 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1540996038, true, new c(i12, function7 != null ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, 708874428, true, new g(i12, function7)) : null, function6));
            int i21112 = 12582912 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
            int i21113 = i12 >> 6;
            Function2<? super Composer, ? super Integer, Unit> function1118 = function6;
            Function2<? super Composer, ? super Integer, Unit> function1119 = function7;
            m1347TabbogVsAg(z10, onClick, modifier3, z13, jM2518unboximpl, j13, mutableInteractionSource2, composableLambda15, composerStartRestartGroup, i21112 | (57344 & i21113) | (458752 & i21113) | (i21113 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function8 = function1119;
            modifier4 = modifier3;
            function9 = function1118;
            j14 = jM2518unboximpl;
            j15 = j13;
            mutableInteractionSource3 = mutableInteractionSource2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(i10, i11, j14, j15, mutableInteractionSource3, modifier4, onClick, function8, function9, z10, z13));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void a(long j10, long j11, boolean z10, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(735731848);
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
                ComposerKt.traceEventStart(735731848, i11, -1, "androidx.compose.material3.TabTransition (Tab.kt:266)");
            }
            int i12 = i11 >> 6;
            Transition transitionUpdateTransition = TransitionKt.updateTransition(Boolean.valueOf(z10), (String) null, composerStartRestartGroup, i12 & 14, 2);
            i iVar = i.f11982p0;
            composerStartRestartGroup.startReplaceableGroup(-1939694975);
            boolean zBooleanValue = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(-1997025499);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:288)");
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
            composerStartRestartGroup.startReplaceableGroup(-1997025499);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:288)");
            }
            long j13 = zBooleanValue2 ? j10 : j11;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Color colorM2498boximpl = Color.m2498boximpl(j13);
            boolean zBooleanValue3 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(-1997025499);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:288)");
            }
            long j14 = zBooleanValue3 ? j10 : j11;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM2498boximpl, Color.m2498boximpl(j14), iVar.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), twoWayConverter, "ColorAnimation", composerStartRestartGroup, 32768);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(((Color) stateCreateTransitionAnimation.getValue()).m2518unboximpl()))}, function2, composerStartRestartGroup, (i12 & 112) | 8);
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
        Composer composerStartRestartGroup = composer.startRestartGroup(514131524);
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
                ComposerKt.traceEventStart(514131524, i11, -1, "androidx.compose.material3.TabBaselineLayout (Tab.kt:303)");
            }
            l0.k4 k4Var = new l0.k4(function2, function3);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.INSTANCE;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
            Updater.m2081setimpl(composerM2074constructorimpl, k4Var, companion2.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, density, companion2.getSetDensity());
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m2081setimpl(composerM2074constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            ai.a.j(0, function3MaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            composerStartRestartGroup.startReplaceableGroup(720851189);
            if (function2 != null) {
                Modifier modifierM298paddingVpY3zN4$default = PaddingKt.m298paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), f11925c, 0.0f, 2, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM298paddingVpY3zN4$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl2, measurePolicyC, composerM2074constructorimpl2, density2));
                ai.a.j(0, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                androidx.datastore.preferences.protobuf.q.e(i11 & 14, function2, composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(150513216);
            if (function3 != null) {
                Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, "icon");
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierLayoutId);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl3, layoutDirection3, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl3, measurePolicyC2, composerM2074constructorimpl3, density3));
                ai.a.j(0, function3MaterializerOf3, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new l0.l4(i10, function2, function3));
    }

    public static final void access$placeTextAndIcon(Placeable.PlacementScope placementScope, Density density, Placeable placeable, Placeable placeable2, int i10, int i11, int i12, int i13) {
        int iMo413roundToPx0680j_4 = density.mo413roundToPx0680j_4(PrimaryNavigationTabTokens.INSTANCE.m1913getActiveIndicatorHeightD9Ej5fM()) + density.mo413roundToPx0680j_4(i12 == i13 ? f11926d : f11927e);
        int iMo412roundToPxR2X_6o = (density.mo412roundToPxR2X_6o(f11928f) + placeable2.getHeight()) - i12;
        int i14 = (i11 - i13) - iMo413roundToPx0680j_4;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, androidx.collection.a.a(placeable, i10, 2), i14, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, androidx.collection.a.a(placeable2, i10, 2), i14 - iMo412roundToPxR2X_6o, 0.0f, 4, null);
    }
}
