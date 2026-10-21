package h0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    private static final /* synthetic */ c0[] $VALUES;
    public static final c0 Body;
    public static final c0 Fab;
    public static final c0 Sheet;
    public static final c0 Snackbar;
    public static final c0 TopBar;

    static {
        c0 c0Var = new c0("TopBar", 0);
        TopBar = c0Var;
        c0 c0Var2 = new c0("Body", 1);
        Body = c0Var2;
        c0 c0Var3 = new c0("Sheet", 2);
        Sheet = c0Var3;
        c0 c0Var4 = new c0("Fab", 3);
        Fab = c0Var4;
        c0 c0Var5 = new c0("Snackbar", 4);
        Snackbar = c0Var5;
        $VALUES = new c0[]{c0Var, c0Var2, c0Var3, c0Var4, c0Var5};
    }

    public c0() {
        throw null;
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }
}
