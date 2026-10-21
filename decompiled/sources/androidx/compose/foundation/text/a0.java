package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.KeyEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextFieldKeyInput.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 extends FunctionReferenceImpl implements Function1<KeyEvent, Boolean> {
    public a0(TextFieldKeyInput textFieldKeyInput) {
        super(1, textFieldKeyInput, TextFieldKeyInput.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(KeyEvent keyEvent) {
        android.view.KeyEvent p4 = keyEvent.m3355unboximpl();
        Intrinsics.checkNotNullParameter(p4, "p0");
        return Boolean.valueOf(((TextFieldKeyInput) this.receiver).m548processZmokQxo(p4));
    }
}
