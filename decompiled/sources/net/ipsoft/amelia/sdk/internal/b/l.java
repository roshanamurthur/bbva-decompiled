package net.ipsoft.amelia.sdk.internal.b;

/* JADX INFO: loaded from: classes12.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f84734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Throwable f84737d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a backendError;
        public static final a badRequestError;
        public static final a networkError;

        static {
            a aVar = new a("badRequestError", 0);
            badRequestError = aVar;
            a aVar2 = new a("networkError", 1);
            networkError = aVar2;
            a aVar3 = new a("backendError", 2);
            backendError = aVar3;
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

    public l(a aVar, int i10, String str, Throwable th2) {
        this.f84734a = aVar;
        this.f84735b = i10;
        this.f84736c = str;
        this.f84737d = th2;
    }

    public String toString() {
        return "httpCode " + this.f84735b + " message '" + this.f84736c + "' cause '" + this.f84737d + "'";
    }
}
