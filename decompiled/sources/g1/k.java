package g1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: LayoutModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k Height;
    public static final k Width;

    static {
        k kVar = new k("Width", 0);
        Width = kVar;
        k kVar2 = new k("Height", 1);
        Height = kVar2;
        $VALUES = new k[]{kVar, kVar2};
    }

    public k() {
        throw null;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
