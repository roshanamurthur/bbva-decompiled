package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* JADX INFO: loaded from: classes5.dex */
public class OpenPGPCFBBlockCipher implements BlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f89143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f89144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f89145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BlockCipher f89146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f89147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f89148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f89149g;

    public OpenPGPCFBBlockCipher(BlockCipher blockCipher) {
        this.f89146d = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.f89148f = blockSize;
        this.f89143a = new byte[blockSize];
        this.f89144b = new byte[blockSize];
        this.f89145c = new byte[blockSize];
    }

    public final byte a(byte b10, int i10) {
        return (byte) (b10 ^ this.f89145c[i10]);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.f89146d.getAlgorithmName() + "/OpenPGPCFB";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f89146d.getBlockSize();
    }

    public BlockCipher getUnderlyingCipher() {
        return this.f89146d;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.f89149g = z10;
        reset();
        this.f89146d.init(true, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        boolean z10 = this.f89149g;
        byte[] bArr3 = this.f89144b;
        int i12 = 0;
        BlockCipher blockCipher = this.f89146d;
        byte[] bArr4 = this.f89145c;
        int i13 = this.f89148f;
        int i14 = 2;
        if (z10) {
            if (i10 + i13 > bArr.length) {
                throw new DataLengthException("input buffer too short");
            }
            if (i11 + i13 > bArr2.length) {
                throw new OutputLengthException("output buffer too short");
            }
            int i15 = this.f89147e;
            if (i15 > i13) {
                int i16 = i13 - 2;
                byte bA = a(bArr[i10], i16);
                bArr2[i11] = bA;
                bArr3[i16] = bA;
                int i17 = i13 - 1;
                byte bA2 = a(bArr[i10 + 1], i17);
                bArr2[i11 + 1] = bA2;
                bArr3[i17] = bA2;
                blockCipher.processBlock(bArr3, 0, bArr4, 0);
                while (i14 < i13) {
                    int i18 = i14 - 2;
                    byte bA3 = a(bArr[i10 + i14], i18);
                    bArr2[i11 + i14] = bA3;
                    bArr3[i18] = bA3;
                    i14++;
                }
            } else {
                if (i15 == 0) {
                    blockCipher.processBlock(bArr3, 0, bArr4, 0);
                    while (i12 < i13) {
                        byte bA4 = a(bArr[i10 + i12], i12);
                        bArr2[i11 + i12] = bA4;
                        bArr3[i12] = bA4;
                        i12++;
                    }
                } else if (i15 == i13) {
                    blockCipher.processBlock(bArr3, 0, bArr4, 0);
                    bArr2[i11] = a(bArr[i10], 0);
                    bArr2[i11 + 1] = a(bArr[i10 + 1], 1);
                    int i19 = i13 - 2;
                    System.arraycopy(bArr3, 2, bArr3, 0, i19);
                    System.arraycopy(bArr2, i11, bArr3, i19, 2);
                    blockCipher.processBlock(bArr3, 0, bArr4, 0);
                    while (i14 < i13) {
                        int i20 = i14 - 2;
                        byte bA5 = a(bArr[i10 + i14], i20);
                        bArr2[i11 + i14] = bA5;
                        bArr3[i20] = bA5;
                        i14++;
                    }
                }
                this.f89147e += i13;
            }
        } else {
            if (i10 + i13 > bArr.length) {
                throw new DataLengthException("input buffer too short");
            }
            if (i11 + i13 > bArr2.length) {
                throw new OutputLengthException("output buffer too short");
            }
            int i21 = this.f89147e;
            if (i21 > i13) {
                byte b10 = bArr[i10];
                int i22 = i13 - 2;
                bArr3[i22] = b10;
                bArr2[i11] = a(b10, i22);
                byte b11 = bArr[i10 + 1];
                int i23 = i13 - 1;
                bArr3[i23] = b11;
                bArr2[i11 + 1] = a(b11, i23);
                blockCipher.processBlock(bArr3, 0, bArr4, 0);
                while (i14 < i13) {
                    byte b12 = bArr[i10 + i14];
                    int i24 = i14 - 2;
                    bArr3[i24] = b12;
                    bArr2[i11 + i14] = a(b12, i24);
                    i14++;
                }
            } else {
                if (i21 == 0) {
                    blockCipher.processBlock(bArr3, 0, bArr4, 0);
                    while (i12 < i13) {
                        int i25 = i10 + i12;
                        bArr3[i12] = bArr[i25];
                        bArr2[i12] = a(bArr[i25], i12);
                        i12++;
                    }
                } else if (i21 == i13) {
                    blockCipher.processBlock(bArr3, 0, bArr4, 0);
                    byte b13 = bArr[i10];
                    byte b14 = bArr[i10 + 1];
                    bArr2[i11] = a(b13, 0);
                    bArr2[i11 + 1] = a(b14, 1);
                    int i26 = i13 - 2;
                    System.arraycopy(bArr3, 2, bArr3, 0, i26);
                    bArr3[i26] = b13;
                    bArr3[i13 - 1] = b14;
                    blockCipher.processBlock(bArr3, 0, bArr4, 0);
                    while (i14 < i13) {
                        byte b15 = bArr[i10 + i14];
                        int i27 = i14 - 2;
                        bArr3[i27] = b15;
                        bArr2[i11 + i14] = a(b15, i27);
                        i14++;
                    }
                }
                this.f89147e += i13;
            }
        }
        return i13;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.f89147e = 0;
        byte[] bArr = this.f89144b;
        System.arraycopy(this.f89143a, 0, bArr, 0, bArr.length);
        this.f89146d.reset();
    }
}
