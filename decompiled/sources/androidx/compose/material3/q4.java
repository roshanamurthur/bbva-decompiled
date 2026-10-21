package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutIdKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ List<Integer> f13079p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f13080q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f13081r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f13082s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(List<Integer> list, TimePickerState timePickerState, boolean z10, int i10) {
        super(2);
        this.f13079p0 = list;
        this.f13080q0 = timePickerState;
        this.f13081r0 = z10;
        this.f13082s0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        int i10;
        boolean z10;
        TimePickerState timePickerState;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2018362505, iIntValue, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1149)");
            }
            composer2.startReplaceableGroup(-504302403);
            List<Integer> list = this.f13079p0;
            int size = list.size();
            int i11 = 0;
            while (true) {
                i10 = this.f13082s0;
                z10 = this.f13081r0;
                timePickerState = this.f13080q0;
                if (i11 >= size) {
                    break;
                }
                TimePickerKt.access$ClockText(timePickerState, (!timePickerState.getIs24hour() || Selection.m1237equalsimpl0(timePickerState.m1419getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m1242getMinuteJiIwxys())) ? list.get(i11).intValue() : list.get(i11).intValue() % 12, z10, composer2, (i10 & 896) | (i10 & 14));
                i11++;
            }
            composer2.endReplaceableGroup();
            if (Selection.m1237equalsimpl0(timePickerState.m1419getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m1241getHourJiIwxys()) && timePickerState.getIs24hour()) {
                TimePickerKt.m1404access$CircularLayoutuFdPcIQ(BackgroundKt.m121backgroundbw27NRU(SizeKt.m335size3ABfNKs(LayoutIdKt.layoutId(Modifier.INSTANCE, l0.z1.InnerCircle), TimePickerTokens.INSTANCE.m1981getClockDialContainerSizeD9Ej5fM()), Color.INSTANCE.m2543getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), TimePickerKt.f12344b, ComposableLambdaKt.composableLambda(composer2, -448649404, true, new p4(timePickerState, z10, i10)), composer2, 432, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
