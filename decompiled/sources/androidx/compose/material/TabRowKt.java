package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a¢\u0001\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u000423\b\u0002\u0010\u0010\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a¬\u0001\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u001723\b\u0002\u0010\u0010\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"", "selectedTabIndex", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Lkotlin/Function1;", "", "Landroidx/compose/material/TabPosition;", "Lkotlin/ParameterName;", "name", "tabPositions", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "indicator", "Lkotlin/Function0;", "divider", "tabs", "TabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TabRow", "Landroidx/compose/ui/unit/Dp;", "edgePadding", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRow", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,517:1\n154#2:518\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt\n*L\n508#1:518\n*E\n"})
public final class TabRowKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f8098a = Dp.m4389constructorimpl(90);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final TweenSpec f8099b = AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX INFO: compiled from: TabRow.kt */
    public static final class a extends Lambda implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f8100p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(3);
            this.f8100p0 = i10;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
            List<? extends TabPosition> tabPositions = list;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-655609869, iIntValue, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
            }
            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
            tabRowDefaults.m853Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(this.f8100p0)), 0.0f, 0L, composer2, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TabRow.kt */
    @SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$ScrollableTabRow$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,517:1\n486#2,4:518\n490#2,2:526\n494#2:532\n25#3:522\n50#3:533\n49#3:534\n1097#4,3:523\n1100#4,3:529\n1097#4,6:535\n486#5:528\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$ScrollableTabRow$2\n*L\n247#1:518,4\n247#1:526,2\n247#1:532\n247#1:522\n248#1:533\n248#1:534\n247#1:523,3\n247#1:529,3\n248#1:535,6\n247#1:528\n*E\n"})
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f8101p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8102q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8103r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f8104s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f8105t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f8106u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(float f6, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, int i10, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function4, int i11) {
            super(2);
            this.f8101p0 = f6;
            this.f8102q0 = function2;
            this.f8103r0 = function3;
            this.f8104s0 = i10;
            this.f8105t0 = function4;
            this.f8106u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1455860572, iIntValue, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:244)");
                }
                ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                Object objB = androidx.databinding.c.b(composer2, 773894976, -492369756);
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                }
                composer2.endReplaceableGroup();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(511388516);
                boolean zChanged = composer2.changed(scrollStateRememberScrollState) | composer2.changed(coroutineScope);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new h0.l2(scrollStateRememberScrollState, coroutineScope);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                SubcomposeLayoutKt.SubcomposeLayout(ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null))), new y2(this.f8101p0, this.f8102q0, this.f8103r0, (h0.l2) objRememberedValue, this.f8104s0, this.f8105t0, this.f8106u0), composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TabRow.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f8107p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f8108q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f8109r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f8110s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ float f8111t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f8112u0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8113w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f8114x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f8115y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(int i10, Modifier modifier, long j10, long j11, float f6, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function4, int i11, int i12) {
            super(2);
            this.f8107p0 = i10;
            this.f8108q0 = modifier;
            this.f8109r0 = j10;
            this.f8110s0 = j11;
            this.f8111t0 = f6;
            this.f8112u0 = function3;
            this.v0 = function2;
            this.f8113w0 = function4;
            this.f8114x0 = i11;
            this.f8115y0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TabRowKt.m857ScrollableTabRowsKfQg0A(this.f8107p0, this.f8108q0, this.f8109r0, this.f8110s0, this.f8111t0, this.f8112u0, this.v0, this.f8113w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8114x0 | 1), this.f8115y0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TabRow.kt */
    public static final class d extends Lambda implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f8116p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10) {
            super(3);
            this.f8116p0 = i10;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
            List<? extends TabPosition> tabPositions = list;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-553782708, iIntValue, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
            }
            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
            tabRowDefaults.m853Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(this.f8116p0)), 0.0f, 0L, composer2, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TabRow.kt */
    @SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$TabRow$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,517:1\n67#2,3:518\n66#2:521\n1097#3,6:522\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$TabRow$2\n*L\n151#1:518,3\n151#1:521\n151#1:522,6\n*E\n"})
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8117p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8118q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f8119r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f8120s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10, Function2 function2, Function2 function3, Function3 function4) {
            super(2);
            this.f8117p0 = function2;
            this.f8118q0 = function3;
            this.f8119r0 = function4;
            this.f8120s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1961746365, iIntValue, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:149)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                composer2.startReplaceableGroup(1618982084);
                Function2<Composer, Integer, Unit> function2 = this.f8117p0;
                boolean zChanged = composer2.changed(function2);
                Function2<Composer, Integer, Unit> function3 = this.f8118q0;
                boolean zChanged2 = zChanged | composer2.changed(function3);
                Function3<List<TabPosition>, Composer, Integer, Unit> function4 = this.f8119r0;
                boolean zChanged3 = zChanged2 | composer2.changed(function4);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new b3(this.f8120s0, function2, function3, function4);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TabRow.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f8121p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f8122q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f8123r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f8124s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f8125t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8126u0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f8127w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f8128x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(int i10, Modifier modifier, long j10, long j11, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function4, int i11, int i12) {
            super(2);
            this.f8121p0 = i10;
            this.f8122q0 = modifier;
            this.f8123r0 = j10;
            this.f8124s0 = j11;
            this.f8125t0 = function3;
            this.f8126u0 = function2;
            this.v0 = function4;
            this.f8127w0 = i11;
            this.f8128x0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TabRowKt.m858TabRowpAZo6Ak(this.f8121p0, this.f8122q0, this.f8123r0, this.f8124s0, this.f8125t0, this.f8126u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8127w0 | 1), this.f8128x0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0139  */
    /* JADX WARN: Code duplicated, block: B:107:0x013c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0142  */
    /* JADX WARN: Code duplicated, block: B:113:0x0153  */
    /* JADX WARN: Code duplicated, block: B:115:0x015f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0166  */
    /* JADX WARN: Code duplicated, block: B:118:0x0169  */
    /* JADX WARN: Code duplicated, block: B:119:0x0176  */
    /* JADX WARN: Code duplicated, block: B:121:0x017a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0188  */
    /* JADX WARN: Code duplicated, block: B:126:0x0194  */
    /* JADX WARN: Code duplicated, block: B:129:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
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
    /* JADX WARN: Code duplicated, block: B:93:0x0110  */
    /* JADX WARN: Code duplicated, block: B:95:0x0118  */
    @Composable
    @UiComposable
    /* JADX INFO: renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    public static final void m857ScrollableTabRowsKfQg0A(int i10, @Nullable Modifier modifier, long j10, long j11, float f6, @Nullable Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @NotNull Function2<? super Composer, ? super Integer, Unit> tabs, @Nullable Composer composer, int i11, int i12) {
        int i13;
        long primarySurface;
        long jM731contentColorForek8zF_U;
        int i14;
        float f10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Modifier modifier2;
        float fM856getScrollableTabRowPaddingD9Ej5fM;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3ComposableLambda;
        Function2<? super Composer, ? super Integer, Unit> function2M745getLambda2$material_release;
        int i21;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function4;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function5;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1473476840);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (composerStartRestartGroup.changed(i10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i22 = i12 & 2;
        if (i22 == 0) {
            if ((i11 & 112) == 0) {
                i13 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i11 & 896) == 0) {
                if ((i12 & 4) == 0) {
                    primarySurface = j10;
                    int i23 = composerStartRestartGroup.changed(primarySurface) ? 256 : 128;
                    i13 |= i23;
                } else {
                    primarySurface = j10;
                }
                i13 |= i23;
            } else {
                primarySurface = j10;
            }
            if ((i11 & 7168) == 0) {
                if ((i12 & 8) == 0) {
                    jM731contentColorForek8zF_U = j11;
                    int i24 = composerStartRestartGroup.changed(jM731contentColorForek8zF_U) ? 2048 : 1024;
                    i13 |= i24;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                i13 |= i24;
            } else {
                jM731contentColorForek8zF_U = j11;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((57344 & i11) == 0) {
                    f10 = f6;
                    if (composerStartRestartGroup.changed(f10)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i11 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                if ((i12 & 128) != 0) {
                    if ((29360128 & i11) == 0) {
                        if (composerStartRestartGroup.changedInstance(tabs)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                    }
                    if ((23967451 & i13) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                                i13 &= -7169;
                            }
                            if (i14 != 0) {
                                fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                            } else {
                                fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                            }
                            if (i16 != 0) {
                                function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                            } else {
                                function3ComposableLambda = function3;
                            }
                            if (i18 != 0) {
                                function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                            } else {
                                function2M745getLambda2$material_release = function2;
                            }
                            Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function6 = function3ComposableLambda;
                            i21 = i13;
                            function4 = function6;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                i13 &= -7169;
                            }
                            modifier2 = modifier;
                            function2M745getLambda2$material_release = function2;
                            i21 = i13;
                            fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                            function4 = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1473476840, i21, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                        }
                        SurfaceKt.m834SurfaceFjzlyU(modifier2, null, primarySurface, jM731contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new b(fM856getScrollableTabRowPaddingD9Ej5fM, tabs, function2M745getLambda2$material_release, i10, function4, i21)), composerStartRestartGroup, ((i21 >> 3) & 14) | 1572864 | (i21 & 896) | (i21 & 7168), 50);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function5 = function4;
                        f10 = fM856getScrollableTabRowPaddingD9Ej5fM;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        function5 = function3;
                        function2M745getLambda2$material_release = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(i10, modifier3, primarySurface, jM731contentColorForek8zF_U, f10, function5, function2M745getLambda2$material_release, tabs, i11, i12));
                }
                i20 = 12582912;
                i13 |= i20;
                if ((23967451 & i13) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                        }
                        if (i16 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i18 != 0) {
                            function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                        } else {
                            function2M745getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function7 = function3ComposableLambda;
                        i21 = i13;
                        function4 = function7;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                        }
                        if (i16 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i18 != 0) {
                            function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                        } else {
                            function2M745getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function8 = function3ComposableLambda;
                        i21 = i13;
                        function4 = function8;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1473476840, i21, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                    }
                    SurfaceKt.m834SurfaceFjzlyU(modifier2, null, primarySurface, jM731contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new b(fM856getScrollableTabRowPaddingD9Ej5fM, tabs, function2M745getLambda2$material_release, i10, function4, i21)), composerStartRestartGroup, ((i21 >> 3) & 14) | 1572864 | (i21 & 896) | (i21 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function4;
                    f10 = fM856getScrollableTabRowPaddingD9Ej5fM;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                        }
                        if (i16 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i18 != 0) {
                            function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                        } else {
                            function2M745getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function9 = function3ComposableLambda;
                        i21 = i13;
                        function4 = function9;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                        }
                        if (i16 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i18 != 0) {
                            function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                        } else {
                            function2M745getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function10 = function3ComposableLambda;
                        i21 = i13;
                        function4 = function10;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1473476840, i21, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                    }
                    SurfaceKt.m834SurfaceFjzlyU(modifier2, null, primarySurface, jM731contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new b(fM856getScrollableTabRowPaddingD9Ej5fM, tabs, function2M745getLambda2$material_release, i10, function4, i21)), composerStartRestartGroup, ((i21 >> 3) & 14) | 1572864 | (i21 & 896) | (i21 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function4;
                    f10 = fM856getScrollableTabRowPaddingD9Ej5fM;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(i10, modifier3, primarySurface, jM731contentColorForek8zF_U, f10, function5, function2M745getLambda2$material_release, tabs, i11, i12));
            }
            i13 |= 24576;
            f10 = f6;
            i16 = i12 & 32;
            if (i16 != 0) {
                i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i11 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
            if ((i12 & 128) != 0) {
                if ((29360128 & i11) == 0) {
                    if (composerStartRestartGroup.changedInstance(tabs)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                }
                if ((23967451 & i13) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                        }
                        if (i16 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i18 != 0) {
                            function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                        } else {
                            function2M745getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function11 = function3ComposableLambda;
                        i21 = i13;
                        function4 = function11;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                        }
                        if (i16 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i18 != 0) {
                            function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                        } else {
                            function2M745getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function12 = function3ComposableLambda;
                        i21 = i13;
                        function4 = function12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1473476840, i21, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                    }
                    SurfaceKt.m834SurfaceFjzlyU(modifier2, null, primarySurface, jM731contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new b(fM856getScrollableTabRowPaddingD9Ej5fM, tabs, function2M745getLambda2$material_release, i10, function4, i21)), composerStartRestartGroup, ((i21 >> 3) & 14) | 1572864 | (i21 & 896) | (i21 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function4;
                    f10 = fM856getScrollableTabRowPaddingD9Ej5fM;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                        }
                        if (i16 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i18 != 0) {
                            function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                        } else {
                            function2M745getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function13 = function3ComposableLambda;
                        i21 = i13;
                        function4 = function13;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                        }
                        if (i16 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i18 != 0) {
                            function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                        } else {
                            function2M745getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function14 = function3ComposableLambda;
                        i21 = i13;
                        function4 = function14;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1473476840, i21, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                    }
                    SurfaceKt.m834SurfaceFjzlyU(modifier2, null, primarySurface, jM731contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new b(fM856getScrollableTabRowPaddingD9Ej5fM, tabs, function2M745getLambda2$material_release, i10, function4, i21)), composerStartRestartGroup, ((i21 >> 3) & 14) | 1572864 | (i21 & 896) | (i21 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function4;
                    f10 = fM856getScrollableTabRowPaddingD9Ej5fM;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(i10, modifier3, primarySurface, jM731contentColorForek8zF_U, f10, function5, function2M745getLambda2$material_release, tabs, i11, i12));
            }
            i20 = 12582912;
            i13 |= i20;
            if ((23967451 & i13) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                    }
                    if (i16 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i18 != 0) {
                        function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                    } else {
                        function2M745getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function15 = function3ComposableLambda;
                    i21 = i13;
                    function4 = function15;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                    }
                    if (i16 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i18 != 0) {
                        function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                    } else {
                        function2M745getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function16 = function3ComposableLambda;
                    i21 = i13;
                    function4 = function16;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1473476840, i21, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                }
                SurfaceKt.m834SurfaceFjzlyU(modifier2, null, primarySurface, jM731contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new b(fM856getScrollableTabRowPaddingD9Ej5fM, tabs, function2M745getLambda2$material_release, i10, function4, i21)), composerStartRestartGroup, ((i21 >> 3) & 14) | 1572864 | (i21 & 896) | (i21 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function4;
                f10 = fM856getScrollableTabRowPaddingD9Ej5fM;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                    }
                    if (i16 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i18 != 0) {
                        function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                    } else {
                        function2M745getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function17 = function3ComposableLambda;
                    i21 = i13;
                    function4 = function17;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                    }
                    if (i16 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i18 != 0) {
                        function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                    } else {
                        function2M745getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function18 = function3ComposableLambda;
                    i21 = i13;
                    function4 = function18;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1473476840, i21, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                }
                SurfaceKt.m834SurfaceFjzlyU(modifier2, null, primarySurface, jM731contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new b(fM856getScrollableTabRowPaddingD9Ej5fM, tabs, function2M745getLambda2$material_release, i10, function4, i21)), composerStartRestartGroup, ((i21 >> 3) & 14) | 1572864 | (i21 & 896) | (i21 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function4;
                f10 = fM856getScrollableTabRowPaddingD9Ej5fM;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(i10, modifier3, primarySurface, jM731contentColorForek8zF_U, f10, function5, function2M745getLambda2$material_release, tabs, i11, i12));
        }
        i13 |= 48;
        if ((i11 & 896) == 0) {
            if ((i12 & 4) == 0) {
                primarySurface = j10;
                if (composerStartRestartGroup.changed(primarySurface)) {
                }
                i13 |= i23;
            } else {
                primarySurface = j10;
            }
            i13 |= i23;
        } else {
            primarySurface = j10;
        }
        if ((i11 & 7168) == 0) {
            if ((i12 & 8) == 0) {
                jM731contentColorForek8zF_U = j11;
                if (composerStartRestartGroup.changed(jM731contentColorForek8zF_U)) {
                }
                i13 |= i24;
            } else {
                jM731contentColorForek8zF_U = j11;
            }
            i13 |= i24;
        } else {
            jM731contentColorForek8zF_U = j11;
        }
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((57344 & i11) == 0) {
                f10 = f6;
                if (composerStartRestartGroup.changed(f10)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i11 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
            if ((i12 & 128) != 0) {
                if ((29360128 & i11) == 0) {
                    if (composerStartRestartGroup.changedInstance(tabs)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                }
                if ((23967451 & i13) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                        }
                        if (i16 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i18 != 0) {
                            function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                        } else {
                            function2M745getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function19 = function3ComposableLambda;
                        i21 = i13;
                        function4 = function19;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                        }
                        if (i16 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i18 != 0) {
                            function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                        } else {
                            function2M745getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function110 = function3ComposableLambda;
                        i21 = i13;
                        function4 = function110;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1473476840, i21, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                    }
                    SurfaceKt.m834SurfaceFjzlyU(modifier2, null, primarySurface, jM731contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new b(fM856getScrollableTabRowPaddingD9Ej5fM, tabs, function2M745getLambda2$material_release, i10, function4, i21)), composerStartRestartGroup, ((i21 >> 3) & 14) | 1572864 | (i21 & 896) | (i21 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function4;
                    f10 = fM856getScrollableTabRowPaddingD9Ej5fM;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                        }
                        if (i16 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i18 != 0) {
                            function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                        } else {
                            function2M745getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function111 = function3ComposableLambda;
                        i21 = i13;
                        function4 = function111;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                        } else {
                            fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                        }
                        if (i16 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i18 != 0) {
                            function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                        } else {
                            function2M745getLambda2$material_release = function2;
                        }
                        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function112 = function3ComposableLambda;
                        i21 = i13;
                        function4 = function112;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1473476840, i21, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                    }
                    SurfaceKt.m834SurfaceFjzlyU(modifier2, null, primarySurface, jM731contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new b(fM856getScrollableTabRowPaddingD9Ej5fM, tabs, function2M745getLambda2$material_release, i10, function4, i21)), composerStartRestartGroup, ((i21 >> 3) & 14) | 1572864 | (i21 & 896) | (i21 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function4;
                    f10 = fM856getScrollableTabRowPaddingD9Ej5fM;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(i10, modifier3, primarySurface, jM731contentColorForek8zF_U, f10, function5, function2M745getLambda2$material_release, tabs, i11, i12));
            }
            i20 = 12582912;
            i13 |= i20;
            if ((23967451 & i13) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                    }
                    if (i16 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i18 != 0) {
                        function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                    } else {
                        function2M745getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function113 = function3ComposableLambda;
                    i21 = i13;
                    function4 = function113;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                    }
                    if (i16 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i18 != 0) {
                        function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                    } else {
                        function2M745getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function114 = function3ComposableLambda;
                    i21 = i13;
                    function4 = function114;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1473476840, i21, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                }
                SurfaceKt.m834SurfaceFjzlyU(modifier2, null, primarySurface, jM731contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new b(fM856getScrollableTabRowPaddingD9Ej5fM, tabs, function2M745getLambda2$material_release, i10, function4, i21)), composerStartRestartGroup, ((i21 >> 3) & 14) | 1572864 | (i21 & 896) | (i21 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function4;
                f10 = fM856getScrollableTabRowPaddingD9Ej5fM;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                    }
                    if (i16 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i18 != 0) {
                        function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                    } else {
                        function2M745getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function115 = function3ComposableLambda;
                    i21 = i13;
                    function4 = function115;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                    }
                    if (i16 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i18 != 0) {
                        function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                    } else {
                        function2M745getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function116 = function3ComposableLambda;
                    i21 = i13;
                    function4 = function116;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1473476840, i21, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                }
                SurfaceKt.m834SurfaceFjzlyU(modifier2, null, primarySurface, jM731contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new b(fM856getScrollableTabRowPaddingD9Ej5fM, tabs, function2M745getLambda2$material_release, i10, function4, i21)), composerStartRestartGroup, ((i21 >> 3) & 14) | 1572864 | (i21 & 896) | (i21 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function4;
                f10 = fM856getScrollableTabRowPaddingD9Ej5fM;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(i10, modifier3, primarySurface, jM731contentColorForek8zF_U, f10, function5, function2M745getLambda2$material_release, tabs, i11, i12));
        }
        i13 |= 24576;
        f10 = f6;
        i16 = i12 & 32;
        if (i16 != 0) {
            i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i11 & 458752) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i13 |= i17;
        }
        i18 = i12 & 64;
        if (i18 != 0) {
            i13 |= 1572864;
        } else if ((i11 & 3670016) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i13 |= i19;
        }
        if ((i12 & 128) != 0) {
            if ((29360128 & i11) == 0) {
                if (composerStartRestartGroup.changedInstance(tabs)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
            }
            if ((23967451 & i13) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                    }
                    if (i16 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i18 != 0) {
                        function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                    } else {
                        function2M745getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function117 = function3ComposableLambda;
                    i21 = i13;
                    function4 = function117;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                    }
                    if (i16 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i18 != 0) {
                        function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                    } else {
                        function2M745getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function118 = function3ComposableLambda;
                    i21 = i13;
                    function4 = function118;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1473476840, i21, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                }
                SurfaceKt.m834SurfaceFjzlyU(modifier2, null, primarySurface, jM731contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new b(fM856getScrollableTabRowPaddingD9Ej5fM, tabs, function2M745getLambda2$material_release, i10, function4, i21)), composerStartRestartGroup, ((i21 >> 3) & 14) | 1572864 | (i21 & 896) | (i21 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function4;
                f10 = fM856getScrollableTabRowPaddingD9Ej5fM;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                    }
                    if (i16 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i18 != 0) {
                        function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                    } else {
                        function2M745getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function119 = function3ComposableLambda;
                    i21 = i13;
                    function4 = function119;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                    } else {
                        fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                    }
                    if (i16 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i18 != 0) {
                        function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                    } else {
                        function2M745getLambda2$material_release = function2;
                    }
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1110 = function3ComposableLambda;
                    i21 = i13;
                    function4 = function1110;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1473476840, i21, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
                }
                SurfaceKt.m834SurfaceFjzlyU(modifier2, null, primarySurface, jM731contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new b(fM856getScrollableTabRowPaddingD9Ej5fM, tabs, function2M745getLambda2$material_release, i10, function4, i21)), composerStartRestartGroup, ((i21 >> 3) & 14) | 1572864 | (i21 & 896) | (i21 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function4;
                f10 = fM856getScrollableTabRowPaddingD9Ej5fM;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(i10, modifier3, primarySurface, jM731contentColorForek8zF_U, f10, function5, function2M745getLambda2$material_release, tabs, i11, i12));
        }
        i20 = 12582912;
        i13 |= i20;
        if ((23967451 & i13) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i12 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                } else {
                    fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                }
                if (i16 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                } else {
                    function3ComposableLambda = function3;
                }
                if (i18 != 0) {
                    function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                } else {
                    function2M745getLambda2$material_release = function2;
                }
                Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1111 = function3ComposableLambda;
                i21 = i13;
                function4 = function1111;
            } else {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i12 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                } else {
                    fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                }
                if (i16 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                } else {
                    function3ComposableLambda = function3;
                }
                if (i18 != 0) {
                    function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                } else {
                    function2M745getLambda2$material_release = function2;
                }
                Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1112 = function3ComposableLambda;
                i21 = i13;
                function4 = function1112;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1473476840, i21, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
            }
            SurfaceKt.m834SurfaceFjzlyU(modifier2, null, primarySurface, jM731contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new b(fM856getScrollableTabRowPaddingD9Ej5fM, tabs, function2M745getLambda2$material_release, i10, function4, i21)), composerStartRestartGroup, ((i21 >> 3) & 14) | 1572864 | (i21 & 896) | (i21 & 7168), 50);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function5 = function4;
            f10 = fM856getScrollableTabRowPaddingD9Ej5fM;
            modifier3 = modifier2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i12 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                } else {
                    fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                }
                if (i16 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                } else {
                    function3ComposableLambda = function3;
                }
                if (i18 != 0) {
                    function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                } else {
                    function2M745getLambda2$material_release = function2;
                }
                Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1113 = function3ComposableLambda;
                i21 = i13;
                function4 = function1113;
            } else {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i12 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    fM856getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m856getScrollableTabRowPaddingD9Ej5fM();
                } else {
                    fM856getScrollableTabRowPaddingD9Ej5fM = f10;
                }
                if (i16 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -655609869, true, new a(i10));
                } else {
                    function3ComposableLambda = function3;
                }
                if (i18 != 0) {
                    function2M745getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m745getLambda2$material_release();
                } else {
                    function2M745getLambda2$material_release = function2;
                }
                Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function1114 = function3ComposableLambda;
                i21 = i13;
                function4 = function1114;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1473476840, i21, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:222)");
            }
            SurfaceKt.m834SurfaceFjzlyU(modifier2, null, primarySurface, jM731contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455860572, true, new b(fM856getScrollableTabRowPaddingD9Ej5fM, tabs, function2M745getLambda2$material_release, i10, function4, i21)), composerStartRestartGroup, ((i21 >> 3) & 14) | 1572864 | (i21 & 896) | (i21 & 7168), 50);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function5 = function4;
            f10 = fM856getScrollableTabRowPaddingD9Ej5fM;
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(i10, modifier3, primarySurface, jM731contentColorForek8zF_U, f10, function5, function2M745getLambda2$material_release, tabs, i11, i12));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0130  */
    /* JADX WARN: Code duplicated, block: B:106:0x013c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0149  */
    /* JADX WARN: Code duplicated, block: B:109:0x014c  */
    /* JADX WARN: Code duplicated, block: B:113:0x015e  */
    /* JADX WARN: Code duplicated, block: B:116:0x019c  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0116  */
    /* JADX WARN: Code duplicated, block: B:98:0x0119  */
    @Composable
    @UiComposable
    /* JADX INFO: renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    public static final void m858TabRowpAZo6Ak(int i10, @Nullable Modifier modifier, long j10, long j11, @Nullable Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @NotNull Function2<? super Composer, ? super Integer, Unit> tabs, @Nullable Composer composer, int i11, int i12) {
        int i13;
        long primarySurface;
        long jM731contentColorForek8zF_U;
        int i14;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function4;
        int i15;
        int i16;
        Function2<? super Composer, ? super Integer, Unit> function2M744getLambda1$material_release;
        int i17;
        int i18;
        Modifier modifier2;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3ComposableLambda;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function5;
        int i19;
        Function2<? super Composer, ? super Integer, Unit> function6;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i20;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Composer composerStartRestartGroup = composer.startRestartGroup(-249175289);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (composerStartRestartGroup.changed(i10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i21 = i12 & 2;
        if (i21 == 0) {
            if ((i11 & 112) == 0) {
                i13 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i11 & 896) == 0) {
                if ((i12 & 4) == 0) {
                    primarySurface = j10;
                    int i22 = composerStartRestartGroup.changed(primarySurface) ? 256 : 128;
                    i13 |= i22;
                } else {
                    primarySurface = j10;
                }
                i13 |= i22;
            } else {
                primarySurface = j10;
            }
            if ((i11 & 7168) == 0) {
                jM731contentColorForek8zF_U = j11;
                if ((i12 & 8) == 0 || !composerStartRestartGroup.changed(jM731contentColorForek8zF_U)) {
                    i20 = 1024;
                } else {
                    i20 = 2048;
                }
                i13 |= i20;
            } else {
                jM731contentColorForek8zF_U = j11;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((57344 & i11) == 0) {
                    function4 = function3;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    if ((458752 & i11) == 0) {
                        function2M744getLambda1$material_release = function2;
                        if (composerStartRestartGroup.changedInstance(function2M744getLambda1$material_release)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i13 |= i17;
                    }
                    if ((i12 & 64) != 0) {
                        i13 |= 1572864;
                    } else if ((i11 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(tabs)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i13 |= i18;
                    }
                    if ((i13 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i21 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                                i13 &= -7169;
                            }
                            if (i14 != 0) {
                                function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                            } else {
                                function3ComposableLambda = function4;
                            }
                            if (i16 != 0) {
                                function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                            }
                            function5 = function3ComposableLambda;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                i13 &= -7169;
                            }
                            modifier2 = modifier;
                            function5 = function4;
                        }
                        long j12 = jM731contentColorForek8zF_U;
                        i19 = i13;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-249175289, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                        }
                        function6 = function2M744getLambda1$material_release;
                        SurfaceKt.m834SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j12, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new e(i19, tabs, function2M744getLambda1$material_release, function5)), composerStartRestartGroup, (i19 & 896) | 1572864 | (i19 & 7168), 50);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        jM731contentColorForek8zF_U = j12;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        function5 = function4;
                        function6 = function2M744getLambda1$material_release;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, primarySurface, jM731contentColorForek8zF_U, function5, function6, tabs, i11, i12));
                }
                i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function2M744getLambda1$material_release = function2;
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(tabs)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                if ((i13 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    }
                    long j13 = jM731contentColorForek8zF_U;
                    i19 = i13;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-249175289, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                    }
                    function6 = function2M744getLambda1$material_release;
                    SurfaceKt.m834SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j13, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new e(i19, tabs, function2M744getLambda1$material_release, function5)), composerStartRestartGroup, (i19 & 896) | 1572864 | (i19 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    jM731contentColorForek8zF_U = j13;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    }
                    long j14 = jM731contentColorForek8zF_U;
                    i19 = i13;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-249175289, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                    }
                    function6 = function2M744getLambda1$material_release;
                    SurfaceKt.m834SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j14, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new e(i19, tabs, function2M744getLambda1$material_release, function5)), composerStartRestartGroup, (i19 & 896) | 1572864 | (i19 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    jM731contentColorForek8zF_U = j14;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, primarySurface, jM731contentColorForek8zF_U, function5, function6, tabs, i11, i12));
            }
            i13 |= 24576;
            function4 = function3;
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((458752 & i11) == 0) {
                    function2M744getLambda1$material_release = function2;
                    if (composerStartRestartGroup.changedInstance(function2M744getLambda1$material_release)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(tabs)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                if ((i13 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    }
                    long j15 = jM731contentColorForek8zF_U;
                    i19 = i13;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-249175289, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                    }
                    function6 = function2M744getLambda1$material_release;
                    SurfaceKt.m834SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j15, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new e(i19, tabs, function2M744getLambda1$material_release, function5)), composerStartRestartGroup, (i19 & 896) | 1572864 | (i19 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    jM731contentColorForek8zF_U = j15;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    }
                    long j16 = jM731contentColorForek8zF_U;
                    i19 = i13;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-249175289, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                    }
                    function6 = function2M744getLambda1$material_release;
                    SurfaceKt.m834SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j16, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new e(i19, tabs, function2M744getLambda1$material_release, function5)), composerStartRestartGroup, (i19 & 896) | 1572864 | (i19 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    jM731contentColorForek8zF_U = j16;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, primarySurface, jM731contentColorForek8zF_U, function5, function6, tabs, i11, i12));
            }
            i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function2M744getLambda1$material_release = function2;
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(tabs)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            if ((i13 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                }
                long j17 = jM731contentColorForek8zF_U;
                i19 = i13;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-249175289, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                }
                function6 = function2M744getLambda1$material_release;
                SurfaceKt.m834SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j17, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new e(i19, tabs, function2M744getLambda1$material_release, function5)), composerStartRestartGroup, (i19 & 896) | 1572864 | (i19 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                jM731contentColorForek8zF_U = j17;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                }
                long j18 = jM731contentColorForek8zF_U;
                i19 = i13;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-249175289, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                }
                function6 = function2M744getLambda1$material_release;
                SurfaceKt.m834SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j18, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new e(i19, tabs, function2M744getLambda1$material_release, function5)), composerStartRestartGroup, (i19 & 896) | 1572864 | (i19 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                jM731contentColorForek8zF_U = j18;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, primarySurface, jM731contentColorForek8zF_U, function5, function6, tabs, i11, i12));
        }
        i13 |= 48;
        if ((i11 & 896) == 0) {
            if ((i12 & 4) == 0) {
                primarySurface = j10;
                if (composerStartRestartGroup.changed(primarySurface)) {
                }
                i13 |= i22;
            } else {
                primarySurface = j10;
            }
            i13 |= i22;
        } else {
            primarySurface = j10;
        }
        if ((i11 & 7168) == 0) {
            jM731contentColorForek8zF_U = j11;
            if ((i12 & 8) == 0) {
                i20 = 1024;
            } else {
                i20 = 1024;
            }
            i13 |= i20;
        } else {
            jM731contentColorForek8zF_U = j11;
        }
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((57344 & i11) == 0) {
                function4 = function3;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((458752 & i11) == 0) {
                    function2M744getLambda1$material_release = function2;
                    if (composerStartRestartGroup.changedInstance(function2M744getLambda1$material_release)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(tabs)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                if ((i13 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    }
                    long j19 = jM731contentColorForek8zF_U;
                    i19 = i13;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-249175289, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                    }
                    function6 = function2M744getLambda1$material_release;
                    SurfaceKt.m834SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j19, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new e(i19, tabs, function2M744getLambda1$material_release, function5)), composerStartRestartGroup, (i19 & 896) | 1572864 | (i19 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    jM731contentColorForek8zF_U = j19;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                        }
                        function5 = function3ComposableLambda;
                    }
                    long j110 = jM731contentColorForek8zF_U;
                    i19 = i13;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-249175289, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                    }
                    function6 = function2M744getLambda1$material_release;
                    SurfaceKt.m834SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j110, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new e(i19, tabs, function2M744getLambda1$material_release, function5)), composerStartRestartGroup, (i19 & 896) | 1572864 | (i19 & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    jM731contentColorForek8zF_U = j110;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, primarySurface, jM731contentColorForek8zF_U, function5, function6, tabs, i11, i12));
            }
            i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function2M744getLambda1$material_release = function2;
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(tabs)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            if ((i13 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                }
                long j111 = jM731contentColorForek8zF_U;
                i19 = i13;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-249175289, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                }
                function6 = function2M744getLambda1$material_release;
                SurfaceKt.m834SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j111, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new e(i19, tabs, function2M744getLambda1$material_release, function5)), composerStartRestartGroup, (i19 & 896) | 1572864 | (i19 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                jM731contentColorForek8zF_U = j111;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                }
                long j112 = jM731contentColorForek8zF_U;
                i19 = i13;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-249175289, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                }
                function6 = function2M744getLambda1$material_release;
                SurfaceKt.m834SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j112, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new e(i19, tabs, function2M744getLambda1$material_release, function5)), composerStartRestartGroup, (i19 & 896) | 1572864 | (i19 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                jM731contentColorForek8zF_U = j112;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, primarySurface, jM731contentColorForek8zF_U, function5, function6, tabs, i11, i12));
        }
        i13 |= 24576;
        function4 = function3;
        i16 = i12 & 32;
        if (i16 != 0) {
            if ((458752 & i11) == 0) {
                function2M744getLambda1$material_release = function2;
                if (composerStartRestartGroup.changedInstance(function2M744getLambda1$material_release)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(tabs)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            if ((i13 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                }
                long j113 = jM731contentColorForek8zF_U;
                i19 = i13;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-249175289, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                }
                function6 = function2M744getLambda1$material_release;
                SurfaceKt.m834SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j113, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new e(i19, tabs, function2M744getLambda1$material_release, function5)), composerStartRestartGroup, (i19 & 896) | 1572864 | (i19 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                jM731contentColorForek8zF_U = j113;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                    }
                    function5 = function3ComposableLambda;
                }
                long j114 = jM731contentColorForek8zF_U;
                i19 = i13;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-249175289, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
                }
                function6 = function2M744getLambda1$material_release;
                SurfaceKt.m834SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j114, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new e(i19, tabs, function2M744getLambda1$material_release, function5)), composerStartRestartGroup, (i19 & 896) | 1572864 | (i19 & 7168), 50);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                jM731contentColorForek8zF_U = j114;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, primarySurface, jM731contentColorForek8zF_U, function5, function6, tabs, i11, i12));
        }
        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        function2M744getLambda1$material_release = function2;
        if ((i12 & 64) != 0) {
            i13 |= 1572864;
        } else if ((i11 & 3670016) == 0) {
            if (composerStartRestartGroup.changedInstance(tabs)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i13 |= i18;
        }
        if ((i13 & 2995931) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i12 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                } else {
                    function3ComposableLambda = function4;
                }
                if (i16 != 0) {
                    function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                }
                function5 = function3ComposableLambda;
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i12 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                } else {
                    function3ComposableLambda = function4;
                }
                if (i16 != 0) {
                    function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                }
                function5 = function3ComposableLambda;
            }
            long j115 = jM731contentColorForek8zF_U;
            i19 = i13;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-249175289, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
            }
            function6 = function2M744getLambda1$material_release;
            SurfaceKt.m834SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j115, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new e(i19, tabs, function2M744getLambda1$material_release, function5)), composerStartRestartGroup, (i19 & 896) | 1572864 | (i19 & 7168), 50);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            jM731contentColorForek8zF_U = j115;
            modifier3 = modifier2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i12 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                } else {
                    function3ComposableLambda = function4;
                }
                if (i16 != 0) {
                    function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                }
                function5 = function3ComposableLambda;
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i12 & 4) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i13 >> 6) & 14);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -553782708, true, new d(i10));
                } else {
                    function3ComposableLambda = function4;
                }
                if (i16 != 0) {
                    function2M744getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m744getLambda1$material_release();
                }
                function5 = function3ComposableLambda;
            }
            long j116 = jM731contentColorForek8zF_U;
            i19 = i13;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-249175289, i19, -1, "androidx.compose.material.TabRow (TabRow.kt:128)");
            }
            function6 = function2M744getLambda1$material_release;
            SurfaceKt.m834SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, primarySurface, j116, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1961746365, true, new e(i19, tabs, function2M744getLambda1$material_release, function5)), composerStartRestartGroup, (i19 & 896) | 1572864 | (i19 & 7168), 50);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            jM731contentColorForek8zF_U = j116;
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, primarySurface, jM731contentColorForek8zF_U, function5, function6, tabs, i11, i12));
    }
}
