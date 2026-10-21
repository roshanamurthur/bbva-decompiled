package h0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l3 {
    private static final /* synthetic */ l3[] $VALUES;
    public static final l3 Divider;
    public static final l3 Indicator;
    public static final l3 Tabs;

    static {
        l3 l3Var = new l3("Tabs", 0);
        Tabs = l3Var;
        l3 l3Var2 = new l3("Divider", 1);
        Divider = l3Var2;
        l3 l3Var3 = new l3("Indicator", 2);
        Indicator = l3Var3;
        $VALUES = new l3[]{l3Var, l3Var2, l3Var3};
    }

    public l3() {
        throw null;
    }

    public static l3 valueOf(String str) {
        return (l3) Enum.valueOf(l3.class, str);
    }

    public static l3[] values() {
        return (l3[]) $VALUES.clone();
    }
}
