package androidx.compose.ui.text.input;

import androidx.collection.k;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EditCommand.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/input/DeleteSurroundingTextCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/ui/text/input/EditingBuffer;", "buffer", "", "applyTo", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getLengthBeforeCursor", "()I", "lengthBeforeCursor", "b", "getLengthAfterCursor", "lengthAfterCursor", "<init>", "(II)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEditCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCommand.kt\nandroidx/compose/ui/text/input/DeleteSurroundingTextCommand\n+ 2 MathUtils.kt\nandroidx/compose/ui/text/input/MathUtilsKt\n*L\n1#1,563:1\n23#2,3:564\n*S KotlinDebug\n*F\n+ 1 EditCommand.kt\nandroidx/compose/ui/text/input/DeleteSurroundingTextCommand\n*L\n268#1:564,3\n*E\n"})
public final class DeleteSurroundingTextCommand implements EditCommand {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int lengthBeforeCursor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int lengthAfterCursor;

    /* JADX INFO: compiled from: EditCommand.kt */
    public static final class a extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f18052p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return 0;
        }
    }

    public DeleteSurroundingTextCommand(int i10, int i11) {
        this.lengthBeforeCursor = i10;
        this.lengthAfterCursor = i11;
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException(k.c("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i10, " and ", i11, " respectively.").toString());
        }
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(@NotNull EditingBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int selectionEnd = buffer.getSelectionEnd();
        int i10 = this.lengthAfterCursor;
        int length$ui_text_release = selectionEnd + i10;
        if (((selectionEnd ^ length$ui_text_release) & (i10 ^ length$ui_text_release)) < 0) {
            length$ui_text_release = buffer.getLength$ui_text_release();
        }
        buffer.delete$ui_text_release(buffer.getSelectionEnd(), Math.min(length$ui_text_release, buffer.getLength$ui_text_release()));
        buffer.delete$ui_text_release(Math.max(0, MathUtilsKt.subtractExactOrElse(buffer.getSelectionStart(), this.lengthBeforeCursor, a.f18052p0)), buffer.getSelectionStart());
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteSurroundingTextCommand)) {
            return false;
        }
        DeleteSurroundingTextCommand deleteSurroundingTextCommand = (DeleteSurroundingTextCommand) other;
        return this.lengthBeforeCursor == deleteSurroundingTextCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextCommand.lengthAfterCursor;
    }

    public final int getLengthAfterCursor() {
        return this.lengthAfterCursor;
    }

    public final int getLengthBeforeCursor() {
        return this.lengthBeforeCursor;
    }

    public int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb2.append(this.lengthBeforeCursor);
        sb2.append(", lengthAfterCursor=");
        return androidx.activity.a.d(sb2, this.lengthAfterCursor, RootService.CLOSE_BRACKET);
    }
}
