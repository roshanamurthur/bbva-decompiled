package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class RFC3394WrapEngine implements Wrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockCipher f88537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f88538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public KeyParameter f88539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f88540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f88541e;

    public RFC3394WrapEngine(BlockCipher blockCipher) {
        this(blockCipher, false);
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return this.f88537a.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.f88540d = z10;
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        if (cipherParameters instanceof KeyParameter) {
            this.f88539c = (KeyParameter) cipherParameters;
            return;
        }
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.f88541e = parametersWithIV.getIV();
            this.f88539c = (KeyParameter) parametersWithIV.getParameters();
            if (this.f88541e.length != 8) {
                throw new IllegalArgumentException("IV not equal to 8");
            }
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        if (this.f88540d) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int i12 = i11 / 8;
        if (i12 * 8 != i11) {
            throw new InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
        }
        byte[] bArr2 = this.f88541e;
        byte[] bArr3 = new byte[i11 - bArr2.length];
        byte[] bArr4 = new byte[bArr2.length];
        byte[] bArr5 = new byte[bArr2.length + 8];
        System.arraycopy(bArr, i10, bArr4, 0, bArr2.length);
        byte[] bArr6 = this.f88541e;
        System.arraycopy(bArr, i10 + bArr6.length, bArr3, 0, i11 - bArr6.length);
        boolean z10 = !this.f88538b;
        KeyParameter keyParameter = this.f88539c;
        BlockCipher blockCipher = this.f88537a;
        blockCipher.init(z10, keyParameter);
        int i13 = i12 - 1;
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = i13; i15 >= 1; i15--) {
                System.arraycopy(bArr4, 0, bArr5, 0, this.f88541e.length);
                int i16 = (i15 - 1) * 8;
                System.arraycopy(bArr3, i16, bArr5, this.f88541e.length, 8);
                int i17 = (i13 * i14) + i15;
                int i18 = 1;
                while (i17 != 0) {
                    int length = this.f88541e.length - i18;
                    bArr5[length] = (byte) (bArr5[length] ^ ((byte) i17));
                    i17 >>>= 8;
                    i18++;
                }
                blockCipher.processBlock(bArr5, 0, bArr5, 0);
                System.arraycopy(bArr5, 0, bArr4, 0, 8);
                System.arraycopy(bArr5, 8, bArr3, i16, 8);
            }
        }
        if (Arrays.constantTimeAreEqual(bArr4, this.f88541e)) {
            return bArr3;
        }
        throw new InvalidCipherTextException("checksum failed");
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i10, int i11) {
        if (!this.f88540d) {
            throw new IllegalStateException("not set for wrapping");
        }
        int i12 = i11 / 8;
        if (i12 * 8 != i11) {
            throw new DataLengthException("wrap data must be a multiple of 8 bytes");
        }
        byte[] bArr2 = this.f88541e;
        byte[] bArr3 = new byte[bArr2.length + i11];
        byte[] bArr4 = new byte[bArr2.length + 8];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, this.f88541e.length, i11);
        boolean z10 = this.f88538b;
        KeyParameter keyParameter = this.f88539c;
        BlockCipher blockCipher = this.f88537a;
        blockCipher.init(z10, keyParameter);
        for (int i13 = 0; i13 != 6; i13++) {
            for (int i14 = 1; i14 <= i12; i14++) {
                System.arraycopy(bArr3, 0, bArr4, 0, this.f88541e.length);
                int i15 = i14 * 8;
                System.arraycopy(bArr3, i15, bArr4, this.f88541e.length, 8);
                blockCipher.processBlock(bArr4, 0, bArr4, 0);
                int i16 = (i12 * i13) + i14;
                int i17 = 1;
                while (i16 != 0) {
                    int length = this.f88541e.length - i17;
                    bArr4[length] = (byte) (((byte) i16) ^ bArr4[length]);
                    i16 >>>= 8;
                    i17++;
                }
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr3, i15, 8);
            }
        }
        return bArr3;
    }

    public RFC3394WrapEngine(BlockCipher blockCipher, boolean z10) {
        this.f88541e = new byte[]{-90, -90, -90, -90, -90, -90, -90, -90};
        this.f88537a = blockCipher;
        this.f88538b = !z10;
    }
}
