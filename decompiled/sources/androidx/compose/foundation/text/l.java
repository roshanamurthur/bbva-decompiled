package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TextFieldState f6154p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ImeOptions f6155q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TextFieldState textFieldState, ImeOptions imeOptions) {
        super(0);
        this.f6154p0 = textFieldState;
        this.f6155q0 = imeOptions;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        this.f6154p0.getOnImeActionPerformed().invoke(ImeAction.m4101boximpl(this.f6155q0.getImeAction()));
        return Boolean.TRUE;
    }
}
