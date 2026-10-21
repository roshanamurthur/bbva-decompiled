package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0093\u0001\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042.\b\u0002\u0010\u000f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0002\b\u000e2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u009d\u0001\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00162.\b\u0002\u0010\u000f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0002\b\u000e2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"", "selectedTabIndex", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Lkotlin/Function1;", "", "Landroidx/compose/material3/TabPosition;", "Lkotlin/ParameterName;", "name", "tabPositions", "", "Landroidx/compose/runtime/Composable;", "indicator", "Lkotlin/Function0;", "divider", "tabs", "TabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TabRow", "Landroidx/compose/ui/unit/Dp;", "edgePadding", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRow", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,505:1\n154#2:506\n154#2:507\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt\n*L\n491#1:506\n496#1:507\n*E\n"})
public final class TabRowKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11993a = Dp.m4389constructorimpl(90);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11994b = Dp.m4389constructorimpl(52);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final TweenSpec f11995c = AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX INFO: compiled from: TabRow.kt */
    public static final class a extends Lambda implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f11996p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(3);
            this.f11996p0 = i10;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
            List<? extends TabPosition> tabPositions = list;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-913748678, iIntValue, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:233)");
            }
            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
            tabRowDefaults.m1353Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(this.f11996p0)), 0.0f, 0L, composer2, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TabRow.kt */
    @SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$ScrollableTabRow$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,505:1\n474#2,4:506\n478#2,2:514\n482#2:520\n25#3:510\n50#3:521\n49#3:522\n1114#4,3:511\n1117#4,3:517\n1114#4,6:523\n474#5:516\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$ScrollableTabRow$2\n*L\n250#1:506,4\n250#1:514,2\n250#1:520\n250#1:510\n251#1:521\n251#1:522\n250#1:511,3\n250#1:517,3\n251#1:523,6\n250#1:516\n*E\n"})
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f11997p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11998q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11999r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f12000s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f12001t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f12002u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(float f6, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, int i10, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function4, int i11) {
            super(2);
            this.f11997p0 = f6;
            this.f11998q0 = function2;
            this.f11999r0 = function3;
            this.f12000s0 = i10;
            this.f12001t0 = function4;
            this.f12002u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(286469328, iIntValue, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:247)");
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
                    objRememberedValue = new l0.e3(scrollStateRememberScrollState, coroutineScope);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                SubcomposeLayoutKt.SubcomposeLayout(ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null))), new y3(this.f11997p0, this.f11998q0, this.f11999r0, (l0.e3) objRememberedValue, this.f12000s0, this.f12001t0, this.f12002u0), composer2, 0, 0);
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
        public final /* synthetic */ int f12003p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f12004q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f12005r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f12006s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ float f12007t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f12008u0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f12009w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f12010x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f12011y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(int i10, Modifier modifier, long j10, long j11, float f6, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function4, int i11, int i12) {
            super(2);
            this.f12003p0 = i10;
            this.f12004q0 = modifier;
            this.f12005r0 = j10;
            this.f12006s0 = j11;
            this.f12007t0 = f6;
            this.f12008u0 = function3;
            this.v0 = function2;
            this.f12009w0 = function4;
            this.f12010x0 = i11;
            this.f12011y0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TabRowKt.m1354ScrollableTabRowsKfQg0A(this.f12003p0, this.f12004q0, this.f12005r0, this.f12006s0, this.f12007t0, this.f12008u0, this.v0, this.f12009w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f12010x0 | 1), this.f12011y0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TabRow.kt */
    public static final class d extends Lambda implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f12012p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10) {
            super(3);
            this.f12012p0 = i10;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
            List<? extends TabPosition> tabPositions = list;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2052073983, iIntValue, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
            }
            int size = tabPositions.size();
            int i10 = this.f12012p0;
            if (i10 < size) {
                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                tabRowDefaults.m1353Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, composer2, 3072, 6);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TabRow.kt */
    @SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRow$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,505:1\n67#2,3:506\n66#2:509\n1114#3,6:510\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRow$2\n*L\n148#1:506,3\n148#1:509\n148#1:510,6\n*E\n"})
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f12013p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f12014q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f12015r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f12016s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10, Function2 function2, Function2 function3, Function3 function4) {
            super(2);
            this.f12013p0 = function2;
            this.f12014q0 = function3;
            this.f12015r0 = function4;
            this.f12016s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1273256619, iIntValue, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:146)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                composer2.startReplaceableGroup(1618982084);
                Function2<Composer, Integer, Unit> function2 = this.f12013p0;
                boolean zChanged = composer2.changed(function2);
                Function2<Composer, Integer, Unit> function3 = this.f12014q0;
                boolean zChanged2 = zChanged | composer2.changed(function3);
                Function3<List<TabPosition>, Composer, Integer, Unit> function4 = this.f12015r0;
                boolean zChanged3 = zChanged2 | composer2.changed(function4);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new b4(this.f12016s0, function2, function3, function4);
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
        public final /* synthetic */ int f12017p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f12018q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f12019r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f12020s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> f12021t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f12022u0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f12023w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f12024x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(int i10, Modifier modifier, long j10, long j11, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function4, int i11, int i12) {
            super(2);
            this.f12017p0 = i10;
            this.f12018q0 = modifier;
            this.f12019r0 = j10;
            this.f12020s0 = j11;
            this.f12021t0 = function3;
            this.f12022u0 = function2;
            this.v0 = function4;
            this.f12023w0 = i11;
            this.f12024x0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TabRowKt.m1355TabRowpAZo6Ak(this.f12017p0, this.f12018q0, this.f12019r0, this.f12020s0, this.f12021t0, this.f12022u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f12023w0 | 1), this.f12024x0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0138 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x013a  */
    /* JADX WARN: Code duplicated, block: B:108:0x013d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0144  */
    /* JADX WARN: Code duplicated, block: B:114:0x0150  */
    /* JADX WARN: Code duplicated, block: B:115:0x0159  */
    /* JADX WARN: Code duplicated, block: B:117:0x015c  */
    /* JADX WARN: Code duplicated, block: B:118:0x015f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0162  */
    /* JADX WARN: Code duplicated, block: B:121:0x0170  */
    /* JADX WARN: Code duplicated, block: B:123:0x0174  */
    /* JADX WARN: Code duplicated, block: B:124:0x0180  */
    /* JADX WARN: Code duplicated, block: B:127:0x018b  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:135:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:93:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x0118  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* JADX INFO: renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    public static final void m1354ScrollableTabRowsKfQg0A(int i10, @Nullable Modifier modifier, long j10, long j11, float f6, @Nullable Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @NotNull Function2<? super Composer, ? super Integer, Unit> tabs, @Nullable Composer composer, int i11, int i12) {
        int i13;
        long containerColor;
        long j12;
        int i14;
        float f10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Modifier modifier2;
        long contentColor;
        float f11;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3ComposableLambda;
        int i21;
        Function2<? super Composer, ? super Integer, Unit> function2M1048getLambda2$material3_release;
        Function2<? super Composer, ? super Integer, Unit> function4;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function5;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Composer composerStartRestartGroup = composer.startRestartGroup(-497821003);
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
                    containerColor = j10;
                    int i23 = composerStartRestartGroup.changed(containerColor) ? 256 : 128;
                    i13 |= i23;
                } else {
                    containerColor = j10;
                }
                i13 |= i23;
            } else {
                containerColor = j10;
            }
            if ((i11 & 7168) == 0) {
                if ((i12 & 8) == 0) {
                    j12 = j11;
                    int i24 = composerStartRestartGroup.changed(j12) ? 2048 : 1024;
                    i13 |= i24;
                } else {
                    j12 = j11;
                }
                i13 |= i24;
            } else {
                j12 = j11;
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
                    i13 |= 12582912;
                } else if ((29360128 & i11) == 0) {
                    if (composerStartRestartGroup.changedInstance(tabs)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i13 |= i20;
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
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            f11 = f11994b;
                        } else {
                            f11 = f10;
                        }
                        if (i16 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -913748678, true, new a(i10));
                        } else {
                            function3ComposableLambda = function3;
                        }
                        if (i18 != 0) {
                            i21 = i13;
                            function2M1048getLambda2$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1048getLambda2$material3_release();
                        } else {
                            i21 = i13;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-497821003, i21, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:227)");
                        }
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 286469328, true, new b(f11, tabs, function2M1048getLambda2$material3_release, i10, function3ComposableLambda, i21)), composerStartRestartGroup, ((i21 >> 3) & 14) | 12582912 | (i21 & 896) | (i21 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function4 = function2M1048getLambda2$material3_release;
                        f10 = f11;
                        function5 = function3ComposableLambda;
                        modifier3 = modifier2;
                        j12 = contentColor;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                        }
                        modifier2 = modifier;
                        i21 = i13;
                        contentColor = j12;
                        f11 = f10;
                        function3ComposableLambda = function3;
                    }
                    function2M1048getLambda2$material3_release = function2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-497821003, i21, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:227)");
                    }
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 286469328, true, new b(f11, tabs, function2M1048getLambda2$material3_release, i10, function3ComposableLambda, i21)), composerStartRestartGroup, ((i21 >> 3) & 14) | 12582912 | (i21 & 896) | (i21 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function2M1048getLambda2$material3_release;
                    f10 = f11;
                    function5 = function3ComposableLambda;
                    modifier3 = modifier2;
                    j12 = contentColor;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    function5 = function3;
                    function4 = function2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(i10, modifier3, containerColor, j12, f10, function5, function4, tabs, i11, i12));
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
                i13 |= 12582912;
            } else if ((29360128 & i11) == 0) {
                if (composerStartRestartGroup.changedInstance(tabs)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i13 |= i20;
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
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        f11 = f11994b;
                    } else {
                        f11 = f10;
                    }
                    if (i16 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -913748678, true, new a(i10));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i18 != 0) {
                        i21 = i13;
                        function2M1048getLambda2$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1048getLambda2$material3_release();
                    } else {
                        i21 = i13;
                        function2M1048getLambda2$material3_release = function2;
                    }
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        f11 = f11994b;
                    } else {
                        f11 = f10;
                    }
                    if (i16 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -913748678, true, new a(i10));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i18 != 0) {
                        i21 = i13;
                        function2M1048getLambda2$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1048getLambda2$material3_release();
                    } else {
                        i21 = i13;
                        function2M1048getLambda2$material3_release = function2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-497821003, i21, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:227)");
                }
                SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 286469328, true, new b(f11, tabs, function2M1048getLambda2$material3_release, i10, function3ComposableLambda, i21)), composerStartRestartGroup, ((i21 >> 3) & 14) | 12582912 | (i21 & 896) | (i21 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function2M1048getLambda2$material3_release;
                f10 = f11;
                function5 = function3ComposableLambda;
                modifier3 = modifier2;
                j12 = contentColor;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        f11 = f11994b;
                    } else {
                        f11 = f10;
                    }
                    if (i16 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -913748678, true, new a(i10));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i18 != 0) {
                        i21 = i13;
                        function2M1048getLambda2$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1048getLambda2$material3_release();
                    } else {
                        i21 = i13;
                        function2M1048getLambda2$material3_release = function2;
                    }
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        f11 = f11994b;
                    } else {
                        f11 = f10;
                    }
                    if (i16 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -913748678, true, new a(i10));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i18 != 0) {
                        i21 = i13;
                        function2M1048getLambda2$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1048getLambda2$material3_release();
                    } else {
                        i21 = i13;
                        function2M1048getLambda2$material3_release = function2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-497821003, i21, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:227)");
                }
                SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 286469328, true, new b(f11, tabs, function2M1048getLambda2$material3_release, i10, function3ComposableLambda, i21)), composerStartRestartGroup, ((i21 >> 3) & 14) | 12582912 | (i21 & 896) | (i21 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function2M1048getLambda2$material3_release;
                f10 = f11;
                function5 = function3ComposableLambda;
                modifier3 = modifier2;
                j12 = contentColor;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(i10, modifier3, containerColor, j12, f10, function5, function4, tabs, i11, i12));
        }
        i13 |= 48;
        if ((i11 & 896) == 0) {
            if ((i12 & 4) == 0) {
                containerColor = j10;
                if (composerStartRestartGroup.changed(containerColor)) {
                }
                i13 |= i23;
            } else {
                containerColor = j10;
            }
            i13 |= i23;
        } else {
            containerColor = j10;
        }
        if ((i11 & 7168) == 0) {
            if ((i12 & 8) == 0) {
                j12 = j11;
                if (composerStartRestartGroup.changed(j12)) {
                }
                i13 |= i24;
            } else {
                j12 = j11;
            }
            i13 |= i24;
        } else {
            j12 = j11;
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
                i13 |= 12582912;
            } else if ((29360128 & i11) == 0) {
                if (composerStartRestartGroup.changedInstance(tabs)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i13 |= i20;
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
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        f11 = f11994b;
                    } else {
                        f11 = f10;
                    }
                    if (i16 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -913748678, true, new a(i10));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i18 != 0) {
                        i21 = i13;
                        function2M1048getLambda2$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1048getLambda2$material3_release();
                    } else {
                        i21 = i13;
                        function2M1048getLambda2$material3_release = function2;
                    }
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        f11 = f11994b;
                    } else {
                        f11 = f10;
                    }
                    if (i16 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -913748678, true, new a(i10));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i18 != 0) {
                        i21 = i13;
                        function2M1048getLambda2$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1048getLambda2$material3_release();
                    } else {
                        i21 = i13;
                        function2M1048getLambda2$material3_release = function2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-497821003, i21, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:227)");
                }
                SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 286469328, true, new b(f11, tabs, function2M1048getLambda2$material3_release, i10, function3ComposableLambda, i21)), composerStartRestartGroup, ((i21 >> 3) & 14) | 12582912 | (i21 & 896) | (i21 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function2M1048getLambda2$material3_release;
                f10 = f11;
                function5 = function3ComposableLambda;
                modifier3 = modifier2;
                j12 = contentColor;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        f11 = f11994b;
                    } else {
                        f11 = f10;
                    }
                    if (i16 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -913748678, true, new a(i10));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i18 != 0) {
                        i21 = i13;
                        function2M1048getLambda2$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1048getLambda2$material3_release();
                    } else {
                        i21 = i13;
                        function2M1048getLambda2$material3_release = function2;
                    }
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        f11 = f11994b;
                    } else {
                        f11 = f10;
                    }
                    if (i16 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -913748678, true, new a(i10));
                    } else {
                        function3ComposableLambda = function3;
                    }
                    if (i18 != 0) {
                        i21 = i13;
                        function2M1048getLambda2$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1048getLambda2$material3_release();
                    } else {
                        i21 = i13;
                        function2M1048getLambda2$material3_release = function2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-497821003, i21, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:227)");
                }
                SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 286469328, true, new b(f11, tabs, function2M1048getLambda2$material3_release, i10, function3ComposableLambda, i21)), composerStartRestartGroup, ((i21 >> 3) & 14) | 12582912 | (i21 & 896) | (i21 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function2M1048getLambda2$material3_release;
                f10 = f11;
                function5 = function3ComposableLambda;
                modifier3 = modifier2;
                j12 = contentColor;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(i10, modifier3, containerColor, j12, f10, function5, function4, tabs, i11, i12));
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
            i13 |= 12582912;
        } else if ((29360128 & i11) == 0) {
            if (composerStartRestartGroup.changedInstance(tabs)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i13 |= i20;
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
                    containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i13 &= -7169;
                } else {
                    contentColor = j12;
                }
                if (i14 != 0) {
                    f11 = f11994b;
                } else {
                    f11 = f10;
                }
                if (i16 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -913748678, true, new a(i10));
                } else {
                    function3ComposableLambda = function3;
                }
                if (i18 != 0) {
                    i21 = i13;
                    function2M1048getLambda2$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1048getLambda2$material3_release();
                } else {
                    i21 = i13;
                    function2M1048getLambda2$material3_release = function2;
                }
            } else {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i12 & 4) != 0) {
                    containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i13 &= -7169;
                } else {
                    contentColor = j12;
                }
                if (i14 != 0) {
                    f11 = f11994b;
                } else {
                    f11 = f10;
                }
                if (i16 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -913748678, true, new a(i10));
                } else {
                    function3ComposableLambda = function3;
                }
                if (i18 != 0) {
                    i21 = i13;
                    function2M1048getLambda2$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1048getLambda2$material3_release();
                } else {
                    i21 = i13;
                    function2M1048getLambda2$material3_release = function2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-497821003, i21, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:227)");
            }
            SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 286469328, true, new b(f11, tabs, function2M1048getLambda2$material3_release, i10, function3ComposableLambda, i21)), composerStartRestartGroup, ((i21 >> 3) & 14) | 12582912 | (i21 & 896) | (i21 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function4 = function2M1048getLambda2$material3_release;
            f10 = f11;
            function5 = function3ComposableLambda;
            modifier3 = modifier2;
            j12 = contentColor;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i12 & 4) != 0) {
                    containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i13 &= -7169;
                } else {
                    contentColor = j12;
                }
                if (i14 != 0) {
                    f11 = f11994b;
                } else {
                    f11 = f10;
                }
                if (i16 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -913748678, true, new a(i10));
                } else {
                    function3ComposableLambda = function3;
                }
                if (i18 != 0) {
                    i21 = i13;
                    function2M1048getLambda2$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1048getLambda2$material3_release();
                } else {
                    i21 = i13;
                    function2M1048getLambda2$material3_release = function2;
                }
            } else {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i12 & 4) != 0) {
                    containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i13 &= -7169;
                } else {
                    contentColor = j12;
                }
                if (i14 != 0) {
                    f11 = f11994b;
                } else {
                    f11 = f10;
                }
                if (i16 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -913748678, true, new a(i10));
                } else {
                    function3ComposableLambda = function3;
                }
                if (i18 != 0) {
                    i21 = i13;
                    function2M1048getLambda2$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1048getLambda2$material3_release();
                } else {
                    i21 = i13;
                    function2M1048getLambda2$material3_release = function2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-497821003, i21, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:227)");
            }
            SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 286469328, true, new b(f11, tabs, function2M1048getLambda2$material3_release, i10, function3ComposableLambda, i21)), composerStartRestartGroup, ((i21 >> 3) & 14) | 12582912 | (i21 & 896) | (i21 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function4 = function2M1048getLambda2$material3_release;
            f10 = f11;
            function5 = function3ComposableLambda;
            modifier3 = modifier2;
            j12 = contentColor;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(i10, modifier3, containerColor, j12, f10, function5, function4, tabs, i11, i12));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0126  */
    /* JADX WARN: Code duplicated, block: B:105:0x012f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0132  */
    /* JADX WARN: Code duplicated, block: B:108:0x0140  */
    /* JADX WARN: Code duplicated, block: B:110:0x0143  */
    /* JADX WARN: Code duplicated, block: B:113:0x0157  */
    /* JADX WARN: Code duplicated, block: B:116:0x0191  */
    /* JADX WARN: Code duplicated, block: B:121:0x019e  */
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
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:95:0x010b A[PHI: r0 r3 r4 r6 r8
      0x010b: PHI (r0v8 androidx.compose.ui.Modifier) = (r0v5 androidx.compose.ui.Modifier), (r0v12 androidx.compose.ui.Modifier) binds: [B:109:0x0141, B:94:0x0107] A[DONT_GENERATE, DONT_INLINE]
      0x010b: PHI (r3v25 int) = (r3v19 int), (r3v28 int) binds: [B:109:0x0141, B:94:0x0107] A[DONT_GENERATE, DONT_INLINE]
      0x010b: PHI (r4v9 long) = (r4v4 long), (r4v10 long) binds: [B:109:0x0141, B:94:0x0107] A[DONT_GENERATE, DONT_INLINE]
      0x010b: PHI (r6v10 long) = (r6v7 long), (r6v6 long) binds: [B:109:0x0141, B:94:0x0107] A[DONT_GENERATE, DONT_INLINE]
      0x010b: PHI (r8v7 kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material3.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) = 
      (r8v3 kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material3.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
      (r8v8 kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material3.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
     binds: [B:109:0x0141, B:94:0x0107] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0110  */
    /* JADX WARN: Code duplicated, block: B:98:0x0113  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* JADX INFO: renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    public static final void m1355TabRowpAZo6Ak(int i10, @Nullable Modifier modifier, long j10, long j11, @Nullable Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @NotNull Function2<? super Composer, ? super Integer, Unit> tabs, @Nullable Composer composer, int i11, int i12) {
        int i13;
        long containerColor;
        long j12;
        int i14;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function4;
        int i15;
        int i16;
        Function2<? super Composer, ? super Integer, Unit> function5;
        int i17;
        int i18;
        Modifier modifier2;
        long contentColor;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3ComposableLambda;
        int i19;
        Function2<? super Composer, ? super Integer, Unit> function2M1047getLambda1$material3_release;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i20;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1199178586);
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
                    containerColor = j10;
                    int i22 = composerStartRestartGroup.changed(containerColor) ? 256 : 128;
                    i13 |= i22;
                } else {
                    containerColor = j10;
                }
                i13 |= i22;
            } else {
                containerColor = j10;
            }
            if ((i11 & 7168) == 0) {
                j12 = j11;
                if ((i12 & 8) == 0 || !composerStartRestartGroup.changed(j12)) {
                    i20 = 1024;
                } else {
                    i20 = 2048;
                }
                i13 |= i20;
            } else {
                j12 = j11;
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
                        function5 = function2;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i13 |= i17;
                    }
                    if ((i12 & 64) != 0) {
                        if ((i11 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(tabs)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
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
                                    containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                    i13 &= -897;
                                }
                                if ((i12 & 8) != 0) {
                                    contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                    i13 &= -7169;
                                } else {
                                    contentColor = j12;
                                }
                                if (i14 != 0) {
                                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                                } else {
                                    function3ComposableLambda = function4;
                                }
                                if (i16 != 0) {
                                    i19 = i13;
                                    function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                                }
                                SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function5 = function2M1047getLambda1$material3_release;
                                j12 = contentColor;
                                modifier3 = modifier2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i12 & 4) != 0) {
                                    i13 &= -897;
                                }
                                if ((i12 & 8) != 0) {
                                    i13 &= -7169;
                                }
                                modifier2 = modifier;
                                contentColor = j12;
                                function3ComposableLambda = function4;
                            }
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                            }
                            SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function5 = function2M1047getLambda1$material3_release;
                            j12 = contentColor;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            function3ComposableLambda = function4;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, containerColor, j12, function3ComposableLambda, function5, tabs, i11, i12));
                    }
                    i18 = 1572864;
                    i13 |= i18;
                    if ((i13 & 2995931) == 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i21 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i13 &= -7169;
                            } else {
                                contentColor = j12;
                            }
                            if (i14 != 0) {
                                function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                            } else {
                                function3ComposableLambda = function4;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                            } else {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = function5;
                            }
                        } else {
                            if (i21 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i13 &= -7169;
                            } else {
                                contentColor = j12;
                            }
                            if (i14 != 0) {
                                function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                            } else {
                                function3ComposableLambda = function4;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                            } else {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = function5;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                        }
                        SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function5 = function2M1047getLambda1$material3_release;
                        j12 = contentColor;
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
                                containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i13 &= -7169;
                            } else {
                                contentColor = j12;
                            }
                            if (i14 != 0) {
                                function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                            } else {
                                function3ComposableLambda = function4;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                            } else {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = function5;
                            }
                        } else {
                            if (i21 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i13 &= -7169;
                            } else {
                                contentColor = j12;
                            }
                            if (i14 != 0) {
                                function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                            } else {
                                function3ComposableLambda = function4;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                            } else {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = function5;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                        }
                        SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function5 = function2M1047getLambda1$material3_release;
                        j12 = contentColor;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, containerColor, j12, function3ComposableLambda, function5, tabs, i11, i12));
                }
                i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function5 = function2;
                if ((i12 & 64) != 0) {
                    if ((i11 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(tabs)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
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
                                containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i13 &= -7169;
                            } else {
                                contentColor = j12;
                            }
                            if (i14 != 0) {
                                function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                            } else {
                                function3ComposableLambda = function4;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                            } else {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = function5;
                            }
                        } else {
                            if (i21 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i13 &= -7169;
                            } else {
                                contentColor = j12;
                            }
                            if (i14 != 0) {
                                function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                            } else {
                                function3ComposableLambda = function4;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                            } else {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = function5;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                        }
                        SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function5 = function2M1047getLambda1$material3_release;
                        j12 = contentColor;
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
                                containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i13 &= -7169;
                            } else {
                                contentColor = j12;
                            }
                            if (i14 != 0) {
                                function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                            } else {
                                function3ComposableLambda = function4;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                            } else {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = function5;
                            }
                        } else {
                            if (i21 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i13 &= -7169;
                            } else {
                                contentColor = j12;
                            }
                            if (i14 != 0) {
                                function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                            } else {
                                function3ComposableLambda = function4;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                            } else {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = function5;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                        }
                        SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function5 = function2M1047getLambda1$material3_release;
                        j12 = contentColor;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, containerColor, j12, function3ComposableLambda, function5, tabs, i11, i12));
                }
                i18 = 1572864;
                i13 |= i18;
                if ((i13 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function2M1047getLambda1$material3_release;
                    j12 = contentColor;
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
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function2M1047getLambda1$material3_release;
                    j12 = contentColor;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, containerColor, j12, function3ComposableLambda, function5, tabs, i11, i12));
            }
            i13 |= 24576;
            function4 = function3;
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((458752 & i11) == 0) {
                    function5 = function2;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                if ((i12 & 64) != 0) {
                    if ((i11 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(tabs)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
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
                                containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i13 &= -7169;
                            } else {
                                contentColor = j12;
                            }
                            if (i14 != 0) {
                                function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                            } else {
                                function3ComposableLambda = function4;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                            } else {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = function5;
                            }
                        } else {
                            if (i21 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i13 &= -7169;
                            } else {
                                contentColor = j12;
                            }
                            if (i14 != 0) {
                                function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                            } else {
                                function3ComposableLambda = function4;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                            } else {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = function5;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                        }
                        SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function5 = function2M1047getLambda1$material3_release;
                        j12 = contentColor;
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
                                containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i13 &= -7169;
                            } else {
                                contentColor = j12;
                            }
                            if (i14 != 0) {
                                function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                            } else {
                                function3ComposableLambda = function4;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                            } else {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = function5;
                            }
                        } else {
                            if (i21 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i13 &= -7169;
                            } else {
                                contentColor = j12;
                            }
                            if (i14 != 0) {
                                function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                            } else {
                                function3ComposableLambda = function4;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                            } else {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = function5;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                        }
                        SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function5 = function2M1047getLambda1$material3_release;
                        j12 = contentColor;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, containerColor, j12, function3ComposableLambda, function5, tabs, i11, i12));
                }
                i18 = 1572864;
                i13 |= i18;
                if ((i13 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function2M1047getLambda1$material3_release;
                    j12 = contentColor;
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
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function2M1047getLambda1$material3_release;
                    j12 = contentColor;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, containerColor, j12, function3ComposableLambda, function5, tabs, i11, i12));
            }
            i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function5 = function2;
            if ((i12 & 64) != 0) {
                if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(tabs)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
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
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function2M1047getLambda1$material3_release;
                    j12 = contentColor;
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
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function2M1047getLambda1$material3_release;
                    j12 = contentColor;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, containerColor, j12, function3ComposableLambda, function5, tabs, i11, i12));
            }
            i18 = 1572864;
            i13 |= i18;
            if ((i13 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                    } else {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = function5;
                    }
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                    } else {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = function5;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                }
                SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function2M1047getLambda1$material3_release;
                j12 = contentColor;
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
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                    } else {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = function5;
                    }
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                    } else {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = function5;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                }
                SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function2M1047getLambda1$material3_release;
                j12 = contentColor;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, containerColor, j12, function3ComposableLambda, function5, tabs, i11, i12));
        }
        i13 |= 48;
        if ((i11 & 896) == 0) {
            if ((i12 & 4) == 0) {
                containerColor = j10;
                if (composerStartRestartGroup.changed(containerColor)) {
                }
                i13 |= i22;
            } else {
                containerColor = j10;
            }
            i13 |= i22;
        } else {
            containerColor = j10;
        }
        if ((i11 & 7168) == 0) {
            j12 = j11;
            if ((i12 & 8) == 0) {
                i20 = 1024;
            } else {
                i20 = 1024;
            }
            i13 |= i20;
        } else {
            j12 = j11;
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
                    function5 = function2;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                if ((i12 & 64) != 0) {
                    if ((i11 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(tabs)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
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
                                containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i13 &= -7169;
                            } else {
                                contentColor = j12;
                            }
                            if (i14 != 0) {
                                function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                            } else {
                                function3ComposableLambda = function4;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                            } else {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = function5;
                            }
                        } else {
                            if (i21 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i13 &= -7169;
                            } else {
                                contentColor = j12;
                            }
                            if (i14 != 0) {
                                function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                            } else {
                                function3ComposableLambda = function4;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                            } else {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = function5;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                        }
                        SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function5 = function2M1047getLambda1$material3_release;
                        j12 = contentColor;
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
                                containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i13 &= -7169;
                            } else {
                                contentColor = j12;
                            }
                            if (i14 != 0) {
                                function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                            } else {
                                function3ComposableLambda = function4;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                            } else {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = function5;
                            }
                        } else {
                            if (i21 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i12 & 4) != 0) {
                                containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i13 &= -7169;
                            } else {
                                contentColor = j12;
                            }
                            if (i14 != 0) {
                                function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                            } else {
                                function3ComposableLambda = function4;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                            } else {
                                i19 = i13;
                                function2M1047getLambda1$material3_release = function5;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                        }
                        SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function5 = function2M1047getLambda1$material3_release;
                        j12 = contentColor;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, containerColor, j12, function3ComposableLambda, function5, tabs, i11, i12));
                }
                i18 = 1572864;
                i13 |= i18;
                if ((i13 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function2M1047getLambda1$material3_release;
                    j12 = contentColor;
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
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function2M1047getLambda1$material3_release;
                    j12 = contentColor;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, containerColor, j12, function3ComposableLambda, function5, tabs, i11, i12));
            }
            i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function5 = function2;
            if ((i12 & 64) != 0) {
                if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(tabs)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
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
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function2M1047getLambda1$material3_release;
                    j12 = contentColor;
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
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function2M1047getLambda1$material3_release;
                    j12 = contentColor;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, containerColor, j12, function3ComposableLambda, function5, tabs, i11, i12));
            }
            i18 = 1572864;
            i13 |= i18;
            if ((i13 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                    } else {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = function5;
                    }
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                    } else {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = function5;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                }
                SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function2M1047getLambda1$material3_release;
                j12 = contentColor;
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
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                    } else {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = function5;
                    }
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                    } else {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = function5;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                }
                SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function2M1047getLambda1$material3_release;
                j12 = contentColor;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, containerColor, j12, function3ComposableLambda, function5, tabs, i11, i12));
        }
        i13 |= 24576;
        function4 = function3;
        i16 = i12 & 32;
        if (i16 != 0) {
            if ((458752 & i11) == 0) {
                function5 = function2;
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            if ((i12 & 64) != 0) {
                if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(tabs)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
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
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function2M1047getLambda1$material3_release;
                    j12 = contentColor;
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
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    } else {
                        if (i21 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 4) != 0) {
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i13 &= -7169;
                        } else {
                            contentColor = j12;
                        }
                        if (i14 != 0) {
                            function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                        } else {
                            function3ComposableLambda = function4;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                        } else {
                            i19 = i13;
                            function2M1047getLambda1$material3_release = function5;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function2M1047getLambda1$material3_release;
                    j12 = contentColor;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, containerColor, j12, function3ComposableLambda, function5, tabs, i11, i12));
            }
            i18 = 1572864;
            i13 |= i18;
            if ((i13 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                    } else {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = function5;
                    }
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                    } else {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = function5;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                }
                SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function2M1047getLambda1$material3_release;
                j12 = contentColor;
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
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                    } else {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = function5;
                    }
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                    } else {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = function5;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                }
                SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function2M1047getLambda1$material3_release;
                j12 = contentColor;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, containerColor, j12, function3ComposableLambda, function5, tabs, i11, i12));
        }
        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        function5 = function2;
        if ((i12 & 64) != 0) {
            if ((i11 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(tabs)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
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
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                    } else {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = function5;
                    }
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                    } else {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = function5;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                }
                SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function2M1047getLambda1$material3_release;
                j12 = contentColor;
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
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                    } else {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = function5;
                    }
                } else {
                    if (i21 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 4) != 0) {
                        containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i13 &= -7169;
                    } else {
                        contentColor = j12;
                    }
                    if (i14 != 0) {
                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                    } else {
                        function3ComposableLambda = function4;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                    } else {
                        i19 = i13;
                        function2M1047getLambda1$material3_release = function5;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                }
                SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function2M1047getLambda1$material3_release;
                j12 = contentColor;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, containerColor, j12, function3ComposableLambda, function5, tabs, i11, i12));
        }
        i18 = 1572864;
        i13 |= i18;
        if ((i13 & 2995931) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i12 & 4) != 0) {
                    containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i13 &= -7169;
                } else {
                    contentColor = j12;
                }
                if (i14 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                } else {
                    function3ComposableLambda = function4;
                }
                if (i16 != 0) {
                    i19 = i13;
                    function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                } else {
                    i19 = i13;
                    function2M1047getLambda1$material3_release = function5;
                }
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i12 & 4) != 0) {
                    containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i13 &= -7169;
                } else {
                    contentColor = j12;
                }
                if (i14 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                } else {
                    function3ComposableLambda = function4;
                }
                if (i16 != 0) {
                    i19 = i13;
                    function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                } else {
                    i19 = i13;
                    function2M1047getLambda1$material3_release = function5;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
            }
            SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function5 = function2M1047getLambda1$material3_release;
            j12 = contentColor;
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
                    containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i13 &= -7169;
                } else {
                    contentColor = j12;
                }
                if (i14 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                } else {
                    function3ComposableLambda = function4;
                }
                if (i16 != 0) {
                    i19 = i13;
                    function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                } else {
                    i19 = i13;
                    function2M1047getLambda1$material3_release = function5;
                }
            } else {
                if (i21 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i12 & 4) != 0) {
                    containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i13 &= -7169;
                } else {
                    contentColor = j12;
                }
                if (i14 != 0) {
                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new d(i10));
                } else {
                    function3ComposableLambda = function4;
                }
                if (i16 != 0) {
                    i19 = i13;
                    function2M1047getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1047getLambda1$material3_release();
                } else {
                    i19 = i13;
                    function2M1047getLambda1$material3_release = function5;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
            }
            SurfaceKt.m1329SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, containerColor, contentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new e(i19, tabs, function2M1047getLambda1$material3_release, function3ComposableLambda)), composerStartRestartGroup, 12582912 | (i19 & 896) | (i19 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function5 = function2M1047getLambda1$material3_release;
            j12 = contentColor;
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(i10, modifier3, containerColor, j12, function3ComposableLambda, function5, tabs, i11, i12));
    }
}
