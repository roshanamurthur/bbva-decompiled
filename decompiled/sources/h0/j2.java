package h0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j2 {
    private static final /* synthetic */ j2[] $VALUES;
    public static final j2 BottomBar;
    public static final j2 Fab;
    public static final j2 MainContent;
    public static final j2 Snackbar;
    public static final j2 TopBar;

    static {
        j2 j2Var = new j2("TopBar", 0);
        TopBar = j2Var;
        j2 j2Var2 = new j2("MainContent", 1);
        MainContent = j2Var2;
        j2 j2Var3 = new j2("Snackbar", 2);
        Snackbar = j2Var3;
        j2 j2Var4 = new j2("Fab", 3);
        Fab = j2Var4;
        j2 j2Var5 = new j2("BottomBar", 4);
        BottomBar = j2Var5;
        $VALUES = new j2[]{j2Var, j2Var2, j2Var3, j2Var4, j2Var5};
    }

    public j2() {
        throw null;
    }

    public static j2 valueOf(String str) {
        return (j2) Enum.valueOf(j2.class, str);
    }

    public static j2[] values() {
        return (j2[]) $VALUES.clone();
    }
}
