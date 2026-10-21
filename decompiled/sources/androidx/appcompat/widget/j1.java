package androidx.appcompat.widget;

/* JADX INFO: compiled from: RtlSpacingHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1629h;

    public final void a(int i10, int i11) {
        this.f1624c = i10;
        this.f1625d = i11;
        this.f1629h = true;
        if (this.f1628g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1622a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1623b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1622a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1623b = i11;
        }
    }
}
