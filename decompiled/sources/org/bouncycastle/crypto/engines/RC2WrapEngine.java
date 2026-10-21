package org.bouncycastle.crypto.engines;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class RC2WrapEngine implements Wrapper {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f88512i = {74, -35, -94, 44, 121, -24, 33, 5};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CBCBlockCipher f88513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CipherParameters f88514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ParametersWithIV f88515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f88516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f88517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SecureRandom f88518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Digest f88519g = DigestFactory.createSHA1();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f88520h = new byte[20];

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.f88517e = z10;
        this.f88513a = new CBCBlockCipher(new RC2Engine());
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.f88518f = parametersWithRandom.getRandom();
            cipherParameters = parametersWithRandom.getParameters();
        } else {
            this.f88518f = CryptoServicesRegistrar.getSecureRandom();
        }
        if (!(cipherParameters instanceof ParametersWithIV)) {
            this.f88514b = cipherParameters;
            if (this.f88517e) {
                byte[] bArr = new byte[8];
                this.f88516d = bArr;
                this.f88518f.nextBytes(bArr);
                this.f88515c = new ParametersWithIV(this.f88514b, this.f88516d);
                return;
            }
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        this.f88515c = parametersWithIV;
        this.f88516d = parametersWithIV.getIV();
        this.f88514b = this.f88515c.getParameters();
        if (!this.f88517e) {
            throw new IllegalArgumentException("You should not supply an IV for unwrapping");
        }
        byte[] bArr2 = this.f88516d;
        if (bArr2 == null || bArr2.length != 8) {
            throw new IllegalArgumentException("IV is not 8 octets");
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        if (this.f88517e) {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (bArr == null) {
            throw new InvalidCipherTextException("Null pointer as ciphertext");
        }
        if (i11 % this.f88513a.getBlockSize() != 0) {
            throw new InvalidCipherTextException("Ciphertext not multiple of " + this.f88513a.getBlockSize());
        }
        this.f88513a.init(false, new ParametersWithIV(this.f88514b, f88512i));
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        for (int i12 = 0; i12 < i11 / this.f88513a.getBlockSize(); i12++) {
            int blockSize = this.f88513a.getBlockSize() * i12;
            this.f88513a.processBlock(bArr2, blockSize, bArr2, blockSize);
        }
        byte[] bArr3 = new byte[i11];
        int i13 = 0;
        while (i13 < i11) {
            int i14 = i13 + 1;
            bArr3[i13] = bArr2[i11 - i14];
            i13 = i14;
        }
        byte[] bArr4 = new byte[8];
        this.f88516d = bArr4;
        int i15 = i11 - 8;
        byte[] bArr5 = new byte[i15];
        System.arraycopy(bArr3, 0, bArr4, 0, 8);
        System.arraycopy(bArr3, 8, bArr5, 0, i15);
        ParametersWithIV parametersWithIV = new ParametersWithIV(this.f88514b, this.f88516d);
        this.f88515c = parametersWithIV;
        this.f88513a.init(false, parametersWithIV);
        byte[] bArr6 = new byte[i15];
        System.arraycopy(bArr5, 0, bArr6, 0, i15);
        for (int i16 = 0; i16 < i15 / this.f88513a.getBlockSize(); i16++) {
            int blockSize2 = this.f88513a.getBlockSize() * i16;
            this.f88513a.processBlock(bArr6, blockSize2, bArr6, blockSize2);
        }
        int i17 = i11 - 16;
        byte[] bArr7 = new byte[i17];
        byte[] bArr8 = new byte[8];
        System.arraycopy(bArr6, 0, bArr7, 0, i17);
        System.arraycopy(bArr6, i17, bArr8, 0, 8);
        byte[] bArr9 = new byte[8];
        Digest digest = this.f88519g;
        digest.update(bArr7, 0, i17);
        byte[] bArr10 = this.f88520h;
        digest.doFinal(bArr10, 0);
        System.arraycopy(bArr10, 0, bArr9, 0, 8);
        if (!Arrays.constantTimeAreEqual(bArr9, bArr8)) {
            throw new InvalidCipherTextException("Checksum inside ciphertext is corrupted");
        }
        int i18 = bArr7[0];
        if (i17 - ((i18 & 255) + 1) <= 7) {
            byte[] bArr11 = new byte[i18];
            System.arraycopy(bArr7, 1, bArr11, 0, i18);
            return bArr11;
        }
        throw new InvalidCipherTextException("too many pad bytes (" + (i17 - ((bArr7[0] & 255) + 1)) + ")");
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i10, int i11) {
        if (!this.f88517e) {
            throw new IllegalStateException("Not initialized for wrapping");
        }
        int i12 = i11 + 1;
        int i13 = i12 % 8;
        int i14 = i13 != 0 ? (8 - i13) + i12 : i12;
        byte[] bArr2 = new byte[i14];
        bArr2[0] = (byte) i11;
        System.arraycopy(bArr, i10, bArr2, 1, i11);
        int i15 = (i14 - i11) - 1;
        byte[] bArr3 = new byte[i15];
        if (i15 > 0) {
            this.f88518f.nextBytes(bArr3);
            System.arraycopy(bArr3, 0, bArr2, i12, i15);
        }
        byte[] bArr4 = new byte[8];
        Digest digest = this.f88519g;
        digest.update(bArr2, 0, i14);
        byte[] bArr5 = this.f88520h;
        digest.doFinal(bArr5, 0);
        System.arraycopy(bArr5, 0, bArr4, 0, 8);
        int i16 = i14 + 8;
        byte[] bArr6 = new byte[i16];
        System.arraycopy(bArr2, 0, bArr6, 0, i14);
        System.arraycopy(bArr4, 0, bArr6, i14, 8);
        byte[] bArr7 = new byte[i16];
        System.arraycopy(bArr6, 0, bArr7, 0, i16);
        int blockSize = i16 / this.f88513a.getBlockSize();
        if (i16 % this.f88513a.getBlockSize() != 0) {
            throw new IllegalStateException("Not multiple of block length");
        }
        this.f88513a.init(true, this.f88515c);
        for (int i17 = 0; i17 < blockSize; i17++) {
            int blockSize2 = this.f88513a.getBlockSize() * i17;
            this.f88513a.processBlock(bArr7, blockSize2, bArr7, blockSize2);
        }
        byte[] bArr8 = this.f88516d;
        int length = bArr8.length + i16;
        byte[] bArr9 = new byte[length];
        System.arraycopy(bArr8, 0, bArr9, 0, bArr8.length);
        System.arraycopy(bArr7, 0, bArr9, this.f88516d.length, i16);
        byte[] bArr10 = new byte[length];
        int i18 = 0;
        while (i18 < length) {
            int i19 = i18 + 1;
            bArr10[i18] = bArr9[length - i19];
            i18 = i19;
        }
        this.f88513a.init(true, new ParametersWithIV(this.f88514b, f88512i));
        for (int i20 = 0; i20 < blockSize + 1; i20++) {
            int blockSize3 = this.f88513a.getBlockSize() * i20;
            this.f88513a.processBlock(bArr10, blockSize3, bArr10, blockSize3);
        }
        return bArr10;
    }
}
