package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes3.dex */
public class XTEAEngine implements BlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f88643a = new int[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f88644b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f88645c = new int[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f88646d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f88647e;

    public static int a(int i10, byte[] bArr) {
        int i11 = ((bArr[i10 + 1] & 255) << 16) | (bArr[i10] << 24);
        return (bArr[i10 + 3] & 255) | i11 | ((bArr[i10 + 2] & 255) << 8);
    }

    public static void b(int i10, int i11, byte[] bArr) {
        bArr[i11] = (byte) (i10 >>> 24);
        bArr[i11 + 1] = (byte) (i10 >>> 16);
        bArr[i11 + 2] = (byte) (i10 >>> 8);
        bArr[i11 + 3] = (byte) i10;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "XTEA";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        int[] iArr;
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "invalid parameter passed to TEA init - "));
        }
        this.f88647e = z10;
        this.f88646d = true;
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("Key size must be 128 bits.");
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            iArr = this.f88643a;
            if (i10 >= 4) {
                break;
            }
            iArr[i10] = a(i11, key);
            i10++;
            i11 += 4;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 32; i13++) {
            this.f88644b[i13] = iArr[i12 & 3] + i12;
            i12 -= 1640531527;
            this.f88645c[i13] = iArr[(i12 >>> 11) & 3] + i12;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (!this.f88646d) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i10 + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        boolean z10 = this.f88647e;
        int[] iArr = this.f88645c;
        int[] iArr2 = this.f88644b;
        if (z10) {
            int iA = a(i10, bArr);
            int iA2 = a(i10 + 4, bArr);
            for (int i12 = 0; i12 < 32; i12++) {
                iA += (((iA2 << 4) ^ (iA2 >>> 5)) + iA2) ^ iArr2[i12];
                iA2 += (((iA << 4) ^ (iA >>> 5)) + iA) ^ iArr[i12];
            }
            b(iA, i11, bArr2);
            b(iA2, i11 + 4, bArr2);
            return 8;
        }
        int iA3 = a(i10, bArr);
        int iA4 = a(i10 + 4, bArr);
        for (int i13 = 31; i13 >= 0; i13--) {
            iA4 -= (((iA3 << 4) ^ (iA3 >>> 5)) + iA3) ^ iArr[i13];
            iA3 -= (((iA4 << 4) ^ (iA4 >>> 5)) + iA4) ^ iArr2[i13];
        }
        b(iA3, i11, bArr2);
        b(iA4, i11 + 4, bArr2);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
