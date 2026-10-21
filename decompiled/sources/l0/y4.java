package l0;

import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class y4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Modifier f83059p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f83060q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ TimePickerColors f83061r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f83062s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(int i10, TimePickerColors timePickerColors, TimePickerState timePickerState, Modifier modifier) {
        super(2);
        this.f83059p0 = modifier;
        this.f83060q0 = timePickerState;
        this.f83061r0 = timePickerColors;
        this.f83062s0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f83062s0 | 1);
        TimePickerState timePickerState = this.f83060q0;
        TimePickerColors timePickerColors = this.f83061r0;
        TimePickerKt.c(this.f83059p0, timePickerColors, timePickerState, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
