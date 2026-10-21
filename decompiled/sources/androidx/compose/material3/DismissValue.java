package androidx.compose.material3;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: SwipeToDismiss.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/DismissValue;", "", "Default", "DismissedToEnd", "DismissedToStart", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class DismissValue {
    private static final /* synthetic */ DismissValue[] $VALUES;
    public static final DismissValue Default;
    public static final DismissValue DismissedToEnd;
    public static final DismissValue DismissedToStart;

    static {
        DismissValue dismissValue = new DismissValue("Default", 0);
        Default = dismissValue;
        DismissValue dismissValue2 = new DismissValue("DismissedToEnd", 1);
        DismissedToEnd = dismissValue2;
        DismissValue dismissValue3 = new DismissValue("DismissedToStart", 2);
        DismissedToStart = dismissValue3;
        $VALUES = new DismissValue[]{dismissValue, dismissValue2, dismissValue3};
    }

    public DismissValue() {
        throw null;
    }

    public static DismissValue valueOf(String str) {
        return (DismissValue) Enum.valueOf(DismissValue.class, str);
    }

    public static DismissValue[] values() {
        return (DismissValue[]) $VALUES.clone();
    }
}
