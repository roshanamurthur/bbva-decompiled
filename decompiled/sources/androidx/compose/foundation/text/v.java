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
public final class v extends Lambda implements Function1<TextFieldPreparedSelection, EditCommand> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final v f6492p0 = new v(1);

    @Override // kotlin.jvm.functions.Function1
    public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
        TextFieldPreparedSelection deleteIfSelectedOr = textFieldPreparedSelection;
        Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
        int nextCharacterIndex = deleteIfSelectedOr.getNextCharacterIndex();
        if (nextCharacterIndex != -1) {
            return new DeleteSurroundingTextCommand(0, nextCharacterIndex - TextRange.m3962getEndimpl(deleteIfSelectedOr.getSelection()));
        }
        return null;
    }
}
