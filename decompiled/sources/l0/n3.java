package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    private static final /* synthetic */ n3[] $VALUES;
    public static final n3 THUMB;
    public static final n3 TRACK;

    static {
        n3 n3Var = new n3("THUMB", 0);
        THUMB = n3Var;
        n3 n3Var2 = new n3("TRACK", 1);
        TRACK = n3Var2;
        $VALUES = new n3[]{n3Var, n3Var2};
    }

    public n3() {
        throw null;
    }

    public static n3 valueOf(String str) {
        return (n3) Enum.valueOf(n3.class, str);
    }

    public static n3[] values() {
        return (n3[]) $VALUES.clone();
    }
}
