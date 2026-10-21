package androidx.recyclerview.widget;

/* JADX INFO: compiled from: MessageThreadUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static r f23068i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f23069j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f23070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f23077h;

    public static r a(int i10, int i11, int i12, int i13, int i14, int i15, Object obj) {
        r rVar;
        synchronized (f23069j) {
            try {
                rVar = f23068i;
                if (rVar == null) {
                    rVar = new r();
                } else {
                    f23068i = rVar.f23070a;
                    rVar.f23070a = null;
                }
                rVar.f23071b = i10;
                rVar.f23072c = i11;
                rVar.f23073d = i12;
                rVar.f23074e = i13;
                rVar.f23075f = i14;
                rVar.f23076g = i15;
                rVar.f23077h = obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVar;
    }

    public final void b() {
        this.f23070a = null;
        this.f23076g = 0;
        this.f23075f = 0;
        this.f23074e = 0;
        this.f23073d = 0;
        this.f23072c = 0;
        this.f23071b = 0;
        this.f23077h = null;
        synchronized (f23069j) {
            try {
                r rVar = f23068i;
                if (rVar != null) {
                    this.f23070a = rVar;
                }
                f23068i = this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
