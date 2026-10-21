package hh;

/* JADX INFO: compiled from: CurrentParsingState.java */
/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f69448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f69449b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: CurrentParsingState.java */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a ALPHA;
        public static final a ISO_IEC_646;
        public static final a NUMERIC;

        static {
            a aVar = new a("NUMERIC", 0);
            NUMERIC = aVar;
            a aVar2 = new a("ALPHA", 1);
            ALPHA = aVar2;
            a aVar3 = new a("ISO_IEC_646", 2);
            ISO_IEC_646 = aVar3;
            $VALUES = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }
}
