package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes3.dex */
public class TEAEngine implements BlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f88613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f88616e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f88617f;

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
        return "TEA";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "invalid parameter passed to TEA init - "));
        }
        this.f88617f = z10;
        this.f88616e = true;
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("Key size must be 128 bits.");
        }
        this.f88612a = a(0, key);
        this.f88613b = a(4, key);
        this.f88614c = a(8, key);
        this.f88615d = a(12, key);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (!this.f88616e) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i10 + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i12 = 0;
        if (this.f88617f) {
            int iA = a(i10, bArr);
            int iA2 = a(i10 + 4, bArr);
            int i13 = 0;
            while (i12 != 32) {
                i13 -= 1640531527;
                iA += (((iA2 << 4) + this.f88612a) ^ (iA2 + i13)) ^ ((iA2 >>> 5) + this.f88613b);
                iA2 += (((iA << 4) + this.f88614c) ^ (iA + i13)) ^ ((iA >>> 5) + this.f88615d);
                i12++;
            }
            b(iA, i11, bArr2);
            b(iA2, i11 + 4, bArr2);
            return 8;
        }
        int iA3 = a(i10, bArr);
        int iA4 = a(i10 + 4, bArr);
        int i14 = -957401312;
        while (i12 != 32) {
            iA4 -= (((iA3 << 4) + this.f88614c) ^ (iA3 + i14)) ^ ((iA3 >>> 5) + this.f88615d);
            iA3 -= (((iA4 << 4) + this.f88612a) ^ (iA4 + i14)) ^ ((iA4 >>> 5) + this.f88613b);
            i14 += 1640531527;
            i12++;
        }
        b(iA3, i11, bArr2);
        b(iA4, i11 + 4, bArr2);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
