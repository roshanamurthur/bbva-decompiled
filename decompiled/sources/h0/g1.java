package h0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {
    private static final /* synthetic */ g1[] $VALUES;
    public static final g1 Focused;
    public static final g1 UnfocusedEmpty;
    public static final g1 UnfocusedNotEmpty;

    static {
        g1 g1Var = new g1("Focused", 0);
        Focused = g1Var;
        g1 g1Var2 = new g1("UnfocusedEmpty", 1);
        UnfocusedEmpty = g1Var2;
        g1 g1Var3 = new g1("UnfocusedNotEmpty", 2);
        UnfocusedNotEmpty = g1Var3;
        $VALUES = new g1[]{g1Var, g1Var2, g1Var3};
    }

    public g1() {
        throw null;
    }

    public static g1 valueOf(String str) {
        return (g1) Enum.valueOf(g1.class, str);
    }

    public static g1[] values() {
        return (g1[]) $VALUES.clone();
    }
}
