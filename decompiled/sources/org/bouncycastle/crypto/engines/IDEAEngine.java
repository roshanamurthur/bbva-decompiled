package org.bouncycastle.crypto.engines;

import androidx.core.view.MotionEventCompat;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes3.dex */
public class IDEAEngine implements BlockCipher {
    protected static final int BLOCK_SIZE = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f88472a = null;

    public static int a(int i10) {
        return (0 - i10) & 65535;
    }

    public static int b(int i10, byte[] bArr) {
        return ((bArr[i10] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr[i10 + 1] & 255);
    }

    public static int[] c(byte[] bArr) {
        int i10;
        int[] iArr = new int[52];
        int i11 = 0;
        if (bArr.length < 16) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        while (true) {
            if (i11 >= 8) {
                break;
            }
            iArr[i11] = b(i11 * 2, bArr);
            i11++;
        }
        for (i10 = 8; i10 < 52; i10++) {
            int i12 = i10 & 7;
            if (i12 < 6) {
                iArr[i10] = (((iArr[i10 - 7] & 127) << 9) | (iArr[i10 - 6] >> 7)) & 65535;
            } else if (i12 == 6) {
                iArr[i10] = (((iArr[i10 - 7] & 127) << 9) | (iArr[i10 - 14] >> 7)) & 65535;
            } else {
                iArr[i10] = (((iArr[i10 - 15] & 127) << 9) | (iArr[i10 - 14] >> 7)) & 65535;
            }
        }
        return iArr;
    }

    public static int d(int i10, int i11) {
        int i12;
        if (i10 == 0) {
            i12 = 65537 - i11;
        } else if (i11 == 0) {
            i12 = 65537 - i10;
        } else {
            int i13 = i10 * i11;
            int i14 = i13 & 65535;
            int i15 = i13 >>> 16;
            i12 = (i14 - i15) + (i14 < i15 ? 1 : 0);
        }
        return i12 & 65535;
    }

    public static int e(int i10) {
        if (i10 < 2) {
            return i10;
        }
        int i11 = 65537 / i10;
        int i12 = 65537 % i10;
        int i13 = 1;
        while (i12 != 1) {
            int i14 = i10 / i12;
            i10 %= i12;
            i13 = ((i14 * i11) + i13) & 65535;
            if (i10 == 1) {
                return i13;
            }
            int i15 = i12 / i10;
            i12 %= i10;
            i11 = ((i15 * i13) + i11) & 65535;
        }
        return (1 - i11) & 65535;
    }

    public static void f(int i10, int i11, byte[] bArr) {
        bArr[i11] = (byte) (i10 >>> 8);
        bArr[i11 + 1] = (byte) i10;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "IDEA";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        int[] iArrC;
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "invalid parameter passed to IDEA init - "));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (z10) {
            iArrC = c(key);
        } else {
            int[] iArrC2 = c(key);
            int[] iArr = new int[52];
            int iE = e(iArrC2[0]);
            int iA = a(iArrC2[1]);
            int iA2 = a(iArrC2[2]);
            iArr[51] = e(iArrC2[3]);
            iArr[50] = iA2;
            iArr[49] = iA;
            int i10 = 48;
            iArr[48] = iE;
            int i11 = 4;
            for (int i12 = 1; i12 < 8; i12++) {
                int i13 = iArrC2[i11];
                iArr[i10 - 1] = iArrC2[i11 + 1];
                iArr[i10 - 2] = i13;
                int iE2 = e(iArrC2[i11 + 2]);
                int iA3 = a(iArrC2[i11 + 3]);
                int i14 = i11 + 5;
                int iA4 = a(iArrC2[i11 + 4]);
                i11 += 6;
                iArr[i10 - 3] = e(iArrC2[i14]);
                iArr[i10 - 4] = iA3;
                iArr[i10 - 5] = iA4;
                i10 -= 6;
                iArr[i10] = iE2;
            }
            int i15 = iArrC2[i11];
            iArr[i10 - 1] = iArrC2[i11 + 1];
            iArr[i10 - 2] = i15;
            int iE3 = e(iArrC2[i11 + 2]);
            int iA5 = a(iArrC2[i11 + 3]);
            int iA6 = a(iArrC2[i11 + 4]);
            iArr[i10 - 3] = e(iArrC2[i11 + 5]);
            iArr[i10 - 4] = iA6;
            iArr[i10 - 5] = iA5;
            iArr[i10 - 6] = iE3;
            iArrC = iArr;
        }
        this.f88472a = iArrC;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArr = this.f88472a;
        if (iArr == null) {
            throw new IllegalStateException("IDEA engine not initialised");
        }
        if (i10 + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int iB = b(i10, bArr);
        int iB2 = b(i10 + 2, bArr);
        int iB3 = b(i10 + 4, bArr);
        int iB4 = b(i10 + 6, bArr);
        int i12 = 0;
        int i13 = iB3;
        int i14 = iB2;
        int i15 = iB;
        int i16 = 0;
        while (i12 < 8) {
            int iD = d(i15, iArr[i16]);
            int i17 = (i14 + iArr[i16 + 1]) & 65535;
            int i18 = (i13 + iArr[i16 + 2]) & 65535;
            int iD2 = d(iB4, iArr[i16 + 3]);
            int i19 = i16 + 5;
            int iD3 = d(i18 ^ iD, iArr[i16 + 4]);
            i16 += 6;
            int iD4 = d(((i17 ^ iD2) + iD3) & 65535, iArr[i19]);
            int i20 = 65535 & (iD3 + iD4);
            i15 = iD ^ iD4;
            iB4 = iD2 ^ i20;
            int i21 = i18 ^ iD4;
            i12++;
            i13 = i17 ^ i20;
            i14 = i21;
        }
        f(d(i15, iArr[i16]), i11, bArr2);
        f(i13 + iArr[i16 + 1], i11 + 2, bArr2);
        f(i14 + iArr[i16 + 2], i11 + 4, bArr2);
        f(d(iB4, iArr[i16 + 3]), i11 + 6, bArr2);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
