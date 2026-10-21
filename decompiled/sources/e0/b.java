package e0;

import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.KeyEventHelpers_androidKt;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.input.key.KeyEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function1<KeyEvent, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TextFieldState f68217p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f68218q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        super(1);
        this.f68217p0 = textFieldState;
        this.f68218q0 = textFieldSelectionManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(KeyEvent keyEvent) {
        boolean z10;
        android.view.KeyEvent keyEvent2 = keyEvent.m3355unboximpl();
        Intrinsics.checkNotNullParameter(keyEvent2, "keyEvent");
        if (this.f68217p0.getHandleState() == HandleState.Selection && KeyEventHelpers_androidKt.m500cancelsTextSelectionZmokQxo(keyEvent2)) {
            z10 = true;
            TextFieldSelectionManager.m642deselect_kEHs6E$foundation_release$default(this.f68218q0, null, 1, null);
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
