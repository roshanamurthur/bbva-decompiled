package androidx.compose.foundation.text;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Lambda implements Function0<TextLayoutResultProxy> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TextFieldState f6119p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TextFieldState textFieldState) {
        super(0);
        this.f6119p0 = textFieldState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TextLayoutResultProxy invoke() {
        return this.f6119p0.getLayoutResult();
    }
}
