package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c3 {
    private static final /* synthetic */ c3[] $VALUES;
    public static final c3 BottomBar;
    public static final c3 Fab;
    public static final c3 MainContent;
    public static final c3 Snackbar;
    public static final c3 TopBar;

    static {
        c3 c3Var = new c3("TopBar", 0);
        TopBar = c3Var;
        c3 c3Var2 = new c3("MainContent", 1);
        MainContent = c3Var2;
        c3 c3Var3 = new c3("Snackbar", 2);
        Snackbar = c3Var3;
        c3 c3Var4 = new c3("Fab", 3);
        Fab = c3Var4;
        c3 c3Var5 = new c3("BottomBar", 4);
        BottomBar = c3Var5;
        $VALUES = new c3[]{c3Var, c3Var2, c3Var3, c3Var4, c3Var5};
    }

    public c3() {
        throw null;
    }

    public static c3 valueOf(String str) {
        return (c3) Enum.valueOf(c3.class, str);
    }

    public static c3[] values() {
        return (c3[]) $VALUES.clone();
    }
}
