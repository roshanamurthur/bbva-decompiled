package ad;

/* JADX INFO: compiled from: IntegerParser.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f218b;

    public b(long j10, int i10) {
        this.f218b = j10;
        this.f217a = i10;
    }

    public static b a(String str, int i10, int i11) {
        if (i10 >= i11) {
            return null;
        }
        long j10 = 0;
        int i12 = i10;
        while (i12 < i11) {
            char cCharAt = str.charAt(i12);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j10 = (j10 * 10) + ((long) (cCharAt - '0'));
            if (j10 > 2147483647L) {
                return null;
            }
            i12++;
        }
        if (i12 == i10) {
            return null;
        }
        return new b(j10, i12);
    }
}
