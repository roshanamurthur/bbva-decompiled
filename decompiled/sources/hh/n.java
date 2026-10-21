package hh;

/* JADX INFO: compiled from: DecodedInformation.java */
/* JADX INFO: loaded from: classes10.dex */
public final class n extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f69452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f69453d;

    public n(int i10, String str) {
        super(i10);
        this.f69451b = str;
        this.f69453d = false;
        this.f69452c = 0;
    }

    public n(int i10, String str, int i11) {
        super(i10);
        this.f69453d = true;
        this.f69452c = i11;
        this.f69451b = str;
    }
}
