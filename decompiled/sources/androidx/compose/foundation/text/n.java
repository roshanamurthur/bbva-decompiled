package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f6258p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(TextFieldSelectionManager textFieldSelectionManager) {
        super(0);
        this.f6258p0 = textFieldSelectionManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        this.f6258p0.enterSelectionMode$foundation_release();
        return Boolean.TRUE;
    }
}
