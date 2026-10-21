package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u4 extends Lambda implements Function1<TextFieldValue, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f14341p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MutableState<TextFieldValue> f14342q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(TimePickerState timePickerState, MutableState<TextFieldValue> mutableState) {
        super(1);
        this.f14341p0 = timePickerState;
        this.f14342q0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TextFieldValue textFieldValue) {
        TextFieldValue newValue = textFieldValue;
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int iM1241getHourJiIwxys = Selection.INSTANCE.m1241getHourJiIwxys();
        TimePickerState timePickerState = this.f14341p0;
        MutableState<TextFieldValue> mutableState = this.f14342q0;
        TimePickerKt.m1407access$timeInputOnChangegIWD5Rc(iM1241getHourJiIwxys, timePickerState, newValue, TimePickerKt.access$TimeInputImpl$lambda$5(mutableState), this.f14341p0.getIs24hour() ? 23 : 12, new t4(mutableState));
        return Unit.INSTANCE;
    }
}
