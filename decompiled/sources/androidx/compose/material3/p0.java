package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPicker$1$2$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1920:1\n50#2:1921\n49#2:1922\n1114#3,6:1923\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPicker$1$2$1\n*L\n1698#1:1921\n1698#1:1922\n1698#1:1923,6\n*E\n"})
public final class p0 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ StateData f13046p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f13047q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f13048r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f13049s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f13050t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f13051u0;
    public final /* synthetic */ LazyGridState v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f13052w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ String f13053x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ String f13054y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p0(StateData stateData, int i10, int i11, Function1<? super Integer, Unit> function1, int i12, DatePickerColors datePickerColors, LazyGridState lazyGridState, CoroutineScope coroutineScope, String str, String str2) {
        super(4);
        this.f13046p0 = stateData;
        this.f13047q0 = i10;
        this.f13048r0 = i11;
        this.f13049s0 = function1;
        this.f13050t0 = i12;
        this.f13051u0 = datePickerColors;
        this.v0 = lazyGridState;
        this.f13052w0 = coroutineScope;
        this.f13053x0 = str;
        this.f13054y0 = str2;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
        int i10;
        LazyGridItemScope items = lazyGridItemScope;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 112) == 0) {
            i10 = (composer2.changed(iIntValue) ? 32 : 16) | iIntValue2;
        } else {
            i10 = iIntValue2;
        }
        if ((i10 & ErrorCodes.BLUETOOTH_PERMISSION) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1369226173, iIntValue2, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1669)");
            }
            int first = this.f13046p0.getYearRange().getFirst() + iIntValue;
            String localString = DatePickerKt.toLocalString(first);
            Modifier.Companion companion = Modifier.INSTANCE;
            DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(SizeKt.m329requiredSizeVpY3zN4(companion, datePickerModalTokens.m1616getSelectionYearContainerWidthD9Ej5fM(), datePickerModalTokens.m1615getSelectionYearContainerHeightD9Ej5fM()), false, new l0.a1(this.v0, iIntValue, this.f13052w0, this.f13053x0, this.f13054y0), 1, null);
            boolean z10 = first == this.f13047q0;
            boolean z11 = first == this.f13048r0;
            Integer numValueOf = Integer.valueOf(first);
            composer2.startReplaceableGroup(511388516);
            Function1<Integer, Unit> function1 = this.f13049s0;
            boolean zChanged = composer2.changed(numValueOf) | composer2.changed(function1);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new l0.b1(function1, first);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            DatePickerKt.access$Year(modifierSemantics$default, z10, z11, (Function0) objRememberedValue, ai.a.i(new Object[]{localString}, 1, Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1274getDatePickerNavigateToYearDescriptionadMyvUU(), composer2, 6), "format(this, *args)"), this.f13051u0, ComposableLambdaKt.composableLambda(composer2, 2095319565, true, new l0.d1(localString)), composer2, ((this.f13050t0 << 9) & 458752) | 1572864);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
