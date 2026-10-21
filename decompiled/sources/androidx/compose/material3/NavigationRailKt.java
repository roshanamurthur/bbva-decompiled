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
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.NavigationRailTokens;
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
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NavigationRail.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a}\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022 \b\u0002\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0081\u0001\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00112\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\"\u001d\u0010$\u001a\u00020\u001f8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u001d\u0010'\u001a\u00020\u001f8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#\"\u001d\u0010*\u001a\u00020\u001f8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#\"\u001d\u0010-\u001a\u00020\u001f8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "header", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "content", "NavigationRail-qi6gXK8", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationRail", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", "label", "alwaysShowLabel", "Landroidx/compose/material3/NavigationRailItemColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "NavigationRailItem", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationRailItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getNavigationRailVerticalPadding", "()F", "NavigationRailVerticalPadding", "c", "getNavigationRailItemWidth", "NavigationRailItemWidth", "d", "getNavigationRailItemHeight", "NavigationRailItemHeight", "e", "getNavigationRailItemVerticalPadding", "NavigationRailItemVerticalPadding", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,668:1\n25#2:669\n460#2,13:694\n50#2:709\n49#2:710\n473#2,3:717\n456#2,11:738\n460#2,13:768\n473#2,3:782\n460#2,13:806\n473#2,3:820\n467#2,3:825\n1114#3,6:670\n1114#3,6:711\n68#4,5:676\n73#4:707\n77#4:721\n67#4,6:749\n73#4:781\n77#4:786\n67#4,6:787\n73#4:819\n77#4:824\n75#5:681\n76#5,11:683\n89#5:720\n71#5,4:722\n75#5,11:727\n75#5:755\n76#5,11:757\n89#5:785\n75#5:793\n76#5,11:795\n89#5:823\n88#5:828\n76#6:682\n76#6:708\n76#6:726\n76#6:756\n76#6:794\n76#7:829\n154#8:830\n154#8:831\n154#8:832\n58#9:833\n75#9:834\n58#9:835\n75#9:836\n58#9:837\n75#9:838\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt\n*L\n170#1:669\n191#1:694,13\n219#1:709\n219#1:710\n191#1:717,3\n435#1:738,11\n441#1:768,13\n441#1:782,3\n444#1:806,13\n444#1:820,3\n435#1:825,3\n170#1:670,6\n219#1:711,6\n191#1:676,5\n191#1:707\n191#1:721\n441#1:749,6\n441#1:781\n441#1:786\n444#1:787,6\n444#1:819\n444#1:824\n191#1:681\n191#1:683,11\n191#1:720\n435#1:722,4\n435#1:727,11\n441#1:755\n441#1:757,11\n441#1:785\n444#1:793\n444#1:795,11\n444#1:823\n435#1:828\n191#1:682\n214#1:708\n435#1:726\n441#1:756\n444#1:794\n205#1:829\n639#1:830\n645#1:831\n659#1:832\n662#1:833\n662#1:834\n665#1:835\n665#1:836\n668#1:837\n668#1:838\n*E\n"})
public final class NavigationRailKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f10874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f10875b = Dp.m4389constructorimpl(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f10876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f10877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f10878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f10879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f10880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f10881h;

    /* JADX INFO: compiled from: NavigationRail.kt */
    @SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRail$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,668:1\n78#2,2:669\n80#2:697\n84#2:702\n75#3:671\n76#3,11:673\n89#3:701\n76#4:672\n460#5,13:684\n473#5,3:698\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRail$1\n*L\n114#1:669,2\n114#1:697\n114#1:702\n114#1:671\n114#1:673,11\n114#1:701\n114#1:672\n114#1:684,13\n114#1:698,3\n*E\n"})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ WindowInsets f10882p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f10883q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f10884r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f10885s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(WindowInsets windowInsets, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function4) {
            super(2);
            this.f10882p0 = windowInsets;
            this.f10883q0 = function3;
            this.f10884r0 = i10;
            this.f10885s0 = function4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2092683357, iIntValue, -1, "androidx.compose.material3.NavigationRail.<anonymous> (NavigationRail.kt:112)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m298paddingVpY3zN4$default(SizeKt.m342widthInVpY3zN4$default(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), this.f10882p0), NavigationRailTokens.INSTANCE.m1798getContainerWidthD9Ej5fM(), 0.0f, 2, null), 0.0f, NavigationRailKt.getNavigationRailVerticalPadding(), 1, null));
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement.HorizontalOrVertical horizontalOrVerticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(NavigationRailKt.getNavigationRailVerticalPadding());
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM246spacedBy0680j_4, centerHorizontally, composer2, 54);
                Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSelectableGroup);
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
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl, measurePolicyColumnMeasurePolicy, composerM2074constructorimpl, density));
                ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(716053607);
                Function3<ColumnScope, Composer, Integer, Unit> function3 = this.f10883q0;
                int i10 = this.f10884r0;
                if (function3 != null) {
                    function3.invoke(columnScopeInstance, composer2, Integer.valueOf(((i10 >> 6) & 112) | 6));
                    SpacerKt.Spacer(SizeKt.m321height3ABfNKs(companion, NavigationRailKt.f10875b), composer2, 6);
                }
                composer2.endReplaceableGroup();
                this.f10885s0.invoke(columnScopeInstance, composer2, Integer.valueOf(((i10 >> 12) & 112) | 6));
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
        public final /* synthetic */ Modifier f10886p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f10887q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f10888r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f10889s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ WindowInsets f10890t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f10891u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f10892w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Modifier modifier, long j10, long j11, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function4, int i10, int i11) {
            super(2);
            this.f10886p0 = modifier;
            this.f10887q0 = j10;
            this.f10888r0 = j11;
            this.f10889s0 = function3;
            this.f10890t0 = windowInsets;
            this.f10891u0 = function4;
            this.v0 = i10;
            this.f10892w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            NavigationRailKt.m1188NavigationRailqi6gXK8(this.f10886p0, this.f10887q0, this.f10888r0, this.f10889s0, this.f10890t0, this.f10891u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f10892w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationRail.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ NavigationRailItemColors f10893p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f10894q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Shape f10895r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f10896s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(NavigationRailItemColors navigationRailItemColors, int i10, Shape shape, State<Float> state) {
            super(2);
            this.f10893p0 = navigationRailItemColors;
            this.f10894q0 = i10;
            this.f10895r0 = shape;
            this.f10896s0 = state;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1862011490, iIntValue, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                }
                BoxKt.Box(BackgroundKt.m121backgroundbw27NRU(LayoutIdKt.layoutId(Modifier.INSTANCE, "indicator"), Color.m2507copywmQWz5c$default(this.f10893p0.getIndicatorColor(composer2, (this.f10894q0 >> 21) & 14), NavigationRailKt.access$NavigationRailItem$lambda$5$lambda$2(this.f10896s0), 0.0f, 0.0f, 0.0f, 14, null), this.f10895r0), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationRail.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Shape f10897p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MappedInteractionSource f10898q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Shape shape, MappedInteractionSource mappedInteractionSource) {
            super(2);
            this.f10897p0 = shape;
            this.f10898q0 = mappedInteractionSource;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(211026382, iIntValue, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                }
                BoxKt.Box(IndicationKt.indication(ClipKt.clip(LayoutIdKt.layoutId(Modifier.INSTANCE, "indicatorRipple"), this.f10897p0), this.f10898q0, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7)), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationRail.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f10899p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f10900q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10901r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10902s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f10903t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10904u0;
        public final /* synthetic */ boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ NavigationRailItemColors f10905w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f10906x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f10907y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(boolean z10, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z11, Function2<? super Composer, ? super Integer, Unit> function3, boolean z12, NavigationRailItemColors navigationRailItemColors, MutableInteractionSource mutableInteractionSource, int i10, int i11) {
            super(2);
            this.f10899p0 = z10;
            this.f10900q0 = function0;
            this.f10901r0 = function2;
            this.f10902s0 = modifier;
            this.f10903t0 = z11;
            this.f10904u0 = function3;
            this.v0 = z12;
            this.f10905w0 = navigationRailItemColors;
            this.f10906x0 = mutableInteractionSource;
            this.f10907y0 = i10;
            this.E0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            NavigationRailKt.NavigationRailItem(this.f10899p0, this.f10900q0, this.f10901r0, this.f10902s0, this.f10903t0, this.f10904u0, this.v0, this.f10905w0, this.f10906x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10907y0 | 1), this.E0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationRail.kt */
    @SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItem$styledIcon$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,668:1\n67#2,6:669\n73#2:701\n77#2:706\n75#3:675\n76#3,11:677\n89#3:705\n76#4:676\n460#5,13:688\n473#5,3:702\n76#6:707\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItem$styledIcon$1\n*L\n176#1:669,6\n176#1:701\n176#1:706\n176#1:675\n176#1:677,11\n176#1:705\n176#1:676\n176#1:688,13\n176#1:702,3\n173#1:707\n*E\n"})
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ NavigationRailItemColors f10908p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f10909q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f10910r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f10911s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10912t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f10913u0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(NavigationRailItemColors navigationRailItemColors, boolean z10, boolean z11, int i10, Function2<? super Composer, ? super Integer, Unit> function2, boolean z12, Function2<? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f10908p0 = navigationRailItemColors;
            this.f10909q0 = z10;
            this.f10910r0 = z11;
            this.f10911s0 = i10;
            this.f10912t0 = function2;
            this.f10913u0 = z12;
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
                    ComposerKt.traceEventStart(-1023357515, iIntValue, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                }
                int i10 = this.f10911s0;
                boolean z10 = this.f10910r0;
                NavigationRailItemColors navigationRailItemColors = this.f10908p0;
                boolean z11 = this.f10909q0;
                State<Color> stateIconColor$material3_release = navigationRailItemColors.iconColor$material3_release(z11, z10, composer2, (i10 & 14) | ((i10 >> 9) & 112) | ((i10 >> 15) & 896));
                Modifier modifierClearAndSetSemantics = (this.f10912t0 == null || !(this.f10913u0 || z11)) ? Modifier.INSTANCE : SemanticsModifierKt.clearAndSetSemantics(Modifier.INSTANCE, v2.f14346p0);
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
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(stateIconColor$material3_release.getValue().m2518unboximpl()))}, this.v0, composer2, ((i10 >> 3) & 112) | 8);
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
    @SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItem$styledLabel$1$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,668:1\n76#2:669\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItem$styledLabel$1$1\n*L\n184#1:669\n*E\n"})
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ NavigationRailItemColors f10914p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f10915q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f10916r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f10917s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10918t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(NavigationRailItemColors navigationRailItemColors, boolean z10, boolean z11, int i10, Function2<? super Composer, ? super Integer, Unit> function2) {
            super(2);
            this.f10914p0 = navigationRailItemColors;
            this.f10915q0 = z10;
            this.f10916r0 = z11;
            this.f10917s0 = i10;
            this.f10918t0 = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-105269599, iIntValue, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                }
                TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), NavigationRailTokens.INSTANCE.getLabelTextFont());
                int i10 = this.f10917s0;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(this.f10914p0.textColor$material3_release(this.f10915q0, this.f10916r0, composer2, (i10 & 14) | ((i10 >> 9) & 112) | ((i10 >> 15) & 896)).getValue().m2518unboximpl()))}, ComposableLambdaKt.composableLambda(composer2, -288191647, true, new w2(textStyleFromToken, this.f10918t0, i10)), composer2, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationRail.kt */
    @SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItemBaselineLayout$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,668:1\n223#2,2:669\n223#2,2:673\n288#2,2:675\n223#2,2:677\n92#3:671\n92#3:672\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItemBaselineLayout$2\n*L\n452#1:669,2\n465#1:673,2\n474#1:675,2\n485#1:677,2\n454#1:671\n461#1:672\n*E\n"})
    public static final class h implements MeasurePolicy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f10919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f10921c;

        public h(float f6, boolean z10, Function2 function2) {
            this.f10919a = f6;
            this.f10920b = function2;
            this.f10921c = z10;
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
                    int iMo413roundToPx0680j_4 = Layout.mo413roundToPx0680j_4(Dp.m4389constructorimpl(NavigationRailKt.f10879f * f6)) + placeableMo3575measureBRTryo1.getWidth();
                    int iRoundToInt = mk.c.roundToInt(iMo413roundToPx0680j_4 * this.f10919a);
                    Function2<Composer, Integer, Unit> function2 = this.f10920b;
                    int iMo413roundToPx0680j_5 = Layout.mo413roundToPx0680j_4(Dp.m4389constructorimpl((function2 == null ? NavigationRailKt.f10881h : NavigationRailKt.f10880g) * f6)) + placeableMo3575measureBRTryo1.getHeight();
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
                                return NavigationRailKt.m1189access$placeIconX9ElhV4(Layout, placeableMo3575measureBRTryo1, placeableMo3575measureBRTryo2, placeableMo3575measureBRTryo3, j10);
                            }
                            Intrinsics.checkNotNull(placeableMo3575measureBRTryo0);
                            return NavigationRailKt.m1190access$placeLabelAndIconzUg2_y0(Layout, placeableMo3575measureBRTryo0, placeableMo3575measureBRTryo1, placeableMo3575measureBRTryo2, placeableMo3575measureBRTryo3, j10, this.f10921c, this.f10919a);
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

    /* JADX INFO: compiled from: NavigationRail.kt */
    public static final class i extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10922p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10923q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10924r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10925s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f10926t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ float f10927u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, boolean z10, float f6, int i10) {
            super(2);
            this.f10922p0 = function2;
            this.f10923q0 = function3;
            this.f10924r0 = function4;
            this.f10925s0 = function5;
            this.f10926t0 = z10;
            this.f10927u0 = f6;
            this.v0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            NavigationRailKt.a(this.f10922p0, this.f10923q0, this.f10924r0, this.f10925s0, this.f10926t0, this.f10927u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1));
            return Unit.INSTANCE;
        }
    }

    static {
        float f6 = 4;
        f10874a = Dp.m4389constructorimpl(f6);
        NavigationRailTokens navigationRailTokens = NavigationRailTokens.INSTANCE;
        f10876c = navigationRailTokens.m1798getContainerWidthD9Ej5fM();
        f10877d = navigationRailTokens.m1801getNoLabelActiveIndicatorHeightD9Ej5fM();
        f10878e = Dp.m4389constructorimpl(f6);
        float f10 = 2;
        f10879f = Dp.m4389constructorimpl(Dp.m4389constructorimpl(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM() - navigationRailTokens.m1799getIconSizeD9Ej5fM()) / f10);
        f10880g = Dp.m4389constructorimpl(Dp.m4389constructorimpl(navigationRailTokens.m1795getActiveIndicatorHeightD9Ej5fM() - navigationRailTokens.m1799getIconSizeD9Ej5fM()) / f10);
        f10881h = Dp.m4389constructorimpl(Dp.m4389constructorimpl(navigationRailTokens.m1801getNoLabelActiveIndicatorHeightD9Ej5fM() - navigationRailTokens.m1799getIconSizeD9Ej5fM()) / f10);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0124  */
    /* JADX WARN: Code duplicated, block: B:105:0x0137  */
    /* JADX WARN: Code duplicated, block: B:108:0x0170  */
    /* JADX WARN: Code duplicated, block: B:113:0x017c  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f2 A[PHI: r2 r4 r5 r10 r12
      0x00f2: PHI (r2v5 androidx.compose.ui.Modifier) = (r2v2 androidx.compose.ui.Modifier), (r2v9 androidx.compose.ui.Modifier) binds: [B:101:0x0122, B:86:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x00f2: PHI (r4v19 int) = (r4v14 int), (r4v22 int) binds: [B:101:0x0122, B:86:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x00f2: PHI (r5v6 long) = (r5v3 long), (r5v2 long) binds: [B:101:0x0122, B:86:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x00f2: PHI (r10v11 long) = (r10v2 long), (r10v1 long) binds: [B:101:0x0122, B:86:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x00f2: PHI (r12v10 kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) = 
      (r12v3 kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
      (r12v2 kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
     binds: [B:101:0x0122, B:86:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:94:0x0105  */
    /* JADX WARN: Code duplicated, block: B:97:0x0111  */
    /* JADX WARN: Code duplicated, block: B:99:0x011e  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: NavigationRail-qi6gXK8, reason: not valid java name */
    public static final void m1188NavigationRailqi6gXK8(@Nullable Modifier modifier, long j10, long j11, @Nullable Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, @Nullable WindowInsets windowInsets, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        long containerColor;
        long jM1014contentColorForek8zF_U;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function4;
        WindowInsets windowInsets2;
        int i13;
        Modifier modifier3;
        WindowInsets windowInsets3;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function5;
        int i14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(118552648);
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
            jM1014contentColorForek8zF_U = j11;
            i12 |= ((i11 & 4) == 0 && composerStartRestartGroup.changed(jM1014contentColorForek8zF_U)) ? 256 : 128;
        } else {
            jM1014contentColorForek8zF_U = j11;
        }
        int i17 = i11 & 8;
        if (i17 == 0) {
            if ((i10 & 7168) == 0) {
                function4 = function3;
                i12 |= composerStartRestartGroup.changedInstance(function4) ? 2048 : 1024;
            }
            if ((57344 & i10) == 0) {
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
                            containerColor = NavigationRailDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i12 &= -113;
                        }
                        if ((i11 & 4) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            windowInsets3 = NavigationRailDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                            function5 = function4;
                        }
                        long j12 = jM1014contentColorForek8zF_U;
                        i14 = i12;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(118552648, i14, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:100)");
                        }
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2092683357, true, new a(windowInsets3, function5, i14, content));
                        int i19 = (i14 & 14) | 12582912;
                        int i20 = i14 << 3;
                        int i21 = i19 | (i20 & 896) | (i20 & 7168);
                        WindowInsets windowInsets4 = windowInsets3;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier3, null, containerColor, j12, 0.0f, 0.0f, null, composableLambda, composerStartRestartGroup, i21, 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        windowInsets2 = windowInsets4;
                        jM1014contentColorForek8zF_U = j12;
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
                    function5 = function4;
                    windowInsets3 = windowInsets2;
                    long j13 = jM1014contentColorForek8zF_U;
                    i14 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(118552648, i14, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:100)");
                    }
                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2092683357, true, new a(windowInsets3, function5, i14, content));
                    int i110 = (i14 & 14) | 12582912;
                    int i22 = i14 << 3;
                    int i23 = i110 | (i22 & 896) | (i22 & 7168);
                    WindowInsets windowInsets5 = windowInsets3;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier3, null, containerColor, j13, 0.0f, 0.0f, null, composableLambda2, composerStartRestartGroup, i23, 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets2 = windowInsets5;
                    jM1014contentColorForek8zF_U = j13;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function5 = function4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, containerColor, jM1014contentColorForek8zF_U, function5, windowInsets2, content, i10, i11));
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
                        containerColor = NavigationRailDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        windowInsets3 = NavigationRailDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        function5 = function4;
                    } else {
                        function5 = function4;
                        windowInsets3 = windowInsets2;
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        containerColor = NavigationRailDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        windowInsets3 = NavigationRailDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        function5 = function4;
                    } else {
                        function5 = function4;
                        windowInsets3 = windowInsets2;
                    }
                }
                long j14 = jM1014contentColorForek8zF_U;
                i14 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(118552648, i14, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:100)");
                }
                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2092683357, true, new a(windowInsets3, function5, i14, content));
                int i111 = (i14 & 14) | 12582912;
                int i24 = i14 << 3;
                int i25 = i111 | (i24 & 896) | (i24 & 7168);
                WindowInsets windowInsets6 = windowInsets3;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, null, containerColor, j14, 0.0f, 0.0f, null, composableLambda3, composerStartRestartGroup, i25, 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                windowInsets2 = windowInsets6;
                jM1014contentColorForek8zF_U = j14;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        containerColor = NavigationRailDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        windowInsets3 = NavigationRailDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        function5 = function4;
                    } else {
                        function5 = function4;
                        windowInsets3 = windowInsets2;
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        containerColor = NavigationRailDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        windowInsets3 = NavigationRailDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        function5 = function4;
                    } else {
                        function5 = function4;
                        windowInsets3 = windowInsets2;
                    }
                }
                long j15 = jM1014contentColorForek8zF_U;
                i14 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(118552648, i14, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:100)");
                }
                ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2092683357, true, new a(windowInsets3, function5, i14, content));
                int i112 = (i14 & 14) | 12582912;
                int i26 = i14 << 3;
                int i27 = i112 | (i26 & 896) | (i26 & 7168);
                WindowInsets windowInsets7 = windowInsets3;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, null, containerColor, j15, 0.0f, 0.0f, null, composableLambda4, composerStartRestartGroup, i27, 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                windowInsets2 = windowInsets7;
                jM1014contentColorForek8zF_U = j15;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, containerColor, jM1014contentColorForek8zF_U, function5, windowInsets2, content, i10, i11));
        }
        i12 |= 3072;
        function4 = function3;
        if ((57344 & i10) == 0) {
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
                        containerColor = NavigationRailDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        windowInsets3 = NavigationRailDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        function5 = function4;
                    } else {
                        function5 = function4;
                        windowInsets3 = windowInsets2;
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        containerColor = NavigationRailDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        windowInsets3 = NavigationRailDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        function5 = function4;
                    } else {
                        function5 = function4;
                        windowInsets3 = windowInsets2;
                    }
                }
                long j16 = jM1014contentColorForek8zF_U;
                i14 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(118552648, i14, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:100)");
                }
                ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2092683357, true, new a(windowInsets3, function5, i14, content));
                int i113 = (i14 & 14) | 12582912;
                int i28 = i14 << 3;
                int i29 = i113 | (i28 & 896) | (i28 & 7168);
                WindowInsets windowInsets8 = windowInsets3;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, null, containerColor, j16, 0.0f, 0.0f, null, composableLambda5, composerStartRestartGroup, i29, 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                windowInsets2 = windowInsets8;
                jM1014contentColorForek8zF_U = j16;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        containerColor = NavigationRailDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        windowInsets3 = NavigationRailDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        function5 = function4;
                    } else {
                        function5 = function4;
                        windowInsets3 = windowInsets2;
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        containerColor = NavigationRailDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        windowInsets3 = NavigationRailDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        function5 = function4;
                    } else {
                        function5 = function4;
                        windowInsets3 = windowInsets2;
                    }
                }
                long j17 = jM1014contentColorForek8zF_U;
                i14 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(118552648, i14, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:100)");
                }
                ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2092683357, true, new a(windowInsets3, function5, i14, content));
                int i114 = (i14 & 14) | 12582912;
                int i210 = i14 << 3;
                int i211 = i114 | (i210 & 896) | (i210 & 7168);
                WindowInsets windowInsets9 = windowInsets3;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier3, null, containerColor, j17, 0.0f, 0.0f, null, composableLambda6, composerStartRestartGroup, i211, 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                windowInsets2 = windowInsets9;
                jM1014contentColorForek8zF_U = j17;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, containerColor, jM1014contentColorForek8zF_U, function5, windowInsets2, content, i10, i11));
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
                    containerColor = NavigationRailDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i17 != 0) {
                    function4 = null;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    windowInsets3 = NavigationRailDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    function5 = function4;
                } else {
                    function5 = function4;
                    windowInsets3 = windowInsets2;
                }
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    containerColor = NavigationRailDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i17 != 0) {
                    function4 = null;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    windowInsets3 = NavigationRailDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    function5 = function4;
                } else {
                    function5 = function4;
                    windowInsets3 = windowInsets2;
                }
            }
            long j18 = jM1014contentColorForek8zF_U;
            i14 = i12;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(118552648, i14, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:100)");
            }
            ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2092683357, true, new a(windowInsets3, function5, i14, content));
            int i115 = (i14 & 14) | 12582912;
            int i212 = i14 << 3;
            int i213 = i115 | (i212 & 896) | (i212 & 7168);
            WindowInsets windowInsets10 = windowInsets3;
            SurfaceKt.m1329SurfaceT9BRK9s(modifier3, null, containerColor, j18, 0.0f, 0.0f, null, composableLambda7, composerStartRestartGroup, i213, 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            windowInsets2 = windowInsets10;
            jM1014contentColorForek8zF_U = j18;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    containerColor = NavigationRailDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i17 != 0) {
                    function4 = null;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    windowInsets3 = NavigationRailDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    function5 = function4;
                } else {
                    function5 = function4;
                    windowInsets3 = windowInsets2;
                }
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    containerColor = NavigationRailDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i17 != 0) {
                    function4 = null;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    windowInsets3 = NavigationRailDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    function5 = function4;
                } else {
                    function5 = function4;
                    windowInsets3 = windowInsets2;
                }
            }
            long j19 = jM1014contentColorForek8zF_U;
            i14 = i12;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(118552648, i14, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:100)");
            }
            ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2092683357, true, new a(windowInsets3, function5, i14, content));
            int i116 = (i14 & 14) | 12582912;
            int i214 = i14 << 3;
            int i215 = i116 | (i214 & 896) | (i214 & 7168);
            WindowInsets windowInsets11 = windowInsets3;
            SurfaceKt.m1329SurfaceT9BRK9s(modifier3, null, containerColor, j19, 0.0f, 0.0f, null, composableLambda8, composerStartRestartGroup, i215, 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            windowInsets2 = windowInsets11;
            jM1014contentColorForek8zF_U = j19;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, containerColor, jM1014contentColorForek8zF_U, function5, windowInsets2, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0124  */
    /* JADX WARN: Code duplicated, block: B:104:0x0138  */
    /* JADX WARN: Code duplicated, block: B:106:0x0144  */
    /* JADX WARN: Code duplicated, block: B:113:0x0164 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0166  */
    /* JADX WARN: Code duplicated, block: B:115:0x0169  */
    /* JADX WARN: Code duplicated, block: B:117:0x016d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0170  */
    /* JADX WARN: Code duplicated, block: B:120:0x0172  */
    /* JADX WARN: Code duplicated, block: B:122:0x0176  */
    /* JADX WARN: Code duplicated, block: B:125:0x017b  */
    /* JADX WARN: Code duplicated, block: B:126:0x019d  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:136:0x01de  */
    /* JADX WARN: Code duplicated, block: B:139:0x0206  */
    /* JADX WARN: Code duplicated, block: B:140:0x021f  */
    /* JADX WARN: Code duplicated, block: B:143:0x028d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0299  */
    /* JADX WARN: Code duplicated, block: B:147:0x029d  */
    /* JADX WARN: Code duplicated, block: B:150:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:151:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:154:0x031b  */
    /* JADX WARN: Code duplicated, block: B:156:0x0323  */
    /* JADX WARN: Code duplicated, block: B:159:0x0333  */
    /* JADX WARN: Code duplicated, block: B:160:0x0346  */
    /* JADX WARN: Code duplicated, block: B:163:0x0394  */
    /* JADX WARN: Code duplicated, block: B:168:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x0116  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationRailItem(boolean z10, @NotNull Function0<Unit> onClick, @NotNull Function2<? super Composer, ? super Integer, Unit> icon, @Nullable Modifier modifier, boolean z11, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, boolean z12, @Nullable NavigationRailItemColors navigationRailItemColors, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Composer composer, int i10, int i11) {
        int i12;
        int i13;
        boolean z13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z14;
        int i18;
        int i19;
        MutableInteractionSource mutableInteractionSource2;
        int i20;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function3;
        NavigationRailItemColors navigationRailItemColorsM1186colors69fazGs;
        MutableInteractionSource mutableInteractionSource3;
        boolean z15;
        boolean z16;
        NavigationRailItemColors navigationRailItemColors2;
        int i21;
        Object objRememberedValue;
        Composer composer2;
        ComposableLambda composableLambda;
        Function0<ComposeUiNode> constructor;
        float f6;
        MutableInteractionSource mutableInteractionSource4;
        NavigationRailTokens navigationRailTokens;
        long jOffset;
        boolean zChanged;
        Object objRememberedValue2;
        Shape shape;
        NavigationRailItemColors navigationRailItemColors3;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function4;
        boolean z17;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1533971045);
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
        int i22 = i11 & 8;
        if (i22 == 0) {
            if ((i10 & 7168) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 57344) == 0) {
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
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        i12 |= 1572864;
                        z14 = z12;
                    } else {
                        z14 = z12;
                        if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(z14)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i12 |= i18;
                        }
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(navigationRailItemColors)) ? 4194304 : 8388608;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        if ((i10 & 234881024) == 0) {
                            mutableInteractionSource2 = mutableInteractionSource;
                            if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                                i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i20 = 33554432;
                            }
                            i12 |= i20;
                        }
                        if ((i12 & 191739611) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if (i15 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function2;
                                }
                                if (i17 != 0) {
                                    z14 = true;
                                }
                                if ((i11 & 128) != 0) {
                                    navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                                    i12 &= -29360129;
                                } else {
                                    navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                                }
                                if (i19 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                }
                                z15 = z13;
                                z16 = z14;
                                navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                                i21 = i12;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i11 & 128) != 0) {
                                    i12 &= -29360129;
                                }
                                modifier2 = modifier;
                                function3 = function2;
                                navigationRailItemColors2 = navigationRailItemColors;
                                i21 = i12;
                                z15 = z13;
                                z16 = z14;
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                            }
                            composer2 = composerStartRestartGroup;
                            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                            if (function3 != null) {
                                composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                            } else {
                                composableLambda = null;
                            }
                            Modifier modifierM321height3ABfNKs = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                            float f10 = f10876c;
                            Modifier modifierM342widthInVpY3zN4$default = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs, f10, 0.0f, 2, null);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                            Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default);
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
                            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, density));
                            ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            if (z10) {
                                f6 = 1.0f;
                            } else {
                                f6 = 0.0f;
                            }
                            int i23 = i21;
                            float f11 = f6;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            NavigationRailItemColors navigationRailItemColors4 = navigationRailItemColors2;
                            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(f11, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            int iMo413roundToPx0680j_4 = density2.mo413roundToPx0680j_4(f10);
                            navigationRailTokens = NavigationRailTokens.INSTANCE;
                            jOffset = OffsetKt.Offset((iMo413roundToPx0680j_4 - density2.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                            Unit unit = Unit.INSTANCE;
                            Offset offsetM2264boximpl = Offset.m2264boximpl(jOffset);
                            composer2.startReplaceableGroup(511388516);
                            zChanged = composer2.changed(offsetM2264boximpl) | composer2.changed(mutableInteractionSource4);
                            objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            MappedInteractionSource mappedInteractionSource = (MappedInteractionSource) objRememberedValue2;
                            if (function3 != null) {
                                composer2.startReplaceableGroup(1104516975);
                                shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(1104517056);
                                shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                                composer2.endReplaceableGroup();
                            }
                            a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors4, i23, shape, stateAnimateFloatAsState)), composableLambda2, composableLambda, z16, stateAnimateFloatAsState.getValue().floatValue(), composer2, ((i23 >> 6) & 57344) | 438);
                            if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                                ComposerKt.traceEventEnd();
                            }
                            mutableInteractionSource2 = mutableInteractionSource4;
                            navigationRailItemColors3 = navigationRailItemColors4;
                            modifier3 = modifier2;
                            z13 = z15;
                            function4 = function3;
                            z17 = z16;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            navigationRailItemColors3 = navigationRailItemColors;
                            composer2 = composerStartRestartGroup;
                            z17 = z14;
                            function4 = function2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, onClick, icon, modifier3, z13, function4, z17, navigationRailItemColors3, mutableInteractionSource2, i10, i11));
                    }
                    i12 |= 100663296;
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i12 & 191739611) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                                i12 &= -29360129;
                            } else {
                                navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                            }
                            if (i19 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            z15 = z13;
                            z16 = z14;
                            navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                            i21 = i12;
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                                i12 &= -29360129;
                            } else {
                                navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                            }
                            if (i19 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            z15 = z13;
                            z16 = z14;
                            navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                            i21 = i12;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                        }
                        composer2 = composerStartRestartGroup;
                        ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                        if (function3 != null) {
                            composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                        } else {
                            composableLambda = null;
                        }
                        Modifier modifierM321height3ABfNKs2 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                        float f12 = f10876c;
                        Modifier modifierM342widthInVpY3zN4$default2 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs2, f12, 0.0f, 2, null);
                        Alignment center2 = Alignment.INSTANCE.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                        Density density3 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                        LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default2);
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
                        Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, composerM2074constructorimpl2, density3));
                        ai.a.j(0, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        if (z10) {
                            f6 = 1.0f;
                        } else {
                            f6 = 0.0f;
                        }
                        int i24 = i21;
                        float f13 = f6;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        NavigationRailItemColors navigationRailItemColors5 = navigationRailItemColors2;
                        State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(f13, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                        Density density4 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        int iMo413roundToPx0680j_5 = density4.mo413roundToPx0680j_4(f12);
                        navigationRailTokens = NavigationRailTokens.INSTANCE;
                        jOffset = OffsetKt.Offset((iMo413roundToPx0680j_5 - density4.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                        Unit unit2 = Unit.INSTANCE;
                        Offset offsetM2264boximpl2 = Offset.m2264boximpl(jOffset);
                        composer2.startReplaceableGroup(511388516);
                        zChanged = composer2.changed(offsetM2264boximpl2) | composer2.changed(mutableInteractionSource4);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        MappedInteractionSource mappedInteractionSource2 = (MappedInteractionSource) objRememberedValue2;
                        if (function3 != null) {
                            composer2.startReplaceableGroup(1104516975);
                            shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(1104517056);
                            shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                            composer2.endReplaceableGroup();
                        }
                        a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource2)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors5, i24, shape, stateAnimateFloatAsState2)), composableLambda3, composableLambda, z16, stateAnimateFloatAsState2.getValue().floatValue(), composer2, ((i24 >> 6) & 57344) | 438);
                        if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource2 = mutableInteractionSource4;
                        navigationRailItemColors3 = navigationRailItemColors5;
                        modifier3 = modifier2;
                        z13 = z15;
                        function4 = function3;
                        z17 = z16;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                                i12 &= -29360129;
                            } else {
                                navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                            }
                            if (i19 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            z15 = z13;
                            z16 = z14;
                            navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                            i21 = i12;
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                                i12 &= -29360129;
                            } else {
                                navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                            }
                            if (i19 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            z15 = z13;
                            z16 = z14;
                            navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                            i21 = i12;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                        }
                        composer2 = composerStartRestartGroup;
                        ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                        if (function3 != null) {
                            composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                        } else {
                            composableLambda = null;
                        }
                        Modifier modifierM321height3ABfNKs3 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                        float f14 = f10876c;
                        Modifier modifierM342widthInVpY3zN4$default3 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs3, f14, 0.0f, 2, null);
                        Alignment center3 = Alignment.INSTANCE.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center3, false, composer2, 6);
                        Density density5 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                        LayoutDirection layoutDirection3 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default3);
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
                        Updater.m2081setimpl(composerM2074constructorimpl3, layoutDirection3, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, composerM2074constructorimpl3, density5));
                        ai.a.j(0, function3MaterializerOf3, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl3, viewConfiguration3, composer2, composer2), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                        if (z10) {
                            f6 = 1.0f;
                        } else {
                            f6 = 0.0f;
                        }
                        int i25 = i21;
                        float f15 = f6;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        NavigationRailItemColors navigationRailItemColors6 = navigationRailItemColors2;
                        State<Float> stateAnimateFloatAsState3 = AnimateAsStateKt.animateFloatAsState(f15, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                        Density density6 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        int iMo413roundToPx0680j_6 = density6.mo413roundToPx0680j_4(f14);
                        navigationRailTokens = NavigationRailTokens.INSTANCE;
                        jOffset = OffsetKt.Offset((iMo413roundToPx0680j_6 - density6.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                        Unit unit3 = Unit.INSTANCE;
                        Offset offsetM2264boximpl3 = Offset.m2264boximpl(jOffset);
                        composer2.startReplaceableGroup(511388516);
                        zChanged = composer2.changed(offsetM2264boximpl3) | composer2.changed(mutableInteractionSource4);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        MappedInteractionSource mappedInteractionSource3 = (MappedInteractionSource) objRememberedValue2;
                        if (function3 != null) {
                            composer2.startReplaceableGroup(1104516975);
                            shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(1104517056);
                            shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                            composer2.endReplaceableGroup();
                        }
                        a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource3)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors6, i25, shape, stateAnimateFloatAsState3)), composableLambda4, composableLambda, z16, stateAnimateFloatAsState3.getValue().floatValue(), composer2, ((i25 >> 6) & 57344) | 438);
                        if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource2 = mutableInteractionSource4;
                        navigationRailItemColors3 = navigationRailItemColors6;
                        modifier3 = modifier2;
                        z13 = z15;
                        function4 = function3;
                        z17 = z16;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, onClick, icon, modifier3, z13, function4, z17, navigationRailItemColors3, mutableInteractionSource2, i10, i11));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    z14 = z12;
                } else {
                    z14 = z12;
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z14)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(navigationRailItemColors)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 234881024) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 191739611) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                                i12 &= -29360129;
                            } else {
                                navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                            }
                            if (i19 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            z15 = z13;
                            z16 = z14;
                            navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                            i21 = i12;
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                                i12 &= -29360129;
                            } else {
                                navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                            }
                            if (i19 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            z15 = z13;
                            z16 = z14;
                            navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                            i21 = i12;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                        }
                        composer2 = composerStartRestartGroup;
                        ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                        if (function3 != null) {
                            composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                        } else {
                            composableLambda = null;
                        }
                        Modifier modifierM321height3ABfNKs4 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                        float f16 = f10876c;
                        Modifier modifierM342widthInVpY3zN4$default4 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs4, f16, 0.0f, 2, null);
                        Alignment center4 = Alignment.INSTANCE.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center4, false, composer2, 6);
                        Density density7 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                        LayoutDirection layoutDirection4 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration4 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        constructor = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default4);
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
                        Updater.m2081setimpl(composerM2074constructorimpl4, layoutDirection4, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion4, composerM2074constructorimpl4, measurePolicyRememberBoxMeasurePolicy4, composerM2074constructorimpl4, density7));
                        ai.a.j(0, function3MaterializerOf4, androidx.appcompat.widget.g0.b(companion4, composerM2074constructorimpl4, viewConfiguration4, composer2, composer2), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                        if (z10) {
                            f6 = 1.0f;
                        } else {
                            f6 = 0.0f;
                        }
                        int i26 = i21;
                        float f17 = f6;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        NavigationRailItemColors navigationRailItemColors7 = navigationRailItemColors2;
                        State<Float> stateAnimateFloatAsState4 = AnimateAsStateKt.animateFloatAsState(f17, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                        Density density8 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        int iMo413roundToPx0680j_7 = density8.mo413roundToPx0680j_4(f16);
                        navigationRailTokens = NavigationRailTokens.INSTANCE;
                        jOffset = OffsetKt.Offset((iMo413roundToPx0680j_7 - density8.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                        Unit unit4 = Unit.INSTANCE;
                        Offset offsetM2264boximpl4 = Offset.m2264boximpl(jOffset);
                        composer2.startReplaceableGroup(511388516);
                        zChanged = composer2.changed(offsetM2264boximpl4) | composer2.changed(mutableInteractionSource4);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        MappedInteractionSource mappedInteractionSource4 = (MappedInteractionSource) objRememberedValue2;
                        if (function3 != null) {
                            composer2.startReplaceableGroup(1104516975);
                            shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(1104517056);
                            shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                            composer2.endReplaceableGroup();
                        }
                        a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource4)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors7, i26, shape, stateAnimateFloatAsState4)), composableLambda5, composableLambda, z16, stateAnimateFloatAsState4.getValue().floatValue(), composer2, ((i26 >> 6) & 57344) | 438);
                        if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource2 = mutableInteractionSource4;
                        navigationRailItemColors3 = navigationRailItemColors7;
                        modifier3 = modifier2;
                        z13 = z15;
                        function4 = function3;
                        z17 = z16;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                                i12 &= -29360129;
                            } else {
                                navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                            }
                            if (i19 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            z15 = z13;
                            z16 = z14;
                            navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                            i21 = i12;
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                                i12 &= -29360129;
                            } else {
                                navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                            }
                            if (i19 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            z15 = z13;
                            z16 = z14;
                            navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                            i21 = i12;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                        }
                        composer2 = composerStartRestartGroup;
                        ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                        if (function3 != null) {
                            composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                        } else {
                            composableLambda = null;
                        }
                        Modifier modifierM321height3ABfNKs5 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                        float f18 = f10876c;
                        Modifier modifierM342widthInVpY3zN4$default5 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs5, f18, 0.0f, 2, null);
                        Alignment center5 = Alignment.INSTANCE.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center5, false, composer2, 6);
                        Density density9 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                        LayoutDirection layoutDirection5 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration5 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        constructor = companion5.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default5);
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
                        Updater.m2081setimpl(composerM2074constructorimpl5, layoutDirection5, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion5, composerM2074constructorimpl5, measurePolicyRememberBoxMeasurePolicy5, composerM2074constructorimpl5, density9));
                        ai.a.j(0, function3MaterializerOf5, androidx.appcompat.widget.g0.b(companion5, composerM2074constructorimpl5, viewConfiguration5, composer2, composer2), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                        if (z10) {
                            f6 = 1.0f;
                        } else {
                            f6 = 0.0f;
                        }
                        int i27 = i21;
                        float f19 = f6;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        NavigationRailItemColors navigationRailItemColors8 = navigationRailItemColors2;
                        State<Float> stateAnimateFloatAsState5 = AnimateAsStateKt.animateFloatAsState(f19, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                        Density density10 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        int iMo413roundToPx0680j_8 = density10.mo413roundToPx0680j_4(f18);
                        navigationRailTokens = NavigationRailTokens.INSTANCE;
                        jOffset = OffsetKt.Offset((iMo413roundToPx0680j_8 - density10.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                        Unit unit5 = Unit.INSTANCE;
                        Offset offsetM2264boximpl5 = Offset.m2264boximpl(jOffset);
                        composer2.startReplaceableGroup(511388516);
                        zChanged = composer2.changed(offsetM2264boximpl5) | composer2.changed(mutableInteractionSource4);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        MappedInteractionSource mappedInteractionSource5 = (MappedInteractionSource) objRememberedValue2;
                        if (function3 != null) {
                            composer2.startReplaceableGroup(1104516975);
                            shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(1104517056);
                            shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                            composer2.endReplaceableGroup();
                        }
                        a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource5)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors8, i27, shape, stateAnimateFloatAsState5)), composableLambda6, composableLambda, z16, stateAnimateFloatAsState5.getValue().floatValue(), composer2, ((i27 >> 6) & 57344) | 438);
                        if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource2 = mutableInteractionSource4;
                        navigationRailItemColors3 = navigationRailItemColors8;
                        modifier3 = modifier2;
                        z13 = z15;
                        function4 = function3;
                        z17 = z16;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, onClick, icon, modifier3, z13, function4, z17, navigationRailItemColors3, mutableInteractionSource2, i10, i11));
                }
                i12 |= 100663296;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    composer2 = composerStartRestartGroup;
                    ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                    } else {
                        composableLambda = null;
                    }
                    Modifier modifierM321height3ABfNKs6 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                    float f110 = f10876c;
                    Modifier modifierM342widthInVpY3zN4$default6 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs6, f110, 0.0f, 2, null);
                    Alignment center6 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(center6, false, composer2, 6);
                    Density density11 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                    LayoutDirection layoutDirection6 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration6 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    constructor = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default6);
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
                    Updater.m2081setimpl(composerM2074constructorimpl6, layoutDirection6, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion6, composerM2074constructorimpl6, measurePolicyRememberBoxMeasurePolicy6, composerM2074constructorimpl6, density11));
                    ai.a.j(0, function3MaterializerOf6, androidx.appcompat.widget.g0.b(companion6, composerM2074constructorimpl6, viewConfiguration6, composer2, composer2), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                    if (z10) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    int i28 = i21;
                    float f111 = f6;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    NavigationRailItemColors navigationRailItemColors9 = navigationRailItemColors2;
                    State<Float> stateAnimateFloatAsState6 = AnimateAsStateKt.animateFloatAsState(f111, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                    Density density12 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    int iMo413roundToPx0680j_9 = density12.mo413roundToPx0680j_4(f110);
                    navigationRailTokens = NavigationRailTokens.INSTANCE;
                    jOffset = OffsetKt.Offset((iMo413roundToPx0680j_9 - density12.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                    Unit unit6 = Unit.INSTANCE;
                    Offset offsetM2264boximpl6 = Offset.m2264boximpl(jOffset);
                    composer2.startReplaceableGroup(511388516);
                    zChanged = composer2.changed(offsetM2264boximpl6) | composer2.changed(mutableInteractionSource4);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    MappedInteractionSource mappedInteractionSource6 = (MappedInteractionSource) objRememberedValue2;
                    if (function3 != null) {
                        composer2.startReplaceableGroup(1104516975);
                        shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(1104517056);
                        shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    }
                    a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource6)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors9, i28, shape, stateAnimateFloatAsState6)), composableLambda7, composableLambda, z16, stateAnimateFloatAsState6.getValue().floatValue(), composer2, ((i28 >> 6) & 57344) | 438);
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource2 = mutableInteractionSource4;
                    navigationRailItemColors3 = navigationRailItemColors9;
                    modifier3 = modifier2;
                    z13 = z15;
                    function4 = function3;
                    z17 = z16;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    composer2 = composerStartRestartGroup;
                    ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                    } else {
                        composableLambda = null;
                    }
                    Modifier modifierM321height3ABfNKs7 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                    float f112 = f10876c;
                    Modifier modifierM342widthInVpY3zN4$default7 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs7, f112, 0.0f, 2, null);
                    Alignment center7 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(center7, false, composer2, 6);
                    Density density13 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                    LayoutDirection layoutDirection7 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration7 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    constructor = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default7);
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
                    Updater.m2081setimpl(composerM2074constructorimpl7, layoutDirection7, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion7, composerM2074constructorimpl7, measurePolicyRememberBoxMeasurePolicy7, composerM2074constructorimpl7, density13));
                    ai.a.j(0, function3MaterializerOf7, androidx.appcompat.widget.g0.b(companion7, composerM2074constructorimpl7, viewConfiguration7, composer2, composer2), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                    if (z10) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    int i29 = i21;
                    float f113 = f6;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    NavigationRailItemColors navigationRailItemColors10 = navigationRailItemColors2;
                    State<Float> stateAnimateFloatAsState7 = AnimateAsStateKt.animateFloatAsState(f113, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                    Density density14 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    int iMo413roundToPx0680j_10 = density14.mo413roundToPx0680j_4(f112);
                    navigationRailTokens = NavigationRailTokens.INSTANCE;
                    jOffset = OffsetKt.Offset((iMo413roundToPx0680j_10 - density14.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                    Unit unit7 = Unit.INSTANCE;
                    Offset offsetM2264boximpl7 = Offset.m2264boximpl(jOffset);
                    composer2.startReplaceableGroup(511388516);
                    zChanged = composer2.changed(offsetM2264boximpl7) | composer2.changed(mutableInteractionSource4);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    MappedInteractionSource mappedInteractionSource7 = (MappedInteractionSource) objRememberedValue2;
                    if (function3 != null) {
                        composer2.startReplaceableGroup(1104516975);
                        shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(1104517056);
                        shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    }
                    a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource7)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors10, i29, shape, stateAnimateFloatAsState7)), composableLambda8, composableLambda, z16, stateAnimateFloatAsState7.getValue().floatValue(), composer2, ((i29 >> 6) & 57344) | 438);
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource2 = mutableInteractionSource4;
                    navigationRailItemColors3 = navigationRailItemColors10;
                    modifier3 = modifier2;
                    z13 = z15;
                    function4 = function3;
                    z17 = z16;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, onClick, icon, modifier3, z13, function4, z17, navigationRailItemColors3, mutableInteractionSource2, i10, i11));
            }
            i12 |= 24576;
            z13 = z11;
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((458752 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    z14 = z12;
                } else {
                    z14 = z12;
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z14)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(navigationRailItemColors)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 234881024) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 191739611) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                                i12 &= -29360129;
                            } else {
                                navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                            }
                            if (i19 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            z15 = z13;
                            z16 = z14;
                            navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                            i21 = i12;
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                                i12 &= -29360129;
                            } else {
                                navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                            }
                            if (i19 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            z15 = z13;
                            z16 = z14;
                            navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                            i21 = i12;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                        }
                        composer2 = composerStartRestartGroup;
                        ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                        if (function3 != null) {
                            composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                        } else {
                            composableLambda = null;
                        }
                        Modifier modifierM321height3ABfNKs8 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                        float f114 = f10876c;
                        Modifier modifierM342widthInVpY3zN4$default8 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs8, f114, 0.0f, 2, null);
                        Alignment center8 = Alignment.INSTANCE.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy8 = BoxKt.rememberBoxMeasurePolicy(center8, false, composer2, 6);
                        Density density15 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                        LayoutDirection layoutDirection8 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration8 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                        constructor = companion8.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default8);
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
                        Updater.m2081setimpl(composerM2074constructorimpl8, layoutDirection8, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion8, composerM2074constructorimpl8, measurePolicyRememberBoxMeasurePolicy8, composerM2074constructorimpl8, density15));
                        ai.a.j(0, function3MaterializerOf8, androidx.appcompat.widget.g0.b(companion8, composerM2074constructorimpl8, viewConfiguration8, composer2, composer2), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                        if (z10) {
                            f6 = 1.0f;
                        } else {
                            f6 = 0.0f;
                        }
                        int i210 = i21;
                        float f115 = f6;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        NavigationRailItemColors navigationRailItemColors11 = navigationRailItemColors2;
                        State<Float> stateAnimateFloatAsState8 = AnimateAsStateKt.animateFloatAsState(f115, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                        Density density16 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        int iMo413roundToPx0680j_11 = density16.mo413roundToPx0680j_4(f114);
                        navigationRailTokens = NavigationRailTokens.INSTANCE;
                        jOffset = OffsetKt.Offset((iMo413roundToPx0680j_11 - density16.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                        Unit unit8 = Unit.INSTANCE;
                        Offset offsetM2264boximpl8 = Offset.m2264boximpl(jOffset);
                        composer2.startReplaceableGroup(511388516);
                        zChanged = composer2.changed(offsetM2264boximpl8) | composer2.changed(mutableInteractionSource4);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        MappedInteractionSource mappedInteractionSource8 = (MappedInteractionSource) objRememberedValue2;
                        if (function3 != null) {
                            composer2.startReplaceableGroup(1104516975);
                            shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(1104517056);
                            shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                            composer2.endReplaceableGroup();
                        }
                        a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource8)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors11, i210, shape, stateAnimateFloatAsState8)), composableLambda9, composableLambda, z16, stateAnimateFloatAsState8.getValue().floatValue(), composer2, ((i210 >> 6) & 57344) | 438);
                        if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource2 = mutableInteractionSource4;
                        navigationRailItemColors3 = navigationRailItemColors11;
                        modifier3 = modifier2;
                        z13 = z15;
                        function4 = function3;
                        z17 = z16;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                                i12 &= -29360129;
                            } else {
                                navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                            }
                            if (i19 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            z15 = z13;
                            z16 = z14;
                            navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                            i21 = i12;
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                                i12 &= -29360129;
                            } else {
                                navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                            }
                            if (i19 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            z15 = z13;
                            z16 = z14;
                            navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                            i21 = i12;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                        }
                        composer2 = composerStartRestartGroup;
                        ComposableLambda composableLambda10 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                        if (function3 != null) {
                            composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                        } else {
                            composableLambda = null;
                        }
                        Modifier modifierM321height3ABfNKs9 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                        float f116 = f10876c;
                        Modifier modifierM342widthInVpY3zN4$default9 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs9, f116, 0.0f, 2, null);
                        Alignment center9 = Alignment.INSTANCE.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy9 = BoxKt.rememberBoxMeasurePolicy(center9, false, composer2, 6);
                        Density density17 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                        LayoutDirection layoutDirection9 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration9 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                        constructor = companion9.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default9);
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
                        Updater.m2081setimpl(composerM2074constructorimpl9, layoutDirection9, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion9, composerM2074constructorimpl9, measurePolicyRememberBoxMeasurePolicy9, composerM2074constructorimpl9, density17));
                        ai.a.j(0, function3MaterializerOf9, androidx.appcompat.widget.g0.b(companion9, composerM2074constructorimpl9, viewConfiguration9, composer2, composer2), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                        if (z10) {
                            f6 = 1.0f;
                        } else {
                            f6 = 0.0f;
                        }
                        int i211 = i21;
                        float f117 = f6;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        NavigationRailItemColors navigationRailItemColors12 = navigationRailItemColors2;
                        State<Float> stateAnimateFloatAsState9 = AnimateAsStateKt.animateFloatAsState(f117, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                        Density density18 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        int iMo413roundToPx0680j_12 = density18.mo413roundToPx0680j_4(f116);
                        navigationRailTokens = NavigationRailTokens.INSTANCE;
                        jOffset = OffsetKt.Offset((iMo413roundToPx0680j_12 - density18.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                        Unit unit9 = Unit.INSTANCE;
                        Offset offsetM2264boximpl9 = Offset.m2264boximpl(jOffset);
                        composer2.startReplaceableGroup(511388516);
                        zChanged = composer2.changed(offsetM2264boximpl9) | composer2.changed(mutableInteractionSource4);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        MappedInteractionSource mappedInteractionSource9 = (MappedInteractionSource) objRememberedValue2;
                        if (function3 != null) {
                            composer2.startReplaceableGroup(1104516975);
                            shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(1104517056);
                            shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                            composer2.endReplaceableGroup();
                        }
                        a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource9)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors12, i211, shape, stateAnimateFloatAsState9)), composableLambda10, composableLambda, z16, stateAnimateFloatAsState9.getValue().floatValue(), composer2, ((i211 >> 6) & 57344) | 438);
                        if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource2 = mutableInteractionSource4;
                        navigationRailItemColors3 = navigationRailItemColors12;
                        modifier3 = modifier2;
                        z13 = z15;
                        function4 = function3;
                        z17 = z16;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, onClick, icon, modifier3, z13, function4, z17, navigationRailItemColors3, mutableInteractionSource2, i10, i11));
                }
                i12 |= 100663296;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    composer2 = composerStartRestartGroup;
                    ComposableLambda composableLambda11 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                    } else {
                        composableLambda = null;
                    }
                    Modifier modifierM321height3ABfNKs10 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                    float f118 = f10876c;
                    Modifier modifierM342widthInVpY3zN4$default10 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs10, f118, 0.0f, 2, null);
                    Alignment center10 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy10 = BoxKt.rememberBoxMeasurePolicy(center10, false, composer2, 6);
                    Density density19 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                    LayoutDirection layoutDirection10 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration10 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    constructor = companion10.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf10 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default10);
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
                    Updater.m2081setimpl(composerM2074constructorimpl10, layoutDirection10, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion10, composerM2074constructorimpl10, measurePolicyRememberBoxMeasurePolicy10, composerM2074constructorimpl10, density19));
                    ai.a.j(0, function3MaterializerOf10, androidx.appcompat.widget.g0.b(companion10, composerM2074constructorimpl10, viewConfiguration10, composer2, composer2), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                    if (z10) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    int i212 = i21;
                    float f119 = f6;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    NavigationRailItemColors navigationRailItemColors13 = navigationRailItemColors2;
                    State<Float> stateAnimateFloatAsState10 = AnimateAsStateKt.animateFloatAsState(f119, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                    Density density110 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    int iMo413roundToPx0680j_13 = density110.mo413roundToPx0680j_4(f118);
                    navigationRailTokens = NavigationRailTokens.INSTANCE;
                    jOffset = OffsetKt.Offset((iMo413roundToPx0680j_13 - density110.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                    Unit unit10 = Unit.INSTANCE;
                    Offset offsetM2264boximpl10 = Offset.m2264boximpl(jOffset);
                    composer2.startReplaceableGroup(511388516);
                    zChanged = composer2.changed(offsetM2264boximpl10) | composer2.changed(mutableInteractionSource4);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    MappedInteractionSource mappedInteractionSource10 = (MappedInteractionSource) objRememberedValue2;
                    if (function3 != null) {
                        composer2.startReplaceableGroup(1104516975);
                        shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(1104517056);
                        shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    }
                    a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource10)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors13, i212, shape, stateAnimateFloatAsState10)), composableLambda11, composableLambda, z16, stateAnimateFloatAsState10.getValue().floatValue(), composer2, ((i212 >> 6) & 57344) | 438);
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource2 = mutableInteractionSource4;
                    navigationRailItemColors3 = navigationRailItemColors13;
                    modifier3 = modifier2;
                    z13 = z15;
                    function4 = function3;
                    z17 = z16;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    composer2 = composerStartRestartGroup;
                    ComposableLambda composableLambda12 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                    } else {
                        composableLambda = null;
                    }
                    Modifier modifierM321height3ABfNKs11 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                    float f1110 = f10876c;
                    Modifier modifierM342widthInVpY3zN4$default11 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs11, f1110, 0.0f, 2, null);
                    Alignment center11 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy11 = BoxKt.rememberBoxMeasurePolicy(center11, false, composer2, 6);
                    Density density111 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                    LayoutDirection layoutDirection11 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration11 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    constructor = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default11);
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
                    Updater.m2081setimpl(composerM2074constructorimpl11, layoutDirection11, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion11, composerM2074constructorimpl11, measurePolicyRememberBoxMeasurePolicy11, composerM2074constructorimpl11, density111));
                    ai.a.j(0, function3MaterializerOf11, androidx.appcompat.widget.g0.b(companion11, composerM2074constructorimpl11, viewConfiguration11, composer2, composer2), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                    if (z10) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    int i213 = i21;
                    float f1111 = f6;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    NavigationRailItemColors navigationRailItemColors14 = navigationRailItemColors2;
                    State<Float> stateAnimateFloatAsState11 = AnimateAsStateKt.animateFloatAsState(f1111, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                    Density density112 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    int iMo413roundToPx0680j_14 = density112.mo413roundToPx0680j_4(f1110);
                    navigationRailTokens = NavigationRailTokens.INSTANCE;
                    jOffset = OffsetKt.Offset((iMo413roundToPx0680j_14 - density112.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                    Unit unit11 = Unit.INSTANCE;
                    Offset offsetM2264boximpl11 = Offset.m2264boximpl(jOffset);
                    composer2.startReplaceableGroup(511388516);
                    zChanged = composer2.changed(offsetM2264boximpl11) | composer2.changed(mutableInteractionSource4);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    MappedInteractionSource mappedInteractionSource11 = (MappedInteractionSource) objRememberedValue2;
                    if (function3 != null) {
                        composer2.startReplaceableGroup(1104516975);
                        shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(1104517056);
                        shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    }
                    a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource11)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors14, i213, shape, stateAnimateFloatAsState11)), composableLambda12, composableLambda, z16, stateAnimateFloatAsState11.getValue().floatValue(), composer2, ((i213 >> 6) & 57344) | 438);
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource2 = mutableInteractionSource4;
                    navigationRailItemColors3 = navigationRailItemColors14;
                    modifier3 = modifier2;
                    z13 = z15;
                    function4 = function3;
                    z17 = z16;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, onClick, icon, modifier3, z13, function4, z17, navigationRailItemColors3, mutableInteractionSource2, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                z14 = z12;
            } else {
                z14 = z12;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z14)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(navigationRailItemColors)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 234881024) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    composer2 = composerStartRestartGroup;
                    ComposableLambda composableLambda13 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                    } else {
                        composableLambda = null;
                    }
                    Modifier modifierM321height3ABfNKs12 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                    float f1112 = f10876c;
                    Modifier modifierM342widthInVpY3zN4$default12 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs12, f1112, 0.0f, 2, null);
                    Alignment center12 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy12 = BoxKt.rememberBoxMeasurePolicy(center12, false, composer2, 6);
                    Density density113 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                    LayoutDirection layoutDirection12 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration12 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    constructor = companion12.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf12 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default12);
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
                    Updater.m2081setimpl(composerM2074constructorimpl12, layoutDirection12, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion12, composerM2074constructorimpl12, measurePolicyRememberBoxMeasurePolicy12, composerM2074constructorimpl12, density113));
                    ai.a.j(0, function3MaterializerOf12, androidx.appcompat.widget.g0.b(companion12, composerM2074constructorimpl12, viewConfiguration12, composer2, composer2), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                    if (z10) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    int i214 = i21;
                    float f1113 = f6;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    NavigationRailItemColors navigationRailItemColors15 = navigationRailItemColors2;
                    State<Float> stateAnimateFloatAsState12 = AnimateAsStateKt.animateFloatAsState(f1113, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                    Density density114 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    int iMo413roundToPx0680j_15 = density114.mo413roundToPx0680j_4(f1112);
                    navigationRailTokens = NavigationRailTokens.INSTANCE;
                    jOffset = OffsetKt.Offset((iMo413roundToPx0680j_15 - density114.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                    Unit unit12 = Unit.INSTANCE;
                    Offset offsetM2264boximpl12 = Offset.m2264boximpl(jOffset);
                    composer2.startReplaceableGroup(511388516);
                    zChanged = composer2.changed(offsetM2264boximpl12) | composer2.changed(mutableInteractionSource4);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    MappedInteractionSource mappedInteractionSource12 = (MappedInteractionSource) objRememberedValue2;
                    if (function3 != null) {
                        composer2.startReplaceableGroup(1104516975);
                        shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(1104517056);
                        shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    }
                    a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource12)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors15, i214, shape, stateAnimateFloatAsState12)), composableLambda13, composableLambda, z16, stateAnimateFloatAsState12.getValue().floatValue(), composer2, ((i214 >> 6) & 57344) | 438);
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource2 = mutableInteractionSource4;
                    navigationRailItemColors3 = navigationRailItemColors15;
                    modifier3 = modifier2;
                    z13 = z15;
                    function4 = function3;
                    z17 = z16;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    composer2 = composerStartRestartGroup;
                    ComposableLambda composableLambda14 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                    } else {
                        composableLambda = null;
                    }
                    Modifier modifierM321height3ABfNKs13 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                    float f1114 = f10876c;
                    Modifier modifierM342widthInVpY3zN4$default13 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs13, f1114, 0.0f, 2, null);
                    Alignment center13 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy13 = BoxKt.rememberBoxMeasurePolicy(center13, false, composer2, 6);
                    Density density115 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                    LayoutDirection layoutDirection13 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration13 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                    constructor = companion13.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf13 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default13);
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
                    Updater.m2081setimpl(composerM2074constructorimpl13, layoutDirection13, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion13, composerM2074constructorimpl13, measurePolicyRememberBoxMeasurePolicy13, composerM2074constructorimpl13, density115));
                    ai.a.j(0, function3MaterializerOf13, androidx.appcompat.widget.g0.b(companion13, composerM2074constructorimpl13, viewConfiguration13, composer2, composer2), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                    if (z10) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    int i215 = i21;
                    float f1115 = f6;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    NavigationRailItemColors navigationRailItemColors16 = navigationRailItemColors2;
                    State<Float> stateAnimateFloatAsState13 = AnimateAsStateKt.animateFloatAsState(f1115, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                    Density density116 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    int iMo413roundToPx0680j_16 = density116.mo413roundToPx0680j_4(f1114);
                    navigationRailTokens = NavigationRailTokens.INSTANCE;
                    jOffset = OffsetKt.Offset((iMo413roundToPx0680j_16 - density116.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                    Unit unit13 = Unit.INSTANCE;
                    Offset offsetM2264boximpl13 = Offset.m2264boximpl(jOffset);
                    composer2.startReplaceableGroup(511388516);
                    zChanged = composer2.changed(offsetM2264boximpl13) | composer2.changed(mutableInteractionSource4);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    MappedInteractionSource mappedInteractionSource13 = (MappedInteractionSource) objRememberedValue2;
                    if (function3 != null) {
                        composer2.startReplaceableGroup(1104516975);
                        shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(1104517056);
                        shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    }
                    a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource13)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors16, i215, shape, stateAnimateFloatAsState13)), composableLambda14, composableLambda, z16, stateAnimateFloatAsState13.getValue().floatValue(), composer2, ((i215 >> 6) & 57344) | 438);
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource2 = mutableInteractionSource4;
                    navigationRailItemColors3 = navigationRailItemColors16;
                    modifier3 = modifier2;
                    z13 = z15;
                    function4 = function3;
                    z17 = z16;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, onClick, icon, modifier3, z13, function4, z17, navigationRailItemColors3, mutableInteractionSource2, i10, i11));
            }
            i12 |= 100663296;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i12 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -29360129;
                    } else {
                        navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                    }
                    if (i19 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    z15 = z13;
                    z16 = z14;
                    navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                    i21 = i12;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -29360129;
                    } else {
                        navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                    }
                    if (i19 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    z15 = z13;
                    z16 = z14;
                    navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                    i21 = i12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                }
                composer2 = composerStartRestartGroup;
                ComposableLambda composableLambda15 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                } else {
                    composableLambda = null;
                }
                Modifier modifierM321height3ABfNKs14 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                float f1116 = f10876c;
                Modifier modifierM342widthInVpY3zN4$default14 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs14, f1116, 0.0f, 2, null);
                Alignment center14 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy14 = BoxKt.rememberBoxMeasurePolicy(center14, false, composer2, 6);
                Density density117 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection14 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration14 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                constructor = companion14.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf14 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default14);
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
                Updater.m2081setimpl(composerM2074constructorimpl14, layoutDirection14, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion14, composerM2074constructorimpl14, measurePolicyRememberBoxMeasurePolicy14, composerM2074constructorimpl14, density117));
                ai.a.j(0, function3MaterializerOf14, androidx.appcompat.widget.g0.b(companion14, composerM2074constructorimpl14, viewConfiguration14, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
                if (z10) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                int i216 = i21;
                float f1117 = f6;
                mutableInteractionSource4 = mutableInteractionSource3;
                NavigationRailItemColors navigationRailItemColors17 = navigationRailItemColors2;
                State<Float> stateAnimateFloatAsState14 = AnimateAsStateKt.animateFloatAsState(f1117, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                Density density118 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                int iMo413roundToPx0680j_17 = density118.mo413roundToPx0680j_4(f1116);
                navigationRailTokens = NavigationRailTokens.INSTANCE;
                jOffset = OffsetKt.Offset((iMo413roundToPx0680j_17 - density118.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                Unit unit14 = Unit.INSTANCE;
                Offset offsetM2264boximpl14 = Offset.m2264boximpl(jOffset);
                composer2.startReplaceableGroup(511388516);
                zChanged = composer2.changed(offsetM2264boximpl14) | composer2.changed(mutableInteractionSource4);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                MappedInteractionSource mappedInteractionSource14 = (MappedInteractionSource) objRememberedValue2;
                if (function3 != null) {
                    composer2.startReplaceableGroup(1104516975);
                    shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(1104517056);
                    shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                    composer2.endReplaceableGroup();
                }
                a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource14)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors17, i216, shape, stateAnimateFloatAsState14)), composableLambda15, composableLambda, z16, stateAnimateFloatAsState14.getValue().floatValue(), composer2, ((i216 >> 6) & 57344) | 438);
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource2 = mutableInteractionSource4;
                navigationRailItemColors3 = navigationRailItemColors17;
                modifier3 = modifier2;
                z13 = z15;
                function4 = function3;
                z17 = z16;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -29360129;
                    } else {
                        navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                    }
                    if (i19 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    z15 = z13;
                    z16 = z14;
                    navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                    i21 = i12;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -29360129;
                    } else {
                        navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                    }
                    if (i19 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    z15 = z13;
                    z16 = z14;
                    navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                    i21 = i12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                }
                composer2 = composerStartRestartGroup;
                ComposableLambda composableLambda16 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                } else {
                    composableLambda = null;
                }
                Modifier modifierM321height3ABfNKs15 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                float f1118 = f10876c;
                Modifier modifierM342widthInVpY3zN4$default15 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs15, f1118, 0.0f, 2, null);
                Alignment center15 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy15 = BoxKt.rememberBoxMeasurePolicy(center15, false, composer2, 6);
                Density density119 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection15 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration15 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                constructor = companion15.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf15 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default15);
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
                Updater.m2081setimpl(composerM2074constructorimpl15, layoutDirection15, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion15, composerM2074constructorimpl15, measurePolicyRememberBoxMeasurePolicy15, composerM2074constructorimpl15, density119));
                ai.a.j(0, function3MaterializerOf15, androidx.appcompat.widget.g0.b(companion15, composerM2074constructorimpl15, viewConfiguration15, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
                if (z10) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                int i217 = i21;
                float f1119 = f6;
                mutableInteractionSource4 = mutableInteractionSource3;
                NavigationRailItemColors navigationRailItemColors18 = navigationRailItemColors2;
                State<Float> stateAnimateFloatAsState15 = AnimateAsStateKt.animateFloatAsState(f1119, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                Density density1110 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                int iMo413roundToPx0680j_18 = density1110.mo413roundToPx0680j_4(f1118);
                navigationRailTokens = NavigationRailTokens.INSTANCE;
                jOffset = OffsetKt.Offset((iMo413roundToPx0680j_18 - density1110.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                Unit unit15 = Unit.INSTANCE;
                Offset offsetM2264boximpl15 = Offset.m2264boximpl(jOffset);
                composer2.startReplaceableGroup(511388516);
                zChanged = composer2.changed(offsetM2264boximpl15) | composer2.changed(mutableInteractionSource4);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                MappedInteractionSource mappedInteractionSource15 = (MappedInteractionSource) objRememberedValue2;
                if (function3 != null) {
                    composer2.startReplaceableGroup(1104516975);
                    shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(1104517056);
                    shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                    composer2.endReplaceableGroup();
                }
                a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource15)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors18, i217, shape, stateAnimateFloatAsState15)), composableLambda16, composableLambda, z16, stateAnimateFloatAsState15.getValue().floatValue(), composer2, ((i217 >> 6) & 57344) | 438);
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource2 = mutableInteractionSource4;
                navigationRailItemColors3 = navigationRailItemColors18;
                modifier3 = modifier2;
                z13 = z15;
                function4 = function3;
                z17 = z16;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, onClick, icon, modifier3, z13, function4, z17, navigationRailItemColors3, mutableInteractionSource2, i10, i11));
        }
        i12 |= 3072;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 57344) == 0) {
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
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    z14 = z12;
                } else {
                    z14 = z12;
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z14)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(navigationRailItemColors)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 234881024) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 191739611) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                                i12 &= -29360129;
                            } else {
                                navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                            }
                            if (i19 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            z15 = z13;
                            z16 = z14;
                            navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                            i21 = i12;
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                                i12 &= -29360129;
                            } else {
                                navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                            }
                            if (i19 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            z15 = z13;
                            z16 = z14;
                            navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                            i21 = i12;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                        }
                        composer2 = composerStartRestartGroup;
                        ComposableLambda composableLambda17 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                        if (function3 != null) {
                            composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                        } else {
                            composableLambda = null;
                        }
                        Modifier modifierM321height3ABfNKs16 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                        float f11110 = f10876c;
                        Modifier modifierM342widthInVpY3zN4$default16 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs16, f11110, 0.0f, 2, null);
                        Alignment center16 = Alignment.INSTANCE.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy16 = BoxKt.rememberBoxMeasurePolicy(center16, false, composer2, 6);
                        Density density1111 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                        LayoutDirection layoutDirection16 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration16 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                        constructor = companion16.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf16 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default16);
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
                        Composer composerM2074constructorimpl16 = Updater.m2074constructorimpl(composer2);
                        Updater.m2081setimpl(composerM2074constructorimpl16, layoutDirection16, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion16, composerM2074constructorimpl16, measurePolicyRememberBoxMeasurePolicy16, composerM2074constructorimpl16, density1111));
                        ai.a.j(0, function3MaterializerOf16, androidx.appcompat.widget.g0.b(companion16, composerM2074constructorimpl16, viewConfiguration16, composer2, composer2), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance16 = BoxScopeInstance.INSTANCE;
                        if (z10) {
                            f6 = 1.0f;
                        } else {
                            f6 = 0.0f;
                        }
                        int i218 = i21;
                        float f11111 = f6;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        NavigationRailItemColors navigationRailItemColors19 = navigationRailItemColors2;
                        State<Float> stateAnimateFloatAsState16 = AnimateAsStateKt.animateFloatAsState(f11111, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                        Density density1112 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        int iMo413roundToPx0680j_19 = density1112.mo413roundToPx0680j_4(f11110);
                        navigationRailTokens = NavigationRailTokens.INSTANCE;
                        jOffset = OffsetKt.Offset((iMo413roundToPx0680j_19 - density1112.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                        Unit unit16 = Unit.INSTANCE;
                        Offset offsetM2264boximpl16 = Offset.m2264boximpl(jOffset);
                        composer2.startReplaceableGroup(511388516);
                        zChanged = composer2.changed(offsetM2264boximpl16) | composer2.changed(mutableInteractionSource4);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        MappedInteractionSource mappedInteractionSource16 = (MappedInteractionSource) objRememberedValue2;
                        if (function3 != null) {
                            composer2.startReplaceableGroup(1104516975);
                            shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(1104517056);
                            shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                            composer2.endReplaceableGroup();
                        }
                        a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource16)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors19, i218, shape, stateAnimateFloatAsState16)), composableLambda17, composableLambda, z16, stateAnimateFloatAsState16.getValue().floatValue(), composer2, ((i218 >> 6) & 57344) | 438);
                        if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource2 = mutableInteractionSource4;
                        navigationRailItemColors3 = navigationRailItemColors19;
                        modifier3 = modifier2;
                        z13 = z15;
                        function4 = function3;
                        z17 = z16;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                                i12 &= -29360129;
                            } else {
                                navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                            }
                            if (i19 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            z15 = z13;
                            z16 = z14;
                            navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                            i21 = i12;
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if (i15 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                                i12 &= -29360129;
                            } else {
                                navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                            }
                            if (i19 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            z15 = z13;
                            z16 = z14;
                            navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                            i21 = i12;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                        }
                        composer2 = composerStartRestartGroup;
                        ComposableLambda composableLambda18 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                        if (function3 != null) {
                            composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                        } else {
                            composableLambda = null;
                        }
                        Modifier modifierM321height3ABfNKs17 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                        float f11112 = f10876c;
                        Modifier modifierM342widthInVpY3zN4$default17 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs17, f11112, 0.0f, 2, null);
                        Alignment center17 = Alignment.INSTANCE.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy17 = BoxKt.rememberBoxMeasurePolicy(center17, false, composer2, 6);
                        Density density1113 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                        LayoutDirection layoutDirection17 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration17 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                        constructor = companion17.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf17 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default17);
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
                        Composer composerM2074constructorimpl17 = Updater.m2074constructorimpl(composer2);
                        Updater.m2081setimpl(composerM2074constructorimpl17, layoutDirection17, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion17, composerM2074constructorimpl17, measurePolicyRememberBoxMeasurePolicy17, composerM2074constructorimpl17, density1113));
                        ai.a.j(0, function3MaterializerOf17, androidx.appcompat.widget.g0.b(companion17, composerM2074constructorimpl17, viewConfiguration17, composer2, composer2), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance17 = BoxScopeInstance.INSTANCE;
                        if (z10) {
                            f6 = 1.0f;
                        } else {
                            f6 = 0.0f;
                        }
                        int i219 = i21;
                        float f11113 = f6;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        NavigationRailItemColors navigationRailItemColors110 = navigationRailItemColors2;
                        State<Float> stateAnimateFloatAsState17 = AnimateAsStateKt.animateFloatAsState(f11113, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                        Density density1114 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        int iMo413roundToPx0680j_110 = density1114.mo413roundToPx0680j_4(f11112);
                        navigationRailTokens = NavigationRailTokens.INSTANCE;
                        jOffset = OffsetKt.Offset((iMo413roundToPx0680j_110 - density1114.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                        Unit unit17 = Unit.INSTANCE;
                        Offset offsetM2264boximpl17 = Offset.m2264boximpl(jOffset);
                        composer2.startReplaceableGroup(511388516);
                        zChanged = composer2.changed(offsetM2264boximpl17) | composer2.changed(mutableInteractionSource4);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        MappedInteractionSource mappedInteractionSource17 = (MappedInteractionSource) objRememberedValue2;
                        if (function3 != null) {
                            composer2.startReplaceableGroup(1104516975);
                            shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(1104517056);
                            shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                            composer2.endReplaceableGroup();
                        }
                        a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource17)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors110, i219, shape, stateAnimateFloatAsState17)), composableLambda18, composableLambda, z16, stateAnimateFloatAsState17.getValue().floatValue(), composer2, ((i219 >> 6) & 57344) | 438);
                        if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource2 = mutableInteractionSource4;
                        navigationRailItemColors3 = navigationRailItemColors110;
                        modifier3 = modifier2;
                        z13 = z15;
                        function4 = function3;
                        z17 = z16;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, onClick, icon, modifier3, z13, function4, z17, navigationRailItemColors3, mutableInteractionSource2, i10, i11));
                }
                i12 |= 100663296;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    composer2 = composerStartRestartGroup;
                    ComposableLambda composableLambda19 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                    } else {
                        composableLambda = null;
                    }
                    Modifier modifierM321height3ABfNKs18 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                    float f11114 = f10876c;
                    Modifier modifierM342widthInVpY3zN4$default18 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs18, f11114, 0.0f, 2, null);
                    Alignment center18 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy18 = BoxKt.rememberBoxMeasurePolicy(center18, false, composer2, 6);
                    Density density1115 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                    LayoutDirection layoutDirection18 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration18 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                    constructor = companion18.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf18 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default18);
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
                    Composer composerM2074constructorimpl18 = Updater.m2074constructorimpl(composer2);
                    Updater.m2081setimpl(composerM2074constructorimpl18, layoutDirection18, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion18, composerM2074constructorimpl18, measurePolicyRememberBoxMeasurePolicy18, composerM2074constructorimpl18, density1115));
                    ai.a.j(0, function3MaterializerOf18, androidx.appcompat.widget.g0.b(companion18, composerM2074constructorimpl18, viewConfiguration18, composer2, composer2), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance18 = BoxScopeInstance.INSTANCE;
                    if (z10) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    int i2110 = i21;
                    float f11115 = f6;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    NavigationRailItemColors navigationRailItemColors111 = navigationRailItemColors2;
                    State<Float> stateAnimateFloatAsState18 = AnimateAsStateKt.animateFloatAsState(f11115, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                    Density density1116 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    int iMo413roundToPx0680j_111 = density1116.mo413roundToPx0680j_4(f11114);
                    navigationRailTokens = NavigationRailTokens.INSTANCE;
                    jOffset = OffsetKt.Offset((iMo413roundToPx0680j_111 - density1116.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                    Unit unit18 = Unit.INSTANCE;
                    Offset offsetM2264boximpl18 = Offset.m2264boximpl(jOffset);
                    composer2.startReplaceableGroup(511388516);
                    zChanged = composer2.changed(offsetM2264boximpl18) | composer2.changed(mutableInteractionSource4);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    MappedInteractionSource mappedInteractionSource18 = (MappedInteractionSource) objRememberedValue2;
                    if (function3 != null) {
                        composer2.startReplaceableGroup(1104516975);
                        shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(1104517056);
                        shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    }
                    a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource18)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors111, i2110, shape, stateAnimateFloatAsState18)), composableLambda19, composableLambda, z16, stateAnimateFloatAsState18.getValue().floatValue(), composer2, ((i2110 >> 6) & 57344) | 438);
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource2 = mutableInteractionSource4;
                    navigationRailItemColors3 = navigationRailItemColors111;
                    modifier3 = modifier2;
                    z13 = z15;
                    function4 = function3;
                    z17 = z16;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    composer2 = composerStartRestartGroup;
                    ComposableLambda composableLambda110 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                    } else {
                        composableLambda = null;
                    }
                    Modifier modifierM321height3ABfNKs19 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                    float f11116 = f10876c;
                    Modifier modifierM342widthInVpY3zN4$default19 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs19, f11116, 0.0f, 2, null);
                    Alignment center19 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy19 = BoxKt.rememberBoxMeasurePolicy(center19, false, composer2, 6);
                    Density density1117 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                    LayoutDirection layoutDirection19 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration19 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                    constructor = companion19.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf19 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default19);
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
                    Composer composerM2074constructorimpl19 = Updater.m2074constructorimpl(composer2);
                    Updater.m2081setimpl(composerM2074constructorimpl19, layoutDirection19, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion19, composerM2074constructorimpl19, measurePolicyRememberBoxMeasurePolicy19, composerM2074constructorimpl19, density1117));
                    ai.a.j(0, function3MaterializerOf19, androidx.appcompat.widget.g0.b(companion19, composerM2074constructorimpl19, viewConfiguration19, composer2, composer2), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance19 = BoxScopeInstance.INSTANCE;
                    if (z10) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    int i2111 = i21;
                    float f11117 = f6;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    NavigationRailItemColors navigationRailItemColors112 = navigationRailItemColors2;
                    State<Float> stateAnimateFloatAsState19 = AnimateAsStateKt.animateFloatAsState(f11117, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                    Density density1118 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    int iMo413roundToPx0680j_112 = density1118.mo413roundToPx0680j_4(f11116);
                    navigationRailTokens = NavigationRailTokens.INSTANCE;
                    jOffset = OffsetKt.Offset((iMo413roundToPx0680j_112 - density1118.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                    Unit unit19 = Unit.INSTANCE;
                    Offset offsetM2264boximpl19 = Offset.m2264boximpl(jOffset);
                    composer2.startReplaceableGroup(511388516);
                    zChanged = composer2.changed(offsetM2264boximpl19) | composer2.changed(mutableInteractionSource4);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    MappedInteractionSource mappedInteractionSource19 = (MappedInteractionSource) objRememberedValue2;
                    if (function3 != null) {
                        composer2.startReplaceableGroup(1104516975);
                        shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(1104517056);
                        shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    }
                    a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource19)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors112, i2111, shape, stateAnimateFloatAsState19)), composableLambda110, composableLambda, z16, stateAnimateFloatAsState19.getValue().floatValue(), composer2, ((i2111 >> 6) & 57344) | 438);
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource2 = mutableInteractionSource4;
                    navigationRailItemColors3 = navigationRailItemColors112;
                    modifier3 = modifier2;
                    z13 = z15;
                    function4 = function3;
                    z17 = z16;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, onClick, icon, modifier3, z13, function4, z17, navigationRailItemColors3, mutableInteractionSource2, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                z14 = z12;
            } else {
                z14 = z12;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z14)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(navigationRailItemColors)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 234881024) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    composer2 = composerStartRestartGroup;
                    ComposableLambda composableLambda111 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                    } else {
                        composableLambda = null;
                    }
                    Modifier modifierM321height3ABfNKs110 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                    float f11118 = f10876c;
                    Modifier modifierM342widthInVpY3zN4$default110 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs110, f11118, 0.0f, 2, null);
                    Alignment center110 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy110 = BoxKt.rememberBoxMeasurePolicy(center110, false, composer2, 6);
                    Density density1119 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                    LayoutDirection layoutDirection110 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration110 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                    constructor = companion110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf110 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default110);
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
                    Composer composerM2074constructorimpl110 = Updater.m2074constructorimpl(composer2);
                    Updater.m2081setimpl(composerM2074constructorimpl110, layoutDirection110, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion110, composerM2074constructorimpl110, measurePolicyRememberBoxMeasurePolicy110, composerM2074constructorimpl110, density1119));
                    ai.a.j(0, function3MaterializerOf110, androidx.appcompat.widget.g0.b(companion110, composerM2074constructorimpl110, viewConfiguration110, composer2, composer2), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance110 = BoxScopeInstance.INSTANCE;
                    if (z10) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    int i2112 = i21;
                    float f11119 = f6;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    NavigationRailItemColors navigationRailItemColors113 = navigationRailItemColors2;
                    State<Float> stateAnimateFloatAsState110 = AnimateAsStateKt.animateFloatAsState(f11119, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                    Density density11110 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    int iMo413roundToPx0680j_113 = density11110.mo413roundToPx0680j_4(f11118);
                    navigationRailTokens = NavigationRailTokens.INSTANCE;
                    jOffset = OffsetKt.Offset((iMo413roundToPx0680j_113 - density11110.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                    Unit unit110 = Unit.INSTANCE;
                    Offset offsetM2264boximpl110 = Offset.m2264boximpl(jOffset);
                    composer2.startReplaceableGroup(511388516);
                    zChanged = composer2.changed(offsetM2264boximpl110) | composer2.changed(mutableInteractionSource4);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    MappedInteractionSource mappedInteractionSource110 = (MappedInteractionSource) objRememberedValue2;
                    if (function3 != null) {
                        composer2.startReplaceableGroup(1104516975);
                        shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(1104517056);
                        shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    }
                    a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource110)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors113, i2112, shape, stateAnimateFloatAsState110)), composableLambda111, composableLambda, z16, stateAnimateFloatAsState110.getValue().floatValue(), composer2, ((i2112 >> 6) & 57344) | 438);
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource2 = mutableInteractionSource4;
                    navigationRailItemColors3 = navigationRailItemColors113;
                    modifier3 = modifier2;
                    z13 = z15;
                    function4 = function3;
                    z17 = z16;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    composer2 = composerStartRestartGroup;
                    ComposableLambda composableLambda112 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                    } else {
                        composableLambda = null;
                    }
                    Modifier modifierM321height3ABfNKs111 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                    float f111110 = f10876c;
                    Modifier modifierM342widthInVpY3zN4$default111 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs111, f111110, 0.0f, 2, null);
                    Alignment center111 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy111 = BoxKt.rememberBoxMeasurePolicy(center111, false, composer2, 6);
                    Density density11111 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                    LayoutDirection layoutDirection111 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration111 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                    constructor = companion111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default111);
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
                    Composer composerM2074constructorimpl111 = Updater.m2074constructorimpl(composer2);
                    Updater.m2081setimpl(composerM2074constructorimpl111, layoutDirection111, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion111, composerM2074constructorimpl111, measurePolicyRememberBoxMeasurePolicy111, composerM2074constructorimpl111, density11111));
                    ai.a.j(0, function3MaterializerOf111, androidx.appcompat.widget.g0.b(companion111, composerM2074constructorimpl111, viewConfiguration111, composer2, composer2), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance111 = BoxScopeInstance.INSTANCE;
                    if (z10) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    int i2113 = i21;
                    float f111111 = f6;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    NavigationRailItemColors navigationRailItemColors114 = navigationRailItemColors2;
                    State<Float> stateAnimateFloatAsState111 = AnimateAsStateKt.animateFloatAsState(f111111, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                    Density density11112 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    int iMo413roundToPx0680j_114 = density11112.mo413roundToPx0680j_4(f111110);
                    navigationRailTokens = NavigationRailTokens.INSTANCE;
                    jOffset = OffsetKt.Offset((iMo413roundToPx0680j_114 - density11112.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                    Unit unit111 = Unit.INSTANCE;
                    Offset offsetM2264boximpl111 = Offset.m2264boximpl(jOffset);
                    composer2.startReplaceableGroup(511388516);
                    zChanged = composer2.changed(offsetM2264boximpl111) | composer2.changed(mutableInteractionSource4);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    MappedInteractionSource mappedInteractionSource111 = (MappedInteractionSource) objRememberedValue2;
                    if (function3 != null) {
                        composer2.startReplaceableGroup(1104516975);
                        shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(1104517056);
                        shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    }
                    a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource111)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors114, i2113, shape, stateAnimateFloatAsState111)), composableLambda112, composableLambda, z16, stateAnimateFloatAsState111.getValue().floatValue(), composer2, ((i2113 >> 6) & 57344) | 438);
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource2 = mutableInteractionSource4;
                    navigationRailItemColors3 = navigationRailItemColors114;
                    modifier3 = modifier2;
                    z13 = z15;
                    function4 = function3;
                    z17 = z16;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, onClick, icon, modifier3, z13, function4, z17, navigationRailItemColors3, mutableInteractionSource2, i10, i11));
            }
            i12 |= 100663296;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i12 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -29360129;
                    } else {
                        navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                    }
                    if (i19 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    z15 = z13;
                    z16 = z14;
                    navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                    i21 = i12;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -29360129;
                    } else {
                        navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                    }
                    if (i19 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    z15 = z13;
                    z16 = z14;
                    navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                    i21 = i12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                }
                composer2 = composerStartRestartGroup;
                ComposableLambda composableLambda113 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                } else {
                    composableLambda = null;
                }
                Modifier modifierM321height3ABfNKs112 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                float f111112 = f10876c;
                Modifier modifierM342widthInVpY3zN4$default112 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs112, f111112, 0.0f, 2, null);
                Alignment center112 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy112 = BoxKt.rememberBoxMeasurePolicy(center112, false, composer2, 6);
                Density density11113 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection112 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration112 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion112 = ComposeUiNode.INSTANCE;
                constructor = companion112.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf112 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default112);
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
                Composer composerM2074constructorimpl112 = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl112, layoutDirection112, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion112, composerM2074constructorimpl112, measurePolicyRememberBoxMeasurePolicy112, composerM2074constructorimpl112, density11113));
                ai.a.j(0, function3MaterializerOf112, androidx.appcompat.widget.g0.b(companion112, composerM2074constructorimpl112, viewConfiguration112, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance112 = BoxScopeInstance.INSTANCE;
                if (z10) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                int i2114 = i21;
                float f111113 = f6;
                mutableInteractionSource4 = mutableInteractionSource3;
                NavigationRailItemColors navigationRailItemColors115 = navigationRailItemColors2;
                State<Float> stateAnimateFloatAsState112 = AnimateAsStateKt.animateFloatAsState(f111113, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                Density density11114 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                int iMo413roundToPx0680j_115 = density11114.mo413roundToPx0680j_4(f111112);
                navigationRailTokens = NavigationRailTokens.INSTANCE;
                jOffset = OffsetKt.Offset((iMo413roundToPx0680j_115 - density11114.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                Unit unit112 = Unit.INSTANCE;
                Offset offsetM2264boximpl112 = Offset.m2264boximpl(jOffset);
                composer2.startReplaceableGroup(511388516);
                zChanged = composer2.changed(offsetM2264boximpl112) | composer2.changed(mutableInteractionSource4);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                MappedInteractionSource mappedInteractionSource112 = (MappedInteractionSource) objRememberedValue2;
                if (function3 != null) {
                    composer2.startReplaceableGroup(1104516975);
                    shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(1104517056);
                    shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                    composer2.endReplaceableGroup();
                }
                a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource112)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors115, i2114, shape, stateAnimateFloatAsState112)), composableLambda113, composableLambda, z16, stateAnimateFloatAsState112.getValue().floatValue(), composer2, ((i2114 >> 6) & 57344) | 438);
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource2 = mutableInteractionSource4;
                navigationRailItemColors3 = navigationRailItemColors115;
                modifier3 = modifier2;
                z13 = z15;
                function4 = function3;
                z17 = z16;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -29360129;
                    } else {
                        navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                    }
                    if (i19 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    z15 = z13;
                    z16 = z14;
                    navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                    i21 = i12;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -29360129;
                    } else {
                        navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                    }
                    if (i19 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    z15 = z13;
                    z16 = z14;
                    navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                    i21 = i12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                }
                composer2 = composerStartRestartGroup;
                ComposableLambda composableLambda114 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                } else {
                    composableLambda = null;
                }
                Modifier modifierM321height3ABfNKs113 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                float f111114 = f10876c;
                Modifier modifierM342widthInVpY3zN4$default113 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs113, f111114, 0.0f, 2, null);
                Alignment center113 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy113 = BoxKt.rememberBoxMeasurePolicy(center113, false, composer2, 6);
                Density density11115 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection113 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration113 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                constructor = companion113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf113 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default113);
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
                Composer composerM2074constructorimpl113 = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl113, layoutDirection113, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion113, composerM2074constructorimpl113, measurePolicyRememberBoxMeasurePolicy113, composerM2074constructorimpl113, density11115));
                ai.a.j(0, function3MaterializerOf113, androidx.appcompat.widget.g0.b(companion113, composerM2074constructorimpl113, viewConfiguration113, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance113 = BoxScopeInstance.INSTANCE;
                if (z10) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                int i2115 = i21;
                float f111115 = f6;
                mutableInteractionSource4 = mutableInteractionSource3;
                NavigationRailItemColors navigationRailItemColors116 = navigationRailItemColors2;
                State<Float> stateAnimateFloatAsState113 = AnimateAsStateKt.animateFloatAsState(f111115, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                Density density11116 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                int iMo413roundToPx0680j_116 = density11116.mo413roundToPx0680j_4(f111114);
                navigationRailTokens = NavigationRailTokens.INSTANCE;
                jOffset = OffsetKt.Offset((iMo413roundToPx0680j_116 - density11116.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                Unit unit113 = Unit.INSTANCE;
                Offset offsetM2264boximpl113 = Offset.m2264boximpl(jOffset);
                composer2.startReplaceableGroup(511388516);
                zChanged = composer2.changed(offsetM2264boximpl113) | composer2.changed(mutableInteractionSource4);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                MappedInteractionSource mappedInteractionSource113 = (MappedInteractionSource) objRememberedValue2;
                if (function3 != null) {
                    composer2.startReplaceableGroup(1104516975);
                    shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(1104517056);
                    shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                    composer2.endReplaceableGroup();
                }
                a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource113)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors116, i2115, shape, stateAnimateFloatAsState113)), composableLambda114, composableLambda, z16, stateAnimateFloatAsState113.getValue().floatValue(), composer2, ((i2115 >> 6) & 57344) | 438);
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource2 = mutableInteractionSource4;
                navigationRailItemColors3 = navigationRailItemColors116;
                modifier3 = modifier2;
                z13 = z15;
                function4 = function3;
                z17 = z16;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, onClick, icon, modifier3, z13, function4, z17, navigationRailItemColors3, mutableInteractionSource2, i10, i11));
        }
        i12 |= 24576;
        z13 = z11;
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((458752 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                z14 = z12;
            } else {
                z14 = z12;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z14)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(navigationRailItemColors)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 234881024) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    composer2 = composerStartRestartGroup;
                    ComposableLambda composableLambda115 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                    } else {
                        composableLambda = null;
                    }
                    Modifier modifierM321height3ABfNKs114 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                    float f111116 = f10876c;
                    Modifier modifierM342widthInVpY3zN4$default114 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs114, f111116, 0.0f, 2, null);
                    Alignment center114 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy114 = BoxKt.rememberBoxMeasurePolicy(center114, false, composer2, 6);
                    Density density11117 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                    LayoutDirection layoutDirection114 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration114 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                    constructor = companion114.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf114 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default114);
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
                    Composer composerM2074constructorimpl114 = Updater.m2074constructorimpl(composer2);
                    Updater.m2081setimpl(composerM2074constructorimpl114, layoutDirection114, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion114, composerM2074constructorimpl114, measurePolicyRememberBoxMeasurePolicy114, composerM2074constructorimpl114, density11117));
                    ai.a.j(0, function3MaterializerOf114, androidx.appcompat.widget.g0.b(companion114, composerM2074constructorimpl114, viewConfiguration114, composer2, composer2), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance114 = BoxScopeInstance.INSTANCE;
                    if (z10) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    int i2116 = i21;
                    float f111117 = f6;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    NavigationRailItemColors navigationRailItemColors117 = navigationRailItemColors2;
                    State<Float> stateAnimateFloatAsState114 = AnimateAsStateKt.animateFloatAsState(f111117, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                    Density density11118 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    int iMo413roundToPx0680j_117 = density11118.mo413roundToPx0680j_4(f111116);
                    navigationRailTokens = NavigationRailTokens.INSTANCE;
                    jOffset = OffsetKt.Offset((iMo413roundToPx0680j_117 - density11118.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                    Unit unit114 = Unit.INSTANCE;
                    Offset offsetM2264boximpl114 = Offset.m2264boximpl(jOffset);
                    composer2.startReplaceableGroup(511388516);
                    zChanged = composer2.changed(offsetM2264boximpl114) | composer2.changed(mutableInteractionSource4);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    MappedInteractionSource mappedInteractionSource114 = (MappedInteractionSource) objRememberedValue2;
                    if (function3 != null) {
                        composer2.startReplaceableGroup(1104516975);
                        shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(1104517056);
                        shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    }
                    a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource114)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors117, i2116, shape, stateAnimateFloatAsState114)), composableLambda115, composableLambda, z16, stateAnimateFloatAsState114.getValue().floatValue(), composer2, ((i2116 >> 6) & 57344) | 438);
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource2 = mutableInteractionSource4;
                    navigationRailItemColors3 = navigationRailItemColors117;
                    modifier3 = modifier2;
                    z13 = z15;
                    function4 = function3;
                    z17 = z16;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if (i15 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                            i12 &= -29360129;
                        } else {
                            navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                        }
                        if (i19 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        z15 = z13;
                        z16 = z14;
                        navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                        i21 = i12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    composer2 = composerStartRestartGroup;
                    ComposableLambda composableLambda116 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                    } else {
                        composableLambda = null;
                    }
                    Modifier modifierM321height3ABfNKs115 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                    float f111118 = f10876c;
                    Modifier modifierM342widthInVpY3zN4$default115 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs115, f111118, 0.0f, 2, null);
                    Alignment center115 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy115 = BoxKt.rememberBoxMeasurePolicy(center115, false, composer2, 6);
                    Density density11119 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                    LayoutDirection layoutDirection115 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration115 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion115 = ComposeUiNode.INSTANCE;
                    constructor = companion115.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf115 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default115);
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
                    Composer composerM2074constructorimpl115 = Updater.m2074constructorimpl(composer2);
                    Updater.m2081setimpl(composerM2074constructorimpl115, layoutDirection115, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion115, composerM2074constructorimpl115, measurePolicyRememberBoxMeasurePolicy115, composerM2074constructorimpl115, density11119));
                    ai.a.j(0, function3MaterializerOf115, androidx.appcompat.widget.g0.b(companion115, composerM2074constructorimpl115, viewConfiguration115, composer2, composer2), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance115 = BoxScopeInstance.INSTANCE;
                    if (z10) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    int i2117 = i21;
                    float f111119 = f6;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    NavigationRailItemColors navigationRailItemColors118 = navigationRailItemColors2;
                    State<Float> stateAnimateFloatAsState115 = AnimateAsStateKt.animateFloatAsState(f111119, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                    Density density111110 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    int iMo413roundToPx0680j_118 = density111110.mo413roundToPx0680j_4(f111118);
                    navigationRailTokens = NavigationRailTokens.INSTANCE;
                    jOffset = OffsetKt.Offset((iMo413roundToPx0680j_118 - density111110.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                    Unit unit115 = Unit.INSTANCE;
                    Offset offsetM2264boximpl115 = Offset.m2264boximpl(jOffset);
                    composer2.startReplaceableGroup(511388516);
                    zChanged = composer2.changed(offsetM2264boximpl115) | composer2.changed(mutableInteractionSource4);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    MappedInteractionSource mappedInteractionSource115 = (MappedInteractionSource) objRememberedValue2;
                    if (function3 != null) {
                        composer2.startReplaceableGroup(1104516975);
                        shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(1104517056);
                        shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                        composer2.endReplaceableGroup();
                    }
                    a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource115)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors118, i2117, shape, stateAnimateFloatAsState115)), composableLambda116, composableLambda, z16, stateAnimateFloatAsState115.getValue().floatValue(), composer2, ((i2117 >> 6) & 57344) | 438);
                    if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource2 = mutableInteractionSource4;
                    navigationRailItemColors3 = navigationRailItemColors118;
                    modifier3 = modifier2;
                    z13 = z15;
                    function4 = function3;
                    z17 = z16;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, onClick, icon, modifier3, z13, function4, z17, navigationRailItemColors3, mutableInteractionSource2, i10, i11));
            }
            i12 |= 100663296;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i12 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -29360129;
                    } else {
                        navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                    }
                    if (i19 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    z15 = z13;
                    z16 = z14;
                    navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                    i21 = i12;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -29360129;
                    } else {
                        navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                    }
                    if (i19 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    z15 = z13;
                    z16 = z14;
                    navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                    i21 = i12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                }
                composer2 = composerStartRestartGroup;
                ComposableLambda composableLambda117 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                } else {
                    composableLambda = null;
                }
                Modifier modifierM321height3ABfNKs116 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                float f1111110 = f10876c;
                Modifier modifierM342widthInVpY3zN4$default116 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs116, f1111110, 0.0f, 2, null);
                Alignment center116 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy116 = BoxKt.rememberBoxMeasurePolicy(center116, false, composer2, 6);
                Density density111111 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection116 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration116 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion116 = ComposeUiNode.INSTANCE;
                constructor = companion116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf116 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default116);
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
                Composer composerM2074constructorimpl116 = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl116, layoutDirection116, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion116, composerM2074constructorimpl116, measurePolicyRememberBoxMeasurePolicy116, composerM2074constructorimpl116, density111111));
                ai.a.j(0, function3MaterializerOf116, androidx.appcompat.widget.g0.b(companion116, composerM2074constructorimpl116, viewConfiguration116, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance116 = BoxScopeInstance.INSTANCE;
                if (z10) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                int i2118 = i21;
                float f1111111 = f6;
                mutableInteractionSource4 = mutableInteractionSource3;
                NavigationRailItemColors navigationRailItemColors119 = navigationRailItemColors2;
                State<Float> stateAnimateFloatAsState116 = AnimateAsStateKt.animateFloatAsState(f1111111, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                Density density111112 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                int iMo413roundToPx0680j_119 = density111112.mo413roundToPx0680j_4(f1111110);
                navigationRailTokens = NavigationRailTokens.INSTANCE;
                jOffset = OffsetKt.Offset((iMo413roundToPx0680j_119 - density111112.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                Unit unit116 = Unit.INSTANCE;
                Offset offsetM2264boximpl116 = Offset.m2264boximpl(jOffset);
                composer2.startReplaceableGroup(511388516);
                zChanged = composer2.changed(offsetM2264boximpl116) | composer2.changed(mutableInteractionSource4);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                MappedInteractionSource mappedInteractionSource116 = (MappedInteractionSource) objRememberedValue2;
                if (function3 != null) {
                    composer2.startReplaceableGroup(1104516975);
                    shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(1104517056);
                    shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                    composer2.endReplaceableGroup();
                }
                a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource116)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors119, i2118, shape, stateAnimateFloatAsState116)), composableLambda117, composableLambda, z16, stateAnimateFloatAsState116.getValue().floatValue(), composer2, ((i2118 >> 6) & 57344) | 438);
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource2 = mutableInteractionSource4;
                navigationRailItemColors3 = navigationRailItemColors119;
                modifier3 = modifier2;
                z13 = z15;
                function4 = function3;
                z17 = z16;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -29360129;
                    } else {
                        navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                    }
                    if (i19 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    z15 = z13;
                    z16 = z14;
                    navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                    i21 = i12;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -29360129;
                    } else {
                        navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                    }
                    if (i19 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    z15 = z13;
                    z16 = z14;
                    navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                    i21 = i12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                }
                composer2 = composerStartRestartGroup;
                ComposableLambda composableLambda118 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                } else {
                    composableLambda = null;
                }
                Modifier modifierM321height3ABfNKs117 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                float f1111112 = f10876c;
                Modifier modifierM342widthInVpY3zN4$default117 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs117, f1111112, 0.0f, 2, null);
                Alignment center117 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy117 = BoxKt.rememberBoxMeasurePolicy(center117, false, composer2, 6);
                Density density111113 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection117 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration117 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                constructor = companion117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf117 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default117);
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
                Composer composerM2074constructorimpl117 = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl117, layoutDirection117, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion117, composerM2074constructorimpl117, measurePolicyRememberBoxMeasurePolicy117, composerM2074constructorimpl117, density111113));
                ai.a.j(0, function3MaterializerOf117, androidx.appcompat.widget.g0.b(companion117, composerM2074constructorimpl117, viewConfiguration117, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance117 = BoxScopeInstance.INSTANCE;
                if (z10) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                int i2119 = i21;
                float f1111113 = f6;
                mutableInteractionSource4 = mutableInteractionSource3;
                NavigationRailItemColors navigationRailItemColors1110 = navigationRailItemColors2;
                State<Float> stateAnimateFloatAsState117 = AnimateAsStateKt.animateFloatAsState(f1111113, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                Density density111114 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                int iMo413roundToPx0680j_1110 = density111114.mo413roundToPx0680j_4(f1111112);
                navigationRailTokens = NavigationRailTokens.INSTANCE;
                jOffset = OffsetKt.Offset((iMo413roundToPx0680j_1110 - density111114.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                Unit unit117 = Unit.INSTANCE;
                Offset offsetM2264boximpl117 = Offset.m2264boximpl(jOffset);
                composer2.startReplaceableGroup(511388516);
                zChanged = composer2.changed(offsetM2264boximpl117) | composer2.changed(mutableInteractionSource4);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                MappedInteractionSource mappedInteractionSource117 = (MappedInteractionSource) objRememberedValue2;
                if (function3 != null) {
                    composer2.startReplaceableGroup(1104516975);
                    shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(1104517056);
                    shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                    composer2.endReplaceableGroup();
                }
                a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource117)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors1110, i2119, shape, stateAnimateFloatAsState117)), composableLambda118, composableLambda, z16, stateAnimateFloatAsState117.getValue().floatValue(), composer2, ((i2119 >> 6) & 57344) | 438);
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource2 = mutableInteractionSource4;
                navigationRailItemColors3 = navigationRailItemColors1110;
                modifier3 = modifier2;
                z13 = z15;
                function4 = function3;
                z17 = z16;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, onClick, icon, modifier3, z13, function4, z17, navigationRailItemColors3, mutableInteractionSource2, i10, i11));
        }
        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 1572864;
            z14 = z12;
        } else {
            z14 = z12;
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z14)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
        }
        if ((i10 & 29360128) != 0) {
            i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(navigationRailItemColors)) ? 4194304 : 8388608;
        }
        i19 = i11 & 256;
        if (i19 != 0) {
            if ((i10 & 234881024) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i12 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -29360129;
                    } else {
                        navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                    }
                    if (i19 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    z15 = z13;
                    z16 = z14;
                    navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                    i21 = i12;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -29360129;
                    } else {
                        navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                    }
                    if (i19 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    z15 = z13;
                    z16 = z14;
                    navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                    i21 = i12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                }
                composer2 = composerStartRestartGroup;
                ComposableLambda composableLambda119 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                } else {
                    composableLambda = null;
                }
                Modifier modifierM321height3ABfNKs118 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                float f1111114 = f10876c;
                Modifier modifierM342widthInVpY3zN4$default118 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs118, f1111114, 0.0f, 2, null);
                Alignment center118 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy118 = BoxKt.rememberBoxMeasurePolicy(center118, false, composer2, 6);
                Density density111115 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection118 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration118 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion118 = ComposeUiNode.INSTANCE;
                constructor = companion118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf118 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default118);
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
                Composer composerM2074constructorimpl118 = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl118, layoutDirection118, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion118, composerM2074constructorimpl118, measurePolicyRememberBoxMeasurePolicy118, composerM2074constructorimpl118, density111115));
                ai.a.j(0, function3MaterializerOf118, androidx.appcompat.widget.g0.b(companion118, composerM2074constructorimpl118, viewConfiguration118, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance118 = BoxScopeInstance.INSTANCE;
                if (z10) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                int i21110 = i21;
                float f1111115 = f6;
                mutableInteractionSource4 = mutableInteractionSource3;
                NavigationRailItemColors navigationRailItemColors1111 = navigationRailItemColors2;
                State<Float> stateAnimateFloatAsState118 = AnimateAsStateKt.animateFloatAsState(f1111115, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                Density density111116 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                int iMo413roundToPx0680j_1111 = density111116.mo413roundToPx0680j_4(f1111114);
                navigationRailTokens = NavigationRailTokens.INSTANCE;
                jOffset = OffsetKt.Offset((iMo413roundToPx0680j_1111 - density111116.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                Unit unit118 = Unit.INSTANCE;
                Offset offsetM2264boximpl118 = Offset.m2264boximpl(jOffset);
                composer2.startReplaceableGroup(511388516);
                zChanged = composer2.changed(offsetM2264boximpl118) | composer2.changed(mutableInteractionSource4);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                MappedInteractionSource mappedInteractionSource118 = (MappedInteractionSource) objRememberedValue2;
                if (function3 != null) {
                    composer2.startReplaceableGroup(1104516975);
                    shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(1104517056);
                    shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                    composer2.endReplaceableGroup();
                }
                a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource118)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors1111, i21110, shape, stateAnimateFloatAsState118)), composableLambda119, composableLambda, z16, stateAnimateFloatAsState118.getValue().floatValue(), composer2, ((i21110 >> 6) & 57344) | 438);
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource2 = mutableInteractionSource4;
                navigationRailItemColors3 = navigationRailItemColors1111;
                modifier3 = modifier2;
                z13 = z15;
                function4 = function3;
                z17 = z16;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -29360129;
                    } else {
                        navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                    }
                    if (i19 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    z15 = z13;
                    z16 = z14;
                    navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                    i21 = i12;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if (i15 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                        i12 &= -29360129;
                    } else {
                        navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                    }
                    if (i19 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    z15 = z13;
                    z16 = z14;
                    navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                    i21 = i12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                }
                composer2 = composerStartRestartGroup;
                ComposableLambda composableLambda1110 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
                } else {
                    composableLambda = null;
                }
                Modifier modifierM321height3ABfNKs119 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
                float f1111116 = f10876c;
                Modifier modifierM342widthInVpY3zN4$default119 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs119, f1111116, 0.0f, 2, null);
                Alignment center119 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy119 = BoxKt.rememberBoxMeasurePolicy(center119, false, composer2, 6);
                Density density111117 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection119 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration119 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
                constructor = companion119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf119 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default119);
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
                Composer composerM2074constructorimpl119 = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl119, layoutDirection119, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion119, composerM2074constructorimpl119, measurePolicyRememberBoxMeasurePolicy119, composerM2074constructorimpl119, density111117));
                ai.a.j(0, function3MaterializerOf119, androidx.appcompat.widget.g0.b(companion119, composerM2074constructorimpl119, viewConfiguration119, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance119 = BoxScopeInstance.INSTANCE;
                if (z10) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                int i21111 = i21;
                float f1111117 = f6;
                mutableInteractionSource4 = mutableInteractionSource3;
                NavigationRailItemColors navigationRailItemColors1112 = navigationRailItemColors2;
                State<Float> stateAnimateFloatAsState119 = AnimateAsStateKt.animateFloatAsState(f1111117, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
                Density density111118 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                int iMo413roundToPx0680j_1112 = density111118.mo413roundToPx0680j_4(f1111116);
                navigationRailTokens = NavigationRailTokens.INSTANCE;
                jOffset = OffsetKt.Offset((iMo413roundToPx0680j_1112 - density111118.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
                Unit unit119 = Unit.INSTANCE;
                Offset offsetM2264boximpl119 = Offset.m2264boximpl(jOffset);
                composer2.startReplaceableGroup(511388516);
                zChanged = composer2.changed(offsetM2264boximpl119) | composer2.changed(mutableInteractionSource4);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                MappedInteractionSource mappedInteractionSource119 = (MappedInteractionSource) objRememberedValue2;
                if (function3 != null) {
                    composer2.startReplaceableGroup(1104516975);
                    shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(1104517056);
                    shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                    composer2.endReplaceableGroup();
                }
                a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource119)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors1112, i21111, shape, stateAnimateFloatAsState119)), composableLambda1110, composableLambda, z16, stateAnimateFloatAsState119.getValue().floatValue(), composer2, ((i21111 >> 6) & 57344) | 438);
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource2 = mutableInteractionSource4;
                navigationRailItemColors3 = navigationRailItemColors1112;
                modifier3 = modifier2;
                z13 = z15;
                function4 = function3;
                z17 = z16;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, onClick, icon, modifier3, z13, function4, z17, navigationRailItemColors3, mutableInteractionSource2, i10, i11));
        }
        i12 |= 100663296;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i12 & 191739611) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if (i15 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if ((i11 & 128) != 0) {
                    navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                    i12 &= -29360129;
                } else {
                    navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                }
                if (i19 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                z15 = z13;
                z16 = z14;
                navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                i21 = i12;
            } else {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if (i15 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if ((i11 & 128) != 0) {
                    navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                    i12 &= -29360129;
                } else {
                    navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                }
                if (i19 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                z15 = z13;
                z16 = z14;
                navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                i21 = i12;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
            }
            composer2 = composerStartRestartGroup;
            ComposableLambda composableLambda1111 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
            if (function3 != null) {
                composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
            } else {
                composableLambda = null;
            }
            Modifier modifierM321height3ABfNKs1110 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
            float f1111118 = f10876c;
            Modifier modifierM342widthInVpY3zN4$default1110 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs1110, f1111118, 0.0f, 2, null);
            Alignment center1110 = Alignment.INSTANCE.getCenter();
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy1110 = BoxKt.rememberBoxMeasurePolicy(center1110, false, composer2, 6);
            Density density111119 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
            LayoutDirection layoutDirection1110 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration1110 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
            constructor = companion1110.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1110 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default1110);
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
            Composer composerM2074constructorimpl1110 = Updater.m2074constructorimpl(composer2);
            Updater.m2081setimpl(composerM2074constructorimpl1110, layoutDirection1110, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion1110, composerM2074constructorimpl1110, measurePolicyRememberBoxMeasurePolicy1110, composerM2074constructorimpl1110, density111119));
            ai.a.j(0, function3MaterializerOf1110, androidx.appcompat.widget.g0.b(companion1110, composerM2074constructorimpl1110, viewConfiguration1110, composer2, composer2), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance1110 = BoxScopeInstance.INSTANCE;
            if (z10) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            int i21112 = i21;
            float f1111119 = f6;
            mutableInteractionSource4 = mutableInteractionSource3;
            NavigationRailItemColors navigationRailItemColors1113 = navigationRailItemColors2;
            State<Float> stateAnimateFloatAsState1110 = AnimateAsStateKt.animateFloatAsState(f1111119, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
            Density density1111110 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            int iMo413roundToPx0680j_1113 = density1111110.mo413roundToPx0680j_4(f1111118);
            navigationRailTokens = NavigationRailTokens.INSTANCE;
            jOffset = OffsetKt.Offset((iMo413roundToPx0680j_1113 - density1111110.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
            Unit unit1110 = Unit.INSTANCE;
            Offset offsetM2264boximpl1110 = Offset.m2264boximpl(jOffset);
            composer2.startReplaceableGroup(511388516);
            zChanged = composer2.changed(offsetM2264boximpl1110) | composer2.changed(mutableInteractionSource4);
            objRememberedValue2 = composer2.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                composer2.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            MappedInteractionSource mappedInteractionSource1110 = (MappedInteractionSource) objRememberedValue2;
            if (function3 != null) {
                composer2.startReplaceableGroup(1104516975);
                shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(1104517056);
                shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                composer2.endReplaceableGroup();
            }
            a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource1110)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors1113, i21112, shape, stateAnimateFloatAsState1110)), composableLambda1111, composableLambda, z16, stateAnimateFloatAsState1110.getValue().floatValue(), composer2, ((i21112 >> 6) & 57344) | 438);
            if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource2 = mutableInteractionSource4;
            navigationRailItemColors3 = navigationRailItemColors1113;
            modifier3 = modifier2;
            z13 = z15;
            function4 = function3;
            z17 = z16;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if (i15 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if ((i11 & 128) != 0) {
                    navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                    i12 &= -29360129;
                } else {
                    navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                }
                if (i19 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                z15 = z13;
                z16 = z14;
                navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                i21 = i12;
            } else {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if (i15 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if ((i11 & 128) != 0) {
                    navigationRailItemColorsM1186colors69fazGs = NavigationRailItemDefaults.INSTANCE.m1186colors69fazGs(0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 12582912, 127);
                    i12 &= -29360129;
                } else {
                    navigationRailItemColorsM1186colors69fazGs = navigationRailItemColors;
                }
                if (i19 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                z15 = z13;
                z16 = z14;
                navigationRailItemColors2 = navigationRailItemColorsM1186colors69fazGs;
                i21 = i12;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1533971045, i21, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
            }
            composer2 = composerStartRestartGroup;
            ComposableLambda composableLambda1112 = ComposableLambdaKt.composableLambda(composer2, -1023357515, true, new f(navigationRailItemColors2, z10, z15, i21, function3, z16, icon));
            if (function3 != null) {
                composableLambda = ComposableLambdaKt.composableLambda(composer2, -105269599, true, new g(navigationRailItemColors2, z10, z15, i21, function3));
            } else {
                composableLambda = null;
            }
            Modifier modifierM321height3ABfNKs1111 = SizeKt.m321height3ABfNKs(SelectableKt.m458selectableO2vRcR0(modifier2, z10, mutableInteractionSource3, null, z15, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), f10877d);
            float f11111110 = f10876c;
            Modifier modifierM342widthInVpY3zN4$default1111 = SizeKt.m342widthInVpY3zN4$default(modifierM321height3ABfNKs1111, f11111110, 0.0f, 2, null);
            Alignment center1111 = Alignment.INSTANCE.getCenter();
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy1111 = BoxKt.rememberBoxMeasurePolicy(center1111, false, composer2, 6);
            Density density1111111 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
            LayoutDirection layoutDirection1111 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration1111 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
            constructor = companion1111.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1111 = LayoutKt.materializerOf(modifierM342widthInVpY3zN4$default1111);
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
            Composer composerM2074constructorimpl1111 = Updater.m2074constructorimpl(composer2);
            Updater.m2081setimpl(composerM2074constructorimpl1111, layoutDirection1111, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion1111, composerM2074constructorimpl1111, measurePolicyRememberBoxMeasurePolicy1111, composerM2074constructorimpl1111, density1111111));
            ai.a.j(0, function3MaterializerOf1111, androidx.appcompat.widget.g0.b(companion1111, composerM2074constructorimpl1111, viewConfiguration1111, composer2, composer2), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance1111 = BoxScopeInstance.INSTANCE;
            if (z10) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            int i21113 = i21;
            float f11111111 = f6;
            mutableInteractionSource4 = mutableInteractionSource3;
            NavigationRailItemColors navigationRailItemColors1114 = navigationRailItemColors2;
            State<Float> stateAnimateFloatAsState1111 = AnimateAsStateKt.animateFloatAsState(f11111111, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer2, 48, 28);
            Density density1111112 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            int iMo413roundToPx0680j_1114 = density1111112.mo413roundToPx0680j_4(f11111110);
            navigationRailTokens = NavigationRailTokens.INSTANCE;
            jOffset = OffsetKt.Offset((iMo413roundToPx0680j_1114 - density1111112.mo413roundToPx0680j_4(navigationRailTokens.m1796getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
            Unit unit1111 = Unit.INSTANCE;
            Offset offsetM2264boximpl1111 = Offset.m2264boximpl(jOffset);
            composer2.startReplaceableGroup(511388516);
            zChanged = composer2.changed(offsetM2264boximpl1111) | composer2.changed(mutableInteractionSource4);
            objRememberedValue2 = composer2.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                composer2.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource4, jOffset, null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            MappedInteractionSource mappedInteractionSource1111 = (MappedInteractionSource) objRememberedValue2;
            if (function3 != null) {
                composer2.startReplaceableGroup(1104516975);
                shape = ShapesKt.toShape(navigationRailTokens.getActiveIndicatorShape(), composer2, 6);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(1104517056);
                shape = ShapesKt.toShape(navigationRailTokens.getNoLabelActiveIndicatorShape(), composer2, 6);
                composer2.endReplaceableGroup();
            }
            a(ComposableLambdaKt.composableLambda(composer2, 211026382, true, new d(shape, mappedInteractionSource1111)), ComposableLambdaKt.composableLambda(composer2, -1862011490, true, new c(navigationRailItemColors1114, i21113, shape, stateAnimateFloatAsState1111)), composableLambda1112, composableLambda, z16, stateAnimateFloatAsState1111.getValue().floatValue(), composer2, ((i21113 >> 6) & 57344) | 438);
            if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource2 = mutableInteractionSource4;
            navigationRailItemColors3 = navigationRailItemColors1114;
            modifier3 = modifier2;
            z13 = z15;
            function4 = function3;
            z17 = z16;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, onClick, icon, modifier3, z13, function4, z17, navigationRailItemColors3, mutableInteractionSource2, i10, i11));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void a(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, boolean z10, float f6, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-876426901);
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
                ComposerKt.traceEventStart(-876426901, i11, -1, "androidx.compose.material3.NavigationRailItemBaselineLayout (NavigationRail.kt:426)");
            }
            h hVar = new h(f6, z10, function5);
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
            Updater.m2081setimpl(composerM2074constructorimpl, hVar, companion2.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, density, companion2.getSetDensity());
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m2081setimpl(composerM2074constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            ai.a.j(0, function3MaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i11 & 14));
            composerStartRestartGroup.startReplaceableGroup(935757179);
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
            composerStartRestartGroup.startReplaceableGroup(-853550242);
            if (function5 != null) {
                Modifier modifierAlpha = AlphaKt.alpha(LayoutIdKt.layoutId(companion, "label"), z10 ? 1.0f : f6);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(companion3, false, composerStartRestartGroup, 0, -1323940314);
                Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierAlpha);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new i(function2, function3, function4, function5, z10, f6, i10));
    }

    public static final float access$NavigationRailItem$lambda$5$lambda$2(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: access$placeIcon-X9ElhV4, reason: not valid java name */
    public static final MeasureResult m1189access$placeIconX9ElhV4(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, long j10) {
        int iM4371constrainWidthK40F9xA = ConstraintsKt.m4371constrainWidthK40F9xA(j10, Math.max(placeable.getWidth(), Math.max(placeable2.getWidth(), placeable3 != null ? placeable3.getWidth() : 0)));
        int iM4356getMaxHeightimpl = Constraints.m4356getMaxHeightimpl(j10);
        return MeasureScope.CC.q(measureScope, iM4371constrainWidthK40F9xA, iM4356getMaxHeightimpl, null, new l0.p2(androidx.collection.a.a(placeable, iM4371constrainWidthK40F9xA, 2), androidx.appcompat.app.i.a(placeable, iM4356getMaxHeightimpl, 2), androidx.collection.a.a(placeable2, iM4371constrainWidthK40F9xA, 2), androidx.appcompat.app.i.a(placeable2, iM4356getMaxHeightimpl, 2), iM4371constrainWidthK40F9xA, iM4356getMaxHeightimpl, placeable3, placeable, placeable2), 4, null);
    }

    /* JADX INFO: renamed from: access$placeLabelAndIcon-zUg2_y0, reason: not valid java name */
    public static final MeasureResult m1190access$placeLabelAndIconzUg2_y0(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, long j10, boolean z10, float f6) {
        int iM4356getMaxHeightimpl = Constraints.m4356getMaxHeightimpl(j10);
        int height = iM4356getMaxHeightimpl - placeable.getHeight();
        float f10 = f10878e;
        int iMo413roundToPx0680j_4 = height - measureScope.mo413roundToPx0680j_4(f10);
        int iMo413roundToPx0680j_5 = measureScope.mo413roundToPx0680j_4(f10);
        int iRoundToInt = mk.c.roundToInt((1 - f6) * ((z10 ? iMo413roundToPx0680j_5 : androidx.appcompat.app.i.a(placeable2, iM4356getMaxHeightimpl, 2)) - iMo413roundToPx0680j_5));
        int iM4371constrainWidthK40F9xA = ConstraintsKt.m4371constrainWidthK40F9xA(j10, Math.max(placeable2.getWidth(), Math.max(placeable.getWidth(), placeable4 != null ? placeable4.getWidth() : 0)));
        return MeasureScope.CC.q(measureScope, iM4371constrainWidthK40F9xA, iM4356getMaxHeightimpl, null, new l0.q2(placeable4, z10, f6, placeable, androidx.collection.a.a(placeable, iM4371constrainWidthK40F9xA, 2), iMo413roundToPx0680j_4, iRoundToInt, placeable2, androidx.collection.a.a(placeable2, iM4371constrainWidthK40F9xA, 2), iMo413roundToPx0680j_5, placeable3, androidx.collection.a.a(placeable3, iM4371constrainWidthK40F9xA, 2), iMo413roundToPx0680j_5 - measureScope.mo413roundToPx0680j_4(f10880g), iM4371constrainWidthK40F9xA, measureScope), 4, null);
    }

    public static final float getNavigationRailItemHeight() {
        return f10877d;
    }

    public static final float getNavigationRailItemVerticalPadding() {
        return f10878e;
    }

    public static final float getNavigationRailItemWidth() {
        return f10876c;
    }

    public static final float getNavigationRailVerticalPadding() {
        return f10874a;
    }
}
