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
public final class g5 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Modifier f82581p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f82582q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ TimePickerColors f82583r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f82584s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(int i10, TimePickerColors timePickerColors, TimePickerState timePickerState, Modifier modifier) {
        super(2);
        this.f82581p0 = modifier;
        this.f82582q0 = timePickerState;
        this.f82583r0 = timePickerColors;
        this.f82584s0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f82584s0 | 1);
        TimePickerState timePickerState = this.f82582q0;
        TimePickerColors timePickerColors = this.f82583r0;
        TimePickerKt.i(this.f82581p0, timePickerColors, timePickerState, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
