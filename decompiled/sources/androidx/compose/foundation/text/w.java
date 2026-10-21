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
public final class w extends Lambda implements Function1<TextFieldPreparedSelection, EditCommand> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final w f6493p0 = new w(1);

    @Override // kotlin.jvm.functions.Function1
    public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
        TextFieldPreparedSelection deleteIfSelectedOr = textFieldPreparedSelection;
        Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
        Integer previousWordOffset = deleteIfSelectedOr.getPreviousWordOffset();
        if (previousWordOffset == null) {
            return null;
        }
        return new DeleteSurroundingTextCommand(TextRange.m3962getEndimpl(deleteIfSelectedOr.getSelection()) - previousWordOffset.intValue(), 0);
    }
}
