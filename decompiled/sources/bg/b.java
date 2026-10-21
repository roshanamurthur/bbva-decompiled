package bg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: SettingsCacheBehavior.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b IGNORE_CACHE_EXPIRATION;
    public static final b SKIP_CACHE_LOOKUP;
    public static final b USE_CACHE;

    static {
        b bVar = new b("USE_CACHE", 0);
        USE_CACHE = bVar;
        b bVar2 = new b("SKIP_CACHE_LOOKUP", 1);
        SKIP_CACHE_LOOKUP = bVar2;
        b bVar3 = new b("IGNORE_CACHE_EXPIRATION", 2);
        IGNORE_CACHE_EXPIRATION = bVar3;
        $VALUES = new b[]{bVar, bVar2, bVar3};
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
