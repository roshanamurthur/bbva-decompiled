package hh;

import com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder;

/* JADX INFO: compiled from: AI01decoder.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class h extends AbstractExpandedDecoder {
    public final void a(int i10, StringBuilder sb2) {
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append('9');
        b(sb2, i10, length);
    }

    public final void b(StringBuilder sb2, int i10, int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            int iC = r.c((i12 * 10) + i10, 10, getGeneralDecoder().f69462a);
            if (iC / 100 == 0) {
                sb2.append('0');
            }
            if (iC / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(iC);
        }
        int i13 = 0;
        for (int i14 = 0; i14 < 13; i14++) {
            int iCharAt = sb2.charAt(i14 + i11) - '0';
            if ((i14 & 1) == 0) {
                iCharAt *= 3;
            }
            i13 += iCharAt;
        }
        int i15 = 10 - (i13 % 10);
        sb2.append(i15 != 10 ? i15 : 0);
    }
}
