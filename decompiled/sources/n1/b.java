package n1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Savers.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b Paragraph;
    public static final b Span;
    public static final b String;
    public static final b Url;
    public static final b VerbatimTts;

    static {
        b bVar = new b("Paragraph", 0);
        Paragraph = bVar;
        b bVar2 = new b("Span", 1);
        Span = bVar2;
        b bVar3 = new b("VerbatimTts", 2);
        VerbatimTts = bVar3;
        b bVar4 = new b("Url", 3);
        Url = bVar4;
        b bVar5 = new b("String", 4);
        String = bVar5;
        $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
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
