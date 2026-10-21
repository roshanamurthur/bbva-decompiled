package g1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: LayoutModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final j Max;
    public static final j Min;

    static {
        j jVar = new j("Min", 0);
        Min = jVar;
        j jVar2 = new j("Max", 1);
        Max = jVar2;
        $VALUES = new j[]{jVar, jVar2};
    }

    public j() {
        throw null;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
