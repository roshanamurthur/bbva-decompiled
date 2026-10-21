package androidx.compose.ui.platform;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TextToolbarStatus.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/TextToolbarStatus;", "", "Shown", "Hidden", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class TextToolbarStatus {
    private static final /* synthetic */ TextToolbarStatus[] $VALUES;
    public static final TextToolbarStatus Hidden;
    public static final TextToolbarStatus Shown;

    static {
        TextToolbarStatus textToolbarStatus = new TextToolbarStatus("Shown", 0);
        Shown = textToolbarStatus;
        TextToolbarStatus textToolbarStatus2 = new TextToolbarStatus("Hidden", 1);
        Hidden = textToolbarStatus2;
        $VALUES = new TextToolbarStatus[]{textToolbarStatus, textToolbarStatus2};
    }

    public TextToolbarStatus() {
        throw null;
    }

    public static TextToolbarStatus valueOf(String str) {
        return (TextToolbarStatus) Enum.valueOf(TextToolbarStatus.class, str);
    }

    public static TextToolbarStatus[] values() {
        return (TextToolbarStatus[]) $VALUES.clone();
    }
}
