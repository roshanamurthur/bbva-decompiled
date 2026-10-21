package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EditCommand.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dB\u0019\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\f\u0012\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/input/CommitTextCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/ui/text/input/EditingBuffer;", "buffer", "", "applyTo", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Landroidx/compose/ui/text/AnnotatedString;", "a", "Landroidx/compose/ui/text/AnnotatedString;", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getNewCursorPosition", "()I", "newCursorPosition", "getText", "()Ljava/lang/String;", "text", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;I)V", "(Ljava/lang/String;I)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class CommitTextCommand implements EditCommand {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AnnotatedString annotatedString;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int newCursorPosition;

    public CommitTextCommand(@NotNull AnnotatedString annotatedString, int i10) {
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        this.annotatedString = annotatedString;
        this.newCursorPosition = i10;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(@NotNull EditingBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (buffer.hasComposition$ui_text_release()) {
            buffer.replace$ui_text_release(buffer.getCompositionStart(), buffer.getCompositionEnd(), getText());
        } else {
            buffer.replace$ui_text_release(buffer.getSelectionStart(), buffer.getSelectionEnd(), getText());
        }
        int cursor$ui_text_release = buffer.getCursor$ui_text_release();
        int i10 = this.newCursorPosition;
        buffer.setCursor$ui_text_release(c.coerceIn(i10 > 0 ? (cursor$ui_text_release + i10) - 1 : (cursor$ui_text_release + i10) - getText().length(), 0, buffer.getLength$ui_text_release()));
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommitTextCommand)) {
            return false;
        }
        CommitTextCommand commitTextCommand = (CommitTextCommand) other;
        return Intrinsics.areEqual(getText(), commitTextCommand.getText()) && this.newCursorPosition == commitTextCommand.newCursorPosition;
    }

    @NotNull
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final int getNewCursorPosition() {
        return this.newCursorPosition;
    }

    @NotNull
    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        return (getText().hashCode() * 31) + this.newCursorPosition;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CommitTextCommand(text='");
        sb2.append(getText());
        sb2.append("', newCursorPosition=");
        return androidx.activity.a.d(sb2, this.newCursorPosition, RootService.CLOSE_BRACKET);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommitTextCommand(@NotNull String text, int i10) {
        this(new AnnotatedString(text, null, null, 6, null), i10);
        Intrinsics.checkNotNullParameter(text, "text");
    }
}
