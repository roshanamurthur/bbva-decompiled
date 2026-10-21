package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FontFamily.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/font/GenericFontFamily;", "Landroidx/compose/ui/text/font/SystemFontFamily;", "", "toString", "v0", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "fontFamilyName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class GenericFontFamily extends SystemFontFamily {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final String f18015w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericFontFamily(@NotNull String name, @NotNull String fontFamilyName) {
        super(null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        this.name = name;
        this.f18015w0 = fontFamilyName;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getF18015w0() {
        return this.f18015w0;
    }
}
