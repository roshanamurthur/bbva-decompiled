package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends Lambda implements Function3<DisplayMode, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DatePickerState f12988p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f12989q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function1<Long, Boolean> f12990r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f12991s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f12992t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m0(DatePickerState datePickerState, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function1, DatePickerColors datePickerColors, int i10) {
        super(3);
        this.f12988p0 = datePickerState;
        this.f12989q0 = datePickerFormatter;
        this.f12990r0 = function1;
        this.f12991s0 = datePickerColors;
        this.f12992t0 = i10;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(DisplayMode displayMode, Composer composer, Integer num) {
        int i10;
        int f10188a = displayMode.getF10188a();
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            i10 = (composer2.changed(f10188a) ? 4 : 2) | iIntValue;
        } else {
            i10 = iIntValue;
        }
        if ((i10 & 91) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1854706084, iIntValue, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DatePicker.kt:1104)");
            }
            DisplayMode.Companion companion = DisplayMode.INSTANCE;
            boolean zM1076equalsimpl0 = DisplayMode.m1076equalsimpl0(f10188a, companion.m1081getPickerjFl4v0());
            int i11 = this.f12992t0;
            DatePickerState datePickerState = this.f12988p0;
            if (zM1076equalsimpl0) {
                composer2.startReplaceableGroup(-1168728183);
                DatePickerKt.access$DatePickerContent(datePickerState.getStateData(), this.f12989q0, this.f12990r0, this.f12991s0, composer2, (i11 & 112) | (i11 & 896) | (i11 & 7168));
                composer2.endReplaceableGroup();
            } else if (DisplayMode.m1076equalsimpl0(f10188a, companion.m1080getInputjFl4v0())) {
                composer2.startReplaceableGroup(-1168727945);
                DateInputKt.DateInputContent(datePickerState.getStateData(), this.f12989q0, this.f12990r0, composer2, (i11 & 112) | (i11 & 896));
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(-1168727765);
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
