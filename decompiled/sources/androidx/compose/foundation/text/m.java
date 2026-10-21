package androidx.compose.foundation.text;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TextFieldState f6156p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ FocusRequester f6157q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f6158r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(TextFieldState textFieldState, FocusRequester focusRequester, boolean z10) {
        super(0);
        this.f6156p0 = textFieldState;
        this.f6157q0 = focusRequester;
        this.f6158r0 = z10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        CoreTextFieldKt.access$tapToFocus(this.f6156p0, this.f6157q0, !this.f6158r0);
        return Boolean.TRUE;
    }
}
