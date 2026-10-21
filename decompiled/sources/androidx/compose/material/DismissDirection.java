package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: SwipeToDismiss.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/DismissDirection;", "", "StartToEnd", "EndToStart", "material_release"}, k = 1, mv = {1, 8, 0})
public final class DismissDirection {
    private static final /* synthetic */ DismissDirection[] $VALUES;
    public static final DismissDirection EndToStart;
    public static final DismissDirection StartToEnd;

    static {
        DismissDirection dismissDirection = new DismissDirection("StartToEnd", 0);
        StartToEnd = dismissDirection;
        DismissDirection dismissDirection2 = new DismissDirection("EndToStart", 1);
        EndToStart = dismissDirection2;
        $VALUES = new DismissDirection[]{dismissDirection, dismissDirection2};
    }

    public DismissDirection() {
        throw null;
    }

    public static DismissDirection valueOf(String str) {
        return (DismissDirection) Enum.valueOf(DismissDirection.class, str);
    }

    public static DismissDirection[] values() {
        return (DismissDirection[]) $VALUES.clone();
    }
}
