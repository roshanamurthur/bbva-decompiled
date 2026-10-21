package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes3.dex */
public class RC6Engine implements BlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f88531a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f88532b;

    public static int a(int i10, byte[] bArr) {
        int i11 = 0;
        for (int i12 = 3; i12 >= 0; i12--) {
            i11 = (i11 << 8) + (bArr[i12 + i10] & 255);
        }
        return i11;
    }

    public static int b(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    public static void c(int i10, int i11, byte[] bArr) {
        for (int i12 = 0; i12 < 4; i12++) {
            bArr[i12 + i11] = (byte) i10;
            i10 >>>= 8;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC6";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        int[] iArr;
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "invalid parameter passed to RC6 init - "));
        }
        this.f88532b = z10;
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        int length = (key.length + 3) / 4;
        int length2 = (key.length + 3) / 4;
        int[] iArr2 = new int[length2];
        for (int length3 = key.length - 1; length3 >= 0; length3--) {
            int i10 = length3 / 4;
            iArr2[i10] = (iArr2[i10] << 8) + (key[length3] & 255);
        }
        int[] iArr3 = new int[44];
        this.f88531a = iArr3;
        iArr3[0] = -1209970333;
        int i11 = 1;
        while (true) {
            iArr = this.f88531a;
            if (i11 >= iArr.length) {
                break;
            }
            iArr[i11] = iArr[i11 - 1] - 1640531527;
            i11++;
        }
        int length4 = length2 > iArr.length ? length2 * 3 : iArr.length * 3;
        int length5 = 0;
        int iB = 0;
        int iB2 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length4; i13++) {
            int[] iArr4 = this.f88531a;
            iB = b(iArr4[length5] + iB + iB2, 3);
            iArr4[length5] = iB;
            iB2 = b(iArr2[i12] + iB + iB2, iB2 + iB);
            iArr2[i12] = iB2;
            length5 = (length5 + 1) % this.f88531a.length;
            i12 = (i12 + 1) % length2;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int blockSize = getBlockSize();
        if (this.f88531a == null) {
            throw new IllegalStateException("RC6 engine not initialised");
        }
        if (i10 + blockSize > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (blockSize + i11 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i12 = 5;
        int i13 = 20;
        if (this.f88532b) {
            int iA = a(i10, bArr);
            int iA2 = a(i10 + 4, bArr);
            int iA3 = a(i10 + 8, bArr);
            int iA4 = a(i10 + 12, bArr);
            int[] iArr = this.f88531a;
            int i14 = iA2 + iArr[0];
            int i15 = iA4 + iArr[1];
            int i16 = 1;
            while (i16 <= 20) {
                int iB = b(((i14 * 2) + 1) * i14, 5);
                int iB2 = b(((i15 * 2) + 1) * i15, 5);
                int i17 = i16 * 2;
                int iB3 = b(iA ^ iB, iB2) + this.f88531a[i17];
                int iB4 = b(iA3 ^ iB2, iB) + this.f88531a[i17 + 1];
                i16++;
                iA3 = i15;
                i15 = iB3;
                iA = i14;
                i14 = iB4;
            }
            int[] iArr2 = this.f88531a;
            int i18 = iA + iArr2[42];
            int i19 = iA3 + iArr2[43];
            c(i18, i11, bArr2);
            c(i14, i11 + 4, bArr2);
            c(i19, i11 + 8, bArr2);
            c(i15, i11 + 12, bArr2);
            return 16;
        }
        int iA5 = a(i10, bArr);
        int iA6 = a(i10 + 4, bArr);
        int iA7 = a(i10 + 8, bArr);
        int iA8 = a(i10 + 12, bArr);
        int[] iArr3 = this.f88531a;
        int i20 = iA7 - iArr3[43];
        int i21 = iA5 - iArr3[42];
        while (i13 >= 1) {
            int iB5 = b(((i21 * 2) + 1) * i21, i12);
            int iB6 = b(((i20 * 2) + 1) * i20, i12);
            int[] iArr4 = this.f88531a;
            int i22 = i13 * 2;
            int i23 = iA6 - iArr4[i22 + 1];
            int i24 = ((i23 << (-iB5)) | (i23 >>> iB5)) ^ iB6;
            int i25 = iA8 - iArr4[i22];
            i13--;
            iA6 = i21;
            i21 = ((i25 << (-iB6)) | (i25 >>> iB6)) ^ iB5;
            iA8 = i20;
            i20 = i24;
            i12 = 5;
        }
        int[] iArr5 = this.f88531a;
        int i26 = iA8 - iArr5[1];
        int i27 = iA6 - iArr5[0];
        c(i21, i11, bArr2);
        c(i27, i11 + 4, bArr2);
        c(i20, i11 + 8, bArr2);
        c(i26, i11 + 12, bArr2);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
