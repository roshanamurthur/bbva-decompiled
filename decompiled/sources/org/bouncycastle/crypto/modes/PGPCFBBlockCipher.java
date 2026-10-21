package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes5.dex */
public class PGPCFBBlockCipher implements BlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f89150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f89151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f89152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f89153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BlockCipher f89154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f89155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f89156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f89157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f89158i;

    public PGPCFBBlockCipher(BlockCipher blockCipher, boolean z10) {
        this.f89154e = blockCipher;
        this.f89158i = z10;
        int blockSize = blockCipher.getBlockSize();
        this.f89156g = blockSize;
        this.f89150a = new byte[blockSize];
        this.f89151b = new byte[blockSize];
        this.f89152c = new byte[blockSize];
        this.f89153d = new byte[blockSize];
    }

    public final byte a(byte b10, int i10) {
        return (byte) (b10 ^ this.f89152c[i10]);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        StringBuilder sb2;
        String str;
        boolean z10 = this.f89158i;
        BlockCipher blockCipher = this.f89154e;
        if (z10) {
            sb2 = new StringBuilder();
            sb2.append(blockCipher.getAlgorithmName());
            str = "/PGPCFBwithIV";
        } else {
            sb2 = new StringBuilder();
            sb2.append(blockCipher.getAlgorithmName());
            str = "/PGPCFB";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f89154e.getBlockSize();
    }

    public BlockCipher getUnderlyingCipher() {
        return this.f89154e;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.f89157h = z10;
        boolean z11 = cipherParameters instanceof ParametersWithIV;
        BlockCipher blockCipher = this.f89154e;
        if (!z11) {
            reset();
            blockCipher.init(true, cipherParameters);
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        int length = iv.length;
        byte[] bArr = this.f89150a;
        if (length < bArr.length) {
            System.arraycopy(iv, 0, bArr, bArr.length - iv.length, iv.length);
            for (int i10 = 0; i10 < bArr.length - iv.length; i10++) {
                bArr[i10] = 0;
            }
        } else {
            System.arraycopy(iv, 0, bArr, 0, bArr.length);
        }
        reset();
        blockCipher.init(true, parametersWithIV.getParameters());
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        byte[] bArr3;
        boolean z10 = this.f89158i;
        int i12 = 0;
        byte[] bArr4 = this.f89151b;
        BlockCipher blockCipher = this.f89154e;
        byte[] bArr5 = this.f89152c;
        int i13 = this.f89156g;
        if (!z10) {
            if (this.f89157h) {
                if (i10 + i13 > bArr.length) {
                    throw new DataLengthException("input buffer too short");
                }
                if (i11 + i13 > bArr2.length) {
                    throw new OutputLengthException("output buffer too short");
                }
                blockCipher.processBlock(bArr4, 0, bArr5, 0);
                for (int i14 = 0; i14 < i13; i14++) {
                    bArr2[i11 + i14] = a(bArr[i10 + i14], i14);
                }
                while (i12 < i13) {
                    bArr4[i12] = bArr2[i11 + i12];
                    i12++;
                }
            } else {
                if (i10 + i13 > bArr.length) {
                    throw new DataLengthException("input buffer too short");
                }
                if (i11 + i13 > bArr2.length) {
                    throw new OutputLengthException("output buffer too short");
                }
                blockCipher.processBlock(bArr4, 0, bArr5, 0);
                for (int i15 = 0; i15 < i13; i15++) {
                    bArr2[i11 + i15] = a(bArr[i10 + i15], i15);
                }
                while (i12 < i13) {
                    bArr4[i12] = bArr[i10 + i12];
                    i12++;
                }
            }
            return i13;
        }
        if (this.f89157h) {
            if (i10 + i13 > bArr.length) {
                throw new DataLengthException("input buffer too short");
            }
            int i16 = this.f89155f;
            if (i16 != 0) {
                if (i16 < i13 + 2) {
                    return i13;
                }
                if (i11 + i13 > bArr2.length) {
                    throw new OutputLengthException("output buffer too short");
                }
                blockCipher.processBlock(bArr4, 0, bArr5, 0);
                for (int i17 = 0; i17 < i13; i17++) {
                    bArr2[i11 + i17] = a(bArr[i10 + i17], i17);
                }
                System.arraycopy(bArr2, i11, bArr4, 0, i13);
                return i13;
            }
            int i18 = i13 * 2;
            if (i18 + i11 + 2 > bArr2.length) {
                throw new OutputLengthException("output buffer too short");
            }
            blockCipher.processBlock(bArr4, 0, bArr5, 0);
            int i19 = 0;
            while (true) {
                bArr3 = this.f89150a;
                if (i19 >= i13) {
                    break;
                }
                bArr2[i11 + i19] = a(bArr3[i19], i19);
                i19++;
            }
            System.arraycopy(bArr2, i11, bArr4, 0, i13);
            blockCipher.processBlock(bArr4, 0, bArr5, 0);
            int i20 = i11 + i13;
            bArr2[i20] = a(bArr3[i13 - 2], 0);
            bArr2[i20 + 1] = a(bArr3[i13 - 1], 1);
            System.arraycopy(bArr2, i11 + 2, bArr4, 0, i13);
            blockCipher.processBlock(bArr4, 0, bArr5, 0);
            for (int i21 = 0; i21 < i13; i21++) {
                bArr2[i20 + 2 + i21] = a(bArr[i10 + i21], i21);
            }
            System.arraycopy(bArr2, i20 + 2, bArr4, 0, i13);
            int i22 = i18 + 2;
            this.f89155f += i22;
            return i22;
        }
        if (i10 + i13 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + i13 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i23 = this.f89155f;
        if (i23 == 0) {
            for (int i24 = 0; i24 < i13; i24++) {
                bArr4[i24] = bArr[i10 + i24];
            }
            blockCipher.processBlock(bArr4, 0, bArr5, 0);
            this.f89155f += i13;
        } else {
            byte[] bArr6 = this.f89153d;
            if (i23 == i13) {
                System.arraycopy(bArr, i10, bArr6, 0, i13);
                int i25 = i13 - 2;
                System.arraycopy(bArr4, 2, bArr4, 0, i25);
                bArr4[i25] = bArr6[0];
                bArr4[i13 - 1] = bArr6[1];
                blockCipher.processBlock(bArr4, 0, bArr5, 0);
                for (int i26 = 0; i26 < i25; i26++) {
                    bArr2[i11 + i26] = a(bArr6[i26 + 2], i26);
                }
                System.arraycopy(bArr6, 2, bArr4, 0, i25);
                this.f89155f += 2;
                i12 = i25;
            } else {
                if (i23 >= i13 + 2) {
                    System.arraycopy(bArr, i10, bArr6, 0, i13);
                    int i27 = i13 - 2;
                    bArr2[i11] = a(bArr6[0], i27);
                    bArr2[i11 + 1] = a(bArr6[1], i13 - 1);
                    System.arraycopy(bArr6, 0, bArr4, i27, 2);
                    blockCipher.processBlock(bArr4, 0, bArr5, 0);
                    for (int i28 = 0; i28 < i27; i28++) {
                        bArr2[i11 + i28 + 2] = a(bArr6[i28 + 2], i28);
                    }
                    System.arraycopy(bArr6, 2, bArr4, 0, i27);
                }
                i12 = i13;
            }
        }
        return i12;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.f89155f = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f89151b;
            if (i10 == bArr.length) {
                this.f89154e.reset();
                return;
            }
            if (this.f89158i) {
                bArr[i10] = 0;
            } else {
                bArr[i10] = this.f89150a[i10];
            }
            i10++;
        }
    }
}
