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
public final class s4 extends Lambda implements Function1<KeyEvent, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f13103p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MutableState<TextFieldValue> f13104q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(TimePickerState timePickerState, MutableState<TextFieldValue> mutableState) {
        super(1);
        this.f13103p0 = timePickerState;
        this.f13104q0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(KeyEvent keyEvent) {
        android.view.KeyEvent event = keyEvent.m3355unboximpl();
        Intrinsics.checkNotNullParameter(event, "event");
        int iM3368getUtf16CodePointZmokQxo = KeyEvent_androidKt.m3368getUtf16CodePointZmokQxo(event);
        if (48 <= iM3368getUtf16CodePointZmokQxo && iM3368getUtf16CodePointZmokQxo < 58) {
            MutableState<TextFieldValue> mutableState = this.f13104q0;
            if (TextRange.m3967getStartimpl(TimePickerKt.access$TimeInputImpl$lambda$5(mutableState).getSelection()) == 2 && TimePickerKt.access$TimeInputImpl$lambda$5(mutableState).getText().length() == 2) {
                this.f13103p0.m1422setSelectioniHAOin8$material3_release(Selection.INSTANCE.m1242getMinuteJiIwxys());
            }
        }
        return Boolean.FALSE;
    }
}
