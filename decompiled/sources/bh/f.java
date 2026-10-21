package bh;

import com.google.zxing.datamatrix.encoder.HighLevelEncoder;
import tc.g;

/* JADX INFO: compiled from: X12Encoder.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f extends g {
    @Override // tc.g, bh.c
    public final void a(d dVar) {
        StringBuilder sb2 = new StringBuilder();
        while (dVar.b()) {
            char cA = dVar.a();
            dVar.f25221f++;
            b(sb2, cA);
            if (sb2.length() % 3 == 0) {
                g.e(dVar, sb2);
                if (HighLevelEncoder.f(dVar.f25216a, dVar.f25221f, 3) != 3) {
                    dVar.f25222g = 0;
                    break;
                }
            }
        }
        d(dVar, sb2);
    }

    @Override // tc.g
    public final int b(StringBuilder sb2, char c10) {
        if (c10 == '\r') {
            sb2.append((char) 0);
        } else if (c10 == ' ') {
            sb2.append((char) 3);
        } else if (c10 == '*') {
            sb2.append((char) 1);
        } else if (c10 == '>') {
            sb2.append((char) 2);
        } else if (c10 >= '0' && c10 <= '9') {
            sb2.append((char) (c10 - ','));
        } else {
            if (c10 < 'A' || c10 > 'Z') {
                HighLevelEncoder.b(c10);
                throw null;
            }
            sb2.append((char) (c10 - '3'));
        }
        return 1;
    }

    @Override // tc.g
    public final int c() {
        return 3;
    }

    @Override // tc.g
    public final void d(d dVar, StringBuilder sb2) {
        StringBuilder sb3 = dVar.f25220e;
        dVar.c(sb3.length());
        int dataCapacity = dVar.f25223h.getDataCapacity() - sb3.length();
        dVar.f25221f -= sb2.length();
        String str = dVar.f25216a;
        if ((str.length() - dVar.f25224i) - dVar.f25221f > 1 || dataCapacity > 1 || (str.length() - dVar.f25224i) - dVar.f25221f != dataCapacity) {
            dVar.d((char) 254);
        }
        if (dVar.f25222g < 0) {
            dVar.f25222g = 0;
        }
    }
}
