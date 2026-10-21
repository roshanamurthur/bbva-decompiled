package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f13060p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f13061q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f13062r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(TimePickerState timePickerState, boolean z10, int i10) {
        super(2);
        this.f13060p0 = timePickerState;
        this.f13061q0 = z10;
        this.f13062r0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-448649404, iIntValue, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1166)");
            }
            int size = TimePickerKt.f12354l.size();
            for (int i10 = 0; i10 < size; i10++) {
                int iIntValue2 = ((Number) TimePickerKt.f12354l.get(i10)).intValue();
                int i11 = this.f13062r0;
                TimePickerKt.access$ClockText(this.f13060p0, iIntValue2, this.f13061q0, composer2, (i11 & 896) | (i11 & 14));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
