package androidx.recyclerview.widget;

/* JADX INFO: compiled from: MessageThreadUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f23066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23067b = new Object();

    public final r a() {
        synchronized (this.f23067b) {
            try {
                r rVar = this.f23066a;
                if (rVar == null) {
                    return null;
                }
                this.f23066a = rVar.f23070a;
                return rVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(int i10) {
        r rVar;
        synchronized (this.f23067b) {
            while (true) {
                try {
                    rVar = this.f23066a;
                    if (rVar == null || rVar.f23071b != i10) {
                        break;
                    }
                    this.f23066a = rVar.f23070a;
                    rVar.b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (rVar != null) {
                r rVar2 = rVar.f23070a;
                while (rVar2 != null) {
                    r rVar3 = rVar2.f23070a;
                    if (rVar2.f23071b == i10) {
                        rVar.f23070a = rVar3;
                        rVar2.b();
                    } else {
                        rVar = rVar2;
                    }
                    rVar2 = rVar3;
                }
            }
        }
    }

    public final void c(r rVar) {
        synchronized (this.f23067b) {
            try {
                r rVar2 = this.f23066a;
                if (rVar2 == null) {
                    this.f23066a = rVar;
                    return;
                }
                while (true) {
                    r rVar3 = rVar2.f23070a;
                    if (rVar3 == null) {
                        rVar2.f23070a = rVar;
                        return;
                    }
                    rVar2 = rVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
