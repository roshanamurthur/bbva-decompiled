package ih;

import com.google.zxing.ResultPoint;
import java.util.Formatter;

/* JADX INFO: compiled from: DetectionResult.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f69704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g[] f69705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f69706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f69707d;

    public f(a aVar, c cVar) {
        this.f69704a = aVar;
        int i10 = aVar.f69680a;
        this.f69707d = i10;
        this.f69706c = cVar;
        this.f69705b = new g[i10 + 2];
    }

    public final void a(g gVar) {
        if (gVar != null) {
            h hVar = (h) gVar;
            d[] dVarArr = hVar.f69709b;
            for (d dVar : dVarArr) {
                if (dVar != null) {
                    dVar.b();
                }
            }
            a aVar = this.f69704a;
            hVar.d(dVarArr, aVar);
            c cVar = hVar.f69708a;
            boolean z10 = hVar.f69710c;
            ResultPoint resultPoint = z10 ? cVar.f69687b : cVar.f69689d;
            ResultPoint resultPoint2 = z10 ? cVar.f69688c : cVar.f69690e;
            int iB = hVar.b((int) resultPoint.getY());
            int iB2 = hVar.b((int) resultPoint2.getY());
            int i10 = -1;
            int i11 = 0;
            int iMax = 1;
            while (iB < iB2) {
                d dVar2 = dVarArr[iB];
                if (dVar2 != null) {
                    int i12 = dVar2.f69699e;
                    int i13 = i12 - i10;
                    if (i13 == 0) {
                        i11++;
                    } else {
                        if (i13 == 1) {
                            iMax = Math.max(iMax, i11);
                            i10 = dVar2.f69699e;
                        } else if (i13 < 0 || i12 >= aVar.f69684e || i13 > iB) {
                            dVarArr[iB] = null;
                        } else {
                            if (iMax > 2) {
                                i13 *= iMax - 2;
                            }
                            boolean z11 = i13 >= iB;
                            for (int i14 = 1; i14 <= i13 && !z11; i14++) {
                                z11 = dVarArr[iB - i14] != null;
                            }
                            if (z11) {
                                dVarArr[iB] = null;
                            } else {
                                i10 = dVar2.f69699e;
                            }
                        }
                        i11 = 1;
                    }
                }
                iB++;
            }
        }
    }

    public final String toString() {
        g[] gVarArr = this.f69705b;
        g gVar = gVarArr[0];
        int i10 = this.f69707d;
        if (gVar == null) {
            gVar = gVarArr[i10 + 1];
        }
        Formatter formatter = new Formatter();
        for (int i11 = 0; i11 < gVar.f69709b.length; i11++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i11));
                for (int i12 = 0; i12 < i10 + 2; i12++) {
                    g gVar2 = gVarArr[i12];
                    if (gVar2 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        d dVar = gVar2.f69709b[i11];
                        if (dVar == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(dVar.f69699e), Integer.valueOf(dVar.f69698d));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
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
        String string = formatter.toString();
        formatter.close();
        return string;
    }
}
