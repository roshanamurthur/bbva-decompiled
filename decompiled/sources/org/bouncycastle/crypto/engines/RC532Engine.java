package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.RC5Parameters;

/* JADX INFO: loaded from: classes3.dex */
public class RC532Engine implements BlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88525a = 12;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f88526b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88527c;

    public static int a(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int b(int i10, int i11) {
        int i12 = i11 & 31;
        return (i10 >>> (32 - i12)) | (i10 << i12);
    }

    public static void d(int i10, int i11, byte[] bArr) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >> 8);
        bArr[i11 + 2] = (byte) (i10 >> 16);
        bArr[i11 + 3] = (byte) (i10 >> 24);
    }

    public final void c(byte[] bArr) {
        int[] iArr;
        int length = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 != bArr.length; i10++) {
            int i11 = i10 / 4;
            iArr2[i11] = iArr2[i11] + ((bArr[i10] & 255) << ((i10 % 4) * 8));
        }
        int[] iArr3 = new int[(this.f88525a + 1) * 2];
        this.f88526b = iArr3;
        iArr3[0] = -1209970333;
        int i12 = 1;
        while (true) {
            iArr = this.f88526b;
            if (i12 >= iArr.length) {
                break;
            }
            iArr[i12] = iArr[i12 - 1] - 1640531527;
            i12++;
        }
        int length2 = length > iArr.length ? length * 3 : iArr.length * 3;
        int length3 = 0;
        int iB = 0;
        int iB2 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < length2; i14++) {
            int[] iArr4 = this.f88526b;
            iB = b(iArr4[length3] + iB + iB2, 3);
            iArr4[length3] = iB;
            iB2 = b(iArr2[i13] + iB + iB2, iB2 + iB);
            iArr2[i13] = iB2;
            length3 = (length3 + 1) % this.f88526b.length;
            i13 = (i13 + 1) % length;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC5-32";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (cipherParameters instanceof RC5Parameters) {
            RC5Parameters rC5Parameters = (RC5Parameters) cipherParameters;
            this.f88525a = rC5Parameters.getRounds();
            c(rC5Parameters.getKey());
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "invalid parameter passed to RC532 init - "));
            }
            c(((KeyParameter) cipherParameters).getKey());
        }
        this.f88527c = z10;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.f88527c) {
            int iA = a(i10, bArr) + this.f88526b[0];
            int iA2 = a(i10 + 4, bArr) + this.f88526b[1];
            for (int i12 = 1; i12 <= this.f88525a; i12++) {
                int i13 = i12 * 2;
                iA = b(iA ^ iA2, iA2) + this.f88526b[i13];
                iA2 = b(iA2 ^ iA, iA) + this.f88526b[i13 + 1];
            }
            d(iA, i11, bArr2);
            d(iA2, i11 + 4, bArr2);
            return 8;
        }
        int iA3 = a(i10, bArr);
        int iA4 = a(i10 + 4, bArr);
        for (int i14 = this.f88525a; i14 >= 1; i14--) {
            int[] iArr = this.f88526b;
            int i15 = i14 * 2;
            int i16 = iA4 - iArr[i15 + 1];
            int i17 = iA3 & 31;
            iA4 = ((i16 << (32 - i17)) | (i16 >>> i17)) ^ iA3;
            int i18 = iA3 - iArr[i15];
            int i19 = iA4 & 31;
            iA3 = ((i18 << (32 - i19)) | (i18 >>> i19)) ^ iA4;
        }
        d(iA3 - this.f88526b[0], i11, bArr2);
        d(iA4 - this.f88526b[1], i11 + 4, bArr2);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
