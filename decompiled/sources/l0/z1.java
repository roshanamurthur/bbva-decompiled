package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class z1 {
    private static final /* synthetic */ z1[] $VALUES;
    public static final z1 InnerCircle;
    public static final z1 Selector;

    static {
        z1 z1Var = new z1("Selector", 0);
        Selector = z1Var;
        z1 z1Var2 = new z1("InnerCircle", 1);
        InnerCircle = z1Var2;
        $VALUES = new z1[]{z1Var, z1Var2};
    }

    public z1() {
        throw null;
    }

    public static z1 valueOf(String str) {
        return (z1) Enum.valueOf(z1.class, str);
    }

    public static z1[] values() {
        return (z1[]) $VALUES.clone();
    }
}
