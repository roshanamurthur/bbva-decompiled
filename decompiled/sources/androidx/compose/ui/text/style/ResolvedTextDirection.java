package androidx.compose.ui.text.style;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: ResolvedTextDirection.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/style/ResolvedTextDirection;", "", "Ltr", "Rtl", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class ResolvedTextDirection {
    private static final /* synthetic */ ResolvedTextDirection[] $VALUES;
    public static final ResolvedTextDirection Ltr;
    public static final ResolvedTextDirection Rtl;

    static {
        ResolvedTextDirection resolvedTextDirection = new ResolvedTextDirection("Ltr", 0);
        Ltr = resolvedTextDirection;
        ResolvedTextDirection resolvedTextDirection2 = new ResolvedTextDirection("Rtl", 1);
        Rtl = resolvedTextDirection2;
        $VALUES = new ResolvedTextDirection[]{resolvedTextDirection, resolvedTextDirection2};
    }

    public ResolvedTextDirection() {
        throw null;
    }

    public static ResolvedTextDirection valueOf(String str) {
        return (ResolvedTextDirection) Enum.valueOf(ResolvedTextDirection.class, str);
    }

    public static ResolvedTextDirection[] values() {
        return (ResolvedTextDirection[]) $VALUES.clone();
    }
}
