package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/DrawerValue;", "", "Closed", "Open", "material_release"}, k = 1, mv = {1, 8, 0})
public final class DrawerValue {
    private static final /* synthetic */ DrawerValue[] $VALUES;
    public static final DrawerValue Closed;
    public static final DrawerValue Open;

    static {
        DrawerValue drawerValue = new DrawerValue("Closed", 0);
        Closed = drawerValue;
        DrawerValue drawerValue2 = new DrawerValue("Open", 1);
        Open = drawerValue2;
        $VALUES = new DrawerValue[]{drawerValue, drawerValue2};
    }

    public DrawerValue() {
        throw null;
    }

    public static DrawerValue valueOf(String str) {
        return (DrawerValue) Enum.valueOf(DrawerValue.class, str);
    }

    public static DrawerValue[] values() {
        return (DrawerValue[]) $VALUES.clone();
    }
}
