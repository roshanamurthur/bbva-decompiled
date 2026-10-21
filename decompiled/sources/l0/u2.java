package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u2 {
    private static final /* synthetic */ u2[] $VALUES;
    public static final u2 ENDTHUMB;
    public static final u2 STARTTHUMB;
    public static final u2 TRACK;

    static {
        u2 u2Var = new u2("ENDTHUMB", 0);
        ENDTHUMB = u2Var;
        u2 u2Var2 = new u2("STARTTHUMB", 1);
        STARTTHUMB = u2Var2;
        u2 u2Var3 = new u2("TRACK", 2);
        TRACK = u2Var3;
        $VALUES = new u2[]{u2Var, u2Var2, u2Var3};
    }

    public u2() {
        throw null;
    }

    public static u2 valueOf(String str) {
        return (u2) Enum.valueOf(u2.class, str);
    }

    public static u2[] values() {
        return (u2[]) $VALUES.clone();
    }
}
