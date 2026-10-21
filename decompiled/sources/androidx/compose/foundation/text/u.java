package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TextFieldKeyInput.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u extends Lambda implements Function1<TextFieldPreparedSelection, EditCommand> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final u f6491p0 = new u(1);

    @Override // kotlin.jvm.functions.Function1
    public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
        TextFieldPreparedSelection deleteIfSelectedOr = textFieldPreparedSelection;
        Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
        return new DeleteSurroundingTextCommand(TextRange.m3962getEndimpl(deleteIfSelectedOr.getSelection()) - deleteIfSelectedOr.getPrecedingCharacterIndex(), 0);
    }
}
