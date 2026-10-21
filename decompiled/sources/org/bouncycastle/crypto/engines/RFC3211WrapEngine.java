package org.bouncycastle.crypto.engines;

import java.security.SecureRandom;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class RFC3211WrapEngine implements Wrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CBCBlockCipher f88533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ParametersWithIV f88534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SecureRandom f88536d;

    public RFC3211WrapEngine(BlockCipher blockCipher) {
        this.f88533a = new CBCBlockCipher(blockCipher);
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return this.f88533a.getUnderlyingCipher().getAlgorithmName() + "/RFC3211Wrap";
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.f88535c = z10;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.f88536d = parametersWithRandom.getRandom();
            if (!(parametersWithRandom.getParameters() instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("RFC3211Wrap requires an IV");
            }
            this.f88534b = (ParametersWithIV) parametersWithRandom.getParameters();
            return;
        }
        if (z10) {
            this.f88536d = CryptoServicesRegistrar.getSecureRandom();
        }
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("RFC3211Wrap requires an IV");
        }
        this.f88534b = (ParametersWithIV) cipherParameters;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        if (this.f88535c) {
            throw new IllegalStateException("not set for unwrapping");
        }
        CBCBlockCipher cBCBlockCipher = this.f88533a;
        int blockSize = cBCBlockCipher.getBlockSize();
        if (i11 < blockSize * 2) {
            throw new InvalidCipherTextException("input too short");
        }
        byte[] bArr2 = new byte[i11];
        byte[] bArr3 = new byte[blockSize];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        System.arraycopy(bArr, i10, bArr3, 0, blockSize);
        cBCBlockCipher.init(false, new ParametersWithIV(this.f88534b.getParameters(), bArr3));
        for (int i12 = blockSize; i12 < i11; i12 += blockSize) {
            cBCBlockCipher.processBlock(bArr2, i12, bArr2, i12);
        }
        System.arraycopy(bArr2, i11 - blockSize, bArr3, 0, blockSize);
        cBCBlockCipher.init(false, new ParametersWithIV(this.f88534b.getParameters(), bArr3));
        cBCBlockCipher.processBlock(bArr2, 0, bArr2, 0);
        cBCBlockCipher.init(false, this.f88534b);
        for (int i13 = 0; i13 < i11; i13 += blockSize) {
            cBCBlockCipher.processBlock(bArr2, i13, bArr2, i13);
        }
        int i14 = bArr2[0];
        int i15 = i11 - 4;
        boolean z10 = (i14 & 255) > i15;
        byte[] bArr4 = z10 ? new byte[i15] : new byte[i14 & 255];
        System.arraycopy(bArr2, 4, bArr4, 0, bArr4.length);
        int i16 = 0;
        int i17 = 0;
        while (i16 != 3) {
            int i18 = i16 + 1;
            i17 |= bArr2[i16 + 4] ^ ((byte) (~bArr2[i18]));
            i16 = i18;
        }
        Arrays.clear(bArr2);
        if (!z10 && !(i17 != 0)) {
            return bArr4;
        }
        throw new InvalidCipherTextException("wrapped key corrupted");
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i10, int i11) {
        if (!this.f88535c) {
            throw new IllegalStateException("not set for wrapping");
        }
        if (i11 > 255 || i11 < 0) {
            throw new IllegalArgumentException("input must be from 0 to 255 bytes");
        }
        ParametersWithIV parametersWithIV = this.f88534b;
        CBCBlockCipher cBCBlockCipher = this.f88533a;
        cBCBlockCipher.init(true, parametersWithIV);
        int blockSize = cBCBlockCipher.getBlockSize();
        int i12 = i11 + 4;
        int i13 = blockSize * 2;
        if (i12 >= i13) {
            i13 = i12 % blockSize == 0 ? i12 : ((i12 / blockSize) + 1) * blockSize;
        }
        byte[] bArr2 = new byte[i13];
        bArr2[0] = (byte) i11;
        System.arraycopy(bArr, i10, bArr2, 4, i11);
        int length = bArr2.length - i12;
        byte[] bArr3 = new byte[length];
        this.f88536d.nextBytes(bArr3);
        System.arraycopy(bArr3, 0, bArr2, i12, length);
        bArr2[1] = (byte) (~bArr2[4]);
        bArr2[2] = (byte) (~bArr2[5]);
        bArr2[3] = (byte) (~bArr2[6]);
        for (int i14 = 0; i14 < bArr2.length; i14 += blockSize) {
            cBCBlockCipher.processBlock(bArr2, i14, bArr2, i14);
        }
        for (int i15 = 0; i15 < bArr2.length; i15 += blockSize) {
            cBCBlockCipher.processBlock(bArr2, i15, bArr2, i15);
        }
        return bArr2;
    }
}
