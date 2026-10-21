package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class y1 {
    private static final /* synthetic */ y1[] $VALUES;
    public static final y1 Focused;
    public static final y1 UnfocusedEmpty;
    public static final y1 UnfocusedNotEmpty;

    static {
        y1 y1Var = new y1("Focused", 0);
        Focused = y1Var;
        y1 y1Var2 = new y1("UnfocusedEmpty", 1);
        UnfocusedEmpty = y1Var2;
        y1 y1Var3 = new y1("UnfocusedNotEmpty", 2);
        UnfocusedNotEmpty = y1Var3;
        $VALUES = new y1[]{y1Var, y1Var2, y1Var3};
    }

    public y1() {
        throw null;
    }

    public static y1 valueOf(String str) {
        return (y1) Enum.valueOf(y1.class, str);
    }

    public static y1[] values() {
        return (y1[]) $VALUES.clone();
    }
}
