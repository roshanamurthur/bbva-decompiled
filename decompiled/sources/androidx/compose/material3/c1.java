package androidx.compose.material3;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListState;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,809:1\n74#2,6:810\n80#2:842\n84#2:847\n75#3:816\n76#3,11:818\n89#3:846\n76#4:817\n460#5,13:829\n473#5,3:843\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1\n*L\n549#1:810,6\n549#1:842\n549#1:847\n549#1:816\n549#1:818,11\n549#1:846\n549#1:817\n549#1:829,13\n549#1:843,3\n*E\n"})
public final class c1 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    public final /* synthetic */ String E0;
    public final /* synthetic */ String F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ StateData f12709p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CalendarMonth f12710q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f12711r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f12712s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function1<Long, Unit> f12713t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ CalendarDate f12714u0;
    public final /* synthetic */ Function1<Long, Boolean> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ int f12715w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ LazyListState f12716x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f12717y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c1(StateData stateData, CalendarMonth calendarMonth, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, Function1<? super Long, Unit> function1, CalendarDate calendarDate, Function1<? super Long, Boolean> function2, int i10, LazyListState lazyListState, CoroutineScope coroutineScope, String str, String str2) {
        super(4);
        this.f12709p0 = stateData;
        this.f12710q0 = calendarMonth;
        this.f12711r0 = datePickerFormatter;
        this.f12712s0 = datePickerColors;
        this.f12713t0 = function1;
        this.f12714u0 = calendarDate;
        this.v0 = function2;
        this.f12715w0 = i10;
        this.f12716x0 = lazyListState;
        this.f12717y0 = coroutineScope;
        this.E0 = str;
        this.F0 = str2;
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
                ComposerKt.traceEventStart(1246706073, iIntValue2, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:542)");
            }
            StateData stateData = this.f12709p0;
            CalendarMonth calendarMonthPlusMonths = stateData.getCalendarModel().plusMonths(this.f12710q0, iIntValue);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierD = y.c.d(items, companion, 0.0f, 1, null);
            Function1<Long, Unit> function1 = this.f12713t0;
            CalendarDate calendarDate = this.f12714u0;
            Function1<Long, Boolean> function2 = this.v0;
            composer2.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyA = androidx.camera.core.impl.v.a(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl, measurePolicyA, composerM2074constructorimpl, density));
            ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            CalendarModel calendarModel = stateData.getCalendarModel();
            Locale localeDefaultLocale = CalendarModel_androidKt.defaultLocale(composer2, 0);
            DatePickerFormatter datePickerFormatter = this.f12711r0;
            String monthYear$material3_release = datePickerFormatter.formatMonthYear$material3_release(calendarMonthPlusMonths, calendarModel, localeDefaultLocale);
            if (monthYear$material3_release == null) {
                monthYear$material3_release = Constant.DASH_STRING;
            }
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(ClickableKt.m148clickableXHw0xAI$default(PaddingKt.padding(companion, DateRangePickerKt.getCalendarMonthSubheadPadding()), false, null, null, a1.f12660p0, 7, null), false, new b1(this.f12716x0, this.f12717y0, this.E0, this.F0), 1, null);
            DatePickerColors datePickerColors = this.f12712s0;
            TextKt.m1389Text4IGK_g(monthYear$material3_release, modifierSemantics$default, datePickerColors.getSubheadContentColor(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131064);
            int i11 = this.f12715w0;
            int i12 = i11 << 3;
            int i13 = i11 << 6;
            DatePickerKt.Month(calendarMonthPlusMonths, function1, calendarDate, stateData, true, function2, datePickerFormatter, datePickerColors, composer2, ((i11 << 9) & 3670016) | (i12 & 458752) | (i12 & 112) | 24576 | (i13 & 7168) | (29360128 & i13));
            if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
