package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import com.adobe.marketing.mobile.EventDataKeys;
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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/input/SetComposingRegionCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/ui/text/input/EditingBuffer;", "buffer", "", "applyTo", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getStart", "()I", EventDataKeys.Lifecycle.LIFECYCLE_START, "b", "getEnd", "end", "<init>", "(II)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class SetComposingRegionCommand implements EditCommand {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int end;

    public SetComposingRegionCommand(int i10, int i11) {
        this.start = i10;
        this.end = i11;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(@NotNull EditingBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (buffer.hasComposition$ui_text_release()) {
            buffer.commitComposition$ui_text_release();
        }
        int iCoerceIn = c.coerceIn(this.start, 0, buffer.getLength$ui_text_release());
        int iCoerceIn2 = c.coerceIn(this.end, 0, buffer.getLength$ui_text_release());
        if (iCoerceIn != iCoerceIn2) {
            if (iCoerceIn < iCoerceIn2) {
                buffer.setComposition$ui_text_release(iCoerceIn, iCoerceIn2);
            } else {
                buffer.setComposition$ui_text_release(iCoerceIn2, iCoerceIn);
            }
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetComposingRegionCommand)) {
            return false;
        }
        SetComposingRegionCommand setComposingRegionCommand = (SetComposingRegionCommand) other;
        return this.start == setComposingRegionCommand.start && this.end == setComposingRegionCommand.end;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        return (this.start * 31) + this.end;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingRegionCommand(start=");
        sb2.append(this.start);
        sb2.append(", end=");
        return androidx.activity.a.d(sb2, this.end, RootService.CLOSE_BRACKET);
    }
}
