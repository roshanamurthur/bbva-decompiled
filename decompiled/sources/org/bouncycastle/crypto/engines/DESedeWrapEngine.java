package org.bouncycastle.crypto.engines;

import androidx.appcompat.widget.g0;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class DESedeWrapEngine implements Wrapper {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f88373h = {74, -35, -94, 44, 121, -24, 33, 5};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CBCBlockCipher f88374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public KeyParameter f88375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ParametersWithIV f88376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f88377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f88378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Digest f88379f = DigestFactory.createSHA1();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f88380g = new byte[20];

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return "DESede";
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z10, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        this.f88378e = z10;
        this.f88374a = new CBCBlockCipher(new DESedeEngine());
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            CipherParameters parameters = parametersWithRandom.getParameters();
            SecureRandom random = parametersWithRandom.getRandom();
            cipherParameters = parameters;
            secureRandom = random;
        } else {
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        if (cipherParameters instanceof KeyParameter) {
            this.f88375b = (KeyParameter) cipherParameters;
            if (this.f88378e) {
                byte[] bArr = new byte[8];
                this.f88377d = bArr;
                secureRandom.nextBytes(bArr);
                this.f88376c = new ParametersWithIV(this.f88375b, this.f88377d);
                return;
            }
            return;
        }
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.f88376c = parametersWithIV;
            this.f88377d = parametersWithIV.getIV();
            this.f88375b = (KeyParameter) this.f88376c.getParameters();
            if (!this.f88378e) {
                throw new IllegalArgumentException("You should not supply an IV for unwrapping");
            }
            byte[] bArr2 = this.f88377d;
            if (bArr2 == null || bArr2.length != 8) {
                throw new IllegalArgumentException("IV is not 8 octets");
            }
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        if (this.f88378e) {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (bArr == null) {
            throw new InvalidCipherTextException("Null pointer as ciphertext");
        }
        int blockSize = this.f88374a.getBlockSize();
        if (i11 % blockSize != 0) {
            throw new InvalidCipherTextException(g0.c("Ciphertext not multiple of ", blockSize));
        }
        this.f88374a.init(false, new ParametersWithIV(this.f88375b, f88373h));
        byte[] bArr2 = new byte[i11];
        for (int i12 = 0; i12 != i11; i12 += blockSize) {
            this.f88374a.processBlock(bArr, i10 + i12, bArr2, i12);
        }
        byte[] bArr3 = new byte[i11];
        int i13 = 0;
        while (i13 < i11) {
            int i14 = i13 + 1;
            bArr3[i13] = bArr2[i11 - i14];
            i13 = i14;
        }
        byte[] bArr4 = new byte[8];
        this.f88377d = bArr4;
        int i15 = i11 - 8;
        byte[] bArr5 = new byte[i15];
        System.arraycopy(bArr3, 0, bArr4, 0, 8);
        System.arraycopy(bArr3, 8, bArr5, 0, i15);
        ParametersWithIV parametersWithIV = new ParametersWithIV(this.f88375b, this.f88377d);
        this.f88376c = parametersWithIV;
        this.f88374a.init(false, parametersWithIV);
        byte[] bArr6 = new byte[i15];
        for (int i16 = 0; i16 != i15; i16 += blockSize) {
            this.f88374a.processBlock(bArr5, i16, bArr6, i16);
        }
        int i17 = i11 - 16;
        byte[] bArr7 = new byte[i17];
        byte[] bArr8 = new byte[8];
        System.arraycopy(bArr6, 0, bArr7, 0, i17);
        System.arraycopy(bArr6, i17, bArr8, 0, 8);
        byte[] bArr9 = new byte[8];
        Digest digest = this.f88379f;
        digest.update(bArr7, 0, i17);
        byte[] bArr10 = this.f88380g;
        digest.doFinal(bArr10, 0);
        System.arraycopy(bArr10, 0, bArr9, 0, 8);
        if (Arrays.constantTimeAreEqual(bArr9, bArr8)) {
            return bArr7;
        }
        throw new InvalidCipherTextException("Checksum inside ciphertext is corrupted");
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i10, int i11) {
        if (!this.f88378e) {
            throw new IllegalStateException("Not initialized for wrapping");
        }
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        byte[] bArr3 = new byte[8];
        Digest digest = this.f88379f;
        digest.update(bArr2, 0, i11);
        byte[] bArr4 = this.f88380g;
        digest.doFinal(bArr4, 0);
        System.arraycopy(bArr4, 0, bArr3, 0, 8);
        int i12 = i11 + 8;
        byte[] bArr5 = new byte[i12];
        System.arraycopy(bArr2, 0, bArr5, 0, i11);
        System.arraycopy(bArr3, 0, bArr5, i11, 8);
        int blockSize = this.f88374a.getBlockSize();
        if (i12 % blockSize != 0) {
            throw new IllegalStateException("Not multiple of block length");
        }
        this.f88374a.init(true, this.f88376c);
        byte[] bArr6 = new byte[i12];
        for (int i13 = 0; i13 != i12; i13 += blockSize) {
            this.f88374a.processBlock(bArr5, i13, bArr6, i13);
        }
        byte[] bArr7 = this.f88377d;
        int length = bArr7.length + i12;
        byte[] bArr8 = new byte[length];
        System.arraycopy(bArr7, 0, bArr8, 0, bArr7.length);
        System.arraycopy(bArr6, 0, bArr8, this.f88377d.length, i12);
        byte[] bArr9 = new byte[length];
        int i14 = 0;
        while (i14 < length) {
            int i15 = i14 + 1;
            bArr9[i14] = bArr8[length - i15];
            i14 = i15;
        }
        this.f88374a.init(true, new ParametersWithIV(this.f88375b, f88373h));
        for (int i16 = 0; i16 != length; i16 += blockSize) {
            this.f88374a.processBlock(bArr9, i16, bArr9, i16);
        }
        return bArr9;
    }
}
