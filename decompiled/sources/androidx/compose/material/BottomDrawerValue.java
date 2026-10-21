package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/BottomDrawerValue;", "", "Closed", "Open", "Expanded", "material_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterialApi
public final class BottomDrawerValue {
    private static final /* synthetic */ BottomDrawerValue[] $VALUES;
    public static final BottomDrawerValue Closed;
    public static final BottomDrawerValue Expanded;
    public static final BottomDrawerValue Open;

    static {
        BottomDrawerValue bottomDrawerValue = new BottomDrawerValue("Closed", 0);
        Closed = bottomDrawerValue;
        BottomDrawerValue bottomDrawerValue2 = new BottomDrawerValue("Open", 1);
        Open = bottomDrawerValue2;
        BottomDrawerValue bottomDrawerValue3 = new BottomDrawerValue("Expanded", 2);
        Expanded = bottomDrawerValue3;
        $VALUES = new BottomDrawerValue[]{bottomDrawerValue, bottomDrawerValue2, bottomDrawerValue3};
    }

    public BottomDrawerValue() {
        throw null;
    }

    public static BottomDrawerValue valueOf(String str) {
        return (BottomDrawerValue) Enum.valueOf(BottomDrawerValue.class, str);
    }

    public static BottomDrawerValue[] values() {
        return (BottomDrawerValue[]) $VALUES.clone();
    }
}
