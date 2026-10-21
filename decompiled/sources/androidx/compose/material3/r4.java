package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TimePickerColors f13090p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ List<Integer> f13091q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f13092r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ boolean f13093s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f13094t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(TimePickerColors timePickerColors, List<Integer> list, TimePickerState timePickerState, boolean z10, int i10) {
        super(2);
        this.f13090p0 = timePickerColors;
        this.f13091q0 = list;
        this.f13092r0 = timePickerState;
        this.f13093s0 = z10;
        this.f13094t0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1385633737, iIntValue, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1146)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(this.f13090p0.m1392clockDialContentColorvNxB06k$material3_release(false)))}, ComposableLambdaKt.composableLambda(composer2, -2018362505, true, new q4(this.f13091q0, this.f13092r0, this.f13093s0, this.f13094t0)), composer2, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
