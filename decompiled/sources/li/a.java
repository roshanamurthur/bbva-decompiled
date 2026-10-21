package li;

import com.nimbusds.jose.util.StandardCharset;
import kotlin.io.encoding.Base64;

/* JADX INFO: compiled from: Base64Codec.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static byte a(int i10) {
        int iF = f(i10, 26);
        int iE = e(i10, 25) & f(i10, 52);
        return (byte) (g(e(i10, 51) & f(i10, 62), i10 - 4, 0) | g(iF, i10 + 65, 0) | g(iE, i10 + 71, 0) | g(d(i10, 62), 43, 0) | g(d(i10, 63), 47, 0));
    }

    public static byte b(int i10) {
        int iF = f(i10, 26);
        int iE = e(i10, 25) & f(i10, 52);
        return (byte) (g(e(i10, 51) & f(i10, 62), i10 - 4, 0) | g(iF, i10 + 65, 0) | g(iE, i10 + 71, 0) | g(d(i10, 62), 45, 0) | g(d(i10, 63), 95, 0));
    }

    public static String c(boolean z10, byte[] bArr) {
        int iA;
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            return "";
        }
        int i10 = length / 3;
        int i11 = i10 * 3;
        if (length == 0) {
            iA = 0;
        } else if (z10) {
            iA = i10 << 2;
            int i12 = length % 3;
            if (i12 != 0) {
                iA = iA + i12 + 1;
            }
        } else {
            iA = androidx.appcompat.widget.a.a(length, 1, 3, 1) << 2;
        }
        byte[] bArr2 = new byte[iA];
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            int i15 = i13 + 2;
            int i16 = ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13] & 255) << 16);
            i13 += 3;
            int i17 = i16 | (bArr[i15] & 255);
            if (z10) {
                bArr2[i14] = b((i17 >>> 18) & 63);
                bArr2[i14 + 1] = b((i17 >>> 12) & 63);
                int i18 = i14 + 3;
                bArr2[i14 + 2] = b((i17 >>> 6) & 63);
                i14 += 4;
                bArr2[i18] = b(i17 & 63);
            } else {
                bArr2[i14] = a((i17 >>> 18) & 63);
                bArr2[i14 + 1] = a((i17 >>> 12) & 63);
                int i19 = i14 + 3;
                bArr2[i14 + 2] = a((i17 >>> 6) & 63);
                i14 += 4;
                bArr2[i19] = a(i17 & 63);
            }
        }
        int i20 = length - i11;
        if (i20 > 0) {
            int i21 = ((bArr[i11] & 255) << 10) | (i20 == 2 ? (bArr[length - 1] & 255) << 2 : 0);
            if (!z10) {
                bArr2[iA - 4] = a(i21 >> 12);
                bArr2[iA - 3] = a((i21 >>> 6) & 63);
                bArr2[iA - 2] = i20 == 2 ? a(i21 & 63) : (byte) 61;
                bArr2[iA - 1] = Base64.padSymbol;
            } else if (i20 == 2) {
                bArr2[iA - 3] = b(i21 >> 12);
                bArr2[iA - 2] = b((i21 >>> 6) & 63);
                bArr2[iA - 1] = b(i21 & 63);
            } else {
                bArr2[iA - 2] = b(i21 >> 12);
                bArr2[iA - 1] = b((i21 >>> 6) & 63);
            }
        }
        return new String(bArr2, StandardCharset.UTF_8);
    }

    public static int d(int i10, int i11) {
        int i12 = i10 ^ i11;
        return ((~i12) & (i12 - 1)) >>> 63;
    }

    public static int e(int i10, int i11) {
        return (int) ((((long) i11) - ((long) i10)) >>> 63);
    }

    public static int f(int i10, int i11) {
        return (int) ((((long) i10) - ((long) i11)) >>> 63);
    }

    public static int g(int i10, int i11, int i12) {
        return ((i10 - 1) & (i12 ^ i11)) ^ i11;
    }
}
