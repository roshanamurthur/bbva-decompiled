package org.bouncycastle.crypto.engines;

import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.esotericsoftware.asm.Opcodes;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes3.dex */
public class NoekeonEngine implements BlockCipher {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f88500f = {0, 0, 0, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f88501g = {128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, Opcodes.IFNULL, 151, 53, 106, ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f88502a = new int[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f88503b = new int[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f88504c = new int[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f88505d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f88506e;

    public static int a(int i10, byte[] bArr) {
        int i11 = ((bArr[i10 + 1] & 255) << 16) | (bArr[i10] << 24);
        return (bArr[i10 + 3] & 255) | i11 | ((bArr[i10 + 2] & 255) << 8);
    }

    public static void b(int[] iArr) {
        int i10 = iArr[1];
        int i11 = iArr[3];
        int i12 = ~i11;
        int i13 = iArr[2];
        int i14 = i10 ^ (i12 & (~i13));
        iArr[1] = i14;
        int i15 = iArr[0] ^ (i13 & i14);
        iArr[0] = i15;
        iArr[3] = i15;
        iArr[0] = i11;
        int i16 = ((i11 ^ i14) ^ i15) ^ i13;
        iArr[2] = i16;
        int i17 = i14 ^ ((~i15) & (~i16));
        iArr[1] = i17;
        iArr[0] = (i16 & i17) ^ i11;
    }

    public static void c(int i10, int i11, byte[] bArr) {
        bArr[i11] = (byte) (i10 >>> 24);
        bArr[i11 + 1] = (byte) (i10 >>> 16);
        bArr[i11 + 2] = (byte) (i10 >>> 8);
        bArr[i11 + 3] = (byte) i10;
    }

    public static void d(int[] iArr) {
        iArr[1] = e(iArr[1], 31);
        iArr[2] = e(iArr[2], 27);
        iArr[3] = e(iArr[3], 30);
    }

    public static int e(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    public static void f(int[] iArr, int[] iArr2) {
        int i10 = iArr[0] ^ iArr[2];
        int iE = i10 ^ (e(i10, 8) ^ e(i10, 24));
        iArr[1] = iArr[1] ^ iE;
        iArr[3] = iE ^ iArr[3];
        for (int i11 = 0; i11 < 4; i11++) {
            iArr[i11] = iArr[i11] ^ iArr2[i11];
        }
        int i12 = iArr[1] ^ iArr[3];
        int iE2 = i12 ^ (e(i12, 8) ^ e(i12, 24));
        iArr[0] = iArr[0] ^ iE2;
        iArr[2] = iE2 ^ iArr[2];
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Noekeon";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "invalid parameter passed to Noekeon init - "));
        }
        this.f88506e = z10;
        this.f88505d = true;
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        int iA = a(0, key);
        int[] iArr = this.f88503b;
        iArr[0] = iA;
        iArr[1] = a(4, key);
        iArr[2] = a(8, key);
        iArr[3] = a(12, key);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (!this.f88505d) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i10 + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        boolean z10 = this.f88506e;
        int[] iArr = f88501g;
        int[] iArr2 = this.f88503b;
        int[] iArr3 = this.f88502a;
        if (z10) {
            iArr3[0] = a(i10, bArr);
            iArr3[1] = a(i10 + 4, bArr);
            iArr3[2] = a(i10 + 8, bArr);
            iArr3[3] = a(i10 + 12, bArr);
            int i12 = 0;
            while (i12 < 16) {
                iArr3[0] = iArr3[0] ^ iArr[i12];
                f(iArr3, iArr2);
                iArr3[1] = e(iArr3[1], 1);
                iArr3[2] = e(iArr3[2], 5);
                iArr3[3] = e(iArr3[3], 2);
                b(iArr3);
                d(iArr3);
                i12++;
            }
            iArr3[0] = iArr[i12] ^ iArr3[0];
            f(iArr3, iArr2);
            c(iArr3[0], i11, bArr2);
            c(iArr3[1], i11 + 4, bArr2);
            c(iArr3[2], i11 + 8, bArr2);
            c(iArr3[3], i11 + 12, bArr2);
        } else {
            iArr3[0] = a(i10, bArr);
            iArr3[1] = a(i10 + 4, bArr);
            iArr3[2] = a(i10 + 8, bArr);
            iArr3[3] = a(i10 + 12, bArr);
            int length = iArr2.length;
            int[] iArr4 = this.f88504c;
            System.arraycopy(iArr2, 0, iArr4, 0, length);
            f(iArr4, f88500f);
            int i13 = 16;
            while (true) {
                f(iArr3, iArr4);
                if (i13 <= 0) {
                    break;
                }
                iArr3[0] = iArr3[0] ^ iArr[i13];
                iArr3[1] = e(iArr3[1], 1);
                iArr3[2] = e(iArr3[2], 5);
                iArr3[3] = e(iArr3[3], 2);
                b(iArr3);
                d(iArr3);
                i13--;
            }
            int i14 = iArr[i13] ^ iArr3[0];
            iArr3[0] = i14;
            c(i14, i11, bArr2);
            c(iArr3[1], i11 + 4, bArr2);
            c(iArr3[2], i11 + 8, bArr2);
            c(iArr3[3], i11 + 12, bArr2);
        }
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
