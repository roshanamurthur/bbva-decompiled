package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class KXTSBlockCipher extends BufferedBlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f89108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f89109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f89110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f89111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f89112e;

    public KXTSBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.f89108a = blockSize;
        this.f89109b = getReductionPolynomial(blockSize);
        this.f89110c = new long[blockSize >>> 3];
        this.f89111d = new long[blockSize >>> 3];
        this.f89112e = -1;
    }

    public static long getReductionPolynomial(int i10) {
        if (i10 == 16) {
            return 135L;
        }
        if (i10 == 32) {
            return 1061L;
        }
        if (i10 == 64) {
            return 293L;
        }
        throw new IllegalArgumentException("Only 128, 256, and 512 -bit block sizes supported");
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i10) {
        reset();
        return 0;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Invalid parameters passed");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        CipherParameters parameters = parametersWithIV.getParameters();
        byte[] iv = parametersWithIV.getIV();
        int length = iv.length;
        int i10 = this.f89108a;
        if (length != i10) {
            throw new IllegalArgumentException("Currently only support IVs of exactly one block");
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(iv, 0, bArr, 0, i10);
        this.cipher.init(true, parameters);
        this.cipher.processBlock(bArr, 0, bArr, 0);
        this.cipher.init(z10, parameters);
        long[] jArr = this.f89110c;
        Pack.littleEndianToLong(bArr, 0, jArr);
        System.arraycopy(jArr, 0, this.f89111d, 0, jArr.length);
        this.f89112e = 0;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b10, byte[] bArr, int i10) {
        throw new IllegalStateException("unsupported operation");
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        long[] jArr;
        if (bArr.length - i10 < i11) {
            throw new DataLengthException("Input buffer too short");
        }
        if (bArr2.length - i10 < i11) {
            throw new OutputLengthException("Output buffer too short");
        }
        int i13 = this.f89108a;
        if (i11 % i13 != 0) {
            throw new IllegalArgumentException("Partial blocks not supported");
        }
        int i14 = 0;
        int i15 = 0;
        while (i15 < i11) {
            int i16 = i10 + i15;
            int i17 = i12 + i15;
            int i18 = this.f89112e;
            if (i18 == -1) {
                throw new IllegalStateException("Attempt to process too many blocks");
            }
            this.f89112e = i18 + 1;
            long j10 = 0;
            int i19 = i14;
            while (true) {
                jArr = this.f89111d;
                if (i19 >= jArr.length) {
                    break;
                }
                long j11 = jArr[i19];
                jArr[i19] = j10 ^ (j11 << 1);
                i19++;
                j10 = j11 >>> 63;
            }
            int i20 = i15;
            jArr[0] = (this.f89109b & (-j10)) ^ jArr[i14];
            byte[] bArr3 = new byte[i13];
            Pack.longToLittleEndian(jArr, bArr3, 0);
            byte[] bArr4 = new byte[i13];
            System.arraycopy(bArr3, 0, bArr4, 0, i13);
            for (int i21 = 0; i21 < i13; i21++) {
                bArr4[i21] = (byte) (bArr4[i21] ^ bArr[i16 + i21]);
            }
            this.cipher.processBlock(bArr4, 0, bArr4, 0);
            for (int i22 = 0; i22 < i13; i22++) {
                bArr2[i17 + i22] = (byte) (bArr4[i22] ^ bArr3[i22]);
            }
            i15 = i20 + i13;
            i14 = 0;
        }
        return i11;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public void reset() {
        this.cipher.reset();
        long[] jArr = this.f89111d;
        long[] jArr2 = this.f89110c;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        this.f89112e = 0;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i10) {
        return i10;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i10) {
        return i10;
    }
}
