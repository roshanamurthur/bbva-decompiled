package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePickerContent$1$4$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1920:1\n36#2:1921\n460#2,13:1947\n473#2,3:1963\n1114#3,6:1922\n74#4,6:1928\n80#4:1960\n84#4:1967\n75#5:1934\n76#5,11:1936\n89#5:1966\n76#6:1935\n92#7:1961\n58#7:1962\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePickerContent$1$4$2\n*L\n1193#1:1921\n1193#1:1947,13\n1193#1:1963,3\n1193#1:1922,6\n1193#1:1928,6\n1193#1:1960\n1193#1:1967\n1193#1:1934\n1193#1:1936,11\n1193#1:1966\n1193#1:1935\n1200#1:1961\n1200#1:1962\n*E\n"})
public final class c0 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f12703p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ StateData f12704q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f12705r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f12706s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f12707t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ LazyListState f12708u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(DatePickerColors datePickerColors, StateData stateData, int i10, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, LazyListState lazyListState) {
        super(3);
        this.f12703p0 = datePickerColors;
        this.f12704q0 = stateData;
        this.f12705r0 = i10;
        this.f12706s0 = coroutineScope;
        this.f12707t0 = mutableState;
        this.f12708u0 = lazyListState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(760161496, iIntValue, -1, "androidx.compose.material3.DatePickerContent.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1186)");
        }
        String strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1286getDatePickerYearPickerPaneTitleadMyvUU(), composer2, 6);
        Modifier.Companion companion = Modifier.INSTANCE;
        composer2.startReplaceableGroup(1157296644);
        boolean zChanged = composer2.changed(strM1320getStringNWtq28);
        Object objRememberedValue = composer2.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new l0.j0(strM1320getStringNWtq28);
            composer2.updateRememberedValue(objRememberedValue);
        }
        composer2.endReplaceableGroup();
        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null);
        DatePickerColors datePickerColors = this.f12703p0;
        StateData stateData = this.f12704q0;
        composer2.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyA = androidx.camera.core.impl.v.a(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSemantics$default);
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
        Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl, measurePolicyA, composerM2074constructorimpl, density));
        ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier modifierM298paddingVpY3zN4$default = PaddingKt.m298paddingVpY3zN4$default(SizeKt.m324requiredHeight3ABfNKs(companion, Dp.m4389constructorimpl(Dp.m4389constructorimpl(DatePickerKt.getRecommendedSizeForAccessibility() * 7) - DividerDefaults.INSTANCE.m1082getThicknessD9Ej5fM())), DatePickerKt.getDatePickerHorizontalPadding(), 0.0f, 2, null);
        l0.l0 l0Var = new l0.l0(this.f12706s0, this.f12707t0, stateData, this.f12708u0);
        int i10 = this.f12705r0;
        DatePickerKt.access$YearPicker(modifierM298paddingVpY3zN4$default, l0Var, datePickerColors, stateData, composer2, 6 | ((i10 >> 3) & 896) | ((i10 << 9) & 7168));
        DividerKt.m1083Divider9IZ8Weo(null, 0.0f, 0L, composer2, 0, 7);
        if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
