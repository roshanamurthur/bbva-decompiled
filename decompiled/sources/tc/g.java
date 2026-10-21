package tc;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;

/* JADX INFO: compiled from: EngineKeyFactory.java */
/* JADX INFO: loaded from: classes9.dex */
public class g implements bh.c {
    public static void e(bh.d dVar, StringBuilder sb2) {
        char cCharAt = sb2.charAt(0);
        int iCharAt = (sb2.charAt(1) * RootService.OPEN_BRACKET) + (cCharAt * 1600) + sb2.charAt(2) + 1;
        dVar.f25220e.append(new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)}));
        sb2.delete(0, 3);
    }

    @Override // bh.c
    public void a(bh.d dVar) {
        StringBuilder sb2 = new StringBuilder();
        while (dVar.b()) {
            char cA = dVar.a();
            dVar.f25221f++;
            int iB = b(sb2, cA);
            int length = dVar.f25220e.length() + ((sb2.length() / 3) << 1);
            dVar.c(length);
            int dataCapacity = dVar.f25223h.getDataCapacity() - length;
            if (!dVar.b()) {
                StringBuilder sb3 = new StringBuilder();
                if (sb2.length() % 3 == 2 && (dataCapacity < 2 || dataCapacity > 2)) {
                    int length2 = sb2.length();
                    sb2.delete(length2 - iB, length2);
                    dVar.f25221f--;
                    iB = b(sb3, dVar.a());
                    dVar.f25223h = null;
                }
                while (sb2.length() % 3 == 1 && ((iB <= 3 && dataCapacity != 1) || iB > 3)) {
                    int length3 = sb2.length();
                    sb2.delete(length3 - iB, length3);
                    dVar.f25221f--;
                    iB = b(sb3, dVar.a());
                    dVar.f25223h = null;
                }
                break;
            }
            if (sb2.length() % 3 == 0) {
                if (HighLevelEncoder.f(dVar.f25216a, dVar.f25221f, c()) != c()) {
                    dVar.f25222g = 0;
                    break;
                }
            }
        }
        d(dVar, sb2);
    }

    public int b(StringBuilder sb2, char c10) {
        if (c10 == ' ') {
            sb2.append((char) 3);
            return 1;
        }
        if (c10 >= '0' && c10 <= '9') {
            sb2.append((char) (c10 - ','));
            return 1;
        }
        if (c10 >= 'A' && c10 <= 'Z') {
            sb2.append((char) (c10 - '3'));
            return 1;
        }
        if (c10 < ' ') {
            sb2.append((char) 0);
            sb2.append(c10);
            return 2;
        }
        if (c10 >= '!' && c10 <= '/') {
            sb2.append((char) 1);
            sb2.append((char) (c10 - '!'));
            return 2;
        }
        if (c10 >= ':' && c10 <= '@') {
            sb2.append((char) 1);
            sb2.append((char) (c10 - '+'));
            return 2;
        }
        if (c10 >= '[' && c10 <= '_') {
            sb2.append((char) 1);
            sb2.append((char) (c10 - 'E'));
            return 2;
        }
        if (c10 < '`' || c10 > 127) {
            sb2.append("\u0001\u001e");
            return b(sb2, (char) (c10 - 128)) + 2;
        }
        sb2.append((char) 2);
        sb2.append((char) (c10 - '`'));
        return 2;
    }

    public int c() {
        return 1;
    }

    public void d(bh.d dVar, StringBuilder sb2) {
        int length = (sb2.length() / 3) << 1;
        int length2 = sb2.length() % 3;
        int length3 = dVar.f25220e.length() + length;
        dVar.c(length3);
        int dataCapacity = dVar.f25223h.getDataCapacity() - length3;
        if (length2 == 2) {
            sb2.append((char) 0);
            while (sb2.length() >= 3) {
                e(dVar, sb2);
            }
            if (dVar.b()) {
                dVar.d((char) 254);
            }
        } else if (dataCapacity == 1 && length2 == 1) {
            while (sb2.length() >= 3) {
                e(dVar, sb2);
            }
            if (dVar.b()) {
                dVar.d((char) 254);
            }
            dVar.f25221f--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb2.length() >= 3) {
                e(dVar, sb2);
            }
            if (dataCapacity > 0 || dVar.b()) {
                dVar.d((char) 254);
            }
        }
        dVar.f25222g = 0;
    }
}
