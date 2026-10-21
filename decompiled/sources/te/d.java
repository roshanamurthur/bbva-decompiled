package te;

import android.R;
import io.card.payment.CardType;
import java.util.Collections;
import java.util.List;
import kotlin.UShort;
import org.bouncycastle.crypto.engines.ChaChaEngine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;
import org.junit.internal.management.RuntimeMXBean;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements RuntimeMXBean {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f93546a;

    public static void a(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i10 = 0; i10 < 1024; i10++) {
            sArr3[i10] = b4.f.b((short) (sArr[i10] + sArr2[i10]));
        }
    }

    public static String b(String str, boolean z10, CardType cardType) {
        String strE = z10 ? bn.a.e(str) : str;
        if (cardType == null) {
            cardType = CardType.fromCardNumber(strE);
        }
        int iNumberLength = cardType.numberLength();
        if (strE.length() != iNumberLength) {
            return str;
        }
        int i10 = 0;
        if (iNumberLength == 16) {
            StringBuilder sb2 = new StringBuilder();
            while (i10 < 16) {
                if (i10 != 0 && i10 % 4 == 0) {
                    sb2.append(' ');
                }
                sb2.append(strE.charAt(i10));
                i10++;
            }
            return sb2.toString();
        }
        if (iNumberLength != 15) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        while (i10 < 15) {
            if (i10 == 4 || i10 == 10) {
                sb3.append(' ');
            }
            sb3.append(strE.charAt(i10));
            i10++;
        }
        return sb3.toString();
    }

    public static void c(byte[] bArr, short[] sArr) {
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = i10 * 7;
            int i12 = bArr[i11] & 255;
            byte b10 = bArr[i11 + 1];
            int i13 = bArr[i11 + 2] & 255;
            byte b11 = bArr[i11 + 3];
            int i14 = bArr[i11 + 4] & 255;
            byte b12 = bArr[i11 + 5];
            int i15 = bArr[i11 + 6] & 255;
            int i16 = i10 * 4;
            sArr[i16] = (short) (i12 | ((b10 & 63) << 8));
            sArr[i16 + 1] = (short) (((b10 & 255) >>> 6) | (i13 << 2) | ((b11 & 15) << 10));
            sArr[i16 + 2] = (short) (((b11 & 255) >>> 4) | (i14 << 4) | ((b12 & 3) << 12));
            sArr[i16 + 3] = (short) ((i15 << 6) | ((b12 & 255) >>> 2));
        }
    }

    public static void d(short[] sArr) {
        for (int i10 = 0; i10 < 1024; i10++) {
            short s4 = org.bouncycastle.pqc.crypto.newhope.a.f91200a[i10];
            if (i10 < s4) {
                short s7 = sArr[i10];
                sArr[i10] = sArr[s4];
                sArr[s4] = s7;
            }
        }
        org.bouncycastle.pqc.crypto.newhope.a.a(sArr, org.bouncycastle.pqc.crypto.newhope.b.f91202b);
        short[] sArr2 = org.bouncycastle.pqc.crypto.newhope.b.f91204d;
        for (int i11 = 0; i11 < 1024; i11++) {
            sArr[i11] = b4.f.c((sArr[i11] & UShort.MAX_VALUE) * (65535 & sArr2[i11]));
        }
    }

    public static void e(short[] sArr, byte[] bArr, byte b10) {
        byte[] bArr2 = new byte[8];
        bArr2[0] = b10;
        byte[] bArr3 = new byte[4096];
        ChaChaEngine chaChaEngine = new ChaChaEngine(20);
        chaChaEngine.init(true, new ParametersWithIV(new KeyParameter(bArr), bArr2));
        chaChaEngine.processBytes(bArr3, 0, 4096, bArr3, 0);
        for (int i10 = 0; i10 < 1024; i10++) {
            int iBigEndianToInt = Pack.bigEndianToInt(bArr3, i10 * 4);
            int i11 = 0;
            for (int i12 = 0; i12 < 8; i12++) {
                i11 += (iBigEndianToInt >> i12) & R.attr.cacheColorHint;
            }
            sArr[i10] = (short) (((((i11 >>> 24) + i11) & 255) + 12289) - (((i11 >>> 16) + (i11 >>> 8)) & 255));
        }
    }

    public static short f(short s4) {
        short sB = b4.f.b(s4);
        int i10 = sB - 12289;
        return (short) (((sB ^ i10) & (i10 >> 31)) ^ i10);
    }

    public static void g(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i10 = 0; i10 < 1024; i10++) {
            sArr3[i10] = b4.f.c((sArr[i10] & UShort.MAX_VALUE) * (65535 & b4.f.c((sArr2[i10] & UShort.MAX_VALUE) * 3186)));
        }
    }

    public static void h(byte[] bArr, short[] sArr) {
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = i10 * 4;
            short sF = f(sArr[i11]);
            short sF2 = f(sArr[i11 + 1]);
            short sF3 = f(sArr[i11 + 2]);
            short sF4 = f(sArr[i11 + 3]);
            int i12 = i10 * 7;
            bArr[i12] = (byte) sF;
            bArr[i12 + 1] = (byte) ((sF >> 8) | (sF2 << 6));
            bArr[i12 + 2] = (byte) (sF2 >> 2);
            bArr[i12 + 3] = (byte) ((sF2 >> 10) | (sF3 << 4));
            bArr[i12 + 4] = (byte) (sF3 >> 4);
            bArr[i12 + 5] = (byte) ((sF3 >> 12) | (sF4 << 2));
            bArr[i12 + 6] = (byte) (sF4 >> 6);
        }
    }

    @Override // org.junit.internal.management.RuntimeMXBean
    public List getInputArguments() {
        return Collections.emptyList();
    }
}
