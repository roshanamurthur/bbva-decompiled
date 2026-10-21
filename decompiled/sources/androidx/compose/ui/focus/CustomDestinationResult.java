package androidx.compose.ui.focus;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: FocusTransactions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/focus/CustomDestinationResult;", "", "None", "Cancelled", "Redirected", "RedirectCancelled", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class CustomDestinationResult {
    private static final /* synthetic */ CustomDestinationResult[] $VALUES;
    public static final CustomDestinationResult Cancelled;
    public static final CustomDestinationResult None;
    public static final CustomDestinationResult RedirectCancelled;
    public static final CustomDestinationResult Redirected;

    static {
        CustomDestinationResult customDestinationResult = new CustomDestinationResult("None", 0);
        None = customDestinationResult;
        CustomDestinationResult customDestinationResult2 = new CustomDestinationResult("Cancelled", 1);
        Cancelled = customDestinationResult2;
        CustomDestinationResult customDestinationResult3 = new CustomDestinationResult("Redirected", 2);
        Redirected = customDestinationResult3;
        CustomDestinationResult customDestinationResult4 = new CustomDestinationResult("RedirectCancelled", 3);
        RedirectCancelled = customDestinationResult4;
        $VALUES = new CustomDestinationResult[]{customDestinationResult, customDestinationResult2, customDestinationResult3, customDestinationResult4};
    }

    public CustomDestinationResult() {
        throw null;
    }

    public static CustomDestinationResult valueOf(String str) {
        return (CustomDestinationResult) Enum.valueOf(CustomDestinationResult.class, str);
    }

    public static CustomDestinationResult[] values() {
        return (CustomDestinationResult[]) $VALUES.clone();
    }
}
