package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/layout/Direction;", "", "Vertical", "Horizontal", "Both", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
public final class Direction {
    private static final /* synthetic */ Direction[] $VALUES;
    public static final Direction Both;
    public static final Direction Horizontal;
    public static final Direction Vertical;

    static {
        Direction direction = new Direction("Vertical", 0);
        Vertical = direction;
        Direction direction2 = new Direction("Horizontal", 1);
        Horizontal = direction2;
        Direction direction3 = new Direction("Both", 2);
        Both = direction3;
        $VALUES = new Direction[]{direction, direction2, direction3};
    }

    public Direction() {
        throw null;
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) $VALUES.clone();
    }
}
