package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m4 {
    private static final /* synthetic */ m4[] $VALUES;
    public static final m4 Divider;
    public static final m4 Indicator;
    public static final m4 Tabs;

    static {
        m4 m4Var = new m4("Tabs", 0);
        Tabs = m4Var;
        m4 m4Var2 = new m4("Divider", 1);
        Divider = m4Var2;
        m4 m4Var3 = new m4("Indicator", 2);
        Indicator = m4Var3;
        $VALUES = new m4[]{m4Var, m4Var2, m4Var3};
    }

    public m4() {
        throw null;
    }

    public static m4 valueOf(String str) {
        return (m4) Enum.valueOf(m4.class, str);
    }

    public static m4[] values() {
        return (m4[]) $VALUES.clone();
    }
}
