package ih;

import java.util.Formatter;

/* JADX INFO: compiled from: DetectionResultColumn.java */
/* JADX INFO: loaded from: classes10.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f69708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d[] f69709b;

    public g(c cVar) {
        this.f69708a = new c(cVar);
        this.f69709b = new d[(cVar.f69694i - cVar.f69693h) + 1];
    }

    public final d a(int i10) {
        d dVar;
        d dVar2;
        int iB = b(i10);
        d[] dVarArr = this.f69709b;
        d dVar3 = dVarArr[iB];
        if (dVar3 != null) {
            return dVar3;
        }
        for (int i11 = 1; i11 < 5; i11++) {
            int iB2 = b(i10) - i11;
            if (iB2 >= 0 && (dVar2 = dVarArr[iB2]) != null) {
                return dVar2;
            }
            int iB3 = b(i10) + i11;
            if (iB3 < dVarArr.length && (dVar = dVarArr[iB3]) != null) {
                return dVar;
            }
        }
        return null;
    }

    public final int b(int i10) {
        return i10 - this.f69708a.f69693h;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        try {
            int i10 = 0;
            for (d dVar : this.f69709b) {
                if (dVar == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i10));
                    i10++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i10), Integer.valueOf(dVar.f69699e), Integer.valueOf(dVar.f69698d));
                    i10++;
                }
            }
            String string = formatter.toString();
            formatter.close();
            return string;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    formatter.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }
}
