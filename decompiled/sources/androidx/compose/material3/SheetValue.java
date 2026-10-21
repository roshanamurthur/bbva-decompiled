package androidx.compose.material3;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: SheetDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/SheetValue;", "", "Hidden", "Expanded", "PartiallyExpanded", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class SheetValue {
    private static final /* synthetic */ SheetValue[] $VALUES;
    public static final SheetValue Expanded;
    public static final SheetValue Hidden;
    public static final SheetValue PartiallyExpanded;

    static {
        SheetValue sheetValue = new SheetValue("Hidden", 0);
        Hidden = sheetValue;
        SheetValue sheetValue2 = new SheetValue("Expanded", 1);
        Expanded = sheetValue2;
        SheetValue sheetValue3 = new SheetValue("PartiallyExpanded", 2);
        PartiallyExpanded = sheetValue3;
        $VALUES = new SheetValue[]{sheetValue, sheetValue2, sheetValue3};
    }

    public SheetValue() {
        throw null;
    }

    public static SheetValue valueOf(String str) {
        return (SheetValue) Enum.valueOf(SheetValue.class, str);
    }

    public static SheetValue[] values() {
        return (SheetValue[]) $VALUES.clone();
    }
}
