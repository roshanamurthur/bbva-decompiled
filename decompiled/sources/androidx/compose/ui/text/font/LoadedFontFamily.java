package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FontFamily.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/font/LoadedFontFamily;", "Landroidx/compose/ui/text/font/FontFamily;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Landroidx/compose/ui/text/font/Typeface;", "v0", "Landroidx/compose/ui/text/font/Typeface;", "getTypeface", "()Landroidx/compose/ui/text/font/Typeface;", "typeface", "<init>", "(Landroidx/compose/ui/text/font/Typeface;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class LoadedFontFamily extends FontFamily {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public final Typeface typeface;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadedFontFamily(@NotNull Typeface typeface) {
        super(true, null);
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        this.typeface = typeface;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof LoadedFontFamily) {
            return Intrinsics.areEqual(this.typeface, ((LoadedFontFamily) other).typeface);
        }
        return false;
    }

    @NotNull
    public final Typeface getTypeface() {
        return this.typeface;
    }

    public int hashCode() {
        return this.typeface.hashCode();
    }

    @NotNull
    public String toString() {
        return "LoadedFontFamily(typeface=" + this.typeface + RootService.CLOSE_BRACKET;
    }
}
