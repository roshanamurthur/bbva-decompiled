package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class RFC5649WrapEngine implements Wrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockCipher f88542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public KeyParameter f88543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f88545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f88546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f88547f = null;

    public RFC5649WrapEngine(BlockCipher blockCipher) {
        byte[] bArr = {-90, 89, 89, -90};
        this.f88545d = bArr;
        this.f88546e = bArr;
        this.f88542a = blockCipher;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return this.f88542a.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.f88544c = z10;
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        if (cipherParameters instanceof KeyParameter) {
            this.f88543b = (KeyParameter) cipherParameters;
            this.f88546e = this.f88545d;
        } else if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.f88546e = parametersWithIV.getIV();
            this.f88543b = (KeyParameter) parametersWithIV.getParameters();
            if (this.f88546e.length != 4) {
                throw new IllegalArgumentException("IV length not equal to 4");
            }
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        byte[] bArr2;
        if (this.f88544c) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int i12 = i11 / 8;
        if (i12 * 8 != i11) {
            throw new InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
        }
        if (i12 == 1) {
            throw new InvalidCipherTextException("unwrap data must be at least 16 bytes");
        }
        byte[] bArr3 = new byte[i11];
        System.arraycopy(bArr, i10, bArr3, 0, i11);
        byte[] bArr4 = new byte[i11];
        BlockCipher blockCipher = this.f88542a;
        if (i12 == 2) {
            blockCipher.init(false, this.f88543b);
            for (int blockSize = 0; blockSize < i11; blockSize += blockCipher.getBlockSize()) {
                blockCipher.processBlock(bArr3, blockSize, bArr4, blockSize);
            }
            byte[] bArr5 = new byte[8];
            this.f88547f = bArr5;
            System.arraycopy(bArr4, 0, bArr5, 0, bArr5.length);
            byte[] bArr6 = this.f88547f;
            int length = i11 - bArr6.length;
            bArr2 = new byte[length];
            System.arraycopy(bArr4, bArr6.length, bArr2, 0, length);
        } else {
            int i13 = i11 - 8;
            byte[] bArr7 = new byte[i13];
            byte[] bArr8 = new byte[8];
            byte[] bArr9 = new byte[16];
            System.arraycopy(bArr, i10, bArr8, 0, 8);
            System.arraycopy(bArr, i10 + 8, bArr7, 0, i13);
            blockCipher.init(false, this.f88543b);
            int i14 = i12 - 1;
            for (int i15 = 5; i15 >= 0; i15--) {
                for (int i16 = i14; i16 >= 1; i16--) {
                    System.arraycopy(bArr8, 0, bArr9, 0, 8);
                    int i17 = (i16 - 1) * 8;
                    System.arraycopy(bArr7, i17, bArr9, 8, 8);
                    int i18 = (i14 * i15) + i16;
                    int i19 = 1;
                    while (i18 != 0) {
                        int i20 = 8 - i19;
                        bArr9[i20] = (byte) (bArr9[i20] ^ ((byte) i18));
                        i18 >>>= 8;
                        i19++;
                    }
                    blockCipher.processBlock(bArr9, 0, bArr9, 0);
                    System.arraycopy(bArr9, 0, bArr8, 0, 8);
                    System.arraycopy(bArr9, 8, bArr7, i17, 8);
                }
            }
            this.f88547f = bArr8;
            bArr2 = bArr7;
        }
        byte[] bArr10 = new byte[4];
        byte[] bArr11 = new byte[4];
        System.arraycopy(this.f88547f, 0, bArr10, 0, 4);
        System.arraycopy(this.f88547f, 4, bArr11, 0, 4);
        int iBigEndianToInt = Pack.bigEndianToInt(bArr11, 0);
        boolean zConstantTimeAreEqual = Arrays.constantTimeAreEqual(bArr10, this.f88546e);
        int length2 = bArr2.length;
        if (iBigEndianToInt <= length2 - 8) {
            zConstantTimeAreEqual = false;
        }
        if (iBigEndianToInt > length2) {
            zConstantTimeAreEqual = false;
        }
        int length3 = length2 - iBigEndianToInt;
        if (length3 >= bArr2.length) {
            length3 = bArr2.length;
            zConstantTimeAreEqual = false;
        }
        byte[] bArr12 = new byte[length3];
        System.arraycopy(bArr2, bArr2.length - length3, bArr12, 0, length3);
        if (!Arrays.constantTimeAreEqual(bArr12, new byte[length3]) || !zConstantTimeAreEqual) {
            throw new InvalidCipherTextException("checksum failed");
        }
        byte[] bArr13 = new byte[iBigEndianToInt];
        System.arraycopy(bArr2, 0, bArr13, 0, iBigEndianToInt);
        return bArr13;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i10, int i11) {
        if (!this.f88544c) {
            throw new IllegalStateException("not set for wrapping");
        }
        byte[] bArr2 = new byte[8];
        byte[] bArrIntToBigEndian = Pack.intToBigEndian(i11);
        byte[] bArr3 = this.f88546e;
        System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        System.arraycopy(bArrIntToBigEndian, 0, bArr2, this.f88546e.length, bArrIntToBigEndian.length);
        byte[] bArr4 = new byte[i11];
        System.arraycopy(bArr, i10, bArr4, 0, i11);
        int i12 = (8 - (i11 % 8)) % 8;
        int i13 = i11 + i12;
        byte[] bArr5 = new byte[i13];
        System.arraycopy(bArr4, 0, bArr5, 0, i11);
        if (i12 != 0) {
            System.arraycopy(new byte[i12], 0, bArr5, i11, i12);
        }
        BlockCipher blockCipher = this.f88542a;
        if (i13 != 8) {
            RFC3394WrapEngine rFC3394WrapEngine = new RFC3394WrapEngine(blockCipher);
            rFC3394WrapEngine.init(true, new ParametersWithIV(this.f88543b, bArr2));
            return rFC3394WrapEngine.wrap(bArr5, 0, i13);
        }
        int i14 = i13 + 8;
        byte[] bArr6 = new byte[i14];
        System.arraycopy(bArr2, 0, bArr6, 0, 8);
        System.arraycopy(bArr5, 0, bArr6, 8, i13);
        blockCipher.init(true, this.f88543b);
        for (int blockSize = 0; blockSize < i14; blockSize += blockCipher.getBlockSize()) {
            blockCipher.processBlock(bArr6, blockSize, bArr6, blockSize);
        }
        return bArr6;
    }
}
