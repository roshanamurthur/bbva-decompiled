package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VisualTransformation.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/input/PasswordVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/input/TransformedText;", "filter", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "a", "C", "getMask", "()C", "mask", "<init>", "(C)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class PasswordVisualTransformation implements VisualTransformation {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final char mask;

    public PasswordVisualTransformation() {
        this((char) 0, 1, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof PasswordVisualTransformation) {
            return this.mask == ((PasswordVisualTransformation) other).mask;
        }
        return false;
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    @NotNull
    public TransformedText filter(@NotNull AnnotatedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TransformedText(new AnnotatedString(l.repeat(String.valueOf(this.mask), text.getText().length()), null, null, 6, null), OffsetMapping.INSTANCE.getIdentity());
    }

    public final char getMask() {
        return this.mask;
    }

    public int hashCode() {
        return this.mask;
    }

    public PasswordVisualTransformation(char c10) {
        this.mask = c10;
    }

    public /* synthetic */ PasswordVisualTransformation(char c10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Typography.bullet : c10);
    }
}
