package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TtsAnnotation.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/VerbatimTtsAnnotation;", "Landroidx/compose/ui/text/TtsAnnotation;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", "Ljava/lang/String;", "getVerbatim", "()Ljava/lang/String;", "verbatim", "<init>", "(Ljava/lang/String;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class VerbatimTtsAnnotation extends TtsAnnotation {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String verbatim;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerbatimTtsAnnotation(@NotNull String verbatim) {
        super(null);
        Intrinsics.checkNotNullParameter(verbatim, "verbatim");
        this.verbatim = verbatim;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof VerbatimTtsAnnotation) {
            return Intrinsics.areEqual(this.verbatim, ((VerbatimTtsAnnotation) other).verbatim);
        }
        return false;
    }

    @NotNull
    public final String getVerbatim() {
        return this.verbatim;
    }

    public int hashCode() {
        return this.verbatim.hashCode();
    }

    @NotNull
    public String toString() {
        return y2.b(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.verbatim, RootService.CLOSE_BRACKET);
    }
}
