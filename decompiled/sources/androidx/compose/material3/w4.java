package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class w4 extends Lambda implements Function1<KeyEvent, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f14366p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MutableState<TextFieldValue> f14367q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(TimePickerState timePickerState, MutableState<TextFieldValue> mutableState) {
        super(1);
        this.f14366p0 = timePickerState;
        this.f14367q0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(KeyEvent keyEvent) {
        android.view.KeyEvent event = keyEvent.m3355unboximpl();
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z10 = KeyEvent_androidKt.m3368getUtf16CodePointZmokQxo(event) == 0 && TextRange.m3967getStartimpl(TimePickerKt.access$TimeInputImpl$lambda$8(this.f14367q0).getSelection()) == 0;
        if (z10) {
            this.f14366p0.m1422setSelectioniHAOin8$material3_release(Selection.INSTANCE.m1241getHourJiIwxys());
        }
        return Boolean.valueOf(z10);
    }
}
