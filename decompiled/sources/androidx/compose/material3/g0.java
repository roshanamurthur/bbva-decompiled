package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,1920:1\n67#2,6:1921\n73#2:1953\n77#2:1958\n75#3:1927\n76#3,11:1929\n89#3:1957\n76#4:1928\n460#5,13:1940\n473#5,3:1954\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$HorizontalMonthsList$2$1$1\n*L\n1307#1:1921,6\n1307#1:1953\n1307#1:1958\n1307#1:1927\n1307#1:1929,11\n1307#1:1957\n1307#1:1928\n1307#1:1940,13\n1307#1:1954,3\n*E\n"})
public final class g0 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ StateData f12841p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CalendarMonth f12842q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function1<Long, Unit> f12843r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ CalendarDate f12844s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function1<Long, Boolean> f12845t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f12846u0;
    public final /* synthetic */ DatePickerColors v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ int f12847w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g0(StateData stateData, CalendarMonth calendarMonth, Function1<? super Long, Unit> function1, CalendarDate calendarDate, Function1<? super Long, Boolean> function2, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, int i10) {
        super(4);
        this.f12841p0 = stateData;
        this.f12842q0 = calendarMonth;
        this.f12843r0 = function1;
        this.f12844s0 = calendarDate;
        this.f12845t0 = function2;
        this.f12846u0 = datePickerFormatter;
        this.v0 = datePickerColors;
        this.f12847w0 = i10;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        int i10;
        LazyItemScope items = lazyItemScope;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 14) == 0) {
            i10 = (composer2.changed(items) ? 4 : 2) | iIntValue2;
        } else {
            i10 = iIntValue2;
        }
        if ((iIntValue2 & 112) == 0) {
            i10 |= composer2.changed(iIntValue) ? 32 : 16;
        }
        if ((i10 & 731) == 146 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-65053693, iIntValue2, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1300)");
            }
            CalendarMonth calendarMonthPlusMonths = this.f12841p0.getCalendarModel().plusMonths(this.f12842q0, iIntValue);
            Modifier modifierD = y.c.d(items, Modifier.INSTANCE, 0.0f, 1, null);
            Function1<Long, Unit> function1 = this.f12843r0;
            CalendarDate calendarDate = this.f12844s0;
            StateData stateData = this.f12841p0;
            Function1<Long, Boolean> function2 = this.f12845t0;
            DatePickerFormatter datePickerFormatter = this.f12846u0;
            DatePickerColors datePickerColors = this.v0;
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, false, composer2, 0, -1323940314);
            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierD);
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
            int i11 = this.f12847w0;
            int i12 = i11 << 3;
            int i13 = i11 << 6;
            DatePickerKt.Month(calendarMonthPlusMonths, function1, calendarDate, stateData, false, function2, datePickerFormatter, datePickerColors, composer2, ((i11 << 9) & 3670016) | (i12 & 458752) | (i12 & 112) | 24576 | (i13 & 7168) | (29360128 & i13));
            if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
