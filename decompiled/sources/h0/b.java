package h0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: BackdropScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b Back;
    public static final b Front;

    static {
        b bVar = new b("Back", 0);
        Back = bVar;
        b bVar2 = new b("Front", 1);
        Front = bVar2;
        $VALUES = new b[]{bVar, bVar2};
    }

    public b() {
        throw null;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
