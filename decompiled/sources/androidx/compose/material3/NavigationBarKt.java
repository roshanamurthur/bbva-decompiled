package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.NavigationBarTokens;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
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

/* JADX INFO: compiled from: NavigationBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001ae\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0085\u0001\u0010\u001e\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00122\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0014¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\"\u001d\u0010$\u001a\u00020\u00058\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u001d\u0010'\u001a\u00020\u00058\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "NavigationBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationBar", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", "label", "alwaysShowLabel", "Landroidx/compose/material3/NavigationBarItemColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "NavigationBarItem", "(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "b", "F", "getNavigationBarItemHorizontalPadding", "()F", "NavigationBarItemHorizontalPadding", "c", "getNavigationBarItemVerticalPadding", "NavigationBarItemVerticalPadding", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,637:1\n25#2:638\n25#2:645\n36#2:652\n460#2,13:677\n50#2:692\n49#2:693\n473#2,3:700\n456#2,11:721\n460#2,13:751\n473#2,3:765\n460#2,13:790\n473#2,3:804\n467#2,3:809\n1114#3,6:639\n1114#3,6:646\n1114#3,6:653\n1114#3,6:694\n68#4,5:659\n73#4:690\n77#4:704\n67#4,6:732\n73#4:764\n77#4:769\n67#4,6:771\n73#4:803\n77#4:808\n75#5:664\n76#5,11:666\n89#5:703\n71#5,4:705\n75#5,11:710\n75#5:738\n76#5,11:740\n89#5:768\n75#5:777\n76#5,11:779\n89#5:807\n88#5:812\n76#6:665\n76#6:691\n76#6:709\n76#6:739\n76#6:778\n75#7:770\n58#7:819\n75#7:820\n58#7:821\n75#7:822\n76#8:813\n102#8,2:814\n76#8:816\n154#9:817\n154#9:818\n154#9:823\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt\n*L\n169#1:638\n190#1:645\n203#1:652\n192#1:677,13\n224#1:692\n224#1:693\n192#1:700,3\n435#1:721,11\n441#1:751,13\n441#1:765,3\n444#1:790,13\n444#1:804,3\n435#1:809,3\n169#1:639,6\n190#1:646,6\n203#1:653,6\n224#1:694,6\n192#1:659,5\n192#1:690\n192#1:704\n441#1:732,6\n441#1:764\n441#1:769\n444#1:771,6\n444#1:803\n444#1:808\n192#1:664\n192#1:666,11\n192#1:703\n435#1:705,4\n435#1:710,11\n441#1:738\n441#1:740,11\n441#1:768\n444#1:777\n444#1:779,11\n444#1:807\n435#1:812\n192#1:665\n217#1:691\n435#1:709\n441#1:739\n444#1:778\n448#1:770\n632#1:819\n632#1:820\n635#1:821\n635#1:822\n190#1:813\n190#1:814,2\n208#1:816\n626#1:817\n629#1:818\n637#1:823\n*E\n"})
public final class NavigationBarKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f10710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f10711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f10712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f10713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f10714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f10715f;

    /* JADX INFO: compiled from: NavigationBar.kt */
    @SourceDebugExtension({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBar$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,637:1\n76#2,5:638\n81#2:669\n85#2:674\n75#3:643\n76#3,11:645\n89#3:673\n76#4:644\n460#5,13:656\n473#5,3:670\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBar$1\n*L\n113#1:638,5\n113#1:669\n113#1:674\n113#1:643\n113#1:645,11\n113#1:673\n113#1:644\n113#1:656,13\n113#1:670,3\n*E\n"})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ WindowInsets f10716p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f10717q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f10718r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(WindowInsets windowInsets, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f10716p0 = windowInsets;
            this.f10717q0 = function3;
            this.f10718r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(105663120, iIntValue, -1, "androidx.compose.material3.NavigationBar.<anonymous> (NavigationBar.kt:111)");
                }
                Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(SizeKt.m321height3ABfNKs(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), this.f10716p0), NavigationBarKt.f10710a));
                Arrangement.HorizontalOrVertical horizontalOrVerticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(NavigationBarKt.getNavigationBarItemHorizontalPadding());
                int i10 = ((this.f10718r0 >> 6) & 7168) | 48;
                composer2.startReplaceableGroup(693286680);
                int i11 = i10 >> 3;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM246spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer2, (i11 & 112) | (i11 & 14));
                Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSelectableGroup);
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
                this.f10717q0.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i10 >> 6) & 112) | 6));
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

    /* JADX INFO: compiled from: NavigationBar.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10719p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f10720q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f10721r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f10722s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ WindowInsets f10723t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f10724u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f10725w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Modifier modifier, long j10, long j11, float f6, WindowInsets windowInsets, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f10719p0 = modifier;
            this.f10720q0 = j10;
            this.f10721r0 = j11;
            this.f10722s0 = f6;
            this.f10723t0 = windowInsets;
            this.f10724u0 = function3;
            this.v0 = i10;
            this.f10725w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            NavigationBarKt.m1176NavigationBarHsRjFd4(this.f10719p0, this.f10720q0, this.f10721r0, this.f10722s0, this.f10723t0, this.f10724u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f10725w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationBar.kt */
    public static final class c extends Lambda implements Function1<IntSize, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f10726p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MutableState<Integer> mutableState) {
            super(1);
            this.f10726p0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(IntSize intSize) {
            NavigationBarKt.access$NavigationBarItem$lambda$4(this.f10726p0, IntSize.m4549getWidthimpl(intSize.getF18319a()));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationBar.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ NavigationBarItemColors f10727p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f10728q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(NavigationBarItemColors navigationBarItemColors, State<Float> state) {
            super(2);
            this.f10727p0 = navigationBarItemColors;
            this.f10728q0 = state;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-474426875, iIntValue, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:237)");
                }
                BoxKt.Box(BackgroundKt.m121backgroundbw27NRU(LayoutIdKt.layoutId(Modifier.INSTANCE, "indicator"), Color.m2507copywmQWz5c$default(this.f10727p0.getF10705c(), NavigationBarKt.access$NavigationBarItem$lambda$9$lambda$6(this.f10728q0), 0.0f, 0.0f, 0.0f, 14, null), ShapesKt.toShape(NavigationBarTokens.INSTANCE.getActiveIndicatorShape(), composer2, 6)), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationBar.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MappedInteractionSource f10729p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MappedInteractionSource mappedInteractionSource) {
            super(2);
            this.f10729p0 = mappedInteractionSource;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(691730997, iIntValue, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:229)");
                }
                BoxKt.Box(IndicationKt.indication(ClipKt.clip(LayoutIdKt.layoutId(Modifier.INSTANCE, "indicatorRipple"), ShapesKt.toShape(NavigationBarTokens.INSTANCE.getActiveIndicatorShape(), composer2, 6)), this.f10729p0, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7)), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationBar.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;
        public final /* synthetic */ int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ RowScope f10730p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f10731q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f10732r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10733s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10734t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f10735u0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ boolean f10736w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ NavigationBarItemColors f10737x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f10738y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(RowScope rowScope, boolean z10, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z11, Function2<? super Composer, ? super Integer, Unit> function3, boolean z12, NavigationBarItemColors navigationBarItemColors, MutableInteractionSource mutableInteractionSource, int i10, int i11) {
            super(2);
            this.f10730p0 = rowScope;
            this.f10731q0 = z10;
            this.f10732r0 = function0;
            this.f10733s0 = function2;
            this.f10734t0 = modifier;
            this.f10735u0 = z11;
            this.v0 = function3;
            this.f10736w0 = z12;
            this.f10737x0 = navigationBarItemColors;
            this.f10738y0 = mutableInteractionSource;
            this.E0 = i10;
            this.F0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            NavigationBarKt.NavigationBarItem(this.f10730p0, this.f10731q0, this.f10732r0, this.f10733s0, this.f10734t0, this.f10735u0, this.v0, this.f10736w0, this.f10737x0, this.f10738y0, composer, RecomposeScopeImplKt.updateChangedFlags(this.E0 | 1), this.F0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationBar.kt */
    @SourceDebugExtension({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledIcon$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,637:1\n67#2,6:638\n73#2:670\n77#2:675\n75#3:644\n76#3,11:646\n89#3:674\n76#4:645\n460#5,13:657\n473#5,3:671\n76#6:676\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledIcon$1\n*L\n175#1:638,6\n175#1:670\n175#1:675\n175#1:644\n175#1:646,11\n175#1:674\n175#1:645\n175#1:657,13\n175#1:671,3\n172#1:676\n*E\n"})
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ NavigationBarItemColors f10739p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f10740q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f10741r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f10742s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10743t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f10744u0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(NavigationBarItemColors navigationBarItemColors, boolean z10, boolean z11, int i10, Function2<? super Composer, ? super Integer, Unit> function2, boolean z12, Function2<? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f10739p0 = navigationBarItemColors;
            this.f10740q0 = z10;
            this.f10741r0 = z11;
            this.f10742s0 = i10;
            this.f10743t0 = function2;
            this.f10744u0 = z12;
            this.v0 = function3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1419576100, iIntValue, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:170)");
                }
                int i10 = this.f10742s0;
                boolean z10 = this.f10741r0;
                NavigationBarItemColors navigationBarItemColors = this.f10739p0;
                boolean z11 = this.f10740q0;
                State<Color> stateIconColor$material3_release = navigationBarItemColors.iconColor$material3_release(z11, z10, composer2, ((i10 >> 3) & 14) | ((i10 >> 12) & 112) | ((i10 >> 18) & 896));
                Modifier modifierClearAndSetSemantics = (this.f10743t0 == null || !(this.f10744u0 || z11)) ? Modifier.INSTANCE : SemanticsModifierKt.clearAndSetSemantics(Modifier.INSTANCE, n2.f13006p0);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierClearAndSetSemantics);
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
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(stateIconColor$material3_release.getValue().m2518unboximpl()))}, this.v0, composer2, ((i10 >> 6) & 112) | 8);
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

    /* JADX INFO: compiled from: NavigationBar.kt */
    @SourceDebugExtension({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledLabel$1$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,637:1\n76#2:638\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItem$styledLabel$1$1\n*L\n183#1:638\n*E\n"})
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ NavigationBarItemColors f10745p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f10746q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f10747r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f10748s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10749t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(NavigationBarItemColors navigationBarItemColors, boolean z10, boolean z11, int i10, Function2<? super Composer, ? super Integer, Unit> function2) {
            super(2);
            this.f10745p0 = navigationBarItemColors;
            this.f10746q0 = z10;
            this.f10747r0 = z11;
            this.f10748s0 = i10;
            this.f10749t0 = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1644987592, iIntValue, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:180)");
                }
                TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), NavigationBarTokens.INSTANCE.getLabelTextFont());
                int i10 = this.f10748s0;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(this.f10745p0.textColor$material3_release(this.f10746q0, this.f10747r0, composer2, ((i10 >> 3) & 14) | ((i10 >> 12) & 112) | ((i10 >> 18) & 896)).getValue().m2518unboximpl()))}, ComposableLambdaKt.composableLambda(composer2, 2061683080, true, new o2(textStyleFromToken, this.f10749t0, i10)), composer2, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationBar.kt */
    @SourceDebugExtension({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItemBaselineLayout$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,637:1\n223#2,2:638\n223#2,2:642\n288#2,2:644\n223#2,2:646\n92#3:640\n92#3:641\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItemBaselineLayout$2\n*L\n453#1:638,2\n460#1:642,2\n469#1:644,2\n480#1:646,2\n455#1:640\n457#1:641\n*E\n"})
    public static final class i implements MeasurePolicy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f10750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f10752c;

        public i(float f6, boolean z10, Function2 function2) {
            this.f10750a = f6;
            this.f10751b = function2;
            this.f10752c = z10;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.a(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.b(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j10) {
            Object next;
            Placeable placeableMo3575measureBRTryo0;
            Measurable measurable;
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            List<? extends Measurable> list = measurables;
            for (Measurable measurable2 : list) {
                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                    Placeable placeableMo3575measureBRTryo1 = measurable2.mo3575measureBRTryo0(j10);
                    float f6 = 2;
                    int iMo413roundToPx0680j_4 = Layout.mo413roundToPx0680j_4(Dp.m4389constructorimpl(NavigationBarKt.f10713d * f6)) + placeableMo3575measureBRTryo1.getWidth();
                    int iRoundToInt = mk.c.roundToInt(iMo413roundToPx0680j_4 * this.f10750a);
                    int iMo413roundToPx0680j_5 = Layout.mo413roundToPx0680j_4(Dp.m4389constructorimpl(NavigationBarKt.f10714e * f6)) + placeableMo3575measureBRTryo1.getHeight();
                    for (Measurable measurable3 : list) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "indicatorRipple")) {
                            Placeable placeableMo3575measureBRTryo2 = measurable3.mo3575measureBRTryo0(Constraints.INSTANCE.m4365fixedJhjzzOo(iMo413roundToPx0680j_4, iMo413roundToPx0680j_5));
                            Iterator<T> it = list.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next), "indicator"));
                            Measurable measurable4 = (Measurable) next;
                            Placeable placeableMo3575measureBRTryo3 = measurable4 != null ? measurable4.mo3575measureBRTryo0(Constraints.INSTANCE.m4365fixedJhjzzOo(iRoundToInt, iMo413roundToPx0680j_5)) : null;
                            Function2<Composer, Integer, Unit> function2 = this.f10751b;
                            if (function2 != null) {
                                Iterator<T> it2 = list.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    measurable = (Measurable) it2.next();
                                } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "label"));
                                placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null));
                            } else {
                                placeableMo3575measureBRTryo0 = null;
                            }
                            if (function2 == null) {
                                return NavigationBarKt.m1177access$placeIconX9ElhV4(Layout, placeableMo3575measureBRTryo1, placeableMo3575measureBRTryo2, placeableMo3575measureBRTryo3, j10);
                            }
                            Intrinsics.checkNotNull(placeableMo3575measureBRTryo0);
                            return NavigationBarKt.m1178access$placeLabelAndIconzUg2_y0(Layout, placeableMo3575measureBRTryo0, placeableMo3575measureBRTryo1, placeableMo3575measureBRTryo2, placeableMo3575measureBRTryo3, j10, this.f10752c, this.f10750a);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.c(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.d(this, intrinsicMeasureScope, list, i10);
        }
    }

    /* JADX INFO: compiled from: NavigationBar.kt */
    public static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10753p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10754q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10755r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10756s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f10757t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ float f10758u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, boolean z10, float f6, int i10) {
            super(2);
            this.f10753p0 = function2;
            this.f10754q0 = function3;
            this.f10755r0 = function4;
            this.f10756s0 = function5;
            this.f10757t0 = z10;
            this.f10758u0 = f6;
            this.v0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            NavigationBarKt.a(this.f10753p0, this.f10754q0, this.f10755r0, this.f10756s0, this.f10757t0, this.f10758u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1));
            return Unit.INSTANCE;
        }
    }

    static {
        NavigationBarTokens navigationBarTokens = NavigationBarTokens.INSTANCE;
        f10710a = navigationBarTokens.m1787getContainerHeightD9Ej5fM();
        f10711b = Dp.m4389constructorimpl(8);
        f10712c = Dp.m4389constructorimpl(16);
        float f6 = 2;
        f10713d = Dp.m4389constructorimpl(Dp.m4389constructorimpl(navigationBarTokens.m1785getActiveIndicatorWidthD9Ej5fM() - navigationBarTokens.m1788getIconSizeD9Ej5fM()) / f6);
        f10714e = Dp.m4389constructorimpl(Dp.m4389constructorimpl(navigationBarTokens.m1784getActiveIndicatorHeightD9Ej5fM() - navigationBarTokens.m1788getIconSizeD9Ej5fM()) / f6);
        f10715f = Dp.m4389constructorimpl(12);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012b  */
    /* JADX WARN: Code duplicated, block: B:104:0x013d  */
    /* JADX WARN: Code duplicated, block: B:107:0x017b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0187  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:93:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x0111  */
    /* JADX WARN: Code duplicated, block: B:98:0x0120  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: NavigationBar-HsRjFd4, reason: not valid java name */
    public static final void m1176NavigationBarHsRjFd4(@Nullable Modifier modifier, long j10, long j11, float f6, @Nullable WindowInsets windowInsets, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        long containerColor;
        long jM1013contentColorFor4WTKRHQ;
        float fM1172getElevationD9Ej5fM;
        WindowInsets windowInsets2;
        int i13;
        Modifier modifier3;
        float f10;
        int i14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1596802123);
        int i15 = i11 & 1;
        if (i15 != 0) {
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
                containerColor = j10;
                int i16 = composerStartRestartGroup.changed(containerColor) ? 32 : 16;
                i12 |= i16;
            } else {
                containerColor = j10;
            }
            i12 |= i16;
        } else {
            containerColor = j10;
        }
        if ((i10 & 896) == 0) {
            jM1013contentColorFor4WTKRHQ = j11;
            i12 |= ((i11 & 4) == 0 && composerStartRestartGroup.changed(jM1013contentColorFor4WTKRHQ)) ? 256 : 128;
        } else {
            jM1013contentColorFor4WTKRHQ = j11;
        }
        int i17 = i11 & 8;
        if (i17 == 0) {
            if ((i10 & 7168) == 0) {
                fM1172getElevationD9Ej5fM = f6;
                i12 |= composerStartRestartGroup.changed(fM1172getElevationD9Ej5fM) ? 2048 : 1024;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    windowInsets2 = windowInsets;
                    int i18 = composerStartRestartGroup.changed(windowInsets2) ? 16384 : 8192;
                    i12 |= i18;
                } else {
                    windowInsets2 = windowInsets;
                }
                i12 |= i18;
            } else {
                windowInsets2 = windowInsets;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                }
                if ((374491 & i12) == 74898 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            containerColor = NavigationBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i12 &= -113;
                        }
                        if ((i11 & 4) != 0) {
                            jM1013contentColorFor4WTKRHQ = ColorSchemeKt.m1013contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), containerColor);
                            i12 &= -897;
                        }
                        if (i17 != 0) {
                            fM1172getElevationD9Ej5fM = NavigationBarDefaults.INSTANCE.m1172getElevationD9Ej5fM();
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            windowInsets2 = NavigationBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        modifier3 = modifier2;
                    }
                    f10 = fM1172getElevationD9Ej5fM;
                    long j12 = jM1013contentColorFor4WTKRHQ;
                    i14 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1596802123, i14, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:98)");
                    }
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 105663120, true, new a(windowInsets2, content, i14));
                    int i19 = 12582912 | (i14 & 14);
                    int i20 = i14 << 3;
                    int i21 = i19 | (i20 & 896) | (i20 & 7168) | (i20 & 57344);
                    WindowInsets windowInsets3 = windowInsets2;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, null, containerColor, j12, f10, 0.0f, null, composableLambda, composerStartRestartGroup, i21, 98);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets2 = windowInsets3;
                    jM1013contentColorFor4WTKRHQ = j12;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    f10 = fM1172getElevationD9Ej5fM;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, containerColor, jM1013contentColorFor4WTKRHQ, f10, windowInsets2, content, i10, i11));
            }
            i13 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i13;
            if ((374491 & i12) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        containerColor = NavigationBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jM1013contentColorFor4WTKRHQ = ColorSchemeKt.m1013contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), containerColor);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        fM1172getElevationD9Ej5fM = NavigationBarDefaults.INSTANCE.m1172getElevationD9Ej5fM();
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        windowInsets2 = NavigationBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        containerColor = NavigationBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jM1013contentColorFor4WTKRHQ = ColorSchemeKt.m1013contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), containerColor);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        fM1172getElevationD9Ej5fM = NavigationBarDefaults.INSTANCE.m1172getElevationD9Ej5fM();
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        windowInsets2 = NavigationBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    }
                }
                f10 = fM1172getElevationD9Ej5fM;
                long j13 = jM1013contentColorFor4WTKRHQ;
                i14 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1596802123, i14, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:98)");
                }
                ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 105663120, true, new a(windowInsets2, content, i14));
                int i110 = 12582912 | (i14 & 14);
                int i22 = i14 << 3;
                int i23 = i110 | (i22 & 896) | (i22 & 7168) | (i22 & 57344);
                WindowInsets windowInsets4 = windowInsets2;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, null, containerColor, j13, f10, 0.0f, null, composableLambda2, composerStartRestartGroup, i23, 98);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                windowInsets2 = windowInsets4;
                jM1013contentColorFor4WTKRHQ = j13;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        containerColor = NavigationBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jM1013contentColorFor4WTKRHQ = ColorSchemeKt.m1013contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), containerColor);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        fM1172getElevationD9Ej5fM = NavigationBarDefaults.INSTANCE.m1172getElevationD9Ej5fM();
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        windowInsets2 = NavigationBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        containerColor = NavigationBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jM1013contentColorFor4WTKRHQ = ColorSchemeKt.m1013contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), containerColor);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        fM1172getElevationD9Ej5fM = NavigationBarDefaults.INSTANCE.m1172getElevationD9Ej5fM();
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        windowInsets2 = NavigationBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    }
                }
                f10 = fM1172getElevationD9Ej5fM;
                long j14 = jM1013contentColorFor4WTKRHQ;
                i14 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1596802123, i14, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:98)");
                }
                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 105663120, true, new a(windowInsets2, content, i14));
                int i111 = 12582912 | (i14 & 14);
                int i24 = i14 << 3;
                int i25 = i111 | (i24 & 896) | (i24 & 7168) | (i24 & 57344);
                WindowInsets windowInsets5 = windowInsets2;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, null, containerColor, j14, f10, 0.0f, null, composableLambda3, composerStartRestartGroup, i25, 98);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                windowInsets2 = windowInsets5;
                jM1013contentColorFor4WTKRHQ = j14;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, containerColor, jM1013contentColorFor4WTKRHQ, f10, windowInsets2, content, i10, i11));
        }
        i12 |= 3072;
        fM1172getElevationD9Ej5fM = f6;
        if ((i10 & 57344) == 0) {
            if ((i11 & 16) == 0) {
                windowInsets2 = windowInsets;
                if (composerStartRestartGroup.changed(windowInsets2)) {
                }
                i12 |= i18;
            } else {
                windowInsets2 = windowInsets;
            }
            i12 |= i18;
        } else {
            windowInsets2 = windowInsets;
        }
        if ((i11 & 32) != 0) {
            if ((458752 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
            }
            if ((374491 & i12) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        containerColor = NavigationBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jM1013contentColorFor4WTKRHQ = ColorSchemeKt.m1013contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), containerColor);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        fM1172getElevationD9Ej5fM = NavigationBarDefaults.INSTANCE.m1172getElevationD9Ej5fM();
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        windowInsets2 = NavigationBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        containerColor = NavigationBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jM1013contentColorFor4WTKRHQ = ColorSchemeKt.m1013contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), containerColor);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        fM1172getElevationD9Ej5fM = NavigationBarDefaults.INSTANCE.m1172getElevationD9Ej5fM();
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        windowInsets2 = NavigationBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    }
                }
                f10 = fM1172getElevationD9Ej5fM;
                long j15 = jM1013contentColorFor4WTKRHQ;
                i14 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1596802123, i14, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:98)");
                }
                ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 105663120, true, new a(windowInsets2, content, i14));
                int i112 = 12582912 | (i14 & 14);
                int i26 = i14 << 3;
                int i27 = i112 | (i26 & 896) | (i26 & 7168) | (i26 & 57344);
                WindowInsets windowInsets6 = windowInsets2;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, null, containerColor, j15, f10, 0.0f, null, composableLambda4, composerStartRestartGroup, i27, 98);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                windowInsets2 = windowInsets6;
                jM1013contentColorFor4WTKRHQ = j15;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        containerColor = NavigationBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jM1013contentColorFor4WTKRHQ = ColorSchemeKt.m1013contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), containerColor);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        fM1172getElevationD9Ej5fM = NavigationBarDefaults.INSTANCE.m1172getElevationD9Ej5fM();
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        windowInsets2 = NavigationBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        containerColor = NavigationBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jM1013contentColorFor4WTKRHQ = ColorSchemeKt.m1013contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), containerColor);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        fM1172getElevationD9Ej5fM = NavigationBarDefaults.INSTANCE.m1172getElevationD9Ej5fM();
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        windowInsets2 = NavigationBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    }
                }
                f10 = fM1172getElevationD9Ej5fM;
                long j16 = jM1013contentColorFor4WTKRHQ;
                i14 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1596802123, i14, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:98)");
                }
                ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 105663120, true, new a(windowInsets2, content, i14));
                int i113 = 12582912 | (i14 & 14);
                int i28 = i14 << 3;
                int i29 = i113 | (i28 & 896) | (i28 & 7168) | (i28 & 57344);
                WindowInsets windowInsets7 = windowInsets2;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, null, containerColor, j16, f10, 0.0f, null, composableLambda5, composerStartRestartGroup, i29, 98);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                windowInsets2 = windowInsets7;
                jM1013contentColorFor4WTKRHQ = j16;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, containerColor, jM1013contentColorFor4WTKRHQ, f10, windowInsets2, content, i10, i11));
        }
        i13 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i12 |= i13;
        if ((374491 & i12) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    containerColor = NavigationBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jM1013contentColorFor4WTKRHQ = ColorSchemeKt.m1013contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), containerColor);
                    i12 &= -897;
                }
                if (i17 != 0) {
                    fM1172getElevationD9Ej5fM = NavigationBarDefaults.INSTANCE.m1172getElevationD9Ej5fM();
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    windowInsets2 = NavigationBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                }
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    containerColor = NavigationBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jM1013contentColorFor4WTKRHQ = ColorSchemeKt.m1013contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), containerColor);
                    i12 &= -897;
                }
                if (i17 != 0) {
                    fM1172getElevationD9Ej5fM = NavigationBarDefaults.INSTANCE.m1172getElevationD9Ej5fM();
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    windowInsets2 = NavigationBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                }
            }
            f10 = fM1172getElevationD9Ej5fM;
            long j17 = jM1013contentColorFor4WTKRHQ;
            i14 = i12;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1596802123, i14, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:98)");
            }
            ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 105663120, true, new a(windowInsets2, content, i14));
            int i114 = 12582912 | (i14 & 14);
            int i210 = i14 << 3;
            int i211 = i114 | (i210 & 896) | (i210 & 7168) | (i210 & 57344);
            WindowInsets windowInsets8 = windowInsets2;
            SurfaceKt.m1329SurfaceT9BRK9s(modifier3, null, containerColor, j17, f10, 0.0f, null, composableLambda6, composerStartRestartGroup, i211, 98);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            windowInsets2 = windowInsets8;
            jM1013contentColorFor4WTKRHQ = j17;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    containerColor = NavigationBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jM1013contentColorFor4WTKRHQ = ColorSchemeKt.m1013contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), containerColor);
                    i12 &= -897;
                }
                if (i17 != 0) {
                    fM1172getElevationD9Ej5fM = NavigationBarDefaults.INSTANCE.m1172getElevationD9Ej5fM();
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    windowInsets2 = NavigationBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                }
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    containerColor = NavigationBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jM1013contentColorFor4WTKRHQ = ColorSchemeKt.m1013contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), containerColor);
                    i12 &= -897;
                }
                if (i17 != 0) {
                    fM1172getElevationD9Ej5fM = NavigationBarDefaults.INSTANCE.m1172getElevationD9Ej5fM();
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    windowInsets2 = NavigationBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                }
            }
            f10 = fM1172getElevationD9Ej5fM;
            long j18 = jM1013contentColorFor4WTKRHQ;
            i14 = i12;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1596802123, i14, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:98)");
            }
            ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 105663120, true, new a(windowInsets2, content, i14));
            int i115 = 12582912 | (i14 & 14);
            int i212 = i14 << 3;
            int i213 = i115 | (i212 & 896) | (i212 & 7168) | (i212 & 57344);
            WindowInsets windowInsets9 = windowInsets2;
            SurfaceKt.m1329SurfaceT9BRK9s(modifier3, null, containerColor, j18, f10, 0.0f, null, composableLambda7, composerStartRestartGroup, i213, 98);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            windowInsets2 = windowInsets9;
            jM1013contentColorFor4WTKRHQ = j18;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, containerColor, jM1013contentColorFor4WTKRHQ, f10, windowInsets2, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0123  */
    /* JADX WARN: Code duplicated, block: B:102:0x012b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0131  */
    /* JADX WARN: Code duplicated, block: B:105:0x0134  */
    /* JADX WARN: Code duplicated, block: B:109:0x0142  */
    /* JADX WARN: Code duplicated, block: B:113:0x0156  */
    /* JADX WARN: Code duplicated, block: B:115:0x0161  */
    /* JADX WARN: Code duplicated, block: B:122:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x017f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0182  */
    /* JADX WARN: Code duplicated, block: B:126:0x0186  */
    /* JADX WARN: Code duplicated, block: B:128:0x0189  */
    /* JADX WARN: Code duplicated, block: B:129:0x018b  */
    /* JADX WARN: Code duplicated, block: B:131:0x018e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0193  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:139:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01da  */
    /* JADX WARN: Code duplicated, block: B:145:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:148:0x0210  */
    /* JADX WARN: Code duplicated, block: B:149:0x022e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0243  */
    /* JADX WARN: Code duplicated, block: B:153:0x0251  */
    /* JADX WARN: Code duplicated, block: B:156:0x029a  */
    /* JADX WARN: Code duplicated, block: B:158:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:161:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:164:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:165:0x0301  */
    /* JADX WARN: Code duplicated, block: B:168:0x0321  */
    /* JADX WARN: Code duplicated, block: B:169:0x0324  */
    /* JADX WARN: Code duplicated, block: B:172:0x0389  */
    /* JADX WARN: Code duplicated, block: B:174:0x038f  */
    /* JADX WARN: Code duplicated, block: B:177:0x03db  */
    /* JADX WARN: Code duplicated, block: B:182:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x0104  */
    /* JADX WARN: Code duplicated, block: B:93:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x0116  */
    /* JADX WARN: Code duplicated, block: B:99:0x011c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationBarItem(@NotNull RowScope rowScope, boolean z10, @NotNull Function0<Unit> onClick, @NotNull Function2<? super Composer, ? super Integer, Unit> icon, @Nullable Modifier modifier, boolean z11, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, boolean z12, @Nullable NavigationBarItemColors navigationBarItemColors, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Composer composer, int i10, int i11) {
        int i12;
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
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function4;
        NavigationBarItemColors navigationBarItemColorsM1174colors69fazGs;
        MutableInteractionSource mutableInteractionSource2;
        boolean z15;
        boolean z16;
        int i21;
        NavigationBarItemColors navigationBarItemColors2;
        Object objRememberedValue;
        int i22;
        NavigationBarItemColors navigationBarItemColors3;
        Composer composer2;
        int i23;
        ComposableLambda composableLambda;
        Object objRememberedValue2;
        Composer.Companion companion;
        MutableState mutableState;
        boolean zChanged;
        Object objRememberedValue3;
        Function0<ComposeUiNode> constructor;
        float f6;
        long jOffset;
        MutableInteractionSource mutableInteractionSource3;
        boolean zChanged2;
        Object objRememberedValue4;
        Modifier modifier3;
        NavigationBarItemColors navigationBarItemColors4;
        Function2<? super Composer, ? super Integer, Unit> function5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(rowScope, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer composerStartRestartGroup = composer.startRestartGroup(-663510974);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(rowScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(icon) ? 2048 : 1024;
        }
        int i24 = i11 & 8;
        if (i24 == 0) {
            if ((i10 & 57344) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((458752 & i10) == 0) {
                    z13 = z11;
                    if (composerStartRestartGroup.changed(z13)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((3670016 & i10) == 0) {
                        function3 = function2;
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        i12 |= 12582912;
                        z14 = z12;
                    } else {
                        z14 = z12;
                        if ((i10 & 29360128) == 0) {
                            if (composerStartRestartGroup.changed(z14)) {
                                i18 = 8388608;
                            } else {
                                i18 = 4194304;
                            }
                            i12 |= i18;
                        }
                    }
                    if ((i10 & 234881024) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(navigationBarItemColors)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 1879048192) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i20 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i20 = 268435456;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 1533916891) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                                i12 &= -234881025;
                            } else {
                                navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                            function3 = function4;
                            z15 = z13;
                            z16 = z14;
                            i21 = i12;
                            navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 128) != 0) {
                                i12 &= -234881025;
                            }
                            modifier2 = modifier;
                            mutableInteractionSource2 = mutableInteractionSource;
                            z15 = z13;
                            z16 = z14;
                            navigationBarItemColors2 = navigationBarItemColors;
                            i21 = i12;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                        }
                        i22 = i21;
                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                        navigationBarItemColors3 = navigationBarItemColors2;
                        composer2 = composerStartRestartGroup;
                        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1419576100, true, new g(navigationBarItemColors2, z10, z15, i21, function3, z16, icon));
                        if (function3 != null) {
                            composableLambda = ComposableLambdaKt.composableLambda(composer2, 1644987592, true, new h(navigationBarItemColors3, z10, z15, i22, function3));
                            i23 = -492369756;
                        } else {
                            i23 = -492369756;
                            composableLambda = null;
                        }
                        composer2.startReplaceableGroup(i23);
                        objRememberedValue2 = composer2.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Modifier modifierA = x.n1.a(rowScope, SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource4, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                        composer2.startReplaceableGroup(1157296644);
                        zChanged = composer2.changed(mutableState);
                        objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new c(mutableState);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierA, (Function1) objRememberedValue3);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                        Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierOnSizeChanged);
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
                        Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, density));
                        ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (z10) {
                            f6 = 1.0f;
                        } else {
                            f6 = 0.0f;
                        }
                        boolean z17 = z15;
                        State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(f6, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        jOffset = OffsetKt.Offset((((Number) mutableState.getValue()).intValue() - density2.mo413roundToPx0680j_4(NavigationBarTokens.INSTANCE.m1785getActiveIndicatorWidthD9Ej5fM())) / 2, density2.mo415toPx0680j_4(f10715f));
                        Unit unit = Unit.INSTANCE;
                        Offset offsetM2264boximpl = Offset.m2264boximpl(jOffset);
                        composer2.startReplaceableGroup(511388516);
                        mutableInteractionSource3 = mutableInteractionSource4;
                        zChanged2 = composer2.changed(offsetM2264boximpl) | composer2.changed(mutableInteractionSource3);
                        objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceableGroup();
                        a(ComposableLambdaKt.composableLambda(composer2, 691730997, true, new e((MappedInteractionSource) objRememberedValue4)), ComposableLambdaKt.composableLambda(composer2, -474426875, true, new d(navigationBarItemColors3, stateAnimateFloatAsState)), composableLambda2, composableLambda, z16, stateAnimateFloatAsState.getValue().floatValue(), composer2, ((i22 >> 9) & 57344) | 438);
                        if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        z13 = z17;
                        modifier3 = modifier2;
                        navigationBarItemColors4 = navigationBarItemColors3;
                        function5 = function3;
                        z14 = z16;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        mutableInteractionSource3 = mutableInteractionSource;
                        composer2 = composerStartRestartGroup;
                        function5 = function3;
                        navigationBarItemColors4 = navigationBarItemColors;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(rowScope, z10, onClick, icon, modifier3, z13, function5, z14, navigationBarItemColors4, mutableInteractionSource3, i10, i11));
                }
                i12 |= 1572864;
                function3 = function2;
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 12582912;
                    z14 = z12;
                } else {
                    z14 = z12;
                    if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(z14)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 234881024) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(navigationBarItemColors)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i20 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((i12 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -234881025;
                        } else {
                            navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                        function3 = function4;
                        z15 = z13;
                        z16 = z14;
                        i21 = i12;
                        navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -234881025;
                        } else {
                            navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                        function3 = function4;
                        z15 = z13;
                        z16 = z14;
                        i21 = i12;
                        navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                    }
                    i22 = i21;
                    MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource2;
                    navigationBarItemColors3 = navigationBarItemColors2;
                    composer2 = composerStartRestartGroup;
                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer2, -1419576100, true, new g(navigationBarItemColors2, z10, z15, i21, function3, z16, icon));
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composer2, 1644987592, true, new h(navigationBarItemColors3, z10, z15, i22, function3));
                        i23 = -492369756;
                    } else {
                        i23 = -492369756;
                        composableLambda = null;
                    }
                    composer2.startReplaceableGroup(i23);
                    objRememberedValue2 = composer2.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Modifier modifierA2 = x.n1.a(rowScope, SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource5, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                    composer2.startReplaceableGroup(1157296644);
                    zChanged = composer2.changed(mutableState);
                    objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(mutableState);
                        composer2.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(mutableState);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierOnSizeChanged2 = OnRemeasuredModifierKt.onSizeChanged(modifierA2, (Function1) objRememberedValue3);
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                    Density density3 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                    LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierOnSizeChanged2);
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
                    Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composer2);
                    Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, composerM2074constructorimpl2, density3));
                    ai.a.j(0, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    if (z10) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    boolean z18 = z15;
                    State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(f6, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                    Density density4 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    jOffset = OffsetKt.Offset((((Number) mutableState.getValue()).intValue() - density4.mo413roundToPx0680j_4(NavigationBarTokens.INSTANCE.m1785getActiveIndicatorWidthD9Ej5fM())) / 2, density4.mo415toPx0680j_4(f10715f));
                    Unit unit2 = Unit.INSTANCE;
                    Offset offsetM2264boximpl2 = Offset.m2264boximpl(jOffset);
                    composer2.startReplaceableGroup(511388516);
                    mutableInteractionSource3 = mutableInteractionSource5;
                    zChanged2 = composer2.changed(offsetM2264boximpl2) | composer2.changed(mutableInteractionSource3);
                    objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    a(ComposableLambdaKt.composableLambda(composer2, 691730997, true, new e((MappedInteractionSource) objRememberedValue4)), ComposableLambdaKt.composableLambda(composer2, -474426875, true, new d(navigationBarItemColors3, stateAnimateFloatAsState2)), composableLambda3, composableLambda, z16, stateAnimateFloatAsState2.getValue().floatValue(), composer2, ((i22 >> 9) & 57344) | 438);
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    z13 = z18;
                    modifier3 = modifier2;
                    navigationBarItemColors4 = navigationBarItemColors3;
                    function5 = function3;
                    z14 = z16;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -234881025;
                        } else {
                            navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                        function3 = function4;
                        z15 = z13;
                        z16 = z14;
                        i21 = i12;
                        navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -234881025;
                        } else {
                            navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                        function3 = function4;
                        z15 = z13;
                        z16 = z14;
                        i21 = i12;
                        navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                    }
                    i22 = i21;
                    MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource2;
                    navigationBarItemColors3 = navigationBarItemColors2;
                    composer2 = composerStartRestartGroup;
                    ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composer2, -1419576100, true, new g(navigationBarItemColors2, z10, z15, i21, function3, z16, icon));
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composer2, 1644987592, true, new h(navigationBarItemColors3, z10, z15, i22, function3));
                        i23 = -492369756;
                    } else {
                        i23 = -492369756;
                        composableLambda = null;
                    }
                    composer2.startReplaceableGroup(i23);
                    objRememberedValue2 = composer2.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Modifier modifierA3 = x.n1.a(rowScope, SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource6, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                    composer2.startReplaceableGroup(1157296644);
                    zChanged = composer2.changed(mutableState);
                    objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(mutableState);
                        composer2.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(mutableState);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierOnSizeChanged3 = OnRemeasuredModifierKt.onSizeChanged(modifierA3, (Function1) objRememberedValue3);
                    Alignment center3 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center3, false, composer2, 6);
                    Density density5 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                    LayoutDirection layoutDirection3 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    constructor = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierOnSizeChanged3);
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
                    Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composer2);
                    Updater.m2081setimpl(composerM2074constructorimpl3, layoutDirection3, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion4, composerM2074constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, composerM2074constructorimpl3, density5));
                    ai.a.j(0, function3MaterializerOf3, androidx.appcompat.widget.g0.b(companion4, composerM2074constructorimpl3, viewConfiguration3, composer2, composer2), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    if (z10) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    boolean z19 = z15;
                    State<Float> stateAnimateFloatAsState3 = AnimateAsStateKt.animateFloatAsState(f6, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                    Density density6 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    jOffset = OffsetKt.Offset((((Number) mutableState.getValue()).intValue() - density6.mo413roundToPx0680j_4(NavigationBarTokens.INSTANCE.m1785getActiveIndicatorWidthD9Ej5fM())) / 2, density6.mo415toPx0680j_4(f10715f));
                    Unit unit3 = Unit.INSTANCE;
                    Offset offsetM2264boximpl3 = Offset.m2264boximpl(jOffset);
                    composer2.startReplaceableGroup(511388516);
                    mutableInteractionSource3 = mutableInteractionSource6;
                    zChanged2 = composer2.changed(offsetM2264boximpl3) | composer2.changed(mutableInteractionSource3);
                    objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    a(ComposableLambdaKt.composableLambda(composer2, 691730997, true, new e((MappedInteractionSource) objRememberedValue4)), ComposableLambdaKt.composableLambda(composer2, -474426875, true, new d(navigationBarItemColors3, stateAnimateFloatAsState3)), composableLambda4, composableLambda, z16, stateAnimateFloatAsState3.getValue().floatValue(), composer2, ((i22 >> 9) & 57344) | 438);
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    z13 = z19;
                    modifier3 = modifier2;
                    navigationBarItemColors4 = navigationBarItemColors3;
                    function5 = function3;
                    z14 = z16;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(rowScope, z10, onClick, icon, modifier3, z13, function5, z14, navigationBarItemColors4, mutableInteractionSource3, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z13 = z11;
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((3670016 & i10) == 0) {
                    function3 = function2;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 12582912;
                    z14 = z12;
                } else {
                    z14 = z12;
                    if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(z14)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 234881024) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(navigationBarItemColors)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i20 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((i12 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -234881025;
                        } else {
                            navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                        function3 = function4;
                        z15 = z13;
                        z16 = z14;
                        i21 = i12;
                        navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -234881025;
                        } else {
                            navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                        function3 = function4;
                        z15 = z13;
                        z16 = z14;
                        i21 = i12;
                        navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                    }
                    i22 = i21;
                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource2;
                    navigationBarItemColors3 = navigationBarItemColors2;
                    composer2 = composerStartRestartGroup;
                    ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composer2, -1419576100, true, new g(navigationBarItemColors2, z10, z15, i21, function3, z16, icon));
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composer2, 1644987592, true, new h(navigationBarItemColors3, z10, z15, i22, function3));
                        i23 = -492369756;
                    } else {
                        i23 = -492369756;
                        composableLambda = null;
                    }
                    composer2.startReplaceableGroup(i23);
                    objRememberedValue2 = composer2.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Modifier modifierA4 = x.n1.a(rowScope, SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource7, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                    composer2.startReplaceableGroup(1157296644);
                    zChanged = composer2.changed(mutableState);
                    objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(mutableState);
                        composer2.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(mutableState);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierOnSizeChanged4 = OnRemeasuredModifierKt.onSizeChanged(modifierA4, (Function1) objRememberedValue3);
                    Alignment center4 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center4, false, composer2, 6);
                    Density density7 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                    LayoutDirection layoutDirection4 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration4 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    constructor = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierOnSizeChanged4);
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
                    Composer composerM2074constructorimpl4 = Updater.m2074constructorimpl(composer2);
                    Updater.m2081setimpl(composerM2074constructorimpl4, layoutDirection4, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion5, composerM2074constructorimpl4, measurePolicyRememberBoxMeasurePolicy4, composerM2074constructorimpl4, density7));
                    ai.a.j(0, function3MaterializerOf4, androidx.appcompat.widget.g0.b(companion5, composerM2074constructorimpl4, viewConfiguration4, composer2, composer2), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    if (z10) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    boolean z110 = z15;
                    State<Float> stateAnimateFloatAsState4 = AnimateAsStateKt.animateFloatAsState(f6, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                    Density density8 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    jOffset = OffsetKt.Offset((((Number) mutableState.getValue()).intValue() - density8.mo413roundToPx0680j_4(NavigationBarTokens.INSTANCE.m1785getActiveIndicatorWidthD9Ej5fM())) / 2, density8.mo415toPx0680j_4(f10715f));
                    Unit unit4 = Unit.INSTANCE;
                    Offset offsetM2264boximpl4 = Offset.m2264boximpl(jOffset);
                    composer2.startReplaceableGroup(511388516);
                    mutableInteractionSource3 = mutableInteractionSource7;
                    zChanged2 = composer2.changed(offsetM2264boximpl4) | composer2.changed(mutableInteractionSource3);
                    objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    a(ComposableLambdaKt.composableLambda(composer2, 691730997, true, new e((MappedInteractionSource) objRememberedValue4)), ComposableLambdaKt.composableLambda(composer2, -474426875, true, new d(navigationBarItemColors3, stateAnimateFloatAsState4)), composableLambda5, composableLambda, z16, stateAnimateFloatAsState4.getValue().floatValue(), composer2, ((i22 >> 9) & 57344) | 438);
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    z13 = z110;
                    modifier3 = modifier2;
                    navigationBarItemColors4 = navigationBarItemColors3;
                    function5 = function3;
                    z14 = z16;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -234881025;
                        } else {
                            navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                        function3 = function4;
                        z15 = z13;
                        z16 = z14;
                        i21 = i12;
                        navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -234881025;
                        } else {
                            navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                        function3 = function4;
                        z15 = z13;
                        z16 = z14;
                        i21 = i12;
                        navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                    }
                    i22 = i21;
                    MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource2;
                    navigationBarItemColors3 = navigationBarItemColors2;
                    composer2 = composerStartRestartGroup;
                    ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composer2, -1419576100, true, new g(navigationBarItemColors2, z10, z15, i21, function3, z16, icon));
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composer2, 1644987592, true, new h(navigationBarItemColors3, z10, z15, i22, function3));
                        i23 = -492369756;
                    } else {
                        i23 = -492369756;
                        composableLambda = null;
                    }
                    composer2.startReplaceableGroup(i23);
                    objRememberedValue2 = composer2.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Modifier modifierA5 = x.n1.a(rowScope, SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource8, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                    composer2.startReplaceableGroup(1157296644);
                    zChanged = composer2.changed(mutableState);
                    objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(mutableState);
                        composer2.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(mutableState);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierOnSizeChanged5 = OnRemeasuredModifierKt.onSizeChanged(modifierA5, (Function1) objRememberedValue3);
                    Alignment center5 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center5, false, composer2, 6);
                    Density density9 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                    LayoutDirection layoutDirection5 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration5 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    constructor = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierOnSizeChanged5);
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
                    Composer composerM2074constructorimpl5 = Updater.m2074constructorimpl(composer2);
                    Updater.m2081setimpl(composerM2074constructorimpl5, layoutDirection5, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion6, composerM2074constructorimpl5, measurePolicyRememberBoxMeasurePolicy5, composerM2074constructorimpl5, density9));
                    ai.a.j(0, function3MaterializerOf5, androidx.appcompat.widget.g0.b(companion6, composerM2074constructorimpl5, viewConfiguration5, composer2, composer2), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    if (z10) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    boolean z111 = z15;
                    State<Float> stateAnimateFloatAsState5 = AnimateAsStateKt.animateFloatAsState(f6, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                    Density density10 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    jOffset = OffsetKt.Offset((((Number) mutableState.getValue()).intValue() - density10.mo413roundToPx0680j_4(NavigationBarTokens.INSTANCE.m1785getActiveIndicatorWidthD9Ej5fM())) / 2, density10.mo415toPx0680j_4(f10715f));
                    Unit unit5 = Unit.INSTANCE;
                    Offset offsetM2264boximpl5 = Offset.m2264boximpl(jOffset);
                    composer2.startReplaceableGroup(511388516);
                    mutableInteractionSource3 = mutableInteractionSource8;
                    zChanged2 = composer2.changed(offsetM2264boximpl5) | composer2.changed(mutableInteractionSource3);
                    objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    a(ComposableLambdaKt.composableLambda(composer2, 691730997, true, new e((MappedInteractionSource) objRememberedValue4)), ComposableLambdaKt.composableLambda(composer2, -474426875, true, new d(navigationBarItemColors3, stateAnimateFloatAsState5)), composableLambda6, composableLambda, z16, stateAnimateFloatAsState5.getValue().floatValue(), composer2, ((i22 >> 9) & 57344) | 438);
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    z13 = z111;
                    modifier3 = modifier2;
                    navigationBarItemColors4 = navigationBarItemColors3;
                    function5 = function3;
                    z14 = z16;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(rowScope, z10, onClick, icon, modifier3, z13, function5, z14, navigationBarItemColors4, mutableInteractionSource3, i10, i11));
            }
            i12 |= 1572864;
            function3 = function2;
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 12582912;
                z14 = z12;
            } else {
                z14 = z12;
                if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z14)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 234881024) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(navigationBarItemColors)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 805306368;
            } else if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i20 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i20 = 268435456;
                }
                i12 |= i20;
            }
            if ((i12 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -234881025;
                    } else {
                        navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                    function3 = function4;
                    z15 = z13;
                    z16 = z14;
                    i21 = i12;
                    navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -234881025;
                    } else {
                        navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                    function3 = function4;
                    z15 = z13;
                    z16 = z14;
                    i21 = i12;
                    navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                }
                i22 = i21;
                MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource2;
                navigationBarItemColors3 = navigationBarItemColors2;
                composer2 = composerStartRestartGroup;
                ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composer2, -1419576100, true, new g(navigationBarItemColors2, z10, z15, i21, function3, z16, icon));
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composer2, 1644987592, true, new h(navigationBarItemColors3, z10, z15, i22, function3));
                    i23 = -492369756;
                } else {
                    i23 = -492369756;
                    composableLambda = null;
                }
                composer2.startReplaceableGroup(i23);
                objRememberedValue2 = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Modifier modifierA6 = x.n1.a(rowScope, SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource9, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                composer2.startReplaceableGroup(1157296644);
                zChanged = composer2.changed(mutableState);
                objRememberedValue3 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new c(mutableState);
                    composer2.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new c(mutableState);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceableGroup();
                Modifier modifierOnSizeChanged6 = OnRemeasuredModifierKt.onSizeChanged(modifierA6, (Function1) objRememberedValue3);
                Alignment center6 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(center6, false, composer2, 6);
                Density density11 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection6 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration6 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                constructor = companion7.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierOnSizeChanged6);
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
                Composer composerM2074constructorimpl6 = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl6, layoutDirection6, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion7, composerM2074constructorimpl6, measurePolicyRememberBoxMeasurePolicy6, composerM2074constructorimpl6, density11));
                ai.a.j(0, function3MaterializerOf6, androidx.appcompat.widget.g0.b(companion7, composerM2074constructorimpl6, viewConfiguration6, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                if (z10) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                boolean z112 = z15;
                State<Float> stateAnimateFloatAsState6 = AnimateAsStateKt.animateFloatAsState(f6, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                Density density12 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                jOffset = OffsetKt.Offset((((Number) mutableState.getValue()).intValue() - density12.mo413roundToPx0680j_4(NavigationBarTokens.INSTANCE.m1785getActiveIndicatorWidthD9Ej5fM())) / 2, density12.mo415toPx0680j_4(f10715f));
                Unit unit6 = Unit.INSTANCE;
                Offset offsetM2264boximpl6 = Offset.m2264boximpl(jOffset);
                composer2.startReplaceableGroup(511388516);
                mutableInteractionSource3 = mutableInteractionSource9;
                zChanged2 = composer2.changed(offsetM2264boximpl6) | composer2.changed(mutableInteractionSource3);
                objRememberedValue4 = composer2.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                a(ComposableLambdaKt.composableLambda(composer2, 691730997, true, new e((MappedInteractionSource) objRememberedValue4)), ComposableLambdaKt.composableLambda(composer2, -474426875, true, new d(navigationBarItemColors3, stateAnimateFloatAsState6)), composableLambda7, composableLambda, z16, stateAnimateFloatAsState6.getValue().floatValue(), composer2, ((i22 >> 9) & 57344) | 438);
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                z13 = z112;
                modifier3 = modifier2;
                navigationBarItemColors4 = navigationBarItemColors3;
                function5 = function3;
                z14 = z16;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -234881025;
                    } else {
                        navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                    function3 = function4;
                    z15 = z13;
                    z16 = z14;
                    i21 = i12;
                    navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -234881025;
                    } else {
                        navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                    function3 = function4;
                    z15 = z13;
                    z16 = z14;
                    i21 = i12;
                    navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                }
                i22 = i21;
                MutableInteractionSource mutableInteractionSource10 = mutableInteractionSource2;
                navigationBarItemColors3 = navigationBarItemColors2;
                composer2 = composerStartRestartGroup;
                ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composer2, -1419576100, true, new g(navigationBarItemColors2, z10, z15, i21, function3, z16, icon));
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composer2, 1644987592, true, new h(navigationBarItemColors3, z10, z15, i22, function3));
                    i23 = -492369756;
                } else {
                    i23 = -492369756;
                    composableLambda = null;
                }
                composer2.startReplaceableGroup(i23);
                objRememberedValue2 = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Modifier modifierA7 = x.n1.a(rowScope, SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource10, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                composer2.startReplaceableGroup(1157296644);
                zChanged = composer2.changed(mutableState);
                objRememberedValue3 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new c(mutableState);
                    composer2.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new c(mutableState);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceableGroup();
                Modifier modifierOnSizeChanged7 = OnRemeasuredModifierKt.onSizeChanged(modifierA7, (Function1) objRememberedValue3);
                Alignment center7 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(center7, false, composer2, 6);
                Density density13 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection7 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration7 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                constructor = companion8.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifierOnSizeChanged7);
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
                Composer composerM2074constructorimpl7 = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl7, layoutDirection7, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion8, composerM2074constructorimpl7, measurePolicyRememberBoxMeasurePolicy7, composerM2074constructorimpl7, density13));
                ai.a.j(0, function3MaterializerOf7, androidx.appcompat.widget.g0.b(companion8, composerM2074constructorimpl7, viewConfiguration7, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                if (z10) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                boolean z113 = z15;
                State<Float> stateAnimateFloatAsState7 = AnimateAsStateKt.animateFloatAsState(f6, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                Density density14 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                jOffset = OffsetKt.Offset((((Number) mutableState.getValue()).intValue() - density14.mo413roundToPx0680j_4(NavigationBarTokens.INSTANCE.m1785getActiveIndicatorWidthD9Ej5fM())) / 2, density14.mo415toPx0680j_4(f10715f));
                Unit unit7 = Unit.INSTANCE;
                Offset offsetM2264boximpl7 = Offset.m2264boximpl(jOffset);
                composer2.startReplaceableGroup(511388516);
                mutableInteractionSource3 = mutableInteractionSource10;
                zChanged2 = composer2.changed(offsetM2264boximpl7) | composer2.changed(mutableInteractionSource3);
                objRememberedValue4 = composer2.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                a(ComposableLambdaKt.composableLambda(composer2, 691730997, true, new e((MappedInteractionSource) objRememberedValue4)), ComposableLambdaKt.composableLambda(composer2, -474426875, true, new d(navigationBarItemColors3, stateAnimateFloatAsState7)), composableLambda8, composableLambda, z16, stateAnimateFloatAsState7.getValue().floatValue(), composer2, ((i22 >> 9) & 57344) | 438);
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                z13 = z113;
                modifier3 = modifier2;
                navigationBarItemColors4 = navigationBarItemColors3;
                function5 = function3;
                z14 = z16;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(rowScope, z10, onClick, icon, modifier3, z13, function5, z14, navigationBarItemColors4, mutableInteractionSource3, i10, i11));
        }
        i12 |= 24576;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((458752 & i10) == 0) {
                z13 = z11;
                if (composerStartRestartGroup.changed(z13)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i12 |= i14;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((3670016 & i10) == 0) {
                    function3 = function2;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 12582912;
                    z14 = z12;
                } else {
                    z14 = z12;
                    if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(z14)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 234881024) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(navigationBarItemColors)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i20 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((i12 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -234881025;
                        } else {
                            navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                        function3 = function4;
                        z15 = z13;
                        z16 = z14;
                        i21 = i12;
                        navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -234881025;
                        } else {
                            navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                        function3 = function4;
                        z15 = z13;
                        z16 = z14;
                        i21 = i12;
                        navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                    }
                    i22 = i21;
                    MutableInteractionSource mutableInteractionSource11 = mutableInteractionSource2;
                    navigationBarItemColors3 = navigationBarItemColors2;
                    composer2 = composerStartRestartGroup;
                    ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composer2, -1419576100, true, new g(navigationBarItemColors2, z10, z15, i21, function3, z16, icon));
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composer2, 1644987592, true, new h(navigationBarItemColors3, z10, z15, i22, function3));
                        i23 = -492369756;
                    } else {
                        i23 = -492369756;
                        composableLambda = null;
                    }
                    composer2.startReplaceableGroup(i23);
                    objRememberedValue2 = composer2.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Modifier modifierA8 = x.n1.a(rowScope, SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource11, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                    composer2.startReplaceableGroup(1157296644);
                    zChanged = composer2.changed(mutableState);
                    objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(mutableState);
                        composer2.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(mutableState);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierOnSizeChanged8 = OnRemeasuredModifierKt.onSizeChanged(modifierA8, (Function1) objRememberedValue3);
                    Alignment center8 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy8 = BoxKt.rememberBoxMeasurePolicy(center8, false, composer2, 6);
                    Density density15 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                    LayoutDirection layoutDirection8 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration8 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    constructor = companion9.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(modifierOnSizeChanged8);
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
                    Composer composerM2074constructorimpl8 = Updater.m2074constructorimpl(composer2);
                    Updater.m2081setimpl(composerM2074constructorimpl8, layoutDirection8, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion9, composerM2074constructorimpl8, measurePolicyRememberBoxMeasurePolicy8, composerM2074constructorimpl8, density15));
                    ai.a.j(0, function3MaterializerOf8, androidx.appcompat.widget.g0.b(companion9, composerM2074constructorimpl8, viewConfiguration8, composer2, composer2), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                    if (z10) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    boolean z114 = z15;
                    State<Float> stateAnimateFloatAsState8 = AnimateAsStateKt.animateFloatAsState(f6, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                    Density density16 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    jOffset = OffsetKt.Offset((((Number) mutableState.getValue()).intValue() - density16.mo413roundToPx0680j_4(NavigationBarTokens.INSTANCE.m1785getActiveIndicatorWidthD9Ej5fM())) / 2, density16.mo415toPx0680j_4(f10715f));
                    Unit unit8 = Unit.INSTANCE;
                    Offset offsetM2264boximpl8 = Offset.m2264boximpl(jOffset);
                    composer2.startReplaceableGroup(511388516);
                    mutableInteractionSource3 = mutableInteractionSource11;
                    zChanged2 = composer2.changed(offsetM2264boximpl8) | composer2.changed(mutableInteractionSource3);
                    objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    a(ComposableLambdaKt.composableLambda(composer2, 691730997, true, new e((MappedInteractionSource) objRememberedValue4)), ComposableLambdaKt.composableLambda(composer2, -474426875, true, new d(navigationBarItemColors3, stateAnimateFloatAsState8)), composableLambda9, composableLambda, z16, stateAnimateFloatAsState8.getValue().floatValue(), composer2, ((i22 >> 9) & 57344) | 438);
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    z13 = z114;
                    modifier3 = modifier2;
                    navigationBarItemColors4 = navigationBarItemColors3;
                    function5 = function3;
                    z14 = z16;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -234881025;
                        } else {
                            navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                        function3 = function4;
                        z15 = z13;
                        z16 = z14;
                        i21 = i12;
                        navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -234881025;
                        } else {
                            navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                        function3 = function4;
                        z15 = z13;
                        z16 = z14;
                        i21 = i12;
                        navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                    }
                    i22 = i21;
                    MutableInteractionSource mutableInteractionSource12 = mutableInteractionSource2;
                    navigationBarItemColors3 = navigationBarItemColors2;
                    composer2 = composerStartRestartGroup;
                    ComposableLambda composableLambda10 = ComposableLambdaKt.composableLambda(composer2, -1419576100, true, new g(navigationBarItemColors2, z10, z15, i21, function3, z16, icon));
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composer2, 1644987592, true, new h(navigationBarItemColors3, z10, z15, i22, function3));
                        i23 = -492369756;
                    } else {
                        i23 = -492369756;
                        composableLambda = null;
                    }
                    composer2.startReplaceableGroup(i23);
                    objRememberedValue2 = composer2.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Modifier modifierA9 = x.n1.a(rowScope, SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource12, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                    composer2.startReplaceableGroup(1157296644);
                    zChanged = composer2.changed(mutableState);
                    objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(mutableState);
                        composer2.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(mutableState);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierOnSizeChanged9 = OnRemeasuredModifierKt.onSizeChanged(modifierA9, (Function1) objRememberedValue3);
                    Alignment center9 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy9 = BoxKt.rememberBoxMeasurePolicy(center9, false, composer2, 6);
                    Density density17 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                    LayoutDirection layoutDirection9 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration9 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    constructor = companion10.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = LayoutKt.materializerOf(modifierOnSizeChanged9);
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
                    Composer composerM2074constructorimpl9 = Updater.m2074constructorimpl(composer2);
                    Updater.m2081setimpl(composerM2074constructorimpl9, layoutDirection9, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion10, composerM2074constructorimpl9, measurePolicyRememberBoxMeasurePolicy9, composerM2074constructorimpl9, density17));
                    ai.a.j(0, function3MaterializerOf9, androidx.appcompat.widget.g0.b(companion10, composerM2074constructorimpl9, viewConfiguration9, composer2, composer2), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                    if (z10) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    boolean z115 = z15;
                    State<Float> stateAnimateFloatAsState9 = AnimateAsStateKt.animateFloatAsState(f6, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                    Density density18 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    jOffset = OffsetKt.Offset((((Number) mutableState.getValue()).intValue() - density18.mo413roundToPx0680j_4(NavigationBarTokens.INSTANCE.m1785getActiveIndicatorWidthD9Ej5fM())) / 2, density18.mo415toPx0680j_4(f10715f));
                    Unit unit9 = Unit.INSTANCE;
                    Offset offsetM2264boximpl9 = Offset.m2264boximpl(jOffset);
                    composer2.startReplaceableGroup(511388516);
                    mutableInteractionSource3 = mutableInteractionSource12;
                    zChanged2 = composer2.changed(offsetM2264boximpl9) | composer2.changed(mutableInteractionSource3);
                    objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    a(ComposableLambdaKt.composableLambda(composer2, 691730997, true, new e((MappedInteractionSource) objRememberedValue4)), ComposableLambdaKt.composableLambda(composer2, -474426875, true, new d(navigationBarItemColors3, stateAnimateFloatAsState9)), composableLambda10, composableLambda, z16, stateAnimateFloatAsState9.getValue().floatValue(), composer2, ((i22 >> 9) & 57344) | 438);
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    z13 = z115;
                    modifier3 = modifier2;
                    navigationBarItemColors4 = navigationBarItemColors3;
                    function5 = function3;
                    z14 = z16;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(rowScope, z10, onClick, icon, modifier3, z13, function5, z14, navigationBarItemColors4, mutableInteractionSource3, i10, i11));
            }
            i12 |= 1572864;
            function3 = function2;
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 12582912;
                z14 = z12;
            } else {
                z14 = z12;
                if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z14)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 234881024) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(navigationBarItemColors)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 805306368;
            } else if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i20 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i20 = 268435456;
                }
                i12 |= i20;
            }
            if ((i12 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -234881025;
                    } else {
                        navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                    function3 = function4;
                    z15 = z13;
                    z16 = z14;
                    i21 = i12;
                    navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -234881025;
                    } else {
                        navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                    function3 = function4;
                    z15 = z13;
                    z16 = z14;
                    i21 = i12;
                    navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                }
                i22 = i21;
                MutableInteractionSource mutableInteractionSource13 = mutableInteractionSource2;
                navigationBarItemColors3 = navigationBarItemColors2;
                composer2 = composerStartRestartGroup;
                ComposableLambda composableLambda11 = ComposableLambdaKt.composableLambda(composer2, -1419576100, true, new g(navigationBarItemColors2, z10, z15, i21, function3, z16, icon));
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composer2, 1644987592, true, new h(navigationBarItemColors3, z10, z15, i22, function3));
                    i23 = -492369756;
                } else {
                    i23 = -492369756;
                    composableLambda = null;
                }
                composer2.startReplaceableGroup(i23);
                objRememberedValue2 = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Modifier modifierA10 = x.n1.a(rowScope, SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource13, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                composer2.startReplaceableGroup(1157296644);
                zChanged = composer2.changed(mutableState);
                objRememberedValue3 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new c(mutableState);
                    composer2.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new c(mutableState);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceableGroup();
                Modifier modifierOnSizeChanged10 = OnRemeasuredModifierKt.onSizeChanged(modifierA10, (Function1) objRememberedValue3);
                Alignment center10 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy10 = BoxKt.rememberBoxMeasurePolicy(center10, false, composer2, 6);
                Density density19 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection10 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration10 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                constructor = companion11.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf10 = LayoutKt.materializerOf(modifierOnSizeChanged10);
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
                Composer composerM2074constructorimpl10 = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl10, layoutDirection10, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion11, composerM2074constructorimpl10, measurePolicyRememberBoxMeasurePolicy10, composerM2074constructorimpl10, density19));
                ai.a.j(0, function3MaterializerOf10, androidx.appcompat.widget.g0.b(companion11, composerM2074constructorimpl10, viewConfiguration10, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                if (z10) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                boolean z116 = z15;
                State<Float> stateAnimateFloatAsState10 = AnimateAsStateKt.animateFloatAsState(f6, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                Density density110 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                jOffset = OffsetKt.Offset((((Number) mutableState.getValue()).intValue() - density110.mo413roundToPx0680j_4(NavigationBarTokens.INSTANCE.m1785getActiveIndicatorWidthD9Ej5fM())) / 2, density110.mo415toPx0680j_4(f10715f));
                Unit unit10 = Unit.INSTANCE;
                Offset offsetM2264boximpl10 = Offset.m2264boximpl(jOffset);
                composer2.startReplaceableGroup(511388516);
                mutableInteractionSource3 = mutableInteractionSource13;
                zChanged2 = composer2.changed(offsetM2264boximpl10) | composer2.changed(mutableInteractionSource3);
                objRememberedValue4 = composer2.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                a(ComposableLambdaKt.composableLambda(composer2, 691730997, true, new e((MappedInteractionSource) objRememberedValue4)), ComposableLambdaKt.composableLambda(composer2, -474426875, true, new d(navigationBarItemColors3, stateAnimateFloatAsState10)), composableLambda11, composableLambda, z16, stateAnimateFloatAsState10.getValue().floatValue(), composer2, ((i22 >> 9) & 57344) | 438);
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                z13 = z116;
                modifier3 = modifier2;
                navigationBarItemColors4 = navigationBarItemColors3;
                function5 = function3;
                z14 = z16;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -234881025;
                    } else {
                        navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                    function3 = function4;
                    z15 = z13;
                    z16 = z14;
                    i21 = i12;
                    navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -234881025;
                    } else {
                        navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                    function3 = function4;
                    z15 = z13;
                    z16 = z14;
                    i21 = i12;
                    navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                }
                i22 = i21;
                MutableInteractionSource mutableInteractionSource14 = mutableInteractionSource2;
                navigationBarItemColors3 = navigationBarItemColors2;
                composer2 = composerStartRestartGroup;
                ComposableLambda composableLambda12 = ComposableLambdaKt.composableLambda(composer2, -1419576100, true, new g(navigationBarItemColors2, z10, z15, i21, function3, z16, icon));
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composer2, 1644987592, true, new h(navigationBarItemColors3, z10, z15, i22, function3));
                    i23 = -492369756;
                } else {
                    i23 = -492369756;
                    composableLambda = null;
                }
                composer2.startReplaceableGroup(i23);
                objRememberedValue2 = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Modifier modifierA11 = x.n1.a(rowScope, SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource14, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                composer2.startReplaceableGroup(1157296644);
                zChanged = composer2.changed(mutableState);
                objRememberedValue3 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new c(mutableState);
                    composer2.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new c(mutableState);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceableGroup();
                Modifier modifierOnSizeChanged11 = OnRemeasuredModifierKt.onSizeChanged(modifierA11, (Function1) objRememberedValue3);
                Alignment center11 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy11 = BoxKt.rememberBoxMeasurePolicy(center11, false, composer2, 6);
                Density density111 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection11 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration11 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                constructor = companion12.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11 = LayoutKt.materializerOf(modifierOnSizeChanged11);
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
                Composer composerM2074constructorimpl11 = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl11, layoutDirection11, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion12, composerM2074constructorimpl11, measurePolicyRememberBoxMeasurePolicy11, composerM2074constructorimpl11, density111));
                ai.a.j(0, function3MaterializerOf11, androidx.appcompat.widget.g0.b(companion12, composerM2074constructorimpl11, viewConfiguration11, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                if (z10) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                boolean z117 = z15;
                State<Float> stateAnimateFloatAsState11 = AnimateAsStateKt.animateFloatAsState(f6, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                Density density112 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                jOffset = OffsetKt.Offset((((Number) mutableState.getValue()).intValue() - density112.mo413roundToPx0680j_4(NavigationBarTokens.INSTANCE.m1785getActiveIndicatorWidthD9Ej5fM())) / 2, density112.mo415toPx0680j_4(f10715f));
                Unit unit11 = Unit.INSTANCE;
                Offset offsetM2264boximpl11 = Offset.m2264boximpl(jOffset);
                composer2.startReplaceableGroup(511388516);
                mutableInteractionSource3 = mutableInteractionSource14;
                zChanged2 = composer2.changed(offsetM2264boximpl11) | composer2.changed(mutableInteractionSource3);
                objRememberedValue4 = composer2.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                a(ComposableLambdaKt.composableLambda(composer2, 691730997, true, new e((MappedInteractionSource) objRememberedValue4)), ComposableLambdaKt.composableLambda(composer2, -474426875, true, new d(navigationBarItemColors3, stateAnimateFloatAsState11)), composableLambda12, composableLambda, z16, stateAnimateFloatAsState11.getValue().floatValue(), composer2, ((i22 >> 9) & 57344) | 438);
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                z13 = z117;
                modifier3 = modifier2;
                navigationBarItemColors4 = navigationBarItemColors3;
                function5 = function3;
                z14 = z16;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(rowScope, z10, onClick, icon, modifier3, z13, function5, z14, navigationBarItemColors4, mutableInteractionSource3, i10, i11));
        }
        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        z13 = z11;
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((3670016 & i10) == 0) {
                function3 = function2;
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 12582912;
                z14 = z12;
            } else {
                z14 = z12;
                if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z14)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 234881024) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(navigationBarItemColors)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 805306368;
            } else if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i20 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i20 = 268435456;
                }
                i12 |= i20;
            }
            if ((i12 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -234881025;
                    } else {
                        navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                    function3 = function4;
                    z15 = z13;
                    z16 = z14;
                    i21 = i12;
                    navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -234881025;
                    } else {
                        navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                    function3 = function4;
                    z15 = z13;
                    z16 = z14;
                    i21 = i12;
                    navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                }
                i22 = i21;
                MutableInteractionSource mutableInteractionSource15 = mutableInteractionSource2;
                navigationBarItemColors3 = navigationBarItemColors2;
                composer2 = composerStartRestartGroup;
                ComposableLambda composableLambda13 = ComposableLambdaKt.composableLambda(composer2, -1419576100, true, new g(navigationBarItemColors2, z10, z15, i21, function3, z16, icon));
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composer2, 1644987592, true, new h(navigationBarItemColors3, z10, z15, i22, function3));
                    i23 = -492369756;
                } else {
                    i23 = -492369756;
                    composableLambda = null;
                }
                composer2.startReplaceableGroup(i23);
                objRememberedValue2 = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Modifier modifierA12 = x.n1.a(rowScope, SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource15, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                composer2.startReplaceableGroup(1157296644);
                zChanged = composer2.changed(mutableState);
                objRememberedValue3 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new c(mutableState);
                    composer2.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new c(mutableState);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceableGroup();
                Modifier modifierOnSizeChanged12 = OnRemeasuredModifierKt.onSizeChanged(modifierA12, (Function1) objRememberedValue3);
                Alignment center12 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy12 = BoxKt.rememberBoxMeasurePolicy(center12, false, composer2, 6);
                Density density113 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection12 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration12 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                constructor = companion13.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf12 = LayoutKt.materializerOf(modifierOnSizeChanged12);
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
                Composer composerM2074constructorimpl12 = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl12, layoutDirection12, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion13, composerM2074constructorimpl12, measurePolicyRememberBoxMeasurePolicy12, composerM2074constructorimpl12, density113));
                ai.a.j(0, function3MaterializerOf12, androidx.appcompat.widget.g0.b(companion13, composerM2074constructorimpl12, viewConfiguration12, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                if (z10) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                boolean z118 = z15;
                State<Float> stateAnimateFloatAsState12 = AnimateAsStateKt.animateFloatAsState(f6, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                Density density114 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                jOffset = OffsetKt.Offset((((Number) mutableState.getValue()).intValue() - density114.mo413roundToPx0680j_4(NavigationBarTokens.INSTANCE.m1785getActiveIndicatorWidthD9Ej5fM())) / 2, density114.mo415toPx0680j_4(f10715f));
                Unit unit12 = Unit.INSTANCE;
                Offset offsetM2264boximpl12 = Offset.m2264boximpl(jOffset);
                composer2.startReplaceableGroup(511388516);
                mutableInteractionSource3 = mutableInteractionSource15;
                zChanged2 = composer2.changed(offsetM2264boximpl12) | composer2.changed(mutableInteractionSource3);
                objRememberedValue4 = composer2.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                a(ComposableLambdaKt.composableLambda(composer2, 691730997, true, new e((MappedInteractionSource) objRememberedValue4)), ComposableLambdaKt.composableLambda(composer2, -474426875, true, new d(navigationBarItemColors3, stateAnimateFloatAsState12)), composableLambda13, composableLambda, z16, stateAnimateFloatAsState12.getValue().floatValue(), composer2, ((i22 >> 9) & 57344) | 438);
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                z13 = z118;
                modifier3 = modifier2;
                navigationBarItemColors4 = navigationBarItemColors3;
                function5 = function3;
                z14 = z16;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -234881025;
                    } else {
                        navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                    function3 = function4;
                    z15 = z13;
                    z16 = z14;
                    i21 = i12;
                    navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -234881025;
                    } else {
                        navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                    function3 = function4;
                    z15 = z13;
                    z16 = z14;
                    i21 = i12;
                    navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                }
                i22 = i21;
                MutableInteractionSource mutableInteractionSource16 = mutableInteractionSource2;
                navigationBarItemColors3 = navigationBarItemColors2;
                composer2 = composerStartRestartGroup;
                ComposableLambda composableLambda14 = ComposableLambdaKt.composableLambda(composer2, -1419576100, true, new g(navigationBarItemColors2, z10, z15, i21, function3, z16, icon));
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composer2, 1644987592, true, new h(navigationBarItemColors3, z10, z15, i22, function3));
                    i23 = -492369756;
                } else {
                    i23 = -492369756;
                    composableLambda = null;
                }
                composer2.startReplaceableGroup(i23);
                objRememberedValue2 = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Modifier modifierA13 = x.n1.a(rowScope, SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource16, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                composer2.startReplaceableGroup(1157296644);
                zChanged = composer2.changed(mutableState);
                objRememberedValue3 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new c(mutableState);
                    composer2.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new c(mutableState);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceableGroup();
                Modifier modifierOnSizeChanged13 = OnRemeasuredModifierKt.onSizeChanged(modifierA13, (Function1) objRememberedValue3);
                Alignment center13 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy13 = BoxKt.rememberBoxMeasurePolicy(center13, false, composer2, 6);
                Density density115 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection13 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration13 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                constructor = companion14.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf13 = LayoutKt.materializerOf(modifierOnSizeChanged13);
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
                Composer composerM2074constructorimpl13 = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl13, layoutDirection13, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion14, composerM2074constructorimpl13, measurePolicyRememberBoxMeasurePolicy13, composerM2074constructorimpl13, density115));
                ai.a.j(0, function3MaterializerOf13, androidx.appcompat.widget.g0.b(companion14, composerM2074constructorimpl13, viewConfiguration13, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                if (z10) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                boolean z119 = z15;
                State<Float> stateAnimateFloatAsState13 = AnimateAsStateKt.animateFloatAsState(f6, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                Density density116 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                jOffset = OffsetKt.Offset((((Number) mutableState.getValue()).intValue() - density116.mo413roundToPx0680j_4(NavigationBarTokens.INSTANCE.m1785getActiveIndicatorWidthD9Ej5fM())) / 2, density116.mo415toPx0680j_4(f10715f));
                Unit unit13 = Unit.INSTANCE;
                Offset offsetM2264boximpl13 = Offset.m2264boximpl(jOffset);
                composer2.startReplaceableGroup(511388516);
                mutableInteractionSource3 = mutableInteractionSource16;
                zChanged2 = composer2.changed(offsetM2264boximpl13) | composer2.changed(mutableInteractionSource3);
                objRememberedValue4 = composer2.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                a(ComposableLambdaKt.composableLambda(composer2, 691730997, true, new e((MappedInteractionSource) objRememberedValue4)), ComposableLambdaKt.composableLambda(composer2, -474426875, true, new d(navigationBarItemColors3, stateAnimateFloatAsState13)), composableLambda14, composableLambda, z16, stateAnimateFloatAsState13.getValue().floatValue(), composer2, ((i22 >> 9) & 57344) | 438);
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                z13 = z119;
                modifier3 = modifier2;
                navigationBarItemColors4 = navigationBarItemColors3;
                function5 = function3;
                z14 = z16;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(rowScope, z10, onClick, icon, modifier3, z13, function5, z14, navigationBarItemColors4, mutableInteractionSource3, i10, i11));
        }
        i12 |= 1572864;
        function3 = function2;
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 12582912;
            z14 = z12;
        } else {
            z14 = z12;
            if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z14)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
        }
        if ((i10 & 234881024) != 0) {
            i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(navigationBarItemColors)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        }
        i19 = i11 & 256;
        if (i19 != 0) {
            i12 |= 805306368;
        } else if ((i10 & 1879048192) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i20 = PKIFailureInfo.duplicateCertReq;
            } else {
                i20 = 268435456;
            }
            i12 |= i20;
        }
        if ((i12 & 1533916891) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if (i15 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if ((i11 & 128) != 0) {
                    navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                    i12 &= -234881025;
                } else {
                    navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                function3 = function4;
                z15 = z13;
                z16 = z14;
                i21 = i12;
                navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
            } else {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if (i15 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if ((i11 & 128) != 0) {
                    navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                    i12 &= -234881025;
                } else {
                    navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                function3 = function4;
                z15 = z13;
                z16 = z14;
                i21 = i12;
                navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
            }
            i22 = i21;
            MutableInteractionSource mutableInteractionSource17 = mutableInteractionSource2;
            navigationBarItemColors3 = navigationBarItemColors2;
            composer2 = composerStartRestartGroup;
            ComposableLambda composableLambda15 = ComposableLambdaKt.composableLambda(composer2, -1419576100, true, new g(navigationBarItemColors2, z10, z15, i21, function3, z16, icon));
            if (function3 != null) {
                composableLambda = ComposableLambdaKt.composableLambda(composer2, 1644987592, true, new h(navigationBarItemColors3, z10, z15, i22, function3));
                i23 = -492369756;
            } else {
                i23 = -492369756;
                composableLambda = null;
            }
            composer2.startReplaceableGroup(i23);
            objRememberedValue2 = composer2.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue2;
            Modifier modifierA14 = x.n1.a(rowScope, SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource17, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
            composer2.startReplaceableGroup(1157296644);
            zChanged = composer2.changed(mutableState);
            objRememberedValue3 = composer2.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = new c(mutableState);
                composer2.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new c(mutableState);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceableGroup();
            Modifier modifierOnSizeChanged14 = OnRemeasuredModifierKt.onSizeChanged(modifierA14, (Function1) objRememberedValue3);
            Alignment center14 = Alignment.INSTANCE.getCenter();
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy14 = BoxKt.rememberBoxMeasurePolicy(center14, false, composer2, 6);
            Density density117 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
            LayoutDirection layoutDirection14 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration14 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
            constructor = companion15.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf14 = LayoutKt.materializerOf(modifierOnSizeChanged14);
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
            Composer composerM2074constructorimpl14 = Updater.m2074constructorimpl(composer2);
            Updater.m2081setimpl(composerM2074constructorimpl14, layoutDirection14, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion15, composerM2074constructorimpl14, measurePolicyRememberBoxMeasurePolicy14, composerM2074constructorimpl14, density117));
            ai.a.j(0, function3MaterializerOf14, androidx.appcompat.widget.g0.b(companion15, composerM2074constructorimpl14, viewConfiguration14, composer2, composer2), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
            if (z10) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            boolean z1110 = z15;
            State<Float> stateAnimateFloatAsState14 = AnimateAsStateKt.animateFloatAsState(f6, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
            Density density118 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            jOffset = OffsetKt.Offset((((Number) mutableState.getValue()).intValue() - density118.mo413roundToPx0680j_4(NavigationBarTokens.INSTANCE.m1785getActiveIndicatorWidthD9Ej5fM())) / 2, density118.mo415toPx0680j_4(f10715f));
            Unit unit14 = Unit.INSTANCE;
            Offset offsetM2264boximpl14 = Offset.m2264boximpl(jOffset);
            composer2.startReplaceableGroup(511388516);
            mutableInteractionSource3 = mutableInteractionSource17;
            zChanged2 = composer2.changed(offsetM2264boximpl14) | composer2.changed(mutableInteractionSource3);
            objRememberedValue4 = composer2.rememberedValue();
            if (zChanged2) {
                objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                composer2.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceableGroup();
            a(ComposableLambdaKt.composableLambda(composer2, 691730997, true, new e((MappedInteractionSource) objRememberedValue4)), ComposableLambdaKt.composableLambda(composer2, -474426875, true, new d(navigationBarItemColors3, stateAnimateFloatAsState14)), composableLambda15, composableLambda, z16, stateAnimateFloatAsState14.getValue().floatValue(), composer2, ((i22 >> 9) & 57344) | 438);
            if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                ComposerKt.traceEventEnd();
            }
            z13 = z1110;
            modifier3 = modifier2;
            navigationBarItemColors4 = navigationBarItemColors3;
            function5 = function3;
            z14 = z16;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if (i15 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if ((i11 & 128) != 0) {
                    navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                    i12 &= -234881025;
                } else {
                    navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                function3 = function4;
                z15 = z13;
                z16 = z14;
                i21 = i12;
                navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
            } else {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if (i15 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if ((i11 & 128) != 0) {
                    navigationBarItemColorsM1174colors69fazGs = NavigationBarItemDefaults.INSTANCE.m1174colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                    i12 &= -234881025;
                } else {
                    navigationBarItemColorsM1174colors69fazGs = navigationBarItemColors;
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
                function3 = function4;
                z15 = z13;
                z16 = z14;
                i21 = i12;
                navigationBarItemColors2 = navigationBarItemColorsM1174colors69fazGs;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
            }
            i22 = i21;
            MutableInteractionSource mutableInteractionSource18 = mutableInteractionSource2;
            navigationBarItemColors3 = navigationBarItemColors2;
            composer2 = composerStartRestartGroup;
            ComposableLambda composableLambda16 = ComposableLambdaKt.composableLambda(composer2, -1419576100, true, new g(navigationBarItemColors2, z10, z15, i21, function3, z16, icon));
            if (function3 != null) {
                composableLambda = ComposableLambdaKt.composableLambda(composer2, 1644987592, true, new h(navigationBarItemColors3, z10, z15, i22, function3));
                i23 = -492369756;
            } else {
                i23 = -492369756;
                composableLambda = null;
            }
            composer2.startReplaceableGroup(i23);
            objRememberedValue2 = composer2.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue2;
            Modifier modifierA15 = x.n1.a(rowScope, SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource18, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
            composer2.startReplaceableGroup(1157296644);
            zChanged = composer2.changed(mutableState);
            objRememberedValue3 = composer2.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = new c(mutableState);
                composer2.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new c(mutableState);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceableGroup();
            Modifier modifierOnSizeChanged15 = OnRemeasuredModifierKt.onSizeChanged(modifierA15, (Function1) objRememberedValue3);
            Alignment center15 = Alignment.INSTANCE.getCenter();
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy15 = BoxKt.rememberBoxMeasurePolicy(center15, false, composer2, 6);
            Density density119 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
            LayoutDirection layoutDirection15 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration15 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
            constructor = companion16.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf15 = LayoutKt.materializerOf(modifierOnSizeChanged15);
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
            Composer composerM2074constructorimpl15 = Updater.m2074constructorimpl(composer2);
            Updater.m2081setimpl(composerM2074constructorimpl15, layoutDirection15, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion16, composerM2074constructorimpl15, measurePolicyRememberBoxMeasurePolicy15, composerM2074constructorimpl15, density119));
            ai.a.j(0, function3MaterializerOf15, androidx.appcompat.widget.g0.b(companion16, composerM2074constructorimpl15, viewConfiguration15, composer2, composer2), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
            if (z10) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            boolean z1111 = z15;
            State<Float> stateAnimateFloatAsState15 = AnimateAsStateKt.animateFloatAsState(f6, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
            Density density1110 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            jOffset = OffsetKt.Offset((((Number) mutableState.getValue()).intValue() - density1110.mo413roundToPx0680j_4(NavigationBarTokens.INSTANCE.m1785getActiveIndicatorWidthD9Ej5fM())) / 2, density1110.mo415toPx0680j_4(f10715f));
            Unit unit15 = Unit.INSTANCE;
            Offset offsetM2264boximpl15 = Offset.m2264boximpl(jOffset);
            composer2.startReplaceableGroup(511388516);
            mutableInteractionSource3 = mutableInteractionSource18;
            zChanged2 = composer2.changed(offsetM2264boximpl15) | composer2.changed(mutableInteractionSource3);
            objRememberedValue4 = composer2.rememberedValue();
            if (zChanged2) {
                objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                composer2.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new MappedInteractionSource(mutableInteractionSource3, jOffset, null);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceableGroup();
            a(ComposableLambdaKt.composableLambda(composer2, 691730997, true, new e((MappedInteractionSource) objRememberedValue4)), ComposableLambdaKt.composableLambda(composer2, -474426875, true, new d(navigationBarItemColors3, stateAnimateFloatAsState15)), composableLambda16, composableLambda, z16, stateAnimateFloatAsState15.getValue().floatValue(), composer2, ((i22 >> 9) & 57344) | 438);
            if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                ComposerKt.traceEventEnd();
            }
            z13 = z1111;
            modifier3 = modifier2;
            navigationBarItemColors4 = navigationBarItemColors3;
            function5 = function3;
            z14 = z16;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(rowScope, z10, onClick, icon, modifier3, z13, function5, z14, navigationBarItemColors4, mutableInteractionSource3, i10, i11));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void a(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, boolean z10, float f6, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(591111291);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function4) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function5) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(f6) ? 131072 : 65536;
        }
        if ((374491 & i11) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(591111291, i11, -1, "androidx.compose.material3.NavigationBarItemBaselineLayout (NavigationBar.kt:426)");
            }
            i iVar = new i(f6, z10, function5);
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
            Updater.m2081setimpl(composerM2074constructorimpl, iVar, companion2.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, density, companion2.getSetDensity());
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m2081setimpl(composerM2074constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            ai.a.j(0, function3MaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i11 & 14));
            composerStartRestartGroup.startReplaceableGroup(-311734399);
            if (f6 > 0.0f) {
                function3.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 14));
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, "icon");
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion3, false, composerStartRestartGroup, 0, -1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierLayoutId);
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
            function4.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 6) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1204551908);
            if (function5 != null) {
                Modifier modifierM298paddingVpY3zN4$default = PaddingKt.m298paddingVpY3zN4$default(AlphaKt.alpha(LayoutIdKt.layoutId(companion, "label"), z10 ? 1.0f : f6), Dp.m4389constructorimpl(f10711b / 2), 0.0f, 2, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(companion3, false, composerStartRestartGroup, 0, -1323940314);
                Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM298paddingVpY3zN4$default);
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
                androidx.datastore.preferences.protobuf.q.e((i11 >> 9) & 14, function5, composerStartRestartGroup);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new j(function2, function3, function4, function5, z10, f6, i10));
    }

    public static final void access$NavigationBarItem$lambda$4(MutableState mutableState, int i10) {
        mutableState.setValue(Integer.valueOf(i10));
    }

    public static final float access$NavigationBarItem$lambda$9$lambda$6(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: access$placeIcon-X9ElhV4, reason: not valid java name */
    public static final MeasureResult m1177access$placeIconX9ElhV4(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, long j10) {
        int iM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(j10);
        int iM4356getMaxHeightimpl = Constraints.m4356getMaxHeightimpl(j10);
        return MeasureScope.CC.q(measureScope, iM4357getMaxWidthimpl, iM4356getMaxHeightimpl, null, new l0.n2(androidx.collection.a.a(placeable, iM4357getMaxWidthimpl, 2), androidx.appcompat.app.i.a(placeable, iM4356getMaxHeightimpl, 2), androidx.collection.a.a(placeable2, iM4357getMaxWidthimpl, 2), androidx.appcompat.app.i.a(placeable2, iM4356getMaxHeightimpl, 2), iM4357getMaxWidthimpl, iM4356getMaxHeightimpl, placeable3, placeable, placeable2), 4, null);
    }

    /* JADX INFO: renamed from: access$placeLabelAndIcon-zUg2_y0, reason: not valid java name */
    public static final MeasureResult m1178access$placeLabelAndIconzUg2_y0(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, long j10, boolean z10, float f6) {
        int iM4356getMaxHeightimpl = Constraints.m4356getMaxHeightimpl(j10);
        int height = iM4356getMaxHeightimpl - placeable.getHeight();
        float f10 = f10712c;
        int iMo413roundToPx0680j_4 = height - measureScope.mo413roundToPx0680j_4(f10);
        int iMo413roundToPx0680j_5 = measureScope.mo413roundToPx0680j_4(f10);
        int iRoundToInt = mk.c.roundToInt((1 - f6) * ((z10 ? iMo413roundToPx0680j_5 : androidx.appcompat.app.i.a(placeable2, iM4356getMaxHeightimpl, 2)) - iMo413roundToPx0680j_5));
        int iM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(j10);
        return MeasureScope.CC.q(measureScope, iM4357getMaxWidthimpl, iM4356getMaxHeightimpl, null, new l0.o2(placeable4, z10, f6, placeable, androidx.collection.a.a(placeable, iM4357getMaxWidthimpl, 2), iMo413roundToPx0680j_4, iRoundToInt, placeable2, androidx.collection.a.a(placeable2, iM4357getMaxWidthimpl, 2), iMo413roundToPx0680j_5, placeable3, androidx.collection.a.a(placeable3, iM4357getMaxWidthimpl, 2), iMo413roundToPx0680j_5 - measureScope.mo413roundToPx0680j_4(f10714e), iM4357getMaxWidthimpl, measureScope), 4, null);
    }

    public static final float getNavigationBarItemHorizontalPadding() {
        return f10711b;
    }

    public static final float getNavigationBarItemVerticalPadding() {
        return f10712c;
    }
}
