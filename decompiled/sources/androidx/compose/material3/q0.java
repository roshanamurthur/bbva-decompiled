package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPicker$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1920:1\n76#2:1921\n474#3,4:1922\n478#3,2:1930\n482#3:1936\n25#4:1926\n1114#5,3:1927\n1117#5,3:1933\n474#6:1932\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPicker$1\n*L\n1650#1:1921\n1654#1:1922,4\n1654#1:1930,2\n1654#1:1936\n1654#1:1926\n1654#1:1927,3\n1654#1:1933,3\n1654#1:1932\n*E\n"})
public final class q0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ StateData f13066p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f13067q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Modifier f13068r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f13069s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f13070t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(int i10, DatePickerColors datePickerColors, StateData stateData, Modifier modifier, Function1 function1) {
        super(2);
        this.f13066p0 = stateData;
        this.f13067q0 = datePickerColors;
        this.f13068r0 = modifier;
        this.f13069s0 = function1;
        this.f13070t0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-145469688, iIntValue, -1, "androidx.compose.material3.YearPicker.<anonymous> (DatePicker.kt:1636)");
            }
            StateData stateData = this.f13066p0;
            int year = stateData.getCurrentMonth().getYear();
            int year2 = stateData.getDisplayedMonth().getYear();
            LazyGridState lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(Math.max(0, (year2 - stateData.getYearRange().getFirst()) - 3), 0, composer2, 0, 2);
            composer2.startReplaceableGroup(-969349200);
            DatePickerColors datePickerColors = this.f13067q0;
            long containerColor = datePickerColors.getContainerColor();
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            long jM1019surfaceColorAtElevation3ABfNKs = Color.m2509equalsimpl0(containerColor, materialTheme.getColorScheme(composer2, 6).m978getSurface0d7_KjU()) ? ColorSchemeKt.m1019surfaceColorAtElevation3ABfNKs(materialTheme.getColorScheme(composer2, 6), ((Dp) composer2.consume(SurfaceKt.getLocalAbsoluteTonalElevation())).m4403unboximpl()) : datePickerColors.getContainerColor();
            composer2.endReplaceableGroup();
            composer2.startReplaceableGroup(773894976);
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
            }
            composer2.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composer2.endReplaceableGroup();
            Strings.Companion companion = Strings.INSTANCE;
            String strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(companion.m1276getDatePickerScrollToShowEarlierYearsadMyvUU(), composer2, 6);
            String strM1320getStringNWtq29 = Strings_androidKt.m1320getStringNWtq28(companion.m1277getDatePickerScrollToShowLaterYearsadMyvUU(), composer2, 6);
            GridCells.Fixed fixed = new GridCells.Fixed(3);
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(BackgroundKt.m122backgroundbw27NRU$default(this.f13068r0, jM1019surfaceColorAtElevation3ABfNKs, null, 2, null), false, l0.z0.f83066p0, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            LazyGridDslKt.LazyVerticalGrid(fixed, modifierSemantics$default, lazyGridStateRememberLazyGridState, null, false, arrangement.m246spacedBy0680j_4(DatePickerKt.f9961g), arrangement.getSpaceEvenly(), null, false, new l0.e1(this.f13066p0, year2, year, this.f13069s0, this.f13070t0, this.f13067q0, lazyGridStateRememberLazyGridState, coroutineScope, strM1320getStringNWtq28, strM1320getStringNWtq29), composer2, 1769472, Constant.ERROR_CODE_408);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
