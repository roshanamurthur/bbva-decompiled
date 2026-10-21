package l0;

import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f83001p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f83002q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f83003r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f83004s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(TimePickerState timePickerState, int i10, boolean z10, int i11) {
        super(2);
        this.f83001p0 = timePickerState;
        this.f83002q0 = i10;
        this.f83003r0 = z10;
        this.f83004s0 = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f83004s0 | 1);
        int i10 = this.f83002q0;
        boolean z10 = this.f83003r0;
        TimePickerKt.access$ClockText(this.f83001p0, i10, z10, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
