package com.google.crypto.tink.aead.internal;

import com.google.crypto.tink.subtle.Bytes;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class Poly1305 {
    public static final int MAC_KEY_SIZE_IN_BYTES = 32;
    public static final int MAC_TAG_SIZE_IN_BYTES = 16;

    public static long a(int i10, byte[] bArr) {
        return ((long) (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16))) & 4294967295L;
    }

    public static void b(long j10, byte[] bArr, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) (255 & j10);
            i11++;
            j10 >>= 8;
        }
    }

    public static byte[] computeMac(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        byte b10 = 0;
        long jA = a(0, bArr) & 67108863;
        long jA2 = (a(3, bArr) >> 2) & 67108611;
        long jA3 = (a(6, bArr) >> 4) & 67092735;
        long jA4 = (a(9, bArr) >> 6) & 66076671;
        long jA5 = (a(12, bArr) >> 8) & 1048575;
        long j10 = jA2 * 5;
        long j11 = jA3 * 5;
        long j12 = jA4 * 5;
        long j13 = jA5 * 5;
        int i10 = 17;
        byte[] bArr3 = new byte[17];
        long j14 = 0;
        int i11 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        while (i11 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i11);
            System.arraycopy(bArr2, i11, bArr3, b10, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i10, b10);
            }
            long jA6 = j18 + (a(b10, bArr3) & 67108863);
            long jA7 = j14 + ((a(3, bArr3) >> 2) & 67108863);
            long jA8 = j15 + ((a(6, bArr3) >> 4) & 67108863);
            long jA9 = j16 + ((a(9, bArr3) >> 6) & 67108863);
            long jA10 = j17 + (((a(12, bArr3) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j19 = (jA10 * j10) + (jA9 * j11) + (jA8 * j12) + (jA7 * j13) + (jA6 * jA);
            long j20 = (jA10 * j11) + (jA9 * j12) + (jA8 * j13) + (jA7 * jA) + (jA6 * jA2);
            long j21 = (jA10 * j12) + (jA9 * j13) + (jA8 * jA) + (jA7 * jA2) + (jA6 * jA3);
            long j22 = (jA10 * j13) + (jA9 * jA) + (jA8 * jA2) + (jA7 * jA3) + (jA6 * jA4);
            long j23 = jA9 * jA2;
            long j24 = jA10 * jA;
            long j25 = j20 + (j19 >> 26);
            long j26 = j21 + (j25 >> 26);
            long j27 = j22 + (j26 >> 26);
            long j28 = j24 + j23 + (jA8 * jA3) + (jA7 * jA4) + (jA6 * jA5) + (j27 >> 26);
            long j29 = j28 >> 26;
            j17 = j28 & 67108863;
            long j30 = (j29 * 5) + (j19 & 67108863);
            i11 += 16;
            j15 = j26 & 67108863;
            j16 = j27 & 67108863;
            j18 = j30 & 67108863;
            j14 = (j25 & 67108863) + (j30 >> 26);
            b10 = 0;
            i10 = 17;
        }
        long j31 = j15 + (j14 >> 26);
        long j32 = j31 & 67108863;
        long j33 = j16 + (j31 >> 26);
        long j34 = j33 & 67108863;
        long j35 = j17 + (j33 >> 26);
        long j36 = j35 & 67108863;
        long j37 = ((j35 >> 26) * 5) + j18;
        long j38 = j37 >> 26;
        long j39 = j37 & 67108863;
        long j40 = (j14 & 67108863) + j38;
        long j41 = j39 + 5;
        long j42 = j41 & 67108863;
        long j43 = j40 + (j41 >> 26);
        long j44 = j32 + (j43 >> 26);
        long j45 = j34 + (j44 >> 26);
        long j46 = (j36 + (j45 >> 26)) - SvgConstantsKt.SPECIFIED_STOP_COLOR;
        long j47 = j46 >> 63;
        long j48 = ~j47;
        long j49 = (j40 & j47) | (j43 & 67108863 & j48);
        long j50 = (j32 & j47) | (j44 & 67108863 & j48);
        long j51 = (j45 & 67108863 & j48) | (j34 & j47);
        long j52 = ((j39 & j47) | (j42 & j48) | (j49 << 26)) & 4294967295L;
        long j53 = ((j49 >> 6) | (j50 << 20)) & 4294967295L;
        long j54 = ((j50 >> 12) | (j51 << 14)) & 4294967295L;
        long j55 = ((j51 >> 18) | (((j46 & j48) | (j36 & j47)) << 8)) & 4294967295L;
        long jA11 = a(16, bArr) + j52;
        long j56 = jA11 & 4294967295L;
        long jA12 = a(20, bArr) + j53 + (jA11 >> 32);
        long jA13 = a(24, bArr) + j54 + (jA12 >> 32);
        long jA14 = (a(28, bArr) + j55 + (jA13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        b(j56, bArr4, 0);
        b(jA12 & 4294967295L, bArr4, 4);
        b(jA13 & 4294967295L, bArr4, 8);
        b(jA14, bArr4, 12);
        return bArr4;
    }

    public static void verifyMac(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!Bytes.equal(computeMac(bArr, bArr2), bArr3)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
