package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VisualTransformation.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/input/TransformedText;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Landroidx/compose/ui/text/AnnotatedString;", "a", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/input/OffsetMapping;", "b", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/input/OffsetMapping;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class TransformedText {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AnnotatedString text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OffsetMapping offsetMapping;

    public TransformedText(@NotNull AnnotatedString text, @NotNull OffsetMapping offsetMapping) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        this.text = text;
        this.offsetMapping = offsetMapping;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransformedText)) {
            return false;
        }
        TransformedText transformedText = (TransformedText) other;
        return Intrinsics.areEqual(this.text, transformedText.text) && Intrinsics.areEqual(this.offsetMapping, transformedText.offsetMapping);
    }

    @NotNull
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    @NotNull
    public final AnnotatedString getText() {
        return this.text;
    }

    public int hashCode() {
        return this.offsetMapping.hashCode() + (this.text.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "TransformedText(text=" + ((Object) this.text) + ", offsetMapping=" + this.offsetMapping + RootService.CLOSE_BRACKET;
    }
}
