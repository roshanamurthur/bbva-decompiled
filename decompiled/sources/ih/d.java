package ih;

/* JADX INFO: compiled from: Codeword.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f69695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f69696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f69697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f69698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f69699e = -1;

    public d(int i10, int i11, int i12, int i13) {
        this.f69695a = i10;
        this.f69696b = i11;
        this.f69697c = i12;
        this.f69698d = i13;
    }

    public final boolean a(int i10) {
        if (i10 != -1) {
            return this.f69697c == (i10 % 3) * 3;
        }
        return false;
    }

    public final void b() {
        this.f69699e = (this.f69697c / 3) + ((this.f69698d / 30) * 3);
    }

    public final String toString() {
        return this.f69699e + "|" + this.f69698d;
    }
}
